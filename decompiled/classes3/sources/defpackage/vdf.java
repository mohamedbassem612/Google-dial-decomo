package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vdf {
    public defpackage.uzm c;
    private android.net.Uri d;
    private long e;
    private java.lang.String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean k;
    private byte l;
    public j$.util.Optional a = j$.util.Optional.empty();
    public j$.util.Optional b = j$.util.Optional.empty();
    private j$.util.Optional j = j$.util.Optional.empty();

    public final defpackage.vdg a() {
        android.net.Uri uri;
        java.lang.String str;
        defpackage.uzm uzmVar;
        if (this.l == 31 && (uri = this.d) != null && (str = this.f) != null && (uzmVar = this.c) != null) {
            return new defpackage.vdg(uri, this.e, str, this.g, this.h, this.i, this.a, this.b, this.j, uzmVar, this.k);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == null) {
            sb.append(" uri");
        }
        if ((this.l & 1) == 0) {
            sb.append(" id");
        }
        if (this.f == null) {
            sb.append(" remoteSourceId");
        }
        if ((this.l & 2) == 0) {
            sb.append(" isRead");
        }
        if ((this.l & 4) == 0) {
            sb.append(" isDeleted");
        }
        if ((this.l & 8) == 0) {
            sb.append(" isArchived");
        }
        if (this.c == null) {
            sb.append(" transcriptionState");
        }
        if ((this.l & 16) == 0) {
            sb.append(" hasContent");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 16);
    }

    public final void c(long j) {
        this.e = j;
        this.l = (byte) (this.l | 1);
    }

    public final void d(boolean z) {
        this.i = z;
        this.l = (byte) (this.l | 8);
    }

    public final void e(boolean z) {
        this.h = z;
        this.l = (byte) (this.l | 4);
    }

    public final void f(boolean z) {
        this.g = z;
        this.l = (byte) (this.l | 2);
    }

    public final void g(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null remoteSourceId");
        }
        this.f = str;
    }

    public final void h(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null transcription");
        }
        this.j = optional;
    }

    public final void i(android.net.Uri uri) {
        if (uri == null) {
            throw new java.lang.NullPointerException("Null uri");
        }
        this.d = uri;
    }
}
