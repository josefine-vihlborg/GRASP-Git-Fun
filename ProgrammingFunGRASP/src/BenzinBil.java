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

  @Override
  public double beregnGrønEjerAfgift() {
    if (kmPrL>=20 && kmPrL<=50){
      return 330;
    }
    else if (kmPrL>=15 && kmPrL<=20){
      return 1050;
    }
    else if (kmPrL>=10 && kmPrL<=15){
      return 2340;
    }
    else if (kmPrL>=5 && kmPrL<=10){
      return 5500;
    }
    else if (kmPrL<=5){
     return 10470;
    }
    return 0;
  }
}
