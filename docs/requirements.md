# Sprint 1 – Requirements (Share Price Comparison App)

## Quick idea (what the app is)
We are building a Java web application that lets a user search for share prices for a company using its ticker symbol (e.g. AAPL).
The user can choose a date range (up to 2 years), view the prices on a chart, and compare two companies on the same chart.
The app should also save the data locally so it can still show something when there is no internet.

---

## Functional requirements (what the system must do)
1. The system should allow the user to enter a share symbol (ticker) and choose a start date and end date.
2. The system should fetch daily price data for the share symbol for the chosen date range (maximum range is 2 years).
3. The system should store fetched price data locally (so the app can work even when offline).
4. The system should display a graph of daily price over time for one company.
5. The system should allow the user to compare two companies on the same chart for the same date range.
6. The system should allow the user to load previously saved data without downloading it again.
7. The system should show a clear message when the user enters an invalid ticker or invalid date range.

---

## Non-functional requirements (quality + constraints)
1. Offline support: the app should still provide basic functionality when network is unavailable.
2. Persistent storage: data will be saved locally using JSON files so that previously fetched share prices can be reused when offline.
3. Maintainability: the code should be organised into clear layers/components (UI, business logic, data access).
4. Usability: the UI doesn’t need to look fancy, but it should be simple and easy to use.
5. Reliability: the app should handle errors (bad input, no data returned, network failure) without crashing.

---

## Scope (what we are NOT doing)
- We are not building a full trading platform (no buying/selling shares).
- We are not doing real-time/second-by-second prices (only daily prices).
- We are not doing advanced UI design; focus is functionality + architecture.
- We are not supporting more than a 2-year range for a single request.
