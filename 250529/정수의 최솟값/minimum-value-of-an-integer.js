const fs = require("fs");
const input = fs.readFileSync(0).toString().trim().split('\n');

let [a, b, c] = input[0].split(" ").map(Number);

let min = (a < b) ? a : b;
min = (min < c) ? min : c;

console.log(min);
