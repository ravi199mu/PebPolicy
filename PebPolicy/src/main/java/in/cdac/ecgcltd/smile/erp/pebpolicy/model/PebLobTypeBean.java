package in.cdac.ecgcltd.smile.erp.pebpolicy.model;

public class PebLobTypeBean {

	private int id;
	private String name;

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

	@Override
	public String toString() {
		return "PebLobTypeBean [id=" + id + ", name=" + name + "]";
	}

}
