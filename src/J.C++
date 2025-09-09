#include <bits/stdc++.h>
#include <map>
#include <vector>
#include <set>
#include <queue>
#include <unordered_map>
using namespace std;
int main()
{
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    int Hp , pos,swod,time;
    std::cin >> Hp >>pos>>swod>>time ;
    vector<int> pos1(pos), swod1(swod);

    for (int i = 0; i < pos; i++)
    {
        cin >> pos1[i];
    }
    for (int i = 0; i < swod; i++)
    {
        cin >> swod1[i];
    }

    int usep = 0 ,uses = 0;
    for (int i = 0; i < time; i++)
    {
        if(pos >= 0 || swod >= 0)
        {
            if(Hp / (pos1[usep] /100) > Hp - swod1[uses])
            {
                usep++;
                Hp = Hp / (pos1[usep] /100);
                pos--;
            }
            else if(Hp / (pos1[usep] /100) > Hp - swod1[uses])
            {
                uses++;
                Hp = Hp - swod1[uses];
                swod--;
            }
        }
    }
    cout << Hp ;
    return 0;
}
