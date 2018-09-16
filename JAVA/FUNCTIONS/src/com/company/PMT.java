//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import java.sql.SQLException;
import java.text.DecimalFormat;
import org.sqlite.Function;

public class PMT extends Function {
    public PMT() {
    }

    protected void xFunc() throws SQLException {
        if (this.args() != 3) {
            throw new SQLException("PMT(date1,date2,date3): Invalid argument count. Requires 3, but found " + this.args());
        } else {
            try {
                double i = this.value_double(0) / 12.0D;
                int n = this.value_int(1);
                double monto = this.value_double(2);
                double pmt = monto * (i * Math.pow(1.0D + i, (double)n) / (Math.pow(1.0D + i, (double)n) - 1.0D));
                DecimalFormat df = new DecimalFormat("#.00");
                this.result(df.format(pmt));
            } catch (Exception var9) {
                this.result(-1);
            }

        }
    }
}
