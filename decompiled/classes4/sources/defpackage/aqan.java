package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aqan implements java.lang.AutoCloseable {
    org.tensorflow.lite.NativeInterpreterWrapper a;

    public aqan(java.nio.ByteBuffer byteBuffer, defpackage.aqam aqamVar) {
        this.a = new org.tensorflow.lite.NativeInterpreterWrapperExperimental(byteBuffer, aqamVar);
        a();
        org.tensorflow.lite.NativeInterpreterWrapper.getSignatureKeys(this.a.b);
    }

    final void a() {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    public final void b(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj};
        java.util.HashMap map = new java.util.HashMap();
        map.put(0, obj2);
        a();
        this.a.c(objArr, map);
    }

    public final org.tensorflow.lite.TensorImpl c(java.lang.String str) {
        a();
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.a;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Invalid output tensor name provided (null)");
        }
        org.tensorflow.lite.NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperE = nativeInterpreterWrapper.e();
        return nativeSignatureRunnerWrapperE.c() == 0 ? nativeInterpreterWrapper.b(nativeSignatureRunnerWrapperE.b(str)) : nativeSignatureRunnerWrapperE.e(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.a;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.a = null;
        }
    }

    public final java.lang.String[] d() {
        a();
        return org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeOutputNames(this.a.e().a);
    }

    public final void e(java.util.Map map, java.util.Map map2) {
        a();
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.a;
        nativeInterpreterWrapper.inferenceDurationNanoseconds = -1L;
        if (map == null || map.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map2 == null) {
            throw new java.lang.IllegalArgumentException("Input error: Outputs should not be null.");
        }
        org.tensorflow.lite.NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperE = nativeInterpreterWrapper.e();
        if (nativeSignatureRunnerWrapperE.c() == 0) {
            java.lang.Object[] objArr = new java.lang.Object[map.size()];
            for (java.util.Map.Entry entry : map.entrySet()) {
                objArr[nativeSignatureRunnerWrapperE.a((java.lang.String) entry.getKey())] = entry.getValue();
            }
            java.util.TreeMap treeMap = new java.util.TreeMap();
            for (java.util.Map.Entry entry2 : map2.entrySet()) {
                treeMap.put(java.lang.Integer.valueOf(nativeSignatureRunnerWrapperE.b((java.lang.String) entry2.getKey())), entry2.getValue());
            }
            nativeInterpreterWrapper.c(objArr, treeMap);
            return;
        }
        for (java.util.Map.Entry entry3 : map.entrySet()) {
            int[] iArrK = nativeInterpreterWrapper.d((java.lang.String) entry3.getKey()).k(entry3.getValue());
            if (iArrK != null) {
                try {
                    java.lang.String str = (java.lang.String) entry3.getKey();
                    nativeSignatureRunnerWrapperE.c = false;
                    org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeResizeInput(nativeSignatureRunnerWrapperE.a, nativeSignatureRunnerWrapperE.b, str, iArrK);
                } catch (java.lang.IllegalArgumentException e) {
                    throw ((java.lang.IllegalArgumentException) new java.lang.IllegalArgumentException(java.lang.String.format("Tensor passed for input '%s' of signature '%s' has different shape than expected", entry3.getKey(), "serving_default")).initCause(e));
                }
            }
        }
        if (!nativeSignatureRunnerWrapperE.c) {
            org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeAllocateTensors(nativeSignatureRunnerWrapperE.a, nativeSignatureRunnerWrapperE.b);
            nativeSignatureRunnerWrapperE.c = true;
        }
        for (java.util.Map.Entry entry4 : map.entrySet()) {
            nativeSignatureRunnerWrapperE.d((java.lang.String) entry4.getKey()).j(entry4.getValue());
        }
        long j = nativeSignatureRunnerWrapperE.a;
        long j2 = nativeSignatureRunnerWrapperE.b;
        long jNanoTime = java.lang.System.nanoTime();
        org.tensorflow.lite.NativeSignatureRunnerWrapper.nativeInvoke(j, j2);
        long jNanoTime2 = java.lang.System.nanoTime() - jNanoTime;
        for (java.util.Map.Entry entry5 : map2.entrySet()) {
            if (entry5.getValue() != null) {
                nativeSignatureRunnerWrapperE.e((java.lang.String) entry5.getKey()).g(entry5.getValue());
            }
        }
        nativeInterpreterWrapper.inferenceDurationNanoseconds = jNanoTime2;
    }

    public final /* bridge */ /* synthetic */ org.tensorflow.lite.TensorImpl f(java.lang.String str) {
        a();
        return this.a.d(str);
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
