package com.example.misc;
public class PropertyTest {
    public static void main(String args[]) throws Exception{
    	PropertyTest h = new PropertyTest();
      h.doit();
      }
    public void doit() throws Exception{
      // properties in the classpath
      java.util.Properties props = new java.util.Properties();
      java.net.URL url = ClassLoader.getSystemResource("props.properties");
      props.load(url.openStream());
      System.out.println(props);
      System.out.println("prop1 :\n " + props.get("prop1"));
      System.out.println("prop2 :\n " + props.get("prop2"));
      }
}