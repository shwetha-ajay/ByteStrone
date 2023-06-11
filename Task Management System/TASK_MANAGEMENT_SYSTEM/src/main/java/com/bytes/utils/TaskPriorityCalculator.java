package com.bytes.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Component;

@Component
public class TaskPriorityCalculator {
	    
	    private static final double WEIGHTAGE_DUE_DATE = 0.6;
	    private static final double WEIGHTAGE_PRIORITY = 0.1;
	    private static final double WEIGHTAGE_STATUS = 0.2;
	    
	    public double calculatePriorityScore(Task task) {
	       
	        double normalizedDueDate = calculateNormalizedDueDate(task.getDueDate());
	        double normalizedPriority = task.getPriority() / 10.0;
	        double normalizedStatus = calculateNormalizedStatus(task.getStatus());
	        
	        // Calculate the priority score
	        double priorityScore = (normalizedDueDate * WEIGHTAGE_DUE_DATE) +
	                               (normalizedPriority * WEIGHTAGE_PRIORITY) +
	                               (normalizedStatus * WEIGHTAGE_STATUS);
	        
	        return priorityScore;
	    } 
	    // Define a method to calculate the normalized due date
	    private double calculateNormalizedDueDate(LocalDate dueDate) {
	        LocalDate today = LocalDate.now();
	        long remainingDays = ChronoUnit.DAYS.between(today, dueDate);
	        double totalDays = ChronoUnit.DAYS.between(today, dueDate.plusDays(1)); // Adding 1 to include the due date itself
	        
	        // Normalize the due date within the range of 0 to 1
	        double normalizedDueDate = Math.max(0, Math.min(remainingDays / totalDays, 1));
	        
	        return normalizedDueDate;
	    }
	    // Define a method to calculate the normalized status
	    private double calculateNormalizedStatus(String status) {
	        if (status.equalsIgnoreCase("Completed")) {
	            return 0;
	        } else {
	            return 1;
	        }
	    }

}
