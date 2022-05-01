package phase1.core.programs;

public class Product {
	int id = 70;
	String name = "Amul";
	void disp(){
		String d = id + name;
		System.out.println("display = " + d);
	}
}

	  public class A extends Product{
		int count = 50;
		String category = "butter";
		void display(){
			System.out.println("count = " + count + "\ncategory = " + category);
			
		}
	}
	   public class B extends Product{
			int count = 90;
			String category = "milk";
			void disp(){
				System.out.println("count = " + count + "\ncategory = " + category);
			}
		}
			class C extends Product{
			int	count = 56;
			String category = "choco";
			void disp1(){
				System.out.println("count = " + count + "\ncategory = " + category);
			}
			}
			
			 class subA extends A{
				int price = 30 ;
				String display;
				 int totalprice;
				void disp2(){
				totalprice = count + (count*price);
				display = id+name+category;
				}
			 }
				 class subB extends B{
					int price = 10;
					String display;
					int totalprice;
					void disp3(){
				       totalprice = count + (count*price);
						String display = id+name+category;
					}
					
				 public static class product{

	public static void main(String[] args){
		
	A a = new A();
	
	
	
	}
				 
	









