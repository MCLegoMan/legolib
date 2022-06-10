# LegoLib

**LegoLib contains code and other resources that can be used for other projects.**
**LegoLib does nothing for the end user by itself.**

**LegoLib (v1.2.0+) adds 3 blank status effects, these are: "Inability", "Upgrading" and "Powered".**

**They could be used for other projects, For example:**
The "Powered" effect could be used in an origins addon that gives you the power when you are using an effect,
and checks for if that effect is being used for stopping other effects from being used.

**LegoLib (v1.2.0+) adds an `EnchantedItem` item type, which gives the standard item type an enchanted glint.**
To use this, add LegoLib to your Project and use `EnchantedItem` instead of `Item` in your Item Registry.

**How to add LegoLib to your Project:**

In your 'build.gradle' file, add the following 'modImplementation', it should look like the following:

`dependencies {
    modImplementation "com.github.MCLegoMan:legolib:${project.legolib_version}"
}`

 

In your 'gradle.properties' file, add the following under your dependencies:

`legolib_version=1.2.0`

 

Reload your gradle, and LegoLib has been added to your project.

**My Socials:**

Discord Server: https://discord.gg/uqC79Ckmfp

Twitter: https://twitter.com/mclegoman

Instagram: https://instagram.com/mclegoman

Twitch: https://twitch.tv/mclegoman

YouTube: https://swivls.xyz/mclegoman