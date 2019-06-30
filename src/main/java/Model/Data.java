package Model;

public class Data { //model of Data class

    private String rok; //encapsulation paradigm by setting fields to 'private'. Restricts direct access to data members (fields) of a class.
    private Integer kwartal;
    private String miesiac;
    private Integer tydzien;
    private Integer dzienT;
    private Integer dzien;
    private String data;
    private String swieto;
    private Integer produkt_ID;
    private String kod;
    private String producent;
    private String grupa_produktowa;
    private String kategoria;
    private String miasto;
    private String wojewodztwo;
    private String region;
    private String potencjal;
    private String platnosc;
    private String kanal;
    private Integer ilosc;
    private String cena;
    private Double cena_sprzedazy;
    private String koszt_zm;
    private String koszt_st;
    private String marza_br;
    private String promocja;
    private String powiat_ID;
    private String wojew_ID;

    public String getRok() { //define accessors (getters) and mutators (setters). Each field has a getter and setter method. Getter methods return the field. Setter methods let us change the value of the field
        return rok;
    }

    public void setRok(String rok) {
        this.rok = rok;
    }

    public Integer getKwartal() {
        return kwartal;
    }

    public void setKwartal(Integer kwartal) {
        this.kwartal = kwartal;
    }

    public String getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(String miesiac) {
        this.miesiac = miesiac;
    }

    public Integer getTydzien() {
        return tydzien;
    }

    public void setTydzien(Integer tydzien) {
        this.tydzien = tydzien;
    }

    public Integer getDzienT() {
        return dzienT;
    }

    public void setDzienT(Integer dzienT) {
        this.dzienT = dzienT;
    }

    public Integer getDzien() {
        return dzien;
    }

    public void setDzien(Integer dzien) {
        this.dzien = dzien;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSwieto() {
        return swieto;
    }

    public void setSwieto(String swieto) {
        this.swieto = swieto;
    }

    public Integer getProdukt_ID() {
        return produkt_ID;
    }

    public void setProdukt_ID(Integer produkt_ID) {
        this.produkt_ID = produkt_ID;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getGrupa_produktowa() {
        return grupa_produktowa;
    }

    public void setGrupa_produktowa(String grupa_produktowa) {
        this.grupa_produktowa = grupa_produktowa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPotencjal() {
        return potencjal;
    }

    public void setPotencjal(String potencjal) {
        this.potencjal = potencjal;
    }

    public String getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(String platnosc) {
        this.platnosc = platnosc;
    }

    public String getKanal() {
        return kanal;
    }

    public void setKanal(String kanal) {
        this.kanal = kanal;
    }

    public Integer getIlosc() {
        return ilosc;
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public Double getCena_sprzedazy() {
        return cena_sprzedazy;
    }

    public void setCena_sprzedazy(Double cena_sprzedazy) {
        this.cena_sprzedazy = cena_sprzedazy;
    }

    public String getKoszt_zm() {
        return koszt_zm;
    }

    public void setKoszt_zm(String koszt_zm) {
        this.koszt_zm = koszt_zm;
    }

    public String getKoszt_st() {
        return koszt_st;
    }

    public void setKoszt_st(String koszt_st) {
        this.koszt_st = koszt_st;
    }

    public String getMarza_br() {
        return marza_br;
    }

    public void setMarza_br(String marza_br) {
        this.marza_br = marza_br;
    }

    public String getPromocja() {
        return promocja;
    }

    public void setPromocja(String promocja) {
        this.promocja = promocja;
    }

    public String getPowiat_ID() {
        return powiat_ID;
    }

    public void setPowiat_ID(String powiat_ID) {
        this.powiat_ID = powiat_ID;
    }

    public String getWojew_ID() {
        return wojew_ID;
    }

    public void setWojew_ID(String wojew_ID) {
        this.wojew_ID = wojew_ID;
    }

    public Data() {
    }

    @Override
    public String toString() {
        return "Data{" +
                "rok='" + rok + '\'' +
                ", kwartal='" + kwartal + '\'' +
                ", miesiac='" + miesiac + '\'' +
                ", tydzien='" + tydzien + '\'' +
                ", dzienT='" + dzienT + '\'' +
                ", dzien='" + dzien + '\'' +
                ", data=" + data +
                ", swieto='" + swieto + '\'' +
                ", produkt_ID='" + produkt_ID + '\'' +
                ", kod='" + kod + '\'' +
                ", producent='" + producent + '\'' +
                ", grupa_produktowa='" + grupa_produktowa + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", miasto='" + miasto + '\'' +
                ", wojewodztwo='" + wojewodztwo + '\'' +
                ", region='" + region + '\'' +
                ", potencjal='" + potencjal + '\'' +
                ", platnosc='" + platnosc + '\'' +
                ", kanal='" + kanal + '\'' +
                ", ilosc='" + ilosc + '\'' +
                ", cena='" + cena + '\'' +
                ", cena_sprzedazy='" + cena_sprzedazy + '\'' +
                ", koszt_zm='" + koszt_zm + '\'' +
                ", koszt_st='" + koszt_st + '\'' +
                ", marza_br='" + marza_br + '\'' +
                ", promocja='" + promocja + '\'' +
                ", powiat_ID='" + powiat_ID + '\'' +
                ", wojew_ID='" + wojew_ID + '\'' +
                '}';
    }
}
