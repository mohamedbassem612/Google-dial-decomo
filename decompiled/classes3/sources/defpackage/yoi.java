package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yoi {
    public final defpackage.ymd a;
    public final defpackage.yml b;
    public final defpackage.ymk c;

    public yoi(defpackage.ymd ymdVar, defpackage.yml ymlVar, defpackage.ymk ymkVar) {
        this.a = ymdVar;
        this.b = ymlVar;
        this.c = ymkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yoi) {
            defpackage.yoi yoiVar = (defpackage.yoi) obj;
            if (this.a.equals(yoiVar.a) && this.b.equals(yoiVar.b) && this.c.equals(yoiVar.c)) {
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
        return "SmartReplyServiceOptions{aiCoreClient=" + java.lang.String.valueOf(this.a) + ", downloadCallback=" + java.lang.String.valueOf(ymlVar) + ", feature=" + java.lang.String.valueOf(ymkVar) + '}';
    }

    public yoi() {
        throw null;
    }
}
