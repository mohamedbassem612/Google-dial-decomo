package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackq {
    public final android.graphics.Rect a = new android.graphics.Rect();
    public final android.graphics.Rect b = new android.graphics.Rect();

    public ackq() {
        a();
    }

    public final void a() {
        this.a.set(0, 0, 0, 0);
        this.b.set(0, 0, 1073741823, 1073741823);
    }

    public final boolean b() {
        android.graphics.Rect rect = this.b;
        android.graphics.Rect rect2 = this.a;
        if (java.lang.Math.max(java.lang.Math.min(rect2.right, rect.right) - java.lang.Math.max(rect2.left, rect.left), 0) > 0) {
            return java.lang.Math.max(java.lang.Math.min(rect2.bottom, rect.bottom) - java.lang.Math.max(rect2.top, rect.top), 0) > 0;
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ackq ackqVar = (defpackage.ackq) obj;
            if (this.a.equals(ackqVar.a) && this.b.equals(ackqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
