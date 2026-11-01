package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class absj implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ absj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v19, types: [adfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20, types: [adfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [adsm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24, types: [adsm, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        switch (this.$cid) {
            case 0:
                android.os.Process.myTid();
                this.a.run();
                return;
            case 1:
                throw ((java.lang.Throwable) this.a);
            case 2:
                defpackage.acjy acjyVar = (defpackage.acjy) this.a;
                if (!acjyVar.as) {
                    acjyVar.av.u(acjyVar.ar, defpackage.acir.a);
                }
                acjyVar.as = true;
                return;
            case 3:
                ((android.app.Dialog) this.a).dismiss();
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((defpackage.acml) this.a).k();
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.acmz) this.a).a();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.acmz) this.a).a();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.adcd adcdVar = (defpackage.adcd) this.a;
                adcdVar.a.get();
                defpackage.acwu acwuVar = adcdVar.c;
                defpackage.acvj acvjVar = acwuVar.b;
                dva dvaVar = acwuVar.c;
                dvr dvrVar = acwuVar.d;
                defpackage.acxu acxuVar = acwuVar.a;
                acwx acwxVar = acwuVar.f;
                ahvr.I(acwxVar.j.g(acxuVar.a), new jsc(acwuVar, acvjVar, dvaVar, dvrVar, 17), acwxVar.f);
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                this.a.b();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                this.a.a();
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.adow adowVar = (defpackage.adow) this.a;
                adpe adpeVar = adowVar.i;
                if (adpeVar.h()) {
                    adowVar.l();
                    adpeVar.g();
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                this.a.a();
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                this.a.b();
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.aduo) this.a).a.cancel(false);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.adwx) this.a).a();
                return;
            case 15:
                ((defpackage.afpl) this.a).k();
                return;
            case 16:
                defpackage.aekj aekjVar = (defpackage.aekj) this.a;
                android.animation.AnimatorSet animatorSet = aekjVar.y;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                aekjVar.f(true);
                return;
            case 17:
                ((defpackage.aekj) this.a).i(false);
                return;
            case 18:
                defpackage.aekj aekjVar2 = ((defpackage.aekg) this.a).a;
                aekjVar2.f(true);
                aekjVar2.m(aekjVar2.h.a.d(), aekjVar2.h.a.a());
                return;
            case 19:
                ((ahbz) ((ahbz) this.a).f).m(2);
                return;
            default:
                ((aerd) this.a).a();
                return;
        }
    }
}
