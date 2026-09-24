public class OrderApp {

    static double computeTotalWithVat(double unitPrice, int quantity) {
        return unitPrice * quantity + unitPrice * quantity * 0.2;
    }

    static double printRecu( String nom, double prix, int quantite){

        double tot = computeTotalWithVat(prix, quantite);
        System.out.println("Client : " + nom);
        System.out.println("Prix HT : " + prix);
        System.out.println("Quantité : " + quantite);
        System.out.println("Total TTC : " + tot);
        System.out.println("------------------------");

        return tot;
    }

    
    public static void main(String[] args) {
        String firstCustomerName = "Alice";
        double firstUnitPrice = 10;
        int firstQuantity = 2;
        
        String secondCustomerName = "Bob";
        double secondUnitPrice = 15;
        int secondQuantity = 1;

        double firstTotalWithVal = printRecu(firstCustomerName, firstUnitPrice, firstQuantity);
        double secondTotalWithVal = printRecu(secondCustomerName, secondUnitPrice, secondQuantity);
        
        if (firstTotalWithVal + secondTotalWithVal > 30) {
            System.out.println("Réduction !");
        } else {
            if (firstTotalWithVal + secondTotalWithVal > 20) {
                System.out.println("Petite réduction !");
            } else {
                System.out.println("Pas de réduction.");
            }
        }
    }
}
