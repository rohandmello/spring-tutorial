package com.rohan.core.sequence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan.Dmello
 * Date: 8/25/13
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class DatePrefixGenerator implements PrefixGenerator{
    private DateFormat formatter;
    public void setPattern(String pattern){
        this.formatter = new SimpleDateFormat(pattern);
    }
    public String getPrefix() {
        return formatter.format(new Date());
    }
}
