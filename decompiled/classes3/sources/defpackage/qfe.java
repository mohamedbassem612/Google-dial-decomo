package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qfe implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qfe(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        java.lang.Object obj;
        defpackage.amsd amsdVar;
        int i;
        defpackage.apqx apqxVar;
        java.lang.String immediately = null;
        boolean zBooleanValue = false;
        switch (this.$cid) {
            case 0:
                aift aiftVar = new aift(4);
                int i2 = 0;
                while (true) {
                    java.util.List list = ((defpackage.qfg) this.a).b;
                    if (i2 >= list.size()) {
                        return aiftVar.h();
                    }
                    defpackage.qep qepVar = (defpackage.qep) list.get(i2);
                    boolean z = i2 == 0 || ((defpackage.qep) list.get(i2 + (-1))).a != qepVar.a;
                    int i3 = i2 + 1;
                    boolean z2 = i2 == list.size() + (-1) || ((defpackage.qep) list.get(i3)).a != qepVar.a;
                    akzx akzxVarM = defpackage.qgp.a.m();
                    boolean z3 = qepVar.c;
                    akzxVarM.u();
                    defpackage.qgp qgpVar = (defpackage.qgp) akzxVarM.b;
                    qgpVar.b |= 2;
                    qgpVar.d = z3;
                    int i4 = true != qepVar.a ? 2 : 3;
                    akzxVarM.u();
                    defpackage.qgp qgpVar2 = (defpackage.qgp) akzxVarM.b;
                    qgpVar2.e = i4 - 1;
                    qgpVar2.b |= 4;
                    java.lang.String strA = qepVar.a();
                    akzxVarM.u();
                    defpackage.qgp qgpVar3 = (defpackage.qgp) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strA);
                    qgpVar3.b |= 1;
                    qgpVar3.c = strA;
                    akzxVarM.u();
                    defpackage.qgp qgpVar4 = (defpackage.qgp) akzxVarM.b;
                    qgpVar4.b |= 8;
                    qgpVar4.f = z;
                    akzxVarM.u();
                    defpackage.qgp qgpVar5 = (defpackage.qgp) akzxVarM.b;
                    qgpVar5.b |= 16;
                    qgpVar5.g = z2;
                    aiftVar.i((defpackage.qgp) akzxVarM.p());
                    i2 = i3;
                }
                break;
            case 1:
                java.lang.Object obj2 = this.a;
                android.telecom.Call.RttCall rttCallM = rs$.ExternalSyntheticApiModelOutline0.m(((defpackage.qfa) obj2).b);
                if (rttCallM == null) {
                    defpackage.qfa.a.b().l("com/android/dialer/incall/rtt/service/RttCallMessageReceiver", "readRemoteRttMessage", 110, "RttCallMessageReceiver.java").v("RTT call is null.");
                    return j$.util.Optional.empty();
                }
                try {
                    immediately = rttCallM.readImmediately();
                    mni.aK(((defpackage.qfa) obj2).f, mfy.et);
                    break;
                } catch (java.io.IOException e) {
                    a.bq(defpackage.qfa.a.c(), "Failed to read RTT message.", "com/android/dialer/incall/rtt/service/RttCallMessageReceiver", "readRemoteRttMessage", 'v', "RttCallMessageReceiver.java", e, zct.b);
                }
                return android.text.TextUtils.isEmpty(immediately) ? j$.util.Optional.empty() : j$.util.Optional.of(immediately.replace("\r", "").replaceAll("[\\n\u2028]", "\r\n"));
            case 2:
                java.util.List list2 = ((defpackage.qfg) this.a).b;
                int iA = defpackage.qeq.a(list2);
                return (iA < 0 || ((defpackage.qep) list2.get(iA)).c) ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.qep) list2.get(iA));
            case 3:
                java.util.List list3 = ((defpackage.qfg) this.a).b;
                int iA2 = defpackage.qeq.a(list3);
                return (iA2 < 0 || !((defpackage.qep) list3.get(iA2)).c) ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.qep) list3.get(iA2));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj3 = this.a;
                defpackage.qgd qgdVar = (defpackage.qgd) obj3;
                zjm zjmVar = qgdVar.g;
                if (!zjmVar.g().isPresent()) {
                    return tcp.e;
                }
                if (!qgdVar.e.isPresent()) {
                    defpackage.qgd.a.b().l("com/android/dialer/incall/rtt/service/RttInCallCachedDataLookup", "lookupInternal", 69, "RttInCallCachedDataLookup.java").v("Looking up the RttConfiguration");
                    qgdVar.c.j(defpackage.qgd.b);
                    ajcq ajcqVarA = ((tcv) ((aogc) zjmVar.g().orElseThrow()).a).a();
                    ahvr.J(ajcqVarA, new kxt(qgdVar, 14), qgdVar.d);
                    qgdVar.e = j$.util.Optional.of(ajcqVarA);
                    qgdVar.f.a(ajcqVarA);
                } else if (((ajcq) qgdVar.e.orElseThrow()).isDone()) {
                    try {
                        return (tcp) aiql.H((java.util.concurrent.Future) ((defpackage.qgd) obj3).e.orElseThrow());
                    } catch (java.util.concurrent.ExecutionException e2) {
                        a.bq(defpackage.qgd.a.c(), "RTT future failed", "com/android/dialer/incall/rtt/service/RttInCallCachedDataLookup", "lookupInternal", 'd', "RttInCallCachedDataLookup.java", e2, zct.b);
                        return tcp.e;
                    }
                }
                return tcp.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.qko) this.a).o = true;
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return java.lang.Boolean.valueOf(((defpackage.qko) this.a).o);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.qko qkoVar = (defpackage.qko) this.a;
                qkoVar.k.n(qkoVar.f.get() ? rmw.kJ : rmw.kK);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((android.app.Notification.Builder) this.a).build();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                obj = this.a;
                amsdVar = defpackage.amsd.OUTGOING_REQUEST_TYPE;
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                obj = this.a;
                amsdVar = defpackage.amsd.INCOMING_REQUEST_TYPE;
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                akzx akzxVarM2 = defpackage.amsf.a.m();
                defpackage.qpn qpnVar = (defpackage.qpn) this.a;
                if (qpnVar.p) {
                    i = qpnVar.s;
                    qpnVar.s = i + 1;
                } else {
                    i = qpnVar.s;
                }
                akzxVarM2.u();
                defpackage.amsf amsfVar = (defpackage.amsf) akzxVarM2.b;
                amsfVar.b |= 8;
                amsfVar.g = i;
                long jElapsedRealtime = qpnVar.p ? (qpnVar.r + android.os.SystemClock.elapsedRealtime()) - qpnVar.q : qpnVar.r;
                akzxVarM2.u();
                defpackage.amsf amsfVar2 = (defpackage.amsf) akzxVarM2.b;
                amsfVar2.b |= 16;
                amsfVar2.h = jElapsedRealtime;
                long j = qpnVar.k;
                akzxVarM2.u();
                defpackage.amsf amsfVar3 = (defpackage.amsf) akzxVarM2.b;
                amsfVar3.b |= 2;
                amsfVar3.d = j;
                long j2 = qpnVar.j;
                akzxVarM2.u();
                defpackage.amsf amsfVar4 = (defpackage.amsf) akzxVarM2.b;
                amsfVar4.b |= 1;
                amsfVar4.c = j2;
                long j3 = qpnVar.m;
                akzxVarM2.u();
                defpackage.amsf amsfVar5 = (defpackage.amsf) akzxVarM2.b;
                amsfVar5.b |= 4;
                amsfVar5.f = j3;
                java.util.List list4 = qpnVar.i;
                akzxVarM2.u();
                defpackage.amsf amsfVar6 = (defpackage.amsf) akzxVarM2.b;
                alat alatVar = amsfVar6.e;
                if (!alatVar.c()) {
                    amsfVar6.e = alad.J(alatVar);
                }
                akyl.i(list4, amsfVar6.e);
                return (defpackage.amsf) akzxVarM2.p();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj4 = this.a;
                try {
                    java.lang.Object objF = new mgf(((oko) obj4).h(), rs$.ExternalSyntheticApiModelOutline0.m(((oko) obj4).j)).a(mgv.bK).f();
                    aooh.c(objF);
                    zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                    break;
                } catch (java.lang.SecurityException e3) {
                    oko.a.d().k(e3).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "isDataEnabled", 1286, "DialerTelephony.kt").v("TelephonyManager.isDataEnabled called without permission.");
                }
                return j$.util.Optional.of(java.lang.Boolean.valueOf(zBooleanValue));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.zcy zcyVar = defpackage.zcy.a;
                int iOrdinal = ((defpackage.puy) ((defpackage.pvr) this.a).h.get()).ordinal();
                if (iOrdinal == 0) {
                    return j$.util.Optional.empty();
                }
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return j$.util.Optional.of(defpackage.qtz.SNACKBAR_VIDEO_CALL_REQUEST_FAILED);
                }
                if (iOrdinal == 3) {
                    return j$.util.Optional.of(defpackage.qtz.SNACKBAR_VIDEO_CALL_REQUEST_TIMED_OUT);
                }
                if (iOrdinal == 4) {
                    return j$.util.Optional.of(defpackage.qtz.SNACKBAR_VIDEO_CALL_REQUEST_REJECTED);
                }
                throw new java.lang.RuntimeException(null, null);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return j$.util.Optional.of(this.a);
            case 15:
                return ((defpackage.qvo) this.a).e.get() ? j$.util.Optional.of(defpackage.qtu.DIALOG_HOLD) : j$.util.Optional.empty();
            case 16:
                return ((defpackage.qvq) this.a).d.get() ? j$.util.Optional.of(defpackage.qtu.DIALOG_MERGE) : j$.util.Optional.empty();
            case 17:
                return j$.util.Optional.of(this.a);
            case 18:
                akzx akzxVarM3 = defpackage.qxp.a.m();
                aooh.f(akzxVarM3, "builder");
                defpackage.que queVar = defpackage.que.CALL_ASSIST;
                akzxVarM3.u();
                defpackage.qxp qxpVar = (defpackage.qxp) akzxVarM3.b;
                qxpVar.c = queVar.g;
                qxpVar.b |= 1;
                java.lang.String string = ((android.content.Context) this.a).getString(2132017630);
                aooh.e(string, "getString(...)");
                aooh.f(string, "value");
                akzxVarM3.u();
                defpackage.qxp qxpVar2 = (defpackage.qxp) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string);
                qxpVar2.b |= 2;
                qxpVar2.d = string;
                akzxVarM3.u();
                defpackage.qxp qxpVar3 = (defpackage.qxp) akzxVarM3.b;
                qxpVar3.e = 0;
                qxpVar3.b |= 4;
                defpackage.qtr qtrVar = defpackage.qtr.CALL_ASSIST;
                akzxVarM3.u();
                defpackage.qxp qxpVar4 = (defpackage.qxp) akzxVarM3.b;
                qxpVar4.f = qtrVar.k;
                qxpVar4.b |= 8;
                alad aladVarP = akzxVarM3.p();
                aooh.e(aladVarP, "build(...)");
                return j$.util.Optional.of((defpackage.qxp) aladVarP);
            case 19:
                java.io.File file = new java.io.File((java.lang.String) this.a);
                java.math.BigInteger bigInteger = defpackage.apqv.a;
                int i5 = defpackage.apqu.a;
                java.nio.charset.Charset.defaultCharset();
                java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName("UTF-8");
                defpackage.aprf aprfVar = new defpackage.aprf(file);
                java.nio.charset.Charset charsetA = defpackage.apqu.a(charsetForName);
                java.lang.Object obj5 = aprfVar.a;
                int i6 = defpackage.apqy.a;
                java.io.InputStream inputStreamNewInputStream = j$.nio.file.Files.newInputStream(j$.io.FileRetargetClass.toPath((java.io.File) obj5), new j$.nio.file.OpenOption[0]);
                try {
                    if (inputStreamNewInputStream == null) {
                        throw new java.lang.NullPointerException("input");
                    }
                    defpackage.aprj aprjVar = new defpackage.aprj();
                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStreamNewInputStream, defpackage.apqu.a(charsetA));
                    java.lang.ThreadLocal threadLocal = defpackage.apqx.a;
                    java.lang.Object[] objArr = (java.lang.Object[]) threadLocal.get();
                    if (((java.lang.Boolean) objArr[0]).booleanValue()) {
                        apqxVar = new defpackage.apqx(defpackage.apqy.a());
                    } else {
                        objArr[0] = java.lang.Boolean.TRUE;
                        apqxVar = defpackage.apqx.b;
                    }
                    try {
                        char[] cArr = apqxVar.c;
                        if (cArr == null) {
                            cArr = (char[]) ((java.lang.Object[]) threadLocal.get())[1];
                        }
                        while (true) {
                            int i7 = inputStreamReader.read(cArr);
                            if (i7 == -1) {
                                if (apqxVar != null) {
                                    apqxVar.close();
                                }
                                java.lang.String string2 = aprjVar.toString();
                                inputStreamNewInputStream.close();
                                return string2;
                            }
                            aprjVar.write(cArr, 0, i7);
                        }
                    } catch (java.lang.Throwable th) {
                        if (apqxVar == null) {
                            throw th;
                        }
                        try {
                            apqxVar.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    if (inputStreamNewInputStream == null) {
                        throw th3;
                    }
                    try {
                        inputStreamNewInputStream.close();
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
                break;
            default:
                return ((defpackage.rak) this.a).b;
        }
        ((defpackage.qpn) obj).o = amsdVar;
        return amsdVar;
    }
}
