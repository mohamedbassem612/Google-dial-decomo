package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acvi {
    public ahyn a;
    public boolean b;
    public byte c;
    public int d;
    private java.lang.String e;
    private final ahyn f;
    private final ahyn g;
    private final ahyn h;
    private final ahyn i;
    private final ahyn j;
    private ahyn k;

    public acvi() {
        ahwt ahwtVar = ahwt.a;
        this.f = ahwtVar;
        this.g = ahwtVar;
        this.h = ahwtVar;
        this.i = ahwtVar;
        this.j = ahwtVar;
        this.k = ahwtVar;
        this.a = ahwtVar;
    }

    public final defpackage.acvj a() {
        java.lang.String str;
        int i;
        if (this.c == 15 && (str = this.e) != null && (i = this.d) != 0) {
            return new defpackage.acvj(str, this.f, this.g, this.h, this.i, this.j, this.k, this.a, i, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.e == null) {
            sb.append(" groupName");
        }
        if ((this.c & 1) == 0) {
            sb.append(" groupSizeBytes");
        }
        if ((this.c & 2) == 0) {
            sb.append(" groupSizeBytesLong");
        }
        if (this.d == 0) {
            sb.append(" showNotifications");
        }
        if ((this.c & 4) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.c & 8) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(ahyn ahynVar) {
        if (ahynVar == null) {
            throw new java.lang.NullPointerException("Null downloadConditionsOptional");
        }
        this.k = ahynVar;
    }

    public final void c(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null groupName");
        }
        this.e = str;
    }
}
