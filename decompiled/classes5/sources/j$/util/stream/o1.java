package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class o1 extends j$.util.stream.z5 {
    public boolean b;
    public final j$.util.d0 c;
    public final /* synthetic */ j$.util.stream.l0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(j$.util.stream.f6 f6Var, j$.util.stream.l0 l0Var) {
        super(f6Var);
        this.d = l0Var;
        j$.util.stream.f6 f6Var2 = this.a;
        j$.util.Objects.requireNonNull(f6Var2);
        this.c = new j$.util.d0(f6Var2, (byte) 1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.Spliterator$OfInt] */
    @Override // j$.util.stream.d6, j$.util.stream.f6
    public final void accept(int i) {
        j$.util.stream.IntStream intStream = (j$.util.stream.IntStream) this.d.apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.d0 d0Var = this.c;
                if (z) {
                    ?? Spliterator = intStream.sequential().spliterator();
                    while (!this.a.t() && Spliterator.tryAdvance(d0Var)) {
                    }
                } else {
                    intStream.sequential().forEach(d0Var);
                }
            } catch (java.lang.Throwable th) {
                try {
                    intStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.z5, j$.util.stream.f6
    public final void p(long j) {
        this.a.p(-1L);
    }

    @Override // j$.util.stream.z5, j$.util.stream.f6
    public final boolean t() {
        this.b = true;
        return this.a.t();
    }
}
