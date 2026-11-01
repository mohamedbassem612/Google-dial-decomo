package org.tensorflow.lite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class NativeInterpreterWrapper implements java.lang.AutoCloseable {
    long a;
    public long b;
    private long c;
    private java.nio.ByteBuffer d;
    private java.util.Map e;
    private org.tensorflow.lite.TensorImpl[] f;
    private org.tensorflow.lite.TensorImpl[] g;
    private boolean h;
    private final java.util.List i;
    public long inferenceDurationNanoseconds = -1;
    private final java.util.List j;

    public NativeInterpreterWrapper(java.nio.ByteBuffer byteBuffer, defpackage.aqam aqamVar) {
        defpackage.aqak aqakVarF;
        this.h = false;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.i = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.j = arrayList2;
        org.tensorflow.lite.TensorFlowLite.a();
        if (byteBuffer == null || !((byteBuffer instanceof java.nio.MappedByteBuffer) || (byteBuffer.isDirect() && byteBuffer.order() == java.nio.ByteOrder.nativeOrder()))) {
            throw new java.lang.IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.d = byteBuffer;
        long jCreateErrorReporter = createErrorReporter(512);
        long jCreateModelWithBuffer = createModelWithBuffer(this.d, jCreateErrorReporter);
        defpackage.aqam aqamVar2 = aqamVar == null ? new defpackage.aqam() : aqamVar;
        this.a = jCreateErrorReporter;
        this.c = jCreateModelWithBuffer;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        long jCreateInterpreter = createInterpreter(jCreateModelWithBuffer, jCreateErrorReporter, aqamVar2.a, true, false, arrayList3);
        this.b = jCreateInterpreter;
        if (hasUnresolvedFlexOp(jCreateInterpreter) && (aqakVarF = f(aqamVar2.a())) != null) {
            arrayList2.add(aqakVarF);
            arrayList.add(aqakVarF);
        }
        for (defpackage.aqak aqakVar : aqamVar2.a()) {
            if (aqamVar2.d != 1 && !(aqakVar instanceof defpackage.aqao)) {
                throw new java.lang.IllegalArgumentException("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
            }
            this.i.add(aqakVar);
        }
        java.util.Iterator it = j$.util.DesugarCollections.unmodifiableList(aqamVar2.c).iterator();
        while (it.hasNext()) {
            defpackage.aqak aqakVarA = ((defpackage.aqal) it.next()).a();
            this.j.add(aqakVarA);
            this.i.add(aqakVarA);
        }
        for (defpackage.aqak aqakVar2 : this.i) {
            if (aqakVar2 instanceof defpackage.aqao) {
                defpackage.aqao aqaoVar = (defpackage.aqao) aqakVar2;
                anty antyVar = aqaoVar.c;
                aqaoVar.b = new org.tensorflow.lite.nnapi.NnApiDelegateImpl();
                aqaoVar.a = true;
            }
        }
        arrayList3.ensureCapacity(this.i.size());
        java.util.Iterator it2 = this.i.iterator();
        while (it2.hasNext()) {
            arrayList3.add(java.lang.Long.valueOf(((defpackage.aqak) it2.next()).a()));
        }
        if (!arrayList3.isEmpty()) {
            delete(0L, 0L, this.b);
            this.b = createInterpreter(jCreateModelWithBuffer, jCreateErrorReporter, aqamVar2.a, true, false, arrayList3);
        }
        this.f = new org.tensorflow.lite.TensorImpl[getInputCount(this.b)];
        this.g = new org.tensorflow.lite.TensorImpl[getOutputCount(this.b)];
        allocateTensors(this.b, jCreateErrorReporter);
        this.h = true;
    }

    private static native long allocateTensors(long j, long j2);

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j, long j2, int i, boolean z, boolean z2, java.util.List list);

    private static native long createModelWithBuffer(java.nio.ByteBuffer byteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native long deleteCancellationFlag(long j);

    private static defpackage.aqak f(java.util.List list) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance((defpackage.aqak) it.next())) {
                    return null;
                }
            }
            return (defpackage.aqak) cls.getConstructor(null).newInstance(null);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private static native int getInputCount(long j);

    private static native int getInputTensorIndex(long j, int i);

    private static native int getOutputCount(long j);

    private static native int getOutputTensorIndex(long j, int i);

    public static native java.lang.String[] getSignatureKeys(long j);

    private static native boolean hasUnresolvedFlexOp(long j);

    private static native boolean resizeInput(long j, long j2, int i, int[] iArr, boolean z);

    private static native void run(long j, long j2);

    final org.tensorflow.lite.TensorImpl a(int i) {
        if (i >= 0) {
            org.tensorflow.lite.TensorImpl[] tensorImplArr = this.f;
            if (i < tensorImplArr.length) {
                org.tensorflow.lite.TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.b;
                org.tensorflow.lite.TensorImpl tensorImplE = org.tensorflow.lite.TensorImpl.e(j, getInputTensorIndex(j, i));
                tensorImplArr[i] = tensorImplE;
                return tensorImplE;
            }
        }
        throw new java.lang.IllegalArgumentException(a.bj(i, "Invalid input Tensor index: "));
    }

    public final org.tensorflow.lite.TensorImpl b(int i) {
        if (i >= 0) {
            org.tensorflow.lite.TensorImpl[] tensorImplArr = this.g;
            if (i < tensorImplArr.length) {
                org.tensorflow.lite.TensorImpl tensorImpl = tensorImplArr[i];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j = this.b;
                org.tensorflow.lite.TensorImpl tensorImplE = org.tensorflow.lite.TensorImpl.e(j, getOutputTensorIndex(j, i));
                tensorImplArr[i] = tensorImplE;
                return tensorImplE;
            }
        }
        throw new java.lang.IllegalArgumentException(a.bj(i, "Invalid output Tensor index: "));
    }

    public final void c(java.lang.Object[] objArr, java.util.Map map) {
        boolean z;
        this.inferenceDurationNanoseconds = -1L;
        if (objArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        for (int i = 0; i < objArr.length; i++) {
            int[] iArrK = a(i).k(objArr[i]);
            if (iArrK != null && resizeInput(this.b, this.a, i, iArrK, false)) {
                this.h = false;
                org.tensorflow.lite.TensorImpl tensorImpl = this.f[i];
                if (tensorImpl != null) {
                    tensorImpl.i();
                }
            }
        }
        if (this.h) {
            z = false;
        } else {
            z = true;
            this.h = true;
            allocateTensors(this.b, this.a);
            for (org.tensorflow.lite.TensorImpl tensorImpl2 : this.g) {
                if (tensorImpl2 != null) {
                    tensorImpl2.i();
                }
            }
        }
        for (int i2 = 0; i2 < objArr.length; i2++) {
            a(i2).j(objArr[i2]);
        }
        long jNanoTime = java.lang.System.nanoTime();
        run(this.b, this.a);
        long jNanoTime2 = java.lang.System.nanoTime() - jNanoTime;
        if (z) {
            for (org.tensorflow.lite.TensorImpl tensorImpl3 : this.g) {
                if (tensorImpl3 != null) {
                    tensorImpl3.i();
                }
            }
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                b(((java.lang.Integer) entry.getKey()).intValue()).g(entry.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = 0;
        while (true) {
            org.tensorflow.lite.TensorImpl[] tensorImplArr = this.f;
            if (i >= tensorImplArr.length) {
                break;
            }
            org.tensorflow.lite.TensorImpl tensorImpl = tensorImplArr[i];
            if (tensorImpl != null) {
                tensorImpl.f();
                this.f[i] = null;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            org.tensorflow.lite.TensorImpl[] tensorImplArr2 = this.g;
            if (i2 >= tensorImplArr2.length) {
                break;
            }
            org.tensorflow.lite.TensorImpl tensorImpl2 = tensorImplArr2[i2];
            if (tensorImpl2 != null) {
                tensorImpl2.f();
                this.g[i2] = null;
            }
            i2++;
        }
        this.i.clear();
        java.util.List list = this.j;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((defpackage.aqak) it.next()).close();
        }
        list.clear();
        delete(this.a, this.c, this.b);
        deleteCancellationFlag(0L);
        this.a = 0L;
        this.c = 0L;
        this.b = 0L;
        this.d = null;
        this.h = false;
    }

    public final org.tensorflow.lite.TensorImpl d(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Invalid input tensor name provided (null)");
        }
        org.tensorflow.lite.NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperE = e();
        return nativeSignatureRunnerWrapperE.c() == 0 ? a(nativeSignatureRunnerWrapperE.a(str)) : nativeSignatureRunnerWrapperE.d(str);
    }

    public final org.tensorflow.lite.NativeSignatureRunnerWrapper e() {
        if (this.e == null) {
            this.e = new java.util.HashMap();
        }
        if (!this.e.containsKey("serving_default")) {
            this.e.put("serving_default", new org.tensorflow.lite.NativeSignatureRunnerWrapper(this.b, this.a));
        }
        return (org.tensorflow.lite.NativeSignatureRunnerWrapper) this.e.get("serving_default");
    }
}
