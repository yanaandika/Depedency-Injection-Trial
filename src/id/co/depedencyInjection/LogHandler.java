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
public class LogHandler {
    
    private Message message;
    
    public void loggingMessage(String logmessage){
       message.sendMessage(logmessage);
    }
    
    /**
     * @return the message
     */
    public Message getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(Message message) {
        this.message = message;
    }
    
    
}
