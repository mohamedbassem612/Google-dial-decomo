package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kuk implements defpackage.ahth {
    public final java.lang.String a;
    public final long b;

    public kuk(java.lang.String str, long j) {
        defpackage.aooh.f(str, "recordingPath");
        this.a = str;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kuk) {
            defpackage.kuk kukVar = (defpackage.kuk) obj;
            if (defpackage.aooh.n(this.a, kukVar.a) && this.b == kukVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + defpackage.anty.M(this.b);
    }

    public final java.lang.String toString() {
        return "DeleteCallRecordingDialogConfirmedEvent(recordingPath=" + this.a + ", callCreatedTimeMillis=" + this.b + ')';
    }
}
