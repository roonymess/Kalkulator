import java.io.IOException;
import java.util.Scanner;

public class Kalk {
    static Scanner scanner = new Scanner(System.in);
    static int proverka = 0;
    public static void main(String[] args) {

        String str = scanner.nextLine();
        String simbol[] = str.split(" ");

        int num1 = getInt(simbol[0]);
        int num2 = getInt(simbol[2]);
        if ((num1 <11) && (num1 >0) && (num2 <11) && (num2 >0) ) {
            if (proverka == 2) {
                char operation = getOperation(simbol[1]);
                int result = calc(num1, num2, operation);
                System.out.println(result);
            }

            if (proverka == 0) {
                char operation = getOperation(simbol[1]);
                int result = calc(num1, num2, operation);
                rome(result);
            }
        }
            return;

    }

    public static int getInt(String nn) {

        int num = 0;
        try {
            num = Integer.parseInt(nn);
            proverka ++;

        } catch (Exception e) {
            switch (nn) {
                case "I":
                    num = 1;
                    break;
                case "II":
                    num = 2;
                    break;
                case "III":
                    num = 3;
                    break;
                case "IV":
                    num = 4;
                    break;
                case "V":
                    num = 5;
                    break;
                case "VI":
                    num = 6;
                    break;
                case "VII":
                    num = 7;
                    break;
                case "VIII":
                    num = 8;
                    break;
                case "IX":
                    num = 9;
                    break;
                case "X":
                    num = 10;
                    break;
            }
        }


        return num;
    }


    public static char getOperation(String a){

        char[] operation = a.toCharArray();

        return operation[0];
    }

    public static int calc(int num1, int num2, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.exit(0);
        }
        return result;
    }

    public static void rome(int chislo){
        int ten,hund,edin;
        String romeOut = new String();
        hund = chislo / 100;
        ten = (chislo % 100)/ 10;
        edin = chislo % 10;
        if (hund > 0){
            romeOut = "C";
        }else{
            switch (ten) {
                case 1:
                    romeOut += "X";
                    break;
                case 2:
                    romeOut += "XX";
                    break;
                case 3:
                    romeOut += "XXX";
                    break;
                case 4:
                    romeOut += "XL";
                    break;
                case 5:
                    romeOut += "L";
                    break;
                case 6:
                    romeOut += "LX";
                    break;
                case 7:
                    romeOut += "LXX";
                    break;
                case 8:
                    romeOut += "LXX";
                    break;
                case 9:
                    romeOut += "XC";
                    break;}
            switch (edin) {
                case 1:
                    romeOut += "I";
                    break;
                case 2:
                    romeOut += "II";
                    break;
                case 3:
                    romeOut += "III";
                    break;
                case 4:
                    romeOut += "IV";
                    break;
                case 5:
                    romeOut += "V";
                    break;
                case 6:
                    romeOut += "VI";
                    break;
                case 7:
                    romeOut += "VII";
                    break;
                case 8:
                    romeOut += "VIII";
                    break;
                case 9:
                    romeOut += "IX";
                    break;}
        }
        System.out.println(romeOut);
    }
}