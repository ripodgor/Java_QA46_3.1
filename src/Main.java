public class Main {
    public static void main(String[] args) {
        int amount = 12_499; // стоимость билета
        int percent = 20; // кол-во рублей для одной бонусной милли
        int bonus = amount / percent; // Количество бонусных милль
        System.out.println("Roman, hello! Thank you for choosing our airline for your flight. Your bonus is: "+ bonus +" miles");
    }
}