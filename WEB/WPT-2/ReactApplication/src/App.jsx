import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'
import Student from './Student' 
import InterestCalculator from './InterestCalculator'

function App() {
  return (
    <>
      <Student></Student>
      <InterestCalculator/>
    </>
  )
}

export default App
