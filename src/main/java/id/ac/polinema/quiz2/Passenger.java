package id.ac.polinema.quiz2;

public class Passenger {

    private String passengerId;
    private String name;

    public Passenger(String passengerId, String name) {
        this.passengerId = passengerId;
        setName(name);
    }

    public String getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;    
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || name == null) {
            System.out.println("nama tidak boleh kosong");
        }
        this.name = name;
    }
}
