/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
public class TwilioSetup {
    public static final String ACCOUNT_SID = System.getenv("AC48048d1137ccb2eca2897182686f768c");
    public static final String AUTH_TOKEN = System.getenv("87e182acc4f08c4a2cd0b13de3ee9ec9");
    String no;
    public void sendMsg(String no) {
        this.no =no;
        String phn = "+1"+no;
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message = Message.creator(new PhoneNumber(phn),new PhoneNumber(""),"You have been successfully registered").create();
    System.out.println(message.getSid());
    }}