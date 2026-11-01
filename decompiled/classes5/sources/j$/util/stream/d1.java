package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class d1 extends java.util.concurrent.CountedCompleter {
    public final long a;
    public final j$.util.stream.d1 b;
    public final java.util.concurrent.atomic.AtomicBoolean c;
    public final j$.util.stream.f1 d;
    public j$.util.Spliterator e;
    public final /* synthetic */ java.util.function.Function f;
    public final /* synthetic */ j$.util.stream.c1 g;
    public final /* synthetic */ j$.util.stream.z0 h;
    public final /* synthetic */ java.util.function.BiConsumer i;
    public final /* synthetic */ java.util.function.Supplier j;
    public final /* synthetic */ java.util.function.Supplier k;
    public final /* synthetic */ j$.util.stream.j1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(j$.util.stream.j1 j1Var, j$.util.Spliterator spliterator, java.util.function.Function function, j$.util.stream.c1 c1Var, j$.util.stream.z0 z0Var, java.util.function.BiConsumer biConsumer, java.util.function.Supplier supplier, java.util.function.Supplier supplier2) {
        super(null);
        this.f = function;
        this.g = c1Var;
        this.h = z0Var;
        this.i = biConsumer;
        this.j = supplier;
        this.k = supplier2;
        this.l = j1Var;
        if (j$.util.stream.j1.o == 0) {
            synchronized (j$.util.stream.j1.class) {
                if (j$.util.stream.j1.o == 0) {
                    j$.util.stream.j1.o = j$.util.stream.j1.n.a(j$.util.stream.d1.class, "next");
                }
            }
        }
        this.e = spliterator;
        this.a = j$.util.stream.d.g(spliterator.estimateSize());
        this.d = new j$.util.stream.f1(supplier2, supplier, biConsumer, z0Var, c1Var, function);
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.e;
        long j = this.a;
        j$.util.stream.d1 d1Var = this;
        j$.util.Spliterator spliterator2 = spliterator;
        boolean z = false;
        while (!this.c.get() && spliterator2.estimateSize() > j && (spliteratorTrySplit = spliterator2.trySplit()) != null) {
            j$.util.stream.d1 d1Var2 = new j$.util.stream.d1(this.l, d1Var, spliteratorTrySplit, d1Var.b, this.f, this.g, this.h, this.i, this.j, this.k);
            j$.util.stream.d1 d1Var3 = new j$.util.stream.d1(this.l, d1Var, spliterator2, d1Var2, this.f, this.g, this.h, this.i, this.j, this.k);
            d1Var.addToPendingCount(1);
            d1Var3.addToPendingCount(1);
            if (d1Var.b != null) {
                d1Var2.addToPendingCount(1);
                if (j$.com.android.tools.r8.a.I(j$.util.stream.j1.n.a, d1Var.b, j$.util.stream.j1.o, d1Var, d1Var2)) {
                    d1Var.addToPendingCount(-1);
                } else {
                    d1Var2.addToPendingCount(-1);
                }
            }
            if (z) {
                d1Var2 = d1Var2;
                d1Var2 = d1Var2;
                d1Var3.fork();
                d1Var = d1Var2;
                spliterator2 = spliteratorTrySplit;
            } else {
                d1Var2 = d1Var2;
                d1Var2 = d1Var2;
                d1Var2.fork();
                d1Var = d1Var3;
            }
            z = !z;
        }
        d1Var.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final java.lang.Object getRawResult() {
        return this.d;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        java.lang.Object objectVolatile;
        j$.util.Spliterator spliterator = this.e;
        this.e = null;
        if (spliterator != null && !this.c.get()) {
            j$.util.stream.f1 f1Var = this.d;
            f1Var.a(spliterator);
            if (!f1Var.c) {
                this.c.set(true);
            }
        }
        j$.sun.misc.a aVar = j$.util.stream.j1.n;
        long j = j$.util.stream.j1.o;
        while (true) {
            objectVolatile = aVar.a.getObjectVolatile(this, j);
            j$.util.stream.d1 d1Var = this;
            if (j$.com.android.tools.r8.a.I(aVar.a, d1Var, j, objectVolatile, null)) {
                break;
            } else {
                this = d1Var;
            }
        }
        j$.util.stream.d1 d1Var2 = (j$.util.stream.d1) objectVolatile;
        if (d1Var2 != null) {
            d1Var2.tryComplete();
        }
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(java.lang.Object obj) {
        if (((j$.util.stream.f1) obj) != null) {
            throw new java.lang.IllegalStateException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(j$.util.stream.j1 j1Var, j$.util.stream.d1 d1Var, j$.util.Spliterator spliterator, j$.util.stream.d1 d1Var2, java.util.function.Function function, j$.util.stream.c1 c1Var, j$.util.stream.z0 z0Var, java.util.function.BiConsumer biConsumer, java.util.function.Supplier supplier, java.util.function.Supplier supplier2) {
        super(d1Var);
        this.f = function;
        this.g = c1Var;
        this.h = z0Var;
        this.i = biConsumer;
        this.j = supplier;
        this.k = supplier2;
        this.l = j1Var;
        if (j$.util.stream.j1.o == 0) {
            synchronized (j$.util.stream.j1.class) {
                if (j$.util.stream.j1.o == 0) {
                    j$.util.stream.j1.o = j$.util.stream.j1.n.a(j$.util.stream.d1.class, "next");
                }
            }
        }
        this.e = spliterator;
        this.a = d1Var.a;
        this.d = d1Var.d;
        this.c = d1Var.c;
        this.b = d1Var2;
    }
}
