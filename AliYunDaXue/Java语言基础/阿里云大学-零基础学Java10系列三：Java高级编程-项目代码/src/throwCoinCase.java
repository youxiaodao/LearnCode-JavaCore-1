import java.util.Random;

class Coin
{
    private int front;
    private int back;
    private Random random = new Random();
    
    public void threwCoin(int num)
    {
        for(int x = 0; x < num; x++)
        {
            int temp = random.nextInt(2);
            if(0 == temp)
            {
                this.front ++;
            }
            else
            {
                this.back ++;
            }
        }
    }
    
    public int getFront()
    {
        return this.front;
    }
    
    public int getBack()
    {
        return this.back;
    }
}

public class throwCoinCase
{
    public static void main(String[] args)
    {
        System.out.println("Lesson 62 : 扔硬币：");
        
        Coin coin = new Coin();
        coin.threwCoin(1000);
        System.out.println("正面：" + coin.getFront() + "、背面次数：" + coin.getBack());
    }
}
