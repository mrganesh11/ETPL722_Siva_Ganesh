// Generated by the WOLips Templateengine Plug-in at 17-Sep-2024 11:09:01 am

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WODirectAction;



public class DirectAction extends WODirectAction {
	public DirectAction(WORequest request) {
		super(request);
	}

	public WOActionResults defaultAction() {
		return pageWithName(Main.class.getName());
	}
}
