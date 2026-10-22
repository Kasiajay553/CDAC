function withdraw(balance, amount) {
    return new Promise((resolve, reject) => {

        if(balance>=amount){
            resolve("Withdrawal Successful");
        }
        else{
            reject("Insufficient Balance");
        }

    });
}

withdraw(5000, 3000)
    .then(result => console.log(result))
    .catch(error => console.log(error));