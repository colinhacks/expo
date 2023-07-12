package abi49_0_0.expo.modules.image

import abi49_0_0.com.facebook.yoga.YogaConstants

fun Float.ifYogaUndefinedUse(value: Float) =
  if (YogaConstants.isUndefined(this)) {
    value
  } else {
    this
  }

inline fun Float.ifYogaDefinedUse(transformFun: (current: Float) -> Float) =
  if (YogaConstants.isUndefined(this)) {
    this
  } else {
    transformFun(this)
  }

fun makeYogaUndefinedIfNegative(value: Float) =
  if (!YogaConstants.isUndefined(value) && value < 0) YogaConstants.UNDEFINED else value
