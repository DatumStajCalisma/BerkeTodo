import React from "react";
import Welcome from "../components/Title";
import { Container, Nav, Navbar } from "react-bootstrap";
import { NavLink } from "react-router-dom";
export default function Navi() {
  return (
    <>
      <Welcome name="Todos" />

      <Navbar variant="light">
        <Container>
          <Nav className="me-auto">
            <Nav.Link as={NavLink} to="/viewAll">
              View All
            </Nav.Link>
            <Nav.Link as={NavLink} to="/completed">
              Completed
            </Nav.Link>
            <Nav.Link as={NavLink} to="/ongoing">
              Ongoing
            </Nav.Link>
            <Nav.Link as={NavLink} to="/add">
              +
            </Nav.Link>
          </Nav>
        </Container>
      </Navbar>
    </>
  );
}
