package co.com.meli.lineamientos.pattern;

public class AuditEmployed {

    public void register( Employed previous, Employed current ){
        System.out.printf("User j@j.com updated the employed: %s-%s%n",  previous.getIdentification(), previous.getName());
        System.out.printf("With Salary previous: %f%n",  previous.getSalary());
        System.out.printf("With New Salary: %f%n",  current.getSalary());
    }

}
