 import React, { useState } from 'react';

 
 
 function InterestCalculator(){
    let principleAmount=10000;
    let rateOfInterest=5;
    let timePeriod=2;
    let simpleInterest=(principleAmount*rateOfInterest*timePeriod)/100;

    const [num1,setnum1]=useState(0);
    const [num2,setnum2]=useState(0);
    let total=Number(num1)+Number(num2);
    return(
        <>
        <hr/>
        <h1>The Task-2 </h1>
        <div> <span>The the Simple Interest : </span>{simpleInterest}</div>
        <input type='number' value={num1} onChange={(e)=>setnum1(e.target.value)}></input>

        <input type='number' value={num2} onChange={(e)=>setnum2(e.target.value)}></input>

        
         <div> 
                <strong>The Result of Addition: </strong> {total}
            </div>
        </>
    )
 }
 export default InterestCalculator