const form = document.getElementById('task-form');
const taskList = document.getElementById('task-list');

let tasks = JSON.parse(localStorage.getItem('tasks')) || [];

function renderTasks() {
  taskList.innerHTML = '';
  tasks.forEach((task, index) => {
    const li = document.createElement('li');
    li.className = task.done ? 'done' : '';
    li.innerHTML = `
      <span>${task.date}: ${task.desc}</span>
      <div class="task-buttons">
        <button onclick="toggleTask(${index})">✔️</button>
        <button onclick="deleteTask(${index})">🗑️</button>
      </div>
    `;
    taskList.appendChild(li);
  });
}

form.addEventListener('submit', (e) => {
  e.preventDefault();
  const date = document.getElementById('task-date').value;
  const desc = document.getElementById('task-desc').value;
  tasks.push({ date, desc, done: false });
  localStorage.setItem('tasks', JSON.stringify(tasks));
  renderTasks();
  form.reset();
});

function toggleTask(index) {
  tasks[index].done = !tasks[index].done;
  localStorage.setItem('tasks', JSON.stringify(tasks));
  renderTasks();
}

function deleteTask(index) {
  tasks.splice(index, 1);
  localStorage.setItem('tasks', JSON.stringify(tasks));
  renderTasks();
}

renderTasks();
