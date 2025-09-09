#include <iostream>
#include <map>
#include <vector>
#include <set>
#include <queue>
using namespace std;

bool is_better(string z ,string x)
{
    if(z.length() != x.length())
    {
return z.length() < x.length();
    }
    return z < x;
    
}


int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);
    
    string x; 
cout << "Type a number: "; 
cin >> x; 
int n = x.length();
    std::vector<std::string> keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    std::vector<std::string> dp(n + 1);
    dp[0] = "";
    for (int i =1;i <= n ; i++)
    {
        dp[i] = string(i+1,'z');

        for(int j =1;j<=4;j++)
        {
            if(i < j)
            {
                break;
            }
            char current_digit = x[i - 1];
            bool allsame = true;
            for(int k = 1 ; k <j ; k++)
            {
                if(x[i-1-k] != current_digit )
                {
                        allsame = false;
                        break;
                }
            }
            
            if(allsame)
            {
                   int dig = current_digit - '0';   
                   const std::string& letters_on_key = keypad[dig];   

                   if(j <= letters_on_key.length())
                   {
                     char new_char = letters_on_key[j - 1];
                        string candidate = dp[i - j] + new_char;
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
