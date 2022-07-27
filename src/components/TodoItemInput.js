import React from "react";
import { InputGroup, Form } from "react-bootstrap";

export default function TodoItemInput(props) {
  return (
    <>
      <InputGroup className="mb-3">
        <Form.Control
          placeholder={props.placeHolder}
          aria-label="toDos"
          aria-describedby="basic-addon2"
        />
      </InputGroup>
    </>
  );
}
