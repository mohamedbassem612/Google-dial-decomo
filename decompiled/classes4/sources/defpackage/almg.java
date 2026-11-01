package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class almg extends alad implements albi {
    public static final defpackage.almg a;
    public static final apdi d;
    public alat b;
    public alat c;

    static {
        defpackage.almg almgVar = new defpackage.almg();
        a = almgVar;
        alad.Q(defpackage.almg.class, almgVar);
        d = alad.W(defpackage.almz.a, almgVar, almgVar, 130, alcr.k);
    }

    private almg() {
        albq albqVar = albq.a;
        this.b = albqVar;
        this.c = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new java.lang.Object[]{"b", defpackage.alnr.class, "c", defpackage.alnr.class});
        }
        if (i2 == 3) {
            return new defpackage.almg();
        }
        if (i2 == 4) {
            return new akzx((float[][]) null, (byte[]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.almg.class);
        }
        return null;
    }

    public final void b() {
        alat alatVar = this.b;
        if (alatVar.c()) {
            return;
        }
        this.b = alad.J(alatVar);
    }
}
