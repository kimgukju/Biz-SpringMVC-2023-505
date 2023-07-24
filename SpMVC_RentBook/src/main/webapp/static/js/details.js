document.addEventListener("DOMContentLoaded", () => {
  const btn_list = document.querySelector("button.detail.list");
  const btn_update = document.querySelector("button.detail.update");
  const btn_delete = document.querySelector("button.detail.delete");

  btn_list.addEventListener("click", () => {
    document.location.href = "/book/books";
  });

  btn_update.addEventListener("click", (e) => {
    const id = e.target.dataset.id;
    document.location.href = `/book/update?code=${id}`;
  });
});
