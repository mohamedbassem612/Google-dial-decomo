package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mbe implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ mbe(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01ab  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.aomy
    public final java.lang.Object a() {
        java.util.LinkedHashMap mcbVar;
        java.lang.String str;
        java.lang.String str2;
        switch (this.$cid) {
            case 0:
                defpackage.adak adakVar = (defpackage.adak) this.a;
                ?? r0 = adakVar.a;
                if (r0.isEmpty()) {
                    return defpackage.aokc.a;
                }
                ?? r6 = adakVar.j;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = r6.iterator();
                while (it.hasNext()) {
                    defpackage.ajsz.bv(arrayList, ((defpackage.zaq) it.next()).a());
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    java.util.Set setA = ((defpackage.zao) obj).a();
                    if (!(setA instanceof java.util.Collection) || !setA.isEmpty()) {
                        java.util.Iterator it2 = setA.iterator();
                        while (it2.hasNext()) {
                            if (r0.contains(java.lang.Integer.valueOf(((java.lang.Number) it2.next()).intValue()))) {
                                arrayList2.add(obj);
                            }
                            break;
                        }
                    }
                }
                return arrayList2;
            case 1:
                return java.lang.Boolean.valueOf(((defpackage.bbh) this.a).h());
            case 2:
                java.util.List<defpackage.zao> listB = ((defpackage.adak) this.a).b();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (defpackage.zao zaoVar : listB) {
                    java.util.Set setAI = defpackage.ajsz.aI(zaoVar.a, zaoVar.b.keySet());
                    java.util.Set set = zaoVar.c;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        defpackage.ajsz.bv(arrayList4, ((defpackage.zam) it3.next()).a);
                    }
                    java.util.Set setAI2 = defpackage.ajsz.aI(setAI, arrayList4);
                    java.util.Set set2 = zaoVar.d;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.util.Iterator it4 = set2.iterator();
                    while (it4.hasNext()) {
                        defpackage.ajsz.bv(arrayList5, ((defpackage.aacy) it4.next()).b);
                    }
                    defpackage.ajsz.bv(arrayList3, defpackage.ajsz.aJ(defpackage.ajsz.aI(setAI2, arrayList5), zaoVar.g));
                }
                return arrayList3;
            case 3:
                java.util.List listB2 = ((defpackage.adak) this.a).b();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.util.Iterator it5 = listB2.iterator();
                while (it5.hasNext()) {
                    defpackage.ajsz.bv(arrayList6, ((defpackage.zao) it5.next()).e.keySet());
                }
                return arrayList6;
            case 4:
                mcbVar = new mcb((java.lang.String) null, (defpackage.mca) ((defpackage.gpd) this.a).a);
                break;
            case 5:
                java.util.Set set3 = ((defpackage.mbl) this.a).a;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(defpackage.ajsz.bl(set3, 10));
                java.util.Iterator it6 = set3.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(((defpackage.zaq) it6.next()).a());
                }
                return defpackage.ajsz.bm(arrayList7);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.mbl mblVar = (defpackage.mbl) this.a;
                java.util.List listC = mblVar.c();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(listC, 10)), 16));
                for (java.lang.Object obj2 : listC) {
                    linkedHashMap.put(((defpackage.zao) obj2).g, obj2);
                }
                if (linkedHashMap.size() != mblVar.c().size()) {
                    throw new java.lang.IllegalStateException("Duplicate CuiEventConfigurations with the same start CuiEvent.");
                }
                return linkedHashMap;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.List listC2 = ((defpackage.mbl) this.a).c();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(listC2, 10)), 16));
                for (java.lang.Object obj3 : listC2) {
                    linkedHashMap2.put(obj3, new pgi(((defpackage.zao) obj3).c));
                }
                return linkedHashMap2;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.util.List listC3 = ((defpackage.mbl) this.a).c();
                mcbVar = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(listC3, 10)), 16));
                for (java.lang.Object obj4 : listC3) {
                    mcbVar.put(obj4, new pgi(((defpackage.zao) obj4).d, (byte[]) null));
                }
                break;
            case 9:
                defpackage.mvy mvyVar = (defpackage.mvy) this.a;
                java.util.Locale localeAe = defpackage.gus.ae(mvyVar.b);
                defpackage.aooh.e(localeAe, "getLocale(...)");
                java.lang.String languageTag = new java.util.Locale(localeAe.getLanguage(), localeAe.getCountry()).toLanguageTag();
                defpackage.aooh.e(languageTag, "toLanguageTag(...)");
                if (!((java.lang.Boolean) mvyVar.d.a()).booleanValue()) {
                    if (((java.lang.Boolean) mvyVar.e.a()).booleanValue()) {
                        str = "ja-JP";
                    } else if (((java.lang.Boolean) mvyVar.f.a()).booleanValue()) {
                        if (defpackage.aooh.n(languageTag, "en-US")) {
                            str2 = "en-US";
                        } else {
                            str = "en-CA";
                        }
                    } else if (((java.lang.Boolean) mvyVar.g.a()).booleanValue()) {
                        if (defpackage.aooh.n(languageTag, "en-US")) {
                            str2 = "en-US";
                        } else {
                            str = "en-IE";
                        }
                    } else if (((java.lang.Boolean) mvyVar.h.a()).booleanValue()) {
                        if (defpackage.aooh.n(languageTag, "en-US")) {
                            str2 = "en-US";
                        } else {
                            str = "en-AU";
                        }
                    } else if (((java.lang.Boolean) mvyVar.i.a()).booleanValue()) {
                        str = "hi-IN";
                        if (!defpackage.aooh.n(languageTag, "hi-IN")) {
                            str = "en-IN";
                        }
                    } else {
                        ((java.lang.Boolean) mvyVar.c.a()).booleanValue();
                        str2 = "en-US";
                    }
                    str2 = str;
                } else if (defpackage.aooh.n(languageTag, "en-US")) {
                    str2 = "en-US";
                } else {
                    str = "en-GB";
                    str2 = str;
                }
                ((defpackage.aimw) defpackage.mvy.a.b().l("com/android/dialer/dobby/impl/locale/DobbySingletonLocaleProvider", "getLocaleImpl", 133, "DobbySingletonLocaleProvider.kt")).I("SystemLocale: '%s', DobbyRunningLocale: '%s'", languageTag, str2);
                return str2;
            case 10:
                defpackage.okh okhVar = (defpackage.okh) this.a;
                defpackage.dvx.f(okhVar.c, new defpackage.okg(okhVar), defpackage.okh.b, null, 2);
                return defpackage.aojh.a;
            case 11:
                try {
                    return da$.ExternalSyntheticApiModelOutline1.m((android.telephony.TelephonyManager) this.a);
                } catch (java.lang.SecurityException e) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.okh.a.b()).k(e).l("com/android/dialer/externals/androidapis/telephony/CachedTelephonyManager$PhoneAccountSpecificSuppliers", "visualVoicemailPackageNameSupplier$<anonymous>", 141, "CachedTelephonyManager.kt")).v("Visual Voicemail package fetch failed, is Dialer the default dialer?");
                    return null;
                } catch (java.lang.Exception e2) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.okh.a.d()).k(e2).l("com/android/dialer/externals/androidapis/telephony/CachedTelephonyManager$PhoneAccountSpecificSuppliers", "visualVoicemailPackageNameSupplier$<anonymous>", 144, "CachedTelephonyManager.kt")).v("Visual Voicemail package fetch failed.");
                    return null;
                }
            case 12:
                return ((android.telephony.TelephonyManager) this.a).getSimOperator();
            case 13:
                return java.lang.Integer.valueOf(fn$.ExternalSyntheticApiModelOutline0.m((android.telephony.TelephonyManager) this.a));
            case 14:
                return java.lang.Integer.valueOf(((android.telephony.TelephonyManager) this.a).getPhoneCount());
            case 15:
                return java.lang.Integer.valueOf(((android.telephony.TelephonyManager) this.a).getPhoneType());
            case 16:
                return ((android.telephony.TelephonyManager) this.a).getGroupIdLevel1();
            case 17:
                return (defpackage.gat) ((defpackage.olc) this.a).b.a();
            case 18:
                defpackage.aihd aihdVarE = ((defpackage.rtg) this.a).d.e();
                defpackage.aooh.e(aihdVarE, "get(...)");
                return defpackage.ajsz.bX(aihdVarE, new defpackage.beg(11));
            case 19:
                return new defpackage.srm(((defpackage.srl) this.a).c);
            default:
                android.content.Context context = ((defpackage.tcf) this.a).b;
                android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(java.lang.String.valueOf(context.getPackageName()).concat("_preferences"), 0);
                defpackage.aooh.e(sharedPreferences, "getSharedPreferences(...)");
                return sharedPreferences;
        }
        return mcbVar;
    }
}
