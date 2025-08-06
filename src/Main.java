public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int Weight = 56_000; // Здесь рассчитывается в граммах
        int height = 15; //А здесь в дециметрах
        int index = Weight / (height * height);
        int indexAnswer = service.calculate(index);
        System.out.println(indexAnswer / 10 + " - Индекс массы тела"); // Здесь округляется до целых чисел





    }
}
