let checked_age=(age)=>{
    if(age>=18){
        return "You Can Vote.";
    }
    else{
        return"you can't vote."
    }
}
console.log(checked_age(15));
console.log(checked_age(26));