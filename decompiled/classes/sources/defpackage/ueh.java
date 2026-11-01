package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ueh {
    private static final defpackage.aimz d = defpackage.aimz.i("com/android/dialer/spam/inapp/BatchInAppSpamVerdictChecker");
    public final defpackage.aoss a;
    public final defpackage.aoss b;
    public final defpackage.uex c;
    private final defpackage.aoin e;
    private final defpackage.uft f;
    private final defpackage.tvn g;
    private final defpackage.tvn h;

    public ueh(defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.uex uexVar, defpackage.tvn tvnVar, defpackage.aoin aoinVar, defpackage.uft uftVar, defpackage.tvn tvnVar2) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("backgroundScope");
        }
        if (tvnVar == null) {
            defpackage.aooh.i("inAppSpamVerdictCache");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("dialerPhoneNumbers");
        }
        this.a = aossVar;
        this.b = aossVar2;
        this.c = uexVar;
        this.h = tvnVar;
        this.e = aoinVar;
        this.f = uftVar;
        this.g = tvnVar2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    private final defpackage.ueb f(java.util.Set set) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            defpackage.tvn tvnVar = this.h;
            if (str == null) {
                defpackage.aooh.i("normalizedNumber");
            }
            ufu ufuVar = (ufu) tvnVar.a.get(str);
            if (ufuVar != null) {
                linkedHashMap.put(str, this.g.i(ufuVar, str));
            }
        }
        java.util.Map mapAS = defpackage.ajsz.aS(linkedHashMap);
        java.util.Set setKeySet = linkedHashMap.keySet();
        if (set == null) {
            defpackage.aooh.i("<this>");
        }
        if (setKeySet == null) {
            defpackage.aooh.i("other");
        }
        java.util.Collection collectionBr = defpackage.ajsz.br(setKeySet);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : set) {
            if (!collectionBr.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return new defpackage.ueb(mapAS, linkedHashSet);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    private final void g(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (((ufi) entry.getValue()).j() != defpackage.udj.SPAM_STATUS_UNKNOWN) {
                java.lang.String str = (java.lang.String) entry.getKey();
                ufu ufuVarE = ufi.e((ufi) entry.getValue());
                defpackage.tvn tvnVar = this.h;
                if (ufuVarE == null) {
                    defpackage.aooh.g();
                }
                if (str == null) {
                    defpackage.aooh.i("normalizedNumber");
                }
                if (ufuVarE == null) {
                    defpackage.aooh.i("inAppSpamVerdict");
                }
                tvnVar.a.put(str, ufuVarE);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.util.Set set, defpackage.aoln aolnVar) {
        defpackage.uec uecVar;
        java.lang.Object obj;
        defpackage.aihd aihdVar;
        if (aolnVar instanceof defpackage.uec) {
            uecVar = (defpackage.uec) aolnVar;
            int i = uecVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uecVar.d = i - Integer.MIN_VALUE;
            } else {
                uecVar = new defpackage.uec(this, aolnVar);
            }
        } else {
            uecVar = new defpackage.uec(this, aolnVar);
        }
        java.lang.Object objD = uecVar.b;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = uecVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = uecVar.a;
                defpackage.aooc.af(objD);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : ((java.util.Map) objD).entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                ufi ufiVar = (ufi) entry.getValue();
                if (obj == null && (aihdVar = (defpackage.aihd) ((defpackage.aigf) obj).get(str)) != null) {
                    java.util.Iterator<E> it = aihdVar.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put((hkd) it.next(), ufiVar);
                    }
                }
            }
            return defpackage.ajsz.aS(linkedHashMap);
        }
        defpackage.aooc.af(objD);
        defpackage.ahbv ahbvVar = (defpackage.ahbv) this.e.a();
        if (set == null) {
            defpackage.aooh.i("<this>");
        }
        defpackage.aihd aihdVarO = defpackage.aihd.o(set);
        defpackage.aooh.e(aihdVarO, "copyOf(...)");
        defpackage.ajcq ajcqVarU = ahbvVar.u(aihdVarO);
        uecVar.d = 1;
        objD = defpackage.aosv.D(ajcqVarU, uecVar);
        if (objD == obj2) {
            return obj2;
        }
        defpackage.aigf aigfVar = (defpackage.aigf) objD;
        java.util.Set setKeySet = aigfVar.keySet();
        defpackage.aooh.e(setKeySet, "<get-keys>(...)");
        uecVar.a = aigfVar;
        uecVar.d = 2;
        objD = b(setKeySet, uecVar);
        if (objD == obj2) {
            return obj2;
        }
        obj = aigfVar;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        while (r7.hasNext()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            ufi ufiVar2 = (ufi) entry.getValue();
            if (obj == null) {
            }
        }
        return defpackage.ajsz.aS(linkedHashMap2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.util.Set set, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.ued uedVar;
        defpackage.ueb uebVarF;
        if (aolnVar instanceof defpackage.ued) {
            uedVar = (defpackage.ued) aolnVar;
            int i = uedVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uedVar.c = i - Integer.MIN_VALUE;
            } else {
                uedVar = new defpackage.ued(this, aolnVar);
            }
        } else {
            uedVar = new defpackage.ued(this, aolnVar);
        }
        java.lang.Object objC = uedVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = uedVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            uebVarF = f(set);
            java.util.Set set2 = uebVarF.b;
            uedVar.d = uebVarF;
            uedVar.c = 1;
            objC = c(set2, uedVar);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uebVarF = uedVar.d;
            defpackage.aooc.af(objC);
        }
        java.util.Map map = (java.util.Map) objC;
        g(map);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(uebVarF.a);
        linkedHashMap.putAll(map);
        return defpackage.ajsz.aS(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.util.Set set, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.uee ueeVar;
        if (aolnVar instanceof defpackage.uee) {
            ueeVar = (defpackage.uee) aolnVar;
            int i = ueeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ueeVar.c = i - Integer.MIN_VALUE;
            } else {
                ueeVar = new defpackage.uee(this, aolnVar);
            }
        } else {
            ueeVar = new defpackage.uee(this, aolnVar);
        }
        java.lang.Object objD = ueeVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ueeVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            if (set.isEmpty()) {
                return defpackage.aokd.a;
            }
            defpackage.uex uexVar = this.c;
            if (set == null) {
                defpackage.aooh.i("<this>");
            }
            defpackage.aihd aihdVarO = defpackage.aihd.o(set);
            defpackage.aooh.e(aihdVarO, "copyOf(...)");
            java.lang.Iterable<java.util.List> iterableBf = defpackage.ahvr.bf(aihdVarO, 999);
            defpackage.aigb aigbVar = new defpackage.aigb(4);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.List list : iterableBf) {
                defpackage.uft uftVar = uexVar.f;
                if (list == null) {
                    defpackage.aooh.i("phoneNumbers");
                }
                arrayList.add(defpackage.ahvr.H(defpackage.aosv.F(uftVar.a, 0, new ufr(uftVar, list, (defpackage.aoln) null, 1), 3), new tzs(uexVar, list, 11, (byte[]) null), uexVar.d));
            }
            defpackage.ahda ahdaVarAj = defpackage.ahvr.aj(arrayList);
            syg sygVar = new syg(arrayList, aigbVar, 14, (byte[]) null);
            long j = defpackage.ahqx.a;
            defpackage.ajcq ajcqVarO = ahdaVarAj.o(new defpackage.ajav(defpackage.ahns.c(false), sygVar, 1), uexVar.d);
            ueeVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarO, ueeVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        defpackage.aooh.e(objD, "await(...)");
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(hkd hkdVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        uef uefVar;
        if (aolnVar instanceof uef) {
            uefVar = (uef) aolnVar;
            int i = uefVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uefVar.c = i - Integer.MIN_VALUE;
            } else {
                uefVar = new uef(this, aolnVar);
            }
        } else {
            uefVar = new uef(this, aolnVar);
        }
        java.lang.Object objE = uefVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = uefVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objE);
            java.lang.String str = hkdVar.c;
            defpackage.aooh.e(str, "getNormalizedNumber(...)");
            java.lang.String str2 = hkdVar.d;
            defpackage.aooh.e(str2, "getCountryIso(...)");
            uefVar.c = 1;
            objE = e(str, str2, uefVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objE);
        }
        ufi ufiVar = (ufi) objE;
        return ufiVar == null ? ufi.d() : ufiVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(java.lang.String str, java.lang.String str2, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ueg uegVar;
        defpackage.ajcq ajcqVarI;
        java.lang.Object objC;
        defpackage.udj udjVarJ;
        defpackage.udj udjVar;
        defpackage.aimz aimzVar;
        if (aolnVar instanceof ueg) {
            uegVar = (ueg) aolnVar;
            int i = uegVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uegVar.d = i - Integer.MIN_VALUE;
            } else {
                uegVar = new ueg(this, aolnVar);
            }
        } else {
            uegVar = new ueg(this, aolnVar);
        }
        java.lang.Object objD = uegVar.b;
        ufi ufiVar = defpackage.aolu.a;
        int i2 = uegVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                str = (java.lang.String) uegVar.a;
                defpackage.aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ufi ufiVar2 = (ufi) uegVar.a;
                defpackage.aooc.af(objD);
                ufiVar = ufiVar2;
            }
            if (!((java.lang.Boolean) objD).booleanValue()) {
                udjVarJ = ufiVar.j();
                udjVar = defpackage.udj.SPAM_STATUS_SPAM;
                aimzVar = d;
                if (udjVarJ == udjVar) {
                    ((defpackage.aimw) aimzVar.d().l("com/android/dialer/spam/inapp/BatchInAppSpamVerdictChecker", "checkInAppSpamStatusFromVerdictInternal", 116, "BatchInAppSpamVerdictChecker.kt")).v("inAppStatus storage into persistable table failed despite is spam");
                } else {
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/inapp/BatchInAppSpamVerdictChecker", "checkInAppSpamStatusFromVerdictInternal", 119, "BatchInAppSpamVerdictChecker.kt")).v("inAppStatus not stored for as number not spam");
                }
            }
            return ufiVar;
        }
        defpackage.aooc.af(objD);
        java.util.Map map = f(defpackage.ajsz.aF(str)).a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        defpackage.uex uexVar = this.c;
        if (str == null) {
            ajcqVarI = defpackage.aiql.z(ufi.d());
        } else {
            java.lang.String numberToE164 = android.telephony.PhoneNumberUtils.formatNumberToE164(str, str2);
            if (true == android.text.TextUtils.isEmpty(numberToE164)) {
                numberToE164 = str;
            }
            ajcqVarI = defpackage.ahvr.I(uexVar.f.a(str), new uew(uexVar, numberToE164, str2), uexVar.d);
        }
        uegVar.a = str;
        uegVar.d = 1;
        objD = defpackage.aosv.D(ajcqVarI, uegVar);
        if (objD != ufiVar) {
        }
        return ufiVar;
        ufi ufiVar3 = (ufi) objD;
        g(defpackage.ajsz.aM(new defpackage.aoiu(str, ufiVar3)));
        defpackage.aooh.c(ufiVar3);
        uegVar.a = ufiVar3;
        uegVar.d = 2;
        defpackage.uft uftVar = this.f;
        if (ufiVar3.j() == defpackage.udj.SPAM_STATUS_SPAM) {
            ufu ufuVarE = ufi.e(ufiVar3);
            defpackage.ufo ufoVar = uftVar.b;
            defpackage.aooh.c(ufuVarE);
            objC = ufoVar.c(str, ufuVarE, uegVar);
        } else {
            objC = java.lang.Boolean.FALSE;
        }
        if (objC != ufiVar) {
            ufiVar = ufiVar3;
            objD = objC;
            if (!((java.lang.Boolean) objD).booleanValue()) {
                udjVarJ = ufiVar.j();
                udjVar = defpackage.udj.SPAM_STATUS_SPAM;
                aimzVar = d;
                if (udjVarJ == udjVar) {
                    ((defpackage.aimw) aimzVar.d().l("com/android/dialer/spam/inapp/BatchInAppSpamVerdictChecker", "checkInAppSpamStatusFromVerdictInternal", 116, "BatchInAppSpamVerdictChecker.kt")).v("inAppStatus storage into persistable table failed despite is spam");
                } else {
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/inapp/BatchInAppSpamVerdictChecker", "checkInAppSpamStatusFromVerdictInternal", 119, "BatchInAppSpamVerdictChecker.kt")).v("inAppStatus not stored for as number not spam");
                }
            }
        }
        return ufiVar;
    }
}
