The Builder Pattern

The Builder pattern allows us to write readable, understandable code to set up complex objects. 

It is often implemented with a fluent interface, which we may have seen in tools like Apache Camel or Hamcrest. 

The builder will contain all of the fields that exist on the BankAccount class itself. 

We will configure all of the fields that we want on the builder, and then we'll use the builder to create accounts. 

At the same time, we'll remove the public constructor from the BankAccount class and replace it with a private constructor so that accounts can only be created via the builder.

We'll nest the builder static-inner-class within the BankAccount class. 