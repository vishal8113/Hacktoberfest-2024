#include <iostream>
#include <vector>
#include <queue>
#include <limits>

using namespace std;

struct Node {
    int id;
    int distance;
};

struct CompareNodes {
    bool operator()(const Node& a, const Node& b) {
        return a.distance > b.distance;
    }
};

int shortestPath(std::vector<std::vector<int>>& graph, int start, int end) {
    int n = graph.size();
    std::vector<int> distances(n, INT_MAX);
    distances[start] = 0;

    std::priority_queue<Node, std::vector<Node>, CompareNodes> queue;
    queue.push({start, 0});

    while (!queue.empty()) {
        Node node = queue.top();
        queue.pop();

        for (int i = 0; i < n; ++i) {
            if (graph[node.id][i] != 0 && distances[i] > distances[node.id] + graph[node.id][i]) {
                distances[i] = distances[node.id] + graph[node.id][i];
                queue.push({i, distances[i]});
            }
        }
    }
    return distances[end];
}

int main() {
    std::vector<std::vector<int>> graph = {
        {0, 4, 0, 0, 0, 0, 0, 8, 0},
        {4, 0, 8, 0, 0, 0, 0, 11,
