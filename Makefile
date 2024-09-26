
	
   ./gradlew installDebug
    release:
	./gradlew assembleRelease
	apksigner sign --ks 
    ../nikita.jks--out
    clean:
	./gradlew clean
