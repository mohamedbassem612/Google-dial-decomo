package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abjh {
    public final long a;
    public final float b;

    public abjh(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abjh) {
            defpackage.abjh abjhVar = (defpackage.abjh) obj;
            if (anty.ah(this.a, abjhVar.a) && java.lang.Float.compare(this.b, abjhVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.M(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "ResizeRequest(size=" + dpp.a(this.a) + ", ratio=" + this.b + ')';
    }
}
