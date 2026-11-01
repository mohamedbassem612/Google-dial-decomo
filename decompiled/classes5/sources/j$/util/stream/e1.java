package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class e1 extends java.util.concurrent.CountedCompleter {
    public j$.util.Spliterator a;
    public j$.util.stream.e1 b;
    public j$.util.stream.e1 c;
    public j$.util.stream.f1 d;
    public volatile boolean e;
    public long f;
    public final /* synthetic */ java.util.function.Function g;
    public final /* synthetic */ j$.util.stream.c1 h;
    public final /* synthetic */ j$.util.stream.z0 i;
    public final /* synthetic */ java.util.function.BiConsumer j;
    public final /* synthetic */ java.util.function.Supplier k;
    public final /* synthetic */ java.util.function.Supplier l;
    public final /* synthetic */ java.util.function.BinaryOperator m;
    public final /* synthetic */ java.util.function.BinaryOperator n;
    public final /* synthetic */ j$.util.stream.j1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j$.util.stream.j1 j1Var, j$.util.Spliterator spliterator, java.util.function.Function function, j$.util.stream.c1 c1Var, j$.util.stream.z0 z0Var, java.util.function.BiConsumer biConsumer, java.util.function.Supplier supplier, java.util.function.Supplier supplier2, java.util.function.BinaryOperator binaryOperator, java.util.function.BinaryOperator binaryOperator2) {
        super(null);
        this.g = function;
        this.h = c1Var;
        this.i = z0Var;
        this.j = biConsumer;
        this.k = supplier;
        this.l = supplier2;
        this.m = binaryOperator;
        this.n = binaryOperator2;
        this.o = j1Var;
        this.f = 0L;
        this.a = spliterator;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        boolean z;
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f;
        if (jG == 0) {
            jG = j$.util.stream.d.g(jEstimateSize);
            this.f = jG;
        }
        j$.util.stream.e1 e1Var = this;
        j$.util.Spliterator spliterator2 = spliterator;
        boolean z2 = false;
        while (true) {
            z = e1Var.e;
            if (!z) {
                for (j$.util.stream.e1 e1Var2 = (j$.util.stream.e1) e1Var.getCompleter(); !z && e1Var2 != null; e1Var2 = (j$.util.stream.e1) e1Var2.getCompleter()) {
                    z = e1Var2.e;
                }
            }
            if (z || jEstimateSize <= jG || (spliteratorTrySplit = spliterator2.trySplit()) == null) {
                break;
            }
            boolean z3 = z2;
            j$.util.stream.e1 e1Var3 = new j$.util.stream.e1(this.o, e1Var, spliteratorTrySplit, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            e1Var.b = e1Var3;
            j$.util.stream.e1 e1Var4 = new j$.util.stream.e1(this.o, e1Var, spliterator2, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            e1Var.c = e1Var4;
            e1Var.setPendingCount(1);
            if (z3) {
                e1Var4.fork();
                e1Var = e1Var3;
                spliterator2 = spliteratorTrySplit;
            } else {
                e1Var3.fork();
                e1Var = e1Var4;
            }
            z2 = !z3;
            jEstimateSize = spliterator2.estimateSize();
        }
        if (!z) {
            j$.util.stream.f1 f1Var = new j$.util.stream.f1(e1Var.l, e1Var.k, e1Var.j, e1Var.i, e1Var.h, e1Var.g);
            e1Var.d = f1Var;
            f1Var.a(e1Var.a);
            if (!f1Var.c) {
                j$.util.stream.e1 e1Var5 = e1Var;
                for (j$.util.stream.e1 e1Var6 = (j$.util.stream.e1) e1Var.getCompleter(); e1Var6 != null; e1Var6 = (j$.util.stream.e1) e1Var6.getCompleter()) {
                    if (e1Var6.b == e1Var5) {
                        e1Var6.c.e = true;
                    }
                    e1Var5 = e1Var6;
                }
            }
        }
        e1Var.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final java.lang.Object getRawResult() {
        return this.d;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        this.a = null;
        j$.util.stream.e1 e1Var = this.b;
        if (e1Var != null) {
            j$.util.stream.f1 f1Var = e1Var.d;
            j$.util.stream.f1 f1Var2 = this.c.d;
            if (f1Var != null && f1Var2 != null && f1Var.c) {
                f1Var.a = this.m.apply(f1Var.a, f1Var2.a);
                f1Var.b = this.n.apply(f1Var.b, f1Var2.b);
                f1Var.c = f1Var2.c;
            } else if (f1Var == null) {
                f1Var = f1Var2;
            }
            this.d = f1Var;
            this.c = null;
            this.b = null;
        }
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(java.lang.Object obj) {
        if (((j$.util.stream.f1) obj) != null) {
            throw new java.lang.IllegalStateException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j$.util.stream.j1 j1Var, j$.util.stream.e1 e1Var, j$.util.Spliterator spliterator, java.util.function.Function function, j$.util.stream.c1 c1Var, j$.util.stream.z0 z0Var, java.util.function.BiConsumer biConsumer, java.util.function.Supplier supplier, java.util.function.Supplier supplier2, java.util.function.BinaryOperator binaryOperator, java.util.function.BinaryOperator binaryOperator2) {
        super(e1Var);
        this.g = function;
        this.h = c1Var;
        this.i = z0Var;
        this.j = biConsumer;
        this.k = supplier;
        this.l = supplier2;
        this.m = binaryOperator;
        this.n = binaryOperator2;
        this.o = j1Var;
        this.f = e1Var.f;
        this.a = spliterator;
    }
}
