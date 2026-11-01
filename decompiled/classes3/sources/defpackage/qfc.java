package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qfc implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qfc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v43, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v51, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v53, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v56, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v59, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v61, types: [java.lang.Object, rdz] */
    /* JADX WARN: Type inference failed for: r12v79, types: [java.lang.Object, sqn] */
    public final ajcq a(java.lang.Object obj) {
        int i = 4;
        int i2 = 2;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                if (!((j$.util.Optional) obj).isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj2 = this.a;
                defpackage.qfd qfdVar = (defpackage.qfd) obj2;
                return ahrv.g(qfdVar.c("\r\n")).i(new defpackage.qfc(obj2, i2), qfdVar.c);
            case 1:
                return ((defpackage.qfd) this.a).a();
            case 2:
                defpackage.qfg qfgVar = ((defpackage.qfd) this.a).d;
                return ahrv.g(qfgVar.b()).h(new defpackage.pqn(9), qfgVar.e);
            case 3:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent() || android.text.TextUtils.isEmpty(((defpackage.qgp) optional.orElseThrow()).c)) {
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.a;
                defpackage.qfd qfdVar2 = (defpackage.qfd) obj3;
                return ahrv.g(qfdVar2.c("\b")).i(new defpackage.qfc(obj3, i), qfdVar2.c);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.qfg qfgVar2 = ((defpackage.qfd) this.a).d;
                return ahrv.g(qfgVar2.a()).h(new defpackage.pqn(10), qfgVar2.e);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.qfg qfgVar3 = (defpackage.qfg) this.a;
                return ahvr.F(new defpackage.syg(qfgVar3.c, (defpackage.tdt) obj, 5), qfgVar3.h.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.qga qgaVar = (defpackage.qga) obj;
                if (!qgaVar.a) {
                    return ajcm.a;
                }
                java.lang.Object obj4 = this.a;
                defpackage.qgc.a.b().l("com/android/dialer/incall/rtt/service/RttEmcFallbackListener", "onCallDialingFailed", 65, "RttEmcFallbackListener.java").v("RTT emergency call failed. redial with audio call.");
                defpackage.qgc qgcVar = (defpackage.qgc) obj4;
                return ahvr.H(ahvr.F(new defpackage.qfb(obj4, qgaVar, i2, bArr), qgcVar.e), new oqe(obj4, qgaVar, 12, (byte[]) null), qgcVar.f);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((java.lang.Boolean) obj).booleanValue() ? ajcm.a : ((defpackage.qgn) ((defpackage.rai) this.a).a).b(2132019950);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.qgl) this.a).a;
                qgnVar.f.set(true);
                return qgnVar.b(2132019951);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((java.lang.Boolean) obj).booleanValue() ? ajcm.a : ((qmt) this.a).g();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                return optional2.isPresent() ? aiql.z(optional2) : this.a.d();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                return optional3.isPresent() ? aiql.z(optional3) : this.a.d();
            case 15:
                return defpackage.zkb.b((java.util.Set) obj, this.a);
            case 16:
                return this.a.b();
            case 17:
                return ((rwo) this.a).d();
            case 18:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj5 = this.a;
                if (zBooleanValue) {
                    return ((defpackage.rwx) obj5).a(false);
                }
                a.bI(defpackage.rwx.a.d(), "No call log read permission, returning null for calls lookup.", "com/android/dialer/notification/missedcalls/MissedCallDataSource", "getNewMissedCalls", 's', "MissedCallDataSource.java", zct.b);
                ((defpackage.rwx) obj5).e.i((java.lang.String) null).a(mcd.c);
                return aiql.z(j$.util.Optional.empty());
            case 19:
                defpackage.rxz rxzVar = (defpackage.rxz) this.a;
                java.util.List list = (java.util.List) obj;
                return ((java.lang.Boolean) rxzVar.c.a()).booleanValue() ? aosv.F(rxzVar.b, 0, new pzf(list, rxzVar, (aoln) null, 4), 3) : aosv.F(rxzVar.b, 0, new defpackage.pbw(list, (aoln) null, 19), 3);
            default:
                return this.a.c((hkd) obj);
        }
    }
}
