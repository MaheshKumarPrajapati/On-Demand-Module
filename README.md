<h1 >Dynamic app delivery: On Demand Module </h1>

Initially we have checked following links and got overview for modular and dynamic app delivery<br/>

<a href = "https://developer.android.com/topic/modularization">modularization</a><br/>
<a href = "https://proandroiddev.com/modular-and-dynamic-app-delivery-android-app-bundle-9bbfac814787">modular-and-dynamic-app-delivery-android-app-bundle</a><br/>
<a href = "https://developer.android.com/guide/playcore/feature-delivery#feature-module-manifest">feature-module-manifest</a><br/>

Used fallowing sample to understand implementation of dynamic module<br/>

<a href = "https://developer.android.com/codelabs/on-demand-dynamic-delivery#10">on-demand-dynamic-delivery</a><br/>

In this sample following task done-<br/>

1- Created a base module and four dynamic modules assets, Java, kotlin and native.<br/>
 2- Used <a href = "https://developer.android.com/reference/com/google/android/play/core/splitinstall/SplitInstallManager">SplitInstallManager</a> to check dynamic module installation status.<br/>
 3- If dynamic module has installed opening that modules activity using reflection.<br/>
 4- If dynamic module has not installed it will installed using SplitInstallManager. We can also uninstall particular module.<br/>

Additionally I have researched following things in given example.

1. I have created one class with some methods in both Kotlin and java module and created one more module named shared in which I have implemented java and Kotlin module. I am successful able to create object and able access both java and kotlin modules classes methods in shared module.

We are researching on limitations found following article for this -

<a href = "https://medium.com/bobble-engineering/dynamic-feature-modules-is-it-worth-the-effort-b9fe9af177fc#:~:text=But%2C%20when%20a%20dynamic%20module,NOT%20ACCESSIBLE%20to%20the%20system">dynamic-feature-modules-is-it-worth-the-effort</a>

we found following limitations till now and still researching on this-

1- The dynamic module feature only works with app bundles and are not included if you build an apk.<br/>
2-  If your dynamic feature modules include activities or services which interact with system components, such as launcher shortcut icons, dynamic shortcuts, or notifications, you may have a hard time customising your app to support these.This is because these system components are unable to access resources like icons from dynamic modules.<br/>
3-  It is not easy to implement a direct entry point to the dynamic module like a launcher icon. This is because the manifest of the base module and dynamic feature module is merged at build time.<br/>
4- Code from dynamic modules is not directly accessible to the base module. This brings in the need of Reflection class.<br/>
5- Testing dynamic modules are very difficult since it requires to be deployed on the Play Store.<br/>
6- Resources from Dynamic modules can be accessed only via Application level context.<br/>
7- Android Studio’s resource shrinker, (shrinkResources=true) is NOT compatible with dynamic modules.<br/>
8- if your dynamic feature module size exceeds 10MB, Play Store pops up for a confirmation from the user when the download is initiated. <br/>
9-  Dynamic Delivery is only supported on devices running Android 5.0 (API level 21) or higher. If you need to support older devices, you may need to handle module delivery differently for those devices.<br/>
