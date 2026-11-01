package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alsk extends alad implements albi {
    public static final defpackage.alsk a;
    public static final apdi d;
    public int b;
    public java.lang.String c = "";

    static {
        defpackage.alsk alskVar = new defpackage.alsk();
        a = alskVar;
        alad.Q(defpackage.alsk.class, alskVar);
        d = alad.W(defpackage.alro.a, alskVar, alskVar, 122, alcr.k);
    }

    private alsk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.alsk();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return alad.M(defpackage.alsk.class);
    }
}
