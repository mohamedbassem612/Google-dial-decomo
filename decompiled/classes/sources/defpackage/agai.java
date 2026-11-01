package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agai implements defpackage.afzz {
    private final float a;

    public agai(float f) {
        this.a = f;
    }

    @Override // defpackage.afzz
    public final float a(android.graphics.RectF rectF) {
        return this.a * java.lang.Math.min(rectF.width(), rectF.height());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.agai) && this.a == ((defpackage.agai) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.a)});
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((int) (this.a * 100.0f));
        sb.append('%');
        return sb.toString();
    }
}
