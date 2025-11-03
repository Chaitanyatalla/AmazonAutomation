# Amazon Automation Testing using Selenium WebDriver

## Project Overview
This project automates an **end-to-end Amazon shopping flow** using **Selenium WebDriver with Java**.  
It simulates a real user's actions on the **Amazon India website**, including logging in, searching for a product, selecting it, and moving to the payment section.

The goal of this project is to show practical **web automation testing** skills using Selenium. It covers browser interactions, synchronization, window handling, and Java-based test scripting.

---

## Key Features
- Launches and controls the **Chrome browser** using Selenium WebDriver  
- Automates **user login** with credentials  
- Performs a **product search** (e.g., “iPhone X”)  
- Selects an item from search results  
- Handles **multiple browser tabs/windows**  
- Uses **Explicit Waits (WebDriverWait)** for stable synchronization  
- Scrolls pages using **JavaScriptExecutor**  
- Simulates checkout with the **UPI payment option**  
- Closes the browser automatically after the test finishes  

---

## Technologies Used
| Component | Description |
|------------|-------------|
| **Language** | Java |
| **Automation Framework** | Selenium WebDriver |
| **Build Tool** | Maven *(optional)* |
| **Browser** | Google Chrome |
| **IDE** | Eclipse |
| **Testing Type** | Functional / UI Automation |

---

## Project Structure
AmazonAutomation/
├── src/
│ └── Automation/
│ └── AmazonTest.java
├── pom.xml # (if Maven project)
├── README.md # Project documentation
└── lib/ # (if normal Java project with JARs)

** Code Explanation
The script automates the following workflow:
Launches Amazon.in in Chrome.
Clicks on Login and enters credentials.
Searches for iPhone X.
Selects a charger product from search results.
Switches to the product detail window.
Clicks Buy Now.
Chooses UPI Payment option.
Enters UPI ID and verifies it.
Clicks Continue to complete the checkout simulation.

