# Exercise 5
### Logging Libraries

A *logging library* is code that you embed into your application to create and manage log events.
Logging libraries provide APIs for creating, structuring, formatting, and transmitting log events in a consistent way.
Libraries exist for all major programming languages and application frameworks, and most of these support most common log formats and transports.

### Logging Levels

A *logging level* is a way of classifying the entries in your log file in terms of urgency.
The standard ranking of logging levels is as follows: ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL < OFF.

**OFF**

This log level does not log anything. This OFF level is used to turn off logging and is the greatest possible rank.
With this log level, nothing gets logged at all.

**FATAL**

FATAL means that the application is about to stop a serious problem or corruption from happening.
The FATAL level of logging shows that the application’s situation is catastrophic, such that an important function is not working.
For example, you can use FATAL log level if the application is unable to connect to the data store.

**ERROR**

Unlike the FATAL logging level, error does not mean your application is aborting.
Instead, there is just an inability to access a service or a file.
This ERROR shows a failure of something important in your application.
This log level is used when a severe issue is stopping functions within the application from operating efficiently.
Most of the time, the application will continue to run, but eventually, it will need to be addressed.

**WARN**

The WARN log level is used when you have detected an unexpected application problem.
This means you are not quite sure whether the problem will recur or remain.
You may not notice any harm to your application at this point. This issue is usually a situation that stops specific processes from running.
Yet it does not mean that the application has been harmed. In fact, the code should continue to work as usual.


**INFO**

INFO messages are like the normal behavior of applications. They state what happened. For example, if a particular service stopped or started or you added something to the database. These entries are nothing to worry about during usual operations. The information logged using the INFO log is usually informative, and it does not necessarily require you to follow up on it.

**DEBUG**

With DEBUG, you are giving diagnostic information in a detailed manner. It is verbose and has more information than you would need when using the application. DEBUG logging level is used to fetch information needed to diagnose, troubleshoot, or test an application. This ensures a smooth running application.

**TRACE**

The TRACE log level captures all the details about the behavior of the application. It is mostly diagnostic and is more granular and finer than DEBUG log level. This log level is used in situations where you need to see what happened in your application or what happened in the third-party libraries used. You can use the TRACE log level to query parameters in the code or interpret the algorithm’s steps.
ALL

This log level logs any logging levels that are defined. It logs everything and includes custom logging levels as well. It is the combination of all other logging levels.

More infos: https://www.section.io/engineering-education/how-to-choose-levels-of-logging/

### Log4j 2 Configuration
Log4j 2 can be configured in one of the two ways:

* By using the configuration file. By default, Log4j 2 understands configuration written in Java properties files and XML files.
* Programmatically by creating the ConfigurationFactory and Configuration implementations,
or by using the exposed APIs in the Configuration interface or by calling internal Logger methods.
