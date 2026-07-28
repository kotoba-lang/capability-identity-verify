# capability-identity-verify

Atomic authority package for `identity/verify`.

- imports: `#{:verify}`
- effects: `#{:crypto}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
