package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class d extends java.util.concurrent.CountedCompleter {
    public static final int g = java.util.concurrent.ForkJoinPool.getCommonPoolParallelism() << 2;
    public final j$.util.stream.a a;
    public j$.util.Spliterator b;
    public long c;
    public j$.util.stream.d d;
    public j$.util.stream.d e;
    public java.lang.Object f;

    public d(j$.util.stream.d dVar, j$.util.Spliterator spliterator) {
        super(dVar);
        this.b = spliterator;
        this.a = dVar.a;
        this.c = dVar.c;
    }

    public static long g(long j) {
        long j2 = j / ((long) g);
        if (j2 <= 0) {
            return 1L;
        }
        return j2;
    }

    public abstract java.lang.Object a();

    public final j$.util.stream.d b() {
        return (j$.util.stream.d) getCompleter();
    }

    public final boolean c() {
        while (this != null) {
            j$.util.stream.d dVar = (j$.util.stream.d) this.getCompleter();
            if (dVar != null && dVar.d != this) {
                return false;
            }
            this = dVar;
        }
        return true;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.c;
        if (jG == 0) {
            jG = g(jEstimateSize);
            this.c = jG;
        }
        boolean z = false;
        while (jEstimateSize > jG && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            j$.util.stream.d dVarE = this.e(spliteratorTrySplit);
            this.d = dVarE;
            j$.util.stream.d dVarE2 = this.e(spliterator);
            this.e = dVarE2;
            this.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                this = dVarE;
                dVarE = dVarE2;
            } else {
                this = dVarE2;
            }
            z = !z;
            dVarE.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        this.f(this.a());
        this.tryComplete();
    }

    public final boolean d() {
        return ((j$.util.stream.d) getCompleter()) == null;
    }

    public abstract j$.util.stream.d e(j$.util.Spliterator spliterator);

    public void f(java.lang.Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public java.lang.Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.IllegalStateException();
        }
    }

    public d(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        super(null);
        this.a = aVar;
        this.b = spliterator;
        this.c = 0L;
    }
}
