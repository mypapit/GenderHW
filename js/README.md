# GenderHW Javascript
This is the javascript version of GenderHW library


## Usage (with Confidence Factor)
```
  <script src="GenderHW.js"></script>
  let gender = new GenderHW(168, 78); //  height in cm, weight in kg
  result=gender.predictCF();
  if (result[0] == gender.MALE) {
     console.log("Its a MALE!!");
  } else {
    console.log("Its a FEMALE!!");
  }

  console.log ("Confidence: " + result[1]);
```

## Usage (simplified)
```
let gender = new GenderHW(168, 78); //  height in cm, weight in kg
result = gender.predict();
  if (result[0] == gender.MALE) {
     console.log("Its a MALE!!");
  } else {
    console.log("Its a FEMALE!!");
  }


```

## Demo (HTML5 / Javascript)
Please visit https://demo.mobilepit.com/ai/GenderHW/ for a live HTML5 / Javascript demonstration.
