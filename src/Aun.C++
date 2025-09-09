#include <iostream>
#include <map>
#include <vector>
#include <set>
#include <queue>
#include <unordered_map>
using namespace std;
int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    int N;
    std::cin >> N;

    if (N < 3) {
        std::cout << 0 << std::endl;
        return 0;
    }

    std::vector<long long> dp(N + 1, 0);

    for (int i = 3; i <= N; ++i) {
        long long contribution = 1LL * (i - 2) * (i - 1) / 2 + 1;
        
        dp[i] = dp[i - 2] + contribution;
    }

    std::cout << dp[N] << std::endl;

    return 0;
}

