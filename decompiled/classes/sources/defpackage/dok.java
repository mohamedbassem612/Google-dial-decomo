package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dok {
    public final float a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dok) && java.lang.Float.compare(this.a, ((defpackage.dok) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
