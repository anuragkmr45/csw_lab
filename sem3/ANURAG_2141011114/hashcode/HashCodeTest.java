package hashcode;

public class HashCodeTest {
    public int myVar;
    HashCodeTest(int myVar) {
             this.myVar = myVar;
    }
    public boolean equals(Object o) {
        
             if(o instanceof HashCodeTest) {
                 HashCodeTest hTest = (HashCodeTest) o;
                 if (hTest.myVar == this.myVar) {
                    return true;
                } else {
                    return false;
                }			
            }else {
                return false;
            }
    }
    public int hashCode() {
             return (myVar * 23); 
    }
}