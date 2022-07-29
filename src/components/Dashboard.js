import React from "react";
import { Routes, Route } from "react-router-dom";
import App from "../App";
import TodoAdd from "../pages/TodoAdd";
import TodoViewAll from "../pages/TodoViewAll";
import TodoCompleted from "../pages/TodoCompleted";
import TodoOngoing from "../pages/TodoOngoing";
export default function Dashboard() {
  return (
    <Routes>
      <Route path="*" element={<App />} />
      <Route path="viewAll" element={<TodoViewAll />} />
      <Route path="completed" element={<TodoCompleted />} />
      <Route path="ongoing" element={<TodoOngoing />} />
      <Route path="add" element={<TodoAdd />} />
    </Routes>
  );
}
