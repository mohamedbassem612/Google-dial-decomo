package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mze extends alad implements albi {
    public static final defpackage.mze a;
    public alat b = albq.a;
    public boolean c;

    static {
        defpackage.mze mzeVar = new defpackage.mze();
        a = mzeVar;
        alad.Q(defpackage.mze.class, mzeVar);
    }

    private mze() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new java.lang.Object[]{"b", defpackage.mzg.class, "c"});
        }
        if (i2 == 3) {
            return new defpackage.mze();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return alad.M(defpackage.mze.class);
    }

    public final void b() {
        alat alatVar = this.b;
        if (alatVar.c()) {
            return;
        }
        this.b = alad.J(alatVar);
    }
}
