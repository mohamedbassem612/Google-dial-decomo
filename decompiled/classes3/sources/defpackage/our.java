package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class our {
    public final defpackage.ous a;
    public final int b;
    public final defpackage.ouq c;
    public final int d;

    public our(defpackage.ous ousVar, int i, int i2, defpackage.ouq ouqVar) {
        aooh.f(ousVar, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.KEY_PRIORITY);
        aooh.f(ouqVar, "icon");
        this.a = ousVar;
        this.b = i;
        this.d = i2;
        this.c = ouqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.our) {
            defpackage.our ourVar = (defpackage.our) obj;
            if (this.a == ourVar.a && this.b == ourVar.b && this.d == ourVar.d && aooh.n(this.c, ourVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.d;
        if (i == 0) {
            i = 0;
        }
        return ((((iHashCode + this.b) * 31) + i) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FeatureIndicatorLabel(priority=");
        sb.append(this.a);
        sb.append(", textRes=");
        sb.append(this.b);
        sb.append(", labelType=");
        int i = this.d;
        if (i != 1) {
            str = i != 2 ? "null" : "LEGAL_LABEL";
        } else {
            str = "WARNING_LABEL";
        }
        sb.append((java.lang.Object) str);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
