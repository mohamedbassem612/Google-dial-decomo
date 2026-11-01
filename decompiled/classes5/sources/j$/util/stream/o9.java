package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class o9 extends j$.util.stream.z5 {
    public boolean b;
    public final /* synthetic */ java.util.function.IntPredicate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(j$.util.stream.f6 f6Var, java.util.function.IntPredicate intPredicate) {
        super(f6Var);
        this.c = intPredicate;
        this.b = true;
    }

    @Override // j$.util.stream.d6, j$.util.stream.f6
    public final void accept(int i) {
        if (this.b) {
            boolean zTest = this.c.test(i);
            this.b = zTest;
            if (zTest) {
                this.a.accept(i);
            }
        }
    }

    @Override // j$.util.stream.z5, j$.util.stream.f6
    public final void p(long j) {
        this.a.p(-1L);
    }

    @Override // j$.util.stream.z5, j$.util.stream.f6
    public final boolean t() {
        return !this.b || this.a.t();
    }
}
