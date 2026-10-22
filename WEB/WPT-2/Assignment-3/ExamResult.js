function checkResult(marks){
    return new Promise((resolve,reject)=>{
        if(marks>=35){
            resolve("pass");
        }
        else{
            reject("Fail")
        }
    })
}
checkResult(25)
    .then(message=>console.log(message))
    .catch(eror=>console.log(eror));