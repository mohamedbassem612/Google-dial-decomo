package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agh {
    public final float a;
    public final defpackage.ajl b;

    public agh(float f, defpackage.ajl ajlVar) {
        this.a = f;
        this.b = ajlVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agh) {
            defpackage.agh aghVar = (defpackage.agh) obj;
            if (this.a == aghVar.a && defpackage.aooh.n(this.b, aghVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "FadeConfig(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
