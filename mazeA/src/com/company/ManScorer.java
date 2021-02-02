package com.company;

public class ManScorer {

}
public class ManScorer implements Scorer<Cell> {
    @Override
    public double computeCost(Cell from, Cell to) {
        int distance = Math.abs(from.getx()-to.getx()) + Math.abs(from.gety()-to.gety());
    }
}