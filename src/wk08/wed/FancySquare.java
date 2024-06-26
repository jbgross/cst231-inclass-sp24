class FancySquare {
  public static void main(String[] args) {
    int size = 7;
    String star = "* ";
    String dash = "- ";
    int flagA = size/2;
    int flagB = size/2;
    for(int r = 0; r < size; r++) {
      for(int c = 0; c < size; c++) {
        if(c == flagA || c == flagB) {
          System.out.print(dash);
        } else {
          System.out.print(star);
        }
      }
      System.out.print(" - r: " + r);
      System.out.print(" - A: " + flagA);
      System.out.print(" - B: " + flagB);
      if(r < size/2) {
        flagA--;
        flagB++;
      } else {
        flagA++;
        flagB--;
      }
      System.out.println();
    }
  }
}
