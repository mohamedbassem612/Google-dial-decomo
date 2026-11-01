package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qmu {
    public defpackage.qmz a;
    public defpackage.qmw b;
    private int c;
    private java.lang.String d;
    private java.lang.String e;
    private byte f;

    public final defpackage.qmy a() {
        defpackage.qmz qmzVar;
        java.lang.String str;
        java.lang.String str2;
        defpackage.qmw qmwVar;
        if (this.f == 1 && (qmzVar = this.a) != null && (str = this.d) != null && (str2 = this.e) != null && (qmwVar = this.b) != null) {
            return new defpackage.qmy(qmzVar, this.c, str, str2, qmwVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" videoButtonKey");
        }
        if (this.f == 0) {
            sb.append(" icon");
        }
        if (this.d == null) {
            sb.append(" label");
        }
        if (this.e == null) {
            sb.append(" description");
        }
        if (this.b == null) {
            sb.append(" buttonState");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null description");
        }
        this.e = str;
    }

    public final void c(int i) {
        this.c = i;
        this.f = (byte) 1;
    }

    public final void d(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null label");
        }
        this.d = str;
    }
}
