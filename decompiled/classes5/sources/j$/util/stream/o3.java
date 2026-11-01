package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class o3 implements j$.util.stream.u2 {
    @Override // j$.util.stream.u2
    public j$.util.stream.u2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.u2
    public final long count() {
        return 0L;
    }

    @Override // j$.util.stream.u2
    public /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.u2
    public final java.lang.Object[] k(java.util.function.IntFunction intFunction) {
        return (java.lang.Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.u2
    public final int l() {
        return 0;
    }

    public final void d(java.lang.Object obj) {
    }

    public final void c(int i, java.lang.Object obj) {
    }
}
