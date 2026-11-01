package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kjj implements defpackage.kob {
    public final java.util.List a;
    public final int b;

    public kjj(java.util.List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final int a() {
        return 2131624141;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kjj) {
            defpackage.kjj kjjVar = (defpackage.kjj) obj;
            if (aooh.n(this.a, kjjVar.a) && this.b == kjjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "DetailedCallHistoryDetailsViewData(calls=" + this.a + ", callType=" + this.b + ')';
    }
}
