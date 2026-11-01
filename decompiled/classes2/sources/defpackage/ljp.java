package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ljp implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ljp(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objY;
        int i = 8;
        int i2 = 19;
        int i3 = 10;
        int i4 = 5;
        int i5 = 13;
        int i6 = 2;
        byte[] bArr = null;
        int i7 = 0;
        int i8 = 1;
        switch (this.$cid) {
            case 0:
                defpackage.ljs ljsVar = (defpackage.ljs) this.a;
                ljsVar.k.set(false);
                defpackage.adpe adpeVar = ljsVar.i;
                if (!adpeVar.h()) {
                    adpeVar.f();
                }
                ljsVar.l((j$.util.Optional) this.b);
                return ljsVar.f.c(new defpackage.jse(13), 500L, java.util.concurrent.TimeUnit.MILLISECONDS);
            case 1:
                defpackage.ljs ljsVar2 = (defpackage.ljs) this.a;
                ljsVar2.q();
                ljsVar2.t(defpackage.ljr.g, null, false);
                throw ((java.lang.Throwable) this.b);
            case 2:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj2 = this.a;
                if (!zBooleanValue) {
                    defpackage.ljs.a.d().i(zct.b).l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "startInternal", 338, "ForkedIncomingCallFlowManager.java").w("%d:start():Unpaused message was not fully played.", ((defpackage.ljs) obj2).j);
                }
                defpackage.ljs ljsVar3 = (defpackage.ljs) obj2;
                return !ljsVar3.n ? ljsVar3.e((defpackage.adnw) this.b) : aiql.z(java.lang.Boolean.TRUE);
            case 3:
                java.lang.Object obj3 = this.a;
                java.lang.Object obj4 = ((defpackage.ljs) obj3).d;
                java.lang.Object obj5 = this.b;
                synchronized (obj4) {
                    if (((defpackage.ljs) obj3).a() != defpackage.ljr.d || !((j$.util.Optional) obj5).isPresent()) {
                        defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "pause", 564, "ForkedIncomingCallFlowManager.java").w("%d:pause():Skipping pause message", ((defpackage.ljs) obj3).j);
                        return aiql.z((java.lang.Object) null);
                    }
                    defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "pause", 560, "ForkedIncomingCallFlowManager.java").w("%d:pause():Playing pause message", ((defpackage.ljs) obj3).j);
                    ((defpackage.ljs) obj3).p.d(((defpackage.ljs) obj3).i.e());
                    return ((defpackage.ljs) obj3).e((defpackage.adnw) ((j$.util.Optional) obj5).orElseThrow());
                }
            case 4:
                aimw aimwVarL = defpackage.ljs.a.b().l("com/android/dialer/callscreen/impl/speechrecognition/whisperfork/ForkedIncomingCallFlowManager", "pause", 571, "ForkedIncomingCallFlowManager.java");
                defpackage.ljs ljsVar4 = (defpackage.ljs) this.a;
                aimwVarL.w("%d:pause():Starting shutdown sequence", ljsVar4.j);
                return ljsVar4.d(this.b);
            case 5:
                java.lang.String string = java.util.UUID.randomUUID().toString();
                defpackage.ljs ljsVar5 = (defpackage.ljs) this.a;
                return ljsVar5.p.a((java.io.File) obj, new defpackage.ljq(ljsVar5, ljsVar5.b, (defpackage.adnw) this.b, string), ljsVar5.g, ljsVar5.h);
            case 6:
                defpackage.kis kisVar = (defpackage.kis) obj;
                int size = kisVar.b.size();
                java.lang.Object obj6 = this.b;
                if (size != 0) {
                    return ((defpackage.lzv) obj6).a(kisVar);
                }
                defpackage.kis kisVar2 = ((kiu) this.a).u;
                if (kisVar2 == null) {
                    kisVar2 = defpackage.kis.a;
                }
                return ((defpackage.lzv) obj6).a(kisVar2);
            case 7:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nwb.a.b().l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isDsdaAvailableInternal", 190, "DualSimDualActiveImpl.java").v("device doesn't support");
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.Object obj7 = this.b;
                java.lang.Object obj8 = this.a;
                defpackage.nwb nwbVar = (defpackage.nwb) obj8;
                return ahvr.I(ahvr.F(new defpackage.lgc(obj8, 20), nwbVar.d), new defpackage.ljp(obj8, obj7, 11), nwbVar.e);
            case 8:
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (((java.util.List) obj).contains(bool)) {
                    defpackage.nwb.a.b().l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isSubscriptionDsdaRegistration", 297, "DualSimDualActiveImpl.java").v("Not all subscription registration states are registered.");
                    return aiql.z(bool);
                }
                java.lang.Object obj9 = this.b;
                defpackage.nwb nwbVar2 = (defpackage.nwb) this.a;
                return ahvr.H(aiql.v((aify) j$.util.DesugarArrays.stream((int[]) obj9).mapToObj(new defpackage.nvy(nwbVar2, i8)).collect(aido.a)), new lix(8), nwbVar2.e);
            case 9:
                aify aifyVar = (aify) obj;
                defpackage.nwb.a.b().l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isDsdaAvailableOnAndroidVAndLater", 135, "DualSimDualActiveImpl.java").w("activeCallInfoList size = %d", aifyVar.size());
                j$.util.stream.Stream map = j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.mig(5)).filter(new defpackage.mif(3)).map(new defpackage.mig(6));
                defpackage.nwb nwbVar3 = (defpackage.nwb) this.b;
                zjs zjsVar = nwbVar3.f;
                j$.util.Objects.requireNonNull(zjsVar);
                aihd aihdVar = (aihd) map.map(new defpackage.naa(zjsVar, 15)).collect(aido.b);
                return ahvr.aj(aihdVar).o(new defpackage.lly(aihdVar, this.a, i3, bArr), nwbVar3.d);
            case 10:
                java.lang.Integer num = (java.lang.Integer) obj;
                int[] iArr = (int[]) this.b;
                if (iArr[0] == num.intValue() || iArr[1] == num.intValue()) {
                    return ((defpackage.nwb) this.a).d(iArr);
                }
                defpackage.nwb.a.b().l("com/android/dialer/dualsim/dualsimdualactive/impl/DualSimDualActiveImpl", "isSubscriptionDsdaAvailable", 272, "DualSimDualActiveImpl.java").v("candidate phone account isn't dsda available because it isn't provided by subscription");
                return aiql.z(java.lang.Boolean.FALSE);
            case 11:
                int[] iArr2 = (int[]) obj;
                if (iArr2.length != 2) {
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.Object objOfNullable = this.b;
                java.lang.Object obj10 = this.a;
                defpackage.idc idcVar = new defpackage.idc(obj10, iArr2, 4);
                j$.util.Optional optional = (j$.util.Optional) objOfNullable;
                if (true == optional.isPresent()) {
                    java.lang.Object obj11 = optional.get();
                    java.lang.Object obj12 = idcVar.a;
                    java.lang.Object obj13 = idcVar.b;
                    defpackage.nwb nwbVar4 = (defpackage.nwb) obj12;
                    oko okoVar = nwbVar4.c;
                    objOfNullable = j$.util.Optional.ofNullable(ahvr.I(aosv.F(okoVar.b, 0, new defpackage.ofa(okoVar, (android.telecom.PhoneAccountHandle) obj11, (aoln) null, 9), 3), new defpackage.ljp(obj12, obj13, i3), nwbVar4.e));
                }
                defpackage.idf idfVar = new defpackage.idf(obj10, iArr2, i6);
                j$.util.Optional optional2 = (j$.util.Optional) objOfNullable;
                return (ajcq) (true != optional2.isPresent() ? ((defpackage.nwb) idfVar.a).d((int[]) idfVar.b) : optional2.get());
            case 12:
                return ((nyh) this.a).h.v((java.lang.String) this.b, (java.lang.String) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.String str = ((defpackage.hkd) obj).c;
                aooh.f(str, "phoneNumber");
                mgv mgvVar = mgv.eN;
                java.lang.String str2 = ((defpackage.nwt) this.a).l;
                java.util.List listBb = ajsz.bb(new mhc[]{aais.aG(aais.aC(str)), aais.aG(str2)});
                olc olcVar = ((nyh) this.b).f;
                gbp gbpVar = new gbp(olcVar, 12, (float[][]) null);
                kaw kawVarAQ = gus.aQ(mhc.a.m());
                kawVarAQ.N("failed");
                mhc mhcVarL = kawVarAQ.L();
                defpackage.obp obpVar = new defpackage.obp(olcVar, str, str2, 3, (char[]) null);
                aooh.f(listBb, "parameters");
                aooh.f(mhcVarL, "failedResult");
                zjv zjvVar = olcVar.g;
                zjv.i(zjvVar, mgvVar, listBb, (mhc) null, 3, 12);
                ?? A = obpVar.a();
                ahvr.J((ajcq) A, new zju(zjvVar, mgvVar, listBb, gbpVar, mhcVarL), zjvVar.b);
                return A;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.idc idcVar2 = new defpackage.idc(this.a, this.b, i4);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj14 = optionalOfNullable.get();
                    java.lang.Object obj15 = idcVar2.a;
                    long jIntValue = ((java.lang.Integer) idcVar2.b).intValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    j$.lang.Iterable.-EL.forEach(((defpackage.nzj) obj14).b, new defpackage.fcg(arrayList, 14));
                    defpackage.nzg nzgVar = ((nzh) obj15).c;
                    ahrv ahrvVarQ = ahvr.Q(new defpackage.ibi(nzgVar, arrayList, 18), nzgVar.b);
                    defpackage.jwi jwiVar = new defpackage.jwi(nzgVar, jIntValue, i);
                    ajct ajctVar = nzgVar.c;
                    optionalOfNullable = j$.util.Optional.ofNullable(ahrvVarQ.i(jwiVar, ajctVar).h(new lix(16), ajctVar));
                }
                if (true != optionalOfNullable.isPresent()) {
                    a.bI(nzh.a.d(), "unable to get downloaded mdd data", "com/android/dialer/eligibilityexpansion/EligibilityExpansionDatabaseWorker", "syncDatabase", 'c', "EligibilityExpansionDatabaseWorker.java", zct.b);
                    objY = aiql.y(new java.lang.Exception("unable to get downloaded mdd data"));
                } else {
                    objY = optionalOfNullable.get();
                }
                return (ajcq) objY;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return ((onw) this.b).i((aiii) obj, (defpackage.hkd) this.a);
            case 16:
                return ((onw) this.b).h.t((defpackage.hkd) obj, (defpackage.hkd) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.Object obj16 = this.a;
                oqi oqiVar = (oqi) obj16;
                j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(oqiVar.m.e()).filter(new defpackage.jty(this.b, i5));
                j$.util.stream.Collector collector = aido.a;
                aify aifyVar2 = (aify) streamFilter.collect(collector);
                return ahvr.H(aiql.F((aify) j$.util.Collection.-EL.stream(aifyVar2).map(new defpackage.naa(obj16, i2)).collect(collector)), new defpackage.oqe(obj16, aifyVar2, i7), oqiVar.d);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                final defpackage.orj orjVar = (defpackage.orj) obj;
                int i9 = orjVar.b;
                java.lang.Object obj17 = this.a;
                if (i9 == 1) {
                    ((orl) obj17).b.isPresent();
                }
                if (orjVar.b != 2) {
                    return aiql.y(new java.lang.UnsupportedOperationException());
                }
                java.lang.Object obj18 = this.b;
                orl.a.b().l("com/android/dialer/http/impl/DialerHttpImpl", "getResponse", 48, "DialerHttpImpl.java").v("Using digest authentication");
                rsr rsrVar = ((orl) obj17).d;
                final ajzm ajzmVar = (ajzm) obj18;
                ajcq ajcqVarAL = ((aogc) rsrVar.b).aL(ajzmVar);
                defpackage.onp onpVar = new defpackage.onp(7);
                ?? r7 = rsrVar.a;
                return ahrv.g(ahvr.H(ajcqVarAL, onpVar, (java.util.concurrent.Executor) r7)).h(new ahyc() { // from class: oro
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    /* JADX WARN: Multi-variable type inference failed */
                    public final java.lang.Object apply(java.lang.Object obj19) {
                        java.lang.String str3 = (java.lang.String) obj19;
                        defpackage.orj orjVar2 = orjVar;
                        int i10 = orjVar2.b;
                        ajzm ajzmVar2 = ajzmVar;
                        java.lang.String str4 = ajzmVar2.a;
                        java.lang.String str5 = (i10 == 2 ? (defpackage.ori) orjVar2.c : defpackage.ori.a).c;
                        try {
                            java.lang.String strDecode = j$.net.URLDecoder.decode(str4, "UTF-8");
                            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                            j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
                            j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
                            int i11 = 1;
                            j$.util.Optional optionalOf = optionalEmpty;
                            j$.util.Optional optionalOf2 = optionalEmpty2;
                            j$.util.Optional optionalOf3 = optionalEmpty3;
                            java.lang.String str6 = null;
                            java.lang.String str7 = null;
                            java.lang.String str8 = null;
                            java.lang.String str9 = null;
                            for (java.lang.String str10 : ahzf.d(",").h((java.lang.String) ahzf.d(" ").k().j(str3.trim()).get(1))) {
                                aify aifyVarN = aify.n(ahzf.d("=").k().j(str10));
                                ahvr.bY(aifyVarN.size() == 2 ? i11 : 0);
                                java.lang.String lowerCase = ((java.lang.String) aifyVarN.get(0)).trim().toLowerCase(java.util.Locale.US);
                                java.lang.String strTrim = ((java.lang.String) aifyVarN.get(i11)).trim();
                                ahvr.bY((strTrim.isEmpty() ? 1 : 0) ^ i11);
                                java.lang.String strReplace = strTrim.replace("\"", "");
                                switch (lowerCase.hashCode()) {
                                    case -1326197564:
                                        if (!lowerCase.equals("domain")) {
                                            a.bt(defpackage.orn.a.c().m(aioa.b), "error parsing the WWW-Authenticate header parameter: %s", str10, "com/android/dialer/http/impl/DigestAuthHeaderBuilder", "getParametersFromHeader", (char) 156, "DigestAuthHeaderBuilder.java", zct.b);
                                            throw new java.lang.IllegalStateException("Failed to parse the WWW-Authenticate header");
                                        }
                                        optionalOf = j$.util.Optional.of(strReplace);
                                        i11 = 1;
                                        break;
                                        break;
                                    case -1010695135:
                                        if (!lowerCase.equals("opaque")) {
                                            a.bt(defpackage.orn.a.c().m(aioa.b), "error parsing the WWW-Authenticate header parameter: %s", str10, "com/android/dialer/http/impl/DigestAuthHeaderBuilder", "getParametersFromHeader", (char) 156, "DigestAuthHeaderBuilder.java", zct.b);
                                            throw new java.lang.IllegalStateException("Failed to parse the WWW-Authenticate header");
                                        }
                                        if (strReplace == null) {
                                            throw new java.lang.NullPointerException("Null opaque");
                                        }
                                        str8 = strReplace;
                                        i11 = 1;
                                        break;
                                        break;
                                    case 112146:
                                        if (!lowerCase.equals("qop")) {
                                            a.bt(defpackage.orn.a.c().m(aioa.b), "error parsing the WWW-Authenticate header parameter: %s", str10, "com/android/dialer/http/impl/DigestAuthHeaderBuilder", "getParametersFromHeader", (char) 156, "DigestAuthHeaderBuilder.java", zct.b);
                                            throw new java.lang.IllegalStateException("Failed to parse the WWW-Authenticate header");
                                        }
                                        optionalOf2 = j$.util.Optional.of(strReplace);
                                        i11 = 1;
                                        break;
                                        break;
                                    case 105002991:
                                        if (!lowerCase.equals("nonce")) {
                                            a.bt(defpackage.orn.a.c().m(aioa.b), "error parsing the WWW-Authenticate header parameter: %s", str10, "com/android/dialer/http/impl/DigestAuthHeaderBuilder", "getParametersFromHeader", (char) 156, "DigestAuthHeaderBuilder.java", zct.b);
                                            throw new java.lang.IllegalStateException("Failed to parse the WWW-Authenticate header");
                                        }
                                        if (strReplace == null) {
                                            throw new java.lang.NullPointerException("Null nonce");
                                        }
                                        str7 = strReplace;
                                        i11 = 1;
                                        break;
                                        break;
                                    case 108386959:
                                        if (!lowerCase.equals("realm")) {
                                            a.bt(defpackage.orn.a.c().m(aioa.b), "error parsing the WWW-Authenticate header parameter: %s", str10, "com/android/dialer/http/impl/DigestAuthHeaderBuilder", "getParametersFromHeader", (char) 156, "DigestAuthHeaderBuilder.java", zct.b);
                                            throw new java.lang.IllegalStateException("Failed to parse the WWW-Authenticate header");
                                        }
                                        if (strReplace == null) {
                                            throw new java.lang.NullPointerException("Null realm");
                                        }
                                        str6 = strReplace;
                                        i11 = 1;
                                        break;
                                        break;
                                    case 109757337:
                                        if (!lowerCase.equals("stale")) {
                                            a.bt(defpackage.orn.a.c().m(aioa.b), "error parsing the WWW-Authenticate header parameter: %s", str10, "com/android/dialer/http/impl/DigestAuthHeaderBuilder", "getParametersFromHeader", (char) 156, "DigestAuthHeaderBuilder.java", zct.b);
                                            throw new java.lang.IllegalStateException("Failed to parse the WWW-Authenticate header");
                                        }
                                        optionalOf3 = j$.util.Optional.of(strReplace);
                                        i11 = 1;
                                        break;
                                        break;
                                    case 225490031:
                                        if (!lowerCase.equals("algorithm")) {
                                            a.bt(defpackage.orn.a.c().m(aioa.b), "error parsing the WWW-Authenticate header parameter: %s", str10, "com/android/dialer/http/impl/DigestAuthHeaderBuilder", "getParametersFromHeader", (char) 156, "DigestAuthHeaderBuilder.java", zct.b);
                                            throw new java.lang.IllegalStateException("Failed to parse the WWW-Authenticate header");
                                        }
                                        if (strReplace == null) {
                                            throw new java.lang.NullPointerException("Null algorithm");
                                        }
                                        str9 = strReplace;
                                        i11 = 1;
                                        break;
                                        break;
                                    default:
                                        a.bt(defpackage.orn.a.c().m(aioa.b), "error parsing the WWW-Authenticate header parameter: %s", str10, "com/android/dialer/http/impl/DigestAuthHeaderBuilder", "getParametersFromHeader", (char) 156, "DigestAuthHeaderBuilder.java", zct.b);
                                        throw new java.lang.IllegalStateException("Failed to parse the WWW-Authenticate header");
                                }
                            }
                            if (str6 == null || str7 == null || str8 == null || str9 == null) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                if (str6 == null) {
                                    sb.append(" realm");
                                }
                                if (str7 == null) {
                                    sb.append(" nonce");
                                }
                                if (str8 == null) {
                                    sb.append(" opaque");
                                }
                                if (str9 == null) {
                                    sb.append(" algorithm");
                                }
                                throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
                            }
                            defpackage.orm ormVar = new defpackage.orm(str6, optionalOf, optionalOf2, str7, optionalOf3, str8, str9);
                            byte[] bArr2 = new byte[16];
                            new java.security.SecureRandom().nextBytes(bArr2);
                            aish aishVar = aish.g;
                            java.lang.String lowerCase2 = aishVar.k(bArr2).toLowerCase(java.util.Locale.US);
                            java.lang.String str11 = ormVar.c;
                            j$.util.Optional optional3 = ormVar.b;
                            java.lang.String str12 = (java.lang.String) optional3.orElseThrow();
                            int i12 = orjVar2.b;
                            defpackage.ori oriVar = i12 == 2 ? (defpackage.ori) orjVar2.c : defpackage.ori.a;
                            java.lang.String str13 = ormVar.a;
                            java.lang.String str14 = oriVar.c;
                            defpackage.ori oriVar2 = i12 == 2 ? (defpackage.ori) orjVar2.c : defpackage.ori.a;
                            java.lang.String str15 = ajzmVar2.g;
                            java.lang.String str16 = oriVar2.d;
                            java.security.MessageDigest messageDigestB = defpackage.orn.b();
                            messageDigestB.update(android.text.TextUtils.join((java.lang.CharSequence) ":", (java.lang.Iterable) aify.r(str14, str13, str16)).getBytes());
                            java.lang.String lowerCase3 = aishVar.k(messageDigestB.digest()).toLowerCase(java.util.Locale.US);
                            java.security.MessageDigest messageDigestB2 = defpackage.orn.b();
                            messageDigestB2.update(android.text.TextUtils.join((java.lang.CharSequence) ":", (java.lang.Iterable) aify.q(str15, strDecode)).getBytes());
                            java.lang.String lowerCase4 = aishVar.k(messageDigestB2.digest()).toLowerCase(java.util.Locale.US);
                            java.security.MessageDigest messageDigestB3 = defpackage.orn.b();
                            messageDigestB3.update(android.text.TextUtils.join((java.lang.CharSequence) ":", (java.lang.Iterable) aify.u(lowerCase3, str11, "00000001", lowerCase2, str12, lowerCase4)).getBytes());
                            return "Digest username=" + defpackage.orn.a(str5) + ",uri=" + defpackage.orn.a(strDecode) + ",realm=" + defpackage.orn.a(str13) + ",qop=" + defpackage.orn.a((java.lang.String) optional3.orElseThrow()) + ",nonce=" + defpackage.orn.a(str11) + ",cnonce=" + defpackage.orn.a(lowerCase2) + ",nc=00000001,response=" + defpackage.orn.a(aishVar.k(messageDigestB3.digest()).toLowerCase(java.util.Locale.US)) + ",opaque=" + defpackage.orn.a(ormVar.d) + ",algorithm=" + defpackage.orn.a(ormVar.e);
                        } catch (java.io.UnsupportedEncodingException e) {
                            throw new java.lang.AssertionError("Should be able to decode URL", e);
                        }
                    }
                }, (java.util.concurrent.Executor) r7).i(new defpackage.ljp(rsrVar, obj18, i2), (java.util.concurrent.Executor) r7);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ajzk ajzkVarA = ((ajzm) this.b).a();
                ajzkVarA.b(ajzj.a("Authorization"), (java.lang.String) obj);
                return ((aogc) ((rsr) this.a).b).aL(new ajzm(ajzkVarA));
            default:
                return ahvr.H(((pgs) this.b).l.v(ura.b((android.telecom.Call.Details) this.a), (java.lang.String) obj), new defpackage.onp(i5), ajbm.a);
        }
    }

    public /* synthetic */ ljp(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
