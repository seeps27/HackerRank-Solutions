// Given a positive integer , do the following:

// If , print the lowercase English word corresponding to the number (e.g., one for , two for , etc.).
// If , print Greater than 9.

#include <iostream>
using namespace std;

int main() {
    string numbers[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    int n;
    cin >> n;

    if (n >= 1 && n <= 9)
        cout << numbers[n] << endl;
    else
        cout << "Greater than 9" << endl;

    return 0;
}
