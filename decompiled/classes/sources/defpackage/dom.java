package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dom implements defpackage.doy {
    private final long a;

    public dom(long j) {
        this.a = j;
        if (j == 16) {
            dnv.b("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // defpackage.doy
    public final float a() {
        return defpackage.cqg.a(this.a);
    }

    @Override // defpackage.doy
    public final long b() {
        return this.a;
    }

    @Override // defpackage.doy
    public final defpackage.cqd c() {
        return null;
    }

    @Override // defpackage.doy
    public final /* synthetic */ defpackage.doy d(defpackage.doy doyVar) {
        return defpackage.dpe.n(this, doyVar);
    }

    @Override // defpackage.doy
    public final /* synthetic */ defpackage.doy e(defpackage.aomy aomyVar) {
        return defpackage.dpe.o(this, aomyVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.dom) && this.a == ((defpackage.dom) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return "ColorStyle(value=" + defpackage.cqg.g(this.a) + ')';
    }
}
