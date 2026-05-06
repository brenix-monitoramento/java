package entities;

import java.util.List;

import entities.enums.WorkerLevel;
import entities.Department;
import entities.HourContract;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public double getIncome(int year, int month) {
        double sum = this.baseSalary;


        for (HourContract contract : this.contracts) {
            if (contract.getDate().getMonthValue() == month && contract.getDate().getYear() == year) {
                sum += contract.calculateTotalValue();
            }

        }
        return sum;
    }
}