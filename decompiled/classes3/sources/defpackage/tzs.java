package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tzs implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ tzs(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object apply(java.lang.Object obj) {
        j$.util.Optional optionalC;
        int i = 7;
        int i2 = 6;
        int i3 = 8;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                ((defpackage.tzv) this.a).d.b(mce.cC);
                defpackage.tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "completeLocalAudioWithCuiLogging", 319, "SonicAudioPlayer.java").v("Sonic audio play started at local side");
                return this.b;
            case 1:
                defpackage.tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "setStatePlayingOnceStarted", 302, "SonicAudioPlayer.java").v("state change to playing");
                defpackage.tzv tzvVar = (defpackage.tzv) this.b;
                tzvVar.f(defpackage.tzt.b);
                tzvVar.i = (j$.util.Optional) this.a;
                return null;
            case 2:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object obj2 = this.b;
                    defpackage.tzx tzxVar = (defpackage.tzx) obj2;
                    if (!tzxVar.c.g()) {
                        java.lang.Object obj3 = this.a;
                        defpackage.uss ussVar = tzxVar.i;
                        ussVar.a(mce.cA);
                        ((defpackage.qbe) ussVar.a).a(qbc.hJ);
                        ajcq ajcqVarR = ((heq) ussVar.c).R(oqt.i);
                        agsm agsmVar = (agsm) ussVar.f;
                        agsmVar.g(ajcqVarR, 5L, java.util.concurrent.TimeUnit.SECONDS);
                        java.lang.Object obj4 = ussVar.b;
                        defpackage.tzk tzkVar = (defpackage.tzk) obj4;
                        agsmVar.g(tzkVar.d.g(new defpackage.syg(obj4, obj3, i3), tzkVar.b), 5L, java.util.concurrent.TimeUnit.SECONDS);
                        tzxVar.b.a();
                        defpackage.tzr tzrVar = tzxVar.d;
                        defpackage.tzr.a.b().l("com/android/dialer/sonic/impl/service/SonicAnimationPlayer", "playAnimation", 72, "SonicAnimationPlayer.java").v("sending animation play request");
                        akzx akzxVarM = defpackage.qud.a.m();
                        akzxVarM.u();
                        defpackage.qud qudVar = (defpackage.qud) akzxVarM.b;
                        qudVar.g = 1;
                        qudVar.b |= 1;
                        defpackage.uab uabVar = (defpackage.uab) obj3;
                        ajcq ajcqVarB = tzrVar.b(uabVar, 3);
                        ajcq ajcqVarB2 = tzrVar.b(uabVar, 4);
                        ahda ahdaVarAk = ahvr.ak(new ajcq[]{ajcqVarB, ajcqVarB2});
                        kff kffVar = new kff(tzrVar, akzxVarM, ajcqVarB, ajcqVarB2, 12);
                        ajct ajctVar = tzrVar.b;
                        ahvr.J(ahdaVarAk.p(kffVar, ajctVar), new kxt(tzrVar, 18), ajctVar);
                        tzxVar.j.g().ifPresentOrElse(new rh(obj2, obj3, 16), new defpackage.rqy(obj2, obj3, i3, bArr));
                        return null;
                    }
                }
                defpackage.tzx.a.d().l("com/android/dialer/sonic/impl/service/SonicController", "handleSonicEntryClick", 73, "SonicController.java").v("cannot click when audio or animation is already playing");
                return null;
            case 3:
                uip uipVar = (uip) obj;
                if (!uipVar.k().d().isPresent()) {
                    return null;
                }
                java.lang.Object obj5 = this.b;
                udm udmVar = (udm) uipVar.k().d().orElseThrow();
                udy.a.b().l("com/android/dialer/spam/composite/CompositeSpam", "storeResults", 415, "CompositeSpam.java").v("storing result");
                akzx akzxVarM2 = defpackage.ucu.a.m();
                android.telecom.Call.Details details = (android.telecom.Call.Details) obj5;
                long creationTimeMillis = details.getCreationTimeMillis();
                akzxVarM2.u();
                defpackage.ucu ucuVar = (defpackage.ucu) akzxVarM2.b;
                ucuVar.b |= 1;
                ucuVar.c = creationTimeMillis;
                udj udjVarB = udj.b(udmVar.d);
                if (udjVarB == null) {
                    udjVarB = udj.a;
                }
                akzxVarM2.u();
                defpackage.ucu ucuVar2 = (defpackage.ucu) akzxVarM2.b;
                ucuVar2.d = udjVarB.f;
                ucuVar2.b |= 2;
                int iAQ = a.aQ(udmVar.g);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                akzxVarM2.u();
                defpackage.ucu ucuVar3 = (defpackage.ucu) akzxVarM2.b;
                ucuVar3.g = iAQ - 1;
                ucuVar3.b |= 32;
                int iAQ2 = a.aQ(udmVar.h);
                if (iAQ2 == 0) {
                    iAQ2 = 1;
                }
                akzxVarM2.u();
                defpackage.ucu ucuVar4 = (defpackage.ucu) akzxVarM2.b;
                ucuVar4.i = iAQ2 - 1;
                ucuVar4.b |= 128;
                j$.util.Optional optionalE = uipVar.k().e();
                j$.util.Objects.requireNonNull(akzxVarM2);
                defpackage.ubv ubvVar = new defpackage.ubv(akzxVarM2, i);
                if (true == optionalE.isPresent()) {
                    java.lang.String str = (java.lang.String) optionalE.get();
                    akzx akzxVar = (akzx) ubvVar.a;
                    akzxVar.u();
                    defpackage.ucu ucuVar5 = (defpackage.ucu) akzxVar.b;
                    j$.util.Objects.requireNonNull(str);
                    ucuVar5.b |= 64;
                    ucuVar5.h = str;
                }
                ((udy) this.a).p.b(java.lang.String.valueOf(details.getCreationTimeMillis()), (defpackage.ucu) akzxVarM2.p());
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                sso ssoVar = new sso(((udy) this.b).g);
                akzx akzxVar2 = (akzx) this.a;
                aivu aivuVar = ((defpackage.ucq) akzxVar2.b).c;
                if (aivuVar == null) {
                    aivuVar = aivu.a;
                }
                return ssoVar.a(aivuVar.g, ((defpackage.ucq) akzxVar2.b).d);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                udy.a.d().i(zct.b).k((java.lang.Exception) obj).l("com/android/dialer/spam/composite/CompositeSpam", "catchingAll", 448, "CompositeSpam.java").y("%s threw exception", this.a);
                return this.b;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                hkd hkdVar = (hkd) obj;
                akzx akzxVar3 = (akzx) this.a;
                aivu aivuVar2 = ((defpackage.ucq) akzxVar3.b).c;
                if (aivuVar2 == null) {
                    aivuVar2 = aivu.a;
                }
                java.lang.Object obj6 = this.b;
                akzx akzxVarP = aivuVar2.p();
                defpackage.ucq ucqVar = (defpackage.ucq) akzxVar3.b;
                if ((ucqVar.b & 8) != 0) {
                    optionalC = j$.util.Optional.of(java.lang.Long.valueOf(ucqVar.f));
                } else {
                    zjm zjmVar = ((udy) obj6).r;
                    aivu aivuVar3 = ucqVar.c;
                    if (aivuVar3 == null) {
                        aivuVar3 = aivu.a;
                    }
                    optionalC = zjmVar.C(aivuVar3.g);
                    defpackage.ubv ubvVar2 = new defpackage.ubv(akzxVarP, 9);
                    if (true == optionalC.isPresent()) {
                        java.lang.Object obj7 = optionalC.get();
                        java.lang.Object obj8 = ubvVar2.a;
                        long epochMilli = j$.time.Instant.ofEpochMilli(((java.lang.Long) obj7).longValue()).truncatedTo(j$.time.temporal.ChronoUnit.HOURS).toEpochMilli();
                        akzx akzxVar4 = (akzx) obj8;
                        akzxVar4.u();
                        aivu aivuVar4 = akzxVar4.b;
                        aivuVar4.b |= 262144;
                        aivuVar4.t = epochMilli;
                    }
                }
                udy udyVar = (udy) obj6;
                boolean zA = udyVar.i.a(((java.lang.Long) optionalC.orElse(0L)).longValue());
                akzxVarP.u();
                aivu aivuVar5 = akzxVarP.b;
                aivuVar5.b |= 134217728;
                aivuVar5.z = zA;
                java.lang.String str2 = hkdVar.c;
                akzxVarP.u();
                aivu aivuVar6 = akzxVarP.b;
                j$.util.Objects.requireNonNull(str2);
                aivuVar6.b |= 8;
                aivuVar6.g = str2;
                java.lang.String strA = rlz.a(udyVar.g);
                akzxVarP.u();
                aivu aivuVar7 = akzxVarP.b;
                j$.util.Objects.requireNonNull(strA);
                aivuVar7.b |= 16777216;
                aivuVar7.w = strA;
                aivu aivuVarP = akzxVarP.p();
                akzxVar3.u();
                defpackage.ucq ucqVar2 = (defpackage.ucq) akzxVar3.b;
                j$.util.Objects.requireNonNull(aivuVarP);
                ucqVar2.c = aivuVarP;
                ucqVar2.b |= 1;
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                uip uipVar2 = (uip) obj;
                if (uipVar2 == null || uipVar2.j() != udj.c) {
                    return uipVar2;
                }
                java.lang.Object obj9 = this.b;
                defpackage.uhu uhuVar = defpackage.uhu.a;
                java.lang.String strB = defpackage.ura.b((android.telecom.Call.Details) obj9);
                if (android.text.TextUtils.isEmpty(strB)) {
                    return uipVar2;
                }
                udy udyVar2 = (udy) this.a;
                ahrv ahrvVarG = ahrv.g(udyVar2.q.a());
                defpackage.sue sueVar = new defpackage.sue(udyVar2, strB, uhuVar, i2);
                ajct ajctVar2 = udyVar2.e;
                agsm.i(910, ahrvVarG.i(sueVar, ajctVar2).h(new ubc(7), ajctVar2), "Exception while storing cross-app spam signal", new java.lang.Object[0]);
                return uipVar2;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                java.lang.Object obj10 = this.a;
                akzx akzxVarM3 = aivv.a.m();
                aivu aivuVar8 = ((defpackage.ucq) ((akzx) obj10).b).c;
                if (aivuVar8 == null) {
                    aivuVar8 = aivu.a;
                }
                java.lang.Object obj11 = this.b;
                akzxVarM3.u();
                aivv aivvVar = akzxVarM3.b;
                j$.util.Objects.requireNonNull(aivuVar8);
                aivvVar.c = aivuVar8;
                aivvVar.b |= 1;
                udy udyVar3 = (udy) obj11;
                udyVar3.m.d(udyVar3.f.h(akzxVarM3.p(), abtl.b(udyVar3.g, new defpackage.aiyl())));
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                akzx akzxVar5 = (akzx) this.a;
                return (udm) ((uex) this.b).c(aify.p(akzxVar5.b.g)).getOrDefault(akzxVar5.b.g, defpackage.udn.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj12 = this.a;
                if (zBooleanValue) {
                    akzx akzxVar6 = (akzx) obj12;
                    akzxVar6.u();
                    aivu aivuVar9 = akzxVar6.b;
                    aivu aivuVar10 = aivu.a;
                    aivuVar9.i = 6;
                    aivuVar9.b |= 32;
                }
                akzx akzxVar7 = (akzx) obj12;
                aivu aivuVar11 = akzxVar7.b;
                java.lang.String str3 = aivuVar11.g;
                aivs aivsVar = aivuVar11.F;
                if (aivsVar == null) {
                    aivsVar = aivs.a;
                }
                uex uexVar = (uex) this.b;
                long jD = uexVar.d(str3, 2, aivsVar);
                uexVar.h(akzxVar7);
                return java.lang.Long.valueOf(jD);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aigf aigfVar = (aigf) obj;
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
                for (java.lang.String str4 : this.a) {
                    if (!aigfVar.containsKey(str4)) {
                        arrayList.add(str4);
                    }
                }
                java.lang.Object obj13 = this.b;
                gus.aJ();
                uex uexVar2 = (uex) obj13;
                aogc aogcVar = uexVar2.i;
                java.lang.String strA2 = rlt.a((android.content.Context) aogcVar.c, (android.telecom.PhoneAccountHandle) null);
                aigb aigbVar = new aigb(4);
                for (java.lang.String str5 : arrayList) {
                    aigbVar.i(str5, aogcVar.at(str5, strA2));
                }
                aigf aigfVarE = aigbVar.e(true);
                aigf aigfVarC = uexVar2.c(arrayList);
                aigb aigbVar2 = new aigb(4);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    java.lang.String str6 = (java.lang.String) arrayList.get(i4);
                    tvn tvnVar = uexVar2.h;
                    defpackage.uim uimVar = (defpackage.uim) aigfVarE.get(str6);
                    udm udmVar2 = defpackage.udn.a;
                    aigbVar2.i(str6, tvnVar.h(uimVar, udmVar2, (udm) aigfVarC.getOrDefault(str6, udmVar2), str6));
                }
                aigbVar2.l(aigfVar);
                return aigbVar2.e(true);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj14 = this.a;
                java.lang.Object obj15 = this.b;
                if (zBooleanValue2) {
                    ((uex) obj15).c.n(rmw.ia);
                    akzx akzxVar8 = (akzx) obj14;
                    akzxVar8.u();
                    aivu aivuVar12 = akzxVar8.b;
                    aivu aivuVar13 = aivu.a;
                    aivuVar12.i = 6;
                    aivuVar12.b |= 32;
                }
                akzx akzxVar9 = (akzx) obj14;
                aivu aivuVar14 = akzxVar9.b;
                java.lang.String str7 = aivuVar14.g;
                aivs aivsVar2 = aivuVar14.F;
                if (aivsVar2 == null) {
                    aivsVar2 = aivs.a;
                }
                uex uexVar3 = (uex) obj15;
                long jD2 = uexVar3.d(str7, 0, aivsVar2);
                uexVar3.h(akzxVar9);
                return java.lang.Long.valueOf(jD2);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                boolean zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj16 = this.a;
                java.lang.Object obj17 = this.b;
                if (zBooleanValue3) {
                    ((uex) obj17).c.n(rmw.hZ);
                    akzx akzxVar10 = (akzx) obj16;
                    akzxVar10.u();
                    aivu aivuVar15 = akzxVar10.b;
                    aivu aivuVar16 = aivu.a;
                    aivuVar15.i = 6;
                    aivuVar15.b |= 32;
                }
                akzx akzxVar11 = (akzx) obj16;
                aivu aivuVar17 = akzxVar11.b;
                java.lang.String str8 = aivuVar17.g;
                aivs aivsVar3 = aivuVar17.F;
                if (aivsVar3 == null) {
                    aivsVar3 = aivs.a;
                }
                uex uexVar4 = (uex) obj17;
                long jD3 = uexVar4.d(str8, 1, aivsVar3);
                uexVar4.h(akzxVar11);
                return java.lang.Long.valueOf(jD3);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return java.lang.Boolean.TRUE;
                }
                uhs uhsVar = (uhs) this.a;
                return uhsVar.d.get() ? java.lang.Boolean.valueOf(uhsVar.e.get()) : java.lang.Boolean.valueOf(((android.os.PersistableBundle) this.b).getBoolean("com.google.android.dialer.spam_blocking_enabled_by_carrier"));
            case 15:
                dva dvaVar = (dva) obj;
                android.content.Context context = ((val) this.a).b;
                dvaVar.g(context.getString(2132019574));
                android.content.Intent intent = new android.content.Intent("android.telephony.action.CONFIGURE_VOICEMAIL");
                intent.putExtra("android.telephony.extra.HIDE_PUBLIC_SETTINGS", true);
                ?? r0 = this.b;
                intent.putExtra("android.telephony.extra.PHONE_ACCOUNT_HANDLE", (android.os.Parcelable) r0);
                int iHashCode = ((android.telecom.PhoneAccountHandle) r0).hashCode() + 2;
                android.content.ClipData clipData = defpackage.afap.a;
                dvaVar.g = android.app.PendingIntent.getActivity(context, iHashCode, intent, 201326592);
                return dvaVar;
            case 16:
                val valVar = (val) this.b;
                return java.lang.String.format(valVar.b.getString(2132019575), valVar.g.g((java.lang.String) this.a, (java.lang.String) obj));
            case 17:
                return (aify) j$.util.Collection.-EL.stream((java.util.Collection) this.a).filter(new lvq(this.b, (aigf) obj, 3)).collect(aido.a);
            case 18:
                ((vdo) this.a).h.i((java.lang.String) null).b(mce.dW);
                return this.b;
            case 19:
                ((vea) this.a).g.o(rmx.op);
                vea.a.c().i(zct.a).k((java.lang.Exception) obj).l("com/android/dialer/voicemail/service/impl/scheduler/VvmExecutorImpl", "executeWorkOnCarrierService", 543, "VvmExecutorImpl.java").y("Exception during vvm work for %s", this.b);
                akzx akzxVarM4 = vcr.a.m();
                akzx akzxVarM5 = vcp.a.m();
                defpackage.vbs vbsVar = defpackage.vbs.FAILED_FUTURE;
                akzxVarM5.u();
                vcp vcpVar = akzxVarM5.b;
                vcpVar.c = java.lang.Integer.valueOf(vbsVar.a());
                vcpVar.b = 1;
                akzxVarM4.u();
                vcr vcrVar = akzxVarM4.b;
                vcp vcpVarP = akzxVarM5.p();
                j$.util.Objects.requireNonNull(vcpVarP);
                vcrVar.c = vcpVarP;
                vcrVar.b = 2;
                return akzxVarM4.p();
            default:
                vfn vfnVar = (vfn) this.a;
                vfnVar.l.m((android.telecom.PhoneAccountHandle) this.b);
                vfnVar.f.n(rmw.aM);
                return null;
        }
    }

    public /* synthetic */ tzs(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
