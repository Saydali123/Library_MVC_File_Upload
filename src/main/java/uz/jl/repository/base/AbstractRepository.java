package uz.jl.repository.base;

import com.google.gson.Gson;
import lombok.SneakyThrows;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.jl.exceptions.NotFoundException;
import uz.jl.property.DatabaseProperties;

import java.io.Serializable;
import java.sql.*;
import java.util.Objects;

public abstract class AbstractRepository implements BaseGenericRepository {

    protected Connection connection;
    private Object[] args;
    protected final DatabaseProperties property;
    protected final Gson gson;

    {
        gson = new Gson();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        property = context.getBean(DatabaseProperties.class);
    }


    protected Serializable callProcedure(String query, int outType) {
        try {
            CallableStatement statement = connection.prepareCall(query);
            prepareToExecute(statement);
            ResultSet resultSet = statement.executeQuery();
            return prepareResultSet(resultSet, outType);
        } catch (SQLException ex) {
            throw new NotFoundException(ex.getMessage());
        }
    }

    protected <T> T callProcedure(String query, Class<T> clazz) {
        if (clazz.getSimpleName().equalsIgnoreCase("String"))
            return (T) callProcedure(query, Types.VARCHAR);
        if (clazz.getSimpleName().equalsIgnoreCase("Long"))
            return (T) callProcedure(query, Types.BIGINT);
        if (clazz.getSimpleName().equalsIgnoreCase("Boolean"))
            return (T) callProcedure(query, Types.BOOLEAN);
        if (clazz.getSimpleName().equalsIgnoreCase("Void"))
            return (T) callProcedure(query, -100);
        return null;
    }

    @SneakyThrows
    private Serializable prepareResultSet(ResultSet resultSet, int outType) {
        if (Objects.nonNull(resultSet) && resultSet.next()) {
            return switch (outType) {
                case Types.VARCHAR -> resultSet.getString(1);
                case Types.BIGINT -> resultSet.getLong(1);
                case Types.BOOLEAN -> resultSet.getBoolean(1);
                case -100 -> -1;
                default -> throw new IllegalStateException("Unexpected value: " + outType);
            };
        }
        return null;
    }

    @SneakyThrows
    private void prepareToExecute(CallableStatement statement) {
        for (int i = 0; i < this.args.length; i++) {
            statement.setObject(i + 1, args[i]);
        }
    }

    protected void prepareArguments(Object... args) {
        this.args = args;
    }
}
