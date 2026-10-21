function recursive(n){
    if(n>10){
        return;
    }

    console.log(n);
    recursive(n+1);

    
}
recursive(1);