

```bash
mvn archetype:generate -DgroupId=com.demo.todo -DartifactId=parent-demo-todo-project
```

```bash
cd parent-demo-todo-project
```


```bash
mvn archetype:generate -DgroupId=com.demo.todo.commons -DartifactId=commons
mvn archetype:generate -DgroupId=com.demo.todo.model -DartifactId=model
mvn archetype:generate -DgroupId=com.demo.todo.dto -DartifactId=dto
mvn archetype:generate -DgroupId=com.demo.todo.service -DartifactId=service
mvn archetype:generate -DgroupId=com.demo.todo.repository -DartifactId=repository
mvn archetype:generate -DgroupId=com.demo.todo.controller -DartifactId=controller
mvn archetype:generate -DgroupId=com.demo.todo.client -DartifactId=client
```