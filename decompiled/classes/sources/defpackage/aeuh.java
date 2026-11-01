package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeuh {
    public byte a;
    public int b;
    public java.lang.Object c;

    public aeuh() {
        this.c = defpackage.ahwt.a;
    }

    public final defpackage.aeui a() {
        int i;
        if (this.a == 1 && (i = this.b) != 0) {
            return new defpackage.aeui(i, (defpackage.ahyn) this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" manualCapture");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final aeab b() {
        java.lang.Object obj;
        if (this.a == 1 && (obj = this.c) != null) {
            return new aeab(this.b, (java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == 0) {
            sb.append(" registrationStatus");
        }
        if (this.c == null) {
            sb.append(" environment");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null environment");
        }
        this.c = str;
    }

    public final void d(int i) {
        this.b = i;
        this.a = (byte) 1;
    }

    public final kux e() {
        if (this.a == 1 && this.c != null) {
            return new kux((java.lang.String) this.c, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" fileNamePrefix");
        }
        if (this.a == 0) {
            sb.append(" speechTextRes");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(int i) {
        this.b = i;
        this.a = (byte) 1;
    }

    public aeuh(byte[] bArr) {
    }
}
