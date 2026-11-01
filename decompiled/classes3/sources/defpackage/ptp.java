package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ptp implements defpackage.pug {
    private final /* synthetic */ int $cid;
    private final aoin a;
    private final defpackage.ptw b;
    private final defpackage.ptx c;

    public ptp(aoin aoinVar, defpackage.ptw ptwVar, defpackage.ptx ptxVar, int i) {
        this.$cid = i;
        this.c = ptxVar;
        this.a = aoinVar;
        this.b = ptwVar;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        switch (this.$cid) {
            case 0:
                int iOrdinal = ptyVar.b.ordinal();
                if (iOrdinal == 1) {
                    return ptyVar.a == defpackage.zpo.g ? j$.util.Optional.of((defpackage.pug) this.a.a()) : j$.util.Optional.empty();
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    return j$.util.Optional.of((defpackage.pug) this.a.a());
                }
                return ptyVar.a.ordinal() != 11 ? j$.util.Optional.of((defpackage.pug) this.a.a()) : j$.util.Optional.empty();
            case 1:
                defpackage.zpo zpoVar = ptyVar.a;
                defpackage.zpo zpoVar2 = defpackage.zpo.g;
                if (zpoVar == zpoVar2) {
                    defpackage.ptx ptxVar = this.c;
                    ptxVar.a.set(true);
                    ptxVar.d.a(ajcm.a);
                }
                if (ptyVar.b == defpackage.zmx.c) {
                    return zpoVar == zpoVar2 ? j$.util.Optional.of((defpackage.pug) this.a.a()) : j$.util.Optional.empty();
                }
                return zpoVar == defpackage.zpo.d ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.pug) this.a.a());
            case 2:
                return j$.util.Optional.of((defpackage.pug) this.a.a());
            case 3:
                return ((defpackage.ptj) this.a.a()).a(ptyVar);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return j$.util.Optional.of((defpackage.pug) this.a.a());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.ptj) this.a.a()).a(ptyVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return (ptyVar.a == defpackage.zpo.f && ptyVar.d.c()) ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.pug) this.a.a());
            default:
                return ((defpackage.ptj) this.a.a()).a(ptyVar);
        }
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        switch (this.$cid) {
            case 0:
                return "AUDIO_PROCESSING_STARTED";
            case 1:
                return "ANSWERING_STARTED";
            case 2:
                return "RECEIVED_VIDEO_REQUEST_ACCEPTED";
            case 3:
                return "RECEIVED_VIDEO_REQUEST_REJECTED";
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return "SENT_VIDEO_REQUEST_ACCEPTED";
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return "SENT_VIDEO_REQUEST_REJECTED";
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return "VIDEO_ACTIVATED";
            default:
                return "VIDEO_DEACTIVATED";
        }
    }

    @Override // defpackage.pug
    public final void c() {
        switch (this.$cid) {
            case 0:
                this.c.c(true);
                this.b.a(new defpackage.ptm(5));
                return;
            case 1:
                ahoq ahoqVarW = ahvr.W(527, "AnsweringStartedEventState_fireEvent");
                try {
                    this.c.f(true);
                    this.b.a(new defpackage.ptm(3));
                    ahoqVarW.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 2:
                this.c.h(false);
                this.b.a(new defpackage.pui(3));
                return;
            case 3:
                this.c.h(false);
                this.b.a(new defpackage.pui(4));
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                this.c.i(false);
                this.b.a(new defpackage.pui(8));
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.c.i(false);
                this.b.a(new defpackage.pui(9));
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                this.c.b(true);
                this.b.a(new defpackage.pui(11));
                return;
            default:
                this.c.b(false);
                this.b.a(new defpackage.pui(12));
                return;
        }
    }

    public ptp(defpackage.ptw ptwVar, defpackage.ptx ptxVar, aoin aoinVar, int i) {
        this.$cid = i;
        this.b = ptwVar;
        this.c = ptxVar;
        this.a = aoinVar;
    }

    public ptp(defpackage.ptx ptxVar, defpackage.ptw ptwVar, aoin aoinVar, int i) {
        this.$cid = i;
        this.c = ptxVar;
        this.b = ptwVar;
        this.a = aoinVar;
    }
}
