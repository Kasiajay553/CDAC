function LargestNumber(a,b,c){
    if(a>b && a>c){
        return a;
    }
        
    else if(b>a &b>c) {
        return b;

    }
    else {
        return c;
    }
}

let a=LargestNumber(12,13,14);
console.log(a);
let a1=LargestNumber(13,119,14);
console.log(a1);
let a2=LargestNumber(121,13,14);
console.log(a2);