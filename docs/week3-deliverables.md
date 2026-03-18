# Week 3 Deliverables
Java EPIC Final Project

Week 3 introduces **inheritance and polymorphism**, two of the most important concepts in object-oriented programming.

Instead of creating unrelated classes, you will now extend your system using a **class hierarchy**.

---

# Week 3 Goals

By the end of Week 3 your program should:

• implement a **parent class for characters**  
• create **multiple subclasses** that extend the parent class  
• override methods in the subclasses  
• demonstrate **polymorphism** using parent references  
• store subclass objects inside an `ArrayList<Character>`

Your system should now resemble a **real object-oriented design**.

---

# GitHub Workflow

Create a new branch for Week 3. ```week3-collections```

Example: ```git checkout -b week3-collections```


All Week 3 development should occur on this branch.

Commit your progress regularly throughout the week.

---

# Program Requirements

Your project should now implement **inheritance**.

Required features:

- Create a **Character parent class**
- Create **at least two subclasses** that extend `Character`
- Override a method in each subclass
- Store subclass objects using a parent class reference
- Demonstrate polymorphism when displaying objects

Example collection:

```java
ArrayList<Character> party = new ArrayList<>();
```

# Example Class Structure

Your class hierarchy may look like this:
```
Character
 ├ Warrior
 ├ Hacker
 └ Explorer
```

Each subclass should have **its own behavior**.

Examples:
```
Warrior → specialAttack()
Hacker → hackSystem()
Explorer → findArtifact()
```

# Example Polymorphism

Your program should store subclasses in a **single collection**.

Example:
```java
Character c1 = new Warrior("Aragorn");
Character c2 = new Hacker("Neo");

party.add(c1);
party.add(c2);

When calling a shared method, the correct subclass behavior should run.

for (Character c : party) {
    c.performAction();
}
```

This demonstrates **polymorphism**.

---

# Example Menu Expansion

Your menu may now include options like:
```
========== MAIN MENU ==========
1 Create Player
2 Choose Theme
3 Add Character
4 View Characters
5 Perform Character Action
6 Exit
```

Each character type should behave differently when actions are performed.

---

# Screenshot Requirement

Take a screenshot showing:

- the program running
- multiple character types created
- subclass behavior executing

Save the screenshot in the repository: ```screenshots/week3-progress.png```

---

# Canvas Submission

Submit the following in Canvas:

- Repository ```https://github.com/yourusername/java-epic-final-project```
- Branch ```week3-collections```
- Program running with multiple character types.
- Description

---

# Commit Expectations

Your repository should show consistent development progress.

Minimum commits: ```3 commits```

Avoid committing everything at the last minute.

GitHub should reflect your development process.

---

# Week 3 Success Checklist

Before submitting, confirm:

- [ ] Week 3 branch created
- [ ] Parent class implemented
- [ ] At least two subclasses created
- [ ] Methods overridden in subclasses
- [ ] Subclasses stored in ArrayList<Character>
- [ ] Program demonstrates polymorphism
- [ ] Screenshot saved in repository
- [ ] At least 3 commits made
- [ ] Program compiles and runs

# Week 3 Tip

Focus on **extending your existing system**, not rewriting it.

Good software grows by **building on previous work**, not replacing it.
