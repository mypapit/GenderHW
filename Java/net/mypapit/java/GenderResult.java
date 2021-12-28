/*
 * GenderHW: a gender prediction class. 
 * Copyright (c) 2021 Mohammad Hafiz bin Ismail 
 * Email: mypapit@gmail.com
 * Website: https://github.com/mypapit/GenderHW
 *
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 */

/**
 * GenderResult - holds the predicted gender and its probability.
 * @author Mohammad Hafiz bin Ismail
 * @version 1.0
 * 
 */

package net.mypapit.java;

public class GenderResult {
	public static final int MALE =0, FEMALE = 1;
	private int gender;
	private double prob; 

	public GenderResult(int gender, double prob) {
		this.gender = gender;
		this.prob = prob;
				
		
	}
	
	/**
	 * 
	 * Returns  Predicted gender. MALE is 0, FEMALE is 1.
	 * 
	 * 
	 * @author Mohammad Hafiz bin Ismail
	 * @return Predicted gender represented in int. MALE is 0, FEMALE is 1;
	 * 
	 *
	 */
	
	public int getGender() 
	{
		
		return gender;
	}
	/**
	 * 
	 * Returns  Probability, confidence factor. The higher value represents higher confidence.
	 * 
	 * 
	 * @author Mohammad Hafiz bin Ismail
	 * @return double value, representing the probability of prediction from 0.00 to 1.00.
	 * 
	 *
	 */
	
	public double getProbability()
	{
		return prob;
		
	}

}
