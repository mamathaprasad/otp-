package com.mamatha;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import com.twilio.rest.api.v2010.account.Message;

import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;

@Service
public class SMSService implements CommandLineRunner {
	public static final String ACCOUNT_SID = "ACf47905d0c94b36e9ad2332b1b87a0388";
	public static final String AUTH_TOKEN = "24b8061884d8cbb217dce858f0788ed4";
	public static final int otp = (int) (Math.random() * 1000000);

	@Override
	public void run(String... args) throws Exception {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message.creator(new PhoneNumber("+917406793196"), new PhoneNumber("+12057282481"),
				"Welcome User to Movie booking!! Your OTP is " + otp).create();

	}

}
