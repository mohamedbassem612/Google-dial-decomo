package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wdm implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public wdm(aauf aaufVar, aaum aaumVar, int i) {
        this.$cid = i;
        this.b = aaumVar;
        j$.util.Objects.requireNonNull(aaufVar);
        this.a = aaufVar;
    }

    /* JADX WARN: Type inference failed for: r0v126, types: [aauh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r13v35, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.Object, yml] */
    /* JADX WARN: Type inference failed for: r13v58, types: [aafd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [aaue, aauh, aaui, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, wvs] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 8;
        switch (this.$cid) {
            case 0:
                android.widget.Toast.makeText((android.content.Context) ((wdx) this.a).b.eZ(), (java.lang.CharSequence) this.b, 0).show();
                return;
            case 1:
                android.view.animation.Interpolator interpolator = defpackage.vxt.a;
                ((android.view.ViewGroup) this.a).getLayoutParams().height = -2;
                ((android.widget.FrameLayout) this.b).getLayoutParams().height = -2;
                return;
            case 2:
                ailk ailkVarY = ((aify) this.b).y(0);
                while (ailkVarY.hasNext()) {
                    java.lang.Object obj = this.a;
                    defpackage.wmz wmzVar = (defpackage.wmz) ailkVarY.next();
                    java.lang.Long lValueOf = java.lang.Long.valueOf(wmzVar.e);
                    defpackage.wit witVar = (defpackage.wit) obj;
                    java.util.LinkedHashMap linkedHashMap = witVar.c;
                    boolean zContainsKey = linkedHashMap.containsKey(lValueOf);
                    if (zContainsKey && wmzVar.c != 3) {
                        linkedHashMap.remove(java.lang.Long.valueOf(wmzVar.e));
                    } else if (wmzVar.c != 3) {
                        continue;
                    } else {
                        long epochMilli = zContainsKey ? ((defpackage.wiu) linkedHashMap.get(java.lang.Long.valueOf(wmzVar.e))).b : j$.time.Instant.now().toEpochMilli();
                        java.lang.String str = (wmzVar.c == 3 ? (defpackage.wnb) wmzVar.d : defpackage.wnb.a).f;
                        java.lang.Long lValueOf2 = java.lang.Long.valueOf(wmzVar.e);
                        if (str == null) {
                            throw new java.lang.NullPointerException("Null dtmf");
                        }
                        linkedHashMap.put(lValueOf2, new defpackage.wiu(str, epochMilli));
                        if (!zContainsKey) {
                            j$.util.Optional optionalEmpty = witVar.d;
                            ida idaVar = new ida(str, 8);
                            if (true == optionalEmpty.isPresent()) {
                                java.lang.Object obj2 = optionalEmpty.get();
                                java.lang.String str2 = (java.lang.String) idaVar.a;
                                if (str2.length() != 1 || !str2.equals(obj2.toString())) {
                                    optionalEmpty = j$.util.Optional.empty();
                                }
                            }
                            defpackage.vxc vxcVar = new defpackage.vxc(obj, 16);
                            if (true == optionalEmpty.isPresent()) {
                                optionalEmpty.get();
                                ((defpackage.wit) vxcVar.a).a(19);
                            }
                        }
                    }
                }
                return;
            case 3:
                java.lang.Object obj3 = this.a;
                defpackage.wwa wwaVar = (defpackage.wwa) obj3;
                int i2 = wwaVar.c;
                java.lang.Object obj4 = this.b;
                if (i2 == 4) {
                    defpackage.wwb wwbVar = (defpackage.wwb) obj4;
                    j$.util.Optional optional = wwbVar.d;
                    defpackage.wvs wvsVar = wwbVar.b;
                    j$.util.Objects.requireNonNull(wvsVar);
                    defpackage.wlm wlmVar = new defpackage.wlm(wvsVar, 20);
                    if (true == optional.isPresent()) {
                        wlmVar.a.a(optional.get());
                    }
                    wwbVar.d = j$.util.Optional.empty();
                    wvsVar.a(obj3);
                    return;
                }
                defpackage.wwb wwbVar2 = (defpackage.wwb) obj4;
                if (!wwbVar2.e) {
                    wwbVar2.b.a(obj3);
                    wwbVar2.e = true;
                    wwbVar2.b();
                    return;
                }
                ahvr.bM(i2 == 5);
                if (!wwbVar2.d.isPresent()) {
                    wwbVar2.d = j$.util.Optional.of(obj3);
                    return;
                }
                ahvr.bM(((defpackage.wwa) wwbVar2.d.orElseThrow()).c == 5);
                defpackage.wwa wwaVar2 = (defpackage.wwa) wwbVar2.d.orElseThrow();
                java.lang.String str3 = (wwaVar2.c == 5 ? (defpackage.wvz) wwaVar2.d : defpackage.wvz.a).c;
                defpackage.wvz wvzVar = wwaVar.c == 5 ? (defpackage.wvz) wwaVar.d : defpackage.wvz.a;
                java.lang.String strValueOf = java.lang.String.valueOf(str3);
                java.lang.String strValueOf2 = java.lang.String.valueOf(wvzVar.c);
                akzx akzxVarM = defpackage.wwa.a.m();
                akzx akzxVarM2 = defpackage.wvz.a.m();
                akzxVarM2.u();
                defpackage.wvz wvzVar2 = (defpackage.wvz) akzxVarM2.b;
                java.lang.String strConcat = strValueOf.concat(strValueOf2);
                j$.util.Objects.requireNonNull(strConcat);
                wvzVar2.b |= 1;
                wvzVar2.c = strConcat;
                akzxVarM.u();
                defpackage.wwa wwaVar3 = (defpackage.wwa) akzxVarM.b;
                defpackage.wvz wvzVar3 = (defpackage.wvz) akzxVarM2.p();
                j$.util.Objects.requireNonNull(wvzVar3);
                wwaVar3.d = wvzVar3;
                wwaVar3.c = 5;
                if ((((defpackage.wwa) wwbVar2.d.orElseThrow()).b & 1) != 0) {
                    long j = ((defpackage.wwa) wwbVar2.d.orElseThrow()).e;
                    akzxVarM.u();
                    defpackage.wwa wwaVar4 = (defpackage.wwa) akzxVarM.b;
                    wwaVar4.b |= 1;
                    wwaVar4.e = j;
                }
                if ((wwaVar.b & 2) != 0) {
                    long j2 = wwaVar.f;
                    akzxVarM.u();
                    defpackage.wwa wwaVar5 = (defpackage.wwa) akzxVarM.b;
                    wwaVar5.b |= 2;
                    wwaVar5.f = j2;
                }
                wwbVar2.d = j$.util.Optional.of((defpackage.wwa) akzxVarM.p());
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((android.view.View) this.a).getBackground().setAlpha(0);
                this.b.run();
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                j$.lang.Iterable.-EL.forEach(((defpackage.xbx) this.b).h, new defpackage.who(this.a, 14));
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.xca xcaVar = (defpackage.xca) this.b;
                if (xcaVar.h.isPresent() && defpackage.zmw.a(((android.telecom.CallAudioState) this.a).getRoute()).equals(xcaVar.h.orElseThrow())) {
                    if (xcaVar.e.isPresent()) {
                        ((dsd) xcaVar.e.orElseThrow()).b((java.lang.Object) null);
                        xcaVar.e = j$.util.Optional.empty();
                    }
                    xcaVar.h = j$.util.Optional.empty();
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                if (((defpackage.xym) this.a).a) {
                    android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.b.run();
                    return;
                } catch (java.lang.Throwable th) {
                    if (android.util.Log.isLoggable("GlideExecutor", 6)) {
                        android.util.Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                this.a.a(((defpackage.ymr) this.b).c);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((dsd) this.a).d((java.lang.Throwable) this.b.eZ());
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                j$.lang.Iterable.-EL.forEach(((zms) this.b).g.b(defpackage.zpo.f), new defpackage.who(this.a, 15));
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                zpm zpmVar = (zpm) this.a;
                java.util.Map map = zpmVar.b;
                java.lang.Object obj5 = this.b;
                defpackage.apqr apqrVar = (defpackage.apqr) map.get(obj5);
                if (apqrVar == null) {
                    j$.lang.Iterable.-EL.forEach(zpmVar.k.e(), new defpackage.who(obj5, 17));
                    return;
                }
                j$.lang.Iterable.-EL.forEach(((defpackage.zpl) apqrVar.a(defpackage.zpl.class)).kc().e(), new defpackage.uwm(7));
                j$.lang.Iterable.-EL.forEach(((defpackage.zpl) apqrVar.a(defpackage.zpl.class)).kd().e(), new defpackage.uwm(i));
                map.remove(obj5);
                if (map.isEmpty()) {
                    j$.lang.Iterable.-EL.forEach(zpmVar.j.e(), new defpackage.uwm(9));
                }
                zpmVar.g.a(ajcm.a);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ?? r0 = this.a;
                java.lang.Object obj6 = this.b;
                synchronized (obj6) {
                    if (r0 == 0) {
                        ((defpackage.aabg) obj6).g("Null service connection");
                        return;
                    }
                    try {
                        ((defpackage.aabg) obj6).f = new defpackage.afpl((android.os.IBinder) r0);
                        ((defpackage.aabg) obj6).a = 2;
                        ((defpackage.aabg) obj6).a();
                        return;
                    } catch (android.os.RemoteException e) {
                        ((defpackage.aabg) obj6).g(e.getMessage());
                        return;
                    }
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.aabg) this.a).c(((defpackage.aabi) this.b).a);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((aaeo) this.b).h((android.os.Bundle) this.a);
                return;
            case 15:
                aafc aafcVar = ((aafe) this.b).a;
                ?? r13 = this.a;
                if (aafcVar != null) {
                    r13.a(aafcVar.a);
                    return;
                }
                return;
            case 16:
                com.google.android.gms.signin.internal.SignInResponse signInResponse = (com.google.android.gms.signin.internal.SignInResponse) this.b;
                com.google.android.gms.common.ConnectionResult connectionResult = signInResponse.b;
                boolean zD = connectionResult.d();
                java.lang.Object obj7 = this.a;
                if (zD) {
                    com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponse = signInResponse.c;
                    aais.as(resolveAccountResponse);
                    com.google.android.gms.common.ConnectionResult connectionResult2 = resolveAccountResponse.c;
                    if (!connectionResult2.d()) {
                        android.util.Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(connectionResult2))), new java.lang.Exception());
                        defpackage.aafn aafnVar = (defpackage.aafn) obj7;
                        aafnVar.f.b(connectionResult2);
                        aafnVar.e.C();
                        return;
                    }
                    defpackage.aafn aafnVar2 = (defpackage.aafn) obj7;
                    aaeq aaeqVar = aafnVar2.f;
                    defpackage.aahb aahbVarA = resolveAccountResponse.a();
                    java.util.Set set = aafnVar2.c;
                    if (aahbVarA == null || set == null) {
                        android.util.Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new java.lang.Exception());
                        aaeqVar.b(new com.google.android.gms.common.ConnectionResult(1, 4, (android.app.PendingIntent) null, (java.lang.String) null, (java.lang.Integer) null, (android.os.Bundle) null));
                    } else {
                        aaeqVar.f = aahbVarA;
                        aaeqVar.c = set;
                        aaeqVar.c();
                    }
                } else {
                    ((defpackage.aafn) obj7).f.b(connectionResult);
                }
                ((defpackage.aafn) obj7).e.C();
                return;
            case 17:
                ((android.app.Activity) ((defpackage.afpl) this.b).b).startActivity((android.content.Intent) this.a);
                return;
            case 18:
                com.google.android.gms.common.api.Status status = defpackage.aamr.a;
                ((android.app.Activity) this.a).startActivityForResult((android.content.Intent) this.b, 123);
                return;
            case 19:
                java.lang.Object obj8 = this.a;
                synchronized (((aauf) obj8).a) {
                    ?? r1 = ((aauf) obj8).b;
                    java.lang.Exception excF = ((aaum) this.b).f();
                    aais.as(excF);
                    r1.a(excF);
                    break;
                }
                return;
            default:
                try {
                    aaum aaumVarA = ((defpackage.aauj) this.a).a.a(((aaum) this.b).g());
                    ?? r14 = this.a;
                    java.util.concurrent.Executor executor = aaup.b;
                    aaumVarA.p(executor, (aaui) r14);
                    aaumVarA.o(executor, (aauh) r14);
                    aaumVarA.l(executor, (aaue) r14);
                    return;
                } catch (java.lang.Exception e2) {
                    ((defpackage.aauj) this.a).a(e2);
                    return;
                } catch (aauk e3) {
                    boolean z = e3.getCause() instanceof java.lang.Exception;
                    java.lang.Object obj9 = this.a;
                    if (z) {
                        ((defpackage.aauj) obj9).a((java.lang.Exception) e3.getCause());
                        return;
                    } else {
                        ((defpackage.aauj) obj9).a(e3);
                        return;
                    }
                } catch (java.util.concurrent.CancellationException unused) {
                    ((defpackage.aauj) this.a).b();
                    return;
                }
        }
    }

    public /* synthetic */ wdm(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ wdm(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public wdm(defpackage.xym xymVar, java.lang.Runnable runnable, int i) {
        this.$cid = i;
        this.b = runnable;
        j$.util.Objects.requireNonNull(xymVar);
        this.a = xymVar;
    }

    public wdm(aaeo aaeoVar, android.os.Bundle bundle, int i) {
        this.$cid = i;
        this.a = bundle;
        j$.util.Objects.requireNonNull(aaeoVar);
        this.b = aaeoVar;
    }

    public wdm(defpackage.aauj aaujVar, aaum aaumVar, int i) {
        this.$cid = i;
        this.b = aaumVar;
        j$.util.Objects.requireNonNull(aaujVar);
        this.a = aaujVar;
    }

    public wdm(defpackage.aafn aafnVar, com.google.android.gms.signin.internal.SignInResponse signInResponse, int i) {
        this.$cid = i;
        this.b = signInResponse;
        j$.util.Objects.requireNonNull(aafnVar);
        this.a = aafnVar;
    }
}
