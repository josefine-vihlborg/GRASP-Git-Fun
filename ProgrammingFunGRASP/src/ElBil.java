public class ElBil extends Bil {
  private int batteriKapacitetKWH;
  private int maxKm;
  private int whPrKm;

  public ElBil(int batteriKapacitetKWH, int maxKm, int whPrKm, String regNr, String mærke, String model, String årgang, String antalDøre) {
    super(regNr, mærke, model, årgang, antalDøre);
    setBatteriKapacitetKWH(batteriKapacitetKWH);
    setMaxKm(maxKm);
    setWhPrKm(whPrKm);
  }

  public int getBatteriKapacitetKWH() {
    return batteriKapacitetKWH;
  }
  public int getMaxKm() {
    return maxKm;
  }
  public int getWhPrKm() {
    return whPrKm;
  }

  public void setBatteriKapacitetKWH(int batteriKapacitetKWH) {
    this.batteriKapacitetKWH = batteriKapacitetKWH;
  }
  public void setMaxKm(int maxKm) {
    this.maxKm = maxKm;
  }
  public void setWhPrKm(int whPrKm) {
    this.whPrKm = whPrKm;
  }

  @Override
  public double beregnGrønEjerAfgift() {
    double whTilKmL = (whPrKm/91.25)/100;

    if (whTilKmL >= 20 && whTilKmL <= 50){
      return 330;
    }
    else if (whTilKmL >= 15 && whTilKmL <= 20){
      return 1050;
    }
    else if (whTilKmL >= 10 && whTilKmL <= 15){
      return 2340;
    }
    else if (whTilKmL >= 5 && whTilKmL <= 10){
      return 5500;
    }
    else if (whTilKmL < 5){
      return 10470;
    }
    return 0;
  }
}
