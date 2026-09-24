public class OrderApp {
    public static void main(String[] args) {
        String firstCustomerName = "Alice";
        double firstUnitPrice = 10;
        int firstQuantity = 2;
        double firstTotalWithVal = firstUnitPrice * firstQuantity + firstQuantity * firstUnitPrice * 0.2;
        String secondCustomerName = "Bob";
        double secondUnitPrice = 15;
        int secondQuantity = 1;
        double secondTotalWithVal = secondUnitPrice * secondQuantity + secondUnitPrice * secondQuantity * 0.2;
        System.out.println("Client : " + firstCustomerName);
        System.out.println("Prix HT : " + firstUnitPrice);
        System.out.println("Quantité : " + firstQuantity);
        System.out.println("Total TTC : " + firstTotalWithVal);
        System.out.println("------------------------");
        System.out.println("Client : " + secondCustomerName);
        System.out.println("Prix HT : " + secondUnitPrice);

        System.out.println("Quantité : " + secondQuantity); 
        System.out.println("Total TTC : " + secondTotalWithVal);
        System.out.println("------------------------");
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
