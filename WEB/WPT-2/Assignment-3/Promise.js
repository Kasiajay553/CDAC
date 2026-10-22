function orderPizza() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            let isAvailable = true;

            if (isAvailable) {
                resolve("Here is your hot pizza");
            } else {
                reject("Sorry, we ran out of cheese");
            }
        }, 2000);
    });
}

orderPizza().then((message) => {
        console.log(message);
    })
    .catch((error) => {
        console.log(error);
    });
