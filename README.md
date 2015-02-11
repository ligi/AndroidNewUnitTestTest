Project to test the new Unit-Testing support coming with 1.1
Generally it is working pretty nice - but there are some open problems with the new build plugin that is needed for this e.g.:

 * https://code.google.com/p/android/issues/detail?id=135513
 * https://code.google.com/p/android/issues/detail?id=140267 ( surfaces in not working spoon: https://github.com/stanfy/spoon-gradle-plugin/issues/37 )
 * https://code.google.com/p/android/issues/detail?id=132394


There is now also initial documentation on this:
 * http://tools.android.com/tech-docs/unit-testing-support


You can also use this in combination with robolectric. You need the changes from https://github.com/robolectric/robolectric-gradle-plugin/pull/129 - they are merged to master, but not released as artifact yet. So you will have to do:

 ```bash
 $> git clone git@github.com:robolectric/robolectric-gradle-plugin.git
 $> cd robolectric-gradle-plugin 
 $> gradle install
 ```

this is used on the branch: with_robolectric
Unfortunately tests will fail with ResourceNotFoundException on the console - but it works in the IDE

Known Problems with Robolectric:
 * resources from library projects cannot be resolved ( android.content.res.Resources$NotFoundException )
