/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrator
 */
public class RootJB 
        implements java.io.Serializable
{

    private boolean hasRealRoot;
    private double X1;
    private double X2;

    /**
     * Get the value of X2
     *
     * @return the value of X2
     */
    public double getX2() {
        return X2;
    }

    /**
     * Set the value of X2
     *
     * @param X2 new value of X2
     */
    public void setX2(double X2) {
        this.X2 = X2;
    }


    public double getX1() {
        return X1;
    }

    public void setX1(double X1) {
        this.X1 = X1;
    }


    /**
     * Get the value of hasRealRoot
     *
     * @return the value of hasRealRoot
     */
    public boolean isHasRealRoot() {
        return hasRealRoot;
    }

    /**
     * Set the value of hasRealRoot
     *
     * @param hasRealRoot new value of hasRealRoot
     */
    public void setHasRealRoot(boolean hasRealRoot) {
        this.hasRealRoot = hasRealRoot;
    }

}
