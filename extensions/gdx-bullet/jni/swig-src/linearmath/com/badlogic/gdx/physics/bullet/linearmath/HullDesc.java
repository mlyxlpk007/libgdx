/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class HullDesc extends BulletBase {
	private long swigCPtr;
	
	protected HullDesc(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new HullDesc, normally you should not need this constructor it's intended for low-level usage. */ 
	public HullDesc(long cPtr, boolean cMemoryOwn) {
		this("HullDesc", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(HullDesc obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				LinearMathJNI.delete_HullDesc(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public HullDesc() {
    this(LinearMathJNI.new_HullDesc__SWIG_0(), true);
  }

  public HullDesc(int flag, long vcount, btVector3 vertices, long stride) {
    this(LinearMathJNI.new_HullDesc__SWIG_1(flag, vcount, btVector3.getCPtr(vertices), vertices, stride), true);
  }

  public HullDesc(int flag, long vcount, btVector3 vertices) {
    this(LinearMathJNI.new_HullDesc__SWIG_2(flag, vcount, btVector3.getCPtr(vertices), vertices), true);
  }

  public boolean HasHullFlag(int flag) {
    return LinearMathJNI.HullDesc_HasHullFlag(swigCPtr, this, flag);
  }

  public void SetHullFlag(int flag) {
    LinearMathJNI.HullDesc_SetHullFlag(swigCPtr, this, flag);
  }

  public void ClearHullFlag(int flag) {
    LinearMathJNI.HullDesc_ClearHullFlag(swigCPtr, this, flag);
  }

  public void setMFlags(long value) {
    LinearMathJNI.HullDesc_mFlags_set(swigCPtr, this, value);
  }

  public long getMFlags() {
    return LinearMathJNI.HullDesc_mFlags_get(swigCPtr, this);
  }

  public void setMVcount(long value) {
    LinearMathJNI.HullDesc_mVcount_set(swigCPtr, this, value);
  }

  public long getMVcount() {
    return LinearMathJNI.HullDesc_mVcount_get(swigCPtr, this);
  }

  public void setMVertices(btVector3 value) {
    LinearMathJNI.HullDesc_mVertices_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getMVertices() {
    long cPtr = LinearMathJNI.HullDesc_mVertices_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setMVertexStride(long value) {
    LinearMathJNI.HullDesc_mVertexStride_set(swigCPtr, this, value);
  }

  public long getMVertexStride() {
    return LinearMathJNI.HullDesc_mVertexStride_get(swigCPtr, this);
  }

  public void setMNormalEpsilon(float value) {
    LinearMathJNI.HullDesc_mNormalEpsilon_set(swigCPtr, this, value);
  }

  public float getMNormalEpsilon() {
    return LinearMathJNI.HullDesc_mNormalEpsilon_get(swigCPtr, this);
  }

  public void setMMaxVertices(long value) {
    LinearMathJNI.HullDesc_mMaxVertices_set(swigCPtr, this, value);
  }

  public long getMMaxVertices() {
    return LinearMathJNI.HullDesc_mMaxVertices_get(swigCPtr, this);
  }

  public void setMMaxFaces(long value) {
    LinearMathJNI.HullDesc_mMaxFaces_set(swigCPtr, this, value);
  }

  public long getMMaxFaces() {
    return LinearMathJNI.HullDesc_mMaxFaces_get(swigCPtr, this);
  }

}
