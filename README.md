# sendSmsUsing_Twillo_api-SpringBoot
###send sms usng spring boot Twilio API

- 1) at first make a spring boot project with web dependency.
- 2) delete aplication.properties file .
- 3) make a file inside resource called application.yml.
- 4) go to your browser and search twilio and and make a account and follow next step for free trial finally you got a <b>trial number </b>,<b>account sid </b> and <b>" auth token "</b> now...
- 5) above step must verified a phone number cause twilo free trial only send sms one verified number remember it..
- 6) now write some line like this...

    ```java
        twilio:
  account_sid: #your account sid
  auth_token: #your auth token
  trial_number: # your trial number
    ```
-7)follow my whole code after all for testing purposes go to your posman and send request like this....

```json
{	
"phoneNumber":"+88001531921892",
"message":"hi i am GOLAM KIBRIA from post man for check sms send with spring boot"
}
```
### After send your data from postman look the response like this

![image](https://user-images.githubusercontent.com/61331272/86347907-bbc05000-bc80-11ea-9bbe-07dfb0fef477.png)

