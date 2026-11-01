package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class igs extends defpackage.alad implements defpackage.albi {
    public static final defpackage.igs a;
    public int b;
    private byte e = 2;
    public defpackage.alat c = defpackage.albq.a;
    public java.lang.String d = "";

    static {
        defpackage.igs igsVar = new defpackage.igs();
        a = igsVar;
        defpackage.alad.Q(defpackage.igs.class, igsVar);
    }

    private igs() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ለ\u0000", new java.lang.Object[]{"b", "c", igr.class, "d"});
        }
        if (i2 == 3) {
            return new defpackage.igs();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.igs.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        defpackage.alat alatVar = this.c;
        if (alatVar.c()) {
            return;
        }
        this.c = defpackage.alad.J(alatVar);
    }
}
