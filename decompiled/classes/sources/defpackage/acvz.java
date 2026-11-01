package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acvz extends defpackage.alad implements defpackage.albi {
    public static final defpackage.acvz a;
    public defpackage.albe b;
    public defpackage.albe c;
    public defpackage.alat d;

    static {
        defpackage.acvz acvzVar = new defpackage.acvz();
        a = acvzVar;
        defpackage.alad.Q(defpackage.acvz.class, acvzVar);
    }

    private acvz() {
        defpackage.albe albeVar = defpackage.albe.a;
        this.b = albeVar;
        this.c = albeVar;
        this.d = defpackage.albq.a;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            defpackage.alcr alcrVar = defpackage.alcr.STRING;
            defpackage.alcr alcrVar2 = defpackage.alcr.MESSAGE;
            return new defpackage.albr(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new java.lang.Object[]{"b", new defpackage.ajyk(alcrVar, "", alcrVar2, acvu.a), "c", new defpackage.ajyk(alcrVar, "", alcrVar2, acwc.a), "d", acvu.class});
        }
        if (i2 == 3) {
            return new defpackage.acvz();
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
        return defpackage.alad.M(defpackage.acvz.class);
    }

    public final defpackage.albe b() {
        defpackage.albe albeVar = this.b;
        if (!albeVar.b) {
            this.b = albeVar.a();
        }
        return this.b;
    }
}
