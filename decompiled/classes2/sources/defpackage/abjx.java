package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abjx implements abjv {
    public final float a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.abjx) && java.lang.Float.compare(this.a, ((defpackage.abjx) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "MonogramItemBackgroundHue(hue=" + this.a + ')';
    }
}
