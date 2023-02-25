package javaapplication5;
public class bai1labb3 {
    public static void main(String[] args) { 
		HinhVuong kqHV = new HinhVuong();
		kqHV.setHV(1);
		kqHV.setCV();
		System.out.println(kqHV.getCV());
		kqHV.setDT();
		System.out.println(kqHV.getDT());
		HinhTron kqHT = new HinhTron();
		kqHT.setHT(1);
		kqHT.setCV();
		System.out.println(kqHT.getCV());
		kqHT.setDT();
		System.out.println(kqHT.getDT());
	}
}

class HinhVuong
{
	private double Canh, CV, DT;
	public void setHV(double Canh)
	{
		this.Canh = Canh;
	}
	public void setCV()
	{
		CV = Canh*4;
	}
	public void setDT()
	{
		DT = Canh*Canh;
	}
	public double getCV()
	{
		return CV;
	}
	public double getDT()
	{
		return DT;
	}
}

class HinhTron
{
	private double BK, CV, DT;
	private final double PI = 3.14;
	public void setHT(double BK)
	{
		this.BK = BK;
	}
	public void setCV()
	{
		CV = 2*PI*BK;
	}
	public void setDT()
	{
		DT = PI*BK*BK;
	}
	public double getCV()
	{
		return CV;
	}
	public double getDT()
	{
		return DT;
	}
}
   
