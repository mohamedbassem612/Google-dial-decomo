package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qin {
    public final defpackage.qio a;
    public final java.lang.CharSequence b;
    public final java.lang.CharSequence c;
    public final java.lang.CharSequence d;
    private final java.lang.CharSequence e;

    public qin(defpackage.qio qioVar, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, java.lang.CharSequence charSequence4) {
        aooh.f(qioVar, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.KEY_PRIORITY);
        aooh.f(charSequence3, "contentText");
        this.a = qioVar;
        this.b = charSequence;
        this.e = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.b);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final j$.util.Optional b() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.e);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qin) {
            defpackage.qin qinVar = (defpackage.qin) obj;
            if (this.a == qinVar.a && aooh.n(this.b, qinVar.b) && aooh.n(this.e, qinVar.e) && aooh.n(this.c, qinVar.c) && aooh.n(this.d, qinVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.CharSequence charSequence2 = this.e;
        int iHashCode3 = (((iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31) + this.c.hashCode()) * 31;
        java.lang.CharSequence charSequence3 = this.d;
        return iHashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Content(priority=" + this.a + ", contentTitle=" + ((java.lang.Object) this.b) + ", publicContentTitle=" + ((java.lang.Object) this.e) + ", contentText=" + ((java.lang.Object) this.c) + ", androidAutoContentText=" + ((java.lang.Object) this.d) + ')';
    }
}
