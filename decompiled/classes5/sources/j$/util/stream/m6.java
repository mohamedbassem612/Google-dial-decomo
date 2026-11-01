package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class m6 extends j$.util.stream.y5 {
    public long b;
    public long c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(j$.util.stream.f6 f6Var, long j, long j2) {
        super(f6Var);
        this.d = j;
        this.b = j;
        this.c = j2 < 0 ? Long.MAX_VALUE : j2;
    }

    @Override // j$.util.stream.c6, j$.util.stream.f6
    public final void accept(double d) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept(d);
        }
    }

    @Override // j$.util.stream.y5, j$.util.stream.f6
    public final void p(long j) {
        this.a.p(j$.util.stream.q6.a(j, this.d, this.c));
    }

    @Override // j$.util.stream.y5, j$.util.stream.f6
    public final boolean t() {
        return this.c == 0 || this.a.t();
    }
}
