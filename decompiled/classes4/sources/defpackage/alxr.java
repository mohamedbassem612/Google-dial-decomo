package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alxr extends alad implements albi {
    public static final defpackage.alxr a;
    public static final defpackage.alao i = new defpackage.alao(defpackage.alsy.NO_ACTION);
    public int b;
    public int c = 0;
    public java.lang.Object d;
    public java.lang.String e;
    public java.lang.String f;
    public albe g;
    public albe h;

    static {
        defpackage.alxr alxrVar = new defpackage.alxr();
        a = alxrVar;
        alad.Q(defpackage.alxr.class, alxrVar);
    }

    private alxr() {
        albe albeVar = albe.a;
        this.g = albeVar;
        this.h = albeVar;
        this.e = "";
        this.f = "";
    }

    protected final java.lang.Object a(int i2, java.lang.Object obj) {
        int i3 = i2 - 1;
        if (i3 == 2) {
            alcr alcrVar = alcr.i;
            return new albr(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003;\u0000\u0004<\u0000\u0005࠲\u00062", new java.lang.Object[]{"d", "c", "b", "e", "f", defpackage.alxq.class, "g", new ajyk(alcrVar, "", alcr.n, java.lang.Integer.valueOf(defpackage.alsy.NO_ACTION.j)), defpackage.aloy.n, "h", new ajyk(alcrVar, "", alcr.k, defpackage.alxf.a)});
        }
        if (i3 == 3) {
            return new defpackage.alxr();
        }
        if (i3 == 4) {
            return new akzx((int[][][]) null, (byte[]) null);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 == 6) {
            return alad.M(defpackage.alxr.class);
        }
        return null;
    }

    public final albe b() {
        albe albeVar = this.g;
        if (!albeVar.b) {
            this.g = albeVar.a();
        }
        return this.g;
    }
}
