import java.lang.Math;

/**
 * Write a description of class Annuity here.
 * 
 * @author  Nic Mills, Nikhil Sivapatham 
 * @version 9/26/2014
 */
public class Annuity
{
    /** description of instance variable x (add comment for each instance variable) */
    private int PMT;
    private double interest;
    private int paymentNum;

    /**
     * Default constructor for objects of class Annuity
     */
    public Annuity(int initPMT, double initInterest, int initPaymentNum)
    {
        // initialise instance variables
        this.PMT = initPMT;
        this.interest = initInterest;
        this.paymentNum = initPaymentNum;
        
    }

    /**
     * @param     Pass in PMT, interest, paymentNum
     * @return    The Present value of the Annuity
     */
    public double calculate()
    {
        double numerator = ((Math.pow((1+this.interest),(this.paymentNum-1)) - 1)/this.interest);
        double denominator = Math.pow((1+this.interest),(this.paymentNum-1));
        double total = this.PMT*((numerator/denominator)+1);
        return total;
    }

}
