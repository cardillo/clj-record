(ns clj-record.test-model.others
  (:require clj-record.boot)
  (:use clj-record.test-model.config))

(clj-record.core/init-model
 :table-name "others"
 :pk-name "otherpk")
