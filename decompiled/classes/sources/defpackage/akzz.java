package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akzz extends defpackage.akzx implements defpackage.alab, defpackage.acmj {
    public akzz(defpackage.alaa alaaVar) {
        super(alaaVar);
    }

    @Override // defpackage.akzx, defpackage.albg
    /* JADX INFO: renamed from: bR, reason: merged with bridge method [inline-methods] */
    public final defpackage.alaa s() {
        boolean zU = ((defpackage.alaa) this.b).U();
        defpackage.alad aladVar = this.b;
        if (!zU) {
            return (defpackage.alaa) aladVar;
        }
        ((defpackage.alaa) aladVar).n.e();
        return (defpackage.alaa) super.s();
    }

    public final void bS(akyb akybVar) {
        u();
        akxq akxqVar = this.b;
        akxq akxqVar2 = akxq.a;
        j$.util.Objects.requireNonNull(akybVar);
        defpackage.alat alatVar = akxqVar.c;
        if (!alatVar.c()) {
            akxqVar.c = defpackage.alad.J(alatVar);
        }
        akxqVar.c.add(akybVar);
    }

    @Override // defpackage.alab
    public final java.lang.Object bT(defpackage.apdi apdiVar) {
        throw null;
    }

    @Override // defpackage.alab
    public final boolean bU(defpackage.apdi apdiVar) {
        defpackage.alaa alaaVar = (defpackage.alaa) this.b;
        alaaVar.c(apdiVar);
        return alaaVar.n.l((defpackage.alac) apdiVar.a);
    }

    public final void bV(defpackage.apdi apdiVar, java.lang.Object obj) {
        int i = defpackage.alad.Q;
        if (apdiVar.d != this.a) {
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        u();
        defpackage.akzs akzsVarB = ((defpackage.alaa) this.b).n;
        if (akzsVarB.c) {
            akzsVarB = akzsVarB.clone();
            ((defpackage.alaa) this.b).n = akzsVarB;
        }
        defpackage.alac alacVar = (defpackage.alac) apdiVar.a;
        if (alacVar.a() == defpackage.alcs.h) {
            obj = java.lang.Integer.valueOf(((defpackage.alah) obj).a());
        }
        akzsVarB.k(alacVar, obj);
    }

    @Override // defpackage.akzx
    protected final void v() {
        super.v();
        if (((defpackage.alaa) this.b).n != defpackage.akzs.a) {
            defpackage.alaa alaaVar = (defpackage.alaa) this.b;
            alaaVar.n = alaaVar.n.clone();
        }
    }

    public akzz() {
        throw null;
    }
}
