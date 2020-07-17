import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        
        boolean password = false;
        String passwordValue = "";
        String[] stringArray = url.split("&");
        String[] firstCase = stringArray[0].split("\\?");
        stringArray[0] = firstCase[1];
        
        for (String item : stringArray) {
            String[] params = item.split("=");
            
            String value = params.length == 1 ? "not found" : params[1];
            
            if (params[0].equals("pass")) {
                password = true;
                passwordValue = value;
            }
            
            System.out.println(params[0] + " : " + value);     
        }
        
        if (password) {
            System.out.println("password" + " : " + passwordValue);
        }
        
    }
}
