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
 * GenderHW: a gender prediction class.
 *  
 * @author Mohammad Hafiz bin Ismail
 * @version 1.0
 **/
   
  
 

package net.mypapit.java;


public class GenderHW {
	
	public static final int MALE =0, FEMALE = 1;
	
	/**
	 * 
	 * Returns a GenderResult object which contains the predicted gender and its probability.
	 * 
	 * 
	 * @author Mohammad Hafiz bin Ismail
	 * @param height height in centimeter.
	 * @param weight weight in kilogram.
	 * @return GenderResult object which contains the predicted gender and its probability.
	 * @throws GenderHWException
	 *
	 */

	public static GenderResult predictCF(double height, double weight) {
	    if (height >= 156.5) {
	      if (height >= 164.5) {
	        return new GenderResult(MALE, 0.99);
	      } else {
	        //if height <164.5
	        if (weight >= 68.5) {
	          return new GenderResult(MALE, 0.92);
	        } else {
	          //if weight <68.5
	          if (height >= 160.2) {
	            if (weight >= 58.5) {
	              return new GenderResult(MALE, 0.9375);
	            } else {
	              return new GenderResult(MALE, 0.999);
	            }
	          } else {
	            //if height < 160.2
	            if (weight >= 49.85) {
	              return new GenderResult(MALE, 0.894);
	            } else {
	              return new GenderResult(FEMALE, 0.7);
	            }
	          }
	        }
	      }
	    } else {
	      // if height <156.5
	      if (height >= 151.5) {
	        if (height >= 154.5) {
	          if (weight >= 47.25) {
	            if (weight >= 58) {
	              return new GenderResult(FEMALE, 0.66666);
	            } else {
	              //weight <58
	              return new GenderResult(MALE, 0.7778);
	            }
	          } else {
	            //if weight <47.25
	            return new GenderResult(MALE, 0.999);
	          }
	        } else {
	          //if height < 154.5
	          if (height >= 153.45) {
	            if (weight > 51.5) {
	              return new GenderResult(FEMALE, 0.8889);
	            } else {
	              return new GenderResult(FEMALE, 0.9999);
	            }
	          } else {
	            // if height <153.45
	            if (weight > 50.75) {
	              return new GenderResult(FEMALE, 0.7368);
	            } else {
	              return new GenderResult(FEMALE, 0.875);
	            }
	          }
	        }
	      } else {
	        // if height < 151.5
	        if (height >= 149.5) {
	          if (weight >= 56) {
	            return new GenderResult(FEMALE, 0.8571);
	          } else {
	            return new GenderResult(FEMALE, 0.8387);
	          }
	        } else {
	          // if height <149.5
	          if (weight >= 40.5) {
	            return new GenderResult(FEMALE, 0.999);
	          } else {
	            //if weight <40.5

	            return new GenderResult(FEMALE, 0.999);
	          }
	        }
	      }
	    }
	  }
	
	
	public static int predict(double height,double weight) {
		return predictCF(height,weight).getGender();
		
		
	}
	
	

}
