import axios from "axios";

export default class ProductService {
  getToDos() {
    return axios.get("http://localhost:8080/viewAll");
  }

  addToDo() {
    return axios.post("http://localhost:8080/add");
  }

  deleteToDo(id) {
    return axios.delete("http://localhost:8080/delete/" + id);
  }

  updateToDoStatus(id, todoStatus) {
    return axios.patch(
      "http://localhost:8080/updateStatus/" + id + "/" + todoStatus
    );
  }
  updateToDoText(id, todoText) {
    return axios.patch(
      "http://localhost:8080/updateText/" + id + "/" + todoText
    );
  }
}
