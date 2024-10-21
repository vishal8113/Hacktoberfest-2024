#include <iostream>
#include <vector>
using namespace std;

// Function to implement the Sieve of Eratosthenes
vector<bool> sieveOfEratosthenes(int n) {
    vector<bool> isPrime(n + 1, true);
    isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime numbers

    for (int p = 2; p * p <= n; p++) {
        if (isPrime[p]) {
            for (int i = p * p; i <= n; i += p) {
                isPrime[i] = false;
            }
        }
    }
    
    return isPrime; // Returns the array of boolean values
}

// Function to print prime numbers between m and n
void printPrimesInRange(int m, int n) {
    // Step 1: Get the prime numbers up to n
    vector<bool> isPrime = sieveOfEratosthenes(n);
    
    // Step 2: Print primes between m and n
    cout << "Prime numbers between " << m << " and " << n << ": ";
    bool found = false; // Flag to check if any prime is found
    for (int i = m; i <= n; i++) {
        if (isPrime[i]) {
            cout << i << " ";
            found = true; // Set the flag if we find a prime
        }
    }
    if (!found) {
        cout << "No prime numbers found in this range.";
    }
    cout << endl;
}

int main() {
    int m, n;
    cout << "Enter the lower limit (m): ";
    cin >> m;
    cout << "Enter the upper limit (n): ";
    cin >> n;

    // Ensure m is not less than 2 since primes are >= 2
    if (m < 2) m = 2;

    // Validate that n is greater than or equal to m
    if (n < m) {
        cout << "Error: Upper limit (n) must be greater than or equal to lower limit (m)." << endl;
        return 1;
    }

    printPrimesInRange(m, n);

    return 0;
}
