package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gpk {
    public static final defpackage.gpk a = new defpackage.gpk("expandContainers", 0.0f);
    public static final defpackage.gpk b = defpackage.gus.K(0.5f);
    public static final defpackage.gpk c = new defpackage.gpk("hinge", -1.0f);
    public final float d;
    private final java.lang.String e;

    public gpk(java.lang.String str, float f) {
        this.e = str;
        this.d = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.gpk) {
            defpackage.gpk gpkVar = (defpackage.gpk) obj;
            if (this.d == gpkVar.d && defpackage.aooh.n(this.e, gpkVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (java.lang.Float.floatToIntBits(this.d) * 31);
    }

    public final java.lang.String toString() {
        return this.e;
    }
}
