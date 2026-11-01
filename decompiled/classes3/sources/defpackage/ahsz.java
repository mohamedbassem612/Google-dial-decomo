package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahsz {
    public final ahqy a;
    public final android.util.SparseArray b;
    public final boolean c;
    public final float d;
    public final boolean e;
    public final aify f;

    public ahsz(ahqy ahqyVar, android.util.SparseArray sparseArray, boolean z, float f, boolean z2, aify aifyVar) {
        this.a = ahqyVar;
        this.b = sparseArray;
        this.c = z;
        this.d = f;
        this.e = z2;
        this.f = aifyVar;
    }

    public static defpackage.ahsy a() {
        defpackage.ahsy ahsyVar = new defpackage.ahsy();
        ahsyVar.d(false);
        ahsyVar.e(new android.util.SparseArray());
        ahsyVar.g(0.0f);
        ahsyVar.c(false);
        ahsyVar.b(aike.a);
        return ahsyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahsz) {
            defpackage.ahsz ahszVar = (defpackage.ahsz) obj;
            if (this.a.equals(ahszVar.a) && this.b.equals(ahszVar.b) && this.c == ahszVar.c) {
                if (java.lang.Float.floatToIntBits(this.d) == java.lang.Float.floatToIntBits(ahszVar.d) && this.e == ahszVar.e && ahvr.aP(this.f, ahszVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ java.lang.Float.floatToIntBits(this.d)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.f;
        android.util.SparseArray sparseArray = this.b;
        return "TraceRecordWithMetadata{traceRecord=" + java.lang.String.valueOf(this.a) + ", spanExtras=" + java.lang.String.valueOf(sparseArray) + ", isPartialTrace=" + this.c + ", traceSamplingRate=" + this.d + ", enableTiktokTraceEmptyCheckFix=" + this.e + ", cuiMetadata=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public ahsz() {
        throw null;
    }
}
