function res(a,b,op){
    switch (op) {
        case '+': return a + b;
        case '-': return a - b;
        case '*': return a * b;
        case '/': return a / b;
        default: return "Invalid operator";
    }

}
const cal=(a,b,op,callback)=>{

   return  callback(a,b,op);

}

function calculate(a,b,op,result){
   return  result(a,b,op);

}


console.log(cal(10,20,'+',res));
console.log(calculate(20,30,'-',res))
