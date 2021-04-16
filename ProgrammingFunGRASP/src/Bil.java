public abstract class Bil {
  private String regNr;
  private String mærke;
  private String model;
  private String årgang;
  private String antalDøre;

  public Bil(String regNr, String mærke, String model, String årgang, String antalDøre) {
    setRegNr(regNr);
    setMærke(mærke);
    setModel(model);
    setÅrgang(årgang);
    setAntalDøre(antalDøre);
  }

  public String getRegNr() {
    return regNr;
  }
  public String getMærke() {
    return mærke;
  }
  public String getModel() {
    return model;
  }
  public String getÅrgang() {
    return årgang;
  }
  public String getAntalDøre() {
    return antalDøre;
  }

  public void setRegNr(String regNr) {
    this.regNr = regNr;
  }
  public void setMærke(String mærke) {
    this.mærke = mærke;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public void setÅrgang(String årgang) {
    this.årgang = årgang;
  }
  public void setAntalDøre(String antalDøre) {
    this.antalDøre = antalDøre;
  }

  public abstract double beregnGrønEjerAfgift();
}
