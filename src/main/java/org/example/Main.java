package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(enumeration()));

        //String testWord = "make install";
        //System.out.println(reversString(testWord));

        //System.out.println(realRoots(1.0, 2.0, -4.0));

        //System.out.printf("%.10f", sumSeries());

        //System.out.println(palindrome("salas"));
    }

    static String[] enumeration(){
        String[] result = new String[500];
        for (int i = 1; i <= 500; i++){
            boolean divisionFive = i % 5 == 0;
            boolean divisionSeven = i % 7 == 0;
            result[i-1] = "";

            if(divisionFive){
                result[i-1] += "fizz";
            }

            if(divisionSeven){
                result[i-1] += "buzz";
            }

            if(!divisionFive && !divisionSeven){
                result[i-1] = String.valueOf(i);
            }

        }
        return result;
    }

    static String reversString(String baseString){
        String result = new StringBuilder(baseString).reverse().toString();
        return result;
    }

    static String realRoots(Double a, Double b, Double c){
        double D = b*b - 4*a*c;

        if (a == 0) {
            return "нет вещественных корней";
        }

        if(D>0){
            double x1 = (-b + Math.sqrt(D))/2*a;
            double x2 = (-b - Math.sqrt(D))/2*a;

            String result = x1 + " " + x2;
            return result;
        } else {
            return "нет вещественных корней";
        }
    }

    static double sumSeries(){
        double n = 2;

        while(true){
            double result = 1 / (n*n + n - 2);

            if(result < Math.pow(10, -6)){
                return result;
            }
            n++;
        }
    }

    static boolean palindrome(String word){
        String reversWord = reversString(word);

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != reversWord.charAt(i)){
                return false;
            }
        }
        return true;
    }
}