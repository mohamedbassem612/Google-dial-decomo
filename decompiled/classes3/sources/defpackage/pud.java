package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pud implements defpackage.pug {
    private final /* synthetic */ int $cid;
    private final defpackage.ptw a;
    private final aoin b;

    public pud(defpackage.ptw ptwVar, aoin aoinVar, int i) {
        this.$cid = i;
        this.a = ptwVar;
        this.b = aoinVar;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        switch (this.$cid) {
            case 0:
                return j$.util.Optional.of((defpackage.pug) this.b.a());
            case 1:
                return j$.util.Optional.of((defpackage.pug) this.b.a());
            case 2:
                return j$.util.Optional.of((defpackage.pug) this.b.a());
            case 3:
                return ptyVar.a == defpackage.zpo.c ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.pug) this.b.a());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return j$.util.Optional.of((defpackage.pug) this.b.a());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return j$.util.Optional.of((defpackage.pug) this.b.a());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return j$.util.Optional.of((defpackage.pug) this.b.a());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return (ptyVar.a == defpackage.zpo.f && ptyVar.h == 1) ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.pug) this.b.a());
            default:
                return ((defpackage.ptj) this.b.a()).a(ptyVar);
        }
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        switch (this.$cid) {
            case 0:
                return "DIALING_CANCELED";
            case 1:
                return "ANSWERED";
            case 2:
                return "DIALING_FAILED";
            case 3:
                return "DIALING_STARTED";
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return "MISSED";
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return "PULLED_EXTERNALLY";
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return "REJECTED";
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return "RTT_ACTIVATED";
            default:
                return "RTT_DEACTIVATED";
        }
    }

    @Override // defpackage.pug
    public final void c() {
        switch (this.$cid) {
            case 0:
                this.a.a(new defpackage.ptm(15));
                break;
            case 1:
                this.a.a(new defpackage.ptm(0));
                break;
            case 2:
                this.a.a(new defpackage.ptm(17));
                break;
            case 3:
                this.a.a(new defpackage.ptm(18));
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.a.a(new defpackage.pui(1));
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.a.a(new defpackage.pui(2));
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this.a.a(new defpackage.pui(5));
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                this.a.a(new defpackage.pui(6));
                break;
            default:
                this.a.a(new defpackage.pui(7));
                break;
        }
    }
}
