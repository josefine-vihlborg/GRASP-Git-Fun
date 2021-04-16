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

  @Override
  public double beregnGrønEjerAfgift() {
    double grønEjerAfgift = 0;

    if (kmPrL>=20 && kmPrL<=50){
      grønEjerAfgift = 330+130;
    }
    else if (kmPrL>=15 && kmPrL<=20){
      grønEjerAfgift = 1050+1390;
    }
    else if (kmPrL>=10 && kmPrL<=15){
      grønEjerAfgift = 2340+1850;
    }
    else if (kmPrL>=5 && kmPrL<=10){
      grønEjerAfgift = 5500+2770;
    }
    else if (kmPrL<=5){
      grønEjerAfgift = 10470+15260;
    }

    if (harPartikelFilter == false){
      return grønEjerAfgift+1000;
    }else return grønEjerAfgift;

  }
}
