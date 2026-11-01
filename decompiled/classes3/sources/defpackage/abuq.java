package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abuq implements defpackage.abtx {
    public final android.net.Uri a;
    public final defpackage.amjp b;
    private final long c;

    public abuq(long j, android.net.Uri uri, defpackage.amjp amjpVar) {
        aooh.f(amjpVar, "metadata");
        this.c = j;
        this.a = uri;
        this.b = amjpVar;
        defpackage.abup abupVar = defpackage.abup.UNKNOWN;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abuq) {
            defpackage.abuq abuqVar = (defpackage.abuq) obj;
            if (this.c == abuqVar.c && aooh.n(this.a, abuqVar.a) && aooh.n(this.b, abuqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((anty.M(this.c) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ContactCallingCard(callingCardId=" + this.c + ", fileUri=" + this.a + ", metadata=" + this.b + ')';
    }
}
