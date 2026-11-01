package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agmy {
    public android.os.Bundle a;
    public boolean c;
    public int d = 3;
    public ahyn b = ahwt.a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final boolean a() throws aois {
        int i = this.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        ?? r2 = 1;
        r2 = 1;
        r2 = 1;
        if (i2 == 0) {
            return true;
        }
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            throw new aois();
        }
        if (i != 3) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        android.os.Bundle bundle = this.a;
        if (bundle == null ? !(!this.b.f() || (((java.lang.Boolean) this.b.b()).booleanValue() && !this.c)) : !(bundle.getBoolean("tiktok_accounts_disabled") && !this.c)) {
            r2 = 0;
        }
        this.d = 2 >>> r2;
        return r2;
    }
}
