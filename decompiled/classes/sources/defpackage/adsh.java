package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adsh {
    public java.lang.String a;
    public java.lang.String b;
    public int c;
    private java.lang.String d;

    public final defpackage.adsi a() {
        java.lang.String str;
        java.lang.String str2;
        int i;
        java.lang.String str3 = this.d;
        if (str3 != null && (str = this.a) != null && (str2 = this.b) != null && (i = this.c) != 0) {
            return new defpackage.adsi(str3, str, str2, i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == null) {
            sb.append(" voiceId");
        }
        if (this.a == null) {
            sb.append(" voiceName");
        }
        if (this.b == null) {
            sb.append(" langCode");
        }
        if (this.c == 0) {
            sb.append(" gender");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null voiceId");
        }
        this.d = str;
    }
}
