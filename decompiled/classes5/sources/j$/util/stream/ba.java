package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class ba extends j$.util.stream.b {
    public final j$.util.stream.a j;
    public final java.util.function.IntFunction k;
    public final boolean l;
    public long m;
    public boolean n;
    public volatile boolean o;

    public ba(j$.util.stream.a aVar, j$.util.stream.a aVar2, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        super(aVar2, spliterator);
        this.j = aVar;
        this.k = intFunction;
        this.l = j$.util.stream.v7.ORDERED.p(aVar2.f);
    }

    @Override // j$.util.stream.d
    public final java.lang.Object a() {
        j$.util.stream.m2 m2VarG = this.a.G(-1L, this.k);
        j$.util.stream.f6 f6VarK = this.j.K(this.a.f, m2VarG);
        j$.util.stream.a aVar = this.a;
        boolean zI = aVar.i(this.b, aVar.P(f6VarK));
        this.n = zI;
        if (zI) {
            i();
        }
        j$.util.stream.u2 u2VarBuild = m2VarG.build();
        this.m = u2VarBuild.count();
        return u2VarBuild;
    }

    @Override // j$.util.stream.d
    public final j$.util.stream.d e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.ba(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final void h() {
        this.i = true;
        if (this.l && this.o) {
            f(j$.util.stream.n4.E(this.j.E()));
        }
    }

    @Override // j$.util.stream.b
    public final java.lang.Object j() {
        return j$.util.stream.n4.E(this.j.E());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.ba baVar;
        j$.util.stream.ba baVar2;
        java.lang.Object objC;
        j$.util.stream.d dVar = this.d;
        if (dVar != null) {
            this.n = ((j$.util.stream.ba) dVar).n | ((j$.util.stream.ba) this.e).n;
            if (this.l && this.i) {
                this.m = 0L;
                objC = j$.util.stream.n4.E(this.j.E());
            } else if (this.l) {
                j$.util.stream.ba baVar3 = (j$.util.stream.ba) this.d;
                if (baVar3.n) {
                    this.m = baVar3.m;
                    objC = (j$.util.stream.u2) baVar3.k();
                } else {
                    baVar = (j$.util.stream.ba) this.d;
                    long j = baVar.m;
                    baVar2 = (j$.util.stream.ba) this.e;
                    this.m = j + baVar2.m;
                    if (baVar.m == 0) {
                        objC = (j$.util.stream.u2) baVar2.k();
                    } else if (baVar2.m == 0) {
                        objC = (j$.util.stream.u2) baVar.k();
                    } else {
                        objC = j$.util.stream.n4.C(this.j.E(), (j$.util.stream.u2) ((j$.util.stream.ba) this.d).k(), (j$.util.stream.u2) ((j$.util.stream.ba) this.e).k());
                    }
                }
            } else {
                baVar = (j$.util.stream.ba) this.d;
                long j2 = baVar.m;
                baVar2 = (j$.util.stream.ba) this.e;
                this.m = j2 + baVar2.m;
                if (baVar.m == 0) {
                    objC = (j$.util.stream.u2) baVar2.k();
                } else if (baVar2.m == 0) {
                    objC = (j$.util.stream.u2) baVar.k();
                } else {
                    objC = j$.util.stream.n4.C(this.j.E(), (j$.util.stream.u2) ((j$.util.stream.ba) this.d).k(), (j$.util.stream.u2) ((j$.util.stream.ba) this.e).k());
                }
            }
            f(objC);
        }
        this.o = true;
        super.onCompletion(countedCompleter);
    }

    public ba(j$.util.stream.ba baVar, j$.util.Spliterator spliterator) {
        super(baVar, spliterator);
        this.j = baVar.j;
        this.k = baVar.k;
        this.l = baVar.l;
    }
}
