// Download the twilio-csharp library from twilio.com/docs/csharp/install
using System;
using Twilio;

class Example {
    static void Main (string[] args) {
        // Find your Account Sid and Auth Token at twilio.com/user/account
        const string accountSid = "accountSid";
        const string authToken = "authToken";
        const string serviceSid = "serviceSid";
        const string friendlyName = "friendlyName";
        const string defaultServiceRoleSid = "defaultServiceRoleSid";
        const string defaultChannelRoleSid = "defaultChannelRoleSid";
        const string defaultChannelCreatorRoleSid = "defaultChannelCreatorRoleSid";
        const int typingIndicatorTimeout = 5;
        Dictionary<string, string> webhooksParams;

        // Update a service
        var client = new TwilioIpMessagingClient(accountSid, authToken);
        Service service = client.UpdateService(serviceSid,friendlyName,defaultServiceRoleSid,defaultChannelRoleSid,defaultChannelCreatorRoleSid,typingIndicatorTimeout,webhooksParams);
        Console.WriteLine(service);
    }
}
