package com.company;

import java.util.*;

public class RouteFinder<T extends GraphNode> {
    private final Graph<T> graph;
    private final Scorer<T> targetScorer;
    private final Scorer<T> nextNodeScorer;




    public List<T> findRoute(T from, T to) {
        throw new IllegalStateException("No route found");
    }
    Queue<RouteNode> openSet = new PriorityQueue<>();
    Map<T, RouteNode<T>> allNodes = new HashMap<>();



    RouteNode<T> start = new RouteNode<>(from, null, 0d, ManScorer.computeCost(from, to));
openSet.add(start);
allNodes.put(from, start);
while (!openSet.isEmpty()) {



        graph.getConnections(next.getCurrent()).forEach(connection -> {
            RouteNode<T> nextNode = allNodes.getOrDefault(connection, new RouteNode<>(connection));
            allNodes.put(connection, nextNode);

            double newScore = next.getRouteScore() + nextNodeScorer.computeCost(next.getCurrent(), connection);
            if (newScore < nextNode.getRouteScore()) {
                nextNode.setPrevious(next.getCurrent());
                nextNode.setRouteScore(newScore);
                nextNode.setEstimatedScore(newScore + targetScorer.computeCost(connection, to));
                openSet.add(nextNode);
            }
        });




        throw new IllegalStateException("No route found");
    }
    RouteNode<T> next = openSet.poll();
        if (next.getCurrent().equals(to)) {
        List<T> route = new ArrayList<>();
        RouteNode<T> current = next;
        while (current != null);
        do {
            route.add(0, current.getCurrent());
            current = allNodes.get(current.getPrevious());
        }
        return route;
    }
}