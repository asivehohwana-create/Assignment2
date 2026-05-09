📚 Textbook Management App (Android)

📱 Overview
This is an Android application built using **Java in Android Studio** that allows users to manage a collection of textbooks. The app demonstrates key concepts of **Object-Oriented Programming (OOP)** and multi-activity navigation in Android.

Users can add books, view stored books, and navigate through different screens in a structured way.

---

✨ Features
-  Add new textbook details
-  View list of saved textbooks
-  Multi-screen navigation (Activities)
-  Object-Oriented design (classes for Book, Person, etc.)
-  Centralized book handling using `BookActions`
-  Simple and clean Android UI

---

🛠️ Technologies Used
- Java
- Android Studio
- XML (User Interface design)
- Android SDK
- OOP Principles

---

📂 Project Structure

com.example.textbookapp/
├── MainActivity.java
├── HomeActivity.java
├── AddBookActivity.java
├── ViewBooksActivity.java
├── BookActions.java
├── Textbook.java
├── Person.java


---

## 📱 Application Screens

###  Home Screen
- Acts as the main navigation hub
- Directs users to add or view books

###  Add Book Screen
- Allows users to input textbook information
- Saves data using `BookActions`

### View Books Screen
- Displays all stored textbooks in a list format

---

## Key Concepts Implemented
- Classes and Objects (OOP)
- Encapsulation (Book and Person models)
- Activity-based navigation
- Data validation and storage in memory (ArrayList-based logic)
- Reusable logic through `BookActions`

---

## App Icon
The application uses a custom launcher icon located in:
es/mipmap/ic_launcher


You can replace it using a **512x512 PNG image** via:

Right-click res → New → Image Asset


---

## 🚀 How to Run the Project

1. Open the project in **Android Studio**
2. Allow Gradle to sync
3. Select an emulator or physical device
4. Click **Run ▶️**

---

## ⚠️ Requirements
- Android Studio installed
- Java JDK 8+
- Android SDK configured
- Emulator or Android device

---

## 📌 Future Improvements
- Add delete and update book functionality
- Store data using SQLite or Room Database
- Improve UI with Material Design components
- Add search and filter feature
- Persist data after app restart

---

## 👨‍💻 Author
Developed as part of an Android development learning project.

---

## 📄 License
This project is for educational purposes only.



