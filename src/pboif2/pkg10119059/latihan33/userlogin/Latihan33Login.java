/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan user login
 */
package pboif2.pkg10119059.latihan33.userlogin;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;

public class Latihan33Login {
    private static String usName, passWord;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.print("Masukkan Username = ");
        input = scanner.nextLine();
        usName = input;
        
        System.out.print("Masukkan Password = ");
        input = scanner.nextLine();
        passWord = input;
        
        System.out.print("");
        userLogin user = new userLogin();
        user.pengecekkanLogin(usName, passWord);
    }
    
}
