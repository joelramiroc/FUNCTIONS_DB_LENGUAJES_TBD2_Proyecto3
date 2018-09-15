package com.company;

import org.sqlite.Function;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.SQLException;

public class РING extends Function {

    @Override
    protected void xFunc() throws SQLException {

        if (args() != 1) {
            throw new SQLException("РING(date1): Invalid argument count. Requires 1, but found " + args());
        }
        try{
            String ip = value_text(0);
            new Socket().connect(new InetSocketAddress(ip,80),5000);
            result(1);
        }
        catch(IOException ex){
            result(0);
        }
    }
}
