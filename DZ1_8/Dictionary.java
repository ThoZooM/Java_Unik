package DZ;

public class Dictionary {
    String eng;
    String rus;

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getRus() {
        return rus;
    }

    public void setRus(String rus) {
        this.rus = rus;
    }

    public Dictionary(String eng, String rus) {
        this.eng = eng;
        this.rus = rus;
    }


    @Override
    public String toString() {
        return eng + " — " + rus + "\n";
    }
}
