package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá tr? l?n nh?t c?a hai s? nguyên, giá tr? tr? v? c?a hàm là s? l?n nh?t

        if (m < n)
            return n;
        else
            return m;
    }


    public static int minOfArray(int[] array) {
        // TODO: Tìm giá tr? nh? nh?t c?a c?a m?t m?ng s? nguyên (kích thu?c m?ng <= 100 ph?n t?)
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    /**
     * Chuong trình tính ch? s? BMI và in ra k?t qu? dánh giá
     *
     * @param weight cân n?ng
     * @param height chi?u cao
     * @return Thi?u cân, Bình thu?ng, Th?a cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Vi?t chuong trình tính ch? s? BMI và in ra k?t qu? dánh giá
        double BMI = (weight) / (height * height);
        if (BMI > 0 && BMI < 18.5) {
            return "Thieu can";
        } else if (BMI >= 18.5 && BMI <= 24.99) {
            return "Binh thuong";
        } else if (BMI >= 23 && BMI <= 24.99) {
            return "Thua can";
        } else if (BMI > 25) {
            return "Beo phi";
        }
        return null;
    }
}
