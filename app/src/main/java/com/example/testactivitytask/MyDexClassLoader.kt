package com.example.testactivitytask

import android.util.Log
import dalvik.system.DexClassLoader

/**
 * Author: xuweiyu
 * Date: 2022/4/8
 * Email: wizz.xu@outlook.com
 * Description:
 */
class MyDexClassLoader(
    dexPath: String?,
    optimizedDirectory: String?,
    librarySearchPath: String?,
    parent: ClassLoader?
) : DexClassLoader(dexPath, optimizedDirectory, librarySearchPath, null) {
    override fun loadClass(name: String): Class<*>? {
        Log.e("MyDexClassLoader", "loadclass:" + name)

        if (name.startsWith("com.example.testactivitytask.SecondActivity")) {
            Log.e("MyDexClassLoader", "super loadclass:" + name)
            val cl = super.loadClass(name)
            return cl
        } else {
            Log.e("MyDexClassLoader", "parent loadclass:" + name)

            return null//parent.loadClass(name)
        }
        //return super.loadClass(name)
    }
}