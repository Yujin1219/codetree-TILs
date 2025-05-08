// 자릿수 합이 짝수인지 확인
function isDigitSumEven(n) {
    let sum = 0;
    while (n > 0) {
        sum += n % 10;
        n = Math.floor(n / 10);
    }
    return sum % 2 === 0;
}

// 소수 판별 함수
function isPrime(n) {
    if (n < 2) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
}

// 메인 함수
function main(input) {
    const [A, B] = input.trim().split(' ').map(Number);
    let count = 0;

    for (let i = A; i <= B; i++) {
        if (isPrime(i) && isDigitSumEven(i)) {
            count++;
        }
    }

    console.log(count);
}

// 예시 실행 (아래는 테스트용 입력 예시)
main("10 30");
