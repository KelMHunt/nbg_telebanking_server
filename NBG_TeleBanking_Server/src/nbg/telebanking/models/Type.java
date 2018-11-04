package nbg.telebanking.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nbg_transactions_type")
public class Type implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="type_id", nullable=false, updatable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int typeID;	
	
	@Column(name="name", nullable=false)
	private String typeName;	
	
	public Type()
	{
		this("");
	}
	
	public Type(String typeName) 
	{		
		this.typeName = typeName;
	}
	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "Type [typeID=" + typeID + ", typeName=" + typeName + "]";
	}	
	
}
