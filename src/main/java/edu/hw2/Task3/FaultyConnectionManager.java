package edu.hw2.Task3;

public class FaultyConnectionManager implements ConnectionManager {

    @Override
    public Connection getConnection() throws ConnectionException {
        return new FaultyConnection();
    }
}
