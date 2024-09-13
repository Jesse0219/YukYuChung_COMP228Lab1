import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singers singerexample = new Singers();

        System.out.println("Original default Singer Information:");

        singerexample.displaySingerDetails();

        singerexample.setSingerId(8);
        singerexample.setSingerName("Hugh Jackman");
        singerexample.setSingerAddress("99 New York Street");
        singerexample.setDateOfBirth(new Date(68,10,12));
        singerexample.setNoOfAlbPublished(3);

        System.out.println("\nValue updated of Hugh Jackman: ");
        singerexample.displaySingerDetails();

        singerexample.setWhole(6,"Zac Efron","88 California Street",new Date(87,10,18),28);
        System.out.println("\nValue updated of Zac Efron: ");
        singerexample.displaySingerDetails();
    }
}