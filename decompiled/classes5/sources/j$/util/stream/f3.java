package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class f3 extends j$.util.stream.w2 implements j$.util.stream.t2 {
    @Override // j$.util.stream.t2
    public final java.lang.Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        java.lang.Object objNewArray = newArray((int) j);
        c(0, objNewArray);
        return objNewArray;
    }

    @Override // j$.util.stream.t2
    public final void c(int i, java.lang.Object obj) {
        j$.util.stream.u2 u2Var = this.a;
        ((j$.util.stream.t2) u2Var).c(i, obj);
        ((j$.util.stream.t2) this.b).c(i + ((int) ((j$.util.stream.t2) u2Var).count()), obj);
    }

    @Override // j$.util.stream.t2
    public final void d(java.lang.Object obj) {
        ((j$.util.stream.t2) this.a).d(obj);
        ((j$.util.stream.t2) this.b).d(obj);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ java.lang.Object[] k(java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.m(this, intFunction);
    }

    public final java.lang.String toString() {
        long j = this.c;
        return j < 32 ? java.lang.String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : java.lang.String.format("%s[size=%d]", getClass().getName(), java.lang.Long.valueOf(j));
    }
}
