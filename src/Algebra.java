public class Algebra
{
public	Double term1(double Y1,double Y2,double Y3)
	{
		double X=(Y3-Y2)/Y1;
		return X;
	}
	public	Double term2(double Y1,double Y2,double Y3)
	{
		double X=(Y3-Y1)/Y2;
		return X;
	}

	public	Double term3(double Y1,double Y2,double Y3)
	{
		double X=(Y3+Y2)/Y1;
		return X;
	}


	public	Double term4(double Y1,double Y2,double Y3)
	{
		double X=(Y3-Y1)/(-Y2);
		return X;
	}
}
