![image](https://github.com/mbarrerag/Algorithms/assets/101472701/d3f17564-45e4-433f-b752-a9b6c8178941)
Image from Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein - Introduction to Algorithm

# Algorithms Repository

Welcome to my algorithms repository! This repository contains various sorting and graph algorithms implemented in Java.
## Sorting Algorithms

### QuickSort

**Best for General Sorting:**
- QuickSort is often preferred for general-purpose sorting when you don't have specific information about the data distribution.

**Efficiency:**
- Efficient for large datasets due to its in-place nature and low constant factors.

**Average-Case Time Complexity:**
- O(n log n), where n is the number of elements.

### MergeSort

**Stable Sorting:**
- If stability (maintaining the relative order of equal elements) is important, MergeSort is a good choice.

**External Sorting:**
- Suitable for external sorting where data is too large to fit into memory.

**Guaranteed Time Complexity:**
- O(n log n), regardless of the data distribution.

### CountingSort

**Small Range of Integers:**
- CountingSort is highly efficient when sorting a small range of integers (limited range of keys).

**Linear Time Complexity:**
- O(n + k), where n is the number of elements, and k is the range of the input.

**Non-Comparison Sort:**
- CountingSort is a non-comparison sort and can be faster than comparison-based sorts in certain scenarios.

## Graph Algorithms

### Depth-First Search (DFS)

**Traversal Technique:**
- DFS explores as far as possible along each branch before backtracking. It's used for traversing or searching tree or graph data structures.

**Applications:**
- Topological sorting of graphs, connected components, solving mazes, and more.

### Breadth-First Search (BFS)

**Traversal Technique:**
- BFS explores a graph level by level, visiting all neighbors of a node before moving on to the next level. It's useful for finding the shortest path in an unweighted graph.

**Applications:**
- Shortest path problems, network broadcasting, web crawling, and more.

### Dijkstra's Algorithm

**Type:**
- Single-Source Shortest Path Algorithm.

**Efficiency:**
- Efficient for finding the shortest path between two nodes in a graph with non-negative edge weights.

**Algorithm Type:**
- Greedy algorithm.


## Choosing Algorithms Based on Use Cases

1. **Sorting Large Datasets from a Database:**
   - **Algorithm:** MergeSort or QuickSort

2. **Sorting Small Datasets or Already Nearly Sorted Data:**
   - **Algorithm:** Insertion Sort or Bubble Sort

3. **Sorting Non-Integer Data or Custom Objects:**
   - **Algorithm:** MergeSort (for stability) or QuickSort

4. **Searching in a Sorted Dataset:**
   - **Algorithm:** Binary Search

5. **Graph Traversal for Analyzing Relationships:**
   - **Algorithm:** Depth-First Search (DFS) or Breadth-First Search (BFS)

6. **Finding Shortest Paths in Networks:**
   - **Algorithm:** Dijkstra's Algorithm

7. **Handling a Small Range of Integers:**
   - **Algorithm:** Counting Sort

8. **Sorting Arrays In-Place:**
   - **Algorithm:** QuickSort or HeapSort

9. **Sorting Linked Lists:**
   - **Algorithm:** MergeSort

## Usage

Feel free to explore the code for each algorithm in their respective directories. Each directory may contain implementations in different programming languages. You can use these algorithms as a reference or incorporate them into your projects as needed.

## Contributions

Contributions are welcome! If you have additional algorithms, optimizations, or improvements to existing code, feel free to create a pull request.

## License

This repository is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Happy coding!
