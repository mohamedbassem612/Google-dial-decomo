package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kao implements defpackage.kaq {
    public final defpackage.hkd a;

    public kao(defpackage.hkd hkdVar) {
        aooh.f(hkdVar, "number");
        this.a = hkdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kao) && aooh.n(this.a, ((defpackage.kao) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CarrierEntryKey(number=" + this.a + ')';
    }
}
