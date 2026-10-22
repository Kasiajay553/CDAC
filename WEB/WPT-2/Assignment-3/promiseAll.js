let p1 = Promise.resolve("Ravi");
let p2 = Promise.resolve("Priya");
let p3 = Promise.resolve("Amit");

Promise.all([p1, p2, p3])
    .then(result => {
        console.log(result);
    });