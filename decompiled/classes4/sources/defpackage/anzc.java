package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anzc extends defpackage.anwl {
    final defpackage.anmv j;
    final defpackage.anpk k;
    final anmb l;
    final /* synthetic */ anzd m;
    private final long n;
    private boolean o;
    private boolean p;

    /* JADX WARN: Illegal instructions before constructor call */
    public anzc(anzd anzdVar, defpackage.anmv anmvVar, defpackage.anpk anpkVar, anmb anmbVar) {
        j$.util.Objects.requireNonNull(anzdVar);
        this.m = anzdVar;
        anzg anzgVar = anzdVar.c;
        super(anzgVar.e(anmbVar), anzgVar.k, anmbVar.b);
        this.j = anmvVar;
        this.k = anpkVar;
        this.l = anmbVar;
        this.n = java.lang.System.nanoTime();
    }

    private final synchronized void dP() {
        if (!this.p) {
            this.p = true;
            if (this.o) {
                for (anty antyVar : this.l.d) {
                }
            }
        }
    }

    @Override // defpackage.anwl
    protected final void c() {
        dP();
        this.m.c.n.execute(new defpackage.anwo(this, 20));
    }

    public final synchronized void dN() {
        if (!this.p && !this.o) {
            this.o = true;
            for (anty antyVar : this.l.d) {
                if (this.p) {
                    break;
                }
            }
        }
    }

    final void dO() {
        defpackage.anwg anwgVar;
        dP();
        defpackage.anmv anmvVarA = this.j.a();
        try {
            anmb anmbVar = this.l;
            anma anmaVar = anmg.f;
            ajsz ajszVarD = this.m.d(this.k, anmbVar.e(anmaVar, java.lang.Long.valueOf(java.lang.System.nanoTime() - this.n)));
            this.j.f(anmvVarA);
            synchronized (this) {
                anwgVar = null;
                if (this.g == null) {
                    super.dM(ajszVarD);
                    defpackage.anwk anwkVar = this.f;
                    if (anwkVar == null) {
                        this.e = null;
                        this.d = true;
                    } else {
                        super.f(anwkVar);
                        anwgVar = new defpackage.anwg(this, this.c);
                    }
                }
            }
            anzd anzdVar = this.m;
            if (anwgVar == null) {
                anzdVar.c.n.execute(new defpackage.anwo(this, 20));
            } else {
                anzdVar.c.e(this.l).execute(new anxz(this, anwgVar, 4));
            }
        } catch (java.lang.Throwable th) {
            this.j.f(anmvVarA);
            throw th;
        }
    }
}
