(ns request-form.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [request-form.core-test]))

(doo-tests 'request-form.core-test)
