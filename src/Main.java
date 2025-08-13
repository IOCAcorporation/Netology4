public class Main {
    public static void main(String[] args) {
            {BmiService service = new BmiService();
                double weight = 70_000; // Здесь рассчитывается в граммах
                double height = 15; //А здесь в дециметрах
                double index = weight / (height * height);
                index = service.calculate();


            System.out.println( index + " - Индекс массы тела");// Здесь округляется до целых чисел


        }
    }
}

