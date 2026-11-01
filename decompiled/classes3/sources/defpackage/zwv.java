package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zwv {
    public java.util.List a;
    public byte b;
    private java.lang.String c;

    public final com.google.android.gms.auth.aang.GetAccountsRequest a() {
        java.lang.String str;
        if (this.b == 3 && (str = this.c) != null) {
            return new com.google.android.gms.auth.aang.GetAccountsRequest(str, null, this.a, false, false);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" accountType");
        }
        if ((this.b & 1) == 0) {
            sb.append(" includeRestrictedAccounts");
        }
        if ((this.b & 2) == 0) {
            sb.append(" includeTransientAccounts");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null accountType");
        }
        this.c = str;
    }
}
