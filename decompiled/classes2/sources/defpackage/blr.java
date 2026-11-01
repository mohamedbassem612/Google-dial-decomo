package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blr implements defpackage.bgw {
    final /* synthetic */ boolean a;
    final /* synthetic */ defpackage.blw b;
    private long c = 9205357640488583168L;
    private long d = 0;

    public blr(boolean z, defpackage.blw blwVar) {
        this.a = z;
        this.b = blwVar;
    }

    private final void g() {
        defpackage.blw blwVar = this.b;
        blwVar.u(true);
        blwVar.p(null);
        blwVar.o(null);
    }

    @Override // defpackage.bgw
    public final void a() {
        g();
    }

    @Override // defpackage.bgw
    public final void b(long j) {
        defpackage.blw blwVar = this.b;
        if (blwVar.b() != null) {
            long jBl = mni.bl(this.d, j);
            this.d = jBl;
            long jBl2 = mni.bl(this.c, jBl);
            if (blwVar.D(jBl2, this.c, this.a, defpackage.bkr.d)) {
                this.c = jBl2;
                this.d = 0L;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    @Override // defpackage.bgw
    public final void c(long j, defpackage.bks bksVar) throws aoiq {
        defpackage.blw blwVar = this.b;
        if (blwVar.b() != null) {
            defpackage.bko bkoVarC = blwVar.c();
            aooh.c(bkoVarC);
            boolean z = this.a;
            java.lang.Object objA = blwVar.a.k.a((z ? bkoVarC.a : bkoVarC.b).b);
            if (objA == null) {
                defpackage.avo.b("SelectionRegistrar should contain the current selection's selectableIds");
                throw new aoiq();
            }
            defpackage.bke bkeVar = (defpackage.bke) objA;
            cxi cxiVarG = bkeVar.g();
            if (cxiVarG == null) {
                defpackage.avo.b("Current selectable should have layout coordinates.");
                throw new aoiq();
            }
            long jE = bkeVar.e(bkoVarC, z);
            if ((9223372034707292159L & jE) != 9205357640488583168L) {
                this.c = blwVar.k().i(cxiVarG, defpackage.blf.a(jE));
                this.d = 0L;
            }
        }
    }

    @Override // defpackage.bgw
    public final void d() {
        g();
    }

    @Override // defpackage.bgw
    public final void e() {
        g();
    }

    @Override // defpackage.bgw
    public final void f() {
        defpackage.blw blwVar;
        defpackage.bko bkoVarC;
        cxi cxiVarG;
        boolean z = this.a;
        defpackage.blw blwVar2 = this.b;
        if ((z ? blwVar2.f() : blwVar2.e()) == null || (bkoVarC = (blwVar = this.b).c()) == null) {
            return;
        }
        defpackage.bke bkeVarE = blwVar.E(z ? bkoVarC.a : bkoVarC.b);
        if (bkeVarE == null || (cxiVarG = bkeVarE.g()) == null) {
            return;
        }
        long jE = bkeVarE.e(bkoVarC, z);
        if ((9223372034707292159L & jE) != 9205357640488583168L) {
            blwVar.o(new cpm(blwVar.k().i(cxiVarG, defpackage.blf.a(jE))));
            blwVar.p(z ? defpackage.bgp.b : defpackage.bgp.c);
            blwVar.u(false);
        }
    }
}
