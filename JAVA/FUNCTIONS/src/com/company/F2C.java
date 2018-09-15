package com.company;

import org.sqlite.Function;

import java.sql.SQLException;

public class F2C extends Function {
    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("F2C(date1): Invalid argument count. Requires 1, but found " + args());
        }
        result(((value_double(0)-32)*5)/9);
    }
}
