public class BmiService {

    public int calculate() {
        int weight = 75_000; // Здесь рассчитывается в граммах
        int height = 170;
        int index = weight / (height * height) * 10;//возвращает посчитанный bmi-индекс в виде целого числа.
        return index;
    }



}

