import React from "react";
import Card from "react-bootstrap/Card";
export default function TodoItem(props) {
  return (
    <Card>
      <Card.Body>{props.toDoText}</Card.Body>
    </Card>
  );
}
