package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ynr {
    public final defpackage.ymd a;
    public final defpackage.yml b;
    public final defpackage.ymk c;

    public ynr(defpackage.ymd ymdVar, defpackage.yml ymlVar, defpackage.ymk ymkVar) {
        this.a = ymdVar;
        this.b = ymlVar;
        this.c = ymkVar;
    }

    public static defpackage.aliq a(defpackage.ymd ymdVar) {
        defpackage.aliq aliqVar = new defpackage.aliq((byte[]) null);
        if (ymdVar == null) {
            throw new java.lang.NullPointerException("Null aiCoreClient");
        }
        aliqVar.b = ymdVar;
        aliqVar.a = new defpackage.yos(1);
        return aliqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ynr) {
            defpackage.ynr ynrVar = (defpackage.ynr) obj;
            if (this.a.equals(ynrVar.a) && this.b.equals(ynrVar.b) && this.c.equals(ynrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ymk ymkVar = this.c;
        defpackage.yml ymlVar = this.b;
        return "LlmServiceOptions{aiCoreClient=" + java.lang.String.valueOf(this.a) + ", downloadCallback=" + java.lang.String.valueOf(ymlVar) + ", feature=" + java.lang.String.valueOf(ymkVar) + '}';
    }

    public ynr() {
        throw null;
    }
}
