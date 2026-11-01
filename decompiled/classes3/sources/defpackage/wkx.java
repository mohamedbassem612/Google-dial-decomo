package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wkx {
    public final defpackage.wre a;
    public final j$.util.Optional b;

    public wkx(defpackage.wre wreVar, j$.util.Optional optional) {
        this.a = wreVar;
        this.b = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wkx) {
            defpackage.wkx wkxVar = (defpackage.wkx) obj;
            if (this.a.equals(wkxVar.a) && this.b.equals(wkxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.b;
        return "XatuControllerStopParams{endCause=" + java.lang.String.valueOf(this.a) + ", agentOnlineDurationMillis=" + java.lang.String.valueOf(optional) + '}';
    }

    public wkx() {
        throw null;
    }
}
