package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xwa implements defpackage.xuo {
    private final defpackage.xuo b;
    private final defpackage.xuo c;

    public xwa(defpackage.xuo xuoVar, defpackage.xuo xuoVar2) {
        this.b = xuoVar;
        this.c = xuoVar2;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xwa)) {
            return false;
        }
        defpackage.xwa xwaVar = (defpackage.xwa) obj;
        return this.b.equals(xwaVar.b) && this.c.equals(xwaVar.c);
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.xuo xuoVar = this.c;
        return "DataCacheKey{sourceKey=" + java.lang.String.valueOf(this.b) + ", signature=" + java.lang.String.valueOf(xuoVar) + '}';
    }
}
