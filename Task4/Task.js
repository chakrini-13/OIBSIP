let user = "";
let pass = "";
function register() {
  user = document.getElementById("regUser").value;
  pass = document.getElementById("regPass").value;

  if (user && pass) {
    document.getElementById("message").innerText = "Registration Successful!";
  } else {
    document.getElementById("message").innerText = "Please fill all fields!";
  }
}
function login() {
  let loginUser = document.getElementById("loginUser").value;
  let loginPass = document.getElementById("loginPass").value;

  if (loginUser === user && loginPass === pass) {
    document.getElementById("message").innerText = "Login Successful! 🎉";
  } else {
    document.getElementById("message").innerText = "Invalid Username or Password!";
  }
}
