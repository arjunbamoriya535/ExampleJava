package demo;

public class HedgehogProblemSolver {

private int rowCount;
private int columnCount;
private int[][] fieldArray;
private int maxApplesCount = 0;

public HedgehogProblemSolver(int inputArray[][]) {
    this.fieldArray = inputArray;
    rowCount = inputArray.length;
    columnCount = inputArray[0].length;
}

public int solveProblem() {
    findPathRecursive(0, 0, "", 0);
    System.out.println("Max apple count: " + maxApplesCount);
    return maxApplesCount;
}

private void findPathRecursive(int row, int column, String path, int applesCount) {
    if (row == rowCount - 1) {
        //last row
        for (int i = column; i < columnCount; i++) {
            //just go right until last column
            path += "-[" + fieldArray[row][i]  + "](" + row + ", " + i + ")";
            applesCount += fieldArray[row][i];
        }
        pathResult(path, applesCount);
        return;
    }
    if (column == columnCount - 1) {
        //last column
        for (int i = row; i <= rowCount - 1; i++) {
            //just go down until last row
            path += "-[" + fieldArray[i][column] + "](" + i + ", " + column + ")";
            applesCount += fieldArray[i][column];
        }
        pathResult(path, applesCount);
        return;
    }

    path = path + "-[" + fieldArray[row][column] + "](" + row + ", " + column + ")";
    applesCount += fieldArray[row][column];

    //go down
    findPathRecursive(row + 1, column, path, applesCount);
    //go right
    findPathRecursive(row, column + 1, path, applesCount);
}

private void pathResult(String path, int applesCount) {
    System.out.println("Path: " + path + "; apples: " + applesCount);
    if (applesCount > maxApplesCount) {
        maxApplesCount = applesCount;
    }
}

}
