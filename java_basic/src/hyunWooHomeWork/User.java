package hyunWooHomeWork;

public class User {
   
  private String id = "admin",pw = "1234";
  
  public boolean idMcth(String id, String pw) {
    
    if(this.id.equals(id) && this.pw.equals(pw)) {
      return true;
    }else {
      return false;
    }
    
  }
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }
}
