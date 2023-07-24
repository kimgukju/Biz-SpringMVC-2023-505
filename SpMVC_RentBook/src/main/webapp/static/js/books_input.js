document.addEventListener("DOMContentLoaded", () => {
  const form_books = document.querySelector("form.book.input");

  const input_code = form_books.querySelector("input[name='b_code']");
  const input_name = document.querySelector("input[name='b_name']");
  const input_auther = document.querySelector("input[name='b_auther']");
  const input_comp = document.querySelector("input[name='b_comp']");
  const input_year = document.querySelector("input[name='b_year']");
  const input_iprice = document.querySelector("input[name='b_iprice']");
  const input_rprice = document.querySelector("input[name='b_rprice']");

  const btn_save = document.querySelector("button.save");

  const saveButtonClickhandler = (e) => {
    if (!input_code.value) {
      alert("도서코드 입력해주세요");
      input_code.focus();
      return false;
    }
    if (!input_name.value) {
      alert("도서명 입력해주세요");
      input_name.focus();
      return false;
    }
    if (!input_auther.value) {
      alert("저자 입력해주세요");
      input_auther.focus();
      return false;
    }
    if (!input_year.value) {
      alert("구입연도 입력해주세요");
      input_year.focus();
      return false;
    }
    if (!input_rprice.value) {
      alert("대여가격 입력해주세요");
      input_rprice.focus();
      return false;
    }

    form_books.submit();
  };
  btn_save.addEventListener("click", saveButtonClickhandler);
});
