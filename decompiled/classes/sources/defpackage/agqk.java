package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agqk extends defpackage.alad implements defpackage.albi {
    public static final defpackage.agqk a;
    public int b;
    public defpackage.albe d = defpackage.albe.a;
    private byte e = 2;
    public int c = 1;

    static {
        defpackage.agqk agqkVar = new defpackage.agqk();
        a = agqkVar;
        defpackage.alad.Q(defpackage.agqk.class, agqkVar);
    }

    private agqk() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001င\u0000\u0002в", new java.lang.Object[]{"b", "c", "d", new defpackage.ajyk(defpackage.alcr.INT32, 0, defpackage.alcr.MESSAGE, defpackage.agqm.a)});
        }
        if (i2 == 3) {
            return new defpackage.agqk();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.agqk.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final defpackage.albe b() {
        defpackage.albe albeVar = this.d;
        if (!albeVar.b) {
            this.d = albeVar.a();
        }
        return this.d;
    }
}
