package sorting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SortingAlgorithms {

    private long executionTime = 0;

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        storeSortedArray(array, "selection_sort");

        return array;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        storeSortedArray(array, "insertion_sort");

        return array;
    }

    private void storeSortedArray(int[] array, String tableName) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name",
                "your_username", "your_password")) {

            String createTableQuery = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "value INT NOT NULL)";

            String insertDataQuery = "INSERT INTO " + tableName + " (value) VALUES (?)";

            try (PreparedStatement createTableStmt = connection.prepareStatement(createTableQuery);
                 PreparedStatement insertDataStmt = connection.prepareStatement(insertDataQuery)) {

                createTableStmt.executeUpdate();

                for (int value : array) {
                    insertDataStmt.setInt(1, value);
                    insertDataStmt.executeUpdate();
                }

                System.out.println("Sorted array stored in table: " + tableName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Other sorting algorithms omitted for brevity

    public static void main(String[] args) {
        int[] array = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] sortedArray = sortingAlgorithms.selectionSort(array);
        //int[] sortedArray = sortingAlgorithms.insertionSort(array);

        System.out.println("Sorted Array:");
        printSortedArray(sortedArray);
    }
}
