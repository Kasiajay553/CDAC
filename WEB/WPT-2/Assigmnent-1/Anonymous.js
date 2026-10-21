let grade=function(n){
    if(n>=90){
        return 'A';
    }
    else if(n<90 && n>=75){
        return 'B';

    }
    else if(n<75 && n>=60){
        return 'C';
    }
    else{
        return 'D';
    }
}
console.log(grade(89));
console.log(grade(98));
console.log(grade(64));
console.log(grade(45));