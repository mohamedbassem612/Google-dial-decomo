package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class lqd implements defpackage.aono {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lqd(defpackage.lqb lqbVar, boolean z, int i) {
        this.$cid = i;
        this.b = lqbVar;
        this.a = z;
    }

    @Override // defpackage.aono
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (this.$cid != 0) {
            defpackage.nf nfVar = (defpackage.nf) obj;
            defpackage.cav cavVar = (defpackage.cav) obj2;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            if (nfVar == null) {
                defpackage.aooh.i("$this$item");
            }
            if (!cavVar.H((iIntValue & 17) != 16, iIntValue & 1)) {
                cavVar.s();
            } else if (this.a) {
                cavVar.u(1846843671);
                hgt.C((defpackage.cmw) null, cavVar, 0);
                cavVar.o();
            } else {
                java.lang.Object obj4 = this.b;
                cavVar.u(1846892558);
                defpackage.kcq.h(((defpackage.kca) obj4).f, null, cavVar, 0);
                cavVar.o();
            }
            return defpackage.aojh.a;
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        defpackage.acqy acqyVar = (defpackage.acqy) obj2;
        java.lang.Boolean bool2 = (java.lang.Boolean) obj3;
        bool2.booleanValue();
        if (acqyVar == null) {
            defpackage.aooh.i("tonalPalette");
        }
        java.lang.Object obj5 = this.b;
        defpackage.aonn aonnVar = defpackage.abny.a;
        java.lang.Object objA = new defpackage.abnt().a(bool, acqyVar, bool2);
        if (obj5 == null) {
            defpackage.aooh.i("colors");
        }
        boolean z = this.a;
        defpackage.lqb lqbVar = (defpackage.lqb) obj5;
        defpackage.bor borVarA = defpackage.bor.a((defpackage.bor) objA, ((long) lqbVar.a) << 32, ((long) lqbVar.b) << 32, ((long) lqbVar.c) << 32, ((long) lqbVar.d) << 32, ((long) lqbVar.e) << 32, ((long) lqbVar.f) << 32, ((long) lqbVar.g) << 32, ((long) lqbVar.h) << 32, ((long) lqbVar.i) << 32, ((long) lqbVar.j) << 32, ((long) lqbVar.k) << 32, ((long) lqbVar.l) << 32, ((long) lqbVar.m) << 32, 533233663, 65520);
        return z ? defpackage.bor.a(borVarA, 0L, -4294967296L, 0L, -4294967296L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -327681, 65535) : borVarA;
    }

    public /* synthetic */ lqd(boolean z, defpackage.kca kcaVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = kcaVar;
    }
}
