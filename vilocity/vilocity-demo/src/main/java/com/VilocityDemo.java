/**
 * 
 */
package com;

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;



/**
 * @author IBM_ADMIN
 *
 */
public class VilocityDemo {
public static void main(String[] args) throws Exception{
	 VelocityEngine ve = new VelocityEngine();
     ve.init();

     ArrayList list = new ArrayList();

     Map map = new HashMap();
     map.put("rno", "1");
     map.put("name", "Komal");
     map.put("cla", "Bca");
     list.add(map);

     map = new HashMap();
     map.put("rno", "2");
     map.put("name", "Komal");
     map.put("cla", "Bca");
     list.add(map);
     VelocityContext context = new VelocityContext();
     context.put("stuDetails", list);
     context.put("Name", new VilocityDemo());

   
     Reader reader =  new InputStreamReader( VilocityDemo.class.getClassLoader().getResourceAsStream("demo.vm"));

     StringWriter writer = new StringWriter();
     Velocity.evaluate(context, writer, "", reader);
     
     System.out.println(context.get("Roll No"));
    // t.merge(context, writer);

     System.out.println(writer);
}
}
