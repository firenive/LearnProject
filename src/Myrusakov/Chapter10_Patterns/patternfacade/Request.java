/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternfacade;

/**
 *
 * @author Admin
 */
public class Request {
    
    public MyURL url;
    
    public Request(MyURL url) {
        this.url = url;
    }
    
    public String sendRequest() {
        return "60";
    }
    
}
