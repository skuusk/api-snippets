<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Your Account Sid and Auth Token from twilio.com/user/account
$sid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"; 
$token = "your_auth_token"; 
$client = new Services_Twilio($sid, $token);

// Loop over the list of recordings and echo a property for each one
foreach ($client->account->recordings->getIterator(0, 50, array(
        "DateCreated<" => "2016-10-15",
    "DateCreated>" => "2016-10-12"
    )) as $recording
) {
    echo $recording->duration;
}