package com.team.foodybox.notification;



public class SendMailFactory {
 
	public static String mailFlag = "foodybox";
 

	private SendMailFactory() {

	}

	public static SendMail getMailInstance() {
		if (mailFlag.equalsIgnoreCase("foodybox")) {
			return (SendMail) new SendGmail();
		}else{
			return (SendMail) new SendGmail();
		}
	}	
}
