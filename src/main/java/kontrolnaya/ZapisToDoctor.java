package kontrolnaya;

public class ZapisToDoctor {
    String namePazient;
    String dataZapisi;
    String nameDoctor;

    public ZapisToDoctor(String namePazient, String dataZapisi, String nameDoctor) {
        this.namePazient = namePazient;
        this.dataZapisi = dataZapisi;
        this.nameDoctor = nameDoctor;
    }

    public String getNamePazient() {
        return namePazient;
    }

    public void setNamePazient(String namePazient) {
        this.namePazient = namePazient;
    }

    public Object getDataZapisi() {
        return dataZapisi;
    }

    public void setDataZapisi(String dataZapisi) {
        this.dataZapisi = dataZapisi;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }
}
