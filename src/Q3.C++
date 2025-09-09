#include <iostream>
#include <map>
#include <vector>
#include <set>
#include <queue>
#include <unordered_map>
using namespace std;

string T(long long int a)
{ 
    if (a % 400 == 0)
    {
        return "Y";
    }
    else if (a % 4 == 0&& a % 100 != 0)
    {
        return "Y";
    }
    else
    {
        return "N";
    }
}
int main()
{
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    long n;
    cin >> n;
    vector<string> umap;

    for (int i = 0; i < n; i++)
    {
        long long int y;
        cin >> y;
        umap.push_back(T(y));
    }
    for (int j = 0; j < umap.size(); j++)
    {
        cout << umap[j] << endl;
    }
    return 0;
}
