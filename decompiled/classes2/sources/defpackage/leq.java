package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class leq implements zni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public leq(defpackage.ibs ibsVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ibsVar);
        this.a = ibsVar;
    }

    public final ajcq d() {
        int i = 12;
        int i2 = 3;
        switch (this.$cid) {
            case 0:
                return ((defpackage.lev) this.a).a();
            case 1:
                ((defpackage.ibs) this.a).b();
                return ajcm.a;
            case 2:
                java.lang.Object obj = this.a;
                defpackage.nyz nyzVar = (defpackage.nyz) obj;
                return ahvr.H(nyzVar.g.d(), new defpackage.mjl(obj, i2), nyzVar.h);
            case 3:
                java.lang.Object obj2 = this.a;
                defpackage.lye lyeVar = new defpackage.lye(obj2, i);
                otq otqVar = (otq) obj2;
                agsm.i(432, ahvr.E(lyeVar, otqVar.e), "stop jank recorder failed", new java.lang.Object[0]);
                return otqVar.a(oto.c);
            case 4:
                pqm pqmVar = (pqm) this.a;
                return pqmVar.j(pqmVar.i);
            case 5:
                pzj pzjVar = (pzj) this.a;
                return aosv.F(pzjVar.a, 0, new oxe(pzjVar, (aoln) null, 5), 3);
            case 6:
                qeg.a.b().l("com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector", "onCallActivated", 100, "AudioDetector.java").v("activated");
                qeg qegVar = (qeg) this.a;
                return (!qegVar.f.get() || qegVar.g.get()) ? ajcm.a : qegVar.a();
            case 7:
                rfa rfaVar = (rfa) this.a;
                rfaVar.c.set(true);
                ajcq ajcqVar = ajcm.a;
                rfaVar.e.a(ajcqVar);
                return ajcqVar;
            case 8:
                toj tojVar = (toj) this.a;
                return tojVar.a(new sbm(tojVar, (aoln) null, 6));
            case 9:
                java.lang.Object obj3 = this.a;
                uaq uaqVar = (uaq) obj3;
                return ahrv.g(uaqVar.h.a()).h(new tcy(obj3, 12), uaqVar.f);
            case 10:
                aimz aimzVar = wky.a;
                ainm ainmVarB = aimzVar.b();
                java.lang.Object obj4 = this.a;
                ainp ainpVar = zct.a;
                wky wkyVar = (wky) obj4;
                java.lang.String str = wkyVar.m;
                a.bt(ainmVarB, "[%s] activated", str, "com/android/dialer/xatu/impl/service/XatuController", "onCallActivated", (char) 246, "XatuController.java", ainpVar);
                wpx wpxVar = wkyVar.r;
                ajcq ajcqVarB = wpxVar.b();
                wie wieVar = new wie(obj4, 14);
                ajcu ajcuVar = wkyVar.g;
                agsm.i(1079, ahvr.H(ajcqVarB, wieVar, ajcuVar), "failed to log enrollment status", new java.lang.Object[0]);
                agsm.i(1080, ahvr.H(wpxVar.c(), new wie(obj4, 11), ajcuVar), "failed to log show ahead enrollment status", new java.lang.Object[0]);
                agsm.i(1078, ahvr.H(wpxVar.a(), new wie(obj4, 15), ajcuVar), "failed to log automatic display enrollment status", new java.lang.Object[0]);
                java.lang.String string = java.util.UUID.randomUUID().toString();
                wkyVar.o.h.f(str, new vel(string, 15));
                akzx akzxVarM = wqs.a.m();
                akzxVarM.u();
                wqs wqsVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                wqsVar.b |= 1;
                wqsVar.d = string;
                agsm.i(1077, wkyVar.n.e(wkyVar.j, akzxVarM.p()), "failed to log Xatu call logging ID", new java.lang.Object[0]);
                woo wooVar = wkyVar.D.n().d;
                if (wooVar == null) {
                    wooVar = woo.a;
                }
                won wonVarB = won.b(wooVar.c);
                if (wonVarB == null) {
                    wonVarB = won.f;
                }
                if (wonVarB != won.e) {
                    return ahvr.I(wkyVar.B.g(new vug(obj4, 8), ajcuVar), new wkv(obj4, 4), ajcuVar);
                }
                aimzVar.b().l("com/android/dialer/xatu/impl/service/XatuController", "onCallActivated", 253, "XatuController.java").v("Xatu already closed by user, won't start session");
                return ajcm.a;
            default:
                java.lang.Object obj5 = this.a;
                xbk xbkVar = (xbk) obj5;
                if (!xbkVar.r) {
                    return ajcm.a;
                }
                a.bI(xbk.a.b(), "call state changed to active, showing error UI", "com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener", "onCallActivated", (char) 640, "HoldForMeModelEventListener.java", zct.a);
                return xbkVar.t.h(new viv(obj5, 18), xbkVar.j);
        }
    }

    public /* synthetic */ leq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
