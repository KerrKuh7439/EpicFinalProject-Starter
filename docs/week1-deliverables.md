# Week 1 Deliverables
Java EPIC Final Project

Week 1 focuses on **project setup and program structure**.

Your goal this week is to get the starter project running, create the basic menu system, and set up your GitHub workflow.

---

# Week 1 Goals

By the end of Week 1 your program should:

• run successfully from `Main.java`  
• display a working console menu  
• accept user input using `Scanner`  
• create a player object  
• allow the user to choose a game theme  
• exit cleanly

This week is about **structure**, not building the entire game.

---

# Step 1 — Fork the Starter Repository

1. Go to the starter repository provided by your instructor.
2. Click **Fork**.
3. Create a copy of the repository in your GitHub account.

Your repository should look like: ```yourusername/java-epic-final-project```

---

# Step 2 — Clone the Repository

Clone your fork to your computer.

Example:```git clone https://github.com/yourusername/java-epic-final-project```

Open the project in **Eclipse**.

---

# Step 3 — Run the Starter Code

Before making changes, confirm the starter project works.

1. Locate `Main.java`
2. Run the program

You should see a basic console interface start.

If the program does not run, fix this before continuing.

---

# Step 4 — Create the Week 1 Branch

Create a new branch for this week's work.

Branch name:```week1-structure```


Example: ```git checkout -b week1-structure```

All Week 1 work should happen on this branch.

---

# Step 5 — Build the Program Structure

Modify the starter code to implement the basic program structure.

Your program should include:

## Main Menu

Example menu:
```
========== MAIN MENU ==========
1. Create Player
2. Choose Game Theme
3. View Player
4. Start Action
5. Exit
```

The menu should run inside a **loop** until the user exits.

---

## Player Creation

Allow the user to enter a name.

Example: ```Enter player name: ```

Create a `Player` object using the input.

---

## Theme Selection

Allow the user to choose one of the themes:
```
1 Fantasy Dungeon
2 Cyber Hacker
3 Space Explorer
```

Store the selected theme using the `GameMode` enum.

---

## Display Player Info

Add a menu option that displays:
```
Player Name
Player Level
Selected Theme
```

---

# Example Output

Your program should produce something similar to:
```
Welcome to the Java EPIC Final Project

========== MAIN MENU ==========
1 Create Player
2 Choose Game Theme
3 View Player
4 Start Action
5 Exit
```

---

# GitHub Commit Expectations

You should make **multiple commits during the week**.

Minimum commits: ``` 3 commits```


Example commit history:
- Created project structure
- Added Player class functionality
- Implemented main menu loop


Avoid submitting a single commit at the last minute.

---

# Screenshot Requirement

Take a screenshot showing:

• the console program running  
• the main menu displayed  
• your player created  

Save the screenshot in: ```screenshots/```

Example: ```screenshots/week1-menu.png```
---

# Canvas Submission

Submit the following in Canvas:

- Repository Link
- Branch
- Description


---

# Success Checklist

Before submitting, confirm:

- [ ] Starter code runs  
- [ ] Main menu loop works  
- [ ] Player can be created  
- [ ] Theme can be selected  
- [ ] Player information displays correctly  
- [ ] Code compiles without errors  
- [ ] At least 3 commits exist in the branch  
- [ ] Screenshot saved in the repository  

---

# Week 1 Tip

Keep things simple.

A **small program that works correctly** is far better than a complicated program that crashes.

