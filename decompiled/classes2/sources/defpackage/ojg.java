package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ojg {
    public final ysc a;
    public final float b;

    public ojg(ysc yscVar, float f) {
        aooh.f(yscVar, "availability");
        this.a = yscVar;
        this.b = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ojg) {
            defpackage.ojg ojgVar = (defpackage.ojg) obj;
            if (aooh.n(this.a, ojgVar.a) && java.lang.Float.compare(this.b, ojgVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "DialerAiCoreAvailabilityAndDownloadProgress(availability=" + this.a + ", downloadProgress=" + this.b + ')';
    }
}
