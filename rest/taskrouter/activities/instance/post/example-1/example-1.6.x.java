// Install the Java helper library from twilio.com/docs/java/install
import java.util.HashMap;
import java.util.Map;

import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.TwilioTaskRouterClient;
import com.twilio.sdk.resource.instance.taskrouter.Activity;
import com.twilio.sdk.resource.instance.taskrouter.Workspace;

public class Example { 

  // Find your Account Sid and Token at twilio.com/user/account
  private static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  private static final String AUTH_TOKEN = "your_auth_token";
  private static final String WORKSPACE_SID = "WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  private static final String ACTIVITY_SID = "WAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

  public static void main(String[] args) throws TwilioRestException {
    TwilioTaskRouterClient client = new TwilioTaskRouterClient(ACCOUNT_SID, AUTH_TOKEN);

    Activity activity = client.getActivity(WORKSPACE_SID, ACTIVITY_SID);
    Map<String, String> params = new HashMap<String, String>();
    params.put("FriendlyName", "NewAvailableFriendlyName");
    activity.update(params);

    //alternatively
    Workspace workspace = client.getWorkspace(WORKSPACE_SID);
    activity = workspace.getActivity(ACTIVITY_SID);
    activity.update(params);
  }
}