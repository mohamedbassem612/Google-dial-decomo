package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
@java.lang.Deprecated
public final class aqao implements java.lang.AutoCloseable, defpackage.aqak {
    public boolean a;
    public org.tensorflow.lite.nnapi.NnApiDelegateImpl b;
    public final anty c;

    public aqao() {
        anty antyVar = new anty();
        org.tensorflow.lite.TensorFlowLite.a();
        this.c = antyVar;
    }

    @Override // defpackage.aqak
    public final long a() {
        org.tensorflow.lite.nnapi.NnApiDelegateImpl nnApiDelegateImpl = this.b;
        if (nnApiDelegateImpl == null) {
            throw new java.lang.IllegalStateException(true != this.a ? "Should not access delegate before interpreter has been constructed." : "Should not access delegate after delegate has been closed.");
        }
        return nnApiDelegateImpl.a;
    }

    @Override // java.lang.AutoCloseable, defpackage.aqak, java.io.Closeable
    public final void close() {
        org.tensorflow.lite.nnapi.NnApiDelegateImpl nnApiDelegateImpl = this.b;
        if (nnApiDelegateImpl != null) {
            nnApiDelegateImpl.close();
            this.b = null;
        }
    }
}
