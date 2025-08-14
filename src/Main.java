public class Main {
    public static void main(String[] args) {
        BmiService result = new BmiService();
        double indexAnswer = result.calculate(17,75_000); //Рост нужно вводить в децимктрах, а вес в грамах.
        System.out.println(indexAnswer);

    }
}

