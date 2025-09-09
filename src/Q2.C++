#include <iostream>
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

    int n;
    cin >> n;
    unordered_map<int, int> umap;


    for (int i = 0; i < n; i++)
    {
        int y;
        cin >> y;
        umap[y]++;
        
    }
    int max_key = 0;
    for (auto const& pair : umap)
    {
        if(max_key < pair.second )
        {
            max_key = pair.second ;
        }
    }
    cout << max_key;
    return 0;
}
