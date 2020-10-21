package uk.ac.uos.s201951.i2p;

import java.lang.Math;
import java.util.*;

public class W3Homework {

	static void integerManipulation() {
		// Task 1:
		
		int[] integers = {17, 89, 27, 11, 91, 42, 73, 90, 5, 56};
		int maxValue = integers[0];
		int minValue = integers[0];
		int total = 0;
		int squareTotal = 0;
		int mean;
		
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] > maxValue) {
				maxValue = integers[i];
			} if (integers[i] < minValue) {
				minValue = integers[i];
			}
			
			total = total + integers[i];
		}
		
		mean = total / integers.length;
		
		System.out.println("Max value: " + maxValue);
		System.out.println("Min value: " + minValue);
		System.out.println("Range: " + (maxValue - minValue));
		System.out.println("Mean: " + mean);
		
		int square;
		
		for (int i = 0; i < integers.length; i++) {
			
			square = integers[i] - mean;
			square = square * square;
			
			squareTotal = squareTotal + square;
		}
		
		System.out.println("Standard Deviation: " + Math.sqrt(squareTotal / integers.length));
	}
	
	static void diceSum() {
		int[] diceOutcomes = new int[36];
		ArrayList<Integer> distinctOutcomes = new ArrayList<Integer>();
		int currIndex = 0;
		
		for (int d1 = 1; d1 <= 6; d1++) {
			for (int d2 = 1; d2 <= 6; d2++) {
				diceOutcomes[currIndex] = d1 + d2;
				currIndex++;
			}
		}
		
		for (int i: diceOutcomes) {
			if (distinctOutcomes.contains(i)) {
				continue;
			}
			
			distinctOutcomes.add(i);
		}
		
		System.out.println("Outcomes: " + Arrays.toString(diceOutcomes));
		System.out.println("Distinct Outcomes: " + distinctOutcomes);
	}
	
	static void fibonacciSequence() {
		int[] fibSeq = new int[20];
		int prevValue = 0;
		int currValue = 1;
		
		for (int i = 0; i < fibSeq.length; i++) {
			currValue = currValue + prevValue;
			fibSeq[i] = currValue;
			if (i > 0) {
				prevValue = fibSeq[i-1];
			}
		}
		
		System.out.println("Fibonacci sequence: " + Arrays.toString(fibSeq));
	}
	
	static void matrixTranspose() {
		int[][] multiMatrix = {{1, 2, 3}, {4, 5, 6}};
		int[][] transpose = new int[3][2];
		
		for (int x = 0; x < multiMatrix[0].length; x++) {
			for (int y = 0; y < multiMatrix[1].length; y++) {
				if (x == y) {
					transpose[x][0] = multiMatrix[0][x];
					transpose[y][1] = multiMatrix[1][y];
				}
			}
		}
		
		System.out.println("Transpose: " + Arrays.deepToString(transpose));
		
	}
	
	static void matrixMult() {
		int[][] matrixA = {
				{2, 3, 4},
				{1, 0, 1},
				{4, 3, 2}
			};
		int[][] matrixB = {
				{5, 3, 5},
				{1, 0, 1},
				{3, 2, 3}
			};
		int[][] result = new int[3][3];
		
	    for (int r = 0; r < matrixA.length; r++) {
		    for (int sr = 0; sr < matrixB.length; sr++) {
		    	int rowTotal = 0;
			    for (int c = 0; c < matrixB[sr].length; c++) {
			    	rowTotal = rowTotal + matrixA[r][c] * matrixB[c][sr];
			    }
			    result[r][sr] = rowTotal;
		    }
	    } 
	 
		System.out.println("Result: " + Arrays.deepToString(result));
		
	}
	
	public static void main(String[] args) {
		
		integerManipulation();
		diceSum();
		fibonacciSequence();
		matrixTranspose();
		matrixMult();
		
	}

}
