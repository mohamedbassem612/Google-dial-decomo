package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afzx implements afzz {
    private final afzz a;
    private final float b;

    public afzx(float f, afzz afzzVar) {
        while (afzzVar instanceof defpackage.afzx) {
            afzzVar = ((defpackage.afzx) afzzVar).a;
            f += ((defpackage.afzx) afzzVar).b;
        }
        this.a = afzzVar;
        this.b = f;
    }

    public final float a(android.graphics.RectF rectF) {
        return java.lang.Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.afzx) {
            defpackage.afzx afzxVar = (defpackage.afzx) obj;
            if (this.a.equals(afzxVar.a) && this.b == afzxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, java.lang.Float.valueOf(this.b)});
    }
}
