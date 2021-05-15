package aut.utcluj.isp.GUI.Services;

import aut.utcluj.isp.ex4.EquipmentHistoryDetails;
import aut.utcluj.isp.ex4.Operation;

import java.time.LocalDateTime;
import java.util.List;

public interface IEquipmentHistory {
    /**
     * Add new history details
     *
     * @param owner        - owner
     * @param operation    - operation ({@link Operation})
     * @param providedDate - provided date of the operation
     */
    void addEquipmentHistory(final String owner, final Operation operation, final LocalDateTime providedDate);

    /**
     * Return list of equipment history by operation param
     *
     * @param operation - can be {@link Operation#PROVIDE} or {@link Operation#RETURN}
     * @return list of equipment history filtered by operation
     */
    List<EquipmentHistoryDetails> filterEquipmentHistoryByOperation(final Operation operation);

    /**
     * Sort equipment history list by date DESC
     *
     * @return equipment history details sorted DESC by date
     */
    List<EquipmentHistoryDetails> sortEquipmentHistoryByDateDesc();
}
