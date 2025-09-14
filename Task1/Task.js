let resultBox = document.getElementById("result");

// Function to show values on screen
function displayValue(value) {
  resultBox.value += value;
}

// Function to clear screen
function clearScreen() {
  resultBox.value = "";
}

// Function to delete last digit
function backspace() {
  resultBox.value = resultBox.value.slice(0, -1);
}

// Function to calculate the result
function calculate() {
  try {
    resultBox.value = eval(resultBox.value);
  } catch (error) {
    resultBox.value = "Error";
  }
}
