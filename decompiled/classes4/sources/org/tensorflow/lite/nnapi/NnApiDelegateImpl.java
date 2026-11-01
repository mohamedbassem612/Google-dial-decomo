package org.tensorflow.lite.nnapi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class NnApiDelegateImpl implements java.lang.AutoCloseable, defpackage.aqak {
    public long a;

    public NnApiDelegateImpl() {
        org.tensorflow.lite.TensorFlowLite.a();
        this.a = createDelegate(-1, null, null, null, -1, false, true, false, 0L);
    }

    private static native long createDelegate(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, boolean z, boolean z2, boolean z3, long j);

    private static native void deleteDelegate(long j);

    @Override // defpackage.aqak
    public final long a() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable, defpackage.aqak, java.io.Closeable
    public final void close() {
        long j = this.a;
        if (j != 0) {
            deleteDelegate(j);
            this.a = 0L;
        }
    }
}
