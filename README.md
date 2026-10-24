# SMM Post Scheduler

This project shows the Strategy pattern in a simple social media scheduling example.

There are three ways to schedule a post:

- Publish it now.
- Publish it at a fixed time.
- Publish it during the next audience activity window.

The strategy can be changed while the program is running. `PostScheduler` uses the selected strategy to choose a time.

## Run

You need Java 17 or newer.

```sh
javac -d out $(find src/main/java -name '*.java')
java -cp out com.example.smm.Main
```

## Clean Code

- Each strategy has a clear name.
- Each strategy does one job.
- The scheduler uses an interface, so it does not depend on specific strategies.
- The scheduler has no `if` or `switch` to choose a strategy.
- A new strategy can be added without changing the scheduler.
