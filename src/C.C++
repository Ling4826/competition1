#include <iostream>
#include <map>
#include <vector>
#include <set>
#include <queue>
#include <unordered_map>
using namespace std;
string problem(vector<int> num)
{
    int size = num.size();
    int nice = 0, nope = 0, rip = 0, co = 0, notco = 0;
    for (int i = 0; i < num.size(); i++)
    {
        if (num[i] > 0)
        {
            nice++;
            co++;
            if (num[i] > 1)
            {
                notco += num[i] - 1;
            }
        }
        else if (num[i] == 0)
        {
            nope++;
        }
        else if (num[i] < 0)
        {
            rip++;
            notco += -num[i];
        }
    }
    if (nice > size / 2)
    {
        return "easy";
    }
    else if (nice < size * 0.2)
    {
        return "hard";
    }
    else if (co * 2 < notco)
    {
        return "tricky";
    }
    else
    {
        return "medium";
    }
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
    cout << problem(num);
    return 0;
}
