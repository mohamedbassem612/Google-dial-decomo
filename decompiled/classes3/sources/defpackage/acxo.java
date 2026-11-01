package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxo {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final defpackage.acxm c;
    public final int d;
    public final aify e;
    private final ahyn f;
    private final akyp g;

    public acxo(android.net.Uri uri, java.lang.String str, defpackage.acxm acxmVar, int i, aify aifyVar, ahyn ahynVar, akyp akypVar) {
        this.a = uri;
        this.b = str;
        this.c = acxmVar;
        this.d = i;
        this.e = aifyVar;
        this.f = ahynVar;
        this.g = akypVar;
    }

    public static defpackage.acxn a() {
        defpackage.acxn acxnVar = new defpackage.acxn();
        acxnVar.f(-1);
        acxnVar.d(aike.a);
        acxnVar.b(akyp.a);
        return acxnVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acxo) {
            defpackage.acxo acxoVar = (defpackage.acxo) obj;
            if (this.a.equals(acxoVar.a) && this.b.equals(acxoVar.b) && this.c.equals(acxoVar.c) && this.d == acxoVar.d && ahvr.aP(this.e, acxoVar.e) && this.f.equals(acxoVar.f) && this.g.equals(acxoVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode();
    }

    public final java.lang.String toString() {
        akyp akypVar = this.g;
        ahyn ahynVar = this.f;
        aify aifyVar = this.e;
        defpackage.acxm acxmVar = this.c;
        return "DownloadRequest{fileUri=" + java.lang.String.valueOf(this.a) + ", urlToDownload=" + this.b + ", downloadConstraints=" + java.lang.String.valueOf(acxmVar) + ", trafficTag=" + this.d + ", extraHttpHeaders=" + java.lang.String.valueOf(aifyVar) + ", inlineDownloadParamsOptional=" + java.lang.String.valueOf(ahynVar) + ", customDownloaderMetadata=" + java.lang.String.valueOf(akypVar) + '}';
    }

    public acxo() {
        throw null;
    }
}
