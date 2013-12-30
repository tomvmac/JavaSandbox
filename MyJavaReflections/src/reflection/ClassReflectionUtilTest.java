package reflection;

public class ClassReflectionUtilTest {

   public static void main(String[] args) throws Exception{

      String myField = "address";
      String mySubField = "city";


      // get class type for myField
      String myFieldTypeName = ClassReflectionUtil.getFieldTypeName(MyClass.class, myField);

      System.out.println("Given: ");
      System.out.println("class = " + MyClass.class.getName());
      System.out.println("property = " + myField);
      System.out.println("fieldTypeTypeName = " + myFieldTypeName);

      boolean subFieldIsValid = ClassReflectionUtil.validateFieldByClassName(myFieldTypeName, mySubField);

      if (subFieldIsValid){
         System.out.println(mySubField + " is a valid property of the " + myFieldTypeName + " class");
      }
      else {
         System.out.println(mySubField + " is NOT a valid property of the " + myFieldTypeName + " class");
      }


   }



}
