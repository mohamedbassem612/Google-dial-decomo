package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aopk {
    public static final defpackage.aopj a = new defpackage.aopj();
    public static final defpackage.aopk b;

    static {
        java.lang.Integer num = defpackage.aomo.a;
        b = (num == null || num.intValue() >= 34) ? new defpackage.aopl() : new aoph();
    }

    public long a() {
        throw null;
    }

    public int c() {
        throw null;
    }

    public long d() {
        return fw();
    }

    public long fw() {
        long jA;
        long j;
        do {
            jA = a() >>> 1;
            j = jA % 3000;
        } while ((jA - j) + 2999 < 0);
        return j;
    }
}
