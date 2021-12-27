//
// Created by Mohammad Hafiz bin Ismail (mypapit@gmail.com)
// Copyright (c) 2021 Mohammad Hafiz bin Ismail
//
//  https://github.com/mypapit/GenderHW/
//
// Javascript gender prediction library based on height (centimeter)
// and weight (kilograms)
//
// If you use this library in your project, writing or both,
// please cite this work as (APA-style):
// Ismail, M. H. (2021). GenderHW: a gender prediction programming library for Java/Javascript.
//   Retrieved DATE, YEAR, from: https://github.com/mypapit/GenderHW/

//
//
// The library performs gender prediction using RandomTree on a male/female
// height and weight dataset. The generated tree was limited to depth=5
//
// It is accurate up to 90% on average person of below 30 years old.
//
// How to use the libary?
//
//  <script src="GenderHW.js"></script>
//  let gender = new GenderHW(168, 78); //  height in cm, weight in kg
//  result=gender.predictCF();
//  if (result[0] == gender.MALE) {
//     console.log("Its a MALE!!");
//  } else {
//    console.log("Its a FEMALE!!");
//  }
//
//  console.log ("Confidence: " + result[1]);
//
//

class GenderHW {
  // height in centimeter
  // weight in kilograms
  constructor(height, weight) {

    if (height > 195) {
        throw "GenderHW: Height too large";
    }

    if (height <115) {
      throw "GenderHW: Height too small";
    }

    if (weight > 120) {
        throw "GenderHW: Weight too large";
    }

    if (weight <30) {
      throw "GenderHW: Weight too small";
    }

    if (isNaN(height) || isNaN(weight)) {
        throw "GenderHW: height and weight is not a number (NaN)";

    }

    this.height = height;
    this.weight = weight;


  }
  //
  // enumeration for gender result
  //
  MALE = 0;
  FEMALE = 1;

  //
  // perform simple gender prediction
  // without certainty factor (CF)
  //
  predict() {
    return this.predictCF()[0];
  }

  //
  // perform gender prediction with certainty factor (CF)
  // returns : an array containing predicted gender and CF
  // index 0 - predicted gender
  // index 1 - Certainty factor
  //
  predictCF() {
    if (this.height >= 156.5) {
      if (this.height >= 164.5) {
        return new Array(this.MALE, 0.99);
      } else {
        //if this.height <164.5
        if (weight >= 68.5) {
          return new Array(this.MALE, 0.92);
        } else {
          //if weight <68.5
          if (this.height >= 160.2) {
            if (weight >= 58.5) {
              return new Array(this.MALE, 0.9375);
            } else {
              return new Array(this.MALE, 0.999);
            }
          } else {
            //if this.height < 160.2
            if (weight >= 49.85) {
              return new Array(this.MALE, 0.894);
            } else {
              return new Array(this.FEMALE, 0.7);
            }
          }
        }
      }
    } else {
      // if this.height <156.5
      if (this.height >= 151.5) {
        if (this.height >= 154.5) {
          if (weight >= 47.25) {
            if (weight >= 58) {
              return new Array(this.FEMALE, 0.66666);
            } else {
              //weight <58
              return new Array(this.MALE, 0.7778);
            }
          } else {
            //if weight <47.25
            return new Array(this.MALE, 0.999);
          }
        } else {
          //if this.height < 154.5
          if (this.height >= 153.45) {
            if (weight > 51.5) {
              return new Array(this.FEMALE, 0.8889);
            } else {
              return new Array(this.FEMALE, 0.9999);
            }
          } else {
            // if this.height <153.45
            if (weight > 50.75) {
              return new Array(this.FEMALE, 0.7368);
            } else {
              return new Array(this.FEMALE, 0.875);
            }
          }
        }
      } else {
        // if this.height < 151.5
        if (this.height >= 149.5) {
          if (weight >= 56) {
            return new Array(this.FEMALE, 0.8571);
          } else {
            return new Array(this.FEMALE, 0.8387);
          }
        } else {
          // if this.height <149.5
          if (weight >= 40.5) {
            return new Array(this.FEMALE, 0.999);
          } else {
            //if weight <40.5

            return new Array(this.FEMALE, 0.999);
          }
        }
      }
    }
  }
}
