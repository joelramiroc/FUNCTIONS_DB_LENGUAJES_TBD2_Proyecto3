package com.company;

import org.sqlite.Function;
import java.sql.SQLException;

public class PMT extends Function {
    @Override
    protected void xFunc() throws SQLException {
        if (args() != 3) {
            throw new SQLException("PMT(date1,date2,date3): Invalid argument count. Requires 3, but found " + args());
        }
        try {
            double tasa_interes = value_double(0);
            int numero_periodos = value_int(1);
            double valor_prestamo = value_double(2);
            double v = (1+(tasa_interes/12));
            double t = (-(numero_periodos/12)*12);
            double resultante=(valor_prestamo*(tasa_interes/12))/(1-Math.pow(v, t));
            result(resultante);
        }catch (Exception e)
        {
            result(-1);
        }
    }
}
