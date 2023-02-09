public class Sportsmen {
private  String name;


public void sportTraning(){
    System.out.println("Traning...");
}

    public Sportsmen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "name='" + name + '\'' +
                '}';
    }
}