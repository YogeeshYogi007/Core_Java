import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="batchfiles")
@Table(name="batchFiles")
public class Files 
{
  @Id
  @Column(name="id")
  int id;
  
  @Column(name="filename")
  String filename;

public Files() {
	super();
}

public Files(String filename) {
	super();
	this.filename = filename;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFilename() {
	return filename;
}

public void setFilename(String filename) {
	this.filename = filename;
}
  
  
}
