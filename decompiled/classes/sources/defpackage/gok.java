package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gok {
    public static final defpackage.gok a = new defpackage.gok("ALWAYS_ALLOW", 0.0f);
    public final float b;
    private final java.lang.String c;

    public gok(java.lang.String str, float f) {
        this.c = str;
        this.b = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.gok) {
            defpackage.gok gokVar = (defpackage.gok) obj;
            if (this.b == gokVar.b && defpackage.aooh.n(this.c, gokVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (java.lang.Float.floatToIntBits(this.b) * 31);
    }

    public final java.lang.String toString() {
        return "EmbeddingAspectRatio(" + this.c + ')';
    }
}
