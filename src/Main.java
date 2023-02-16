import com.knoldus.annotation.CustomAnnotation;
import com.knoldus.annotation.MyAnnotation;

public class Main {
    public static void main(String[] args) {

        CustomAnnotation customAnnotation = new CustomAnnotation();
        Class c = customAnnotation.getClass();
        System.out.println(c.getName());

      MyAnnotation annotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);

        System.out.println(annotation.empId());
        System.out.println(annotation.empName());
        System.out.println(annotation.empDept());
        System.out.println(annotation.empSalary());


    }
}