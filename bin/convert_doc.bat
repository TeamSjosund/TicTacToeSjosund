if not exist docs\html mkdir docs\html

pandoc -f markdown -t html docs/developmentmanual.md > docs/html/developmentmanual.html
pandoc -f markdown -t html docs/administrationmanual.md > docs/html/administrationmanual.html
pandoc -f markdown -t html docs/designreport.md > docs/html/designreport.html