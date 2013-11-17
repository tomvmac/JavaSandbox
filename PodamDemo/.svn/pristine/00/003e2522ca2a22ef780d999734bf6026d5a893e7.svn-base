package com.podam.sample;

import java.util.Random;

import uk.co.jemos.podam.api.AttributeStrategy;
import uk.co.jemos.podam.exceptions.PodamMockeryException;

public class PostCodeStrategy implements AttributeStrategy<String> {
    public String getValue() throws PodamMockeryException {
    	Random randomGenerator = new Random();
    	
    	int randomNum = randomGenerator.nextInt();
    	
    	if (randomNum > 900000009) {
    		return "18303";
    	}
    	
    	if (randomNum > 800000009){
    		return "02124";
    	}
    	
    	if (randomNum > 700000009) {
    		return "90201";
    	}
    	
    	if (randomNum > 600000009) {
    		return "88303";
    	}
    	
    	if (randomNum > 100) {
    		return "38303";
    	}
    	
    	
    	
    	return "02111";
    }
}
