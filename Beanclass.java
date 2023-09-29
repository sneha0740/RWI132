package com.railworld;

public class Beanclass {


		  private int id;
		  private String name;
		  private String desgn;
		public Beanclass() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Beanclass(int id, String name, String desgn) {
			super();
			this.id = id;
			this.name = name;
			this.desgn = desgn;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesgn() {
			return desgn;
		}
		public void setDesgn(String desgn) {
			this.desgn = desgn;
		}
		@Override
		public String toString() {
			return "BeanClass [id=" + id + ", name=" + name + ", desgn=" + desgn + "]";
		}
		  

		}


	}

}
