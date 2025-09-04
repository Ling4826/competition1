#include <iostream>
#include <map>
#include <vector>
#include <set>
#include <queue>
using namespace std;

int main() {
    std::pair<int,float> x;
    std::pair<int,float> y;
    
    x.first = 20;
    x.second = 3.25;

    std::cout << x.first << std::endl;
    std::cout << x.second << std::endl;

    y=x;

    std::cout << y.first << std::endl;
    std::cout << y.second << std::endl;

    return 0;
}
