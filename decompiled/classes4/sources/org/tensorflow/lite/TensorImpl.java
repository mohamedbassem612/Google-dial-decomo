package org.tensorflow.lite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class TensorImpl {
    public final defpackage.aqaj a;
    public int[] b;
    private long c;

    public TensorImpl(long j) {
        defpackage.aqaj aqajVar;
        this.c = j;
        int iDtype = dtype(j);
        switch (iDtype) {
            case 1:
                aqajVar = defpackage.aqaj.a;
                break;
            case 2:
                aqajVar = defpackage.aqaj.b;
                break;
            case 3:
                aqajVar = defpackage.aqaj.c;
                break;
            case 4:
                aqajVar = defpackage.aqaj.d;
                break;
            case 5:
                aqajVar = defpackage.aqaj.e;
                break;
            case 6:
                aqajVar = defpackage.aqaj.f;
                break;
            case 7:
                aqajVar = defpackage.aqaj.g;
                break;
            case 8:
            default:
                throw new java.lang.IllegalArgumentException(a.bs(iDtype, "DataType error: DataType ", " is not recognized in Java."));
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                aqajVar = defpackage.aqaj.h;
                break;
        }
        this.a = aqajVar;
        this.b = shape(j);
        shapeSignature(j);
        quantizationScale(j);
        quantizationZeroPoint(j);
    }

    static int a(java.lang.Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (java.lang.reflect.Array.getLength(obj) != 0) {
            return a(java.lang.reflect.Array.get(obj, 0)) + 1;
        }
        throw new java.lang.IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native java.nio.ByteBuffer buffer(long j);

    private static native long create(long j, int i, int i2);

    public static native long createSignatureInputTensor(long j, java.lang.String str);

    public static native long createSignatureOutputTensor(long j, java.lang.String str);

    private static native void delete(long j);

    private static native int dtype(long j);

    static org.tensorflow.lite.TensorImpl e(long j, int i) {
        return new org.tensorflow.lite.TensorImpl(create(j, i, 0));
    }

    static void h(java.lang.Object obj, int i, int[] iArr) {
        int length = iArr.length;
        if (i != length) {
            int length2 = java.lang.reflect.Array.getLength(obj);
            int i2 = iArr[i];
            if (i2 == 0) {
                iArr[i] = length2;
            } else if (i2 != length2) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Mismatched lengths (%d and %d) in dimension %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(length2), java.lang.Integer.valueOf(i)));
            }
            int i3 = i + 1;
            if (i3 != length) {
                for (int i4 = 0; i4 < length2; i4++) {
                    h(java.lang.reflect.Array.get(obj, i4), i3, iArr);
                }
            }
        }
    }

    private static native boolean hasDelegateBufferHandle(long j);

    private final java.nio.ByteBuffer l() {
        return buffer(this.c).order(java.nio.ByteOrder.nativeOrder());
    }

    private final void m(java.lang.Object obj) {
        defpackage.aqaj aqajVar;
        defpackage.aqaj aqajVar2;
        if (obj instanceof java.nio.ByteBuffer) {
            return;
        }
        java.lang.Class<?> componentType = obj.getClass();
        if (!componentType.isArray()) {
            if (java.lang.Float.class.equals(componentType) || (obj instanceof java.nio.FloatBuffer)) {
                aqajVar = defpackage.aqaj.a;
            } else if (java.lang.Integer.class.equals(componentType) || (obj instanceof java.nio.IntBuffer)) {
                aqajVar = defpackage.aqaj.b;
            } else if (java.lang.Short.class.equals(componentType) || (obj instanceof java.nio.ShortBuffer)) {
                aqajVar = defpackage.aqaj.g;
            } else if (java.lang.Byte.class.equals(componentType)) {
                aqajVar = defpackage.aqaj.c;
            } else if (java.lang.Long.class.equals(componentType) || (obj instanceof java.nio.LongBuffer)) {
                aqajVar = defpackage.aqaj.d;
            } else {
                if (!java.lang.Boolean.class.equals(componentType)) {
                    if (java.lang.String.class.equals(componentType)) {
                        aqajVar = defpackage.aqaj.e;
                    }
                    throw new java.lang.IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(java.lang.String.valueOf(obj.getClass().getName())));
                }
                aqajVar = defpackage.aqaj.f;
            }
            aqajVar2 = this.a;
            if (aqajVar == aqajVar2) {
            } else {
                return;
            }
        }
        while (componentType.isArray()) {
            componentType = componentType.getComponentType();
        }
        if (java.lang.Float.TYPE.equals(componentType)) {
            aqajVar = defpackage.aqaj.a;
        } else if (java.lang.Integer.TYPE.equals(componentType)) {
            aqajVar = defpackage.aqaj.b;
        } else if (java.lang.Short.TYPE.equals(componentType)) {
            aqajVar = defpackage.aqaj.g;
        } else if (java.lang.Byte.TYPE.equals(componentType)) {
            defpackage.aqaj aqajVar3 = this.a;
            defpackage.aqaj aqajVar4 = defpackage.aqaj.e;
            aqajVar = aqajVar3 != aqajVar4 ? defpackage.aqaj.c : aqajVar4;
        } else if (java.lang.Long.TYPE.equals(componentType)) {
            aqajVar = defpackage.aqaj.d;
        } else {
            if (!java.lang.Boolean.TYPE.equals(componentType)) {
                if (java.lang.String.class.equals(componentType)) {
                    aqajVar = defpackage.aqaj.e;
                }
                throw new java.lang.IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(java.lang.String.valueOf(obj.getClass().getName())));
            }
            aqajVar = defpackage.aqaj.f;
        }
        aqajVar2 = this.a;
        if (aqajVar == aqajVar2 && !anty.aK(aqajVar).equals(anty.aK(aqajVar2))) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", aqajVar2, obj.getClass().getName(), aqajVar));
        }
    }

    private final int[] n(java.lang.Object obj) {
        int iA = a(obj);
        if (this.a == defpackage.aqaj.e) {
            java.lang.Class<?> componentType = obj.getClass();
            if (componentType.isArray()) {
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                }
                if (java.lang.Byte.TYPE.equals(componentType)) {
                    iA--;
                }
            }
        }
        int[] iArr = new int[iA];
        h(obj, 0, iArr);
        return iArr;
    }

    private static native java.lang.String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    private static native void readMultiDimensionalArray(long j, java.lang.Object obj);

    private static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    private static native void writeDirectBuffer(long j, java.nio.Buffer buffer);

    private static native void writeMultiDimensionalArray(long j, java.lang.Object obj);

    private static native void writeScalar(long j, java.lang.Object obj);

    public final int b() {
        return numBytes(this.c);
    }

    public final java.lang.String c() {
        return name(this.c);
    }

    public final java.nio.ByteBuffer d() {
        return l().asReadOnlyBuffer().order(java.nio.ByteOrder.nativeOrder());
    }

    final void f() {
        delete(this.c);
        this.c = 0L;
    }

    public final void g(java.lang.Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.c)) {
                throw new java.lang.IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        m(obj);
        boolean z = obj instanceof java.nio.Buffer;
        if (z) {
            int iB = b();
            boolean z2 = obj instanceof java.nio.ByteBuffer;
            int iCapacity = ((java.nio.Buffer) obj).capacity();
            if (!z2) {
                iCapacity *= this.a.a();
            }
            if (iB > iCapacity) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", c(), java.lang.Integer.valueOf(iB), java.lang.Integer.valueOf(iCapacity)));
            }
        } else {
            int[] iArrN = n(obj);
            if (!java.util.Arrays.equals(iArrN, this.b)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", c(), java.util.Arrays.toString(this.b), java.util.Arrays.toString(iArrN)));
            }
        }
        if (!z) {
            readMultiDimensionalArray(this.c, obj);
            return;
        }
        java.nio.Buffer buffer = (java.nio.Buffer) obj;
        if (buffer instanceof java.nio.ByteBuffer) {
            ((java.nio.ByteBuffer) buffer).put(l());
            return;
        }
        if (buffer instanceof java.nio.FloatBuffer) {
            ((java.nio.FloatBuffer) buffer).put(l().asFloatBuffer());
            return;
        }
        if (buffer instanceof java.nio.LongBuffer) {
            ((java.nio.LongBuffer) buffer).put(l().asLongBuffer());
        } else if (buffer instanceof java.nio.IntBuffer) {
            ((java.nio.IntBuffer) buffer).put(l().asIntBuffer());
        } else {
            if (!(buffer instanceof java.nio.ShortBuffer)) {
                throw new java.lang.IllegalArgumentException("Unexpected output buffer type: ".concat(buffer.toString()));
            }
            ((java.nio.ShortBuffer) buffer).put(l().asShortBuffer());
        }
    }

    final void i() {
        this.b = shape(this.c);
    }

    public final void j(java.lang.Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.c)) {
                throw new java.lang.IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        m(obj);
        boolean z = obj instanceof java.nio.Buffer;
        if (z) {
            int iB = b();
            boolean z2 = obj instanceof java.nio.ByteBuffer;
            int iCapacity = ((java.nio.Buffer) obj).capacity();
            if (!z2) {
                iCapacity *= this.a.a();
            }
            if (iB != iCapacity) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", c(), java.lang.Integer.valueOf(iB), java.lang.Integer.valueOf(iCapacity)));
            }
        } else {
            int[] iArrN = n(obj);
            if (!java.util.Arrays.equals(iArrN, this.b)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", c(), java.util.Arrays.toString(this.b), java.util.Arrays.toString(iArrN)));
            }
        }
        if (!z) {
            if (this.a == defpackage.aqaj.e && this.b.length == 0) {
                writeScalar(this.c, obj);
                return;
            }
            boolean zIsArray = obj.getClass().isArray();
            long j = this.c;
            if (zIsArray) {
                writeMultiDimensionalArray(j, obj);
                return;
            } else {
                writeScalar(j, obj);
                return;
            }
        }
        java.nio.Buffer buffer = (java.nio.Buffer) obj;
        if (buffer instanceof java.nio.ByteBuffer) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.c, buffer);
                return;
            } else {
                l().put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof java.nio.LongBuffer) {
            java.nio.LongBuffer longBuffer = (java.nio.LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.c, buffer);
                return;
            } else {
                l().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof java.nio.FloatBuffer) {
            java.nio.FloatBuffer floatBuffer = (java.nio.FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.c, buffer);
                return;
            } else {
                l().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof java.nio.IntBuffer) {
            java.nio.IntBuffer intBuffer = (java.nio.IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.c, buffer);
                return;
            } else {
                l().asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (!(buffer instanceof java.nio.ShortBuffer)) {
            throw new java.lang.IllegalArgumentException("Unexpected input buffer type: ".concat(buffer.toString()));
        }
        java.nio.ShortBuffer shortBuffer = (java.nio.ShortBuffer) buffer;
        if (shortBuffer.isDirect() && shortBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.c, buffer);
        } else {
            l().asShortBuffer().put(shortBuffer);
        }
    }

    public final int[] k(java.lang.Object obj) {
        if (obj != null && !(obj instanceof java.nio.Buffer)) {
            m(obj);
            int[] iArrN = n(obj);
            if (!java.util.Arrays.equals(this.b, iArrN)) {
                return iArrN;
            }
        }
        return null;
    }
}
