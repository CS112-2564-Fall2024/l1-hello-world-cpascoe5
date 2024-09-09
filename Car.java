public class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name;
    }

    public boolean equals(Car other) {
        return this.name.equals(other.name);
    }
    
    public String getname() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
      }
}


