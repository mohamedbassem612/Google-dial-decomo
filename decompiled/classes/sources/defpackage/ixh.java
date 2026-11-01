package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ixh extends defpackage.alad implements defpackage.albi {
    public static final defpackage.ixh a;
    public int b;
    public int c;
    public java.lang.String d = "";
    public defpackage.alat e = defpackage.albq.a;

    static {
        defpackage.ixh ixhVar = new defpackage.ixh();
        a = ixhVar;
        defpackage.alad.Q(defpackage.ixh.class, ixhVar);
    }

    private ixh() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002ለ\u0000\u0003\u001b", new java.lang.Object[]{"b", "c", "d", "e", ixd.class});
        }
        if (i2 == 3) {
            return new defpackage.ixh();
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
        return defpackage.alad.M(defpackage.ixh.class);
    }

    public final void b() {
        defpackage.alat alatVar = this.e;
        if (alatVar.c()) {
            return;
        }
        this.e = defpackage.alad.J(alatVar);
    }
}
