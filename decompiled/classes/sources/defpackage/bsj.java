package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bsj {
    public static final /* synthetic */ int a = 0;

    static {
        new defpackage.cet(new defpackage.ns(15));
    }

    public static final void a(defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(442516910);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aonnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cavVarB.u(1766838549);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.W(false);
            cavVarB.u(1767392772);
            aonnVar.a(cavVarB, java.lang.Integer.valueOf(i2 & 14));
            cbtVar.W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ajs(aonnVar, i, 9);
        }
    }
}
