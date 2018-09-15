package com.company;

import org.sqlite.Function;

import java.sql.SQLException;

public class DEC2BIN extends Function {
    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("DEC2BIN(date1): Invalid argument count. Requires 1, but found " + args());
        }
        result(Integer.toBinaryString(value_int(0)));
    }
}
