package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alri extends alad implements albi {
    public static final defpackage.alri a;
    public static final apdi e;
    public alat b;
    public albe c;
    public albe d;

    static {
        defpackage.alri alriVar = new defpackage.alri();
        a = alriVar;
        alad.Q(defpackage.alri.class, alriVar);
        e = alad.W(defpackage.alsi.a, alriVar, alriVar, 108, alcr.k);
    }

    private alri() {
        albe albeVar = albe.a;
        this.c = albeVar;
        this.d = albeVar;
        this.b = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            alcr alcrVar = alcr.i;
            alcr alcrVar2 = alcr.m;
            return new albr(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u0001\u001a\u00022\u00032", new java.lang.Object[]{"b", "c", new ajyk(alcrVar, "", alcrVar2, 0), "d", new ajyk(alcrVar, "", alcrVar2, 0)});
        }
        if (i2 == 3) {
            return new defpackage.alri();
        }
        if (i2 == 4) {
            return new akzx((char[][]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alri.class);
        }
        return null;
    }

    public final albe b() {
        albe albeVar = this.c;
        if (!albeVar.b) {
            this.c = albeVar.a();
        }
        return this.c;
    }

    public final albe c() {
        albe albeVar = this.d;
        if (!albeVar.b) {
            this.d = albeVar.a();
        }
        return this.d;
    }
}
