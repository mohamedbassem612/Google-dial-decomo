package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afzw implements defpackage.afzz {
    private final float a;

    public afzw(float f) {
        this.a = f;
    }

    @Override // defpackage.afzz
    public final float a(android.graphics.RectF rectF) {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.afzw) && this.a == ((defpackage.afzw) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.a)});
    }

    public final java.lang.String toString() {
        return this.a + "px";
    }
}
