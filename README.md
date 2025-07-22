🌤️ Java Weather App – JSON API Integration
This is a simple Java console application that fetches current weather information for any city in the world using the wttr.in public REST API. It uses Java's built-in HTTP client and org.json library for JSON parsing.

📋 Features
🌍 Get real-time weather for any location (globally)

📥 Accepts user input (city or country)

🌡️ Displays temperature (°C)

💧 Humidity percentage

☁️ Weather condition (e.g., Cloudy, Sunny)

📦 Simple command-line app using core Java

🛠️ Requirements:
Java 11 or higher

org.json library

Internet connection

📂 Project Structure:

WeatherApp/
│
├── WeatherAppJSON.java       // Main source code
├── json-20210307.jar         // JSON library (place in same folder or set classpath)
└── README.md                 // This file

▶️ How to Run:
1. Compile
javac -cp .;json-20210307.jar WeatherAppJSON.java   # Windows
# OR
javac -cp .:json-20210307.jar WeatherAppJSON.java   # macOS/Linux
2. Run
java -cp .;json-20210307.jar WeatherAppJSON         # Windows
# OR
java -cp .:json-20210307.jar WeatherAppJSON         # macOS/Linux

🧑‍💻 Example Output:
Enter location (city/country): Karjat

📍 Weather in Karjat
-------------------------
🌡️ Temperature : 31°C
☁️ Condition   : Partly cloudy
💧 Humidity    : 63%
🧾 API Reference
wttr.in public API

https://wttr.in/{location}?format=j1

Returns JSON weather data for the given location

🧑‍🎓 Author
Yabez Yalsatty
