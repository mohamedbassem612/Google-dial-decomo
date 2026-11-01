package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vml extends defpackage.alad implements defpackage.albi {
    public static final defpackage.vml a;
    public defpackage.alat b = defpackage.albq.a;

    static {
        defpackage.vml vmlVar = new defpackage.vml();
        a = vmlVar;
        defpackage.alad.Q(defpackage.vml.class, vmlVar);
    }

    private vml() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.vmk.class});
        }
        if (i2 == 3) {
            return new defpackage.vml();
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
        return defpackage.alad.M(defpackage.vml.class);
    }

    public final void b() {
        defpackage.alat alatVar = this.b;
        if (alatVar.c()) {
            return;
        }
        this.b = alatVar.d(alatVar.size() << 1);
    }
}
