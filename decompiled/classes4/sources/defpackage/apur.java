package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apur extends org.chromium.net.UrlResponseInfo.HeaderBlock {
    private final android.net.http.HeaderBlock a;

    public apur(android.net.http.HeaderBlock headerBlock) {
        this.a = headerBlock;
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final java.util.List getAsList() {
        return this.a.getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo.HeaderBlock
    public final java.util.Map getAsMap() {
        return this.a.getAsMap();
    }
}
