Clone me!   
parchment is set up already   
jei is set up already, although note there is no JEI version for 1.19 or 1.19.1, so it is commented out on 1.19 branch

things to change:

Package structure and class names   
Mod ID string in ModMainClass   
Set up resources folder   
resources/META-INF/mods.toml: Set mod ID on line 18, then edit anything you like.   
build.gradle: Replace all occurrences of emptymod with your mod ID   
build.gradle: replace "group" with your package name   
pack.mcmeta   

I store some of my simpler mods in this repo, such as:   
Decompact   
Craft Mobs   
