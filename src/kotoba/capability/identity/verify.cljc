(ns kotoba.capability.identity.verify
  "Importable contract for identity/verify."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "identity/verify"))
