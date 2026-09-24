public class OrderApp {

    static double computeTotalWithVat(double unitPrice, int quantity) {
        return unitPrice * quantity + unitPrice * quantity * 0.2;
    }

    static void printRecu( String nom, double prix, int quantite, double tot){
        System.out.println("Client : " + nom);
        System.out.println("Prix HT : " + prix);
        System.out.println("Quantité : " + quantite);
        System.out.println("Total TTC : " + tot);
        System.out.println("------------------------");
    }
    
    public static void main(String[] args) {
        String firstCustomerName = "Alice";
        double firstUnitPrice = 10;
        int firstQuantity = 2;
        double firstTotalWithVal = computeTotalWithVat(firstUnitPrice, firstQuantity);
        String secondCustomerName = "Bob";
        double secondUnitPrice = 15;
        int secondQuantity = 1;
        double secondTotalWithVal = computeTotalWithVat(secondUnitPrice, secondQuantity);
        printRecu(firstCustomerName, firstUnitPrice, firstQuantity,  firstTotalWithVal);
        printRecu(secondCustomerName, secondUnitPrice, secondQuantity, secondTotalWithVal);
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
