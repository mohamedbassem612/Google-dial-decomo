package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apgi extends defpackage.alad implements defpackage.albi {
    public static final defpackage.apgi a;
    public int b;
    public boolean c;
    public defpackage.apfy d;
    public int g;
    public aiwk i;
    public apgh j;
    public apgf k;
    private byte l = 2;
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String h = "";

    static {
        defpackage.apgi apgiVar = new defpackage.apgi();
        a = apgiVar;
        defpackage.alad.Q(defpackage.apgi.class, apgiVar);
    }

    private apgi() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\u000bဉ\n\fဉ\u000b", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", defpackage.amub.u, "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new defpackage.apgi();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.apgi.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
