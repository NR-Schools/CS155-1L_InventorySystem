/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 * @author hp
 */

// Idk kung ganto ba hehe :)
// Pede gawin na lng tong helper class or service since isa lng naman yung i-authenticate niya
// Kayo bahala
public class AuthRepository extends BaseRepository {
    
    public AuthRepository() {}
    
    private String _HashPassword(String RawPassword) throws NoSuchAlgorithmException, InvalidKeySpecException {
        //https://www.baeldung.com/java-password-hashing
        KeySpec spec = new PBEKeySpec(RawPassword.toCharArray(), new byte[16], 65536, 128);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        
        byte[] hash = factory.generateSecret(spec).getEncoded();
        
        // https://howtodoinjava.com/java/java-security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hash.length; i++) {
            sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        return sb.toString();
    }
    
    public boolean checkAuth(String Username, String Password) {
        try {
            // Hash Sent Password
            String StoredHashedPassword = "";
            String HashedPasswordInput = this._HashPassword(Password);
            
            // Pull Hashed Password from storage
            Connection con = createSQLConnection();
            Statement Query = con.createStatement();
            ResultSet results = Query.executeQuery(
                    String.format(
                            "SELECT * FROM AuthTable WHERE Username=\"%s\";",
                            Username
                     )
            );
            if(results.next()) {
                StoredHashedPassword = results.getString("HashedPassword");
                System.out.println(StoredHashedPassword);
                System.out.println(HashedPasswordInput);

            }
            else {
                return false;
            }
            
            con.close();
            
            // Check If Same
            return HashedPasswordInput == null ? StoredHashedPassword == null : HashedPasswordInput.equals(StoredHashedPassword);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
