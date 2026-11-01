package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class g4 extends java.util.concurrent.CountedCompleter implements j$.util.stream.f6 {
    public final j$.util.Spliterator a;
    public final j$.util.stream.a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public g4(j$.util.stream.g4 g4Var, j$.util.Spliterator spliterator, long j, long j2, int i) {
        super(g4Var);
        this.a = spliterator;
        this.b = g4Var.b;
        this.c = g4Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Integer.valueOf(i)));
        }
    }

    public abstract j$.util.stream.g4 a(j$.util.Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        j$.util.stream.n4.d();
        throw null;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.a;
        j$.util.stream.g4 g4VarA = this;
        while (spliterator.estimateSize() > g4VarA.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            g4VarA.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            g4VarA.a(spliteratorTrySplit, g4VarA.d, jEstimateSize).fork();
            g4VarA = g4VarA.a(spliterator, g4VarA.d + jEstimateSize, g4VarA.e - jEstimateSize);
        }
        g4VarA.b.O(spliterator, g4VarA);
        g4VarA.propagateCompletion();
    }

    @Override // j$.util.stream.f6
    public final void p(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new java.lang.IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.f6
    public final boolean t() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        j$.util.stream.n4.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        j$.util.stream.n4.l();
        throw null;
    }

    public g4(j$.util.Spliterator spliterator, j$.util.stream.a aVar, int i) {
        this.a = spliterator;
        this.b = aVar;
        this.c = j$.util.stream.d.g(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    @Override // j$.util.stream.f6
    public final void end() {
    }
}
