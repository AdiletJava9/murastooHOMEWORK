public class Main {
    public static void main(String[] args) {
        Boxer boxer = new Boxer("Tyson","KMS",90);
        System.out.println(boxer);
        boxer.boxing();
        boxer.sportTraning();
        boxer.wins();
    }
}