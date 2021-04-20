package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
      io.flutter.plugins.firebaseadmob.FirebaseAdMobPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.firebaseadmob.FirebaseAdMobPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin());
      com.nover.flutternativeadmob.FlutterNativeAdmobPlugin.registerWith(shimPluginRegistry.registrarFor("com.nover.flutternativeadmob.FlutterNativeAdmobPlugin"));
  }
}
