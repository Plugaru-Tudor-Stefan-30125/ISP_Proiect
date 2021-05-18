package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author stefan
 */
public class EquipmentController {

    List<Equipment> equipmentList = new ArrayList<Equipment>();
    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
        Boolean isAdded = false;
        
        for (Equipment elements: equipmentList){
            if(elements.getSerialNumber().equals(equipment.getSerialNumber())){
                isAdded = true;
            }
        }
        
        if(!isAdded){
            equipmentList.add(equipment);
        }
        else{
            System.out.println("\nThis equipment is already added\n");
        }
    }
    

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return equipmentList;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        int count = 0;
        
        for (Equipment elements: equipmentList){
            count++;
        }   
        
        return count;
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        Map<String, List<Equipment>> result = new HashMap<String, List<Equipment>>();
        
        for(Equipment e : equipmentList){
            String owner = e.getOwner();
            if(result.containsKey(owner)){
                result.get(owner).add(e);
            }
            else{
                List<Equipment> myList = new ArrayList<Equipment>();
                myList.add(e);
                result.put(owner, myList);
            }
        }
        
        return result;
    }
    

    /**
     * Remove a particular equipment from equipments list by serial number
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        Equipment sought = null;
        
        for (Equipment elements: equipmentList){
            if(elements.getSerialNumber().equals(serialNumber)){
                sought = elements;
            }
        }
        
        if(sought != null){
            equipmentList.remove(sought);
            return sought;
        }
        else{
            return null;
        }
    }
}
