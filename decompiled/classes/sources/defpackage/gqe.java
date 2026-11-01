package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gqe {
    public final float a;
    private final defpackage.gmv b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gqe(android.graphics.Rect rect, float f) {
        this(new defpackage.gmv(rect), f);
        defpackage.aooh.f(rect, "bounds");
    }

    public final android.graphics.Rect a() {
        return this.b.c();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (defpackage.aooh.n(getClass(), obj != null ? obj.getClass() : null)) {
            defpackage.aooh.d(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
            defpackage.gqe gqeVar = (defpackage.gqe) obj;
            if (defpackage.aooh.n(this.b, gqeVar.b) && this.a == gqeVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "WindowMetrics(_bounds=" + this.b + ", density=" + this.a + ')';
    }

    public gqe(defpackage.gmv gmvVar, float f) {
        this.b = gmvVar;
        this.a = f;
    }
}
