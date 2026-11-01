package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wyv implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wyv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v27, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v64, types: [hxf, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        int i = 7;
        switch (this.$cid) {
            case 0:
                return ((defpackage.wyw) this.a).b((aify) j$.util.Collection.-EL.stream((java.util.List) obj).collect(aido.a));
            case 1:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (optional.isPresent()) {
                    return ((defpackage.wyw) this.a).b(aify.p((defpackage.wyz) optional.orElseThrow()));
                }
                return aiql.z((java.lang.Object) null);
            case 2:
                java.lang.Object obj2 = this.a;
                defpackage.wwy wwyVar = new defpackage.wwy(obj2, i);
                ajct ajctVar = ((wzh) obj2).g;
                return ahvr.H(ahvr.F(wwyVar, ajctVar), new defpackage.wzj(1), ajctVar);
            case 3:
                return ahvr.aj((aify) obj).o(new defpackage.vnc(7), ((wzh) this.a).g);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                ahvr.bY(optional2.isPresent());
                return ((defpackage.afpl) ((defpackage.wzx) this.a).f.a()).j((android.net.Uri) optional2.orElseThrow(), new affr());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream((java.io.InputStream) obj);
                defpackage.wzx wzxVar = (defpackage.wzx) this.a;
                return wzxVar.i.bh(bufferedInputStream, java.lang.String.valueOf(java.lang.String.valueOf(wzxVar.b.getFilesDir())).concat("/hold_detection_model"));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                if (optional3.isPresent()) {
                    return aiql.D(ahqx.i(new defpackage.wwy((defpackage.wzw) optional3.orElseThrow(), 11)), ((defpackage.xbf) this.a).c);
                }
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((defpackage.xbk) this.a).h.b(defpackage.xck.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                akzx akzxVarM = defpackage.wya.a.m();
                akzx akzxVarM2 = defpackage.wxr.a.m();
                long jLongValue = ((java.lang.Long) obj).longValue();
                akzxVarM2.u();
                defpackage.wxr wxrVar = (defpackage.wxr) akzxVarM2.b;
                wxrVar.b |= 1;
                wxrVar.c = jLongValue;
                akzxVarM.u();
                defpackage.wya wyaVar = (defpackage.wya) akzxVarM.b;
                defpackage.wxr wxrVar2 = (defpackage.wxr) akzxVarM2.p();
                j$.util.Objects.requireNonNull(wxrVar2);
                wyaVar.d = wxrVar2;
                wyaVar.c = 7;
                akzxVarM.u();
                defpackage.wya wyaVar2 = (defpackage.wya) akzxVarM.b;
                wyaVar2.b |= 1;
                defpackage.xbk xbkVar = (defpackage.xbk) this.a;
                wyaVar2.e = xbkVar.k;
                return xbkVar.i.b((defpackage.wya) akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj3 = this.a;
                defpackage.xck xckVar = defpackage.xck.a;
                defpackage.xcn xcnVar = ((defpackage.xbk) obj3).h;
                return xcnVar.l.e(ahqx.b(new defpackage.wwg(xcnVar, xckVar, i)), xcnVar.e);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return (ajcq) ((defpackage.xbk) this.a).p.orElseThrow();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                boolean z = th instanceof java.util.concurrent.TimeoutException;
                java.lang.Object obj4 = this.a;
                if (z) {
                    a.bI(defpackage.xbk.a.d(), "agent greeting playback timed out", "com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener", "transitionToConnectingState", (char) 211, "HoldForMeModelEventListener.java", zct.a);
                    defpackage.xbk xbkVar2 = (defpackage.xbk) obj4;
                    xbkVar2.b.b(xbkVar2.k, defpackage.alex.ATLAS_GREETING_TO_AGENT_PLAYBACK_TIMEOUT);
                } else {
                    defpackage.xbk.a.d().k(th).i(zct.a).l("com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener", "transitionToConnectingState", 220, "HoldForMeModelEventListener.java").v("agent greeting playback failed");
                    defpackage.xbk xbkVar3 = (defpackage.xbk) obj4;
                    xbkVar3.b.b(xbkVar3.k, defpackage.alex.ATLAS_GREETING_TO_AGENT_PLAYBACK_FAILED);
                }
                defpackage.xbk xbkVar4 = (defpackage.xbk) obj4;
                return ahrv.g(xbkVar4.e.b()).h(new defpackage.wzj(16), xbkVar4.j);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                hxf hxfVar = (hxf) obj;
                ahrv ahrvVarG = ahrv.g(hxfVar.c());
                defpackage.wyv wyvVar = new defpackage.wyv(hxfVar, 15);
                ajcu ajcuVar = ((defpackage.xbk) this.a).j;
                return ahrvVarG.i(wyvVar, ajcuVar).h(new defpackage.wzj(17), ajcuVar);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                hxe hxeVar = (hxe) obj;
                a.bt(defpackage.xbk.a.b(), "playback of disclosure audio ended with reason: %s", hxeVar.name(), "com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener", "playGreetingToAgent", (char) 446, "HoldForMeModelEventListener.java", zct.a);
                defpackage.xbk xbkVar5 = (defpackage.xbk) this.a;
                xbkVar5.b.b(xbkVar5.k, defpackage.alex.ATLAS_FINISH_PLAYING_DISCLOSURE_AUDIO);
                return hxeVar == hxe.a ? ajcm.a : xbkVar5.e.b();
            case 15:
                return this.a.a();
            case 16:
                return ((defpackage.xbk) this.a).h.b(defpackage.xck.b);
            case 17:
                akzx akzxVarM3 = defpackage.wya.a.m();
                defpackage.wxt wxtVar = defpackage.wxt.a;
                akzxVarM3.u();
                defpackage.wya wyaVar3 = (defpackage.wya) akzxVarM3.b;
                j$.util.Objects.requireNonNull(wxtVar);
                wyaVar3.d = wxtVar;
                wyaVar3.c = 6;
                akzxVarM3.u();
                defpackage.wya wyaVar4 = (defpackage.wya) akzxVarM3.b;
                wyaVar4.b |= 1;
                defpackage.xbk xbkVar6 = (defpackage.xbk) this.a;
                wyaVar4.e = xbkVar6.k;
                return xbkVar6.i.b((defpackage.wya) akzxVarM3.p());
            case 18:
                defpackage.xbk xbkVar7 = (defpackage.xbk) this.a;
                xbkVar7.b.b(xbkVar7.k, defpackage.alex.ATLAS_START_RINGING);
                return xbkVar7.h.b(defpackage.xck.c);
            case 19:
                return ((defpackage.xbk) this.a).h.b(defpackage.xck.b);
            default:
                return ((defpackage.xbp) this.a).a.i(new hxx((java.io.File) ((j$.util.Optional) obj).orElseThrow(new defpackage.vjq(18))));
        }
    }
}
