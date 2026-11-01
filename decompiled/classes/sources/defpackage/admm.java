package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class admm {
    public final defpackage.adni a;
    public final defpackage.admy b;
    public final defpackage.ajcu c;
    public final defpackage.adlb d;
    public final defpackage.tvn e;

    public admm(defpackage.adni adniVar, defpackage.admy admyVar, defpackage.ajcu ajcuVar, defpackage.adlb adlbVar, defpackage.tvn tvnVar) {
        this.a = adniVar;
        this.b = admyVar;
        this.c = ajcuVar;
        this.d = adlbVar;
        this.e = tvnVar;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.admy admyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.admm) {
            defpackage.admm admmVar = (defpackage.admm) obj;
            if (this.a.equals(admmVar.a) && ((admyVar = this.b) != null ? admyVar.equals(admmVar.b) : admmVar.b == null) && this.c.equals(admmVar.c) && this.d.equals(admmVar.d) && this.e.equals(admmVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        defpackage.admy admyVar = this.b;
        return (((((((iHashCode * 1000003) ^ (admyVar == null ? 0 : admyVar.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.tvn tvnVar = this.e;
        defpackage.adlb adlbVar = this.d;
        defpackage.ajcu ajcuVar = this.c;
        defpackage.admy admyVar = this.b;
        return "DownloadJobConfig{scheduler=" + java.lang.String.valueOf(this.a) + ", retryParameters=" + java.lang.String.valueOf(admyVar) + ", controlExecutor=" + java.lang.String.valueOf(ajcuVar) + ", downloadFetcher=" + java.lang.String.valueOf(adlbVar) + ", downloadQueue=" + java.lang.String.valueOf(tvnVar) + '}';
    }

    public admm() {
        throw null;
    }
}
