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

// An ALTernative Method below:

import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String getUrl = scanner.nextLine();
//         String[] splitString = getUrl.split("\\?");
//         String[] mainDataString = splitString[1].split("&");
//         int mainDataLength = mainDataString.length;
//         String[] withRequiredSymbol = new String[mainDataLength];
//         for (int i = 0; i < mainDataLength; i++) {
//             withRequiredSymbol[i] = mainDataString[i].replace("=", " : ");
//         }
//         int checkLength;
//         for (int i = 0; i < mainDataLength; i++) {
//             checkLength = withRequiredSymbol[i].length();
//             if (withRequiredSymbol[i].charAt(checkLength - 2) == ':') {
//                 withRequiredSymbol[i] = withRequiredSymbol[i].replace(": ", ": not found");   
//             }
//         }
//         for (String a : withRequiredSymbol) {
//             System.out.println(a);   
//         }
//         for (int i = 0; i < mainDataLength; i++) {
//             if (withRequiredSymbol[i].charAt(0) == 'p' && withRequiredSymbol[i].charAt(3) == 's') {
//                 String password = withRequiredSymbol[i].replace("pass", "password");
//                 System.out.println(password);
//             }
//         }
//     }
// }
