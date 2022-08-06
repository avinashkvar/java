// let arr = [4,3,-2,9,-4,2,7];

// let n =7;

// let k = 6;


// //your code;

// let sum=0;
// let max=-Infinity;
// for(let i=0;i<k;i++){
//      sum+=arr[i];
// }

// max=Math.max(sum,max);

// for(let i=k;i<n;i++){
//     sum+=arr[i]-arr[i-k];
//     max=Math.max(sum,max);
// }
// console.log(max);


let spin = ['712', '246', '365', '312'];
console.log(calculate(4, spin, 0));

function calculate(n,spin,sum){
      if(spin[0].length==0){
        return sum;
      }
      let max=-Infinity;
      let anotherSpin=[];
      for(let i=0;i<n;i++){
          let num=spin[i].split('').map(Number).sort((a,b)=>a-b);
          max=Math.max(max,num[num.length-1]);
          num.pop();
          anotherSpin.push(num.join(''));
      }
      sum+=max;
      return calculate(n,anotherSpin,sum);
}



