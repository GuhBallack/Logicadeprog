import React, { useEffect } from "react"
import { BrowserRouter as Router, Routes, Route } from "react-router-dom"
import Home from "./pages/Home"
import Form from "./pages/Form"
import Lists from "./pages/Lists"
import { ALUNOS, MONITORES, PROFESSORES } from "./constants"

function App() {
  useEffect(() => {
    if (localStorage.getItem('professores') === null) {
      localStorage.setItem('professores', JSON.stringify(PROFESSORES))
    }

    if (localStorage.getItem('alunos') === null) {
      localStorage.setItem('alunos', JSON.stringify(ALUNOS))
    }

    if (localStorage.getItem('monitores') === null) {
      localStorage.setItem('monitores', JSON.stringify(MONITORES))
    }
  }, [])

  return (
    <>
      <Router>
        <div>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/form" element={<Form />} />
            <Route path="/lista" element={<Lists />} />
          </Routes>
        </div>
      </Router>
    </>
  )
}

export default App
