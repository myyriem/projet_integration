/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ftpconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;


/**
 *
 * @author AMINOVISH
 */
public class FTPUploader {
    FTPClient ftp = null;
    String host="goldencage.comli.com";
    String user="a1945739";
    String pwd="27051990bilel";

     
    public FTPUploader() throws Exception{
        ftp = new FTPClient();
        ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
        int reply;
        ftp.connect(host);
        reply = ftp.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftp.disconnect();
            throw new Exception("Exception in connecting to FTP Server");
        }
        ftp.login(user, pwd);
        ftp.setFileType(FTP.BINARY_FILE_TYPE);
        ftp.enterLocalPassiveMode();
    }
    public void uploadFile(String localFileFullName, String fileName, String hostDir)
            throws Exception {
        try(InputStream input = new FileInputStream(new File(localFileFullName))){
        this.ftp.storeFile(hostDir + fileName, input);
        }
    }
 
    public void disconnect(){
        if (this.ftp.isConnected()) {
            try {
                this.ftp.logout();
                this.ftp.disconnect();
            } catch (IOException f) {
                // do nothing as file is already saved to server
            }
        }
    }
    
    public void deletefile(String fileName, String hostDir){
        
        
 
// code to connect and login...
 
        String fileToDelete = hostDir+fileName;
 
        try {
            boolean deleted = this.ftp.deleteFile(fileToDelete);
            if (deleted) {
        System.out.println("The file was deleted successfully.");
            } else {
        System.out.println("Could not delete the file.");
                 }
                } catch (IOException ex) {
          System.out.println("Oh no, there was an error: " + ex.getMessage());
}
    }

    
    
    
}
