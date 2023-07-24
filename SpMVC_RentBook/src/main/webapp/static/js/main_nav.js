document.addEventListener("DOMContentLoaded", () => {
  const main_nav = document.querySelector("nav.main");

  const navClickHandler = (e) => {
    const nav_item = e.target;
    if (nav_item.tagName === "LI") {
      const nav_class = nav_item.className;
      if (nav_class === "books") {
        document.location.href = `/book/books`;
        alert("도서정보로 갑니다잇");
      }

      if (nav_class === "users") {
        document.location.href = `/book/users`;
        alert("회원정보로 갑니다잇");
      }
    }
  };

  main_nav.addEventListener("click", navClickHandler);
});
