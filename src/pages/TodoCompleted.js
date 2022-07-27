import React from "react";
import TodoItem from "../components/TodoItem";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import TButton from "../components/TButton";

export default function TodoCompleted() {
  function handleDelete() {
    console.log("ToDo Deleted");
  }

  return (
    <>
      <Row style={{ marginBottom: "5px" }}>
        <Col md={11}>
          <TodoItem toDoText="This is a completed Todo" />
        </Col>
        <Col style={{ margin: "auto" }} md={1}>
          <TButton onClick={handleDelete} name="delete" variant="danger" />
        </Col>
      </Row>
    </>
  );
}
