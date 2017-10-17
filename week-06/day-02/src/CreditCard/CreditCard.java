package CreditCard;

import java.util.Random;

public class CreditCard implements CreditCardy {
    String numbers = "0123456789";
    Random random = new Random();



    @Override
    public int getSumCVV() {
        return 0;
    }

    @Override
    public String getNameCardholder() {
        return null;
    }

    @Override
    public String getCodeAccount() {
        int length = 5;
        StringBuilder code = new StringBuilder();
        for (int j = 0; j < length; j++) {
            code.append(String.valueOf(numbers.charAt(random.nextInt(numbers.length()))));
        }
        return code.toString();
    }

    @Override
    public int cumeSumCVV(String codeAccount) {

        public static void main(String[] args) {
            int num = 321;
            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            System.out.println(sum);
        }
        int sum = 0;
        for (int i = 0; i < codeAccount.length(); i++) {
            sum += codeAccount.charAt(i);
        }
        return sum;
    }
}
