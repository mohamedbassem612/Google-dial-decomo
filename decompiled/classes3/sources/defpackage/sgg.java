package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sgg implements amyv {
    public static ahkm b() {
        return zja.a("PreferredSimStatus", defpackage.suj.a).a();
    }

    public static ouh c(final defpackage.szs szsVar) {
        j$.util.Objects.requireNonNull(szsVar);
        return new ouh() { // from class: szp
            public final void a() {
                defpackage.szs szsVar2 = szsVar;
                szsVar2.l(7);
                szsVar2.D.a(qbc.ff);
                szsVar2.d.a();
                agsm.i(855, szsVar2.h.b(lgj.d), "failed setting CallScreenUiType for REVELIO_TRANSCRIPT", new java.lang.Object[0]);
            }
        };
    }

    public static defpackage.uaq d(aoin aoinVar, ajct ajctVar, zpz zpzVar, defpackage.qbe qbeVar, mba mbaVar, defpackage.rap rapVar, defpackage.ubl ublVar, agsm agsmVar, java.lang.Object obj) {
        return new defpackage.uaq(aoinVar, ajctVar, zpzVar, qbeVar, mbaVar, rapVar, ublVar, agsmVar, (defpackage.uae) obj);
    }

    public static defpackage.uar e(ajct ajctVar, ajcu ajcuVar, aoin aoinVar, zpz zpzVar, mba mbaVar, agsm agsmVar, defpackage.uaq uaqVar, java.lang.Object obj) {
        return new defpackage.uar(ajctVar, ajcuVar, aoinVar, zpzVar, mbaVar, agsmVar, uaqVar, (defpackage.uae) obj);
    }

    public static defpackage.uyo f(java.lang.Object obj) {
        return new defpackage.uyo((defpackage.voc) obj);
    }

    public static defpackage.vko g(defpackage.vkj vkjVar, defpackage.vka vkaVar, ajct ajctVar, rlv rlvVar, vgl vglVar, vdc vdcVar, java.lang.Object obj, vku vkuVar) {
        return new defpackage.vko(vkjVar, vkaVar, ajctVar, rlvVar, vglVar, vdcVar, vkuVar);
    }

    public static java.lang.String h(android.telecom.Call call, zjm zjmVar) {
        java.lang.String strE = zjmVar.e(call);
        aooc.ap(strE);
        return strE;
    }

    public static zjm i() {
        return zjm.h(new kuq(10));
    }

    public static zjm j(final defpackage.teg tegVar) {
        aooh.f(tegVar, "flippablesPsdIntegration");
        final int i = 20;
        return zjm.h(new aoin() { // from class: rey
            /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v10, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v14, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v18, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v22, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v27, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v32, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v36, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v40, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v44, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v48, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v5, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v54, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v57, types: [aoin, java.lang.Object] */
            public final java.lang.Object a() {
                switch (i) {
                    case 0:
                        return ((defpackage.rfa) tegVar.a()).b;
                    case 1:
                        return ((defpackage.rfa) tegVar.a()).a;
                    case 2:
                        return tegVar;
                    case 3:
                        return ((defpackage.rhp) tegVar.a()).g;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        return ((defpackage.she) tegVar.a()).e;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        return ((defpackage.she) tegVar.a()).c;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        return ((defpackage.she) tegVar.a()).d;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        return tegVar;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        return ((defpackage.rdp) tegVar.a()).b;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        return tegVar;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        return ((defpackage.szs) tegVar.a()).J;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        return ((defpackage.szs) tegVar.a()).u;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        return ((defpackage.szs) tegVar.a()).v;
                    case 15:
                        return ((defpackage.tcl) tegVar.a()).t;
                    case 16:
                        return ((defpackage.tcl) tegVar.a()).s;
                    case 17:
                        return new defpackage.aprf(tegVar, (byte[]) null);
                    case 18:
                        return (rvd) tegVar.a();
                    case 19:
                        return (rsr) tegVar.a();
                    default:
                        return tegVar;
                }
            }
        });
    }

    public static defpackage.qia k(final defpackage.toj tojVar, final aazc aazcVar, final aoss aossVar) {
        aooh.f(tojVar, "sharpieLifecycleController");
        aooh.f(aazcVar, "clock");
        aooh.f(aossVar, "lightweightScope");
        return new defpackage.qia() { // from class: tmv
            @Override // defpackage.qia
            public final void a() {
                aoov.an(aossVar, (aolr) null, 0, new defpackage.tkz(tojVar, aazcVar, (aoln) null, 4), 3);
            }
        };
    }

    public static zjm l(hrc hrcVar, aoin aoinVar) {
        aooh.f(aoinVar, "impl");
        return new zjm(aoinVar, new hqc(7));
    }

    public static defpackage.qia m(defpackage.vie vieVar) {
        j$.util.Objects.requireNonNull(vieVar);
        return new oow(vieVar, 8);
    }

    public static defpackage.qia n(defpackage.vie vieVar) {
        j$.util.Objects.requireNonNull(vieVar);
        return new oow(vieVar, 7);
    }

    public static defpackage.qia o(defpackage.vie vieVar) {
        j$.util.Objects.requireNonNull(vieVar);
        return new oow(vieVar, 6);
    }

    public static defpackage.rju p(aoin aoinVar) {
        defpackage.rju rjuVar = (defpackage.rju) aoinVar.a();
        aooc.ap(rjuVar);
        return rjuVar;
    }

    public static defpackage.tzx q(ajct ajctVar, agsm agsmVar, defpackage.uss ussVar, defpackage.uaq uaqVar, defpackage.tzv tzvVar, zpz zpzVar, defpackage.tzr tzrVar, zjm zjmVar, java.lang.Object obj) {
        return new defpackage.tzx(ajctVar, agsmVar, ussVar, uaqVar, tzvVar, zpzVar, tzrVar, zjmVar, (defpackage.uae) obj);
    }

    public static ajml r(ajml ajmlVar, swa swaVar) {
        aooh.f(swaVar, "singletonCache");
        aooh.f(swaVar, "cache");
        return new ajml(ajmlVar.a, ((tkl) ajmlVar.b).c(swaVar, "CallScopedSpamStatusCache"));
    }

    public static agva s(final aoin aoinVar, aogc aogcVar) {
        j$.util.Objects.requireNonNull(aoinVar);
        final int i = 11;
        return new agvg(new aoin() { // from class: wcx
            /* JADX WARN: Type inference failed for: r3v1, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v12, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v16, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v20, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v24, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v28, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v32, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v36, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v39, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v42, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v45, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v5, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v52, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v56, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v60, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v64, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v68, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v72, types: [aoin, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v8, types: [aoin, java.lang.Object] */
            public final java.lang.Object a() {
                switch (i) {
                    case 0:
                        return new defpackage.afpl(defpackage.ztw.c, (defpackage.zux) aoinVar.a(), (char[]) null);
                    case 1:
                        return (defpackage.znt) aoinVar.a();
                    case 2:
                        return ((defpackage.wcz) aoinVar.a()).e;
                    case 3:
                        return ((defpackage.wcz) aoinVar.a()).f;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        return ((defpackage.wky) aoinVar.a()).v;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        return ((defpackage.wky) aoinVar.a()).u;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        return ((defpackage.wky) aoinVar.a()).w;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        return ((defpackage.wky) aoinVar.a()).t;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        return ((defpackage.wky) aoinVar.a()).x;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        return (defpackage.qtx) aoinVar.a();
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        return (aguq) aoinVar.a();
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        return (aguq) aoinVar.a();
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        return ((defpackage.xbk) aoinVar.a()).n;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        return ((defpackage.xca) aoinVar).g;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        return ((defpackage.xcy) aoinVar.a()).A;
                    case 15:
                        return ((defpackage.xcy) aoinVar.a()).w;
                    case 16:
                        return ((defpackage.xcy) aoinVar.a()).y;
                    case 17:
                        return ((defpackage.xcy) aoinVar.a()).z;
                    case 18:
                        return ((defpackage.xcy) aoinVar.a()).x;
                    case 19:
                        return (ahlb) aoinVar.a();
                    default:
                        return aoinVar;
                }
            }
        }, aogcVar);
    }

    public static defpackage.tam t(ajcu ajcuVar, defpackage.pqm pqmVar, lev levVar, tbm tbmVar, long j, defpackage.afpl afplVar, defpackage.szs szsVar, swn swnVar, defpackage.swx swxVar, tbo tboVar, java.lang.Object obj, ljd ljdVar, defpackage.qbe qbeVar, java.lang.String str, zpz zpzVar, j$.util.Optional optional) {
        return new defpackage.tam(ajcuVar, pqmVar, levVar, tbmVar, j, afplVar, szsVar, swnVar, swxVar, tboVar, (defpackage.szt) obj, ljdVar, qbeVar, str, zpzVar, optional);
    }

    public static defpackage.tzv u(ajct ajctVar, ajcu ajcuVar, hxv hxvVar, mba mbaVar, zpz zpzVar, java.lang.Object obj, agsm agsmVar, defpackage.tzl tzlVar, zdl zdlVar, defpackage.afpl afplVar) {
        return new defpackage.tzv(ajctVar, ajcuVar, hxvVar, mbaVar, zpzVar, (defpackage.taq) obj, agsmVar, tzlVar, zdlVar, afplVar);
    }

    public static defpackage.wll v(android.view.accessibility.AccessibilityManager accessibilityManager, defpackage.pqo pqoVar, java.lang.String str, zpm zpmVar, defpackage.afpl afplVar, aoss aossVar, defpackage.whs whsVar, defpackage.wjo wjoVar, defpackage.wpx wpxVar, java.lang.Object obj, aoin aoinVar) {
        return new defpackage.wll(accessibilityManager, pqoVar, str, zpmVar, afplVar, aossVar, whsVar, wjoVar, wpxVar, (defpackage.wmy) obj, aoinVar);
    }

    public final /* synthetic */ java.lang.Object a() {
        throw null;
    }
}
