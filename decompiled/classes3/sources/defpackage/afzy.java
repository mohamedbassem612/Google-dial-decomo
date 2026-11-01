package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afzy implements afzz {
    private final float a;

    public afzy(float f) {
        this.a = f;
    }

    public final float a(android.graphics.RectF rectF) {
        return dzk.A(this.a, 0.0f, java.lang.Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.afzy) && this.a == ((defpackage.afzy) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.a)});
    }
}
