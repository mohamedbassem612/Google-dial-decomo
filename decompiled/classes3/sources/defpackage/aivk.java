package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aivk extends alad implements albi {
    public static final defpackage.aivk a;
    private byte c = 2;
    public alat b = albq.a;

    static {
        defpackage.aivk aivkVar = new defpackage.aivk();
        a = aivkVar;
        alad.Q(defpackage.aivk.class, aivkVar);
    }

    private aivk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new java.lang.Object[]{"b", defpackage.aivj.class});
        }
        if (i2 == 3) {
            return new defpackage.aivk();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aivk.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
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
