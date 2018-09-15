package com.company;

import org.sqlite.Function;

import java.sql.SQLException;

public class C2F extends Function {
    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("C2F(date1): Invalid argument count. Requires 1, but found " + args());
        }
        result((9*value_double(0)/5)+32);
    }
}
