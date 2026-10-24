const express = require('express');

const app = express();
app.get('/',(req,res)=>{
    res.send("Welcome to Express ")
})

app.get('/student', (req, res) => {
    res.send('Welcome Student!');
});

app.listen(3001, () => {
    console.log('Express Server is Running');
});