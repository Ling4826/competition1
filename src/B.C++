#include <iostream>
#include <map>
#include <vector>
#include <set>
#include <queue>
#include <unordered_map>
using namespace std;
long long Bin(long long a)
{
    long long n = a;
    long long re = 0,keep =0;
    while (n >0)
    {
        keep = n % 10;
        n /=0;
    }
    return re;

}
int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    long long N;
    std::cin >> N;
    long long imo;

    if(N > 0)
    {
        imo = Bin(N);
    }
    cout << imo;

    return 0;
}
