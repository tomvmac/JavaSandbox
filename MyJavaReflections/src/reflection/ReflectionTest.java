package reflection;

import java.lang.reflect.*;

public class ReflectionTest {

   public static void main(String[] args) throws Exception{
      String testProperty = "address";
      String testAttribute = "address.city";

      Class<?> myClazz = Class.forName("reflection.MyClass");


      try  {

      // property
      //Field badFieldCheck = myClass.getClass().getDeclaredField("testing");
      Field goodfieldCheck = myClazz.getDeclaredField("address");

      String fieldClazzName = goodfieldCheck.getType().getName();


      Class<?> fieldClazz = Class.forName(goodfieldCheck.getType().getName());
      Field fieldProperty = fieldClazz.getDeclaredField("city");

      }
      catch (NoSuchFieldException nsfe){
         System.out.println("NoSuchFieldException = " + nsfe.getMessage());
         nsfe.printStackTrace();
      }
      finally {
         System.out.println("It's all good!");
      }

      // Find the class for the address;

      // Find



   }




}
