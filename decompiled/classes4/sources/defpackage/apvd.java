package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apvd implements android.net.http.UrlRequest$StatusListener {
    private final org.chromium.net.UrlRequest.StatusListener a;

    public apvd(org.chromium.net.UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
