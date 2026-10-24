const fs = require('fs');

fs.access('student.txt', (err) => {
    if (err) {
        console.log("File not found");
    } else {
        fs.unlink('student.txt', (err) => {
            if (err) {
                console.log(err);
                return;
            }

            console.log("File deleted successfully");
        });
    }
});