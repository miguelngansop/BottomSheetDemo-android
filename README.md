# BottomSheetDemo - Android Application

## Overview
BottomSheetDemo is an Android application that demonstrates how to use a bottom sheet dialog to display a list of cards in a RecyclerView. The application has a button that, when clicked, opens a bottom sheet dialog with a list of 100 fruits presented as cards. The bottom sheet also contains two buttons at the bottom, which can be configured to perform specific actions.

## Setting Up the Project
To run this application on your development environment, follow these steps:

1. **Clone the Repository**:
   Clone the project from your source or download the necessary files.

   ```bash
   git clone <repository_link>
2. **Open the Project in Android Studio**:
  - Launch Android Studio.
  - Select "Open" or "Open an existing project".
  - Navigate to the folder where you cloned the project.
  - Choose the root folder to open in Android Studio.
  - Sync Dependencies:
  - Ensure the project is synced with Gradle.
  - Click on "Sync Now" if prompted to sync.
  - If needed, update the dependencies (see build.gradle).
  - Run the Application:
  - Connect a physical Android device or start an emulator.
  - Click "Run" (triangle icon) or press Shift+F10 to execute the application.
  - 
## Application Features
1. **Open Bottom Sheet Button**:
  - The main page has a button labeled "Open Bottom Sheet".
  - Clicking this button opens a bottom sheet dialog from the bottom of the screen.
2. **Bottom Sheet with RecyclerView**:
  - The bottom sheet contains a list of 100 fruits presented as cards.
  - The list can scroll vertically to accommodate all items.
3. **Two Buttons at the Bottom of the Sheet**:
  - The bottom sheet has two buttons at the bottom.
  - These buttons can be configured to perform specific actions, such as displaying a message or closing the sheet.

## Notes and Considerations
1 **SDK Compatibility**:
  - Ensure your Android SDK is up-to-date and that the project targets an appropriate version.
  - The recommended minimum SDK version is 21 (Android 5.0, Lollipop).
2. **Dependencies**:
  - The application uses RecyclerView and CardView to display the list of fruit cards in the bottom sheet dialog.
  - The build.gradle file contains all necessary dependencies.
3. **Customization**:
    - You can customize the actions of the buttons at the bottom by modifying the code in FruitBottomSheetDialog.java.
    - To add more functionality, you can change the content of the cards in the RecyclerView.
