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
public class userLogin {
    private static final String username = "RizkiAdam";
    private static final String password = "terbaikselalu";
    private static Boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword) {
        return (parUserName.equals(username))?
                (parPassword.equals(password)) : false;
    }
    
    private void hasilLogin(boolean status, String parUserName) {
        if(status){
            System.out.println("********* HALO " .concat(parUserName.toUpperCase()).concat("*********"));
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Ooops, username atau password salah!");
        }
    }
    
    public void pengecekkanLogin(String parUserName, String parPassword) {
        hasilLogin(cekAkun(parUserName, parPassword), parUserName);
    }
    
}
