package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class w2 implements j$.util.stream.u2 {
    public final j$.util.stream.u2 a;
    public final j$.util.stream.u2 b;
    public final long c;

    public w2(j$.util.stream.u2 u2Var, j$.util.stream.u2 u2Var2) {
        this.a = u2Var;
        this.b = u2Var2;
        this.c = u2Var2.count() + u2Var.count();
    }

    @Override // j$.util.stream.u2
    public final j$.util.stream.u2 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.u2
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.u2
    public final int l() {
        return 2;
    }

    @Override // j$.util.stream.u2
    public final /* bridge */ /* synthetic */ j$.util.stream.t2 a(int i) {
        return (j$.util.stream.t2) a(i);
    }
}
