package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahk {
    public static final defpackage.aku a = new defpackage.aku(1.0f, 400.0f, defpackage.amd.a);
    public static final defpackage.den b = new defpackage.den((short[]) null);

    static {
        new defpackage.adw(6);
    }

    public static final void a(defpackage.aonp aonpVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1908320054);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.den.A(defpackage.cfo.j(2062852661, new defpackage.kcc(aonpVar, i4), cavVarB), cavVarB, 6);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ajs(aonpVar, i, 1);
        }
    }

    public static final void b(defpackage.cmw cmwVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(646379026);
        int i2 = i | 6;
        int i3 = 1;
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonoVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cmwVar = defpackage.cmw.c;
            a(defpackage.cfo.j(1948801580, new defpackage.baq(aonoVar, i3), cavVarB), cavVarB, 6);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new amv(cmwVar, aonoVar, i, 1);
        }
    }
}
