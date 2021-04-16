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
}
