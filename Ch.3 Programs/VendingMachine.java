
/**
 * Write a description of class VendingMachine here.
 * 
 * @author Nic Mills
 * @version 9/18/2014
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int tokenNum;
    private int inventNum;

    public VendingMachine(int initTokenNum, int initInventNum)
    {
        this.tokenNum = initTokenNum;
        this.inventNum = initInventNum;
    }

    public void proccessPurchase()
    {
        if ((this.tokenNum >= 1)&&(this.tokenNum <= this.inventNum))
        {
            System.out.println(this.tokenNum+" cans of soda have been dispensed.");
            this.inventNum -= this.tokenNum;
            this.tokenNum = 0;
        }
        else 
        {
            System.out.println("Insufficient amount of tokens and/or inventory to purchase soda");
        }
    }

    public void fillUp(int cans)
    {
        this.inventNum += cans;
    }

    public void insertTokens(int tokens)
    {
        this.tokenNum += tokens;
    }

    public int getInventNum()
    {
        return this.inventNum;
    }

    public int getTokenNum()
    {
        return this.tokenNum;
    }

}
