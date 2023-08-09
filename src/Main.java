public class Main {
    public static void main(String[] args) {
        double ticketPrice = 13676;  // Стоимость билета
        int milesPerRub = 20;       // Количество рублей для одной бонусной мили

        int earnedMiles = (int) (ticketPrice / milesPerRub);  // Рассчет начисленных миль
        System.out.println("Начислено миль: " + earnedMiles);
    }
}
