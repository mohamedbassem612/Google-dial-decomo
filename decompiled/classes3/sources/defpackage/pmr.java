package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pmr {
    public final defpackage.pms a;
    public final java.lang.String b;
    public final java.lang.Integer c;
    public final android.graphics.drawable.Drawable d;
    public final float e;

    public pmr(defpackage.pms pmsVar, java.lang.String str, java.lang.Integer num, android.graphics.drawable.Drawable drawable, float f) {
        aooh.f(pmsVar, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.KEY_PRIORITY);
        aooh.f(str, "iconContentDescription");
        this.a = pmsVar;
        this.b = str;
        this.c = num;
        this.d = drawable;
        this.e = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pmr) {
            defpackage.pmr pmrVar = (defpackage.pmr) obj;
            if (this.a == pmrVar.a && aooh.n(this.b, pmrVar.b) && aooh.n(this.c, pmrVar.c) && aooh.n(this.d, pmrVar.d) && java.lang.Float.compare(this.e, pmrVar.e) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.Integer num = this.c;
        int iHashCode2 = ((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        android.graphics.drawable.Drawable drawable = this.d;
        return ((iHashCode2 + (drawable != null ? drawable.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(this.e);
    }

    public final java.lang.String toString() {
        return "ContactGridIcon(priority=" + this.a + ", iconContentDescription=" + this.b + ", iconDrawableResId=" + this.c + ", iconDrawable=" + this.d + ", iconAlpha=" + this.e + ')';
    }
}
