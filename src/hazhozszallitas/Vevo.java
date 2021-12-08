/**
 *
 * @author Nátz Kornél JOO2S6
 * @author Gergye Patrik RAF7BE
 */

package hazhozszallitas;

public class Vevo {
    private String nev;
    private String cim;
    private int tavolsag;
    private String telefonszam;
    private Rendeles rendeles;

    public Vevo(String nev, String cim, int tavolsag, String telefonszam) {
        this.nev = nev;
        this.cim = cim;
        this.tavolsag = tavolsag;
        this.telefonszam = telefonszam;
    }
    
    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public int getTavolsag() {
        return tavolsag;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    public Rendeles getRendeles() {
        return rendeles;
    }
    
    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public void setTavolsag(int tavolsag) {
        this.tavolsag = tavolsag;
    }

    public void setTelefonszam(String telefonszam) {
        this.telefonszam = telefonszam;
    }

    @Override
    public String toString() {
        return "Vevo Neve: " + nev + "\nCíme: " + cim + "\nTávolság: " + tavolsag + " km\nTelefonszáma: " + telefonszam + "\n";
    }
    
    
}
