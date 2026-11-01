package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aefx {
    public final java.util.Set a;
    private final java.lang.String b;

    public aefx(java.util.Set set) {
        defpackage.aooh.f(set, "notificationChannels");
        this.a = set;
        this.b = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aefx) {
            defpackage.aefx aefxVar = (defpackage.aefx) obj;
            if (defpackage.aooh.n(this.a, aefxVar.a)) {
                java.lang.String str = aefxVar.b;
                if (defpackage.aooh.n(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final java.lang.String toString() {
        return "AccountRegistrationInfo(notificationChannels=" + this.a + ", delegateGaiaActualAccountName=null)";
    }
}
