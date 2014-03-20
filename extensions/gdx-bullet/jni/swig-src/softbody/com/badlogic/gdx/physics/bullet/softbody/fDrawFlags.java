/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class fDrawFlags extends BulletBase {
	private long swigCPtr;
	
	protected fDrawFlags(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new fDrawFlags, normally you should not need this constructor it's intended for low-level usage. */ 
	public fDrawFlags(long cPtr, boolean cMemoryOwn) {
		this("fDrawFlags", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(fDrawFlags obj) {
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
				SoftbodyJNI.delete_fDrawFlags(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public fDrawFlags() {
    this(SoftbodyJNI.new_fDrawFlags(), true);
  }

  public final static class _ {
    public final static int Nodes = 0x0001;
    public final static int Links = 0x0002;
    public final static int Faces = 0x0004;
    public final static int Tetras = 0x0008;
    public final static int Normals = 0x0010;
    public final static int Contacts = 0x0020;
    public final static int Anchors = 0x0040;
    public final static int Notes = 0x0080;
    public final static int Clusters = 0x0100;
    public final static int NodeTree = 0x0200;
    public final static int FaceTree = 0x0400;
    public final static int ClusterTree = 0x0800;
    public final static int Joints = 0x1000;
    public final static int Std = Links+Faces+Tetras+Anchors+Notes+Joints;
    public final static int StdTetra = Std-Faces+Tetras;
  }

}
