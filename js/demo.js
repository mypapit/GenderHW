function BMIcalculate() {
  height = parseFloat(document.getElementById("height").value);
  weight = parseFloat(document.getElementById("weight").value);

  bmi = (weight / (height * height)) * 10000;
  resultBMI = document.getElementById("resultBMI");
  resultBMI.innerHTML = "Your BMI: " + bmi.toFixed(4);

  if (isNaN(bmi)) {
    resultBMI.innerHTML = "Please input valid weight and height values";
  }
}

function GenderPredict() {
  height = parseFloat(document.getElementById("height").value);
  weight = parseFloat(document.getElementById("weight").value);

  resultPrediction = document.getElementById("resultPrediction");
  resultPrediction.innerHTML = "  ";

  let gender = new GenderHW(height, weight);
  result = gender.predictCF();
  gender_result = 0;

  if (result[0] == gender.MALE) {
    gender_result = "male";
  } else {
    gender_result = "female";
  }


  resulttext = "You are most likely a " + gender_result;
  resultPrediction.innerHTML = resulttext + " (Confidence: " + result[1] + ")";

  //buat bagi dia boleh berkata-kata sikit

  var speak = new SpeechSynthesisUtterance();
  speak.text = resulttext;
  speechSynthesis.speak(speak);
}
