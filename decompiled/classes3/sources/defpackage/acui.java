package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acui extends alad implements albi {
    public static final defpackage.acui a;
    public int b;
    public int f;
    public int g;
    public alat h;
    public long i;
    public java.lang.String j;
    public alat k;
    public akyp l;
    public akyp m;
    public java.lang.String n;
    private byte o = 2;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";

    static {
        defpackage.acui acuiVar = new defpackage.acui();
        a = acuiVar;
        alad.Q(defpackage.acui.class, acuiVar);
    }

    private acui() {
        albq albqVar = albq.a;
        this.h = albqVar;
        this.j = "";
        this.k = albqVar;
        this.n = "";
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0002\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001\u0004င\u0003\u0005᠌\u0004\u0006ဈ\u0002\bဂ\u0005\n\u001a\u000bဉ\u0007\fဈ\u0006\rဉ\b\u000fဈ\n", new java.lang.Object[]{"b", "c", "h", defpackage.acuh.class, "d", "f", "g", defpackage.yrl.r, "e", "i", "k", "l", "j", "m", "n"});
        }
        if (i2 == 3) {
            return new defpackage.acui();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.acui.class);
        }
        this.o = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        alat alatVar = this.h;
        if (alatVar.c()) {
            return;
        }
        this.h = alad.J(alatVar);
    }
}
