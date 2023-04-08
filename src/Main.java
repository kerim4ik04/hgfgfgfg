public class Main {
    public static void main(String[] args) {
        double [] cxtn = {1.2, 3.2, -4.3, 3.6, -7.8, -9.1, 5.2, 9.8, -1.6, -8.1, 9.5, -5.6, 5.2, 1.7, 8.2};
        double sum = 0.0;
        int col = 0;
        boolean ghjdthrf = false;
        for ( double foreach : cxtn ) {
            if (foreach < 0) {
                ghjdthrf = true;
            }
            else if (foreach > 0 && ghjdthrf){
                sum += foreach;
                col ++;
                System.out.println(foreach);
    }
}
        System.out.println("арифметическое число " + sum/col);
    }
}

