package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kvn implements defpackage.kob {
    public final java.lang.String a;
    public final long b;
    public final java.lang.String c;
    private final long d;

    public kvn(java.lang.String str, long j, long j2, java.lang.String str2) {
        aooh.f(str, "callRecordingTitle");
        aooh.f(str2, "callRecordingFilePath");
        this.a = str;
        this.d = j;
        this.b = j2;
        this.c = str2;
    }

    public final int a() {
        return 2131624003;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kvn) {
            defpackage.kvn kvnVar = (defpackage.kvn) obj;
            if (aooh.n(this.a, kvnVar.a) && this.d == kvnVar.d && this.b == kvnVar.b && aooh.n(this.c, kvnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.c;
        return ((((iHashCode + anty.M(this.d)) * 31) + anty.M(this.b)) * 31) + str.hashCode();
    }

    public final java.lang.String toString() {
        return "CallRecordingDetailsViewData(callRecordingTitle=" + this.a + ", coalescedRowId=" + this.d + ", timestamp=" + this.b + ", callRecordingFilePath=" + this.c + ')';
    }
}
