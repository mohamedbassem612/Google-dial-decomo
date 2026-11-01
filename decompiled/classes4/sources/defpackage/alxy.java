package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alxy extends alad implements albi {
    public static final defpackage.alxy a;
    public static final apdi i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        defpackage.alxy alxyVar = new defpackage.alxy();
        a = alxyVar;
        alad.Q(defpackage.alxy.class, alxyVar);
        i = alad.W(defpackage.alwp.a, alxyVar, alxyVar, 100, alcr.k);
    }

    private alxy() {
    }

    protected final java.lang.Object a(int i2, java.lang.Object obj) {
        int i3 = i2 - 1;
        if (i3 == 2) {
            alai alaiVar = defpackage.alwx.l;
            return new albr(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0005\u0006᠌\u0004", new java.lang.Object[]{"b", "c", alaiVar, "d", defpackage.alwx.j, "e", alaiVar, "f", defpackage.aloy.k, "h", defpackage.alwx.k, "g", defpackage.aloy.m});
        }
        if (i3 == 3) {
            return new defpackage.alxy();
        }
        if (i3 == 4) {
            return new akzx(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            return null;
        }
        return alad.M(defpackage.alxy.class);
    }
}
