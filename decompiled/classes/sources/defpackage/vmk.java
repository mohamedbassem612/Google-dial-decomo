package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vmk extends defpackage.alad implements defpackage.albi {
    public static final defpackage.vmk a;
    public int b;
    public java.lang.String c = "";
    public long d;
    public long e;

    static {
        defpackage.vmk vmkVar = new defpackage.vmk();
        a = vmkVar;
        defpackage.alad.Q(defpackage.vmk.class, vmkVar);
    }

    private vmk() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဂ\u0000\u0003ဂ\u0001", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.vmk();
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
        return defpackage.alad.M(defpackage.vmk.class);
    }
}
