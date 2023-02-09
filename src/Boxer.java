public class Boxer extends Sportsmen  {
private String level;
private int weight;

public void boxing(){
    System.out.println("Boxing...");
}
public void wins(){
    System.out.println("Wins...");
}


    public Boxer(String name,String level,int weight) {
        super(name);
        this.level=level;
        this.weight=weight;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "name: " + getName() + "\n" +
                "level: " + level + "\n" +
                "weight: " + weight;

    }
}
