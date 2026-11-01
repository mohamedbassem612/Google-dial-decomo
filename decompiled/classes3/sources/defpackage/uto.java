package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uto implements defpackage.tev {
    public final defpackage.teo a = defpackage.teo.a;
    private final aenj b = new aenj("SearchSection.TimeKeeperSearchSection");

    @Override // defpackage.tev
    public final aenj a() {
        return this.b;
    }

    @Override // defpackage.tev
    public final java.lang.Object b(defpackage.tet tetVar, defpackage.tej tejVar, aoln aolnVar) {
        throw null;
    }

    public final void c(defpackage.utp utpVar, defpackage.ten tenVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-1668353887);
        if (i3 == 0) {
            i2 = (true != cbtVarB.D(utpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            cmw cmwVarD = azm.d(cmw.c, 1.0f);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                objR = defpackage.utn.a;
                cbtVar.ab(objR);
            }
            aonj aonjVar = (aonj) objR;
            boolean zD = cbtVarB.D(utpVar);
            java.lang.Object objR2 = cbtVar.R();
            if (zD || objR2 == obj) {
                objR2 = new tge(utpVar, 10);
                cbtVar.ab(objR2);
            }
            dqi.a(aonjVar, cmwVarD, (aonj) objR2, cbtVarB, 54, 0);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ppx(this, utpVar, tenVar, i, 15);
        }
    }
}
