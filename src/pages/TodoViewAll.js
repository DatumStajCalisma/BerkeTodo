import React, { useState, useEffect } from "react";
import TodoItem from "../components/TodoItem";
import TButton from "../components/TButton";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import TodoItemInput from "../components/TodoItemInput";
import ToDoService from "../service/toDoService";

export default function TodoViewAll() {
  let toDoService = new ToDoService();
  const [toDos, setToDos] = useState([]);

  useEffect(() => {
    let toDoService = new ToDoService();
    toDoService.getToDos().then((result) => setToDos(result.data.data));
  }, []);

  const [inputValue, setInputValue] = useState("");

  const handleChange = (event) => {
    setInputValue(event.target.value);
  };
  // const [isDone, setIsDone] = useState(true);

  const [isEditedID, setIsEditedID] = useState("");

  function handleIsEditing(event) {
    setIsEditedID(event.currentTarget.id);
  }

  function handleIsEdited(event) {
    const updateID = event.currentTarget.id;
    const todoText = inputValue;
    const filtered = toDos.filter((obj) => {
      // console.log(obj.id);
      if (obj.id == updateID) {
        return (obj.todoText = todoText);
      } else {
        return obj;
      }
    });
    // console.log(filtered);
    toDoService
      .updateToDoText(updateID, todoText)
      .then(() => setToDos(filtered));
    setIsEditedID("");
  }

  function handleIsDone(event) {
    const updateID = event.currentTarget.id;
    const todoStatus = true;
    const filtered = toDos.filter((obj) => {
      // console.log(obj.id);
      if (obj.id == updateID) {
        return (obj.todoStatus = true);
      } else {
        return obj;
      }
    });
    // console.log(filtered);
    toDoService
      .updateToDoStatus(updateID, todoStatus)
      .then(() => setToDos(filtered));
  }

  function handleDelete(event) {
    const deleteID = event.currentTarget.id;
    const filtered = toDos.filter((obj) => {
      // console.log(deleteID + "deleted");
      return obj.id != deleteID;
    });
    // console.log(filtered);
    toDoService.deleteToDo(deleteID).then(() => setToDos(filtered));
  }
  return (
    <>
      {toDos.map((toDos) => (
        <div key={toDos.id}>
          <Row id={toDos.id} style={{ marginBottom: "10px" }}>
            <Col md={8}>
              <TodoItem toDoText={toDos.todoText} />
            </Col>
            <Col md={1}>
              <TodoItem toDoText={toDos.todoStatus ? "True" : "False"} />
            </Col>
            <Col md={1} style={{ margin: "auto" }}>
              <TButton
                pId={toDos.id}
                onClick={handleIsEditing}
                name="edit"
                variant="primary"
              />
            </Col>
            <Col md={1} style={{ margin: "auto" }}>
              <TButton
                pId={toDos.id}
                onClick={handleIsDone}
                name="done"
                variant="success"
              />
            </Col>
            <Col id={toDos.id} md={1} style={{ margin: "auto" }}>
              <TButton
                pId={toDos.id}
                onClick={handleDelete}
                name="delete"
                variant="danger"
              />
            </Col>
          </Row>
          {isEditedID == toDos.id ? (
            <Row>
              <Col md={11}>
                <TodoItemInput
                  id={toDos.id}
                  placeHolder="Update ToDo"
                  valueInput={inputValue}
                  onChange={handleChange}
                />
              </Col>
              <Col md={1}>
                <TButton
                  pId={toDos.id}
                  onClick={handleIsEdited}
                  name="done"
                  variant="success"
                />
              </Col>
            </Row>
          ) : (
            <></>
          )}
        </div>
      ))}
    </>
  );
}
