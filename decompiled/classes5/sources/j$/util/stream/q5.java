package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class q5 extends j$.util.stream.b6 {
    public boolean b;
    public final j$.util.h0 c;
    public final /* synthetic */ j$.util.stream.l0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(j$.util.stream.f6 f6Var, j$.util.stream.l0 l0Var) {
        super(f6Var);
        this.d = l0Var;
        j$.util.stream.f6 f6Var2 = this.a;
        j$.util.Objects.requireNonNull(f6Var2);
        this.c = new j$.util.h0(f6Var2, (byte) 1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.Spliterator$OfLong] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(java.lang.Object obj) {
        j$.util.stream.LongStream longStream = (j$.util.stream.LongStream) this.d.apply(obj);
        if (longStream != null) {
            try {
                boolean z = this.b;
                j$.util.h0 h0Var = this.c;
                if (z) {
                    ?? Spliterator = longStream.sequential().spliterator();
                    while (!this.a.t() && Spliterator.tryAdvance(h0Var)) {
                    }
                } else {
                    longStream.sequential().forEach(h0Var);
                }
            } catch (java.lang.Throwable th) {
                try {
                    longStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (longStream != null) {
            longStream.close();
        }
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final void p(long j) {
        this.a.p(-1L);
    }

    @Override // j$.util.stream.b6, j$.util.stream.f6
    public final boolean t() {
        this.b = true;
        return this.a.t();
    }
}
