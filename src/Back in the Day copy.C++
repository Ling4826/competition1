#include <iostream>
#include <string>
#include <vector>
#include <algorithm>


bool is_better(const std::string& a, const std::string& b) {
    if (a.length() != b.length()) {
        return a.length() < b.length();
    }
    return a < b;
}

int main() {
   
    std::cin.tie(NULL);


    std::vector<std::string> keypad = {
        "",       
        "",       
        "abc",    
        "def",    
        "ghi", 
        "jkl"  
        "mno",    
        "pqrs",   
        "tuv",    
        "wxyz"    
    };


    std::string s;
    std::cin >> s;
    int n = s.length();

    std::vector<std::string> dp(n + 1);

    dp[0] = "";

    
    for (int i = 1; i <= n; ++i) {
        
        dp[i] = std::string(i + 1, 'z');

        
        for (int j = 1; j <= 4; ++j) {
           
            if (i < j) {
                break;
            }

            
            char current_digit = s[i - 1];
            bool all_same = true;
            for (int k = 1; k < j; ++k) {
                if (s[i - 1 - k] != current_digit) {
                    all_same = false;
                    break;
                }
            }

            
            if (all_same) {
                int digit_val = current_digit - '0';
                const std::string& letters_on_key = keypad[digit_val];

                
                if (j <= letters_on_key.length()) {
                    char new_char = letters_on_key[j - 1];
                   
                    std::string candidate = dp[i - j] + new_char;

                    
                    if (is_better(candidate, dp[i])) {
                        dp[i] = candidate;
                    }
                }
            }
        }
    }


    std::cout << dp[n] << std::endl;

    return 0;
}