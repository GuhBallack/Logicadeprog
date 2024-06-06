import { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'
import List from "../components/List"
import Button from '../components/Button'

export default function Lists() {
  const [professores, setProfessores] = useState([])
  const [alunos, setAlunos] = useState([])
  const [monitores, setMonitores] = useState([])

  useEffect(() => {
    setProfessores(JSON.parse(localStorage.getItem('professores')))
    setAlunos(JSON.parse(localStorage.getItem('alunos')))
    setMonitores(JSON.parse(localStorage.getItem('monitores')))
  }, [])

  return (
    <div className='layout'>
      <h1>Lista</h1>

      <div style={{ display: 'flex', gap: '16px', justifyContent: 'center' }}>
        <List>
          <h2>Professores</h2>
          <ul>
            {professores.map((professor) => (
              <li key={professor.nome}><span>{professor.nome}</span></li>
            ))}
          </ul>
        </List>
        <List>
          <h2>Alunos</h2>
          <ul>
            {alunos.map((aluno) => (
              <li key={aluno.nome}><span>{aluno.nome}</span></li>
            ))}
          </ul>
        </List>
        <List>
          <h2>Monitores</h2>
          <ul>
            {monitores.map((monitor) => (
              <li key={monitor.nome}><span>{monitor.nome}</span></li>
            ))}
          </ul>
        </List>
      </div>
      <Link to="/">
        <Button type="button">Voltar</Button>
      </Link>
    </div>
  )
}