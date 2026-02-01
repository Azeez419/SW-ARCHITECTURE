# Sprint 1 – Architecture Overview

## General idea
The application is designed using a simple layered architecture.
Each part of the system has a clear responsibility so that the code is easier to understand, maintain, and extend later.

The system is split into a small number of main components rather than one large block of code.

---

## Main components

### 1. User Interface (UI)
This component is responsible for user interaction.
It allows the user to:
- enter a share ticker symbol
- select a start and end date
- request a comparison between one or two companies
- view the generated price charts

The UI does not contain business logic or data access code.
It only sends user requests to the service layer and displays the results.

---

### 2. Share Price Service (Business Logic)
This component acts as the main control logic of the application.
It is responsible for:
- validating user input (ticker symbols and date ranges)
- deciding whether data should be fetched from an external source or loaded from local storage
- coordinating communication between the UI, data storage, and chart components

Keeping this logic outside the UI helps maintain a clean separation of concerns.

---

### 3. Data Storage Component (JSON)
This component handles persistent storage of share price data.
It:
- saves fetched share prices into local JSON files
- loads previously saved data when the application is offline
- hides file-handling details from other parts of the system

Other components interact with this layer through simple save/load operations without knowing the storage format.

---

### 4. Chart Component
This component is responsible for visualising share price data.
It:
- receives processed price data from the service layer
- generates charts for single-company trends
- supports comparison charts for two companies

Separating chart logic from the UI improves reusability and keeps the UI code simple.

---

## Why this architecture was chosen
This architecture was chosen because:
- responsibilities are clearly separated
- the system is easier to maintain and understand
- components can be changed independently (e.g. replacing JSON with a database later)
- it aligns with basic software architecture and clean design principles taught in the module
