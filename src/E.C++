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

    int N;
    std::cin >> N;
    int lasttime = 0, lastflo = 0, re = 0;

    for (int i = 0; i < N; i++)
    {
        int time;
        cin >> time;
        int flo;
        cin >> flo;

        if (lasttime != 0)
        {
            if (lasttime != time + 1 && lastflo != flo - 1)
            {
                re++;
            }
        }
        lasttime = time;
        lastflo = flo;
    }
    cout << re<<endl;

    return 0;
}
