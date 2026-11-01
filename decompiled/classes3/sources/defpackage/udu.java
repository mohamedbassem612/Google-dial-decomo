package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class udu implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ udu(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v53, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v19, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, ucr] */
    /* JADX WARN: Type inference failed for: r9v90, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) {
        int iAN;
        int i = 20;
        int i2 = 17;
        int i3 = 16;
        int i4 = 8;
        int i5 = 0;
        int i6 = 1;
        switch (this.$cid) {
            case 0:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z((java.lang.Object) null);
                }
                java.lang.Object obj2 = this.a;
                defpackage.ugv ugvVar = defpackage.ugv.a;
                ugs ugsVar = ((udy) obj2).n;
                return aosv.F(ugsVar.b, 0, new defpackage.ufr(ugsVar, (defpackage.zdm) ugvVar, (aoln) null, 6, (short[]) null), 3);
            case 1:
                return this.a.c((android.telecom.Call.Details) obj);
            case 2:
                hkd hkdVar = (hkd) obj;
                aooh.f(hkdVar, "dialerPhoneNumber");
                ueh uehVar = ((uek) this.a).e;
                return aosv.F(uehVar.a, 0, new defpackage.txm(uehVar, hkdVar, (aoln) null, 8), 3);
            case 3:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.uhp uhpVar = (defpackage.uhp) this.a;
                return (((zzx) uhpVar.i).m() || bool.booleanValue()) ? aiql.z(java.lang.Boolean.FALSE) : ahvr.H(((aogc) uhpVar.k).bk(), new ubc(17), (java.util.concurrent.Executor) uhpVar.g);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(aike.a);
                }
                final defpackage.uqp uqpVar = (defpackage.uqp) this.a;
                ajcq ajcqVarF = uqpVar.f(uqpVar.j(2));
                defpackage.uqm uqmVar = new defpackage.uqm(i5);
                ajct ajctVar = uqpVar.g;
                return ahvr.H(ahvr.H(ahvr.H(ajcqVarF, uqmVar, ajctVar), new ubc(19), ajctVar), new ahyc() { // from class: uql
                    public final java.lang.Object apply(java.lang.Object obj3) {
                        defpackage.uqp uqpVar2;
                        aify aifyVar = (aify) obj3;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        acc accVar = new acc(0);
                        int size = aifyVar.size();
                        int i7 = 0;
                        while (true) {
                            uqpVar2 = uqpVar;
                            if (i7 >= size) {
                                break;
                            }
                            java.lang.String str = (java.lang.String) aifyVar.get(i7);
                            if (arrayList.size() >= 10) {
                                break;
                            }
                            android.database.Cursor cursorB = uqpVar2.i.b(android.net.Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI, android.net.Uri.encode(str)), defpackage.uqp.d, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
                            if (cursorB != null) {
                                try {
                                    if (cursorB.moveToNext()) {
                                        accVar.add(cursorB.getString(0));
                                        arrayList.add(str);
                                    }
                                } catch (java.lang.Throwable th) {
                                    try {
                                        cursorB.close();
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            if (cursorB != null) {
                                cursorB.close();
                            }
                            i7++;
                        }
                        aca acaVar = new aca();
                        rsr rsrVar = new rsr();
                        if (!accVar.isEmpty()) {
                            rsrVar.aC(new kaw("lookup").aF(accVar));
                        }
                        rsr rsrVarAB = rsrVar.aB();
                        android.database.Cursor cursorB2 = uqpVar2.i.b(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, defpackage.uqp.b, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, (java.lang.String) null);
                        while (cursorB2 != null) {
                            try {
                                if (!cursorB2.moveToNext()) {
                                    cursorB2.close();
                                    break;
                                }
                                java.lang.String string = cursorB2.getString(2);
                                if (string != null) {
                                    java.lang.String string2 = cursorB2.getString(11);
                                    if (string2 == null) {
                                        string2 = defpackage.uqp.g(string, java.util.Locale.getDefault().getCountry());
                                    }
                                    java.lang.String string3 = cursorB2.getString(3);
                                    if (string3 == null) {
                                        string3 = string2;
                                    }
                                    java.lang.String string4 = cursorB2.getString(4);
                                    if (string4 == null) {
                                        string4 = string2;
                                    }
                                    akzx akzxVarM = defpackage.uqk.a.m();
                                    long j = cursorB2.getLong(0);
                                    akzxVarM.u();
                                    ((defpackage.uqk) akzxVarM.b).c = j;
                                    int i8 = cursorB2.getInt(1);
                                    akzxVarM.u();
                                    ((defpackage.uqk) akzxVarM.b).d = i8;
                                    akzxVarM.u();
                                    defpackage.uqk uqkVar = (defpackage.uqk) akzxVarM.b;
                                    j$.util.Objects.requireNonNull(string);
                                    uqkVar.g = string;
                                    akzxVarM.u();
                                    defpackage.uqk uqkVar2 = (defpackage.uqk) akzxVarM.b;
                                    j$.util.Objects.requireNonNull(string2);
                                    uqkVar2.b |= 2;
                                    uqkVar2.h = string2;
                                    akzxVarM.u();
                                    defpackage.uqk uqkVar3 = (defpackage.uqk) akzxVarM.b;
                                    j$.util.Objects.requireNonNull(string3);
                                    uqkVar3.i = string3;
                                    akzxVarM.u();
                                    defpackage.uqk uqkVar4 = (defpackage.uqk) akzxVarM.b;
                                    j$.util.Objects.requireNonNull(string4);
                                    uqkVar4.j = string4;
                                    long j2 = cursorB2.getLong(5);
                                    akzxVarM.u();
                                    ((defpackage.uqk) akzxVarM.b).k = j2;
                                    java.lang.String string5 = cursorB2.getString(8);
                                    akzxVarM.u();
                                    defpackage.uqk uqkVar5 = (defpackage.uqk) akzxVarM.b;
                                    j$.util.Objects.requireNonNull(string5);
                                    uqkVar5.n = string5;
                                    int i9 = cursorB2.getInt(9);
                                    akzxVarM.u();
                                    ((defpackage.uqk) akzxVarM.b).o = i9;
                                    long j3 = cursorB2.getLong(10);
                                    akzxVarM.u();
                                    ((defpackage.uqk) akzxVarM.b).p = j3;
                                    java.lang.String string6 = uqpVar2.e.getString(2132018774);
                                    akzxVarM.u();
                                    defpackage.uqk uqkVar6 = (defpackage.uqk) akzxVarM.b;
                                    j$.util.Objects.requireNonNull(string6);
                                    uqkVar6.f = string6;
                                    if (cursorB2.getString(12) != null) {
                                        java.lang.String string7 = cursorB2.getString(12);
                                        akzxVarM.u();
                                        defpackage.uqk uqkVar7 = (defpackage.uqk) akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string7);
                                        uqkVar7.b |= 1;
                                        uqkVar7.e = string7;
                                    }
                                    if (cursorB2.getString(7) != null) {
                                        java.lang.String string8 = cursorB2.getString(7);
                                        akzxVarM.u();
                                        defpackage.uqk uqkVar8 = (defpackage.uqk) akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string8);
                                        uqkVar8.b |= 4;
                                        uqkVar8.l = string8;
                                    }
                                    if (cursorB2.getString(6) != null) {
                                        java.lang.String string9 = cursorB2.getString(6);
                                        akzxVarM.u();
                                        defpackage.uqk uqkVar9 = (defpackage.uqk) akzxVarM.b;
                                        j$.util.Objects.requireNonNull(string9);
                                        uqkVar9.b |= 8;
                                        uqkVar9.m = string9;
                                    }
                                    acaVar.put(string2, (defpackage.uqk) akzxVarM.p());
                                }
                            } catch (java.lang.Throwable th3) {
                                try {
                                    cursorB2.close();
                                    throw th3;
                                } catch (java.lang.Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                        aift aiftVar = new aift(4);
                        int size2 = arrayList.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            defpackage.uqk uqkVar10 = (defpackage.uqk) acaVar.get((java.lang.String) arrayList.get(i10));
                            if (uqkVar10 != null) {
                                aiftVar.i(uqkVar10);
                            }
                        }
                        return aiftVar.h();
                    }
                }, uqpVar.f);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.uqp uqpVar2 = (defpackage.uqp) this.a;
                aify aifyVar = (aify) obj;
                return ahvr.H(uqpVar2.h.d(aifyVar), new defpackage.uev(aifyVar, 7), uqpVar2.g);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((apdi) ((urr) this.a).c.a()).e(((java.lang.Integer) obj).intValue());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.a;
                akzx akzxVarP = ((defpackage.uru) optional.orElseThrow()).p();
                akzxVarP.u();
                defpackage.uru uruVar = (defpackage.uru) akzxVarP.b;
                uruVar.b |= 16;
                uruVar.g = true;
                return ((defpackage.usj) obj3).e((defpackage.uru) akzxVarP.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((defpackage.ute) this.a).a.a(((hkd) obj).c);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.ute) this.a).a.a(((hkd) obj).c);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((j$.util.Optional) obj).isPresent() ? ((defpackage.utf) this.a).e.a() : ajcm.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                ahvr.bY(optional2.isPresent());
                return ((defpackage.afpl) ((defpackage.utf) this.a).f.a()).j((android.net.Uri) optional2.orElseThrow(), new affr());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream((java.io.InputStream) obj);
                defpackage.utf utfVar = (defpackage.utf) this.a;
                return utfVar.g.bh(bufferedInputStream, utfVar.c());
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                if (optional3.isPresent()) {
                    return ((defpackage.ute) ((defpackage.zlr) this.a).d).b((java.lang.String) optional3.orElseThrow());
                }
                return aiql.z(j$.util.Optional.empty());
            case 15:
                j$.util.stream.Stream streamFlatMap = j$.util.Collection.-EL.stream((java.util.List) obj).flatMap(new defpackage.thw(i3));
                defpackage.thw thwVar = new defpackage.thw(i2);
                alcf alcfVar = aldi.a;
                aify aifyVar2 = (aify) streamFlatMap.sorted(j$.util.Comparator.-CC.comparing(thwVar, defpackage.aldh.INSTANCE)).filter(new defpackage.sqj(i4)).collect(aido.a);
                if (aifyVar2.isEmpty()) {
                    defpackage.uvb.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/AudioRecordingCombiner", "combineAudioFiles", 93, "AudioRecordingCombiner.java").v("No input audio recording paths provided.");
                    return aiql.z(j$.util.Optional.empty());
                }
                if (aifyVar2.size() == 1) {
                    defpackage.utq utqVar = (defpackage.utq) aifyVar2.get(0);
                    int iAN2 = a.aN(utqVar.e);
                    if ((iAN2 != 0 && iAN2 == 3) || ((iAN = a.aN(utqVar.e)) != 0 && iAN == 4)) {
                        return aiql.z(j$.util.Optional.of(utqVar.d));
                    }
                }
                java.lang.Object obj4 = ((defpackage.zlr) this.a).d;
                defpackage.uvb uvbVar = (defpackage.uvb) obj4;
                return ahrv.g(ahvr.P(new defpackage.tvg(obj4, 15), uvbVar.c)).i(new uhj(obj4, aifyVar2, 8), uvbVar.d);
            case 16:
                java.lang.Object obj5 = ((defpackage.ulw) this.a).c;
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.vdj vdjVar = new defpackage.vdj(obj5, 14);
                if (true == optionalOfNullable.isPresent()) {
                    android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) optionalOfNullable.get();
                    ahbv ahbvVar = (ahbv) vdjVar.a;
                    optionalOfNullable = j$.util.Optional.ofNullable(ahvr.H(ahvr.I(((zjm) ahbvVar.c).l(phoneAccountHandle), new defpackage.vmq(phoneAccountHandle, i5), (java.util.concurrent.Executor) ahbvVar.g), new defpackage.vmj(3), (java.util.concurrent.Executor) ahbvVar.b));
                }
                return (ajcq) optionalOfNullable.orElse(ahvr.F(new onq(20), (java.util.concurrent.Executor) ((ahbv) obj5).b));
            case 17:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                if (!optional4.isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj6 = this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) optional4.orElseThrow();
                rsr rsrVar = new rsr();
                rsrVar.aC(new kaw("archived").aI("=", "0"));
                rsrVar.aC(new kaw("subscription_component_name").aI("=", phoneAccountHandle2.getComponentName().flattenToString()));
                rsrVar.aC(new kaw("subscription_id").aI("=", phoneAccountHandle2.getId()));
                rsr rsrVarAB = rsrVar.aB();
                defpackage.vai vaiVar = (defpackage.vai) obj6;
                return ahvr.H(vaiVar.f.e(android.provider.VoicemailContract.Voicemails.buildSourceUri(vaiVar.b.getPackageName()), (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a), new vak(1), vaiVar.e);
            case 18:
                j$.util.Optional optionalG = ((defpackage.vbb) this.a).a.g();
                if (true == optionalG.isPresent()) {
                    optionalG = j$.util.Optional.ofNullable(((vav) optionalG.get()).e());
                }
                return (ajcq) optionalG.orElse(ajcm.a);
            case 19:
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj;
                defpackage.taj tajVar = new defpackage.taj(this.a, i);
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((vee) optionalOfNullable2.get()).h((android.telecom.PhoneAccountHandle) ((j$.util.Optional) tajVar.a).orElseThrow()));
                }
                return (ajcq) optionalOfNullable2.orElse(ajcm.a);
            default:
                j$.util.Optional optionalOfNullable3 = (j$.util.Optional) obj;
                defpackage.vdj vdjVar2 = new defpackage.vdj(this.a, i6);
                if (true == optionalOfNullable3.isPresent()) {
                    optionalOfNullable3 = j$.util.Optional.ofNullable(((vee) optionalOfNullable3.get()).g((android.telecom.PhoneAccountHandle) ((j$.util.Optional) vdjVar2.a).orElseThrow()));
                }
                return (ajcq) optionalOfNullable3.orElse(ajcm.a);
        }
    }
}
