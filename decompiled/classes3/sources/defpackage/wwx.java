package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wwx implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ wwx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v82, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [afef, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v101, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v57, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v83, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v31, types: [adbv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v41, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, wvs] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws defpackage.aemf {
        java.lang.Object[] objArr;
        java.lang.String str = null;
        switch (this.$cid) {
            case 0:
                defpackage.rig rigVar = new defpackage.rig();
                j$.util.Optional optionalOf = j$.util.Optional.of(new defpackage.rih(rigVar));
                defpackage.wxb wxbVar = (defpackage.wxb) this.a;
                wxbVar.j = optionalOf;
                akzx akzxVarM = alqh.a.m();
                akzxVarM.u();
                alqh alqhVar = akzxVarM.b;
                j$.util.Objects.requireNonNull("call_number_placeholder");
                alqhVar.b = "call_number_placeholder";
                alqh alqhVarP = akzxVarM.p();
                ?? r4 = this.b;
                alje aljeVarA = wxbVar.m.a(alqhVarP, defpackage.amba.TYPE_OFF_HOLD_DETECTION, new defpackage.wwz(wxbVar, r4), (java.lang.String) this.c);
                aljeVarA.a(defpackage.wxb.b, defpackage.wxb.c, new defpackage.wxa(wxbVar, r4), wxbVar.g);
                aljeVarA.e(j$.util.Optional.of(rigVar));
                defpackage.wxb.a.b().l("com/android/incallui/atlas/detection/techniques/holddetection/HoldDetectionModelRunner", "startConversation", 292, "HoldDetectionModelRunner.java").v("conversation started");
                wxbVar.i = j$.util.Optional.of(aljeVarA);
                wxbVar.l = android.os.SystemClock.elapsedRealtime();
                wxbVar.e.c(defpackage.alex.ATLAS_START_DUPLEX_CONVERSATION);
                return str;
            case 1:
                boolean zBooleanValue = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue();
                boolean zBooleanValue2 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue();
                if (!zBooleanValue) {
                    a.bI(defpackage.wjf.a.d(), "Duplex model is not available", "com/android/dialer/xatu/impl/pipeline/XatuPipelineModelDownloader", "areModelsDownloaded", 'g', "XatuPipelineModelDownloader.java", zct.b);
                    return java.lang.Boolean.FALSE;
                }
                if (zBooleanValue2) {
                    return java.lang.Boolean.TRUE;
                }
                java.lang.Object obj = this.b;
                aimz aimzVar = defpackage.wjf.a;
                a.bI(aimzVar.d(), "Supported SODA language pack is not available", "com/android/dialer/xatu/impl/pipeline/XatuPipelineModelDownloader", "areModelsDownloaded", 'n', "XatuPipelineModelDownloader.java", zct.b);
                if (!((java.lang.Boolean) ((defpackage.wjf) obj).f.a()).booleanValue()) {
                    return java.lang.Boolean.FALSE;
                }
                aimzVar.b().l("com/android/dialer/xatu/impl/pipeline/XatuPipelineModelDownloader", "areModelsDownloaded", 112, "XatuPipelineModelDownloader.java").v("MeFast environment - skipping SODA availability check");
                return java.lang.Boolean.TRUE;
            case 2:
                xar xarVar = (xar) aiql.H((java.util.concurrent.Future) this.a);
                defpackage.tyz tyzVar = (defpackage.tyz) aiql.H((java.util.concurrent.Future) this.c);
                defpackage.xap xapVarB = defpackage.xap.b(xarVar.c);
                if (xapVarB == null) {
                    xapVarB = defpackage.xap.UNKNOWN;
                }
                akzx akzxVarM2 = defpackage.xae.a.m();
                defpackage.xap xapVar = defpackage.xap.USER_OPTED_IN;
                boolean z = xapVarB == xapVar || xapVarB == defpackage.xap.AUTO_ENROLLED;
                akzxVarM2.u();
                defpackage.xae xaeVar = (defpackage.xae) akzxVarM2.b;
                xaeVar.b |= 1;
                xaeVar.c = z;
                akzx akzxVarM3 = defpackage.tyw.a.m();
                int iBY = wsc.bY(tyzVar.d);
                if (iBY == 0) {
                    iBY = 1;
                }
                java.lang.Object obj2 = this.b;
                defpackage.tyv tyvVarBX = wsc.bX(iBY);
                akzxVarM3.u();
                ((defpackage.tyw) akzxVarM3.b).d = tyvVarBX.a();
                java.lang.String str2 = tyzVar.c;
                akzxVarM3.u();
                defpackage.tyw tywVar = (defpackage.tyw) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str2);
                tywVar.c = str2;
                java.lang.String string = ((defpackage.xav) obj2).c.getString(2132017423);
                akzxVarM3.u();
                defpackage.tyw tywVar2 = (defpackage.tyw) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string);
                tywVar2.e = string;
                boolean z2 = xapVarB == xapVar || xapVarB == defpackage.xap.AUTO_ENROLLED;
                akzxVarM3.u();
                ((defpackage.tyw) akzxVarM3.b).f = z2;
                akzxVarM2.u();
                defpackage.xae xaeVar2 = (defpackage.xae) akzxVarM2.b;
                defpackage.tyw tywVar3 = (defpackage.tyw) akzxVarM3.p();
                j$.util.Objects.requireNonNull(tywVar3);
                xaeVar2.d = tywVar3;
                xaeVar2.b |= 2;
                int iBY2 = wsc.bY(tyzVar.d);
                if (iBY2 == 0) {
                    iBY2 = 1;
                }
                boolean z3 = wsc.bX(iBY2) == defpackage.tyv.ALREADY_AVAILABLE;
                akzxVarM2.u();
                defpackage.xae xaeVar3 = (defpackage.xae) akzxVarM2.b;
                xaeVar3.b |= 4;
                xaeVar3.e = z3;
                return (defpackage.xae) akzxVarM2.p();
            case 3:
                boolean zBooleanValue3 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue();
                java.lang.Object obj3 = this.b;
                if (!zBooleanValue3) {
                    defpackage.xcq xcqVar = (defpackage.xcq) obj3;
                    xcqVar.h.set(j$.util.Optional.of(defpackage.xco.CANNOT_RING));
                    xcqVar.g(defpackage.alex.ATLAS_UI_SHOW_DND_DIALOG);
                } else if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue()) {
                    defpackage.xcq xcqVar2 = (defpackage.xcq) obj3;
                    xcqVar2.h.set(j$.util.Optional.of(defpackage.xco.FI_WITH_BLUETOOTH));
                    xcqVar2.g(defpackage.alex.ATLAS_UI_SHOW_BLUETOOTH_DIALOG);
                } else {
                    defpackage.xcq xcqVar3 = (defpackage.xcq) obj3;
                    if (!((java.lang.Boolean) xcqVar3.i.get()).booleanValue()) {
                        xcqVar3.h.set(j$.util.Optional.of(defpackage.xco.DISCLAIMER_NOT_ACKED));
                    } else if (xcqVar3.k.s()) {
                        xcqVar3.h.set(j$.util.Optional.of(defpackage.xco.CALL_ON_TELEPHONY_HOLD));
                    } else {
                        xcqVar3.h.set(j$.util.Optional.empty());
                    }
                }
                return (j$.util.Optional) ((defpackage.xcq) obj3).h.get();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                boolean zBooleanValue4 = ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue();
                java.lang.Object obj4 = this.b;
                if (zBooleanValue4 || ((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.c)).booleanValue()) {
                    try {
                        zjv.i(((zjs) obj4).g, mgv.aJ, (java.util.List) null, (mhc) null, 0, 30);
                        ((zjs) obj4).i.silenceRinger();
                    } catch (java.lang.SecurityException e) {
                        zjs.a.d().i(zct.b).k(e).l("com/google/android/dialershared/externals/androidapis/telecom/DialerTelecom", "silenceRingerFuture$<anonymous>", 334, "DialerTelecom.kt").v("TelecomManager.silenceRingerLegacy called without permission.");
                    }
                    break;
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return (java.lang.Void) aazc.t(((abce) ((aapf) this.c).a.a).s((android.net.Uri) this.b, (android.net.Uri) this.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return java.lang.Boolean.valueOf(((acxg) this.c).k((android.content.Context) this.b, (zvj) this.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.abct abctVar = (defpackage.abct) this.b;
                return abctVar.b((defpackage.abcv) this.a, (defpackage.afpl) this.c, abctVar.e);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                str = ((defpackage.acwg) aiql.H((java.util.concurrent.Future) this.a)).c;
                defpackage.acvv acvvVar = (defpackage.acvv) aiql.H((java.util.concurrent.Future) this.c);
                if (acvvVar != null) {
                    return afsq.ax(str, acvvVar.e);
                }
                defpackage.acvr acvrVar = (defpackage.acvr) this.b;
                if ((acvrVar.b & 32) != 0) {
                    return afsq.ax(str, acvrVar.i);
                }
                return str;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.Object obj5 = this.b;
                java.util.HashMap map = ((adax) this.a).h;
                if (map.containsKey(obj5)) {
                    return (ajcq) map.get(obj5);
                }
                java.lang.Object obj6 = this.c;
                map.put(obj5, obj6);
                return obj6;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj7 = this.c;
                ahbq ahbqVar = (ahbq) this.b;
                ?? r2 = ahbqVar.b;
                if (r2.containsKey(obj7)) {
                    return (ajcq) r2.get(obj7);
                }
                java.lang.Object obj8 = this.a;
                ahbqVar.a.a((java.lang.String) obj7, r2.size() + 1);
                r2.put(obj7, obj8);
                return obj8;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj9 = this.c;
                aemc aemcVarA = aeme.a();
                aemcVarA.b((java.lang.String) obj9);
                ((ahbq) this.b).c(aemcVarA, (ajcq) this.a);
                return aemcVarA.a();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ?? r0 = this.b;
                ?? r3 = this.a;
                ?? r10 = this.c;
                java.util.List list = (java.util.List) defpackage.aemw.h(r0, "device accounts");
                java.util.List<android.accounts.Account> list2 = (java.util.List) defpackage.aemw.h(r3, "g1 accounts");
                aify aifyVar = (aify) defpackage.aemw.h(r10, "owners");
                if (list == null && list2 == null && aifyVar == null) {
                    throw new defpackage.aemf();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.HashMap map2 = new java.util.HashMap();
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        aesg.e(((android.accounts.Account) it.next()).name, arrayList, map2);
                    }
                    objArr = true;
                } else {
                    objArr = false;
                }
                if (list2 != null) {
                    for (android.accounts.Account account : list2) {
                        if (objArr == false) {
                            aesg.e(account.name, arrayList, map2);
                        }
                        aemc aemcVar = (aemc) map2.get(account.name);
                        if (aemcVar != null) {
                            aemcVar.d(true);
                        }
                    }
                }
                if (aifyVar != null) {
                    int size = aifyVar.size();
                    for (int i = 0; i < size; i++) {
                        aeme aemeVar = (aeme) aifyVar.get(i);
                        java.lang.String str3 = aemeVar.a;
                        if (objArr == false) {
                            aesg.e(str3, arrayList, map2);
                        }
                        aemc aemcVar2 = (aemc) map2.get(str3);
                        if (aemcVar2 != null) {
                            aemcVar2.a = aemeVar.b;
                            aemcVar2.b = aemeVar.c;
                            aemcVar2.c = aemeVar.d;
                            aemcVar2.d = aemeVar.e;
                            aemcVar2.f = aemeVar.h;
                            aemcVar2.c(aemeVar.f);
                        }
                    }
                }
                aift aiftVar = new aift(4);
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    aiftVar.i(((aemc) map2.get((java.lang.String) it2.next())).a());
                }
                return aiftVar.h();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((aogc) ((defpackage.afpl) this.a).b).M((android.net.Uri) this.b, (afef) this.c);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new defpackage.ahif((ahyn) aiql.H((java.util.concurrent.Future) this.a), aigf.i((java.util.Map) aiql.H((java.util.concurrent.Future) this.c)), (ahyn) this.b);
            case 15:
                return ((ajuo) this.b).a.submit(new defpackage.agrz(this.c, this.a, 9, null));
            case 16:
                java.lang.Object obj10 = this.c;
                java.lang.Object obj11 = this.a;
                java.util.Map map3 = ((akam) obj11).a;
                java.lang.Object obj12 = this.b;
                synchronized (map3) {
                    try {
                        if (obj10 == null) {
                            ((akam) obj11).d((java.lang.String) ((akam) obj11).e((defpackage.akal) obj12).c);
                            return ((akam) obj11).f((defpackage.akal) obj12);
                        }
                        defpackage.ulw ulwVarE = ((akam) obj11).e((defpackage.akal) obj12);
                        if (!((java.lang.String) ulwVarE.c).equals(obj10)) {
                            return ulwVarE;
                        }
                        ((akam) obj11).d((java.lang.String) obj10);
                        return ((akam) obj11).f((defpackage.akal) obj12);
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            default:
                this.a.run();
                return null;
        }
    }

    public /* synthetic */ wwx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ wwx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ wwx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, int[] iArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ wwx(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
