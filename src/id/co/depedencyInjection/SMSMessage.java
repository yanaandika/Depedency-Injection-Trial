/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.depedencyInjection;

/**
 *
 * @author user
 */
public class SMSMessage implements Message{

    @Override
    public void sendMessage(String message) {
        System.out.println("Mengirim SMS dengan " + message);
    }
    
}
