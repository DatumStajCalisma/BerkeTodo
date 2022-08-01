import React from "react";
import { Button } from "react-bootstrap";

export default function TButton(props) {
  const { onClick } = props;

  return (
    <Button id={props.pId} variant={props.variant} onClick={onClick}>
      {props.name}
    </Button>
  );
}
