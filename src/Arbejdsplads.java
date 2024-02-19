public class Arbejdsplads {
    public static void main(String[] args) {


        Medarbejdere medarbejder = new Medarbejdere("Henning", 12);
        medarbejder.setLøn(10000);

        System.out.println(medarbejder.getLøn());
        System.out.println(medarbejder.setLøn(1200));
    }
}
