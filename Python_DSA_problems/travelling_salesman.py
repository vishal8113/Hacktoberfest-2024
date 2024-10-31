from itertools import permutations

def travelling_salesman_problem(graph, start):
    # Store all vertices except the start vertex
    vertices = list(range(len(graph)))
    vertices.remove(start)
    
    # Store minimum weight Hamiltonian Cycle
    min_path = float('inf')
    next_permutation = permutations(vertices)
    
    for perm in next_permutation:
        current_pathweight = 0
        
        # Compute current path weight
        k = start
        for j in perm:
            current_pathweight += graph[k][j]
            k = j
        current_pathweight += graph[k][start]
        
        # Update minimum
        min_path = min(min_path, current_pathweight)
        
    return min_path

if __name__ == "__main__":
    # User input for the graph
    num_vertices = int(input("Enter the number of vertices: "))
    graph = []
    print("Enter the adjacency matrix row by row:")
    for i in range(num_vertices):
        row = list(map(int, input().split()))
        graph.append(row)
    start_vertex = 0
    print(f"Minimum cost of travelling salesman problem: {travelling_salesman_problem(graph, start_vertex)}")