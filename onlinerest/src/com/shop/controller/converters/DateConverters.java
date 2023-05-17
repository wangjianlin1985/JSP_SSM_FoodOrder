// 
// 
// 

package com.shop.controller.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class DateConverters implements Converter<String, Date>
{
    public Date convert(final String source) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return dateFormat.parse(source);
        }
        catch (ParseException ex) {
            return null;
        }
    }
}
