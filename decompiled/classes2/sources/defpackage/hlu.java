package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hlu {
    public final int a;
    public final androidx.car.app.model.CarColor b;

    public hlu(int i, androidx.car.app.model.CarColor carColor) {
        aooh.f(carColor, "tint");
        this.a = i;
        this.b = carColor;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hlu) {
            defpackage.hlu hluVar = (defpackage.hlu) obj;
            if (this.a == hluVar.a && aooh.n(this.b, hluVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Icon(drawable=" + this.a + ", tint=" + this.b + ')';
    }
}
