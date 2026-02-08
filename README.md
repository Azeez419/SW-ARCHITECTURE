# SW-ARCHITECTURE

# Sprint 2 – Share Price Application

## Overview
Sprint 2 focuses on implementing the architecture designed in Sprint 1.  
The goal was to create a clear layered structure and connect the components together so the application runs correctly.

---

## Architecture
The application follows a simple layered architecture:

- **Client layer**
- **Service layer**
- **Repository layer**

Each layer has a single responsibility and communicates through the service layer.

---

## Layers

### Client Layer – `MarketDataClient`
Handles communication with an external market data source.  
In this sprint, it returns mock data to simulate an API call.

---

### Service Layer – `SharePriceService`
Contains the main business logic of the application.  
It connects the client and repository layers and decides how share price data is retrieved.

Dependencies are injected through the constructor.

---

### Repository Layer – `JsonPriceRepository`
Responsible for local data storage.  
The structure is prepared for saving and loading share price data using JSON.

---

## Main Application
`Main.java` creates the required objects and injects them into the service.  
The application runs successfully and confirms the architecture is working.

---

## Status
- Layered architecture implemented
- Code compiles and runs
- Ready for further development in Sprint 3
