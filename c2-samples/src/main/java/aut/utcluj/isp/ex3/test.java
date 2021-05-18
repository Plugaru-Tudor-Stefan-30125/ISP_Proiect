
package aut.utcluj.isp.ex3;

import java.util.List;
import java.util.Map;

/**
 *
 * @author KBalazs
 */
public class test {
    
    public static void main(String[] args) {
        Equipment firstEquipment = new Equipment("Dell", "SN123", "John");
        Equipment secondEquipment = new Equipment("HP", "SN124", "John");
        Equipment thirdEquipment = new Equipment("Toshiba", "SN125", "John");
        
        EquipmentController equipmentController = new EquipmentController();
        
        equipmentController.addEquipment(firstEquipment);
        equipmentController.addEquipment(secondEquipment);
        equipmentController.addEquipment(thirdEquipment);
        
        System.out.println("\nThere is "+equipmentController.getNumberOfEquipments()+" equpments.\n");
    
        List<Equipment> equipmentList = equipmentController.getEquipments();
        System.out.println("The first equipment name is "+equipmentList.get(0).getName());
        
        Map<String, List<Equipment>> equipmentsGroupedByOwner = equipmentController.getEquipmentsGroupedByOwner();
        List<Equipment> johnEquipments = equipmentsGroupedByOwner.get("John");
        System.out.println("\nThis equipments are at John:\n");
        for (Equipment elements: johnEquipments){
            System.out.println(elements.getName()+"\n");
        }
        
        System.out.println("After deleting "+equipmentController.removeEquipmentBySerialNumber("SN123").getName()+" there is "+equipmentController.getNumberOfEquipments()+" equipments.");
    
    }
    
}
