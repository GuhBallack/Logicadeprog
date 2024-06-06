import React from "react"
import Input from "../components/Input"
import Select from "../components/Select"
import Button from "../components/Button"

import { Link } from "react-router-dom"
import { ALUNOS, MONITORES, PROFESSORES } from "../constants"

function Form() {
  const [nome, setNome] = React.useState('')
  const [tipo, setTipo] = React.useState('')

  const handleSubmit = (e) => {
    e.preventDefault()

    if (tipo === "Professor") {
      localStorage.setItem('professores', JSON.stringify([...PROFESSORES, { nome, tipo }]))
    } else if (tipo === "Aluno") {
      localStorage.setItem('alunos', JSON.stringify([...ALUNOS, { nome, tipo }]))
    } else {
      localStorage.setItem('monitores', JSON.stringify([...MONITORES, { nome, tipo }]))
    }

    alert(`Cadastrado ${tipo} ${nome}`)
  }

  return (
    <div className="layout">
      <h1>Cadastro</h1>

      <Input value={nome} onChange={(e) => setNome(e.target.value)} placeholder="Nome" />
      <Select value={tipo} onChange={(e) => setTipo(e.target.value)}>
        <option value="Aluno">Aluno</option>
        <option value="Professor">Professor</option>
        <option value="Monitor">Monitor</option>
      </Select>

      <div style={{ display: 'flex', gap: '16px' }}>
        <Button type="submit" onClick={handleSubmit}>Cadastrar</Button>

        <Link to="/">
          <Button type="button">Voltar</Button>
        </Link>
      </div>
    </div>
  )
}

export default Form
