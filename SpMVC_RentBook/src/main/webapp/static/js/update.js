document.addEventListener("DOMContentLoaded", () => {
  const form_update = document.querySelector("form.main.update");

  const btn_update = document.querySelector("button.update");

  const updateButtonClickhandler = (e) => {
    alert("클릭완료!");
    form_update.submit();
  };
  btn_update.addEventListener("click", updateButtonClickhandler);
});
