package id.ac.polinema.quiz2;

public class Passenger {

    private String passengerId;
    private String name;

    public Passenger(String passengerId, String name) {
        this.passengerId = passengerId;
        this.name = name;
    }

    public String getPassengerId() {
        return passengerId; 
    }

    public String getName() {
        return name;    
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            return;
        }
        this.name = name;
    }
}
