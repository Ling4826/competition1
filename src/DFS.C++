#include <iostream>
#include <map>
#include <vector>
#include <set>
#include <queue>
using namespace std;


map<string, vector<string>> graph;
set<string> visited;
vector<string> dfsOrder;
vector<string> bfsOrder;


void dfs(const string& node) {
    if (visited.find(node) == visited.end()) {  
        visited.insert(node);                   
        dfsOrder.push_back(node);              

        for (auto neighbor : graph[node]) {    
            dfs(neighbor);
        }
    }
}


void bfs(const string& start) {
    queue<string> q;
    visited.clear();    
    bfsOrder.clear();  

    visited.insert(start);
    q.push(start);

    while (!q.empty()) {
        string node = q.front();
        q.pop();
        bfsOrder.push_back(node);

        for (auto neighbor : graph[node]) {
            if (visited.find(neighbor) == visited.end()) {
                visited.insert(neighbor);
                q.push(neighbor);
            }
        }
    }
}


int main() {

    graph["A"] = {"B", "C"};
    graph["B"] = {"D", "E"};
    graph["C"] = {"F"};
    graph["D"] = {};
    graph["E"] = {};
    graph["F"] = {};

    dfs("A");
    bfs("A");

    cout << "DFS Traversal: ";
    for (auto node : dfsOrder) cout << node << " ";
    cout << endl;

    cout << "BFS Traversal: ";
    for (auto node : bfsOrder) cout << node << " ";
    cout << endl;

    return 0;
}
