package reflection;

import java.lang.reflect.*;

public class ClassReflectionUtil {

   public static String getFieldTypeName(Class clazz, String fieldName) throws NoSuchFieldException{

      return clazz.getDeclaredField(fieldName).getType().getName();

   }

   public static boolean validateFieldByClassName(String className, String fieldName) throws NoSuchFieldException, ClassNotFoundException{
      boolean isValid = false;
      Class<?> myClazz = Class.forName(className);

      // property
      Field goodfieldCheck = myClazz.getDeclaredField(fieldName);
      isValid = true;
      return isValid;

   }


}
