package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class k6 extends j$.util.stream.a6 {
    public long b;
    public long c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(j$.util.stream.f6 f6Var, long j, long j2) {
        super(f6Var);
        this.d = j;
        this.b = j;
        this.c = j2 < 0 ? Long.MAX_VALUE : j2;
    }

    @Override // j$.util.stream.e6, java.util.function.LongConsumer
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 != 0) {
            this.b = j2 - 1;
            return;
        }
        long j3 = this.c;
        if (j3 > 0) {
            this.c = j3 - 1;
            this.a.accept(j);
        }
    }

    @Override // j$.util.stream.a6, j$.util.stream.f6
    public final void p(long j) {
        this.a.p(j$.util.stream.q6.a(j, this.d, this.c));
    }

    @Override // j$.util.stream.a6, j$.util.stream.f6
    public final boolean t() {
        return this.c == 0 || this.a.t();
    }
}
