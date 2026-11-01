package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hlp {
    public final java.util.List a;

    public hlp(java.util.List list) {
        aooh.f(list, "callLogs");
        this.a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.hlp) && aooh.n(this.a, ((defpackage.hlp) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DataLoaded(callLogs=" + this.a + ')';
    }

    public hlp() {
        this(aokc.a);
    }
}
