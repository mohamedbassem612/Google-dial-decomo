package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ajvu {
    public final java.lang.String a;
    public final java.util.List b;

    public ajvu(java.lang.String str, java.util.List list) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajvu) {
            defpackage.ajvu ajvuVar = (defpackage.ajvu) obj;
            if (this.a.equals(ajvuVar.a) && this.b.equals(ajvuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b.toString() + '}';
    }

    public ajvu() {
        throw null;
    }
}
