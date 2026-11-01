package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajtw {
    public final boolean a;
    private final defpackage.ajui b;

    public ajtw(defpackage.ajui ajuiVar, boolean z) {
        this.b = ajuiVar;
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajtw)) {
            return false;
        }
        defpackage.ajtw ajtwVar = (defpackage.ajtw) obj;
        return ajtwVar.b.equals(this.b) && ajtwVar.a == this.a;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ java.lang.Boolean.valueOf(this.a).hashCode();
    }
}
