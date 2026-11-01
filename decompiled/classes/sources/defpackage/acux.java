package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acux extends defpackage.alad implements defpackage.albi {
    public static final defpackage.acux a;
    public int b;
    public int e;
    public long f;
    public defpackage.acuz g;
    public defpackage.alat h;
    public long i;
    public java.lang.String j;
    public defpackage.alat k;
    private defpackage.albe l = defpackage.albe.a;
    private byte m = 2;
    public java.lang.String c = "";
    public java.lang.String d = "";

    static {
        defpackage.acux acuxVar = new defpackage.acux();
        a = acuxVar;
        defpackage.alad.Q(defpackage.acux.class, acuxVar);
    }

    private acux() {
        defpackage.albq albqVar = defpackage.albq.a;
        this.h = albqVar;
        this.j = "";
        this.k = albqVar;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\n\u0000\u0001\u0001\u001f\n\u0001\u0002\u0001\u0001ဈ\u0000\u0002Л\u0003ဂ\t\u0006ဈ\u0001\nင\u0002\rဉ\u000b\u0017ဂ\u000f\u0019\u001a\u001aဈ\u0010\u001f2", new java.lang.Object[]{"b", "c", "h", defpackage.acuw.class, "f", "d", "e", "g", "i", "k", "j", "l", new defpackage.ajyk(defpackage.alcr.STRING, "", defpackage.alcr.MESSAGE, defpackage.ykl.a)});
        }
        if (i2 == 3) {
            return new defpackage.acux();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.acux.class);
        }
        this.m = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        defpackage.alat alatVar = this.h;
        if (alatVar.c()) {
            return;
        }
        this.h = alatVar.d(alatVar.size() << 1);
    }

    public final void c() {
        defpackage.alat alatVar = this.k;
        if (alatVar.c()) {
            return;
        }
        this.k = alatVar.d(alatVar.size() << 1);
    }
}
