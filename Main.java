public class Main {
    public static void main(String[] args) throws Exception { 
        String input = "1 + 9"; 
        System.out.println(calc(input)); 
    }


    public static String calc(String input) throws Exception { 
        String[] b = input.split(" ");
        int a = Integer.parseInt(b[0]);
        int c = Integer.parseInt(b[2]);
        if (a>10 || c>10) {
            throw new Exception("Слишком большие числа");
        }
        String e = b[1];
        String d = null;


        switch (e) {
            case "+":
                d = String.valueOf(a + c);
                break;


            case "-":
                d = String.valueOf(a - c);
                break;


            case "*":
                d = String.valueOf(a * c);
                break;


            case "/":
                d = String.valueOf(a / c);
                break;
            default:throw new Exception("Недопустимое действие");

        }
        return d;
    }
}
