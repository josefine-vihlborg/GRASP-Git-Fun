public class BenzinBil extends Bil {
  private int oktantal;
  private double kmPrL;

  public BenzinBil(int oktantal, double kmPrL, String regNr, String mærke, String model, String årgang, String antalDøre) {
    super(regNr, mærke, model, årgang, antalDøre);
    setOktantal(oktantal);
    setKmPrL(kmPrL);
  }

  public int getOktantal() {
    return oktantal;
  }
  public double getKmPrL() {
    return kmPrL;
  }

  public void setOktantal(int oktantal) {
    this.oktantal = oktantal;
  }
  public void setKmPrL(double kmPrL) {
    this.kmPrL = kmPrL;
  }
}
