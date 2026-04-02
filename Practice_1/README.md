## Practice 1: Phone & Sim (Loosely Coupled)
In this initial practice, I focused on moving object creation out of the `Phone` class and into the Spring IoC Container.

- **Classes:** `Phone.java` and `Sim.java`
- **Core Concept:** Instead of `Phone` creating its own `Sim` object using `new Sim()`, Spring instantiates the `Sim` bean and injects it into the `Phone` class via **Field Injection**.
- **Annotations Used:** `@Component` on both classes and `@Autowired` on the Phone.

