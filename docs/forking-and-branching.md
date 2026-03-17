# Final Project GitHub Workflow Guide
Java Programming Course

This guide explains how you will use **GitHub for your Final Project**.  
The workflow is based on two key ideas used by professional developers:

• **Forking** – creating your own copy of the project  
• **Branching** – organizing your work safely inside that project  

Following this process ensures that your code is organized, easy to review, and safely versioned.

---

# Project Repository Structure

There are two important repositories involved in this workflow.

**Instructor Repository**
This is the original project repository provided by your instructor.

**Student Fork**
This is your personal copy of that repository that you control.

You will do all of your work inside **your fork**.

---

# Step 1 — Fork the Instructor Repository

1. Go to the instructor’s GitHub repository.
2. Click the **Fork** button in the upper-right corner.
3. Choose **your GitHub account** as the destination.

GitHub will create a copy of the project under your account.

Example:

**Instructor repository**  
```
github.com/Instructor/JavaFinalProject
```

**Your fork**  
```
github.com/YourUsername/JavaFinalProject
```


This is now **your working version of the project**.

---

# Step 2 — Clone Your Fork to Your Computer

Next, download your fork to your development environment.

1. Open your forked repository.
2. Click the **Code** button.
3. Copy the repository URL.

Clone it using Git:

```
git clone https://github.com/YOUR-USERNAME/JavaFinalProject.git
```


This creates a local copy on your computer that you can open in **Eclipse**.

---

# Step 3 — Import the Project into Eclipse

1. Open **Eclipse**
2. Choose:
```File → Import → Existing Projects into Workspace```

3. Select the folder you cloned from GitHub
4. Finish the import

Your project is now ready for development.

---

# Step 4 — Create a Branch for Your Work

Never work directly on the `main` branch.

Instead, create a new branch for each feature or milestone.

Example:
```
git checkout -b week1-core-classes
```

Examples of branch names you may use:
```
week1-core-classes
week2-player-system
week3-combat-system
week4-final-features
bugfix-input-validation
```


Branching allows you to develop safely without breaking the main version of your project.

---

# Step 5 — Make Changes and Commit

As you work on your project:

1. Edit your code
2. Save your files
3. Commit your changes

Example:
```git add .
git commit -m "Implemented Player class with attributes and getters"
```

Good commit messages explain **what you changed and why**.

---

# Step 6 — Push Your Branch to GitHub

Upload your branch to GitHub with:

```
git push origin week1-core-classes
```


Your code is now backed up and visible in your GitHub repository.

---

# Step 7 — Submit Your Weekly Deliverable

Each week you will submit progress on your project.

To do this:

1. Go to your GitHub repository
2. Select your branch
3. Click **Pull Request**
4. Choose:
   
```
Base: main
Compare: your-branch
```


Add a short description explaining what you completed that week.

Example:
```
Week 2 Progress

Implemented Player class
Added inventory system
Basic combat interaction working
```


Submit the Pull Request.

Your instructor can now review your code.

---

# Weekly Development Flow

Your weekly workflow should look like this:

1. Pull the latest changes
2. Create a new branch
3. Work on the assignment
4. Commit your progress
5. Push your branch
6. Create a Pull Request for review

---

# Best Practices

- Follow these habits throughout the project.
- Do not work directly in `main`
- Create one branch per feature or milestone
- Commit frequently as you develop
- Write meaningful commit messages
- Push your work regularly so it is backed up

---

# Why This Workflow Matters

Using forks and branches helps you:
- Track progress over time
- Safely experiment with new ideas
- Recover older versions of your project
- Demonstrate professional development practices
- These are the same workflows used by real software teams.

---

# Final Thought

GitHub is not just where your code lives.

It is a **development history of your project** that shows how your program evolved from the first class file to the finished application.
