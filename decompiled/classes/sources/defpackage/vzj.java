package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vzj extends defpackage.alad implements defpackage.albi {
    public static final defpackage.vzj a;
    public int b;
    public defpackage.alat c = defpackage.albq.a;
    public boolean d;

    static {
        defpackage.vzj vzjVar = new defpackage.vzj();
        a = vzjVar;
        defpackage.alad.Q(defpackage.vzj.class, vzjVar);
    }

    private vzj() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new java.lang.Object[]{"b", "c", defpackage.vzi.class, "d"});
        }
        if (i2 == 3) {
            return new defpackage.vzj();
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
        return defpackage.alad.M(defpackage.vzj.class);
    }

    public final void b() {
        defpackage.alat alatVar = this.c;
        if (alatVar.c()) {
            return;
        }
        this.c = defpackage.alad.J(alatVar);
    }
}
