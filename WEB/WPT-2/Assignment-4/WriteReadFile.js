const fs = require('fs');

console.log("Start");

const content = "Welcome to Node.js";

fs.writeFile('student.txt', content, (err) => {
    if (err) {
        console.log(err);
        return;
    }

    console.log("File has been written successfully!");

    fs.readFile('student.txt', 'utf8', (err, data) => {
        if (err) {
            console.log(err);
            return;
        }

        console.log(data);
    });
});

console.log("End");
