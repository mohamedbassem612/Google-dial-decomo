package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acvm {
    public boolean a;
    public byte b;
    private java.lang.String c;
    private final ahyn d;
    private final ahyn e;

    public acvm() {
        ahwt ahwtVar = ahwt.a;
        this.d = ahwtVar;
        this.e = ahwtVar;
    }

    public final defpackage.acvn a() {
        java.lang.String str;
        if (this.b == 3 && (str = this.c) != null) {
            return new defpackage.acvn(str, this.d, this.e, this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" groupName");
        }
        if ((this.b & 1) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.b & 2) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null groupName");
        }
        this.c = str;
    }
}
