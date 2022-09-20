package edu.java.set03;

public class E {

    private int rand;
    
    public E (int rand) {
        this.rand = rand;
    }

    public int getRand() {
        return rand;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }
    
    @Override
    public String toString() {
      return String.format("%d", rand);
    }
    
    @Override
    public boolean equals(Object obj) {
     if (obj instanceof E) {
         E x = (E) obj;
         return (this.rand != x.rand);
     }
        return false;
    }
    
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Integer.valueOf(rand).hashCode();
    }
}
