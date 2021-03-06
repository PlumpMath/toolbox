(defproject count-files "0.1.1"
  :description "Count files in a directory tree, grouped by their extension"
  :url "https://github.com/olange/toolbox/tree/master/count-files"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [
    [org.clojure/clojure "1.5.1"]
    [org.clojure/tools.cli "0.2.2"]
    [me.raynes/fs "1.4.5"]]

  :main count-files.core

  :profiles {
  	:dev {
      :plugins [[lein-marginalia "0.7.1"]]
      :aliases {"docs" ^{:doc "Generates Marginalia documentation files"} ["do" "marg" "--dir" "doc"]}
    }
  })
