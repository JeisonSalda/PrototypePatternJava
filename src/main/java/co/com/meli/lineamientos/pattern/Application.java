package co.com.meli.lineamientos.pattern;

public class Application {


    public static void main( String args[] ){
        EmployedCache employedCache = new EmployedCache();

        Employed employedUI = new Employed("CC123", "Pedro", 300);
        Employed employedBD = ( Employed ) employedCache.getEmployedByIdentification( "CC123" );

        AuditEmployed auditEmployed = new AuditEmployed();
        auditEmployed.register( employedBD, employedUI );

    }

}
