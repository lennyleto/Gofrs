package io.dojogeek.gofrs.rest.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Irene on 3/14/16.
 */
public class DateFormatterAdapter extends XmlAdapter<String, Date> {

   private final  SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    @Override
    public String marshal(Date v) throws Exception {
        return formatter.format(v);
    }

    @Override
    public Date unmarshal(String v) throws Exception {
        return formatter.parse(v);
    }


}
