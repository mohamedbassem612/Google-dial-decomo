package com.google.speech.recognizer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class ResourceManager {
    public long a = nativeConstruct();

    private native long nativeConstruct();

    private native void nativeDelete(long j);

    private native int nativeInitFromProto(long j, byte[] bArr, java.lang.String[] strArr);

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            nativeDelete(j);
            this.a = 0L;
        }
    }

    public final int b(byte[] bArr, java.lang.String[] strArr) {
        long j = this.a;
        if (j != 0) {
            return a.aS(nativeInitFromProto(j, bArr, strArr));
        }
        throw new java.lang.IllegalStateException("recognizer is not initialized");
    }

    protected final void finalize() {
        a();
    }
}
