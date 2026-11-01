package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiwk extends alad implements albi {
    public static final defpackage.aiwk a;
    public int b;
    public java.lang.Object d;
    public defpackage.aiwh e;
    public int c = 0;
    private byte g = 2;
    public alat f = albq.a;

    static {
        defpackage.aiwk aiwkVar = new defpackage.aiwk();
        a = aiwkVar;
        alad.Q(defpackage.aiwk.class, aiwkVar);
    }

    private aiwk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new java.lang.Object[]{"d", "c", "b", "e", "f", defpackage.aiwh.class, defpackage.aiwi.class});
        }
        if (i2 == 3) {
            return new defpackage.aiwk();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aiwk.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        alat alatVar = this.f;
        if (alatVar.c()) {
            return;
        }
        this.f = alad.J(alatVar);
    }
}
