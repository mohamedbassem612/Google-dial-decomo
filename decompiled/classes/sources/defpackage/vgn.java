package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vgn extends defpackage.alad implements defpackage.albi {
    public static final defpackage.vgn a;
    public defpackage.albe b = defpackage.albe.a;

    static {
        defpackage.vgn vgnVar = new defpackage.vgn();
        a = vgnVar;
        defpackage.alad.Q(defpackage.vgn.class, vgnVar);
    }

    private vgn() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"b", new defpackage.ajyk(defpackage.alcr.STRING, "", defpackage.alcr.MESSAGE, vgm.a)});
        }
        if (i2 == 3) {
            return new defpackage.vgn();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.alad.M(defpackage.vgn.class);
    }

    public final defpackage.albe b() {
        defpackage.albe albeVar = this.b;
        if (!albeVar.b) {
            this.b = albeVar.a();
        }
        return this.b;
    }
}
