package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ozb implements ahth {
    public final float a;

    public ozb(float f) {
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ozb) && java.lang.Float.compare(this.a, ((defpackage.ozb) obj).a) == 0;
        }
        return true;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "AnswerProgressEvent(progress=" + this.a + ')';
    }
}
