# serenity-browserstack-appium



![Serenity BDD](https://github.com/serenity-bdd/serenity-core/raw/master/docs/serenity-bdd-logo.png?h=100)


![BrowserStack Logo](https://d98b8t1nnulk5.cloudfront.net/production/images/layout/logo-header.png)

![Appium](https://i0.wp.com/learn-automation.com/wp-content/uploads/2015/12/Appium.png?h=100) 

[Serenity](http://www.thucydides.info/docs/serenity/) Integration with BrowserStack and Appium.

## Setup
* Clone the repo
* Install dependencies `mvn install`
* You can setup environment variables for all sample repos (see Notes) or update `serenity.properties` file with your [BrowserStack Username and Access Key](https://www.browserstack.com/accounts/settings)
* Upload your App and Select a device for testing : pls view home page docs https://app-automate.browserstack.com/dashboard/v2/getting-started 
* download APK https://androidapksfree.com/wordpress/org-wordpress-android/
## Running your tests
- To run a single test, run `mvn verify -P single`
- To run local tests, run `mvn verify -P local`
- To run parallel tests, run `mvn verify -P parallel`

 Understand how many parallel sessions you need by using our [Parallel Test Calculator](https://www.browserstack.com/automate/parallel-calculator?ref=github)

## Notes
* You can view your test results on the [BrowserStack Automate dashboard](https://www.browserstack.com/automate)
* To test on a different set of browsers, check out our [platform configurator](https://www.browserstack.com/automate/java#setting-os-and-browser)
* You can export the environment variables for the Username and Access Key of your BrowserStack account
  
  ```
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
  ```
  
## Additional Resources
* [Documentation for writing Automate test scripts in Java](https://www.browserstack.com/automate/java)
* [Customizing your tests on BrowserStack](https://www.browserstack.com/automate/capabilities)
* [Browsers & mobile devices for selenium testing on BrowserStack](https://www.browserstack.com/list-of-browsers-and-platforms?product=automate)
* [Using REST API to access information about your tests via the command-line interface](https://www.browserstack.com/automate/rest-api)
