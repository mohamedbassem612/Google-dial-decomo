package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class t0 extends java.util.concurrent.CountedCompleter {
    public j$.util.Spliterator a;
    public final j$.util.stream.f6 b;
    public final j$.util.stream.a c;
    public long d;

    public t0(j$.util.stream.t0 t0Var, j$.util.Spliterator spliterator) {
        super(t0Var);
        this.a = spliterator;
        this.b = t0Var.b;
        this.d = t0Var.d;
        this.c = t0Var.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.d;
        if (jG == 0) {
            jG = j$.util.stream.d.g(jEstimateSize);
            this.d = jG;
        }
        boolean zP = j$.util.stream.v7.SHORT_CIRCUIT.p(this.c.f);
        j$.util.stream.f6 f6Var = this.b;
        boolean z = false;
        while (true) {
            if (zP && f6Var.t()) {
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                this.c.f(spliterator, f6Var);
                break;
            }
            j$.util.stream.t0 t0Var = new j$.util.stream.t0(this, spliteratorTrySplit);
            this.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                t0Var = this;
                this = t0Var;
            }
            z = !z;
            this.fork();
            this = t0Var;
            jEstimateSize = spliterator.estimateSize();
        }
        this.a = null;
        this.propagateCompletion();
    }

    public t0(j$.util.stream.a aVar, j$.util.Spliterator spliterator, j$.util.stream.f6 f6Var) {
        super(null);
        this.b = f6Var;
        this.c = aVar;
        this.a = spliterator;
        this.d = 0L;
    }
}
