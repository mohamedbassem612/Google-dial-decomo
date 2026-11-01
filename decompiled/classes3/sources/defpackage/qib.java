package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qib {
    public final defpackage.qid a;
    public final defpackage.qic b;
    public final java.lang.String c;
    public final java.lang.Integer d;
    public final int e;
    public final boolean f;
    public final java.lang.Integer g;
    private final java.lang.Integer h;

    public qib(defpackage.qid qidVar, defpackage.qic qicVar, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, int i, boolean z, java.lang.Integer num3) {
        aooh.f(qidVar, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.KEY_PRIORITY);
        aooh.f(qicVar, "position");
        aooh.f(str, "label");
        this.a = qidVar;
        this.b = qicVar;
        this.c = str;
        this.d = num;
        this.h = num2;
        this.e = i;
        this.f = z;
        this.g = num3;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.h);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qib) {
            defpackage.qib qibVar = (defpackage.qib) obj;
            if (this.a == qibVar.a && this.b == qibVar.b && aooh.n(this.c, qibVar.c) && aooh.n(this.d, qibVar.d) && aooh.n(this.h, qibVar.h) && this.e == qibVar.e && this.f == qibVar.f && aooh.n(this.g, qibVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        java.lang.Integer num = this.d;
        int iHashCode2 = ((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.h;
        int iHashCode3 = (((((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.e) * 31) + anty.L(this.f)) * 31;
        java.lang.Integer num3 = this.g;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ActionButton(priority=" + this.a + ", position=" + this.b + ", label=" + this.c + ", textColorIfNoButtonFillAvailable=" + this.d + ", backgroundColorIfButtonFillAvailable=" + this.h + ", iconResId=" + this.e + ", shouldStartInCallActivity=" + this.f + ", semanticAction=" + this.g + ')';
    }
}
