package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vgw {
    public j$.util.Optional a = j$.util.Optional.empty();
    private java.lang.String b;
    private java.lang.String c;
    private long d;
    private long e;
    private android.telecom.PhoneAccountHandle f;
    private boolean g;
    private java.lang.String h;
    private byte i;

    public final defpackage.vgx a() {
        java.lang.String str;
        java.lang.String str2;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        java.lang.String str3;
        if (this.i == 7 && (str = this.b) != null && (str2 = this.c) != null && (phoneAccountHandle = this.f) != null && (str3 = this.h) != null) {
            return new defpackage.vgx(str, str2, this.d, this.e, phoneAccountHandle, this.g, str3, this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" sourceId");
        }
        if (this.c == null) {
            sb.append(" fromNumber");
        }
        if ((this.i & 1) == 0) {
            sb.append(" createTimeStampMillisecond");
        }
        if ((this.i & 2) == 0) {
            sb.append(" durationSecond");
        }
        if (this.f == null) {
            sb.append(" phoneAccountHandle");
        }
        if ((this.i & 4) == 0) {
            sb.append(" isRead");
        }
        if (this.h == null) {
            sb.append(" sourcePackage");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.d = j;
        this.i = (byte) (this.i | 1);
    }

    public final void c(long j) {
        this.e = j;
        this.i = (byte) (this.i | 2);
    }

    public final void d(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null fromNumber");
        }
        this.c = str;
    }

    public final void e(boolean z) {
        this.g = z;
        this.i = (byte) (this.i | 4);
    }

    public final void f(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (phoneAccountHandle == null) {
            throw new java.lang.NullPointerException("Null phoneAccountHandle");
        }
        this.f = phoneAccountHandle;
    }

    public final void g(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null sourceId");
        }
        this.b = str;
    }

    public final void h(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null sourcePackage");
        }
        this.h = str;
    }
}
