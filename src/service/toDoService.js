import axios from "axios";

export default class ProductService {
  getToDos() {
    return axios.get("http://localhost:8080/viewAll");
  }

  addToDo() {
    return axios.post("http://localhost:8080/add");
  }
}
