Initially we have checked following links and got overview for modular and dynamic app delivery

modularization

modular-and-dynamic-app-delivery-android-app-bundle

feature-module-manifest

Used fallowing sample to understand implementation of dynamic module

on-demand-dynamic-delivery

In this sample following task done-

1- Created a base module and four dynamic modules assets, Java, kotlin and native.
2- Used SplitInstallManager to check dynamic module installation status.
3- If dynamic module has installed opening that modules activity using reflection.
4- If dynamic module has not installed it will installed using SplitInstallManager. We can also uninstall particular module.

Additionally I have researched following things in given example.

1- I have created one class with some methods in both Kotlin and java module and created one more module named shared in which I have implemented java and Kotlin module. I am successful able to create object and able access both java and kotlin modules classes methods in shared module.

We are researching on limitations found following article for this -

dynamic-feature-modules-is-it-worth-the-effort

we found following limitations till now and still researching on this-

1- The dynamic module feature only works with app bundles and are not included if you build an apk.

2- If your dynamic feature modules include activities or services which interact with system components, such as launcher shortcut icons, dynamic shortcuts, or notifications, you may have a hard time customising your app to support these.This is because these system components are unable to access resources like icons from dynamic modules.

3- It is not easy to implement a direct entry point to the dynamic module like a launcher icon. This is because the manifest of the base module and dynamic feature module is merged at build time.

4- Code from dynamic modules is not directly accessible to the base module. This brings in the need of Reflection class.

5- Testing dynamic modules are very difficult since it requires to be deployed on the Play Store.

6- Resources from Dynamic modules can be accessed only via Application level context.

7- Android Studio’s resource shrinker, (shrinkResources=true) is NOT compatible with dynamic modules.

8- if your dynamic feature module size exceeds 10MB, Play Store pops up for a confirmation from the user when the download is initiated. 

9- Dynamic Delivery is only supported on devices running Android 5.0 (API level 21) or higher. If you need to support older devices, you may need to handle module delivery differently for those devices.

 
