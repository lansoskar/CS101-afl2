package Interface2;

public class Main {
    public static void main(String[] args) {
        Bicycle minCykel = new Bicycle(15,3,"red");

        minCykel.changeGear(3);
        minCykel.speedUp(30);
        minCykel.applyBrakes(5);
        System.out.println(minCykel);
    }
}
