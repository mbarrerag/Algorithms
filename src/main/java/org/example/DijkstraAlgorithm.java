package org.example;

import java.util.*;

    class DijkstraAlgorithm {

        static class Graph {
            private final int vertices;
            private final List<List<Node>> adjacencyList;

            public Graph(int vertices) {
                this.vertices = vertices;
                this.adjacencyList = new ArrayList<>(vertices);
                for (int i = 0; i < vertices; i++) {
                    this.adjacencyList.add(new ArrayList<>());
                }
            }

            public void addEdge(int source, int destination, int weight) {
                this.adjacencyList.get(source).add(new Node(destination, weight));
            }

            public int[] dijkstra(int source) {
                int[] distance = new int[vertices];
                Arrays.fill(distance, Integer.MAX_VALUE);

                distance[source] = 0;

                PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
                priorityQueue.add(new Node(source, 0));

                while (!priorityQueue.isEmpty()) {
                    int currentVertex = priorityQueue.poll().vertex;

                    for (Node neighbor : adjacencyList.get(currentVertex)) {
                        int newDistance = distance[currentVertex] + neighbor.weight;

                        if (newDistance < distance[neighbor.vertex]) {
                            distance[neighbor.vertex] = newDistance;
                            priorityQueue.add(new Node(neighbor.vertex, newDistance));
                        }
                    }
                }

                return distance;
            }
        }

        static class Node {
            private final int vertex;
            private final int weight;

            public Node(int vertex, int weight) {
                this.vertex = vertex;
                this.weight = weight;
            }
        }

        public static void main(String[] args) {
            int vertices = 5;
            int source = 0;

            Graph graph = new Graph(vertices);

            graph.addEdge(0, 1, 2);
            graph.addEdge(0, 3, 5);
            graph.addEdge(1, 2, 4);
            graph.addEdge(1, 3, 2);
            graph.addEdge(2, 4, 1);
            graph.addEdge(3, 2, 1);
            graph.addEdge(3, 4, 3);

            int[] shortestDistances = graph.dijkstra(source);

            System.out.println("Shortest distances from source " + source + ":");
            for (int i = 0; i < vertices; i++) {
                System.out.println("To " + i + ": " + shortestDistances[i]);
            }
        }
    }
