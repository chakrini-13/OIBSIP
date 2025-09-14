function addTask() {
  let taskInput = document.getElementById("taskInput");
  let taskText = taskInput.value.trim();

  if (taskText === "") {
    alert("Please enter a task!");
    return;
  }

  let li = document.createElement("li");
  let textSpan = document.createElement("span");
  textSpan.textContent = taskText;

  let time = document.createElement("div");
  time.className = "time";
  time.textContent = "Added: " + new Date().toLocaleString();

  let completeBtn = document.createElement("button");
  completeBtn.textContent = "✔";
  completeBtn.onclick = function () {
    li.classList.add("completed");
    time.textContent = "Completed: " + new Date().toLocaleString();
    document.getElementById("completedList").appendChild(li);
    li.removeChild(completeBtn);
    li.removeChild(editBtn);
  };

  let editBtn = document.createElement("button");
  editBtn.textContent = "✎";
  editBtn.onclick = function () {
    let newTask = prompt("Edit task:", textSpan.textContent);
    if (newTask !== null && newTask.trim() !== "") {
      textSpan.textContent = newTask.trim();
    }
  };

  let deleteBtn = document.createElement("button");
  deleteBtn.textContent = "✖";
  deleteBtn.onclick = function () {
    li.remove();
  };

  li.appendChild(textSpan);
  li.appendChild(completeBtn);
  li.appendChild(editBtn);
  li.appendChild(deleteBtn);
  li.appendChild(time);

  document.getElementById("pendingList").appendChild(li);

  taskInput.value = "";
}
