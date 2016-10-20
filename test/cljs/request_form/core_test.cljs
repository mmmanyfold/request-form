(ns request-form.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [request-form.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
