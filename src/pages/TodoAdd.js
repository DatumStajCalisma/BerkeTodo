import React from "react";
import TodoItemInput from "../components/TodoItemInput";
import TButton from "../components/TButton";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";

export default function TodoAdd() {
  function handleAdded() {
    console.log("Added");
  }
  return (
    <>
      <Row style={{ marginBottom: "5px" }}>
        <Col md={11}>
          <TodoItemInput placeHolder="Add a new ToDo" />
        </Col>
        <Col md={1}>
          <TButton onClick={handleAdded} name="add" variant="primary" />
        </Col>
      </Row>
    </>
  );
}
