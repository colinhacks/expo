/**
 * This code was generated by
 * [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * <p>Do not edit this file as changes may cause incorrect behavior and will be lost once the code
 * is regenerated.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 * @nolint
 */
package abi49_0_0.com.horcrux.rnsvg;

import com.facebook.proguard.annotations.DoNotStrip;
import abi49_0_0.com.facebook.react.bridge.Promise;
import abi49_0_0.com.facebook.react.bridge.ReactApplicationContext;
import abi49_0_0.com.facebook.react.bridge.ReactContextBaseJavaModule;
import abi49_0_0.com.facebook.react.bridge.ReactMethod;
import abi49_0_0.com.facebook.react.bridge.ReadableMap;
import abi49_0_0.com.facebook.react.bridge.WritableMap;

public abstract class NativeSvgRenderableModuleSpec extends ReactContextBaseJavaModule {
  public NativeSvgRenderableModuleSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isPointInFill(Double tag, ReadableMap options);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract boolean isPointInStroke(Double tag, ReadableMap options);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract double getTotalLength(Double tag);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableMap getPointAtLength(Double tag, ReadableMap options);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableMap getBBox(Double tag, ReadableMap options);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableMap getCTM(Double tag);

  @ReactMethod(isBlockingSynchronousMethod = true)
  @DoNotStrip
  public abstract WritableMap getScreenCTM(Double tag);

  @ReactMethod
  @DoNotStrip
  public abstract void getRawResource(String name, Promise promise);
}
