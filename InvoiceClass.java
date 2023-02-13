
package M2Lab;

/**
 *
 * @author hannaan
 */
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String partNumber, String partDescription, int quantity) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = (quantity > 0); 
    }
    
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    
    public String getPartNumber() {
        return partNumber;
    }
    
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    
    public String getPartDescription() {
        return partDescription;
    }
    
     public void setQuantity(int quantity) {
        this.quantity > 0;
    }
    
       public int getQuantity() {
        return quantity;
    }
       
   // I'm having issues somewhere, I believe I might be missing something
     
}
