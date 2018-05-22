package blog.model;

import java.sql.Blob;

public class Photo{
	private int id;
	private String name;
	private Blob data;

	@Override
	public String toString(){
		return "Photo [id="+id+" ,name=" + name + ", data=" + data + "]";
	}

	public Photo(){
	}

	public Photo(int id,String name,Blob data){
		super();
		this.id = id;
		this.name=name;
		this.data=data;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Blob getBlob(){
		return data;
	}

	public void setBlob(Blob data){
		this.data = data;
	}

}
