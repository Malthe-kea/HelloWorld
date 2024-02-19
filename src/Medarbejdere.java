public class Medarbejdere {
    private String navn;
    int alder;
    private String stilling;
    private int løn;

    public Medarbejdere(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
        this.stilling = stilling;
        this.løn = getLøn();
    }

    public int getLøn(){
        return løn = 1000;
    }
    public int setLøn(int i){
        return getLøn();
    }
}
