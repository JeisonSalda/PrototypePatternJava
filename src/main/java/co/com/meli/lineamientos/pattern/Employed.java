package co.com.meli.lineamientos.pattern;

public class Employed implements Prototype {

    private String identification;
    private String name;
    private double salary;

    public Employed( String identification, String name, double salary ){
        this.identification = identification;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public Prototype clone() {
        return new Employed( this.identification, this.name, this.salary );
    }

    public String getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
