package com.company;

import org.sqlite.Function;

import java.sql.SQLException;

public class REPEAT extends Function {
    @Override
    protected void xFunc() throws SQLException {
        if (args() != 2) {
            throw new SQLException("com.company.REPEAT(date1,date2): Invalid argument count. Requires 2, but found " + args());
        }
        String cadena = value_text(0);
        int numero = value_int(1);
        String temp="";
        for(int i=0; i<numero;i++){
            temp+=cadena;
        }
        result(temp);
    }
}
