package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zbx implements zbo {
    public final defpackage.zcc a;
    public final java.lang.String b;

    public zbx(defpackage.zcc zccVar, java.lang.String str) {
        this.a = zccVar;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zbx) {
            defpackage.zbx zbxVar = (defpackage.zbx) obj;
            if (aooh.n(this.a, zbxVar.a) && aooh.n(this.b, zbxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "CuiTimelineEvent(payload=" + this.a + ", uniqueCallId=" + this.b + ')';
    }
}
