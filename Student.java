package com.Tinhntt.AssignmentStudent;

public class Student {
    public String id;
    public String name;
    public double score;

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getRank() {
        if (score >= 9.0) {
            return "Excellent";
        } else if (score >= 8.0) {
            return "Very Good";
        } else if (score >= 7.0) {
            return "Good";
        } else if (score >= 5.0) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Score: " + score +
               ", Rank: " + getRank();
    }
}
