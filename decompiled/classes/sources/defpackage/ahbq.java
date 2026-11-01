package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahbq {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public ahbq(final android.content.Context context, rai raiVar, java.util.Map map, defpackage.apnt apntVar, defpackage.ajct ajctVar, final defpackage.aogc aogcVar, defpackage.ahyn ahynVar, java.util.Map map2, defpackage.ahav ahavVar, final defpackage.aonj aonjVar, java.util.concurrent.Executor executor, java.util.Map map3, defpackage.aonn aonnVar, defpackage.aonj aonjVar2, defpackage.ajat ajatVar, defpackage.aomy aomyVar, java.util.Set set) {
        rai raiVar2 = raiVar;
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (raiVar2 == null) {
            defpackage.aooh.i("mendelFactory");
        }
        if (map == null) {
            defpackage.aooh.i("subpackagedToTier");
        }
        if (apntVar == null) {
            defpackage.aooh.i("subpackager");
        }
        if (ajctVar == null) {
            defpackage.aooh.i("blockingExecutor");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("fileApi");
        }
        if (ahynVar == null) {
            defpackage.aooh.i("hermeticOverrides");
        }
        if (map2 == null) {
            defpackage.aooh.i("unused");
        }
        if (executor == null) {
            defpackage.aooh.i("snapshotExecutor");
        }
        if (set == null) {
            defpackage.aooh.i("flagRecorders");
        }
        this.c = apntVar;
        this.d = ahynVar;
        this.a = set;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (((defpackage.ahav) entry.getValue()) == ahavVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set setKeySet = linkedHashMap.keySet();
        int iAL = defpackage.ajsz.aL(defpackage.ajsz.bl(setKeySet, 10));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(iAL < 16 ? 16 : iAL);
        for (java.util.Iterator it = setKeySet.iterator(); it.hasNext(); it = it) {
            java.lang.Object next = it.next();
            final java.lang.String str = (java.lang.String) next;
            final defpackage.adnp adnpVar = new defpackage.adnp(ajctVar);
            defpackage.aoin aenhVar = (defpackage.aoin) map3.get(defpackage.aewo.c(str));
            if (aenhVar == null) {
                aenhVar = new defpackage.aenh(7);
            }
            defpackage.aoin aoinVar = aenhVar;
            defpackage.ahzi ahziVarBI = defpackage.ahvr.bI(new defpackage.ahzi() { // from class: ahbn
                @Override // defpackage.ahzi
                public final java.lang.Object eZ() {
                    return defpackage.ahbq.n(str, adnpVar, aogcVar, aonjVar, ahbp.a);
                }
            });
            defpackage.aooh.e(ahziVarBI, "memoize(...)");
            defpackage.afhf afhfVarN = n(str, adnpVar, aogcVar, aonjVar, new defpackage.rou(15));
            defpackage.ahbo ahboVar = new defpackage.ahbo(aonjVar2, str, 0);
            defpackage.lkf lkfVar = new defpackage.lkf(ajatVar, str, 8);
            him himVar = ((hil) raiVar2.a).a;
            linkedHashMap2.put(next, new defpackage.ahce(himVar.a(), j$.util.Optional.of(java.lang.Boolean.FALSE), (defpackage.ajct) himVar.as.a(), (defpackage.aazc) himVar.l.a(), defpackage.aikn.a, himVar.pk(), himVar.aI, himVar.aJ, (defpackage.aewq) himVar.br.a(), (defpackage.zzx) himVar.bs.a(), (defpackage.ajxm) himVar.bv.a(), str, adnpVar, aonnVar, aoinVar, executor, ahziVarBI, afhfVarN, ahboVar, lkfVar, aomyVar));
            raiVar2 = raiVar;
        }
        this.b = linkedHashMap2;
    }

    public static aajx k(defpackage.aagp aagpVar, java.lang.String str, aajm aajmVar, int i, aajl aajlVar) throws defpackage.aacw {
        aaja aajaVar;
        aajlVar.c(3, aajk.c);
        try {
            aajb aajbVarV = aagpVar.v();
            android.os.Parcel parcelEQ = aajbVarV.eQ(2, aajbVarV.eP());
            android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
            uzx uzxVar = null;
            if (strongBinder == null) {
                aajaVar = null;
            } else {
                aaja aajaVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
                aajaVar = aajaVarQueryLocalInterface instanceof aaja ? aajaVarQueryLocalInterface : new aaja(strongBinder);
            }
            parcelEQ.recycle();
            aajlVar.c(4, aajk.c);
            com.google.android.gms.droidguard.DroidGuardResultsRequest droidGuardResultsRequest = new com.google.android.gms.droidguard.DroidGuardResultsRequest();
            android.os.Bundle bundle = droidGuardResultsRequest.a;
            int i2 = bundle.getInt("clientVersion");
            bundle.putInt("clientVersion", (i2 - (i2 % 10)) + 2);
            bundle.putAll(aajmVar.b);
            bundle.putInt("openHandles", i);
            try {
                android.os.Parcel parcelEP = aajaVar.eP();
                parcelEP.writeString(str);
                defpackage.yld.d(parcelEP, droidGuardResultsRequest);
                android.os.Parcel parcelEQ2 = aajaVar.eQ(5, parcelEP);
                com.google.android.gms.droidguard.internal.DroidGuardInitReply droidGuardInitReplyA = defpackage.yld.a(parcelEQ2, com.google.android.gms.droidguard.internal.DroidGuardInitReply.CREATOR);
                parcelEQ2.recycle();
                if (droidGuardInitReplyA == null) {
                    try {
                        android.os.Parcel parcelEP2 = aajaVar.eP();
                        parcelEP2.writeString(str);
                        aajaVar.eS(1, parcelEP2);
                    } catch (android.os.RemoteException e) {
                        throw defpackage.aaoo.s(e, "Failed on init() call");
                    }
                }
                aajk aajkVar = aajk.c;
                aajlVar.c(5, aajkVar);
                if (droidGuardInitReplyA != null) {
                    try {
                        akxm akxmVarJ = akxm.j(aagpVar.b, aajlVar);
                        android.os.Parcelable parcelable = droidGuardInitReplyA.b;
                        android.os.ParcelFileDescriptor parcelFileDescriptor = droidGuardInitReplyA.a;
                        if (parcelable != null && parcelFileDescriptor != null) {
                            try {
                                java.lang.String string = ((android.os.Bundle) parcelable).getString("h");
                                if (string == null) {
                                    throw new defpackage.aajg("Missing key");
                                }
                                aajh aajhVar = new aajh(string);
                                android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                                try {
                                    uzx uzxVarK = akxmVarJ.k(aajhVar, parcelable, autoCloseInputStream);
                                    aajlVar.c(10, aajkVar);
                                    try {
                                        java.lang.Object obj = uzxVarK.a;
                                        java.lang.Object objInvoke = obj.getClass().getDeclaredMethod("init", null).invoke(obj, null);
                                        defpackage.ahvr.bH(objInvoke);
                                        ((java.lang.Boolean) objInvoke).booleanValue();
                                        aajlVar.c(11, aajk.c);
                                        try {
                                            java.lang.Object obj2 = uzxVarK.a;
                                            obj2.getClass().getDeclaredMethod("close", null).invoke(obj2, null);
                                            aajlVar.c(12, aajk.c);
                                            autoCloseInputStream.close();
                                            parcelFileDescriptor.close();
                                            uzxVar = uzxVarK;
                                        } catch (java.lang.Exception e2) {
                                            throw new defpackage.aajg(e2);
                                        }
                                    } catch (java.lang.Exception e3) {
                                        throw new defpackage.aajg(e3);
                                    }
                                } catch (java.lang.Throwable th) {
                                    try {
                                        autoCloseInputStream.close();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                try {
                                    parcelFileDescriptor.close();
                                } catch (java.lang.Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } else if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                    } catch (defpackage.aajg | defpackage.aaji | java.io.IOException e4) {
                        throw defpackage.aaoo.r(e4, 8, "Failed to start the app-side VM process");
                    }
                }
                aajlVar.c(13, aajk.b);
                return new aajx(aajaVar, uzxVar);
            } catch (android.os.RemoteException e5) {
                throw defpackage.aaoo.s(e5, "Failed on initWithExtras() call");
            }
        } catch (android.os.RemoteException e6) {
            throw defpackage.aaoo.s(e6, "Failed to create DroidGuard handle");
        }
    }

    public static defpackage.ahbq l(java.util.concurrent.Executor executor) {
        return new defpackage.ahbq(executor, new defpackage.adbu());
    }

    public static final defpackage.ahbb m(defpackage.ahce ahceVar, java.lang.String str, defpackage.xtq xtqVar) {
        android.net.Uri uriA = defpackage.aewo.a(ahceVar.q);
        defpackage.aooh.f(str, "name");
        defpackage.aoin aoinVar = ahceVar.i;
        defpackage.ahbb ahbbVarA = ((defpackage.ahbc) aoinVar.a()).a(str);
        if (ahbbVarA == null) {
            throw new java.lang.IllegalArgumentException("No known flag " + str + ", known flags: " + ((defpackage.ahbc) aoinVar.a()).b());
        }
        java.lang.Boolean bool = null;
        java.lang.String strP = xtqVar.P(uriA, null, str);
        if (strP == null) {
            return ahbbVarA;
        }
        int i = ahbbVarA.g - 1;
        if (i == 0) {
            return defpackage.agab.aQ(java.lang.Long.parseLong(strP));
        }
        if (i == 1) {
            if (defpackage.aayn.c.matcher(strP).matches()) {
                bool = java.lang.Boolean.TRUE;
            } else if (defpackage.aayn.d.matcher(strP).matches()) {
                bool = java.lang.Boolean.FALSE;
            }
            return defpackage.agab.aO(bool != null ? bool.booleanValue() : ahbbVarA.e());
        }
        if (i == 2) {
            return defpackage.agab.aP(java.lang.Double.parseDouble(strP));
        }
        if (i == 3) {
            return defpackage.agab.aS(strP);
        }
        if (i == 4) {
            return new defpackage.ahbb(new ahca(strP, 1), 5, null, false);
        }
        try {
            ahcm ahcmVar = new ahcm(ahbbVarA, strP, 1, (byte[]) null);
            defpackage.albh albhVar = ahbbVarA.e;
            defpackage.aooh.c(albhVar);
            return defpackage.agab.aR(ahcmVar, albhVar);
        } catch (defpackage.alaz unused) {
            return ahbbVarA;
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Queue] */
    public static final defpackage.afhf n(java.lang.String str, defpackage.adnp adnpVar, defpackage.aogc aogcVar, defpackage.aonj aonjVar, defpackage.aonj aonjVar2) {
        defpackage.ajcr ajcrVar = new defpackage.ajcr(new defpackage.jio(aonjVar, aonjVar2, str, 8));
        adnpVar.c.add(ajcrVar);
        defpackage.ahax ahaxVar = defpackage.ahax.a;
        return defpackage.agab.cE(str, ajcrVar, defpackage.agab.be(ahaxVar.m()).u(), defpackage.akzq.a, new defpackage.aajr(adnpVar, 5), new defpackage.ahys(new defpackage.afhi(ahaxVar)), aogcVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized abai o(defpackage.aazd aazdVar) {
        java.lang.Object obj;
        ?? r0 = this.a;
        obj = r0.get(aazdVar);
        if (obj == null) {
            him himVar = ((hil) ((rai) this.c).a).a;
            abai abaiVar = new abai(aazdVar, (rai) himVar.lo.a(), new vaa((abbp) himVar.lp.a()), himVar.oj(), (defpackage.aosp) himVar.lr.a(), (defpackage.aosp) himVar.ls.a(), (abbx) himVar.lv.a(), j$.util.Optional.empty());
            r0.put(aazdVar, abaiVar);
            obj = abaiVar;
        }
        return (abai) obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final defpackage.ajcq a(java.lang.String str, defpackage.aexg aexgVar) throws java.io.IOException {
        int i;
        java.lang.String str2;
        defpackage.aooh.f(str, "mendelPackage");
        defpackage.aooh.f(aexgVar, "configuration");
        java.lang.Object obj = this.b.get(str);
        defpackage.aooh.c(obj);
        defpackage.ahce ahceVar = (defpackage.ahce) obj;
        defpackage.aooh.f(aexgVar, "configuration");
        java.lang.Object objA = ahceVar.i.a();
        defpackage.aooh.e(objA, "get(...)");
        defpackage.ahbc ahbcVar = (defpackage.ahbc) objA;
        defpackage.zzx zzxVarBe = defpackage.agab.be(defpackage.ahax.a.m());
        int i2 = ahceVar.a;
        defpackage.akzx akzxVar = (defpackage.akzx) zzxVarBe.a;
        akzxVar.u();
        defpackage.ahax ahaxVar = (defpackage.ahax) akzxVar.b;
        ahaxVar.b |= 8;
        ahaxVar.h = i2;
        int i3 = 4;
        if ((aexgVar.b & 2) != 0) {
            defpackage.akzc akzcVar = aexgVar.d;
            defpackage.aooh.e(akzcVar, "getExperimentToken(...)");
            defpackage.aooh.f(akzcVar, "value");
            akzxVar.u();
            defpackage.ahax ahaxVar2 = (defpackage.ahax) akzxVar.b;
            j$.util.Objects.requireNonNull(akzcVar);
            ahaxVar2.b |= 4;
            ahaxVar2.e = akzcVar;
        }
        java.lang.String str3 = aexgVar.c;
        defpackage.aooh.e(str3, "getSnapshotToken(...)");
        defpackage.aooh.f(str3, "value");
        akzxVar.u();
        defpackage.ahax ahaxVar3 = (defpackage.ahax) akzxVar.b;
        j$.util.Objects.requireNonNull(str3);
        ahaxVar3.b |= 2;
        ahaxVar3.d = str3;
        java.lang.String str4 = aexgVar.e;
        defpackage.aooh.e(str4, "getServerToken(...)");
        defpackage.aooh.f(str4, "value");
        akzxVar.u();
        defpackage.ahax ahaxVar4 = (defpackage.ahax) akzxVar.b;
        j$.util.Objects.requireNonNull(str4);
        ahaxVar4.b |= 1;
        ahaxVar4.c = str4;
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        akzxVar.u();
        defpackage.ahax ahaxVar5 = (defpackage.ahax) akzxVar.b;
        ahaxVar5.b |= 16;
        ahaxVar5.i = epochMilli;
        defpackage.alat<defpackage.aexh> alatVar = aexgVar.f;
        defpackage.aooh.e(alatVar, "getFlagList(...)");
        for (defpackage.aexh aexhVar : alatVar) {
            defpackage.ahbb ahbbVarA = ahbcVar.a(aexhVar.e);
            if (ahbbVarA != null) {
                if (aexhVar == null) {
                    defpackage.aooh.g();
                }
                int i4 = ahbbVarA.g;
                int i5 = i4 - 1;
                if (i5 == 0 ? defpackage.agab.as(aexhVar.c) != 1 : i5 == 1 ? defpackage.agab.as(aexhVar.c) != 2 : i5 == 2 ? defpackage.agab.as(aexhVar.c) != 3 : i5 == 3 ? defpackage.agab.as(aexhVar.c) != i3 : i5 == i3 ? defpackage.agab.as(aexhVar.c) != 5 : defpackage.agab.as(aexhVar.c) != 5) {
                    i = i3;
                    java.lang.String str5 = aexhVar.e;
                    int iAs = defpackage.agab.as(aexhVar.c);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Type mismatch for flag ");
                    sb.append(str5);
                    sb.append(". Expected ");
                    sb.append((java.lang.Object) defpackage.agab.aU(i4));
                    sb.append(", got ");
                    switch (iAs) {
                        case 1:
                            str2 = "LONG_VALUE";
                            break;
                        case 2:
                            str2 = "BOOL_VALUE";
                            break;
                        case 3:
                            str2 = "DOUBLE_VALUE";
                            break;
                        case 4:
                            str2 = "STRING_VALUE";
                            break;
                        case 5:
                            str2 = "BYTES_VALUE";
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            str2 = "VALUE_NOT_SET";
                            break;
                        default:
                            str2 = "null";
                            break;
                    }
                    sb.append((java.lang.Object) str2);
                    sb.append(". Falling back to default.");
                    android.util.Log.w("MendelPackageState", sb.toString());
                } else {
                    java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.ahax) akzxVar.b).f);
                    defpackage.aooh.e(listUnmodifiableList, "getFlagValueList(...)");
                    new defpackage.alct(listUnmodifiableList);
                    defpackage.akzx akzxVarM = defpackage.ahay.a.m();
                    defpackage.aooh.f(akzxVarM, "builder");
                    java.lang.String str6 = aexhVar.e;
                    defpackage.aooh.e(str6, "getName(...)");
                    defpackage.aooh.f(str6, "value");
                    akzxVarM.u();
                    defpackage.ahay ahayVar = (defpackage.ahay) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str6);
                    ahayVar.b |= 1;
                    ahayVar.e = str6;
                    if (i5 == 0) {
                        i = 4;
                        long jLongValue = aexhVar.c == 1 ? ((java.lang.Long) aexhVar.d).longValue() : 0L;
                        akzxVarM.u();
                        defpackage.ahay ahayVar2 = (defpackage.ahay) akzxVarM.b;
                        ahayVar2.c = 1;
                        ahayVar2.d = java.lang.Long.valueOf(jLongValue);
                    } else if (i5 == 1) {
                        i = 4;
                        boolean zBooleanValue = aexhVar.c == 2 ? ((java.lang.Boolean) aexhVar.d).booleanValue() : false;
                        akzxVarM.u();
                        defpackage.ahay ahayVar3 = (defpackage.ahay) akzxVarM.b;
                        ahayVar3.c = 2;
                        ahayVar3.d = java.lang.Boolean.valueOf(zBooleanValue);
                    } else if (i5 == 2) {
                        i = 4;
                        double dDoubleValue = aexhVar.c == 3 ? ((java.lang.Double) aexhVar.d).doubleValue() : 0.0d;
                        akzxVarM.u();
                        defpackage.ahay ahayVar4 = (defpackage.ahay) akzxVarM.b;
                        ahayVar4.c = 3;
                        ahayVar4.d = java.lang.Double.valueOf(dDoubleValue);
                    } else if (i5 != 3) {
                        if (i5 != 4) {
                            defpackage.akzc akzcVar2 = aexhVar.c == 5 ? (defpackage.akzc) aexhVar.d : defpackage.akzc.d;
                            defpackage.aooh.e(akzcVar2, "getBytesValue(...)");
                            defpackage.aooh.f(akzcVar2, "value");
                            akzxVarM.u();
                            defpackage.ahay ahayVar5 = (defpackage.ahay) akzxVarM.b;
                            j$.util.Objects.requireNonNull(akzcVar2);
                            ahayVar5.c = 6;
                            ahayVar5.d = akzcVar2;
                        } else {
                            defpackage.akzc akzcVar3 = aexhVar.c == 5 ? (defpackage.akzc) aexhVar.d : defpackage.akzc.d;
                            defpackage.aooh.e(akzcVar3, "getBytesValue(...)");
                            defpackage.aooh.f(akzcVar3, "value");
                            akzxVarM.u();
                            defpackage.ahay ahayVar6 = (defpackage.ahay) akzxVarM.b;
                            j$.util.Objects.requireNonNull(akzcVar3);
                            ahayVar6.c = 5;
                            ahayVar6.d = akzcVar3;
                        }
                        i = 4;
                    } else {
                        java.lang.String str7 = aexhVar.c == 4 ? (java.lang.String) aexhVar.d : "";
                        defpackage.aooh.e(str7, "getStringValue(...)");
                        defpackage.aooh.f(str7, "value");
                        akzxVarM.u();
                        defpackage.ahay ahayVar7 = (defpackage.ahay) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str7);
                        i = 4;
                        ahayVar7.c = 4;
                        ahayVar7.d = str7;
                    }
                    defpackage.alad aladVarR = akzxVarM.r();
                    defpackage.aooh.e(aladVarR, "build(...)");
                    defpackage.ahay ahayVar8 = (defpackage.ahay) aladVarR;
                    defpackage.aooh.f(ahayVar8, "value");
                    akzxVar.u();
                    defpackage.ahax ahaxVar6 = (defpackage.ahax) akzxVar.b;
                    j$.util.Objects.requireNonNull(ahayVar8);
                    defpackage.alat alatVar2 = ahaxVar6.f;
                    if (!alatVar2.c()) {
                        ahaxVar6.f = defpackage.alad.J(alatVar2);
                    }
                    ahaxVar6.f.add(ahayVar8);
                }
                i3 = i;
            }
        }
        java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.ahax) akzxVar.b).g);
        defpackage.aooh.e(listUnmodifiableList2, "getDeleteFlagList(...)");
        new defpackage.alct(listUnmodifiableList2);
        defpackage.alat alatVar3 = aexgVar.g;
        defpackage.aooh.e(alatVar3, "getDeleteFlagList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : alatVar3) {
            if (ahbcVar.b.containsKey((java.lang.String) obj2)) {
                arrayList.add(obj2);
            }
        }
        akzxVar.u();
        defpackage.ahax ahaxVar7 = (defpackage.ahax) akzxVar.b;
        defpackage.alat alatVar4 = ahaxVar7.g;
        if (!alatVar4.c()) {
            ahaxVar7.g = defpackage.alad.J(alatVar4);
        }
        defpackage.akyl.i(arrayList, ahaxVar7.g);
        defpackage.ahax ahaxVarU = zzxVarBe.u();
        try {
            defpackage.aigf aigfVarC = ahceVar.c(ahaxVarU);
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1353, "Updating flags from broadcast for: ".concat(java.lang.String.valueOf(ahceVar.q)));
            try {
                defpackage.ajcq ajcqVarB = ahceVar.u.b(ahceVar.b, new defpackage.lkf(ahceVar, ahaxVarU, 10, null));
                ahoqVarZ.a(ajcqVarB);
                defpackage.ajsz.ak(ahoqVarZ, null);
                return defpackage.ajan.g(ajcqVarB, defpackage.ahqx.c(new defpackage.accg(ahceVar, ahaxVarU, aigfVarC, 6, null)), ahceVar.j);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(ahoqVarZ, th);
                    throw th2;
                }
            }
        } catch (defpackage.alaz e) {
            return defpackage.aiql.y(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aelx, java.lang.Object] */
    public final defpackage.ajcq b(defpackage.ahyc ahycVar) {
        return defpackage.ahvr.I(this.d.a(), new defpackage.adpx(this, ahycVar, 4), defpackage.ajbm.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0149 A[Catch: ajdl | MdiOwnersLoader$MdiException -> 0x017e, MdiOwnersLoader$MdiException -> 0x0180, all -> 0x01d8, PHI: r4
      0x0149: PHI (r4v12 int) = (r4v11 int), (r4v13 int) binds: [B:64:0x013f, B:66:0x0142] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x01d8, blocks: (B:3:0x000d, B:4:0x0019, B:6:0x001f, B:17:0x0061, B:18:0x0065, B:20:0x0069, B:21:0x0070, B:23:0x0078, B:24:0x0081, B:26:0x008d, B:27:0x008f, B:29:0x0097, B:31:0x00c4, B:33:0x00c9, B:35:0x00da, B:37:0x00df, B:36:0x00dd, B:32:0x00c7, B:38:0x00e2, B:40:0x00ea, B:42:0x00f9, B:44:0x00fd, B:46:0x0103, B:48:0x0107, B:50:0x010d, B:51:0x010f, B:52:0x0111, B:54:0x0117, B:56:0x011b, B:57:0x0120, B:58:0x0124, B:60:0x012c, B:67:0x0144, B:68:0x0149, B:69:0x014d, B:71:0x0152, B:73:0x015a, B:75:0x015e, B:76:0x0163, B:77:0x0164, B:78:0x0168, B:79:0x0169, B:80:0x0170, B:82:0x0172, B:83:0x017d, B:9:0x0030, B:13:0x0047, B:15:0x0056, B:16:0x0059, B:87:0x0181, B:89:0x0193, B:93:0x01a5, B:94:0x01af, B:95:0x01b0, B:96:0x01ba, B:97:0x01bb), top: B:105:0x000d }] */
    public final void c(defpackage.aemc aemcVar, defpackage.ajcq ajcqVar) {
        boolean z;
        defpackage.ahvr.bY(ajcqVar.isDone());
        java.lang.String strM = "OK";
        try {
            try {
                int i = defpackage.ajcj.a;
                int i2 = defpackage.ajci.a;
                java.util.Iterator it = defpackage.ajch.b.iterator();
                do {
                    if (!it.hasNext()) {
                        defpackage.ahvr.bR(!java.lang.RuntimeException.class.isAssignableFrom(com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException.class), "Futures.getChecked exception type (%s) must not be a RuntimeException", com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException.class);
                        try {
                            defpackage.ajcj.a(com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException.class, new java.lang.Exception());
                            z = true;
                        } catch (java.lang.Throwable unused) {
                            z = false;
                        }
                        defpackage.ahvr.bR(z, "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException.class);
                        java.util.Set set = defpackage.ajch.b;
                        if (set.size() > 1000) {
                            set.clear();
                        }
                        set.add(new java.lang.ref.WeakReference(com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException.class));
                        break;
                    }
                } while (!com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException.class.equals(((java.lang.ref.WeakReference) it.next()).get()));
                try {
                    defpackage.akof akofVar = (defpackage.akof) ajcqVar.get();
                    if (akofVar == null) {
                        strM = "Absent";
                        aemcVar.e(false);
                    } else if (akofVar.b.size() <= 0) {
                        android.util.Log.w("OneGoogle", "GetPeopleResponse contains no persons");
                        strM = "NoPerson";
                    } else {
                        defpackage.agml agmlVar = ((defpackage.akog) akofVar.b.get(0)).b;
                        if (agmlVar == null) {
                            agmlVar = defpackage.agml.a;
                        }
                        if (agmlVar.b.size() > 0) {
                            defpackage.agmp agmpVar = (defpackage.agmp) agmlVar.b.get(0);
                            aemcVar.d = agmpVar.c;
                            defpackage.alak alakVar = agmpVar.d;
                            defpackage.alal alalVar = defpackage.agmp.a;
                            aemcVar.d(new defpackage.alam(alakVar, alalVar).contains(defpackage.agmn.GOOGLE_ONE_USER));
                            aemcVar.e = new defpackage.alam(agmpVar.d, alalVar).contains(defpackage.agmn.GOOGLE_FAMILY_CHILD_USER) ? defpackage.aemd.b : defpackage.aemd.c;
                            aemcVar.c(new defpackage.alam(agmpVar.d, alalVar).contains(defpackage.agmn.GOOGLE_APPS_USER) ? defpackage.aemd.b : defpackage.aemd.c);
                        }
                        if (agmlVar.c.size() > 0) {
                            defpackage.agmk agmkVar = (defpackage.agmk) agmlVar.c.get(0);
                            int i3 = agmkVar.b;
                            aemcVar.a = (i3 & 2) != 0 ? agmkVar.c : null;
                            aemcVar.b = (i3 & 64) != 0 ? agmkVar.d : null;
                            aemcVar.c = (i3 & 128) != 0 ? agmkVar.e : null;
                        }
                        defpackage.agmo agmoVarC = defpackage.abrz.C(akofVar);
                        if (agmoVarC != null) {
                            if (agmoVarC.e) {
                                aemcVar.g = agmoVarC.d;
                            } else {
                                aemcVar.f = agmoVarC.d;
                            }
                        }
                        if (agmlVar.e.size() == 1) {
                            int iA = defpackage.agmi.a(((defpackage.agmj) agmlVar.e.get(0)).b);
                            if (iA == 0 || iA == 1) {
                                aemcVar.h = 1;
                            } else {
                                int i4 = 2;
                                if (iA != 2) {
                                    i4 = 4;
                                    if (iA == 4) {
                                        aemcVar.h = 3;
                                    } else {
                                        aemcVar.h = i4;
                                    }
                                } else {
                                    aemcVar.h = i4;
                                }
                            }
                        }
                    }
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                    throw defpackage.ajcj.a(com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException.class, e);
                } catch (java.util.concurrent.ExecutionException e2) {
                    java.lang.Throwable cause = e2.getCause();
                    if (cause instanceof java.lang.Error) {
                        throw new ajbo((java.lang.Error) cause);
                    }
                    if (!(cause instanceof java.lang.RuntimeException)) {
                        throw defpackage.ajcj.a(com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException.class, cause);
                    }
                    throw new defpackage.ajdl(cause);
                }
            } catch (java.lang.Throwable th) {
                ((defpackage.adai) ((defpackage.ahys) this.a).a).d("OK", (java.lang.String) this.b);
                throw th;
            }
        } catch (defpackage.ajdl | com.google.android.libraries.onegoogle.owners.mdi.MdiOwnersLoader$MdiException e3) {
            java.lang.Throwable cause2 = e3.getCause();
            strM = defpackage.aehj.m(cause2);
            defpackage.aacw aacwVar = (defpackage.aacw) defpackage.aehj.n(cause2, defpackage.aacw.class);
            if (aacwVar != null) {
                int iA2 = aacwVar.a();
                strM = defpackage.a.bj(iA2, "ApiException-");
                if (iA2 == 17) {
                    throw new java.util.concurrent.ExecutionException((java.lang.Throwable) new com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException.ApiNotConnectedException(cause2));
                }
                if (iA2 == 10) {
                    throw new java.util.concurrent.ExecutionException((java.lang.Throwable) new com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException.DeveloperErrorException(cause2));
                }
            }
            android.util.Log.w("OneGoogle", java.lang.String.format("Failed to load profile data. exception: %s", strM));
        }
        ((defpackage.adai) ((defpackage.ahys) this.a).a).d(strM, (java.lang.String) this.b);
    }

    public final com.google.android.libraries.micore.superpacks.SuperpackManifest d(java.lang.String str, int i) {
        java.lang.String strD = defpackage.adho.d(str, i);
        int i2 = defpackage.adhw.c;
        java.io.File fileF = ((defpackage.adjz) this.d).f(new defpackage.adhb((java.lang.String) this.a, strD));
        if (fileF.isDirectory()) {
            java.util.List listD = defpackage.adhk.d(fileF);
            if (listD.isEmpty()) {
                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/FileManifestStore", "getManifest", 90, "FileManifestStore.java")).v("Got a compressed manifest but no files after uncompressing");
                return null;
            }
            if (listD.size() > 1) {
                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.d()).l("com/google/android/libraries/micore/superpacks/FileManifestStore", "getManifest", 85, "FileManifestStore.java")).v("Unexpectedly got more than one file after uncompressing a manifest");
                return null;
            }
            fileF = (java.io.File) listD.get(0);
        }
        return ((defpackage.aogc) this.c).aj(str, i, fileF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq e(java.lang.String str, defpackage.ajcq ajcqVar) {
        int i = defpackage.adbe.a;
        return ((defpackage.tvn) this.d).af(new defpackage.vto(this, str, ajcqVar, 6, (char[]) null), this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq f(java.lang.String str) {
        int i = defpackage.adbe.a;
        return ((defpackage.tvn) this.d).ae(new wzc(this, str, 16), this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq g(java.lang.String str) {
        int i = defpackage.adbe.a;
        return ((defpackage.tvn) this.d).ae(new wzc(this, str, 17), this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq h(java.lang.String str) {
        int i = defpackage.adbe.a;
        return ((defpackage.tvn) this.d).af(new adck(this, str, 1, (byte[]) null), this.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) throws java.lang.Throwable {
        abab ababVar;
        if (aolnVar instanceof abab) {
            ababVar = (abab) aolnVar;
            int i = ababVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ababVar.b = i - Integer.MIN_VALUE;
            } else {
                ababVar = new abab(this, aolnVar);
            }
        } else {
            ababVar = new abab(this, aolnVar);
        }
        java.lang.Object obj = ababVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = ababVar.b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abai abaiVar = ababVar.c;
            defpackage.aooc.af(obj);
            return abaiVar;
        }
        defpackage.aooc.af(obj);
        defpackage.aooh.f(str, "role");
        java.lang.String packageName = ((android.content.Context) this.d).getPackageName();
        defpackage.aooh.e(packageName, "getPackageName(...)");
        abai abaiVarO = o(new defpackage.aazd(packageName, str, str2));
        ababVar.c = abaiVarO;
        ababVar.b = 1;
        java.lang.Object objM = defpackage.aosv.m(new abag(abaiVarO, (defpackage.aoln) null), ababVar);
        if (objM != obj2) {
            objM = defpackage.aojh.a;
        }
        return objM != obj2 ? abaiVarO : obj2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ajct, java.lang.Object] */
    public final defpackage.aazt j() {
        java.lang.String packageName = ((android.content.Context) this.d).getPackageName();
        defpackage.aooh.e(packageName, "getPackageName(...)");
        return new defpackage.aazt(packageName, this.a, (defpackage.aazz) this.c, (defpackage.ahyn) this.b);
    }

    public ahbq(defpackage.ahyn ahynVar, defpackage.aify aifyVar, defpackage.aify aifyVar2, defpackage.ahcc ahccVar) {
        this.d = ahynVar;
        this.b = aifyVar;
        this.a = aifyVar2;
        this.c = ahccVar;
    }

    public ahbq(android.content.Context context, defpackage.ajct ajctVar, defpackage.aazz aazzVar, defpackage.ahyn ahynVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(ajctVar, "executor");
        this.d = context;
        this.a = ajctVar;
        this.c = aazzVar;
        this.b = ahynVar;
    }

    public ahbq(defpackage.gat gatVar, java.util.concurrent.Executor executor, defpackage.aaju aajuVar, defpackage.aiyy aiyyVar) {
        this.a = gatVar;
        this.c = executor;
        this.b = aajuVar;
        this.d = aiyyVar;
    }

    public ahbq(java.lang.String str, defpackage.ajct ajctVar, defpackage.aduj adujVar, defpackage.amwu amwuVar) {
        this.a = str;
        this.b = amwuVar;
        this.d = ajctVar;
        this.c = adujVar;
    }

    public ahbq(defpackage.acyu acyuVar, defpackage.acyv acyvVar, defpackage.adba adbaVar, java.util.concurrent.Executor executor) {
        this.a = acyuVar;
        this.d = acyvVar;
        this.b = adbaVar;
        this.c = executor;
    }

    public ahbq(android.content.Context context, rai raiVar, rai raiVar2) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (raiVar == null) {
            defpackage.aooh.i("moiraiApiFactory");
        }
        if (raiVar2 == null) {
            defpackage.aooh.i("downloadManagerFactory");
        }
        this.d = context;
        this.c = raiVar;
        this.b = raiVar2;
        this.a = new java.util.LinkedHashMap();
    }

    public ahbq(java.util.concurrent.Executor executor, defpackage.adbv adbvVar) {
        this.d = new defpackage.tvn((byte[]) null, (byte[]) null);
        this.b = new java.util.HashMap();
        this.c = executor;
        this.a = adbvVar;
    }

    public ahbq(defpackage.adjz adjzVar, defpackage.aogc aogcVar) {
        this.b = new java.util.concurrent.locks.ReentrantLock();
        this.d = adjzVar;
        this.c = aogcVar;
        this.a = "manifests";
    }

    public ahbq(java.lang.Object obj, abwl abwlVar) {
        int iB = abxl.b(abwlVar);
        if (iB == 0) {
            java.util.Map mapAM = defpackage.ajsz.aM(new defpackage.aoiu(obj, abwlVar));
            this.b = mapAM;
            defpackage.aokd aokdVar = defpackage.aokd.a;
            this.a = aokdVar;
            this.d = aokdVar;
            this.c = mapAM;
            return;
        }
        if (iB == 1) {
            defpackage.aokd aokdVar2 = defpackage.aokd.a;
            this.b = aokdVar2;
            java.util.Map mapAM2 = defpackage.ajsz.aM(new defpackage.aoiu(obj, abwlVar));
            this.a = mapAM2;
            this.d = aokdVar2;
            this.c = mapAM2;
            return;
        }
        if (iB == 2) {
            defpackage.aokd aokdVar3 = defpackage.aokd.a;
            this.b = aokdVar3;
            this.a = aokdVar3;
            java.util.Map mapAM3 = defpackage.ajsz.aM(new defpackage.aoiu(obj, abwlVar));
            this.d = mapAM3;
            this.c = mapAM3;
            return;
        }
        throw new defpackage.aois();
    }

    public ahbq(android.content.Context context, defpackage.adak adakVar, defpackage.aelx aelxVar, defpackage.ahyn ahynVar) {
        this.c = adakVar;
        this.d = aelxVar;
        this.a = ahynVar;
        this.b = context.getPackageName();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public ahbq(java.util.Map map) {
        this.c = map;
        this.b = new java.util.LinkedHashMap();
        this.a = new java.util.LinkedHashMap();
        this.d = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            abwl abwlVar = (abwl) entry.getValue();
            int iB = abxl.b(abwlVar);
            if (iB == 0) {
                this.b.put(key, abwlVar);
            } else if (iB == 1) {
                this.a.put(key, abwlVar);
            } else if (iB == 2) {
                this.d.put(key, abwlVar);
            } else {
                throw new defpackage.aois();
            }
        }
    }
}
