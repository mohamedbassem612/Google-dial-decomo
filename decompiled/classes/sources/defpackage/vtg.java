package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vtg extends defpackage.alad implements defpackage.albi {
    public static final defpackage.vtg a;
    public defpackage.alat b = defpackage.albq.a;

    static {
        defpackage.vtg vtgVar = new defpackage.vtg();
        a = vtgVar;
        defpackage.alad.Q(defpackage.vtg.class, vtgVar);
    }

    private vtg() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", vtf.class});
        }
        if (i2 == 3) {
            return new defpackage.vtg();
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
        return defpackage.alad.M(defpackage.vtg.class);
    }

    public final void b() {
        defpackage.alat alatVar = this.b;
        if (alatVar.c()) {
            return;
        }
        this.b = defpackage.alad.J(alatVar);
    }
}
