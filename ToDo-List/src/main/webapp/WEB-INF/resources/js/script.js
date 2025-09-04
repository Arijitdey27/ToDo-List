function setMinDate() {
  const today = new Date().toISOString().split("T")[0];
  document.getElementById("dateInput").min = today;
}