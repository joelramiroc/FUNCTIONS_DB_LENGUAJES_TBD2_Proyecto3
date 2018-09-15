package com.company;

import org.sqlite.Function;

import java.sql.SQLException;

public class BIN2DEC extends Function {
    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("BIN2DEC(date1): Invalid argument count. Requires 1, but found " + args());
        }
        result(Integer.parseInt( value_text(0),2));
    }
}
