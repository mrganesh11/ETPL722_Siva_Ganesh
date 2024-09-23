
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.appserver.WOComponent;

public class EmpDetailsPage extends WOComponent {
	EmployeeBean empObj=new EmployeeBean();
	protected NSMutableArray empDetailsList=new NSMutableArray();
	public String itr;
	public String skillitr;
	
    public EmpDetailsPage(WOContext context) {
        super(context);
    }
    public WOComponent addAction()
	{
		System.out.println("Added");
		 
		
		return pageWithName("Main");
	}
}