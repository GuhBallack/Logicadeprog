import React, { useEffect, useState } from "react"
import { KPI } from "../components/KPI"
import { Link } from "react-router-dom"
import Button from "../components/Button"

function Home() {
  const [professores, setProfessores] = useState([])
  const [alunos, setAlunos] = useState([])
  const [monitores, setMonitores] = useState([])

  useEffect(() => {
    setProfessores(JSON.parse(localStorage.getItem('professores')))
    setAlunos(JSON.parse(localStorage.getItem('alunos')))
    setMonitores(JSON.parse(localStorage.getItem('monitores')))
  }, [])

  return (
    <div className="layout">
      <h1>Universidade Progamação</h1>
      <div style={{ display: 'flex', gap: '20px' }}>
        <KPI label="Alunos">
          <span className="card-value">{professores.length}</span>
          <span className="card-text">Nª Professores</span>
        </KPI>
        <KPI label="Alunos">
          <span className="card-value">{alunos.length}</span>
          <span className="card-text">Nº Alunos</span>
        </KPI>
        <KPI label="Alunos">
          <span className="card-value">{monitores.length}</span>
          <span className="card-text">Nº Monitores</span>
        </KPI>
      </div>

      <div style={{ display: 'flex', gap: '16px' }}>
        <Link to="/form">
          <Button type="button">Cadastro</Button>
        </Link>
        <Link to="/lista">
          <Button type="button">Lista</Button>
        </Link>
      </div>
    </div>
  )
}

export default Home
