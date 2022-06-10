package com.example.testactivitytask

import android.app.Application
import android.content.Context
import android.util.Log
import java.io.File


/**
 * Author: xuweiyu
 * Date: 2022/3/22
 * Email: wizz.xu@outlook.com
 * Description:
 */
class MyApplication : Application() {
    private val TAG = "TAG"

    override fun onCreate() {
        super.onCreate()

        Log.e("TAG", "MyApplication onCreate")
        var classLoader = classLoader
        if (classLoader != null) {
            Log.i(TAG, "[onCreate] classLoader " + "1" + " : " + classLoader.toString())
            while (classLoader!!.parent != null) {
                classLoader = classLoader.parent
                Log.i(
                    TAG,
                    "[onCreate] classLoader " + "2" + " : " + classLoader.toString()
                )
                while (classLoader!!.parent != null) {
                    classLoader = classLoader.parent
                    Log.i(
                        TAG,
                        "[onCreate] classLoader " + "2" + " : " + classLoader.toString()
                    )
                }
            }
        }

        hookClassLoader()
    }

    private fun hookClassLoader() {
        val classLoader = classLoader
            val dexPath: String = cacheDir
        .toString() + File.separator.toString() +
                    //"dexlibrary_dex.jar"
                    "app-debug.apk"
//        val myClassLoader = MyClassLoader(this,dexPath, classLoader)
//        val mBase: Context = baseContext
//        try {
//            val mBaseClassInfo = ClassInfo(mBase)
//            val loadApk: Any = mBaseClassInfo.getFieldValue("mPackageInfo")
//            val loadApkClassInfo = ClassInfo(loadApk)
//            val classLoaderObj: Any = loadApkClassInfo.getFieldValue("mClassLoader")
//            loadApkClassInfo.setFieldValue("mClassLoader", myClassLoader)
//            Log.i("TAG", "hook成功！")
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }

        DexInstaller.installDex(this,dexPath)
    }

}