package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yot {
    public final defpackage.ymd a;
    public final defpackage.yml b;
    public final defpackage.ymk c;

    public yot(defpackage.ymd ymdVar, defpackage.yml ymlVar, defpackage.ymk ymkVar) {
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
        aliqVar.a = new defpackage.yos(0);
        return aliqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yot) {
            defpackage.yot yotVar = (defpackage.yot) obj;
            if (this.a.equals(yotVar.a) && this.b.equals(yotVar.b) && this.c.equals(yotVar.c)) {
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
        return "SummarizationServiceOptions{aiCoreClient=" + java.lang.String.valueOf(this.a) + ", downloadCallback=" + java.lang.String.valueOf(ymlVar) + ", feature=" + java.lang.String.valueOf(ymkVar) + '}';
    }

    public yot() {
        throw null;
    }
}
