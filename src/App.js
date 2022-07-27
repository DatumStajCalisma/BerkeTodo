import "./App.css";
import React from "react";
import Navi from "./components/Navi";
import "bootstrap/dist/css/bootstrap.min.css";
import Container from "react-bootstrap/Container";
import Dashboard from "./components/Dashboard";
function App() {
  return (
    <div className="App">
      <Container>
        <Navi />
        <Dashboard></Dashboard>
      </Container>
    </div>
  );
}

export default App;
