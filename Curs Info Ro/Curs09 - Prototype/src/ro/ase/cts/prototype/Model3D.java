package ro.ase.cts.prototype;

import java.util.ArrayList;

public abstract class Model3D implements Cloneable {
	
	protected String id;
	
	protected ArrayList<Object> poligoane;
	protected String tip;

	abstract void draw();
	
	public Model3D(String tip) {
		try {
			System.out.println("Working ....");
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.tip = tip;
	}
	
	public Model3D() {
		
	}

	public String getType() {
		return tip;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public ArrayList<Object> getVertices(){
		return this.poligoane;
	}

	
	//implementare prin shallow-copy
/*	@Override
	public Object clone() {
		Object clone = null;

		try {
			clone = super.clone();

		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}

		return clone;
	}*/
	
	public abstract Object clone();
	

	@Override
	public String toString() {
		return "Model 3D " + this.tip + " cu id " + this.id;
	}
}
