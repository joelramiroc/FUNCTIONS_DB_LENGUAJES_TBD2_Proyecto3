package com.company;

import org.sqlite.Function;

import java.sql.SQLException;

public class Factorial extends Function {
    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("Factorial(date1): Invalid argument count. Requires 1, but found " + args());
        }
        int numero = value_int(0);
        int resultado=1;
        for(int i=1;i<=numero;i++){
            resultado*=i;
        }
        result(resultado);
    }
}
