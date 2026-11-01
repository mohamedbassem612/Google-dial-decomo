package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class s0 extends java.util.concurrent.CountedCompleter {
    public final j$.util.stream.a a;
    public j$.util.Spliterator b;
    public final long c;
    public final j$.util.concurrent.ConcurrentHashMap d;
    public final j$.util.stream.q0 e;
    public final j$.util.stream.s0 f;
    public j$.util.stream.u2 g;

    public s0(j$.util.stream.a aVar, j$.util.Spliterator spliterator, j$.util.stream.q0 q0Var) {
        super(null);
        this.a = aVar;
        this.b = spliterator;
        this.c = j$.util.stream.d.g(spliterator.estimateSize());
        this.d = new j$.util.concurrent.ConcurrentHashMap(java.lang.Math.max(16, j$.util.stream.d.g << 1));
        this.e = q0Var;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.b;
        long j = this.c;
        byte b = 0;
        boolean z = false;
        while (spliterator.estimateSize() > j && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            j$.util.stream.s0 s0Var = new j$.util.stream.s0(this, spliteratorTrySplit, this.f);
            j$.util.stream.s0 s0Var2 = new j$.util.stream.s0(this, spliterator, s0Var);
            this.addToPendingCount(1);
            s0Var2.addToPendingCount(1);
            this.d.put(s0Var, s0Var2);
            if (this.f != null) {
                s0Var.addToPendingCount(1);
                if (this.d.replace(this.f, this, s0Var)) {
                    this.addToPendingCount(-1);
                } else {
                    s0Var.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                this = s0Var;
                s0Var = s0Var2;
            } else {
                this = s0Var2;
            }
            z = !z;
            s0Var.fork();
        }
        if (this.getPendingCount() > 0) {
            j$.util.stream.r0 r0Var = new j$.util.stream.r0(b);
            j$.util.stream.a aVar = this.a;
            j$.util.stream.m2 m2VarG = aVar.G(aVar.q(spliterator), r0Var);
            this.a.O(spliterator, m2VarG);
            this.g = m2VarG.build();
            this.b = null;
        }
        this.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.u2 u2Var = this.g;
        if (u2Var != null) {
            u2Var.forEach(this.e);
            this.g = null;
        } else {
            j$.util.Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.O(spliterator, this.e);
                this.b = null;
            }
        }
        j$.util.stream.s0 s0Var = (j$.util.stream.s0) this.d.remove(this);
        if (s0Var != null) {
            s0Var.tryComplete();
        }
    }

    public s0(j$.util.stream.s0 s0Var, j$.util.Spliterator spliterator, j$.util.stream.s0 s0Var2) {
        super(s0Var);
        this.a = s0Var.a;
        this.b = spliterator;
        this.c = s0Var.c;
        this.d = s0Var.d;
        this.e = s0Var.e;
        this.f = s0Var2;
    }
}
