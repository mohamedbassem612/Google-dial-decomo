package org.tensorflow.lite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class NativeSignatureRunnerWrapper {
    public final long a;
    public final long b;
    public boolean c = false;

    public NativeSignatureRunnerWrapper(long j, long j2) {
        this.b = j2;
        long jNativeGetSignatureRunner = nativeGetSignatureRunner(j, "serving_default");
        this.a = jNativeGetSignatureRunner;
        if (jNativeGetSignatureRunner == -1) {
            throw new java.lang.IllegalArgumentException("Input error: Signature serving_default not found.");
        }
    }

    public static native void nativeAllocateTensors(long j, long j2);

    private static native int nativeGetInputIndex(long j, java.lang.String str);

    private static native int nativeGetOutputIndex(long j, java.lang.String str);

    private static native long nativeGetSignatureRunner(long j, java.lang.String str);

    private static native int nativeGetSubgraphIndex(long j);

    public static native void nativeInvoke(long j, long j2);

    public static native java.lang.String[] nativeOutputNames(long j);

    public static native boolean nativeResizeInput(long j, long j2, java.lang.String str, int[] iArr);

    public final int a(java.lang.String str) {
        int iNativeGetInputIndex = nativeGetInputIndex(this.a, str);
        if (iNativeGetInputIndex != -1) {
            return iNativeGetInputIndex;
        }
        throw new java.lang.IllegalArgumentException(a.bk(str, "Input error: input ", " not found."));
    }

    public final int b(java.lang.String str) {
        int iNativeGetOutputIndex = nativeGetOutputIndex(this.a, str);
        if (iNativeGetOutputIndex != -1) {
            return iNativeGetOutputIndex;
        }
        throw new java.lang.IllegalArgumentException(a.bk(str, "Input error: output ", " not found."));
    }

    public final int c() {
        return nativeGetSubgraphIndex(this.a);
    }

    public final org.tensorflow.lite.TensorImpl d(java.lang.String str) {
        long jCreateSignatureInputTensor = org.tensorflow.lite.TensorImpl.createSignatureInputTensor(this.a, str);
        if (jCreateSignatureInputTensor != -1) {
            return new org.tensorflow.lite.TensorImpl(jCreateSignatureInputTensor);
        }
        throw new java.lang.IllegalArgumentException(a.bk(str, "Input error: input ", " not found."));
    }

    public final org.tensorflow.lite.TensorImpl e(java.lang.String str) {
        long jCreateSignatureOutputTensor = org.tensorflow.lite.TensorImpl.createSignatureOutputTensor(this.a, str);
        if (jCreateSignatureOutputTensor != -1) {
            return new org.tensorflow.lite.TensorImpl(jCreateSignatureOutputTensor);
        }
        throw new java.lang.IllegalArgumentException(a.bk(str, "Input error: output ", " not found."));
    }
}
