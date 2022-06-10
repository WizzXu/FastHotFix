package com.example.testactivitytask

import android.app.Application
import android.os.Environment
import android.util.Log
import dalvik.system.DexClassLoader
import dalvik.system.PathClassLoader
import java.io.File


/**
 * Author: xuweiyu
 * Date: 2022/3/22
 * Email: wizz.xu@outlook.com
 * Description:
 */
class MyClassLoader(
    val application: Application,
    val path:String,
    parent: ClassLoader
) : PathClassLoader(path,parent) {
//    val dexPath: String = Environment.getExternalStorageDirectory()
//        .toString() + File.separator.toString() + "test_classloader.apk"
//    val dexPath: String = Environment.getExternalStorageDirectory()
//        .toString() + File.separator.toString() + "app-debug.apk"
//    val dexPath: String = application.cacheDir
//        .toString() + File.separator.toString() + "dexlibrary_dex.jar"
//    val loader = PathClassLoader(
//        dexPath,
//        parent
//    )
//
//    //val classMap = mutableMapOf<String, Class<*>>()
//    //var secondClass: Class<*>? = null
//
//    override fun loadClass(name: String?): Class<*> {
//        //Log.e("TAG", "loadclass:" + name)
//        return super.loadClass(name)
//    }
//
//    override fun loadClass(name: String, resolve: Boolean): Class<*> {
//        Log.e("TAG", "loadclass:" + name + ",resolve:" + resolve)
//        var clazz: Class<*>? = null
//        //if (name.startsWith("com.example.testactivitytask.SecondActivity")) {
//            clazz = loadPrivateApk(name)
//        //}
//        if (clazz == null) {
//            clazz = super.loadClass(name, resolve)
////            name?.let {
////                classMap[name] = clazz
////            }
//            return clazz
//        }
//
//        return clazz
//    }
//
//    fun loadPrivateApk(name: String): Class<*>? {
//        if (!name.contains("CommonLibrary")) return null
//
//        try {
//            val clz = loader.loadClass(name)
//            if (clz == null) {
//                Log.e("TAG", "clazz is null")
//
//            } else {
//                Log.d("TAG", "clazz is not null")
//            }
//            return clz
//        } catch (e: Exception) {
//            Log.d("TAG", "error happened", e)
//        }
//        return null
//    }
//
//    override fun findClass(name: String?): Class<*> {
//        Log.e("TAG", "-->findClass:$name")
//        return super.findClass(name)
//    }
}