import java.util.Arrays;

public class PorseniPolinema {
    public static void main(String[] args) {
        String[] badmintonAtlet = {"Aziz", "Adib", "Erik", "Dimas", "Yefta"};
        String[] tenisMejaAtlet = {"Hikmah", "Haqi", "Farel", "Budi", "Putri"};
        String[] basketAtlet = {"Hilma", "Nino", "Dita", "Dito", "Fariz"};
        String[] voliAtlet = {"Ilman", "Icha", "Via", "Rara", "Doni"};

        Arrays.sort(badmintonAtlet);
        Arrays.sort(tenisMejaAtlet);
        Arrays.sort(basketAtlet);
        Arrays.sort(voliAtlet);

        System.out.println("Nama Atlet Badminton:");
        for (String atlet : badmintonAtlet) {
            System.out.println(atlet);
        }

        System.out.println("\nNama Atlet Tenis Meja:");
        for (String atlet : tenisMejaAtlet) {
            System.out.println(atlet);
        }

        System.out.println("\nNama Atlet Basket:");
        for (String atlet : basketAtlet) {
            System.out.println(atlet);
        }

        System.out.println("\nNama Atlet Bola Voly:");
        for (String atlet : voliAtlet) {
            System.out.println(atlet);
        }
    }
}
