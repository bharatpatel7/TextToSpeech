
### For Java Application:

```markdown
# Text-to-Speech Application

Welcome to the Text-to-Speech Application! This Java-based application provides a user-friendly interface for converting text into speech using the FreeTTS library.

## Description

The Text-to-Speech Application empowers users to effortlessly transform text inputs into spoken words. With intuitive features like voice selection, speed rate adjustment, and volume control, users can personalize their speech output according to their preferences.

## Features

- **User-friendly Interface**: Input text effortlessly and customize speech settings with ease.
- **Varied Voices**: Choose from a variety of voices to give your speech a unique personality.
- **Adjustable Speed Rates**: Control the pace of speech with varying speed rates.
- **Customizable Volume Levels**: Adjust the volume level to ensure optimal listening comfort.

## Getting Started

Getting started with the Text-to-Speech Application is simple! Just follow these steps:

1. **Clone the Repository**: Clone this repository to your local machine using the following command:

```bash
git clone https://github.com/your-username/text-to-speech-application.git
```

2. **Open in Your IDE**: Open the project in your preferred Java IDE.

3. **Run the Application**: Run the `TextToSpeech.java` file to launch the application.

4. **Enjoy Speech Output**: Input your desired text, select voice, speed rate, and volume level, and click the "Speak" button to hear the speech output.

## Requirements

To run the Text-to-Speech Application, ensure that you have the following prerequisites installed on your system:

- Java Development Kit (JDK) 8 or higher
- FreeTTS library

## License

This project is licensed under the MIT License. For more information, please refer to the [LICENSE](LICENSE) file.
```

### For API:

```markdown
# Text-to-Speech API

Welcome to the Text-to-Speech API! This RESTful API allows developers to integrate text-to-speech functionality into their applications with ease. Utilizing the FreeTTS library, this API offers endpoints for retrieving available voices, speed rates, volume levels, and performing text-to-speech conversion.

## Description

The Text-to-Speech API simplifies the process of incorporating speech synthesis capabilities into various software projects. With its intuitive HTTP endpoints, developers can seamlessly integrate text-to-speech functionality into their applications, opening up a world of possibilities.

## Endpoints

Explore the following endpoints to leverage the power of the Text-to-Speech API:

- `GET /api/text-to-speech/voices`: Retrieve available voices with varying characteristics.
- `GET /api/text-to-speech/speed-rates`: Retrieve available speed rates for adjusting speech pace.
- `GET /api/text-to-speech/volume-levels`: Retrieve available volume levels for customizing speech volume.
- `POST /api/text-to-speech/speak`: Perform text-to-speech conversion with customizable voice, speed rate, and volume.

## Usage

To use the Text-to-Speech API, simply make HTTP requests to the appropriate endpoints. Here are some examples using cURL:

```bash
# Retrieve available voices
curl http://localhost:8080/api/text-to-speech/voices

# Retrieve available speed rates
curl http://localhost:8080/api/text-to-speech/speed-rates

# Retrieve available volume levels
curl http://localhost:8080/api/text-to-speech/volume-levels

# Perform text-to-speech conversion
curl -X POST -d "message=Hello, world!" -d "voiceType=kevin16" -d "rate=200" -d "volume=5" http://localhost:8080/api/text-to-speech/speak
```

## Getting Started

To get started with the Text-to-Speech API, follow these simple steps:

1. **Clone the Repository**: Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/your-username/text-to-speech-api.git
```

2. **Open in Your IDE**: Open the project in your preferred Java IDE.

3. **Run the Application**: Run the application to start the API server.

4. **Integrate into Your Application**: Use HTTP client tools or integrate the API endpoints into your application to leverage text-to-speech functionality.

## Requirements

Ensure that you have the following prerequisites installed on your system:

- Java Development Kit (JDK) 8 or higher
- FreeTTS library

## License

This project is licensed under the MIT License. For more information, please refer to the [LICENSE](LICENSE) file.
```
