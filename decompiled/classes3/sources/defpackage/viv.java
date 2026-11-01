package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class viv implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ viv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v29, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [ajcq, java.lang.Object] */
    public final ajcq a() {
        int i = 4;
        int i2 = 9;
        int i3 = 20;
        int i4 = 3;
        char c = 1;
        int i5 = 0;
        switch (this.$cid) {
            case 0:
                ((dsd) this.a).d(new defpackage.vis("wait ipv4 timeout"));
                return ajcm.a;
            case 1:
                return this.a;
            case 2:
                defpackage.vqb vqbVar = (defpackage.vqb) this.a;
                vqbVar.c().b();
                android.media.AudioFocusRequest audioFocusRequest = defpackage.vqb.b;
                aooh.f(audioFocusRequest, "focusRequest");
                oju ojuVar = vqbVar.d;
                return aosv.F(ojuVar.b, 0, new ojr(ojuVar, audioFocusRequest, (aoln) null), 3);
            case 3:
                aimz aimzVar = defpackage.vqb.a;
                return this.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj = this.a;
                defpackage.wkd wkdVar = (defpackage.wkd) obj;
                ahrv ahrvVarG = ahrv.g(wkdVar.a());
                vuu vuuVar = new vuu(obj, 15);
                ajct ajctVar = wkdVar.c;
                return ahrvVarG.i(vuuVar, ajctVar).i(new vuu(obj, 16), ajctVar);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj2 = this.a;
                defpackage.wky wkyVar = (defpackage.wky) obj2;
                ahrv ahrvVarG2 = ahrv.g(wkyVar.a().bl());
                vuu vuuVar2 = new vuu(obj2, 20);
                ajcu ajcuVar = wkyVar.g;
                return ahrvVarG2.i(vuuVar2, ajcuVar).i(new defpackage.wkv(obj2, c == true ? 1 : 0), ajcuVar).h(new defpackage.wie(obj2, i2), ajcuVar).i(new defpackage.wkv(obj2, i5), ajcuVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                a.bI(defpackage.wky.a.b(), "closing ui", "com/android/dialer/xatu/impl/service/XatuController", "closeUi", (char) 334, "XatuController.java", zct.a);
                akzx akzxVarM = defpackage.wor.a.m();
                defpackage.wnk wnkVar = defpackage.wnk.a;
                akzxVarM.u();
                defpackage.wor worVar = (defpackage.wor) akzxVarM.b;
                j$.util.Objects.requireNonNull(wnkVar);
                worVar.c = wnkVar;
                worVar.b = 9;
                return ((defpackage.wky) this.a).D.o((defpackage.wor) akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return this.a.d();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return this.a.d();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.wpm wpmVar = (defpackage.wpm) this.a;
                java.util.concurrent.atomic.AtomicReference atomicReference = wpmVar.b;
                if (!((j$.util.Optional) atomicReference.get()).isPresent()) {
                    return ajcm.a;
                }
                defpackage.wpl wplVar = (defpackage.wpl) ((j$.util.Optional) atomicReference.get()).orElseThrow();
                if (wplVar != defpackage.wpl.CALL_ON_TELEPHONY_HOLD) {
                    throw new java.lang.AssertionError("unable to fix ".concat(java.lang.String.valueOf(wplVar.name())));
                }
                defpackage.wpm.a.b().l("com/android/dialer/xatu/impl/service/voicefeaturecombiner/XatuVoiceFeatureController", "fixActivationError", 94, "XatuVoiceFeatureController.java").v("unholding call");
                return wpmVar.c.l();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return this.a.d();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj3 = this.a;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                defpackage.wvn wvnVar = (defpackage.wvn) obj3;
                defpackage.wvq wvqVar = wvnVar.c;
                agsm.i(1118, wvqVar.a(new jww(wvqVar, jElapsedRealtime, 10)), "recordEndTimeMillis failed", new java.lang.Object[0]);
                wvqVar.c(defpackage.alex.ATLAS_DETECTOR_FINISH);
                return ahrv.g(wvqVar.j.d(ahqx.i(new defpackage.vug(wvqVar, i3)), wvqVar.c)).h(new defpackage.wrn(obj3, i4), wvnVar.f);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.wwd wwdVar = (defpackage.wwd) this.a;
                return !wwdVar.f.isPresent() ? ajcm.a : ((defpackage.twi) wwdVar.f.orElseThrow()).b();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj4 = this.a;
                defpackage.wzx wzxVar = (defpackage.wzx) obj4;
                return ahrv.g(wzxVar.b()).i(new defpackage.wyv(obj4, i), ajbm.a).i(new defpackage.wyv(obj4, 5), wzxVar.c);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.xbc xbcVar = (defpackage.xbc) this.a;
                xbcVar.c.set(false);
                defpackage.wvn wvnVarA = xbcVar.d.a();
                wvnVarA.g.set(true);
                return wvnVarA.i.d(ahqx.i(new defpackage.vug(wvnVarA, 18)), wvnVarA.d);
            case 15:
                defpackage.xbc xbcVar2 = (defpackage.xbc) this.a;
                xbcVar2.c.set(false);
                defpackage.wvn wvnVarA2 = xbcVar2.d.a();
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = wvnVarA2.g;
                if (atomicBoolean.get()) {
                    return aiql.z(j$.util.Optional.empty());
                }
                atomicBoolean.set(true);
                return wvnVarA2.i.e(ahqx.b(new defpackage.viv(wvnVarA2, 11)), wvnVarA2.f);
            case 16:
                java.lang.Object obj5 = this.a;
                defpackage.xbk xbkVar = (defpackage.xbk) obj5;
                xbkVar.r = false;
                return ahrv.g(xbkVar.h.c()).i(new icz(obj5, xbkVar.p.isPresent() && xbkVar.q.isPresent(), 4), xbkVar.j);
            case 17:
                defpackage.xbk xbkVar2 = (defpackage.xbk) this.a;
                aify aifyVarG = xbkVar2.s.b(defpackage.zpo.d).g();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                j$.lang.Iterable.-EL.forEach(aifyVarG, new defpackage.who(arrayList, 13));
                return ahvr.aj(arrayList).o(new defpackage.vnc(8), xbkVar2.j);
            case 18:
                java.lang.Object obj6 = this.a;
                defpackage.xbk xbkVar3 = (defpackage.xbk) obj6;
                return ahrv.g(xbkVar3.f.a()).h(new defpackage.xbh(obj6, i4), xbkVar3.j);
            case 19:
                return ((defpackage.xbs) this.a).b(true);
            default:
                return ((defpackage.xbs) this.a).b(false);
        }
    }
}
