(ns kotoba.capability.identity.verify-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.identity.verify :as capability]
            [kotoba.core.capability-repository :as repository]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest capability/manifest))))
