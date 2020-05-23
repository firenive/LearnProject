/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternbridge;

/**
 *
 * @author Admin
 */
public class PatternBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean isWindows = true;
        Bridge b;
        if (isWindows) b = new Windows();
        else b = new Linux();
        
        b.startWiFi();
        b.startBrowser();
        
    }
    
}
