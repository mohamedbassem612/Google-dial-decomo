package com.google.android.libraries.internal.growth.growthkit.internal.debug;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class TestingToolsBroadcastReceiver extends android.content.BroadcastReceiver {
    public static final aiof a = aiof.i("GnpSdk");
    public acgr b;
    public acgp c;
    public acgu d;
    public abzy e;
    public amwu f;
    public aduj g;
    public acci h;
    public android.content.Context i;
    public amwu j;
    public ahyn k;
    public ahyn l;
    public aoin m;
    public aoss n;
    public adao o;
    public adao p;
    public adao q;

    public final android.content.Context a() {
        android.content.Context context = this.i;
        if (context != null) {
            return context;
        }
        aooh.j("context");
        return null;
    }

    public final abzy b() {
        abzy abzyVar = this.e;
        if (abzyVar != null) {
            return abzyVar;
        }
        aooh.j("accountManager");
        return null;
    }

    public final acgp c() {
        acgp acgpVar = this.c;
        if (acgpVar != null) {
            return acgpVar;
        }
        aooh.j("clearcutEventsStore");
        return null;
    }

    public final acgr d() {
        acgr acgrVar = this.b;
        if (acgrVar != null) {
            return acgrVar;
        }
        aooh.j("cappedPromotionStore");
        return null;
    }

    public final acgu e() {
        acgu acguVar = this.d;
        if (acguVar != null) {
            return acguVar;
        }
        aooh.j("visualElementEventsStore");
        return null;
    }

    public final aduj f() {
        aduj adujVar = this.g;
        if (adujVar != null) {
            return adujVar;
        }
        aooh.j("trace");
        return null;
    }

    public final ahyn g() {
        ahyn ahynVar = this.l;
        if (ahynVar != null) {
            return ahynVar;
        }
        aooh.j("gnpRegistrationHandler");
        return null;
    }

    public final ahyn h() {
        ahyn ahynVar = this.k;
        if (ahynVar != null) {
            return ahynVar;
        }
        aooh.j("imageManager");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(android.content.Intent intent, aoln aolnVar) {
        defpackage.acbe acbeVar;
        if (aolnVar instanceof defpackage.acbe) {
            acbeVar = (defpackage.acbe) aolnVar;
            int i = acbeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbeVar.c = i - Integer.MIN_VALUE;
            } else {
                acbeVar = new defpackage.acbe(this, aolnVar);
            }
        } else {
            acbeVar = new defpackage.acbe(this, aolnVar);
        }
        java.lang.Object objU = acbeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = acbeVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objU);
                akhl akhlVar = (akhl) alad.y(akhl.a, android.util.Base64.decode(intent.getStringExtra("proto"), 0));
                aooh.e(akhlVar, "parseFrom(...)");
                acbeVar.c = 1;
                objU = u(akhlVar, acbeVar);
                if (objU == aoluVar) {
                    objU = aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objU);
            }
            return objU;
        } catch (java.lang.Exception e) {
            hgb.b(a.c(), "Failed to parse custom preview promotion received in BroadcastReceiver", e);
            return new defpackage.adtw(e, adty.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(android.content.Intent intent, aoln aolnVar) {
        defpackage.acbf acbfVar;
        if (aolnVar instanceof defpackage.acbf) {
            acbfVar = (defpackage.acbf) aolnVar;
            int i = acbfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbfVar.c = i - Integer.MIN_VALUE;
            } else {
                acbfVar = new defpackage.acbf(this, aolnVar);
            }
        } else {
            acbfVar = new defpackage.acbf(this, aolnVar);
        }
        java.lang.Object objV = acbfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = acbfVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objV);
                java.lang.String stringExtra = intent.getStringExtra("account");
                akhl akhlVar = (akhl) alad.y(akhl.a, android.util.Base64.decode(intent.getStringExtra("proto"), 0));
                aooh.e(akhlVar, "parseFrom(...)");
                acbfVar.c = 1;
                objV = v(stringExtra, akhlVar, acbfVar);
                if (objV == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objV);
            }
            return (adtz) objV;
        } catch (java.lang.Exception e) {
            hgb.b(a.c(), "Failed to parse custom promotion received in BroadcastReceiver", e);
            return new defpackage.adtw(e, adty.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(aoln aolnVar) {
        defpackage.acbg acbgVar;
        ajcq ajcqVarA;
        if (aolnVar instanceof defpackage.acbg) {
            acbgVar = (defpackage.acbg) aolnVar;
            int i = acbgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbgVar.c = i - Integer.MIN_VALUE;
            } else {
                acbgVar = new defpackage.acbg(this, aolnVar);
            }
        } else {
            acbgVar = new defpackage.acbg(this, aolnVar);
        }
        java.lang.Object obj = acbgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = acbgVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aooc.af(obj);
                } else if (i2 == 2) {
                    aooc.af(obj);
                    ajcqVarA = d().a();
                    aooh.e(ajcqVarA, "clearAll(...)");
                    acbgVar.c = 3;
                    if (aosv.D(ajcqVarA, acbgVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(obj);
                }
                a.b().v("Cleared all counters");
                return new adub(java.lang.Boolean.TRUE);
            }
            aooc.af(obj);
            ajcq ajcqVarA2 = c().a();
            aooh.e(ajcqVarA2, "clearAll(...)");
            acbgVar.c = 1;
            if (aosv.D(ajcqVarA2, acbgVar) == aoluVar) {
                return aoluVar;
            }
            ajcq ajcqVarA3 = e().a();
            aooh.e(ajcqVarA3, "clearAll(...)");
            acbgVar.c = 2;
            if (aosv.D(ajcqVarA3, acbgVar) == aoluVar) {
                return aoluVar;
            }
            ajcqVarA = d().a();
            aooh.e(ajcqVarA, "clearAll(...)");
            acbgVar.c = 3;
            if (aosv.D(ajcqVarA, acbgVar) == aoluVar) {
                return aoluVar;
            }
            a.b().v("Cleared all counters");
            return new adub(java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e) {
            hgb.b(a.c(), "Failed to clear event counts in BroadcastReceiver", e);
            return new defpackage.adtx(e, adty.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(android.content.Intent intent, aoln aolnVar) {
        defpackage.acbh acbhVar;
        java.lang.String string;
        java.lang.String string2;
        if (aolnVar instanceof defpackage.acbh) {
            acbhVar = (defpackage.acbh) aolnVar;
            int i = acbhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbhVar.c = i - Integer.MIN_VALUE;
            } else {
                acbhVar = new defpackage.acbh(this, aolnVar);
            }
        } else {
            acbhVar = new defpackage.acbh(this, aolnVar);
        }
        java.lang.Object objD = acbhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = acbhVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                string2 = acbhVar.e;
                string = acbhVar.d;
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return new adub(java.lang.Boolean.TRUE);
        }
        aooc.af(objD);
        android.os.Bundle extras = intent.getExtras();
        string = extras != null ? extras.getString("account") : null;
        android.os.Bundle extras2 = intent.getExtras();
        string2 = extras2 != null ? extras2.getString("promo_id") : null;
        ajcq ajcqVarC = ((acgr) x().o(string)).c();
        aooh.e(ajcqVarC, "getAll(...)");
        acbhVar.d = string;
        acbhVar.e = string2;
        acbhVar.c = 1;
        objD = aosv.D(ajcqVarC, acbhVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        java.util.Set setEntrySet = ((java.util.Map) objD).entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setEntrySet) {
            akhl akhlVar = ((defpackage.acce) ((java.util.Map.Entry) obj).getValue()).c;
            if (akhlVar == null) {
                akhlVar = akhl.a;
            }
            akhq akhqVar = akhlVar.c;
            if (akhqVar == null) {
                akhqVar = akhq.a;
            }
            if (aooh.n(defpackage.abxl.r(akhqVar), string2)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
        }
        ajcq ajcqVarF = ((acgr) x().o(string)).f(arrayList2);
        aooh.e(ajcqVarF, "remove(...)");
        acbhVar.d = null;
        acbhVar.e = null;
        acbhVar.c = 2;
        if (aosv.D(ajcqVarF, acbhVar) == aoluVar) {
            return aoluVar;
        }
        return new adub(java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(android.content.Intent intent, aoln aolnVar) {
        defpackage.acbi acbiVar;
        if (aolnVar instanceof defpackage.acbi) {
            acbiVar = (defpackage.acbi) aolnVar;
            int i = acbiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbiVar.c = i - Integer.MIN_VALUE;
            } else {
                acbiVar = new defpackage.acbi(this, aolnVar);
            }
        } else {
            acbiVar = new defpackage.acbi(this, aolnVar);
        }
        java.lang.Object obj = acbiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = acbiVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                java.lang.String stringExtra = intent.getStringExtra("account");
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("promo_ids");
                if (stringArrayListExtra != null) {
                    ajcq ajcqVarF = ((acgr) z().o(stringExtra)).f(stringArrayListExtra);
                    aooh.e(ajcqVarF, "remove(...)");
                    acbiVar.c = 1;
                    if (aosv.D(ajcqVarF, acbiVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return new adub(java.lang.Boolean.TRUE);
        } catch (java.lang.Exception e) {
            hgb.b(a.c(), "Failed to parse custom promotion received in BroadcastReceiver", e);
            return new defpackage.adtw(e, adty.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult, aoln aolnVar) {
        defpackage.acbj acbjVar;
        java.lang.String str;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.acbj) {
            acbjVar = (defpackage.acbj) aolnVar;
            int i = acbjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbjVar.d = i - Integer.MIN_VALUE;
            } else {
                acbjVar = new defpackage.acbj(this, aolnVar);
            }
        } else {
            acbjVar = new defpackage.acbj(this, aolnVar);
        }
        java.lang.Object objD = acbjVar.b;
        aolu aoluVar = aolu.a;
        int i2 = acbjVar.d;
        if (i2 == 0) {
            aooc.af(objD);
            android.os.Bundle extras = intent.getExtras();
            java.lang.String string = extras != null ? extras.getString("account") : null;
            android.os.Bundle extras2 = intent.getExtras();
            java.lang.String string2 = extras2 != null ? extras2.getString("promo_id") : null;
            ajcq ajcqVarC = ((acgr) x().o(string)).c();
            aooh.e(ajcqVarC, "getAll(...)");
            acbjVar.a = pendingResult;
            acbjVar.e = string2;
            acbjVar.d = 1;
            objD = aosv.D(ajcqVarC, acbjVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            str = string2;
            obj = pendingResult;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = acbjVar.e;
            java.lang.Object obj2 = acbjVar.a;
            aooc.af(objD);
            obj = obj2;
        }
        akzx akzxVarM = defpackage.acca.a.m();
        aooh.f(akzxVarM, "builder");
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.acca) akzxVarM.b).b);
        aooh.e(listUnmodifiableList, "getEvalResultList(...)");
        new alct(listUnmodifiableList);
        java.util.Collection collectionValues = ((java.util.Map) objD).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : collectionValues) {
            akhl akhlVar = ((defpackage.acce) obj3).c;
            if (akhlVar == null) {
                akhlVar = akhl.a;
            }
            akhq akhqVar = akhlVar.c;
            if (akhqVar == null) {
                akhqVar = akhq.a;
            }
            if (aooh.n(defpackage.abxl.r(akhqVar), str)) {
                arrayList.add(obj3);
            }
        }
        akzxVarM.u();
        defpackage.acca accaVar = (defpackage.acca) akzxVarM.b;
        alat alatVar = accaVar.b;
        if (!alatVar.c()) {
            accaVar.b = alad.J(alatVar);
        }
        akyl.i(arrayList, accaVar.b);
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("eval_result", ((defpackage.acca) aladVarP).i());
        ((android.content.BroadcastReceiver.PendingResult) obj).setResultExtras(bundle);
        return new adub(java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x018f A[LOOP:0: B:34:0x0189->B:36:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object o(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult, aoln aolnVar) {
        defpackage.acbk acbkVar;
        com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver testingToolsBroadcastReceiver;
        java.lang.String string;
        java.lang.Object obj;
        defpackage.acbz acbzVar;
        java.lang.Object obj2;
        java.util.ArrayList arrayList;
        defpackage.accd accdVar;
        alat alatVar;
        if (aolnVar instanceof defpackage.acbk) {
            acbkVar = (defpackage.acbk) aolnVar;
            int i = acbkVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbkVar.e = i - Integer.MIN_VALUE;
                testingToolsBroadcastReceiver = this;
            } else {
                testingToolsBroadcastReceiver = this;
                acbkVar = new defpackage.acbk(testingToolsBroadcastReceiver, aolnVar);
            }
        } else {
            testingToolsBroadcastReceiver = this;
            acbkVar = new defpackage.acbk(testingToolsBroadcastReceiver, aolnVar);
        }
        java.lang.Object objD = acbkVar.c;
        aolu aoluVar = aolu.a;
        int i2 = acbkVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                string = (java.lang.String) acbkVar.b;
                obj = acbkVar.a;
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                acbzVar = (defpackage.acbz) acbkVar.b;
                obj2 = acbkVar.a;
                aooc.af(objD);
            }
            akzx akzxVarM = defpackage.accd.a.m();
            aooh.f(akzxVarM, "builder");
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.accd) akzxVarM.b).b);
            aooh.e(listUnmodifiableList, "getVeCountPairList(...)");
            new alct(listUnmodifiableList);
            java.util.Set<java.util.Map.Entry> setEntrySet = ((java.util.Map) objD).entrySet();
            arrayList = new java.util.ArrayList(ajsz.bl(setEntrySet, 10));
            for (java.util.Map.Entry entry : setEntrySet) {
                akzx akzxVarM2 = defpackage.accc.a.m();
                aooh.f(akzxVarM2, "builder");
                java.lang.Object key = entry.getKey();
                aooh.e(key, "<get-key>(...)");
                defpackage.akkn akknVar = (defpackage.akkn) key;
                aooh.f(akknVar, "value");
                akzxVarM2.u();
                defpackage.accc acccVar = (defpackage.accc) akzxVarM2.b;
                j$.util.Objects.requireNonNull(akknVar);
                acccVar.c = akknVar;
                acccVar.b |= 1;
                java.lang.Object value = entry.getValue();
                aooh.e(value, "<get-value>(...)");
                int iIntValue = ((java.lang.Number) value).intValue();
                akzxVarM2.u();
                defpackage.accc acccVar2 = (defpackage.accc) akzxVarM2.b;
                acccVar2.b |= 2;
                acccVar2.d = iIntValue;
                alad aladVarP = akzxVarM2.p();
                aooh.e(aladVarP, "build(...)");
                arrayList.add((defpackage.accc) aladVarP);
            }
            akzxVarM.u();
            accdVar = (defpackage.accd) akzxVarM.b;
            alatVar = accdVar.b;
            if (!alatVar.c()) {
                accdVar.b = alad.J(alatVar);
            }
            akyl.i(arrayList, accdVar.b);
            alad aladVarP2 = akzxVarM.p();
            aooh.e(aladVarP2, "build(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("clearcut", acbzVar.i());
            bundle.putByteArray("visualelement", ((defpackage.accd) aladVarP2).i());
            ((android.content.BroadcastReceiver.PendingResult) obj2).setResultExtras(bundle);
            return new adub(java.lang.Boolean.TRUE);
        }
        aooc.af(objD);
        android.os.Bundle extras = intent.getExtras();
        string = extras != null ? extras.getString("account") : null;
        ajcq ajcqVarB = testingToolsBroadcastReceiver.c().b(string);
        aooh.e(ajcqVarB, "getAllEventsCounts(...)");
        obj = pendingResult;
        acbkVar.a = obj;
        acbkVar.b = string;
        acbkVar.e = 1;
        objD = aosv.D(ajcqVarB, acbkVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        akzx akzxVarM3 = defpackage.acbz.a.m();
        aooh.f(akzxVarM3, "builder");
        java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.acbz) akzxVarM3.b).b);
        aooh.e(listUnmodifiableList2, "getCcCountPairList(...)");
        new alct(listUnmodifiableList2);
        java.util.Set setEntrySet2 = ((java.util.Map) objD).entrySet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(setEntrySet2, 10));
        java.util.Iterator it = setEntrySet2.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            akzx akzxVarM4 = defpackage.acby.a.m();
            aooh.f(akzxVarM4, "builder");
            java.util.Iterator it2 = it;
            java.lang.Object key2 = entry2.getKey();
            aooh.e(key2, "<get-key>(...)");
            akiq akiqVar = (akiq) key2;
            aooh.f(akiqVar, "value");
            akzxVarM4.u();
            defpackage.acby acbyVar = (defpackage.acby) akzxVarM4.b;
            j$.util.Objects.requireNonNull(akiqVar);
            acbyVar.c = akiqVar;
            acbyVar.b |= 1;
            java.lang.Object value2 = entry2.getValue();
            aooh.e(value2, "<get-value>(...)");
            int iIntValue2 = ((java.lang.Number) value2).intValue();
            akzxVarM4.u();
            defpackage.acby acbyVar2 = (defpackage.acby) akzxVarM4.b;
            acbyVar2.b |= 2;
            acbyVar2.d = iIntValue2;
            alad aladVarP3 = akzxVarM4.p();
            aooh.e(aladVarP3, "build(...)");
            arrayList2.add((defpackage.acby) aladVarP3);
            it = it2;
        }
        akzxVarM3.u();
        defpackage.acbz acbzVar2 = (defpackage.acbz) akzxVarM3.b;
        alat alatVar2 = acbzVar2.b;
        if (!alatVar2.c()) {
            acbzVar2.b = alad.J(alatVar2);
        }
        akyl.i(arrayList2, acbzVar2.b);
        akym akymVarP = akzxVarM3.p();
        aooh.e(akymVarP, "build(...)");
        acbzVar = (defpackage.acbz) akymVarP;
        ajcq ajcqVarB2 = e().b(string);
        aooh.e(ajcqVarB2, "getAllEventsCounts(...)");
        acbkVar.a = obj;
        acbkVar.b = acbzVar;
        acbkVar.e = 2;
        objD = aosv.D(ajcqVarB2, acbkVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        obj2 = obj;
        akzx akzxVarM5 = defpackage.accd.a.m();
        aooh.f(akzxVarM5, "builder");
        java.util.List listUnmodifiableList3 = j$.util.DesugarCollections.unmodifiableList(((defpackage.accd) akzxVarM5.b).b);
        aooh.e(listUnmodifiableList3, "getVeCountPairList(...)");
        new alct(listUnmodifiableList3);
        java.util.Set<java.util.Map.Entry> setEntrySet3 = ((java.util.Map) objD).entrySet();
        arrayList = new java.util.ArrayList(ajsz.bl(setEntrySet3, 10));
        while (r0.hasNext()) {
            akzx akzxVarM6 = defpackage.accc.a.m();
            aooh.f(akzxVarM6, "builder");
            java.lang.Object key3 = entry.getKey();
            aooh.e(key3, "<get-key>(...)");
            defpackage.akkn akknVar2 = (defpackage.akkn) key3;
            aooh.f(akknVar2, "value");
            akzxVarM6.u();
            defpackage.accc acccVar3 = (defpackage.accc) akzxVarM6.b;
            j$.util.Objects.requireNonNull(akknVar2);
            acccVar3.c = akknVar2;
            acccVar3.b |= 1;
            java.lang.Object value3 = entry.getValue();
            aooh.e(value3, "<get-value>(...)");
            int iIntValue3 = ((java.lang.Number) value3).intValue();
            akzxVarM6.u();
            defpackage.accc acccVar4 = (defpackage.accc) akzxVarM6.b;
            acccVar4.b |= 2;
            acccVar4.d = iIntValue3;
            alad aladVarP4 = akzxVarM6.p();
            aooh.e(aladVarP4, "build(...)");
            arrayList.add((defpackage.accc) aladVarP4);
        }
        akzxVarM5.u();
        accdVar = (defpackage.accd) akzxVarM5.b;
        alatVar = accdVar.b;
        if (!alatVar.c()) {
            accdVar.b = alad.J(alatVar);
        }
        akyl.i(arrayList, accdVar.b);
        alad aladVarP5 = akzxVarM5.p();
        aooh.e(aladVarP5, "build(...)");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putByteArray("clearcut", acbzVar.i());
        bundle2.putByteArray("visualelement", ((defpackage.accd) aladVarP5).i());
        ((android.content.BroadcastReceiver.PendingResult) obj2).setResultExtras(bundle2);
        return new adub(java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r0 == false) goto L29;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult, aoln aolnVar) {
        defpackage.acbl acblVar;
        java.lang.Object obj;
        defpackage.accb accbVar;
        java.lang.Object obj2;
        defpackage.acbx acbxVar;
        alat alatVar;
        if (aolnVar instanceof defpackage.acbl) {
            acblVar = (defpackage.acbl) aolnVar;
            int i = acblVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acblVar.d = i - Integer.MIN_VALUE;
            } else {
                acblVar = new defpackage.acbl(this, aolnVar);
            }
        } else {
            acblVar = new defpackage.acbl(this, aolnVar);
        }
        java.lang.Object objD = acblVar.b;
        aolu aoluVar = aolu.a;
        int i2 = acblVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj3 = acblVar.a;
                aooc.af(objD);
                obj = obj3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                accbVar = acblVar.e;
                java.lang.Object obj4 = acblVar.a;
                aooc.af(objD);
                obj2 = obj4;
            }
            akzx akzxVarM = defpackage.acbx.a.m();
            aooh.f(akzxVarM, "builder");
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.acbx) akzxVarM.b).b);
            aooh.e(listUnmodifiableList, "getCappedPromoList(...)");
            new alct(listUnmodifiableList);
            java.util.Collection collectionValues = ((java.util.Map) objD).values();
            aooh.f(collectionValues, "values");
            akzxVarM.u();
            acbxVar = (defpackage.acbx) akzxVarM.b;
            alatVar = acbxVar.b;
            if (!alatVar.c()) {
                acbxVar.b = alad.J(alatVar);
            }
            akyl.i(collectionValues, acbxVar.b);
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("promotion", accbVar.i());
            bundle.putByteArray("capped_promotion", ((defpackage.acbx) aladVarP).i());
            ((android.content.BroadcastReceiver.PendingResult) obj2).setResultExtras(bundle);
            return new adub(java.lang.Boolean.TRUE);
        }
        aooc.af(objD);
        android.os.Bundle extras = intent.getExtras();
        ajcq ajcqVarC = ((acgr) z().o(extras != null ? extras.getString("account") : null)).c();
        aooh.e(ajcqVarC, "getAll(...)");
        acblVar.a = pendingResult;
        acblVar.d = 1;
        objD = aosv.D(ajcqVarC, acblVar);
        obj = pendingResult;
        if (objD == aoluVar) {
            return aoluVar;
        }
        akzx akzxVarM2 = defpackage.accb.a.m();
        aooh.f(akzxVarM2, "builder");
        java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.accb) akzxVarM2.b).b);
        aooh.e(listUnmodifiableList2, "getPromotionList(...)");
        new alct(listUnmodifiableList2);
        java.util.Collection collectionValues2 = ((java.util.Map) objD).values();
        aooh.f(collectionValues2, "values");
        akzxVarM2.u();
        defpackage.accb accbVar2 = (defpackage.accb) akzxVarM2.b;
        alat alatVar2 = accbVar2.b;
        if (!alatVar2.c()) {
            accbVar2.b = alad.J(alatVar2);
        }
        akyl.i(collectionValues2, accbVar2.b);
        akym akymVarP = akzxVarM2.p();
        aooh.e(akymVarP, "build(...)");
        defpackage.accb accbVar3 = (defpackage.accb) akymVarP;
        ajcq ajcqVarC2 = d().c();
        aooh.e(ajcqVarC2, "getAll(...)");
        acblVar.a = obj;
        acblVar.e = accbVar3;
        acblVar.d = 2;
        objD = aosv.D(ajcqVarC2, acblVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        accbVar = accbVar3;
        obj2 = obj;
        akzx akzxVarM3 = defpackage.acbx.a.m();
        aooh.f(akzxVarM3, "builder");
        java.util.List listUnmodifiableList3 = j$.util.DesugarCollections.unmodifiableList(((defpackage.acbx) akzxVarM3.b).b);
        aooh.e(listUnmodifiableList3, "getCappedPromoList(...)");
        new alct(listUnmodifiableList3);
        java.util.Collection collectionValues3 = ((java.util.Map) objD).values();
        aooh.f(collectionValues3, "values");
        akzxVarM3.u();
        acbxVar = (defpackage.acbx) akzxVarM3.b;
        alatVar = acbxVar.b;
        if (!alatVar.c()) {
            acbxVar.b = alad.J(alatVar);
        }
        akyl.i(collectionValues3, acbxVar.b);
        alad aladVarP2 = akzxVarM3.p();
        aooh.e(aladVarP2, "build(...)");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putByteArray("promotion", accbVar.i());
        bundle2.putByteArray("capped_promotion", ((defpackage.acbx) aladVarP2).i());
        ((android.content.BroadcastReceiver.PendingResult) obj2).setResultExtras(bundle2);
        return new adub(java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult, aoln aolnVar) {
        defpackage.acbm acbmVar;
        com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentationBx;
        java.lang.Object obj;
        defpackage.aeab aeabVar;
        java.lang.Object obj2;
        if (aolnVar instanceof defpackage.acbm) {
            acbmVar = (defpackage.acbm) aolnVar;
            int i = acbmVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbmVar.e = i - Integer.MIN_VALUE;
            } else {
                acbmVar = new defpackage.acbm(this, aolnVar);
            }
        } else {
            acbmVar = new defpackage.acbm(this, aolnVar);
        }
        java.lang.Object objR = acbmVar.c;
        aolu aoluVar = aolu.a;
        int i2 = acbmVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                accountRepresentationBx = (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) acbmVar.b;
                java.lang.Object obj3 = acbmVar.a;
                aooc.af(objR);
                obj = obj3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aeabVar = (defpackage.aeab) acbmVar.b;
                java.lang.Object obj4 = acbmVar.a;
                aooc.af(objR);
                obj2 = obj4;
            }
            defpackage.aeab aeabVar2 = (defpackage.aeab) objR;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("fcm_registration_status", aeabVar.a);
            bundle.putString("fcm_registered_environment", aeabVar.b);
            bundle.putInt("fetch_registration_status", aeabVar2.a);
            bundle.putString("fetch_registered_environment", aeabVar2.b);
            ((android.content.BroadcastReceiver.PendingResult) obj2).setResultExtras(bundle);
            return new adub(java.lang.Boolean.TRUE);
        }
        aooc.af(objR);
        android.os.Bundle extras = intent.getExtras();
        java.lang.String string = extras != null ? extras.getString("account") : null;
        g();
        accountRepresentationBx = agab.bx(string);
        aduw aduwVar = aduw.a;
        acbmVar.a = pendingResult;
        acbmVar.b = accountRepresentationBx;
        acbmVar.e = 1;
        objR = r(accountRepresentationBx, aduwVar, acbmVar);
        obj = pendingResult;
        if (objR == aoluVar) {
            return aoluVar;
        }
        defpackage.aeab aeabVar3 = (defpackage.aeab) objR;
        aduw aduwVar2 = aduw.c;
        acbmVar.a = obj;
        acbmVar.b = aeabVar3;
        acbmVar.e = 2;
        java.lang.Object objR2 = r(accountRepresentationBx, aduwVar2, acbmVar);
        if (objR2 == aoluVar) {
            return aoluVar;
        }
        objR = objR2;
        aeabVar = aeabVar3;
        obj2 = obj;
        defpackage.aeab aeabVar4 = (defpackage.aeab) objR;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("fcm_registration_status", aeabVar.a);
        bundle2.putString("fcm_registered_environment", aeabVar.b);
        bundle2.putInt("fetch_registration_status", aeabVar4.a);
        bundle2.putString("fetch_registered_environment", aeabVar4.b);
        ((android.content.BroadcastReceiver.PendingResult) obj2).setResultExtras(bundle2);
        return new adub(java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v3, types: [adzz, java.lang.Object] */
    public final java.lang.Object r(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, aduw aduwVar, aoln aolnVar) {
        defpackage.acbn acbnVar;
        if (aolnVar instanceof defpackage.acbn) {
            acbnVar = (defpackage.acbn) aolnVar;
            int i = acbnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbnVar.c = i - Integer.MIN_VALUE;
            } else {
                acbnVar = new defpackage.acbn(this, aolnVar);
            }
        } else {
            acbnVar = new defpackage.acbn(this, aolnVar);
        }
        java.lang.Object objA = acbnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = acbnVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            ?? r4 = g().a;
            acbnVar.c = 1;
            objA = r4.a(accountRepresentation, aduwVar, acbnVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        aeuh aeuhVar = new aeuh((byte[]) null);
        aeuhVar.d(0);
        aeuhVar.c("");
        return ((ahyn) objA).d(aeuhVar.b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.Object s(java.lang.String str, android.content.Intent intent, android.content.BroadcastReceiver.PendingResult pendingResult, aoln aolnVar) {
        defpackage.acbp acbpVar;
        if (aolnVar instanceof defpackage.acbp) {
            acbpVar = (defpackage.acbp) aolnVar;
            int i = acbpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbpVar.c = i - Integer.MIN_VALUE;
            } else {
                acbpVar = new defpackage.acbp(this, aolnVar);
            }
        } else {
            acbpVar = new defpackage.acbp(this, aolnVar);
        }
        java.lang.Object objK = acbpVar.a;
        aolu aoluVar = aolu.a;
        try {
            switch (acbpVar.c) {
                case 0:
                    aooc.af(objK);
                    switch (str.hashCode()) {
                        case -984653766:
                            if (str.equals("com.google.android.libraries.internal.growth.growthkit.CLEAR_COUNTERS")) {
                                acbpVar.c = 5;
                                objK = k(acbpVar);
                                if (objK == aoluVar) {
                                    return aoluVar;
                                }
                                return (adtz) objK;
                            }
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                        case -981080074:
                            if (str.equals("com.google.android.libraries.internal.growth.growthkit.CLEAR_EVAL_RESULTS")) {
                                acbpVar.c = 8;
                                objK = l(intent, acbpVar);
                                if (objK == aoluVar) {
                                    return aoluVar;
                                }
                                return (adtz) objK;
                            }
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                        case -147885911:
                            if (str.equals("com.google.android.libraries.internal.growth.growthkit.FETCH_EVAL_RESULTS")) {
                                acbpVar.c = 7;
                                objK = n(intent, pendingResult, acbpVar);
                                if (objK == aoluVar) {
                                    return aoluVar;
                                }
                                return (adtz) objK;
                            }
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                        case -140035475:
                            if (str.equals("com.google.android.libraries.internal.growth.growthkit.FETCH_COUNTERS")) {
                                acbpVar.c = 9;
                                objK = o(intent, pendingResult, acbpVar);
                                if (objK == aoluVar) {
                                    return aoluVar;
                                }
                                return (adtz) objK;
                            }
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                        case 424896455:
                            if (str.equals("com.google.android.libraries.internal.growth.growthkit.DELETE_PROMOS")) {
                                acbpVar.c = 2;
                                objK = m(intent, acbpVar);
                                if (objK == aoluVar) {
                                    return aoluVar;
                                }
                                return (adtz) objK;
                            }
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                        case 593764134:
                            if (str.equals("com.google.android.libraries.internal.growth.growthkit.FETCH_PROMOTIONS")) {
                                acbpVar.c = 6;
                                objK = p(intent, pendingResult, acbpVar);
                                if (objK == aoluVar) {
                                    return aoluVar;
                                }
                                return (adtz) objK;
                            }
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                        case 729328716:
                            if (str.equals("com.google.android.libraries.internal.growth.growthkit.SYNC")) {
                                acbpVar.c = 4;
                                objK = w(acbpVar);
                                if (objK == aoluVar) {
                                    return aoluVar;
                                }
                                return (adtz) objK;
                            }
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                        case 1366117509:
                            if (str.equals("com.google.android.libraries.internal.growth.growthkit.GET_REGISTRATION_STATE")) {
                                acbpVar.c = 10;
                                objK = q(intent, pendingResult, acbpVar);
                                if (objK == aoluVar) {
                                    return aoluVar;
                                }
                                return (adtz) objK;
                            }
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                        case 1742998601:
                            if (str.equals("com.google.android.libraries.internal.growth.growthkit.ADD_PREVIEW_PROMO")) {
                                acbpVar.c = 3;
                                objK = i(intent, acbpVar);
                                if (objK == aoluVar) {
                                    return aoluVar;
                                }
                                return (adtz) objK;
                            }
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                        case 1943132320:
                            if (str.equals("com.google.android.libraries.internal.growth.growthkit.ADD_PROMO")) {
                                acbpVar.c = 1;
                                objK = j(intent, acbpVar);
                                if (objK == aoluVar) {
                                    return aoluVar;
                                }
                                return (adtz) objK;
                            }
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                        default:
                            a.c().y("Action not supported [%s]", str);
                            return new defpackage.adtw(new java.lang.IllegalArgumentException(a.bx(str, "Action not supported: ")), adty.I);
                    }
                case 1:
                    aooc.af(objK);
                    return (adtz) objK;
                case 2:
                    aooc.af(objK);
                    return (adtz) objK;
                case 3:
                    aooc.af(objK);
                    return (adtz) objK;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    aooc.af(objK);
                    return (adtz) objK;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    aooc.af(objK);
                    return (adtz) objK;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    aooc.af(objK);
                    return (adtz) objK;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    aooc.af(objK);
                    return (adtz) objK;
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    aooc.af(objK);
                    return (adtz) objK;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    aooc.af(objK);
                    return (adtz) objK;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    aooc.af(objK);
                    return (adtz) objK;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Exception e) {
            hgb.b(a.d(), "Exception thrown in performAction", e);
            return new defpackage.adtx(e, adty.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [aoin, java.lang.Object] */
    public final java.lang.Object t(akhl akhlVar, aoln aolnVar) {
        defpackage.acbq acbqVar;
        adtz adubVar;
        adtz adtzVar;
        if (aolnVar instanceof defpackage.acbq) {
            acbqVar = (defpackage.acbq) aolnVar;
            int i = acbqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbqVar.c = i - Integer.MIN_VALUE;
            } else {
                acbqVar = new defpackage.acbq(this, aolnVar);
            }
        } else {
            acbqVar = new defpackage.acbq(this, aolnVar);
        }
        java.lang.Object objA = acbqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = acbqVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            java.lang.String strA = defpackage.acax.a(a());
            if (strA == null) {
                strA = "";
            }
            amwu amwuVar = this.j;
            if (amwuVar == null) {
                aooh.j("syncDataStore");
                amwuVar = null;
            }
            acxg acxgVar = (acxg) amwuVar.a();
            acbqVar.d = akhlVar;
            acbqVar.c = 1;
            if (acxgVar.d(strA, acbqVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    aooc.af(objA);
                    adtzVar = (adtz) objA;
                    adubVar = adtzVar;
                    if (adubVar instanceof adtv) {
                        return adubVar;
                    }
                    return new adub(java.lang.Boolean.TRUE);
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
                adtzVar = (adtz) objA;
                adubVar = adtzVar;
                if (adubVar instanceof adtv) {
                    return new adub(java.lang.Boolean.TRUE);
                }
                return adubVar;
            }
            akhlVar = acbqVar.d;
            aooc.af(objA);
        }
        h();
        akjx akjxVar = akhlVar.h;
        if (akjxVar == null) {
            akjxVar = akjx.a;
        }
        if (akjxVar.c == 2) {
            defpackage.acim acimVar = (defpackage.acim) h().a.a();
            akjx akjxVar2 = akhlVar.h;
            if (akjxVar2 == null) {
                akjxVar2 = akjx.a;
            }
            akjh akjhVar = akjxVar2.c == 2 ? (akjh) akjxVar2.d : akjh.a;
            aooh.e(akjhVar, "getRatingPromptUi(...)");
            acbqVar.d = null;
            acbqVar.c = 2;
            objA = acimVar.a(akjhVar, acbqVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            adtzVar = (adtz) objA;
            adubVar = adtzVar;
        } else {
            akjx akjxVar3 = akhlVar.h;
            if (akjxVar3 == null) {
                akjxVar3 = akjx.a;
            }
            if (akjxVar3.c == 6) {
                defpackage.acim acimVar2 = (defpackage.acim) h().a.a();
                akjx akjxVar4 = akhlVar.h;
                if (akjxVar4 == null) {
                    akjxVar4 = akjx.a;
                }
                akjh akjhVar2 = (akjxVar4.c == 6 ? (defpackage.akju) akjxVar4.d : defpackage.akju.a).d;
                if (akjhVar2 == null) {
                    akjhVar2 = akjh.a;
                }
                aooh.e(akjhVar2, "getWarmupPromptUi(...)");
                acbqVar.d = null;
                acbqVar.c = 3;
                objA = acimVar2.a(akjhVar2, acbqVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                adtzVar = (adtz) objA;
                adubVar = adtzVar;
            } else {
                adubVar = new adub(java.lang.Boolean.TRUE);
            }
        }
        if (adubVar instanceof adtv) {
            return new adub(java.lang.Boolean.TRUE);
        }
        return adubVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0108 -> B:30:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object u(akhl r11, aoln r12) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver.u(akhl, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object v(java.lang.String str, akhl akhlVar, aoln aolnVar) {
        defpackage.acbs acbsVar;
        java.util.List list;
        if (aolnVar instanceof defpackage.acbs) {
            acbsVar = (defpackage.acbs) aolnVar;
            int i = acbsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbsVar.d = i - Integer.MIN_VALUE;
            } else {
                acbsVar = new defpackage.acbs(this, aolnVar);
            }
        } else {
            acbsVar = new defpackage.acbs(this, aolnVar);
        }
        java.lang.Object objT = acbsVar.b;
        aolu aoluVar = aolu.a;
        int i2 = acbsVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                akhlVar = acbsVar.e;
                str = (java.lang.String) acbsVar.a;
                aooc.af(objT);
            } else if (i2 == 2) {
                list = (java.util.List) acbsVar.a;
                aooc.af(objT);
                acbsVar.a = null;
                acbsVar.d = 3;
                if (aooh.v(list, acbsVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objT);
            }
            return new adub(java.lang.Boolean.TRUE);
        }
        aooc.af(objT);
        a.b().v("Saving custom promotion received from broadcast.");
        acbsVar.a = str;
        acbsVar.e = akhlVar;
        acbsVar.d = 1;
        objT = t(akhlVar, acbsVar);
        if (objT == aoluVar) {
            return aoluVar;
        }
        java.lang.String str2 = str;
        akhl akhlVar2 = akhlVar;
        adtz adtzVar = (adtz) objT;
        if (adtzVar instanceof adtv) {
            return adtzVar;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.acbu acbuVar = new defpackage.acbu(this, arrayList, str2, akhlVar2, null);
        acbsVar.a = arrayList;
        acbsVar.e = null;
        acbsVar.d = 2;
        if (aosv.m(acbuVar, acbsVar) == aoluVar) {
            return aoluVar;
        }
        list = arrayList;
        acbsVar.a = null;
        acbsVar.d = 3;
        if (aooh.v(list, acbsVar) == aoluVar) {
            return aoluVar;
        }
        return new adub(java.lang.Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v11, types: [adzz, java.lang.Object] */
    public final java.lang.Object w(aoln aolnVar) {
        defpackage.acbv acbvVar;
        amwu amwuVar;
        adtv adtvVar;
        if (aolnVar instanceof defpackage.acbv) {
            acbvVar = (defpackage.acbv) aolnVar;
            int i = acbvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acbvVar.c = i - Integer.MIN_VALUE;
            } else {
                acbvVar = new defpackage.acbv(this, aolnVar);
            }
        } else {
            acbvVar = new defpackage.acbv(this, aolnVar);
        }
        java.lang.Object objB = acbvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = acbvVar.c;
        amwu amwuVar2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            adtvVar = (adtz) objB;
            if (!(adtvVar instanceof adtv)) {
                return new adub(java.lang.Boolean.TRUE);
            }
            hgb.b(a.d(), "Failed to sync", adtvVar.b());
            return adtvVar;
        }
        aooc.af(objB);
        aiof aiofVar = a;
        aiofVar.b().v("Syncing all accounts with the server.");
        acci acciVar = this.h;
        if (acciVar == null) {
            aooh.j("providerInstaller");
            acciVar = null;
        }
        adtv adtvVarA = acciVar.a(a());
        if (adtvVarA instanceof adtv) {
            adtv adtvVar2 = adtvVarA;
            hgb.b(aiofVar.d(), "Failed to install security provider, GrowthKit sync can't run.", adtvVar2.b());
            return adtvVar2;
        }
        aoin aoinVar = this.m;
        if (aoinVar == null) {
            aooh.j("inappPushEnabledFlag");
            aoinVar = null;
        }
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            ?? r8 = g().a;
            akti aktiVar = akti.h;
            aduw aduwVar = aduw.b;
            acbvVar.c = 1;
            objB = r8.b(aktiVar, aduwVar, acbvVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        }
        amwuVar = this.f;
        if (amwuVar == null) {
            aooh.j("promotionSync");
        } else {
            amwuVar2 = amwuVar;
        }
        achv achvVar = (achv) amwuVar2.a();
        akst akstVar = akst.n;
        acbvVar.c = 2;
        objB = achvVar.b(akstVar, acbvVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        adtvVar = (adtz) objB;
        if (!(adtvVar instanceof adtv)) {
            return new adub(java.lang.Boolean.TRUE);
        }
        hgb.b(a.d(), "Failed to sync", adtvVar.b());
        return adtvVar;
        adtv adtvVar3 = (adtz) objB;
        if (adtvVar3 instanceof adtv) {
            hgb.b(a.d(), "Failed to register", adtvVar3.b());
            return adtvVar3;
        }
        amwuVar = this.f;
        if (amwuVar == null) {
            aooh.j("promotionSync");
        } else {
            amwuVar2 = amwuVar;
        }
        achv achvVar2 = (achv) amwuVar2.a();
        akst akstVar2 = akst.n;
        acbvVar.c = 2;
        objB = achvVar2.b(akstVar2, acbvVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        adtvVar = (adtz) objB;
        if (!(adtvVar instanceof adtv)) {
            return new adub(java.lang.Boolean.TRUE);
        }
        hgb.b(a.d(), "Failed to sync", adtvVar.b());
        return adtvVar;
    }

    public final adao x() {
        adao adaoVar = this.q;
        if (adaoVar != null) {
            return adaoVar;
        }
        aooh.j("evalResultStore");
        return null;
    }

    public final adao y() {
        adao adaoVar = this.p;
        if (adaoVar != null) {
            return adaoVar;
        }
        aooh.j("presentedPromosStore");
        return null;
    }

    public final adao z() {
        adao adaoVar = this.o;
        if (adaoVar != null) {
            return adaoVar;
        }
        aooh.j("promotionsStore");
        return null;
    }
}
