find ./ -name "*.class" -type f -delete
find ./ -name "geany_run_script.sh" -type f -delete
git add . --all
git commit -m "Actualización"
git push origin master
