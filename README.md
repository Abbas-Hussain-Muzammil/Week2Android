# Week2Android

What I learned!
 - How to switch between images using Glide
 - use of .random() function to randomly pick images
Retrofit Practice 

What is Retrofit?
- In simple words, it is a way of pulling data from the web and presenting it on an Android mobile application.

- Technically, retrofit is an open-source Android app library used to fetch data from web servers and integrate it into Android mobile apps.
- Provides a High-level API for sending and receiving HTTP requests efficiently.

  
- Here are some key features and components of Retrofit:

  - **Declarative API:** Retrofit allows you to define the API requests as Java (or Kotlin) interface methods. You can annotate these methods with various HTTP methods (GET, POST, PUT, DELETE, etc.) and specify the URL endpoint, request parameters, request headers, and response type.

  - **Type-safe:** Retrofit generates the code to handle network requests based on the defined interface. This makes your code type-safe, as you work with Java or Kotlin objects rather than raw HTTP requests and responses.

  - **Serialization and Deserialization:** Retrofit integrates seamlessly with other libraries like Gson or Jackson to convert JSON responses into Java or Kotlin objects and vice versa. This makes parsing data from API responses straightforward.

  - **HTTP Request customization:** You can customize various aspects of your HTTP requests, including adding headers, query parameters, request body, and more.

  - **Asynchronous Execution:** Retrofit supports asynchronous network requests using callbacks, RxJava, or Kotlin's coroutines, allowing you to handle network operations without blocking the main UI thread.

  - **Error Handling:** Retrofit provides mechanisms for handling errors, such as HTTP status codes or network failures, making it easier to implement robust error-handling logic.

  - **Interceptor Support:** You can use interceptors to modify or log requests and responses, which can be helpful for debugging and adding functionality like request logging.

  - **Converter Factories:** Retrofit supports multiple converter factories, allowing you to work with various data formats like JSON, XML, or custom formats.

- To use Retrofit in your Android project, you typically need to add its dependency to your project's **build.gradle**
-  file and configure it with the base URL of the API you want to communicate with. Then, you create an interface that defines your API endpoints and use Retrofit to create an instance of that interface, which you can use to make network requests.
