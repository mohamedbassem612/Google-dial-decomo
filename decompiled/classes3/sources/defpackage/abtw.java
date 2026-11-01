package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abtw {
    public final android.net.Uri a;
    public final defpackage.amjp b;
    private final long c;
    private final defpackage.abup d;
    private final defpackage.abuc e;

    public abtw(long j, defpackage.abup abupVar, android.net.Uri uri, defpackage.abuc abucVar, defpackage.amjp amjpVar) {
        aooh.f(amjpVar, "metadata");
        this.c = j;
        this.d = abupVar;
        this.a = uri;
        this.e = abucVar;
        this.b = amjpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abtw) {
            defpackage.abtw abtwVar = (defpackage.abtw) obj;
            if (this.c == abtwVar.c && this.d == abtwVar.d && aooh.n(this.a, abtwVar.a) && this.e == abtwVar.e && aooh.n(this.b, abtwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((anty.M(this.c) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CallingCardCpgData(callingCardId=" + this.c + ", callingCardType=" + this.d + ", fileUri=" + this.a + ", fileMimeType=" + this.e + ", metadata=" + this.b + ')';
    }
}
