package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qie {
    public final java.util.List a;
    public final int b;
    public final java.lang.CharSequence c;
    public final boolean d;

    public qie(java.util.List list, int i, java.lang.CharSequence charSequence, boolean z) {
        aooh.f(list, "actionButtons");
        this.a = list;
        this.b = i;
        this.c = charSequence;
        this.d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qie) {
            defpackage.qie qieVar = (defpackage.qie) obj;
            if (aooh.n(this.a, qieVar.a) && this.b == qieVar.b && aooh.n(this.c, qieVar.c) && this.d == qieVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.CharSequence charSequence = this.c;
        return ((((iHashCode + this.b) * 31) + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + anty.L(this.d);
    }

    public final java.lang.String toString() {
        return "AndroidAutoNotificationModel(actionButtons=" + this.a + ", notificationPriority=" + this.b + ", contentText=" + ((java.lang.Object) this.c) + ", shouldShowOnAndroidAuto=" + this.d + ')';
    }
}
