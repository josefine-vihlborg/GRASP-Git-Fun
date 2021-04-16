public class DieselBil extends Bil {
  private boolean harPartikelFilter;
  private double kmPrL;

  public DieselBil(boolean harPartikelFilter, double kmPrL, String regNr, String mærke, String model, String årgang, String antalDøre) {
    super(regNr, mærke, model, årgang, antalDøre);
    setHarPartikelFilter(harPartikelFilter);
    setKmPrL(kmPrL);
  }

  public boolean isHarPartikelFilter() {
    return harPartikelFilter;
  }
  public double getKmPrL() {
    return kmPrL;
  }

  public void setKmPrL(double kmPrL) {
    this.kmPrL = kmPrL;
  }
  public void setHarPartikelFilter(boolean harPartikelFilter) {
    this.harPartikelFilter = harPartikelFilter;
  }
}
