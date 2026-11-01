package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agob implements aomy {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public agob(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aoir, java.lang.Object] */
    public final /* synthetic */ java.lang.Object a() {
        emn emnVar;
        switch (this.$cid) {
            case 0:
                return this.a;
            case 1:
                return ((mp) this.a).T();
            case 2:
                return ((defpackage.agob) this.a).a;
            case 3:
                return zb.j((aoir) this.a).S();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                eoi eoiVarJ = zb.j((aoir) this.a);
                emnVar = eoiVarJ instanceof emn ? (emn) eoiVarJ : null;
                return emnVar != null ? emnVar.T() : eoo.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this = (defpackage.agob) this.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return zb.j((aoir) this.a).S();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                eoi eoiVarJ2 = zb.j((aoir) this.a);
                emnVar = eoiVarJ2 instanceof emn ? (emn) eoiVarJ2 : null;
                return emnVar != null ? emnVar.T() : eoo.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                this = (defpackage.agob) this.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return zb.j((aoir) this.a).S();
            default:
                eoi eoiVarJ3 = zb.j((aoir) this.a);
                emnVar = eoiVarJ3 instanceof emn ? (emn) eoiVarJ3 : null;
                return emnVar != null ? emnVar.T() : eoo.a;
        }
    }
}
