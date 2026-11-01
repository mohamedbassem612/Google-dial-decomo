package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vdk {
    private long b;
    private java.lang.String c;
    private long d;
    private java.lang.String e;
    private java.lang.String f;
    private boolean g;
    private android.telecom.PhoneAccountHandle h;
    private byte j;
    public j$.util.Optional a = j$.util.Optional.empty();
    private final j$.util.Optional i = j$.util.Optional.empty();

    public final defpackage.vdl a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        if (this.j == 7 && (str = this.c) != null && (str2 = this.e) != null && (str3 = this.f) != null && (phoneAccountHandle = this.h) != null) {
            return new defpackage.vdl(this.b, str, this.d, str2, str3, this.g, phoneAccountHandle, this.a, this.i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" createdAtMillis");
        }
        if (this.c == null) {
            sb.append(" senderPhoneNumber");
        }
        if ((this.j & 2) == 0) {
            sb.append(" durationSeconds");
        }
        if (this.e == null) {
            sb.append(" sourcePackage");
        }
        if (this.f == null) {
            sb.append(" remoteSourceId");
        }
        if ((this.j & 4) == 0) {
            sb.append(" isRead");
        }
        if (this.h == null) {
            sb.append(" phoneAccountHandle");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.b = j;
        this.j = (byte) (this.j | 1);
    }

    public final void c(long j) {
        this.d = j;
        this.j = (byte) (this.j | 2);
    }

    public final void d(boolean z) {
        this.g = z;
        this.j = (byte) (this.j | 4);
    }

    public final void e(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        if (phoneAccountHandle == null) {
            throw new java.lang.NullPointerException("Null phoneAccountHandle");
        }
        this.h = phoneAccountHandle;
    }

    public final void f(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null remoteSourceId");
        }
        this.f = str;
    }

    public final void g(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null senderPhoneNumber");
        }
        this.c = str;
    }

    public final void h(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null sourcePackage");
        }
        this.e = str;
    }
}
