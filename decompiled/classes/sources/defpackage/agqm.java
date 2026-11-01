package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agqm extends defpackage.alad implements defpackage.albi {
    public static final defpackage.agqm a;
    public int b;
    public int c;
    public defpackage.agoq d;
    public int e;
    private byte f = 2;

    static {
        defpackage.agqm agqmVar = new defpackage.agqm();
        a = agqmVar;
        defpackage.alad.Q(defpackage.agqm.class, agqmVar);
    }

    private agqm() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003᠌\u0002", new java.lang.Object[]{"b", "c", "d", "e", defpackage.udi.o});
        }
        if (i2 == 3) {
            return new defpackage.agqm();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.agqm.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
