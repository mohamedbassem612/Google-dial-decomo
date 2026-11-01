package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zww {
    public com.google.android.gms.auth.aang.GoogleAccount a;
    public java.lang.String b;
    public java.util.List c;
    public java.util.List d;
    public java.util.List e;
    public java.util.List f;
    public java.lang.String g;
    public java.lang.String h;
    public android.net.Network i;
    public int j;
    public byte k;
    private int l;
    private boolean m;
    private boolean n;

    public final com.google.android.gms.auth.aang.GetTokenRequest a() {
        com.google.android.gms.auth.aang.GoogleAccount googleAccount = this.a;
        java.lang.String str = this.b;
        if (googleAccount == null) {
            if (str == null) {
                throw new java.lang.IllegalArgumentException("#setAccount or #setObfuscatedGaiaId must be called.");
            }
        } else if (str != null) {
            throw new java.lang.IllegalArgumentException("Both setObfuscatedGaiaId and setAccount cannot be called.");
        }
        java.util.List list = this.c;
        if (list == null && this.d == null && this.e == null && this.f == null) {
            throw new java.lang.IllegalArgumentException("A token type must be specified.");
        }
        int i = list != null ? 1 : 0;
        if (this.d != null) {
            i++;
        }
        if (this.e != null) {
            i++;
        }
        if (this.f != null) {
            i++;
        }
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("No auth token type specified. Please specify exactly one type of auth token.");
        }
        if (i > 1) {
            throw new java.lang.IllegalArgumentException("GetTokenRequest supports only one token type per request. Please call only one of setOauth2Scopes(), setWebLoginUrls(), setClientLoginScopes(), setOauth2TokenIdScopes()");
        }
        if (this.g != null && b() == 0) {
            throw new java.lang.IllegalArgumentException("Please provide a delegation type for the user id.");
        }
        if (b() == 1 && this.g == null) {
            throw new java.lang.IllegalArgumentException("Please provide a delegatee user ID.");
        }
        if (this.k == 31) {
            return new com.google.android.gms.auth.aang.GetTokenRequest(this.a, this.b, this.c, this.d, this.e, this.f, this.l, this.g, false, null, this.h, this.m, this.i, this.n, this.j);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.k & 1) == 0) {
            sb.append(" delegationType");
        }
        if ((this.k & 2) == 0) {
            sb.append(" handleNotification");
        }
        if ((this.k & 4) == 0) {
            sb.append(" suppressProgressScreen");
        }
        if ((this.k & 8) == 0) {
            sb.append(" useNewExceptions");
        }
        if ((this.k & 16) == 0) {
            sb.append(" clientVersion");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final int b() {
        if ((this.k & 1) != 0) {
            return this.l;
        }
        throw new java.lang.IllegalStateException("Property \"delegationType\" has not been set");
    }

    public final void c(int i) {
        this.l = i;
        this.k = (byte) (this.k | 1);
    }

    public final void d(boolean z) {
        this.m = z;
        this.k = (byte) (this.k | 4);
    }

    public final void e(boolean z) {
        this.n = z;
        this.k = (byte) (this.k | 8);
    }
}
