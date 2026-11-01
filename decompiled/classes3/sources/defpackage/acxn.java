package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxn {
    private android.net.Uri a;
    private java.lang.String b;
    private defpackage.acxm c;
    private int d;
    private aify e;
    private final ahyn f = ahwt.a;
    private akyp g;
    private byte h;

    public final defpackage.acxo a() {
        android.net.Uri uri;
        java.lang.String str;
        defpackage.acxm acxmVar;
        aify aifyVar;
        akyp akypVar;
        java.lang.String str2 = this.b;
        if (str2 == null) {
            throw new java.lang.IllegalStateException("Property \"urlToDownload\" has not been set");
        }
        if (str2.startsWith("inlinefile")) {
            ahvr.bN(false, "InlineDownloadParams must be set when using inlinefile: scheme");
            c(defpackage.acxm.a);
        }
        if (this.h == 1 && (uri = this.a) != null && (str = this.b) != null && (acxmVar = this.c) != null && (aifyVar = this.e) != null && (akypVar = this.g) != null) {
            return new defpackage.acxo(uri, str, acxmVar, this.d, aifyVar, this.f, akypVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" fileUri");
        }
        if (this.b == null) {
            sb.append(" urlToDownload");
        }
        if (this.c == null) {
            sb.append(" downloadConstraints");
        }
        if (this.h == 0) {
            sb.append(" trafficTag");
        }
        if (this.e == null) {
            sb.append(" extraHttpHeaders");
        }
        if (this.g == null) {
            sb.append(" customDownloaderMetadata");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(akyp akypVar) {
        if (akypVar == null) {
            throw new java.lang.NullPointerException("Null customDownloaderMetadata");
        }
        this.g = akypVar;
    }

    public final void c(defpackage.acxm acxmVar) {
        if (acxmVar == null) {
            throw new java.lang.NullPointerException("Null downloadConstraints");
        }
        this.c = acxmVar;
    }

    public final void d(aify aifyVar) {
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null extraHttpHeaders");
        }
        this.e = aifyVar;
    }

    public final void e(android.net.Uri uri) {
        if (uri == null) {
            throw new java.lang.NullPointerException("Null fileUri");
        }
        this.a = uri;
    }

    public final void f(int i) {
        this.d = i;
        this.h = (byte) 1;
    }

    public final void g(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null urlToDownload");
        }
        this.b = str;
    }
}
