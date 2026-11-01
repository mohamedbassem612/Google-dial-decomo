package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aevo {
    static final defpackage.aevp a = new defpackage.aeuz(defpackage.apga.a, true);
    private final java.util.Random b;
    private final defpackage.aizr c;
    private final defpackage.aeuy d;

    public aevo(java.util.Random random) {
        this.b = random;
        this.d = null;
        this.c = null;
    }

    public final defpackage.aevp a(defpackage.apga apgaVar) {
        defpackage.aizr aizrVar;
        int iAM = defpackage.a.aM(apgaVar.e);
        if (iAM == 0) {
            iAM = 1;
        }
        int i = iAM - 1;
        if (i == 1) {
            return new aevc(apgaVar, defpackage.aevn.c(apgaVar).e());
        }
        if (i == 3) {
            return new aevf(apgaVar, this.b.nextDouble());
        }
        if (i != 4) {
            return new defpackage.aeuz(apgaVar, true);
        }
        defpackage.aeuy aeuyVar = this.d;
        return (aeuyVar == null || (aizrVar = this.c) == null) ? a : new aevb(apgaVar, defpackage.aevn.c(apgaVar), this.b, aeuyVar, aizrVar);
    }

    public aevo(java.util.Random random, defpackage.aeuy aeuyVar, defpackage.aizr aizrVar) {
        this.b = random;
        this.c = aizrVar;
        this.d = aeuyVar;
    }
}
