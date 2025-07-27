import { CalculatorScore } from "./Components/CalculateScore"; 
function App(){
  return(
    <div>
      <CalculatorScore Name={"Steeve"}
      School={"DNV Public School"}
      total={284}
      goal={3} />
    </div>
  )
}
export default App;