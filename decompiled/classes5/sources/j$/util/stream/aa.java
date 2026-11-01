package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class aa extends j$.util.stream.d {
    public final j$.util.stream.a h;
    public final java.util.function.IntFunction i;
    public final boolean j;
    public long k;
    public long l;

    public aa(j$.util.stream.a aVar, j$.util.stream.a aVar2, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        super(aVar2, spliterator);
        this.h = aVar;
        this.i = intFunction;
        this.j = j$.util.stream.v7.ORDERED.p(aVar2.f);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // j$.util.stream.d
    public final java.lang.Object a() {
        long jQ;
        boolean zD = d();
        if (zD || !this.j) {
            jQ = -1;
        } else {
            j$.util.stream.v7 v7Var = j$.util.stream.v7.SIZED;
            j$.util.stream.a aVar = this.h;
            int i = aVar.c;
            int i2 = v7Var.e;
            if ((i & i2) == i2) {
                jQ = aVar.q(this.b);
            } else {
                jQ = -1;
            }
        }
        j$.util.stream.m2 m2VarG = this.a.G(jQ, this.i);
        j$.util.stream.z9 z9VarE = ((j$.util.stream.y9) this.h).e(m2VarG, this.j && !zD);
        this.a.O(this.b, z9VarE);
        j$.util.stream.u2 u2VarBuild = m2VarG.build();
        this.k = u2VarBuild.count();
        this.l = z9VarE.z();
        return u2VarBuild;
    }

    @Override // j$.util.stream.d
    public final j$.util.stream.d e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.aa(this, spliterator);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.u2 u2VarC;
        j$.util.stream.d dVar = this.d;
        if (dVar != null) {
            if (this.j) {
                j$.util.stream.aa aaVar = (j$.util.stream.aa) dVar;
                long j = aaVar.l;
                this.l = j;
                if (j == aaVar.k) {
                    this.l = j + ((j$.util.stream.aa) this.e).l;
                }
            }
            j$.util.stream.aa aaVar2 = (j$.util.stream.aa) dVar;
            long j2 = aaVar2.k;
            j$.util.stream.aa aaVar3 = (j$.util.stream.aa) this.e;
            this.k = j2 + aaVar3.k;
            if (aaVar2.k == 0) {
                u2VarC = (j$.util.stream.u2) aaVar3.f;
            } else {
                u2VarC = aaVar3.k == 0 ? (j$.util.stream.u2) aaVar2.f : j$.util.stream.n4.C(this.h.E(), (j$.util.stream.u2) ((j$.util.stream.aa) this.d).f, (j$.util.stream.u2) ((j$.util.stream.aa) this.e).f);
            }
            if (d() && this.j) {
                u2VarC = u2VarC.g(this.l, u2VarC.count(), this.i);
            }
            this.f = u2VarC;
        }
        super.onCompletion(countedCompleter);
    }

    public aa(j$.util.stream.aa aaVar, j$.util.Spliterator spliterator) {
        super(aaVar, spliterator);
        this.h = aaVar.h;
        this.i = aaVar.i;
        this.j = aaVar.j;
    }
}
