package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kcq {
    public kcq(defpackage.ojo ojoVar, defpackage.apni apniVar, defpackage.aolr aolrVar, defpackage.aoss aossVar, defpackage.aoin aoinVar) {
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("activityRetainedCoroutineScope");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("debounceTimeoutMillis");
        }
        new defpackage.ahda((byte[]) null);
    }

    public static final defpackage.isq A(itc itcVar) {
        defpackage.akzx akzxVarM = defpackage.isq.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        defpackage.isq isqVar = (defpackage.isq) akzxVarM.b;
        java.lang.String str = itcVar.h;
        if (str == null) {
            str = "";
        }
        j$.util.Objects.requireNonNull(str);
        isqVar.b |= 1;
        isqVar.c = str;
        java.lang.String str2 = itcVar.c;
        if (str2 != null) {
            akzxVarM.u();
            defpackage.isq isqVar2 = (defpackage.isq) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            isqVar2.b |= 2;
            isqVar2.d = str2;
        }
        java.lang.String str3 = itcVar.d;
        if (str3 != null) {
            akzxVarM.u();
            defpackage.isq isqVar3 = (defpackage.isq) akzxVarM.b;
            j$.util.Objects.requireNonNull(str3);
            isqVar3.b |= 4;
            isqVar3.e = str3;
        }
        java.lang.String str4 = itcVar.f;
        if (str4 != null) {
            akzxVarM.u();
            defpackage.isq isqVar4 = (defpackage.isq) akzxVarM.b;
            j$.util.Objects.requireNonNull(str4);
            isqVar4.b |= 8;
            isqVar4.f = str4;
        }
        itp itpVar = itcVar.b;
        if (itpVar != null) {
            ni niVarW = hgz.W(kor.a.m());
            j$.util.Objects.checkIndex(0, 4);
            if (itpVar instanceof itp) {
                niVarW.z(itpVar.a);
            } else if (itpVar instanceof itx) {
                niVarW.B(hgu.J(koq.a.m()).w());
            } else {
                if (!(itpVar instanceof itu)) {
                    throw new defpackage.aois();
                }
                niVarW.A(hgu.K(kop.a.m()).x());
            }
            kor korVarY = niVarW.y();
            defpackage.aooh.f(korVarY, "value");
            akzxVarM.u();
            defpackage.isq isqVar5 = (defpackage.isq) akzxVarM.b;
            j$.util.Objects.requireNonNull(korVarY);
            isqVar5.g = korVarY;
            isqVar5.b |= 16;
        }
        itt ittVar = itcVar.l;
        if (ittVar != null) {
            hgz.q(V(ittVar), akzxVarM);
            hgz.p(4, akzxVarM);
        }
        itt ittVar2 = itcVar.k;
        if (ittVar2 != null) {
            hgz.q(V(ittVar2), akzxVarM);
            hgz.p(3, akzxVarM);
        }
        boolean z = itcVar.m;
        akzxVarM.u();
        defpackage.isq isqVar6 = (defpackage.isq) akzxVarM.b;
        isqVar6.b |= 64;
        isqVar6.i = z;
        boolean z2 = itcVar.n;
        akzxVarM.u();
        defpackage.isq isqVar7 = (defpackage.isq) akzxVarM.b;
        isqVar7.b |= 256;
        isqVar7.k = z2;
        defpackage.alad aladVarR = akzxVarM.r();
        defpackage.aooh.e(aladVarR, "build(...)");
        return (defpackage.isq) aladVarR;
    }

    public static final defpackage.isq B(itc itcVar) {
        if (itcVar != null) {
            return A(itcVar);
        }
        return null;
    }

    public static /* synthetic */ boolean C(defpackage.iqm iqmVar) {
        return iqmVar.b() || iqmVar.c();
    }

    public static defpackage.iqk D(defpackage.iqe iqeVar, defpackage.iot iotVar, defpackage.iqf iqfVar, defpackage.iqj iqjVar) {
        return iqeVar.a(defpackage.zcr.e, iotVar, iqfVar, iqjVar);
    }

    public static final /* synthetic */ defpackage.ipc E(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    public static final /* synthetic */ defpackage.ipc F(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    public static final /* synthetic */ defpackage.ipc G(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    public static final /* synthetic */ defpackage.kaw H(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new defpackage.kaw(akzxVar);
    }

    public static final boolean I(android.media.AudioDeviceInfo audioDeviceInfo) {
        return audioDeviceInfo.isSink() && defpackage.iep.b.contains(java.lang.Integer.valueOf(audioDeviceInfo.getType()));
    }

    public static final int J(android.media.AudioDeviceInfo audioDeviceInfo) {
        java.lang.Integer num = (java.lang.Integer) defpackage.iep.c.get(java.lang.Integer.valueOf(audioDeviceInfo.getType()));
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public static final java.util.Locale K(java.util.Map map, java.lang.String str) {
        if (map == null) {
            defpackage.aooh.i("memoizedMap");
        }
        defpackage.aimz aimzVar = defpackage.hyt.a;
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/audio/audioinjector/localeprovider/TtsLocaleProvider$Companion", "getSupportedLocaleFromCountryCode", 78, "TtsLocaleProvider.kt")).I("checking whether country %s is supported by %s for start/end audio", str, "TTS");
        if (str == null) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).i(defpackage.zct.b)).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/audio/audioinjector/localeprovider/TtsLocaleProvider$Companion", "getSupportedLocaleFromCountryCode", 84, "TtsLocaleProvider.kt")).v("null countryCode");
            return null;
        }
        java.lang.String strQ = defpackage.ahvr.q(str);
        defpackage.aooh.e(strQ, "toUpperCase(...)");
        java.lang.String str2 = (java.lang.String) map.get(strQ);
        if (str2 == null) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/audio/audioinjector/localeprovider/TtsLocaleProvider$Companion", "getSupportedLocaleFromCountryCode", 89, "TtsLocaleProvider.kt")).I("country %s not supported by %s", str, "TTS");
            return null;
        }
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
        defpackage.aooh.e(localeForLanguageTag, "forLanguageTag(...)");
        try {
            java.lang.String iSO3Language = localeForLanguageTag.getISO3Language();
            if (iSO3Language == null) {
                defpackage.aooh.g();
            }
            if (android.text.TextUtils.isEmpty(iSO3Language)) {
                ((defpackage.aimw) ((defpackage.aimw) defpackage.hyt.a.d()).i(defpackage.zct.b).l("com/android/dialer/audio/audioinjector/localeprovider/TtsLocaleProvider$Companion", "getSupportedLocaleFromCountryCode", 108, "TtsLocaleProvider.kt")).y("no iso3 language for languageCode: %s", str2);
                return null;
            }
            ((defpackage.aimw) defpackage.hyt.a.b().l("com/android/dialer/audio/audioinjector/localeprovider/TtsLocaleProvider$Companion", "getSupportedLocaleFromCountryCode", 111, "TtsLocaleProvider.kt")).I("country %s start/end audio supported by %s", str, "TTS");
            return localeForLanguageTag;
        } catch (java.util.MissingResourceException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.hyt.a.d()).i(defpackage.zct.b)).k(e).l("com/android/dialer/audio/audioinjector/localeprovider/TtsLocaleProvider$Companion", "getSupportedLocaleFromCountryCode", 101, "TtsLocaleProvider.kt")).y("missing resource for languageCode: %s", str2);
            return null;
        }
    }

    public static final /* synthetic */ defpackage.ipc L(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    public static final androidx.car.app.model.CarIcon M(android.content.Context context, abwd abwdVar, int i, int i2) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(abwdVar, "photoInfo");
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("content");
        builder.authority("com.google.android.dialer.cariconprovider");
        builder.appendQueryParameter("photoThumbnailUri", abwdVar.e);
        builder.appendQueryParameter("photoId", java.lang.String.valueOf(abwdVar.f));
        builder.appendQueryParameter("name", abwdVar.c);
        builder.appendQueryParameter("lookupUri", abwdVar.g);
        builder.appendQueryParameter("formattedNumber", abwdVar.d);
        builder.appendQueryParameter("isSpam", java.lang.String.valueOf(abwdVar.k));
        builder.appendQueryParameter("width", java.lang.String.valueOf(i));
        builder.appendQueryParameter("height", java.lang.String.valueOf(i2));
        android.net.Uri uriBuild = builder.build();
        context.grantUriPermission("com.google.android.projection.gearhead", uriBuild, 1);
        defpackage.dzk.z(uriBuild);
        java.lang.String string = uriBuild.toString();
        defpackage.dzk.z(string);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(4);
        iconCompat.c = string;
        return new androidx.car.app.model.CarIcon(new wj(iconCompat));
    }

    public static final int[] N(android.net.NetworkRequest networkRequest) {
        if (networkRequest == null) {
            defpackage.aooh.i("<this>");
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            if (networkRequest == null) {
                defpackage.aooh.i("request");
            }
            int[] iArrM$1 = mp$.ExternalSyntheticApiModelOutline0.m$1(networkRequest);
            defpackage.aooh.e(iArrM$1, "getCapabilities(...)");
            return iArrM$1;
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            int[] iArr2 = defpackage.gye.a;
            if (networkRequest == null) {
                defpackage.aooh.i("request");
            }
            if (ft$.ExternalSyntheticApiModelOutline0.m$1(networkRequest, i2)) {
                arrayList.add(java.lang.Integer.valueOf(i2));
            }
        }
        return defpackage.ajsz.cm(arrayList);
    }

    public static final void O(androidx.work.impl.WorkDatabase workDatabase, int i) {
        workDatabase.y().b(new defpackage.gwr("next_job_scheduler_id", java.lang.Long.valueOf(i)));
    }

    public static final /* synthetic */ defpackage.ipc P(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    public static final /* synthetic */ defpackage.ipc Q(defpackage.akzx akzxVar) {
        if (akzxVar == null) {
            defpackage.aooh.i("builder");
        }
        return new defpackage.ipc(akzxVar, (byte[]) null);
    }

    public static final defpackage.rsr R(java.util.List list) {
        defpackage.aooh.f(list, "ids");
        defpackage.kaw kawVar = new defpackage.kaw("_id");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
        }
        return kawVar.aF(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object S(defpackage.rsr rsrVar, defpackage.aoln aolnVar) {
        defpackage.kdz kdzVar;
        if (aolnVar instanceof defpackage.kdz) {
            kdzVar = (defpackage.kdz) aolnVar;
            int i = kdzVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kdzVar.b = i - Integer.MIN_VALUE;
            } else {
                kdzVar = new defpackage.kdz(aolnVar);
            }
        } else {
            kdzVar = new defpackage.kdz(aolnVar);
        }
        java.lang.Object objAe = kdzVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = kdzVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAe);
            kdzVar.b = 1;
            objAe = rsrVar.ae(kdzVar);
            if (objAe == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAe);
        }
        return ((java.util.Map) objAe).values();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object T(defpackage.rsr rsrVar, defpackage.aoln aolnVar) {
        defpackage.kea keaVar;
        if (aolnVar instanceof defpackage.kea) {
            keaVar = (defpackage.kea) aolnVar;
            int i = keaVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                keaVar.b = i - Integer.MIN_VALUE;
            } else {
                keaVar = new defpackage.kea(aolnVar);
            }
        } else {
            keaVar = new defpackage.kea(aolnVar);
        }
        java.lang.Object objAe = keaVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = keaVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAe);
            keaVar.b = 1;
            objAe = rsrVar.ae(keaVar);
            if (objAe == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAe);
        }
        return ((java.util.Map) objAe).keySet();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object U(defpackage.rsr rsrVar, defpackage.aoln aolnVar) {
        keb kebVar;
        if (aolnVar instanceof keb) {
            kebVar = (keb) aolnVar;
            int i = kebVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kebVar.b = i - Integer.MIN_VALUE;
            } else {
                kebVar = new keb(aolnVar);
            }
        } else {
            kebVar = new keb(aolnVar);
        }
        java.lang.Object objAe = kebVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kebVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAe);
            kebVar.b = 1;
            objAe = rsrVar.ae(kebVar);
            if (objAe == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAe);
        }
        return java.lang.Boolean.valueOf(((java.util.Map) objAe).isEmpty());
    }

    private static final int V(itt ittVar) {
        int iV = defpackage.a.v(ittVar);
        if (iV != 0) {
            if (iV == 1) {
                return ((itv) ittVar).a + (-1) != 1 ? 8 : 7;
            }
            if (iV == 2) {
                return 6;
            }
            throw new defpackage.aois();
        }
        int i = ((its) ittVar).a - 1;
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 3 : 4;
        }
        return 5;
    }

    public static final android.app.Activity a(android.content.Context context) {
        while (true) {
            j$.util.Objects.checkIndex(0, 3);
            if (context != null) {
                if (!(context instanceof android.app.Activity)) {
                    if (!(context instanceof android.content.ContextWrapper)) {
                        break;
                    }
                    context = ((android.content.ContextWrapper) context).getBaseContext();
                    defpackage.aooh.e(context, "getBaseContext(...)");
                } else {
                    return (android.app.Activity) context;
                }
            } else {
                break;
            }
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(context, "Context ", " is not an Activity"));
    }

    public static final void b(final defpackage.kkh kkhVar, boolean z, defpackage.cav cavVar, final int i) {
        int i2;
        final boolean z2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1776495537);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(kkhVar) : cavVarB.D(kkhVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.kkk kkkVar = kkhVar.b;
            defpackage.ayt aytVar = new defpackage.ayt(0.0f, 0.0f, 0.0f, 8.0f, true);
            defpackage.kkd kkdVar = kkhVar.a;
            z2 = z;
            defpackage.gus.aL(kkkVar, z2, aytVar.a(new defpackage.dgg("integration_".concat(kkdVar.b()))), kkdVar, cavVarB, i2 & 112);
        } else {
            z2 = z;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: kcm
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    defpackage.kkh kkhVar2 = kkhVar;
                    int i6 = 613566756 & i4;
                    boolean z3 = z2;
                    defpackage.kcq.b(kkhVar2, z3, (defpackage.cav) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 << 1) & i6));
                    return defpackage.aojh.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v9, types: [aoln, emq] */
    public static final void c(defpackage.cmw cmwVar, final defpackage.ayy ayyVar, defpackage.ayy ayyVar2, defpackage.jzu jzuVar, defpackage.aonj aonjVar, defpackage.cav cavVar, final int i) {
        defpackage.cav cavVar2;
        final defpackage.cmw cmwVar2;
        final defpackage.ayy ayyVar3;
        final defpackage.jzu jzuVar2;
        final defpackage.aonj aonjVar2;
        int i2;
        defpackage.cmw cmwVar3;
        defpackage.jzu jzuVar3;
        defpackage.ayy ayyVar4;
        defpackage.aonj aonjVar3;
        defpackage.gat gatVar;
        defpackage.cav cavVarB = cavVar.b(481174143);
        int i3 = i | 6;
        defpackage.ayy ayyVar5 = ayyVar;
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(ayyVar5) ? 16 : 32;
        }
        int i4 = i3 | 384;
        if ((i & 3072) == 0) {
            i4 = i3 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if (cavVarB.H((i4 & 9363) != 9362, i4 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.String str = null;
            ?? r3 = 0;
            java.lang.String str2 = null;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                defpackage.cmt cmtVar = defpackage.cmw.c;
                defpackage.ayy ayyVar6 = defpackage.ayx.a;
                defpackage.cbd cbdVar = defpackage.eov.a;
                defpackage.eoi eoiVar = (defpackage.eoi) cavVarB.e(defpackage.eov.a);
                if (eoiVar == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                defpackage.eoe eoeVarM = defpackage.dzo.m(eoiVar);
                android.content.Context baseContext = (android.content.Context) cavVarB.e(defpackage.dep.b);
                boolean zB = cavVarB.B(baseContext) | cavVarB.B(eoeVarM);
                java.lang.Object objR = cbtVar.R();
                if (zB || objR == defpackage.cau.a) {
                    if (baseContext == null) {
                        defpackage.aooh.i("context");
                    }
                    if (eoeVarM == null) {
                        defpackage.aooh.i("delegateFactory");
                    }
                    while (true) {
                        if (!(baseContext instanceof android.content.ContextWrapper)) {
                            java.util.Objects.toString(baseContext);
                            throw new java.lang.IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: ".concat(java.lang.String.valueOf(baseContext)));
                        }
                        if (baseContext instanceof defpackage.mp) {
                            defpackage.amxe amxeVar = (defpackage.amxe) defpackage.aooc.ar((defpackage.mp) baseContext, defpackage.amxe.class);
                            objR = new defpackage.amxg(amxeVar.f(), eoeVarM, amxeVar.h());
                            cbtVar.ab(objR);
                            str2 = str;
                            break;
                        }
                        baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
                        defpackage.aooh.e(baseContext, "getBaseContext(...)");
                        ayyVar5 = ayyVar;
                        str = str;
                        cmtVar = cmtVar;
                        cavVarB = cavVarB;
                    }
                }
                i2 = i4 & (-64513);
                defpackage.eoq eoqVarN = defpackage.dzo.n(eoiVar);
                defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
                defpackage.jzu jzuVar4 = (defpackage.jzu) defpackage.dzl.m(new defpackage.aooa(defpackage.jzu.class), eoiVar, str2, (defpackage.eoe) objR, eoqVarN);
                cmwVar3 = cmtVar;
                jzuVar3 = jzuVar4;
                ayyVar4 = ayyVar6;
                aonjVar3 = jzuVar4.g;
                r3 = str2;
            } else {
                i2 = i4 & (-64513);
                cavVarB.s();
                cmwVar3 = cmwVar;
                ayyVar4 = ayyVar2;
                jzuVar3 = jzuVar;
                aonjVar3 = aonjVar;
            }
            cavVarB.l();
            defpackage.gab gabVar = defpackage.gdu.a;
            defpackage.aols aolsVar = defpackage.aols.a;
            defpackage.aoxh aoxhVar = jzuVar3.b;
            boolean zB2 = cavVarB.B(aoxhVar);
            java.lang.Object objR2 = cbtVar.R();
            if (zB2 || objR2 == defpackage.cau.a) {
                objR2 = new defpackage.gat(aoxhVar);
                cbtVar.ab(objR2);
            }
            defpackage.gat gatVar2 = (defpackage.gat) objR2;
            boolean zD = cavVarB.D(aolsVar) | cavVarB.D(gatVar2);
            java.lang.Object objR3 = cbtVar.R();
            if (zD || objR3 == defpackage.cau.a) {
                objR3 = new defpackage.bur(aolsVar, gatVar2, (defpackage.aoln) r3, 9);
                cbtVar.ab(objR3);
            }
            defpackage.cbp.g(gatVar2, (defpackage.aonn) objR3, cavVarB);
            boolean zD2 = cavVarB.D(aolsVar) | cavVarB.D(gatVar2);
            java.lang.Object objR4 = cbtVar.R();
            if (zD2 || objR4 == defpackage.cau.a) {
                objR4 = new defpackage.bur(aolsVar, gatVar2, null, 10, null);
                gatVar = gatVar2;
                cbtVar.ab(objR4);
            } else {
                gatVar = gatVar2;
            }
            defpackage.cbp.g(gatVar, (defpackage.aonn) objR4, cavVarB);
            defpackage.cer cerVarH = defpackage.dzo.h(jzuVar3.c, r3, cavVarB, 0, 7);
            defpackage.cer cerVarH2 = defpackage.dzo.h(jzuVar3.d, r3, cavVarB, 0, 7);
            defpackage.cer cerVarH3 = defpackage.dzo.h(jzuVar3.e, r3, cavVarB, 0, 7);
            int i5 = i2;
            defpackage.cer cerVarH4 = defpackage.dzo.h(jzuVar3.f, r3, cavVarB, 0, 7);
            defpackage.aomy aomyVarM = jzuVar3.i.m("emptyCallLogMakeCall_onClick", defpackage.rod.a, cavVarB);
            defpackage.kaw kawVar = jzuVar3.a;
            boolean zB3 = cavVarB.B(kawVar) | cavVarB.B(aomyVarM);
            defpackage.cav cavVar3 = cavVarB;
            java.lang.Object objR5 = cbtVar.R();
            if (zB3 || objR5 == defpackage.cau.a) {
                objR5 = new defpackage.kca(new defpackage.dsm((java.lang.Object) kawVar, 4, (int[]) null), new defpackage.ded(kawVar, 5, (boolean[]) null), new jpi(jzuVar3, 9), new defpackage.ded(kawVar, 6, (float[]) null), new defpackage.dsm(kawVar, 5, (boolean[]) null), aomyVarM);
                cbtVar.ab(objR5);
            }
            defpackage.kcy kcyVar = (defpackage.kcy) cerVarH.a();
            defpackage.kby kbyVar = (defpackage.kby) cerVarH2.a();
            java.util.List list = (java.util.List) cerVarH3.a();
            java.util.List list2 = (java.util.List) cerVarH4.a();
            int i6 = i5 << 18;
            cavVar2 = cavVar3;
            f(gatVar, kcyVar, kbyVar, list, list2, aonjVar3, cmwVar3, ayyVar5, ayyVar4, (defpackage.kca) objR5, cavVar2, 512 | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024));
            jzuVar2 = jzuVar3;
            aonjVar2 = aonjVar3;
            cmwVar2 = cmwVar3;
            ayyVar3 = ayyVar4;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
            ayyVar3 = ayyVar2;
            jzuVar2 = jzuVar;
            aonjVar2 = aonjVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: kch
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.cav cavVar4 = (defpackage.cav) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.cmw cmwVar4 = cmwVar2;
                    int i7 = i | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    defpackage.kcq.c(cmwVar4, ayyVar, ayyVar3, jzuVar2, aonjVar2, cavVar4, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
                    return defpackage.aojh.a;
                }
            };
        }
    }

    public static final void d(final int i, defpackage.cav cavVar, final int i2) {
        int i3;
        defpackage.cav cavVar2;
        int i4;
        defpackage.cbt cbtVar;
        int i5 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-1503761900);
        if (i5 == 0) {
            i3 = (true != cavVarB.z(i + (-1)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (cavVarB.H((i3 & 3) != 2, i3 & 1)) {
            int i6 = i - 1;
            defpackage.emo emoVar = defpackage.emp.Companion;
            if (i6 != 0) {
                i4 = i6 != 1 ? 2132019465 : 2132019467;
            } else {
                i4 = 2132019466;
            }
            defpackage.lpv lpvVar = (defpackage.lpv) cavVarB.e(defpackage.lpx.a);
            java.lang.String strF = defpackage.dfa.f(i4, cavVarB);
            defpackage.aooh.f(lpvVar, "<this>");
            defpackage.dkz dkzVarZ = defpackage.den.an(cavVarB).m;
            boolean z = cavVarB.z(lpvVar.ordinal()) | cavVarB.B(dkzVarZ);
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar2.R();
            if (z || objR == defpackage.cau.a) {
                if (lpvVar == defpackage.lpv.a) {
                    cbtVar = cbtVar2;
                    dkzVarZ = defpackage.dkz.z(dkzVarZ, 0L, defpackage.dpy.g(11), null, null, null, null, 0L, 0L, null, 0, 0L, null, null, 0, 0, 16777213);
                } else {
                    cbtVar = cbtVar2;
                }
                cbtVar.ab(dkzVarZ);
                objR = dkzVarZ;
            } else {
                strF = strF;
            }
            defpackage.dkz dkzVar = (defpackage.dkz) objR;
            long j = defpackage.den.ak(cavVarB).a;
            defpackage.cmw cmwVarD = defpackage.azm.d(defpackage.cmw.c, 1.0f);
            defpackage.aooh.f(lpvVar, "<this>");
            defpackage.lpv lpvVar2 = defpackage.lpv.a;
            float f = lpvVar == lpvVar2 ? 16.0f : 32.0f;
            defpackage.aooh.f(lpvVar, "<this>");
            float f2 = lpvVar == lpvVar2 ? 8.0f : 16.0f;
            defpackage.aooh.f(lpvVar, "<this>");
            defpackage.cmw cmwVarBa = defpackage.den.ba(cmwVarD, f, f2, 0.0f, lpvVar == lpvVar2 ? 4.0f : 8.0f);
            java.lang.String lowerCase = e(i).toLowerCase(java.util.Locale.ROOT);
            defpackage.aooh.e(lowerCase, "toLowerCase(...)");
            cavVar2 = cavVarB;
            defpackage.bvt.b(strF, defpackage.den.x(cmwVarBa, "category_header_".concat(java.lang.String.valueOf(lowerCase))), j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, dkzVar, cavVar2, 0, 0, 131064);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: kcj
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    int i7 = i2 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    int i10 = i;
                    defpackage.kcq.d(i10, (defpackage.cav) obj, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 << 1) & i9));
                    return defpackage.aojh.a;
                }
            };
        }
    }

    public static /* synthetic */ java.lang.String e(int i) {
        if (i != 1) {
            return i != 2 ? "OLDER" : "YESTERDAY";
        }
        return "TODAY";
    }

    public static final void f(final defpackage.gat gatVar, final defpackage.kcy kcyVar, final defpackage.kby kbyVar, final java.util.List list, final java.util.List list2, final defpackage.aonj aonjVar, final defpackage.cmw cmwVar, final defpackage.ayy ayyVar, final defpackage.ayy ayyVar2, final defpackage.kca kcaVar, defpackage.cav cavVar, final int i) {
        int i2;
        defpackage.ayy ayyVar3;
        if (gatVar == null) {
            defpackage.aooh.i("callLogItems");
        }
        if (list == null) {
            defpackage.aooh.i("filtersState");
        }
        if (list2 == null) {
            defpackage.aooh.i("integrations");
        }
        if (aonjVar == null) {
            defpackage.aooh.i("eventListener");
        }
        defpackage.cav cavVarB = cavVar.b(1200599283);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(gatVar) : cavVarB.D(gatVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(kcyVar) : cavVarB.D(kcyVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? cavVarB.B(kbyVar) : cavVarB.D(kbyVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? cavVarB.B(list2) : cavVarB.D(list2)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            ayyVar3 = ayyVar;
            i2 |= true != cavVarB.B(ayyVar3) ? 4194304 : 8388608;
        } else {
            ayyVar3 = ayyVar;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != cavVarB.B(ayyVar2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != ((1073741824 & i) == 0 ? cavVarB.B(kcaVar) : cavVarB.D(kcaVar)) ? 268435456 : 536870912;
        }
        if (cavVarB.H((306783379 & i2) != 306783378, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new defpackage.nf((char[]) null, (byte[]) null);
                cbtVar.ab(objR);
            }
            defpackage.nf nfVar = (defpackage.nf) objR;
            defpackage.den.ab(defpackage.kke.a.b(nfVar), defpackage.cfo.j(1865929779, new kck(cmwVar, (defpackage.lpv) cavVarB.e(defpackage.lpx.a), kcyVar, ayyVar3, gatVar, kbyVar, list, list2, aonjVar, kcaVar, nfVar, ayyVar2), cavVarB), cavVarB, 56);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aonn() { // from class: kcl
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.gat gatVar2 = gatVar;
                    defpackage.kcy kcyVar2 = kcyVar;
                    defpackage.kby kbyVar2 = kbyVar;
                    java.util.List list3 = list;
                    java.util.List list4 = list2;
                    defpackage.aonj aonjVar2 = aonjVar;
                    int i3 = i;
                    int i4 = i3 | 1;
                    int i5 = 306783378 & i4;
                    defpackage.ayy ayyVar4 = ayyVar2;
                    int i6 = 613566756 & i4;
                    defpackage.kca kcaVar2 = kcaVar;
                    defpackage.kcq.f(gatVar2, kcyVar2, kbyVar2, list3, list4, aonjVar2, cmwVar, ayyVar, ayyVar4, kcaVar2, (defpackage.cav) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 << 1) & i6));
                    return defpackage.aojh.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:133:0x0211  */
    /* JADX WARN: Code duplicated, block: B:135:0x0215  */
    /* JADX WARN: Code duplicated, block: B:136:0x0217  */
    /* JADX WARN: Code duplicated, block: B:141:0x023d  */
    /* JADX WARN: Code duplicated, block: B:153:0x027b  */
    /* JADX WARN: Code duplicated, block: B:156:0x028b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0296  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:175:0x02df  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:186:0x0309  */
    /* JADX WARN: Code duplicated, block: B:188:0x030f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0326  */
    /* JADX WARN: Code duplicated, block: B:201:0x0356  */
    /* JADX WARN: Code duplicated, block: B:208:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x02e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v18, types: [cer, java.lang.Object] */
    public static final void g(final defpackage.gat gatVar, final java.lang.Long l, final defpackage.kby kbyVar, final java.util.List list, final java.util.List list2, final defpackage.aonj aonjVar, final defpackage.cmw cmwVar, final defpackage.kca kcaVar, defpackage.cav cavVar, final int i) {
        int i2;
        defpackage.bbh bbhVar;
        boolean z;
        java.lang.Object objR;
        boolean z2;
        boolean zB;
        java.lang.Object objR2;
        defpackage.ccp ccpVar;
        defpackage.cbt cbtVar;
        int i3;
        boolean z3;
        boolean z4;
        boolean zD;
        java.lang.Object objR3;
        java.lang.Object objR4;
        defpackage.ccp ccpVar2;
        defpackage.gat gatVar2;
        java.util.Iterator it;
        defpackage.kgk kgkVar;
        final boolean z5;
        boolean zB2;
        java.lang.Object objR5;
        defpackage.cdk cdkVarI;
        if (gatVar == null) {
            defpackage.aooh.i("callLogItems");
        }
        if (list == null) {
            defpackage.aooh.i("filtersState");
        }
        if (list2 == null) {
            defpackage.aooh.i("integrations");
        }
        if (aonjVar == null) {
            defpackage.aooh.i("eventListener");
        }
        defpackage.cav cavVarB = cavVar.b(1319813468);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(gatVar) : cavVarB.D(gatVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(l) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? cavVarB.B(kbyVar) : cavVarB.D(kbyVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? cavVarB.B(list2) : cavVarB.D(list2)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aonjVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i2 |= true != ((16777216 & i) == 0 ? cavVarB.B(kcaVar) : cavVarB.D(kcaVar)) ? 4194304 : 8388608;
        }
        if (cavVarB.H((4793491 & i2) != 4793490, i2 & 1)) {
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            cbtVar2.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            final defpackage.lpv lpvVar = (defpackage.lpv) cavVarB.e(defpackage.lpx.a);
            defpackage.emx emxVar = (defpackage.emx) cavVarB.e(defpackage.eom.a);
            android.content.Context context = (android.content.Context) cavVarB.e(defpackage.dep.b);
            android.view.View view = (android.view.View) cavVarB.e(defpackage.dep.f);
            boolean zB3 = cavVarB.B(view);
            java.lang.Object objR6 = cbtVar2.R();
            if (zB3 || objR6 == defpackage.cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(view.isShown()), defpackage.cdu.c);
                cbtVar2.ab(parcelableSnapshotMutableState);
                objR6 = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar3 = (defpackage.ccp) objR6;
            boolean zD2 = cavVarB.D(view) | cavVarB.B(ccpVar3);
            java.lang.Object objR7 = cbtVar2.R();
            if (zD2 || objR7 == defpackage.cau.a) {
                objR7 = new defpackage.gxp(view, ccpVar3, 13, null);
                cbtVar2.ab(objR7);
            }
            defpackage.cbp.c(view, (defpackage.aonj) objR7, cavVarB);
            java.lang.Object objR8 = cbtVar2.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR8 == obj) {
                objR8 = ((defpackage.kcb) defpackage.agab.aH(context, defpackage.kcb.class)).mv();
                cbtVar2.ab(objR8);
            }
            defpackage.aazc aazcVar = (defpackage.aazc) objR8;
            java.lang.Object objR9 = cbtVar2.R();
            if (objR9 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = new androidx.compose.runtime.ParcelableSnapshotMutableLongState(android.os.SystemClock.elapsedRealtime());
                cbtVar2.ab(parcelableSnapshotMutableLongState);
                objR9 = parcelableSnapshotMutableLongState;
            }
            defpackage.cek cekVar = (defpackage.cek) objR9;
            defpackage.bbh bbhVarA = defpackage.bbj.a(cavVarB);
            defpackage.gus.aH(bbhVarA, lpvVar == defpackage.lpv.c ? defpackage.ruc.m : defpackage.ruc.k, cavVarB, 0);
            java.lang.Object objA = ccpVar3.a();
            boolean zB4 = cavVarB.B(ccpVar3);
            int i4 = (i2 & 29360128) ^ 12582912;
            if (i4 <= 8388608 || !cavVarB.D(kcaVar)) {
                bbhVar = bbhVarA;
                boolean z6 = (i2 & 12582912) == 8388608;
                z = zB4 | z6;
                objR = cbtVar2.R();
                if (!z || objR == obj) {
                    z2 = true;
                    objR = new defpackage.rox(ccpVar3, kcaVar, (defpackage.aoln) null, 1);
                    cbtVar2.ab(objR);
                } else {
                    z2 = true;
                }
                defpackage.cbp.g(objA, (defpackage.aonn) objR, cavVarB);
                defpackage.aojh aojhVar = defpackage.aojh.a;
                if (i4 > 8388608 || !cavVarB.D(kcaVar)) {
                    if ((i2 & 12582912) == 8388608) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                zB = z2 | cavVarB.B(ccpVar3) | cavVarB.z(lpvVar.ordinal()) | cavVarB.D(context);
                objR2 = cbtVar2.R();
                if (!zB || objR2 == obj) {
                    ccpVar = ccpVar3;
                    cbtVar = cbtVar2;
                    i3 = 8388608;
                    z3 = false;
                    z4 = false;
                    objR2 = new defpackage.kgi(kcaVar, ccpVar, lpvVar, context, (defpackage.aoln) null, 1);
                    cbtVar.ab(objR2);
                } else {
                    ccpVar = ccpVar3;
                    cbtVar = cbtVar2;
                    i3 = 8388608;
                    z3 = false;
                    z4 = false;
                }
                defpackage.cbp.g(aojhVar, (defpackage.aonn) objR2, cavVarB);
                zD = (((i4 > i3 || !cavVarB.D(kcaVar)) && (i2 & 12582912) != i3) ? z3 : true) | cavVarB.D(aazcVar) | cavVarB.D(emxVar);
                objR3 = cbtVar.R();
                if (zD || objR3 == obj) {
                    objR3 = new defpackage.cju(emxVar, kcaVar, cekVar, 5);
                    cbtVar.ab(objR3);
                }
                defpackage.cbp.c(emxVar, (defpackage.aonj) objR3, cavVarB);
                if (gatVar == null) {
                    defpackage.aooh.i("lazyPagingItems");
                }
                objR4 = cbtVar.R();
                if (objR4 == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
                    cbtVar.ab(parcelableSnapshotMutableState2);
                    objR4 = parcelableSnapshotMutableState2;
                }
                ccpVar2 = (defpackage.ccp) objR4;
                if (((java.lang.Boolean) ccpVar2.a()).booleanValue()) {
                    gatVar2 = gatVar;
                } else {
                    if (gatVar.d() <= 0) {
                        gatVar2 = gatVar;
                        if (((defpackage.fzd) gatVar2.d.a()).a instanceof defpackage.fzz) {
                        }
                    } else {
                        gatVar2 = gatVar;
                    }
                    ccpVar2.b(java.lang.Boolean.TRUE);
                }
                if ((list instanceof java.util.Collection) && list.isEmpty()) {
                    z5 = z3;
                    break;
                }
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = z3;
                        break;
                    }
                    kgkVar = (defpackage.kgk) it.next();
                    if (!kgkVar.b && kgkVar.a != defpackage.kgc.a) {
                        z5 = true;
                        break;
                    }
                }
                if (!((java.lang.Boolean) ccpVar2.a()).booleanValue()) {
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        cdkVarI.c = new abib(gatVar2, l, kbyVar, list, list2, aonjVar, cmwVar, kcaVar, i, 1);
                        return;
                    }
                    return;
                }
                zB2 = (((i4 > i3 || !cavVarB.D(kcaVar)) && (i2 & 12582912) != i3) ? z3 : true) | cavVarB.B(ccpVar) | cavVarB.z(lpvVar.ordinal()) | cavVarB.D(context);
                objR5 = cbtVar.R();
                if (zB2 || objR5 == obj) {
                    objR5 = new defpackage.ahtp(kcaVar, ccpVar, lpvVar, context, 1);
                    cbtVar.ab(objR5);
                }
                defpackage.ttj.O((defpackage.aomy) objR5, cavVarB, z3);
                final defpackage.bbh bbhVar2 = bbhVar;
                defpackage.ahk.b(z4, defpackage.cfo.j(329887002, new defpackage.aono() { // from class: kcf
                    @Override // defpackage.aono
                    public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        defpackage.ahj ahjVar = (defpackage.ahj) obj2;
                        defpackage.cav cavVar2 = (defpackage.cav) obj3;
                        int iIntValue = ((java.lang.Integer) obj4).intValue();
                        if (ahjVar == null) {
                            defpackage.aooh.i("$this$SharedTransitionLayout");
                        }
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= true != cavVar2.B(ahjVar) ? 2 : 4;
                        }
                        if (cavVar2.H((iIntValue & 19) != 18, iIntValue & 1)) {
                            defpackage.aonj aonjVar2 = aonjVar;
                            java.lang.Long l2 = l;
                            defpackage.kby kbyVar2 = kbyVar;
                            defpackage.gat gatVar3 = gatVar;
                            boolean z7 = z5;
                            java.util.List list3 = list2;
                            java.util.List list4 = list;
                            defpackage.lpv lpvVar2 = lpvVar;
                            defpackage.kca kcaVar2 = kcaVar;
                            defpackage.cmw cmwVarA = cmwVar.a(new defpackage.dgg("call_log_lazy_list"));
                            boolean z8 = cavVar2.z(lpvVar2.ordinal()) | cavVar2.D(list4) | cavVar2.D(list3) | cavVar2.C(z7) | cavVar2.D(gatVar3) | cavVar2.D(kcaVar2) | cavVar2.D(kbyVar2) | ((iIntValue & 14) == 4) | cavVar2.B(l2) | cavVar2.B(aonjVar2);
                            java.lang.Object objG = cavVar2.g();
                            if (z8 || objG == defpackage.cau.a) {
                                objG = new kci(lpvVar2, list3, gatVar3, list4, z7, kcaVar2, kbyVar2, ahjVar, l2, aonjVar2);
                                cavVar2.w(objG);
                            }
                            defpackage.den.aM(cmwVarA, bbhVar2, null, false, null, null, null, false, null, null, (defpackage.aonj) objG, cavVar2, 0, 0, 1020);
                        } else {
                            cavVar2.s();
                        }
                        return defpackage.aojh.a;
                    }
                }, cavVarB), cavVarB, 48);
            } else {
                bbhVar = bbhVarA;
            }
            z = zB4 | z6;
            objR = cbtVar2.R();
            if (z) {
                z2 = true;
                objR = new defpackage.rox(ccpVar3, kcaVar, (defpackage.aoln) null, 1);
                cbtVar2.ab(objR);
            } else {
                z2 = true;
                objR = new defpackage.rox(ccpVar3, kcaVar, (defpackage.aoln) null, 1);
                cbtVar2.ab(objR);
            }
            defpackage.cbp.g(objA, (defpackage.aonn) objR, cavVarB);
            defpackage.aojh aojhVar2 = defpackage.aojh.a;
            if (i4 > 8388608) {
                if ((i2 & 12582912) == 8388608) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if ((i2 & 12582912) == 8388608) {
                z2 = true;
            } else {
                z2 = false;
            }
            zB = z2 | cavVarB.B(ccpVar3) | cavVarB.z(lpvVar.ordinal()) | cavVarB.D(context);
            objR2 = cbtVar2.R();
            if (zB) {
                ccpVar = ccpVar3;
                cbtVar = cbtVar2;
                i3 = 8388608;
                z3 = false;
                z4 = false;
                objR2 = new defpackage.kgi(kcaVar, ccpVar, lpvVar, context, (defpackage.aoln) null, 1);
                cbtVar.ab(objR2);
            } else {
                ccpVar = ccpVar3;
                cbtVar = cbtVar2;
                i3 = 8388608;
                z3 = false;
                z4 = false;
                objR2 = new defpackage.kgi(kcaVar, ccpVar, lpvVar, context, (defpackage.aoln) null, 1);
                cbtVar.ab(objR2);
            }
            defpackage.cbp.g(aojhVar2, (defpackage.aonn) objR2, cavVarB);
            zD = (((i4 > i3 || !cavVarB.D(kcaVar)) && (i2 & 12582912) != i3) ? z3 : true) | cavVarB.D(aazcVar) | cavVarB.D(emxVar);
            objR3 = cbtVar.R();
            if (zD) {
                objR3 = new defpackage.cju(emxVar, kcaVar, cekVar, 5);
                cbtVar.ab(objR3);
            } else {
                objR3 = new defpackage.cju(emxVar, kcaVar, cekVar, 5);
                cbtVar.ab(objR3);
            }
            defpackage.cbp.c(emxVar, (defpackage.aonj) objR3, cavVarB);
            if (gatVar == null) {
                defpackage.aooh.i("lazyPagingItems");
            }
            objR4 = cbtVar.R();
            if (objR4 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState3);
                objR4 = parcelableSnapshotMutableState3;
            }
            ccpVar2 = (defpackage.ccp) objR4;
            if (((java.lang.Boolean) ccpVar2.a()).booleanValue()) {
                if (gatVar.d() <= 0) {
                    gatVar2 = gatVar;
                    if (((defpackage.fzd) gatVar2.d.a()).a instanceof defpackage.fzz) {
                    }
                } else {
                    gatVar2 = gatVar;
                }
                ccpVar2.b(java.lang.Boolean.TRUE);
            } else {
                gatVar2 = gatVar;
            }
            if (list instanceof java.util.Collection) {
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = z3;
                        break;
                    } else {
                        kgkVar = (defpackage.kgk) it.next();
                        if (!kgkVar.b) {
                        }
                    }
                }
            } else {
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = z3;
                        break;
                    } else {
                        kgkVar = (defpackage.kgk) it.next();
                        if (!kgkVar.b) {
                        }
                    }
                }
            }
            if (!((java.lang.Boolean) ccpVar2.a()).booleanValue()) {
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new abib(gatVar2, l, kbyVar, list, list2, aonjVar, cmwVar, kcaVar, i, 1);
                    return;
                }
                return;
            }
            zB2 = (((i4 > i3 || !cavVarB.D(kcaVar)) && (i2 & 12582912) != i3) ? z3 : true) | cavVarB.B(ccpVar) | cavVarB.z(lpvVar.ordinal()) | cavVarB.D(context);
            objR5 = cbtVar.R();
            if (zB2) {
                objR5 = new defpackage.ahtp(kcaVar, ccpVar, lpvVar, context, 1);
                cbtVar.ab(objR5);
            } else {
                objR5 = new defpackage.ahtp(kcaVar, ccpVar, lpvVar, context, 1);
                cbtVar.ab(objR5);
            }
            defpackage.ttj.O((defpackage.aomy) objR5, cavVarB, z3);
            final defpackage.bbh bbhVar3 = bbhVar;
            defpackage.ahk.b(z4, defpackage.cfo.j(329887002, new defpackage.aono() { // from class: kcf
                @Override // defpackage.aono
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    defpackage.ahj ahjVar = (defpackage.ahj) obj2;
                    defpackage.cav cavVar2 = (defpackage.cav) obj3;
                    int iIntValue = ((java.lang.Integer) obj4).intValue();
                    if (ahjVar == null) {
                        defpackage.aooh.i("$this$SharedTransitionLayout");
                    }
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != cavVar2.B(ahjVar) ? 2 : 4;
                    }
                    if (cavVar2.H((iIntValue & 19) != 18, iIntValue & 1)) {
                        defpackage.aonj aonjVar2 = aonjVar;
                        java.lang.Long l2 = l;
                        defpackage.kby kbyVar2 = kbyVar;
                        defpackage.gat gatVar3 = gatVar;
                        boolean z7 = z5;
                        java.util.List list3 = list2;
                        java.util.List list4 = list;
                        defpackage.lpv lpvVar2 = lpvVar;
                        defpackage.kca kcaVar2 = kcaVar;
                        defpackage.cmw cmwVarA = cmwVar.a(new defpackage.dgg("call_log_lazy_list"));
                        boolean z8 = cavVar2.z(lpvVar2.ordinal()) | cavVar2.D(list4) | cavVar2.D(list3) | cavVar2.C(z7) | cavVar2.D(gatVar3) | cavVar2.D(kcaVar2) | cavVar2.D(kbyVar2) | ((iIntValue & 14) == 4) | cavVar2.B(l2) | cavVar2.B(aonjVar2);
                        java.lang.Object objG = cavVar2.g();
                        if (z8 || objG == defpackage.cau.a) {
                            objG = new kci(lpvVar2, list3, gatVar3, list4, z7, kcaVar2, kbyVar2, ahjVar, l2, aonjVar2);
                            cavVar2.w(objG);
                        }
                        defpackage.den.aM(cmwVarA, bbhVar3, null, false, null, null, null, false, null, null, (defpackage.aonj) objG, cavVar2, 0, 0, 1020);
                    } else {
                        cavVar2.s();
                    }
                    return defpackage.aojh.a;
                }
            }, cavVarB), cavVarB, 48);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI2 = cavVarB.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new defpackage.aonn() { // from class: kcg
                @Override // defpackage.aonn
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3) {
                    defpackage.cav cavVar2 = (defpackage.cav) obj2;
                    ((java.lang.Integer) obj3).intValue();
                    defpackage.gat gatVar3 = gatVar;
                    java.lang.Long l2 = l;
                    defpackage.kby kbyVar2 = kbyVar;
                    java.util.List list3 = list;
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    defpackage.kcq.g(gatVar3, l2, kbyVar2, list3, list2, aonjVar, cmwVar, kcaVar, cavVar2, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 << 1) & i7));
                    return defpackage.aojh.a;
                }
            };
        }
    }

    public static final void h(defpackage.aomy aomyVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        if (aomyVar == null) {
            defpackage.aooh.i("onMakeCallClick");
        }
        defpackage.cav cavVarB = cavVar.b(1553181903);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmi cmiVar = defpackage.cmh.k;
            defpackage.cmw cmwVarA = defpackage.azm.c(cmtVar, 1.0f).a(new defpackage.ayt(0.0f, 72.0f, 0.0f, 0.0f, true)).a(new defpackage.dgg("empty_call_log"));
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, cmiVar, cavVarB, 48);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            long j = cbtVar.x;
            long j2 = j ^ (j >>> 32);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarA);
            defpackage.aomy aomyVar2 = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar2);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
            cavVarB.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            java.lang.String string = ((android.content.res.Resources) cavVarB.e(defpackage.dep.c)).getString(2132017705);
            defpackage.cbd cbdVar = defpackage.bqx.a;
            cavVar2 = cavVarB;
            defpackage.bvt.b(string, null, ((defpackage.bqv) cavVarB.e(cbdVar)).a.q, 0L, null, null, 0L, new defpackage.dot(3), 0L, 0, false, 0, 0, null, ((defpackage.bqv) cavVarB.e(cbdVar)).b.j, cavVar2, 0, 0, 130042);
            i3 = 4;
            cmwVar2 = cmtVar;
            defpackage.den.aq(aomyVar, null, false, null, null, null, defpackage.kda.a, cavVar2, (i4 & 14) | 805306368, 510);
            cbtVar.W(true);
        } else {
            i3 = 4;
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bdx((java.lang.Object) aomyVar, cmwVar2, i, i3);
        }
    }

    public static final defpackage.dkz i(defpackage.lpv lpvVar, boolean z, defpackage.cav cavVar) {
        defpackage.aooh.f(lpvVar, "<this>");
        defpackage.dkz dkzVarZ = defpackage.den.an(cavVar).k;
        if (z) {
            dkzVarZ = defpackage.dkz.z(dkzVarZ, 0L, 0L, defpackage.dnd.g, null, null, null, 0L, 0L, null, 0, 0L, null, null, 0, 0, 16777211);
        }
        return lpvVar == defpackage.lpv.a ? defpackage.dkz.z(dkzVarZ, 0L, defpackage.dpy.g(12), null, null, null, null, 0L, 0L, null, 0, 0L, null, null, 0, 0, 16777213) : dkzVarZ;
    }

    public static final sof j(kap kapVar) {
        defpackage.aooh.f(kapVar, "<this>");
        android.net.Uri uri = android.net.Uri.parse(kapVar.b);
        defpackage.aooh.e(uri, "parse(...)");
        return new sof(uri, kapVar.c);
    }

    public static final boolean k(kbf kbfVar) {
        defpackage.aooh.f(kbfVar, "<this>");
        return (kbfVar instanceof kbb) || (kbfVar instanceof kbd) || (kbfVar instanceof kay);
    }

    public static final android.content.IntentFilter l() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("coalesced_rows_for_conversation_history_updated");
        return intentFilter;
    }

    public static final void m() {
        if (android.os.Build.VERSION.SDK_INT < 36 || defpackage.a.D() < 3600001) {
            throw new java.lang.IllegalStateException("Unexpected SDK");
        }
    }

    public static final boolean n(kdy kdyVar) {
        defpackage.aooh.f(kdyVar, "<this>");
        return (kdyVar.l & 1) == 1;
    }

    public static final void o(java.util.List list, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        if (list == null) {
            defpackage.aooh.i("state");
        }
        defpackage.cav cavVarB = cavVar.b(1680955677);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                defpackage.kgk kgkVar = (defpackage.kgk) it.next();
                arrayList.add(new defpackage.kgm(kgkVar.c, kgkVar.b, kgkVar.d));
            }
            r(arrayList, cmwVar, cavVarB, i2 & 112);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kcv(list, cmwVar, i, 4);
        }
    }

    public static final void p(defpackage.kgm kgmVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        if (kgmVar == null) {
            defpackage.aooh.i("data");
        }
        defpackage.cav cavVarB = cavVar.b(1961035606);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(kgmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cavVar2 = cavVarB;
            defpackage.abrz.k(((android.content.res.Resources) cavVarB.e(defpackage.dep.c)).getString(kgmVar.a), new defpackage.azl(40.0f, Float.NaN, Float.NaN, Float.NaN, false), 0L, 0L, null, null, 0L, new defpackage.dot(3), 0L, 0, false, 0, 0, null, null, cavVar2, 48, 0, 261116);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dfj(kgmVar, i, 2);
        }
    }

    public static final void q(java.lang.Integer num, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1820508208);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(num) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            android.content.Context context = (android.content.Context) cavVarB.e(defpackage.dep.b);
            android.view.View view = (android.view.View) cavVarB.e(defpackage.dep.f);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR == obj) {
                objR = ((defpackage.kgj) defpackage.agab.aH(context, defpackage.kgj.class)).ta();
                cbtVar.ab(objR);
            }
            defpackage.aogc aogcVar = (defpackage.aogc) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = ((defpackage.kgj) defpackage.agab.aH(context, defpackage.kgj.class)).nJ().i(null);
                cbtVar.ab(objR2);
            }
            defpackage.zas zasVar = (defpackage.zas) objR2;
            java.lang.Object objR3 = cbtVar.R();
            if (objR3 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR3 = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar = (defpackage.ccp) objR3;
            boolean zD = cavVarB.D(aogcVar) | cavVarB.D(view) | cavVarB.D(zasVar);
            java.lang.Object objR4 = cbtVar.R();
            if (zD || objR4 == obj) {
                defpackage.kgi kgiVar = new defpackage.kgi(ccpVar, aogcVar, view, zasVar, (defpackage.aoln) null, 0);
                cbtVar.ab(kgiVar);
                objR4 = kgiVar;
            }
            defpackage.cbp.g(num, (defpackage.aonn) objR4, cavVarB);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kmg(num, i, 1);
        }
    }

    public static final void r(java.util.List list, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        java.lang.Object next;
        defpackage.cav cavVarB = cavVar.b(394318388);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            java.util.Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((defpackage.kgm) next).b);
            defpackage.kgm kgmVar = (defpackage.kgm) next;
            q(kgmVar != null ? java.lang.Integer.valueOf(kgmVar.a) : null, cavVarB, 0);
            defpackage.aln alnVar = new defpackage.aln(13);
            java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dig.a;
            defpackage.cmw cmwVarA = cmwVar.a(new defpackage.dhs(false, alnVar)).a(new defpackage.dgg("call_log_filter_row"));
            int i3 = 8;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !cavVarB.D(list))) {
                z = false;
            }
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (z || objR == defpackage.cau.a) {
                objR = new defpackage.gxo(list, i3);
                cbtVar.ab(objR);
            }
            defpackage.den.aN(cmwVarA, null, null, null, null, null, false, null, null, (defpackage.aonj) objR, cavVarB, 0, 0, 1022);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new kcv(list, cmwVar, i, 3);
        }
    }

    public static final void s(defpackage.kgm kgmVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        defpackage.cmw cmwVar3;
        if (kgmVar == null) {
            defpackage.aooh.i("data");
        }
        defpackage.cav cavVarB = cavVar.b(167204097);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(kgmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            boolean z = kgmVar.b;
            defpackage.ayy ayyVar = defpackage.acpw.a;
            defpackage.amu amuVarA = defpackage.acpw.a(true, z, cavVarB);
            java.lang.String string = ((android.content.res.Resources) cavVarB.e(defpackage.dep.c)).getString(kgmVar.a);
            defpackage.ayt aytVar = new defpackage.ayt(0.0f, 0.0f, 8.0f, 0.0f, true);
            if (z) {
                cavVarB.u(-984470522);
                boolean zB = cavVarB.B(string);
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (zB || objR == defpackage.cau.a) {
                    objR = new defpackage.gxo(string, 7);
                    cbtVar.ab(objR);
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dig.a;
                defpackage.cmw cmwVarA = aytVar.a(new defpackage.dht((defpackage.aonj) objR));
                cbtVar.W(false);
                cmwVar3 = cmwVarA;
            } else {
                cavVarB.u(-984312422);
                defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
                java.lang.Object objR2 = cbtVar2.R();
                if (objR2 == defpackage.cau.a) {
                    objR2 = new defpackage.een(17);
                    cbtVar2.ab(objR2);
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger2 = defpackage.dig.a;
                defpackage.cmw cmwVarA2 = aytVar.a(new defpackage.dhs(false, (defpackage.aonj) objR2));
                cbtVar2.W(false);
                cmwVar3 = cmwVarA2;
            }
            defpackage.abrz.v(z, kgmVar.c, defpackage.cfo.j(2069531060, new defpackage.bae(kgmVar, 19), cavVarB), cmwVar3, false, null, null, null, null, null, amuVarA, null, null, cavVarB, 384, 0, 15344);
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.bdx((java.lang.Object) kgmVar, cmwVar2, i, 5);
        }
    }

    public static final boolean t(defpackage.kiu kiuVar) {
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        defpackage.rmt rmtVarB = defpackage.rmt.b(kiwVar.o);
        if (rmtVarB == null) {
            rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
        }
        return rmtVarB == defpackage.rmt.SOURCE_TYPE_DIRECTORY;
    }

    public static final void u(defpackage.kiv kivVar) {
        defpackage.aooh.f(kivVar, "coalescedRows");
    }

    public static final void v(java.lang.String str) {
        defpackage.aooh.f(str, "dataSourceName");
    }

    public static final boolean w(java.lang.String str) {
        defpackage.aooh.f(str, "<this>");
        return defpackage.aoov.G(str, ";", false) || defpackage.aoov.G(str, ",", false);
    }

    public static final int x(android.database.Cursor cursor, int i) {
        defpackage.aooh.f(cursor, "<this>");
        return cursor.getInt(i) != 1 ? 0 : 1;
    }

    public static final java.lang.String y(iua iuaVar) {
        defpackage.aooh.f(iuaVar, "errorType");
        return iuaVar.o;
    }

    public static final byte[] z(kqy kqyVar) {
        defpackage.aooh.f(kqyVar, "callActions");
        return kqyVar.i();
    }

    public kcq() {
    }
}
