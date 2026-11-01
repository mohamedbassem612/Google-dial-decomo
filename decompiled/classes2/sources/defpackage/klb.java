package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class klb {
    public final kiu a;

    public klb(kiu kiuVar) {
        aooh.f(kiuVar, "coalescedRow");
        this.a = kiuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.klb) && aooh.n(this.a, ((defpackage.klb) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallIntegrationInfo(coalescedRow=" + this.a + ')';
    }
}
