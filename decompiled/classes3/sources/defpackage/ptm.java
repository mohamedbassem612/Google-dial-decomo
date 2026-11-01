package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ptm implements defpackage.ptv {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ptm(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ptv
    public final defpackage.ptu a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                final defpackage.znj znjVar = (defpackage.znj) obj;
                j$.util.Objects.requireNonNull(znjVar);
                final int i = 0;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i) {
                            case 0:
                                return znjVar.a();
                            case 1:
                                return znjVar.d();
                            case 2:
                                return znjVar.c();
                            case 3:
                                return znjVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znjVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znjVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znjVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znjVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znjVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znjVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znjVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znjVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znjVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znjVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znjVar.a();
                            case 15:
                                return znjVar.a();
                            case 16:
                                return znjVar.c();
                            case 17:
                                java.lang.Object obj5 = znjVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return znjVar.em();
                            case 19:
                                return znjVar.ek();
                            default:
                                return znjVar.a();
                        }
                    }
                };
            case 1:
                final defpackage.zni zniVar = (defpackage.zni) obj;
                j$.util.Objects.requireNonNull(zniVar);
                final int i2 = 1;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i2) {
                            case 0:
                                return zniVar.a();
                            case 1:
                                return zniVar.d();
                            case 2:
                                return zniVar.c();
                            case 3:
                                return zniVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) zniVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return zniVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) zniVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return zniVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return zniVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = zniVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) zniVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return zniVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) zniVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return zniVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return zniVar.a();
                            case 15:
                                return zniVar.a();
                            case 16:
                                return zniVar.c();
                            case 17:
                                java.lang.Object obj5 = zniVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return zniVar.em();
                            case 19:
                                return zniVar.ek();
                            default:
                                return zniVar.a();
                        }
                    }
                };
            case 2:
                final znu znuVar = (znu) obj;
                j$.util.Objects.requireNonNull(znuVar);
                final int i3 = 2;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i3) {
                            case 0:
                                return znuVar.a();
                            case 1:
                                return znuVar.d();
                            case 2:
                                return znuVar.c();
                            case 3:
                                return znuVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znuVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znuVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znuVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znuVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znuVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znuVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znuVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znuVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znuVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znuVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znuVar.a();
                            case 15:
                                return znuVar.a();
                            case 16:
                                return znuVar.c();
                            case 17:
                                java.lang.Object obj5 = znuVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return znuVar.em();
                            case 19:
                                return znuVar.ek();
                            default:
                                return znuVar.a();
                        }
                    }
                };
            case 3:
                final defpackage.znv znvVar = (defpackage.znv) obj;
                j$.util.Objects.requireNonNull(znvVar);
                final int i4 = 3;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i4) {
                            case 0:
                                return znvVar.a();
                            case 1:
                                return znvVar.d();
                            case 2:
                                return znvVar.c();
                            case 3:
                                return znvVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znvVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znvVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znvVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znvVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znvVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znvVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znvVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znvVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znvVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znvVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znvVar.a();
                            case 15:
                                return znvVar.a();
                            case 16:
                                return znvVar.c();
                            case 17:
                                java.lang.Object obj5 = znvVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return znvVar.em();
                            case 19:
                                return znvVar.ek();
                            default:
                                return znvVar.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                final defpackage.aprf aprfVar = (defpackage.aprf) obj;
                j$.util.Objects.requireNonNull(aprfVar);
                final int i5 = 4;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i5) {
                            case 0:
                                return aprfVar.a();
                            case 1:
                                return aprfVar.d();
                            case 2:
                                return aprfVar.c();
                            case 3:
                                return aprfVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) aprfVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return aprfVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) aprfVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return aprfVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return aprfVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = aprfVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) aprfVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return aprfVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) aprfVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return aprfVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return aprfVar.a();
                            case 15:
                                return aprfVar.a();
                            case 16:
                                return aprfVar.c();
                            case 17:
                                java.lang.Object obj5 = aprfVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return aprfVar.em();
                            case 19:
                                return aprfVar.ek();
                            default:
                                return aprfVar.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                final defpackage.znh znhVar = (defpackage.znh) obj;
                j$.util.Objects.requireNonNull(znhVar);
                final int i6 = 5;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i6) {
                            case 0:
                                return znhVar.a();
                            case 1:
                                return znhVar.d();
                            case 2:
                                return znhVar.c();
                            case 3:
                                return znhVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znhVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znhVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znhVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znhVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znhVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znhVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znhVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znhVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znhVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znhVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znhVar.a();
                            case 15:
                                return znhVar.a();
                            case 16:
                                return znhVar.c();
                            case 17:
                                java.lang.Object obj5 = znhVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return znhVar.em();
                            case 19:
                                return znhVar.ek();
                            default:
                                return znhVar.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                final defpackage.rai raiVar = (defpackage.rai) obj;
                j$.util.Objects.requireNonNull(raiVar);
                final int i7 = 6;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i7) {
                            case 0:
                                return raiVar.a();
                            case 1:
                                return raiVar.d();
                            case 2:
                                return raiVar.c();
                            case 3:
                                return raiVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) raiVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return raiVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) raiVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return raiVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return raiVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = raiVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) raiVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return raiVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) raiVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return raiVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return raiVar.a();
                            case 15:
                                return raiVar.a();
                            case 16:
                                return raiVar.c();
                            case 17:
                                java.lang.Object obj5 = raiVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return raiVar.em();
                            case 19:
                                return raiVar.ek();
                            default:
                                return raiVar.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                final defpackage.rag ragVar = (defpackage.rag) obj;
                j$.util.Objects.requireNonNull(ragVar);
                final int i8 = 10;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i8) {
                            case 0:
                                return ragVar.a();
                            case 1:
                                return ragVar.d();
                            case 2:
                                return ragVar.c();
                            case 3:
                                return ragVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) ragVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return ragVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) ragVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return ragVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return ragVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = ragVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) ragVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return ragVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) ragVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return ragVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return ragVar.a();
                            case 15:
                                return ragVar.a();
                            case 16:
                                return ragVar.c();
                            case 17:
                                java.lang.Object obj5 = ragVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return ragVar.em();
                            case 19:
                                return ragVar.ek();
                            default:
                                return ragVar.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                final defpackage.znt zntVar = (defpackage.znt) obj;
                j$.util.Objects.requireNonNull(zntVar);
                final int i9 = 11;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i9) {
                            case 0:
                                return zntVar.a();
                            case 1:
                                return zntVar.d();
                            case 2:
                                return zntVar.c();
                            case 3:
                                return zntVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) zntVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return zntVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) zntVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return zntVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return zntVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = zntVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) zntVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return zntVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) zntVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return zntVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return zntVar.a();
                            case 15:
                                return zntVar.a();
                            case 16:
                                return zntVar.c();
                            case 17:
                                java.lang.Object obj5 = zntVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return zntVar.em();
                            case 19:
                                return zntVar.ek();
                            default:
                                return zntVar.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                final defpackage.zng zngVar = (defpackage.zng) obj;
                j$.util.Objects.requireNonNull(zngVar);
                final int i10 = 7;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i10) {
                            case 0:
                                return zngVar.a();
                            case 1:
                                return zngVar.d();
                            case 2:
                                return zngVar.c();
                            case 3:
                                return zngVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) zngVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return zngVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) zngVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return zngVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return zngVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = zngVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) zngVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return zngVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) zngVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return zngVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return zngVar.a();
                            case 15:
                                return zngVar.a();
                            case 16:
                                return zngVar.c();
                            case 17:
                                java.lang.Object obj5 = zngVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return zngVar.em();
                            case 19:
                                return zngVar.ek();
                            default:
                                return zngVar.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                final defpackage.rai raiVar2 = (defpackage.rai) obj;
                j$.util.Objects.requireNonNull(raiVar2);
                final int i11 = 9;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i11) {
                            case 0:
                                return raiVar2.a();
                            case 1:
                                return raiVar2.d();
                            case 2:
                                return raiVar2.c();
                            case 3:
                                return raiVar2.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) raiVar2).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return raiVar2.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) raiVar2).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return raiVar2.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return raiVar2.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = raiVar2;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) raiVar2).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return raiVar2.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) raiVar2).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return raiVar2.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return raiVar2.a();
                            case 15:
                                return raiVar2.a();
                            case 16:
                                return raiVar2.c();
                            case 17:
                                java.lang.Object obj5 = raiVar2;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return raiVar2.em();
                            case 19:
                                return raiVar2.ek();
                            default:
                                return raiVar2.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                final oq oqVar = (oq) obj;
                j$.util.Objects.requireNonNull(oqVar);
                final int i12 = 12;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i12) {
                            case 0:
                                return oqVar.a();
                            case 1:
                                return oqVar.d();
                            case 2:
                                return oqVar.c();
                            case 3:
                                return oqVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) oqVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return oqVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) oqVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return oqVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return oqVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = oqVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) oqVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return oqVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) oqVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return oqVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return oqVar.a();
                            case 15:
                                return oqVar.a();
                            case 16:
                                return oqVar.c();
                            case 17:
                                java.lang.Object obj5 = oqVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return oqVar.em();
                            case 19:
                                return oqVar.ek();
                            default:
                                return oqVar.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                final defpackage.zng zngVar2 = (defpackage.zng) obj;
                j$.util.Objects.requireNonNull(zngVar2);
                final int i13 = 8;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i13) {
                            case 0:
                                return zngVar2.a();
                            case 1:
                                return zngVar2.d();
                            case 2:
                                return zngVar2.c();
                            case 3:
                                return zngVar2.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) zngVar2).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return zngVar2.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) zngVar2).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return zngVar2.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return zngVar2.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = zngVar2;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) zngVar2).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return zngVar2.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) zngVar2).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return zngVar2.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return zngVar2.a();
                            case 15:
                                return zngVar2.a();
                            case 16:
                                return zngVar2.c();
                            case 17:
                                java.lang.Object obj5 = zngVar2;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return zngVar2.em();
                            case 19:
                                return zngVar2.ek();
                            default:
                                return zngVar2.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                final defpackage.znk znkVar = (defpackage.znk) obj;
                j$.util.Objects.requireNonNull(znkVar);
                final int i14 = 13;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i14) {
                            case 0:
                                return znkVar.a();
                            case 1:
                                return znkVar.d();
                            case 2:
                                return znkVar.c();
                            case 3:
                                return znkVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znkVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znkVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znkVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znkVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znkVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znkVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znkVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znkVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znkVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znkVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znkVar.a();
                            case 15:
                                return znkVar.a();
                            case 16:
                                return znkVar.c();
                            case 17:
                                java.lang.Object obj5 = znkVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return znkVar.em();
                            case 19:
                                return znkVar.ek();
                            default:
                                return znkVar.a();
                        }
                    }
                };
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                final defpackage.znl znlVar = (defpackage.znl) obj;
                j$.util.Objects.requireNonNull(znlVar);
                final int i15 = 14;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i15) {
                            case 0:
                                return znlVar.a();
                            case 1:
                                return znlVar.d();
                            case 2:
                                return znlVar.c();
                            case 3:
                                return znlVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znlVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znlVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znlVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znlVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znlVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znlVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znlVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znlVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znlVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znlVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znlVar.a();
                            case 15:
                                return znlVar.a();
                            case 16:
                                return znlVar.c();
                            case 17:
                                java.lang.Object obj5 = znlVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return znlVar.em();
                            case 19:
                                return znlVar.ek();
                            default:
                                return znlVar.a();
                        }
                    }
                };
            case 15:
                final defpackage.znm znmVar = (defpackage.znm) obj;
                j$.util.Objects.requireNonNull(znmVar);
                final int i16 = 15;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i16) {
                            case 0:
                                return znmVar.a();
                            case 1:
                                return znmVar.d();
                            case 2:
                                return znmVar.c();
                            case 3:
                                return znmVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znmVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znmVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znmVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znmVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znmVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znmVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znmVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znmVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znmVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znmVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znmVar.a();
                            case 15:
                                return znmVar.a();
                            case 16:
                                return znmVar.c();
                            case 17:
                                java.lang.Object obj5 = znmVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return znmVar.em();
                            case 19:
                                return znmVar.ek();
                            default:
                                return znmVar.a();
                        }
                    }
                };
            case 16:
                final defpackage.znn znnVar = (defpackage.znn) obj;
                j$.util.Objects.requireNonNull(znnVar);
                final int i17 = 16;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i17) {
                            case 0:
                                return znnVar.a();
                            case 1:
                                return znnVar.d();
                            case 2:
                                return znnVar.c();
                            case 3:
                                return znnVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znnVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znnVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znnVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znnVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znnVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znnVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znnVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znnVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znnVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znnVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znnVar.a();
                            case 15:
                                return znnVar.a();
                            case 16:
                                return znnVar.c();
                            case 17:
                                java.lang.Object obj5 = znnVar;
                                defpackage.qgc qgcVar = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar.d);
                            case 18:
                                return znnVar.em();
                            case 19:
                                return znnVar.ek();
                            default:
                                return znnVar.a();
                        }
                    }
                };
            case 17:
                final defpackage.qgc qgcVar = (defpackage.qgc) obj;
                j$.util.Objects.requireNonNull(qgcVar);
                final int i18 = 17;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i18) {
                            case 0:
                                return qgcVar.a();
                            case 1:
                                return qgcVar.d();
                            case 2:
                                return qgcVar.c();
                            case 3:
                                return qgcVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) qgcVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return qgcVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) qgcVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return qgcVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return qgcVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = qgcVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) qgcVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return qgcVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) qgcVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return qgcVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return qgcVar.a();
                            case 15:
                                return qgcVar.a();
                            case 16:
                                return qgcVar.c();
                            case 17:
                                java.lang.Object obj5 = qgcVar;
                                defpackage.qgc qgcVar2 = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar2.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar2.d);
                            case 18:
                                return qgcVar.em();
                            case 19:
                                return qgcVar.ek();
                            default:
                                return qgcVar.a();
                        }
                    }
                };
            case 18:
                final defpackage.zno znoVar = (defpackage.zno) obj;
                j$.util.Objects.requireNonNull(znoVar);
                final int i19 = 18;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i19) {
                            case 0:
                                return znoVar.a();
                            case 1:
                                return znoVar.d();
                            case 2:
                                return znoVar.c();
                            case 3:
                                return znoVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znoVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znoVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znoVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znoVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znoVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znoVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znoVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znoVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znoVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znoVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znoVar.a();
                            case 15:
                                return znoVar.a();
                            case 16:
                                return znoVar.c();
                            case 17:
                                java.lang.Object obj5 = znoVar;
                                defpackage.qgc qgcVar2 = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar2.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar2.d);
                            case 18:
                                return znoVar.em();
                            case 19:
                                return znoVar.ek();
                            default:
                                return znoVar.a();
                        }
                    }
                };
            case 19:
                final defpackage.znp znpVar = (defpackage.znp) obj;
                j$.util.Objects.requireNonNull(znpVar);
                final int i20 = 19;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i20) {
                            case 0:
                                return znpVar.a();
                            case 1:
                                return znpVar.d();
                            case 2:
                                return znpVar.c();
                            case 3:
                                return znpVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znpVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znpVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znpVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znpVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znpVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znpVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znpVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znpVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znpVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znpVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znpVar.a();
                            case 15:
                                return znpVar.a();
                            case 16:
                                return znpVar.c();
                            case 17:
                                java.lang.Object obj5 = znpVar;
                                defpackage.qgc qgcVar2 = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar2.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar2.d);
                            case 18:
                                return znpVar.em();
                            case 19:
                                return znpVar.ek();
                            default:
                                return znpVar.a();
                        }
                    }
                };
            default:
                final defpackage.znq znqVar = (defpackage.znq) obj;
                j$.util.Objects.requireNonNull(znqVar);
                final int i21 = 20;
                return new defpackage.ptu() { // from class: ptl
                    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, znj] */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, znh] */
                    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, zng] */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, zni] */
                    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, znt] */
                    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, znk] */
                    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object, znl] */
                    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, znm] */
                    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, znn] */
                    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, znu] */
                    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, zno] */
                    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Object, znp] */
                    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Object, znq] */
                    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, znv] */
                    @Override // defpackage.ptu
                    public final ajcq a() {
                        switch (i21) {
                            case 0:
                                return znqVar.a();
                            case 1:
                                return znqVar.d();
                            case 2:
                                return znqVar.c();
                            case 3:
                                return znqVar.ej();
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                java.lang.Object obj2 = ((defpackage.aprf) znqVar).a;
                                defpackage.szs szsVar = (defpackage.szs) obj2;
                                if (szsVar.k()) {
                                    szsVar.D.a(qbc.fu);
                                    szsVar.c.g(ahvr.H(szsVar.i.b(szsVar.k), new defpackage.soi(obj2, 15), szsVar.f), 1L, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                return znqVar.a();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                defpackage.rcm rcmVar = (defpackage.rcm) ((defpackage.rai) znqVar).a;
                                ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(true);
                                java.lang.Object obj3 = rcmVar.c;
                                ajcq ajcqVar = ajcm.a;
                                ((zpz) obj3).a(ajcqVar);
                                return ajcqVar;
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                return znqVar.a();
                            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                                return znqVar.b();
                            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                                a.bI(defpackage.qgn.a.d(), "Call started as RTT failed.", "com/android/dialer/incall/rtt/service/RttSessionController$3", "onCallStartedAsRttFailed", 'i', "RttSessionController.java", zct.b);
                                java.lang.Object obj4 = znqVar;
                                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) obj4).a;
                                qgnVar.m.a(qbc.eb);
                                ahrv ahrvVarG = ahrv.g(((defpackage.afpl) qgnVar.e.a()).X());
                                defpackage.qgk qgkVar = new defpackage.qgk(0);
                                ajct ajctVar = qgnVar.d;
                                return ahrvVarG.i(qgkVar, ajctVar).i(new defpackage.qfc(obj4, 7), ajctVar);
                            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                                defpackage.rah rahVar = ((defpackage.rag) znqVar).a;
                                return aosv.C(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 14, (byte[]) null)));
                            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                                return znqVar.b();
                            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                                kxr kxrVar = (kxr) ((oq) znqVar).a;
                                if (kxrVar.f()) {
                                    kxrVar.d();
                                }
                                return ajcm.a;
                            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                                return znqVar.b();
                            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                                return znqVar.a();
                            case 15:
                                return znqVar.a();
                            case 16:
                                return znqVar.c();
                            case 17:
                                java.lang.Object obj5 = znqVar;
                                defpackage.qgc qgcVar2 = (defpackage.qgc) obj5;
                                return ahvr.I(((defpackage.qgb) aooc.ar(qgcVar2.g.Y(), defpackage.qgb.class)).bs(), new defpackage.qfc(obj5, 6), qgcVar2.d);
                            case 18:
                                return znqVar.em();
                            case 19:
                                return znqVar.ek();
                            default:
                                return znqVar.a();
                        }
                    }
                };
        }
    }
}
