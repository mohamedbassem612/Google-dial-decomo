package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agwu extends defpackage.agwm {
    public final defpackage.agwx a;

    public agwu(defpackage.agwx agwxVar) {
        this.a = agwxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.agwu) && aooh.n(this.a, ((defpackage.agwu) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        defpackage.agwx agwxVar = this.a;
        if (agwxVar == null) {
            return 0;
        }
        return agwxVar.hashCode();
    }

    public final java.lang.String toString() {
        return "Reading(cause=" + this.a + ')';
    }
}
