package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class deb extends dye {
    final /* synthetic */ deg a;
    final /* synthetic */ dbk b;
    final /* synthetic */ deg c;
    final /* synthetic */ defpackage.dey d;

    public deb(deg degVar, dbk dbkVar, deg degVar2, defpackage.dey deyVar) {
        this.a = degVar;
        this.b = dbkVar;
        this.c = degVar2;
        this.d = deyVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    public final void c(android.view.View view, defpackage.ebd ebdVar) {
        super.c(view, ebdVar);
        deg degVar = this.a;
        dem demVar = degVar.q;
        if (demVar.C()) {
            ebdVar.W(false);
        }
        dbk dbkVar = this.b;
        dbk dbkVarK = dbkVar.k();
        while (true) {
            if (dbkVarK == null) {
                dbkVarK = null;
                break;
            } else if (dbkVarK.v.i(8)) {
                break;
            } else {
                dbkVarK = dbkVarK.k();
            }
        }
        java.lang.Integer numValueOf = dbkVarK != null ? java.lang.Integer.valueOf(dbkVarK.c) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == degVar.p.a().c) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        android.view.View view2 = this.c;
        ebdVar.K(view2, numValueOf.intValue());
        int i = dbkVar.c;
        int iD = demVar.v.d(i);
        if (iD != -1) {
            defpackage.dey deyVar = this.d;
            android.view.View viewB = deyVar != null ? dff.b(deyVar, iD) : null;
            if (viewB != null) {
                ebdVar.U(viewB);
            } else {
                ebdVar.V(view2, iD);
            }
            degVar.af(i, ebdVar.a, demVar.n);
        }
        int iD2 = demVar.w.d(i);
        if (iD2 != -1) {
            defpackage.dey deyVar2 = this.d;
            android.view.View viewB2 = deyVar2 != null ? dff.b(deyVar2, iD2) : null;
            if (viewB2 != null) {
                ebdVar.T(viewB2);
            } else {
                ebdVar.a.setTraversalAfter(view2, iD2);
            }
            degVar.af(i, ebdVar.a, demVar.o);
        }
    }
}
