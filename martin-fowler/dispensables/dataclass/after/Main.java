import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<CurrCoordinates> coordinates = new ArrayList<CurrCoordinates>();

    coordinates.add(new CurrCoordinates(5, 3));
    coordinates.add(new CurrCoordinates(16, 10));

    double distance = CurrCoordinates.calculateDistance(coordinates.get(0), coordinates.get(1));
    System.out.print(distance);
  }
}
