package Arrylist1;


		public class Arrylist{
			private int empid;
			private String ename;
			private double salary;
			public Arrylist() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Arrylist(int empid, String ename, double salary) {
				super();
				this.empid = empid;
				this.ename = ename;
				this.salary = salary;
			}
			public int getEmpid() {
				return empid;
			}
			public void setEmpid(int empid) {
				this.empid = empid;
			}
			public String getEname() {
				return ename;
			}
			public void setEname(String ename) {
				this.ename = ename;
			}
			public double getSalary() {
				return salary;
			}
			public void setSalary(double salary) {
				this.salary = salary;
			}
			@Override
			public String toString() {
				return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
			}
			
			

		}


	}

}
