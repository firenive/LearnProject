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
public class Linux implements Bridge {
    
    public void startWiFi() {
        System.out.println("Запускаем Wi-Fi в Linux");
    }
    
    public void startBrowser() {
        System.out.println("Запускаем браузер в Linux");
    }
    
}
