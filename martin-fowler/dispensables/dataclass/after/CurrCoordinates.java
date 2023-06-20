class CurrCoordinates{
  
  private int x, y;

  CurrCoordinates(int x, int y){
    this.x = x;
    this.y = y;
  }

  //getter
  public String getAllCoordinates(){
    return x + " " + y ;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }
  
  public static double calculateDistance(CurrCoordinates c1, CurrCoordinates c2) {
    int delta_X = Math.abs(c2.getX() - c1.getX());
    int delta_Y = Math.abs(c2.getY() - c1.getY());
    return Math.sqrt(Math.pow(delta_X, 2) + Math.pow(delta_Y, 2));
  }
}






