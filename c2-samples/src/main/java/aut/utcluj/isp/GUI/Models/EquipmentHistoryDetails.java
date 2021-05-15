package aut.utcluj.isp.GUI.Models;

import aut.utcluj.isp.ex4.Operation;

import java.time.LocalDateTime;

public class EquipmentHistoryDetails {
    private String owner;
    private aut.utcluj.isp.ex4.Operation operation;
    private LocalDateTime date;

    public EquipmentHistoryDetails(String owner, aut.utcluj.isp.ex4.Operation operation, LocalDateTime date) {
        this.owner = owner;
        this.operation = operation;
        this.date = date;
    }

    public String getOwner() {
        return owner;
    }

    public Operation getOperation() {
        return operation;
    }

    public LocalDateTime getDate() {
        return date;
    }
}