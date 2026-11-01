package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aemc {
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public defpackage.aemd e;
    public java.lang.String f;
    public java.lang.String g;
    public int h;
    private java.lang.String i;
    private boolean j;
    private boolean k;
    private defpackage.aemd l;
    private byte m;

    public final defpackage.aeme a() {
        java.lang.String str;
        defpackage.aemd aemdVar;
        defpackage.aemd aemdVar2;
        int i;
        if (this.m == 3 && (str = this.i) != null && (aemdVar = this.l) != null && (aemdVar2 = this.e) != null && (i = this.h) != 0) {
            return new defpackage.aeme(str, this.j, this.a, this.b, this.c, this.d, this.k, aemdVar, aemdVar2, this.f, this.g, i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.i == null) {
            sb.append(" accountName");
        }
        if ((this.m & 1) == 0) {
            sb.append(" isMetadataAvailable");
        }
        if ((this.m & 2) == 0) {
            sb.append(" isG1User");
        }
        if (this.l == null) {
            sb.append(" isDasherUser");
        }
        if (this.e == null) {
            sb.append(" isUnicornUser");
        }
        if (this.h == 0) {
            sb.append(" ageRange");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null accountName");
        }
        this.i = str;
    }

    public final void c(defpackage.aemd aemdVar) {
        if (aemdVar == null) {
            throw new java.lang.NullPointerException("Null isDasherUser");
        }
        this.l = aemdVar;
    }

    public final void d(boolean z) {
        this.k = z;
        this.m = (byte) (this.m | 2);
    }

    public final void e(boolean z) {
        this.j = z;
        this.m = (byte) (this.m | 1);
    }
}
