document.addEventListener("DOMContentLoaded", () => {
  const list_table = document.querySelector("table.list");

  const trclickHandler = (e) => {
    const td = e.target;
    if (td.tagName === "TD") {
      const tr = td.closest("TR");
      const id = tr.dataset.id;
      document.location.href = `/book/details?code=${id}`;
    }
  };

  list_table.addEventListener("click", trclickHandler);
});
