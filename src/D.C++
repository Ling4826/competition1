#include <bits/stdc++.h>
#include <map>
#include <vector>
#include <set>
#include <queue>
#include <unordered_map>
using namespace std;
vector<int> problem(vector<int> num)
{
    int t1 = 0,t2 =0;
        for (int i = 0; i < num.size() / 2; i++)
        {
            if(i % 2 ==0)
            {
                cout << num[(i-1) + t1] <<' ';
                t1++;
            }else
            {
                cout << num[(i-1) + t2] <<' ';
                t2++;
            }
        }
    
    return num;
}
int main()
{
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    int N;
    std::cin >> N;
    vector<int> num;
    for (int i = 0; i < N; i++)
    {
        int ber;
        cin >> ber;
        num.push_back(ber);
    }
    sort(num.begin(), num.end());

    return 0;
}
