import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {
    ActionContext ctx= ActionContext.getContext();
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception{
        if(username.equals("wym")&&password.equals("642688028")) {
            ctx.getSession().put("user",username);
            return "success";
        }
        else
            return "fail";
    }
}
