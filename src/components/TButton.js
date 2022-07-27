import React from "react";
import { Button } from "react-bootstrap";

export default function TButton(props) {
  const { onClick } = props;

  return (
    <Button variant={props.variant} onClick={onClick} id="button-addon2">
      {props.name}
    </Button>
  );
}
