package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kwy extends defpackage.alad implements defpackage.albi {
    public static final defpackage.kwy a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public defpackage.alat h = defpackage.albq.a;
    public int i;

    static {
        defpackage.kwy kwyVar = new defpackage.kwy();
        a = kwyVar;
        defpackage.alad.Q(defpackage.kwy.class, kwyVar);
    }

    private kwy() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006\u001a\u0007᠌\u0005", new java.lang.Object[]{"b", "c", "d", jxq.i, "e", "f", "g", "h", "i", jxq.h});
        }
        if (i2 == 3) {
            return new defpackage.kwy();
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
        return defpackage.alad.M(defpackage.kwy.class);
    }

    public final void b() {
        defpackage.alat alatVar = this.h;
        if (alatVar.c()) {
            return;
        }
        this.h = defpackage.alad.J(alatVar);
    }
}
