import java.util.Scanner;

import entities.Worker;
import entities.Department;
import entities.HourContract;
import entities.enums.WorkerLevel;

public class Main {
    public static void showResult(Worker worker, Department department, int year, int month) {
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + department.getName());
        System.out.println("Income for " + month + "/" + year + ": " + worker.getIncome(year, month));

    }

    public static void getMonthAndYearToCalculateIncome(Scanner sc, Worker worker, Department department) {
        System.out.print("Enter year: ");
        var year = sc.nextInt();

        System.out.print("Enter month: ");
        var month = sc.nextInt();

        showResult(worker, department, year, month);
    }

    public static void getContractsData(Scanner sc, Worker worker, Department department) {
        System.out.print("How many contracts? ");
        var numberOfContracts = sc.nextInt();
        var hourContract = new HourContract();

        for (int i = 1; i < numberOfContracts + 1; i++) {
            System.out.println("Entre contract " + "#" + i + " data: ");
            sc.nextLine();

            System.out.print("Date (DD/MM/YYYY): ");
            var date = sc.nextLine();

            System.out.print("Value per hour: ");
            var valuePerHour = sc.nextDouble();

            System.out.print("Duration: ");
            var hours = sc.nextInt();

            hourContract.setDate(date);
            hourContract.setValuePerHour(valuePerHour);
            hourContract.setHours(hours);

            worker.addContract(hourContract);

        }

        getMonthAndYearToCalculateIncome(sc, worker, department);
    }

    public static void getWorkerData(Scanner sc) {

        System.out.print("Department: ");
        var departmentName = sc.nextLine();

        System.out.print("Name: ");
        var workerName = sc.nextLine();

        System.out.print("Level: ");
        var workerLevel = sc.nextLine();
        WorkerLevel selectedWorkerLevel = WorkerLevel.valueOf(workerLevel);

        System.out.print("Base salary: ");
        var baseSalary = sc.nextDouble();

        var department = new Department(departmentName);
        var worker = new Worker(workerName, selectedWorkerLevel, baseSalary, department);

        getContractsData(sc, worker, department);

        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        getWorkerData(sc);
    }
}
