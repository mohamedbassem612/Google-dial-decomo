package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p6 extends j$.util.stream.b {
    public final j$.util.stream.a j;
    public final java.util.function.IntFunction k;
    public final long l;
    public final long m;
    public long n;
    public volatile boolean o;

    public p6(j$.util.stream.p6 p6Var, j$.util.Spliterator spliterator) {
        super(p6Var, spliterator);
        this.j = p6Var.j;
        this.k = p6Var.k;
        this.l = p6Var.l;
        this.m = p6Var.m;
    }

    @Override // j$.util.stream.d
    public final java.lang.Object a() {
        if (d()) {
            j$.util.stream.v7 v7Var = j$.util.stream.v7.SIZED;
            j$.util.stream.a aVar = this.j;
            int i = aVar.c;
            int i2 = v7Var.e;
            j$.util.stream.m2 m2VarG = this.j.G((i & i2) == i2 ? aVar.q(this.b) : -1L, this.k);
            j$.util.stream.f6 f6VarK = this.j.K(this.a.f, m2VarG);
            j$.util.stream.a aVar2 = this.a;
            aVar2.i(this.b, aVar2.P(f6VarK));
            return m2VarG.build();
        }
        j$.util.stream.m2 m2VarG2 = this.j.G(-1L, this.k);
        if (this.l == 0) {
            j$.util.stream.f6 f6VarK2 = this.j.K(this.a.f, m2VarG2);
            j$.util.stream.a aVar3 = this.a;
            aVar3.i(this.b, aVar3.P(f6VarK2));
        } else {
            this.a.O(this.b, m2VarG2);
        }
        j$.util.stream.u2 u2VarBuild = m2VarG2.build();
        this.n = u2VarBuild.count();
        this.o = true;
        this.b = null;
        return u2VarBuild;
    }

    @Override // j$.util.stream.d
    public final j$.util.stream.d e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.p6(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void h() {
        this.i = true;
        if (this.o) {
            f(j$.util.stream.n4.E(this.j.E()));
        }
    }

    @Override // j$.util.stream.b
    public final java.lang.Object j() {
        return j$.util.stream.n4.E(this.j.E());
    }

    public final long l(long j) {
        if (this.o) {
            return this.n;
        }
        j$.util.stream.p6 p6Var = (j$.util.stream.p6) this.d;
        j$.util.stream.p6 p6Var2 = (j$.util.stream.p6) this.e;
        if (p6Var == null || p6Var2 == null) {
            return this.n;
        }
        long jL = p6Var.l(j);
        return jL >= j ? jL : p6Var2.l(j) + jL;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.p6 p6Var;
        j$.util.stream.u2 u2VarC;
        j$.util.stream.d dVar = this.d;
        int i = 1;
        if (dVar != null) {
            this.n = ((j$.util.stream.p6) dVar).n + ((j$.util.stream.p6) this.e).n;
            if (this.i) {
                this.n = 0L;
                u2VarC = j$.util.stream.n4.E(this.j.E());
            } else if (this.n == 0) {
                u2VarC = j$.util.stream.n4.E(this.j.E());
            } else {
                u2VarC = ((j$.util.stream.p6) this.d).n == 0 ? (j$.util.stream.u2) ((j$.util.stream.p6) this.e).k() : j$.util.stream.n4.C(this.j.E(), (j$.util.stream.u2) ((j$.util.stream.p6) this.d).k(), (j$.util.stream.u2) ((j$.util.stream.p6) this.e).k());
            }
            j$.util.stream.u2 u2VarG = u2VarC;
            if (d()) {
                u2VarG = u2VarG.g(this.l, this.m >= 0 ? java.lang.Math.min(u2VarG.count(), this.l + this.m) : this.n, this.k);
            }
            f(u2VarG);
            this.o = true;
        }
        if (this.m >= 0 && !d()) {
            long j = this.l + this.m;
            long jL = this.o ? this.n : l(j);
            if (jL < j) {
                j$.util.stream.p6 p6Var2 = (j$.util.stream.p6) b();
                java.lang.Object obj = this;
                while (true) {
                    if (p6Var2 == null) {
                        i = ((jL > j ? 1 : (jL == j ? 0 : -1)) ^ (-1)) >>> 31;
                        break;
                    }
                    if (obj == p6Var2.e && (p6Var = (j$.util.stream.p6) p6Var2.d) != null) {
                        long jL2 = p6Var.l(j) + jL;
                        if (jL2 >= j) {
                            break;
                        } else {
                            jL = jL2;
                        }
                    }
                    obj = p6Var2;
                    p6Var2 = (j$.util.stream.p6) p6Var2.b();
                }
            }
            if (i != 0) {
                i();
            }
        }
        super.onCompletion(countedCompleter);
    }

    public p6(j$.util.stream.a aVar, j$.util.stream.a aVar2, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction, long j, long j2) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }
}
