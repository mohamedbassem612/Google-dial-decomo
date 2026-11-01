package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agpu extends defpackage.alad implements defpackage.albi {
    public static final defpackage.agpu a;
    public int b;
    public boolean c;
    public defpackage.alat d = defpackage.albq.a;
    public int e;

    static {
        defpackage.agpu agpuVar = new defpackage.agpu();
        a = agpuVar;
        defpackage.alad.Q(defpackage.agpu.class, agpuVar);
    }

    private agpu() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a\u0003᠌\u0001", new java.lang.Object[]{"b", "c", "d", "e", defpackage.udi.p});
        }
        if (i2 == 3) {
            return new defpackage.agpu();
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
        return defpackage.alad.M(defpackage.agpu.class);
    }
}
