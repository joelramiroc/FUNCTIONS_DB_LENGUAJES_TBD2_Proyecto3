package com.company;

import org.sqlite.Function;

import java.sql.SQLException;

public class DEC2HEX extends Function {
    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("com.company.DEC2HEX(date1): Invalid argument count. Requires 1, but found " + args());
        }
        result(Integer.toHexString(value_int(0)));
    }
}
