# {{ title }}

A tensorflow {{#gorilla-repl?}}notebook{{/gorilla-repl?}}{{^gorilla-repl?}}project{{/gorilla-repl?}} for...

## Getting started

{{#gorilla-repl?}}
```
lein gorilla :port 8999
```

Then navigate to [http://127.0.0.1:8999/worksheet.html?filename=src/{{sanitized}}/core.clj](http://127.0.0.1:8999/worksheet.html?filename=src/{{sanitized}}/core.clj)
{{/gorilla-repl?}}{{^gorilla-repl?}}
```
lein deps
lein repl
```
{{/gorilla-repl?}}
