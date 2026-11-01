package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gmv {
    public static final defpackage.gmv a = new defpackage.gmv(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public gmv(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        if (i > i3) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bf(i3, i, "Left must be less than or equal to right, left: ", ", right: "));
        }
        if (i2 > i4) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bf(i4, i2, "top must be less than or equal to bottom, top: ", ", bottom: "));
        }
    }

    public final int a() {
        return this.e - this.c;
    }

    public final int b() {
        return this.d - this.b;
    }

    public final android.graphics.Rect c() {
        return new android.graphics.Rect(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (defpackage.aooh.n(getClass(), obj != null ? obj.getClass() : null)) {
            defpackage.aooh.d(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
            defpackage.gmv gmvVar = (defpackage.gmv) obj;
            if (this.b == gmvVar.b && this.c == gmvVar.c && this.d == gmvVar.d && this.e == gmvVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "gmv { [" + this.b + ',' + this.c + ',' + this.d + ',' + this.e + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gmv(android.graphics.Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        if (rect == null) {
            defpackage.aooh.i("rect");
        }
    }
}
