package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jtv implements defpackage.ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jtv(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r1v60, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v93, types: [ahyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, sqn] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kfj] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kfj] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.Object obj2;
        defpackage.ajcq ajcqVarH;
        j$.util.Map mapE;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i = 14;
        int i2 = 0;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                defpackage.aigf aigfVar = (defpackage.aigf) obj;
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                defpackage.ailj it = ((defpackage.aigf) this.b).keySet().iterator();
                while (true) {
                    java.lang.Object obj5 = this.a;
                    if (!it.hasNext()) {
                        defpackage.jtw jtwVar = (defpackage.jtw) obj5;
                        if (jtwVar.b == null) {
                            jtwVar.b = java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli());
                        }
                        return aigbVar.e(true);
                    }
                    hkd hkdVar = (hkd) it.next();
                    if (aigfVar.containsKey(hkdVar)) {
                        aigbVar.i(hkdVar, ((jsj) aigfVar.get(hkdVar)).a);
                        long jMax = ((jsj) aigfVar.get(hkdVar)).b;
                        java.lang.Long lValueOf = java.lang.Long.valueOf(jMax);
                        defpackage.jtw jtwVar2 = (defpackage.jtw) obj5;
                        if (jtwVar2.b == null) {
                            lValueOf.getClass();
                        } else {
                            lValueOf.getClass();
                            jMax = java.lang.Math.max(jMax, jtwVar2.b.longValue());
                        }
                        jtwVar2.b = java.lang.Long.valueOf(jMax);
                    } else {
                        aigbVar.i(hkdVar, spa.a);
                    }
                }
                break;
            case 1:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                obj2 = this.b;
                if (!zBooleanValue || ((java.lang.Long) ((defpackage.jst) this.a).c.a()).longValue() == 0) {
                    defpackage.aigb aigbVar2 = new defpackage.aigb(4);
                    j$.lang.Iterable.-EL.forEach(((defpackage.aigf) obj2).keySet(), new fcg(aigbVar2, 7));
                    return aigbVar2.e(true);
                }
                return obj2;
            case 2:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                jrs jrsVar = new jrs(this.a, 17);
                j$.util.Optional optional = (j$.util.Optional) this.b;
                if (true == optional.isPresent()) {
                    java.lang.Object obj6 = optional.get();
                    java.lang.Object obj7 = jrsVar.a;
                    ((defpackage.jyy) obj7).d.q((defpackage.aeun) obj6, defpackage.ruc.E, defpackage.rub.c);
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.jyy.a.c()).i(defpackage.zct.b)).k(th)).l("com/android/dialer/calllog/coalescer/CoalescedRowsDao", "saveToFileForAllCallsInConversationHistory", (char) 131, "CoalescedRowsDao.java")).v("Unable to save coalesced rows for conversation history.");
                return null;
            case 3:
                final j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (optional2.isPresent()) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.jyy.a.b()).l("com/android/dialer/calllog/coalescer/CoalescedRowsDao", "loadForAllCallsInConversationHistory", 166, "CoalescedRowsDao.java")).v("Finished loading coalesced rows for conversation history.");
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.jyy.a.b()).l("com/android/dialer/calllog/coalescer/CoalescedRowsDao", "loadForAllCallsInConversationHistory", 168, "CoalescedRowsDao.java")).v("No data has been written to the coalesced row data store yet.");
                }
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.a;
                defpackage.jyv jyvVar = new defpackage.jyv(obj9, i2);
                j$.util.Optional optional3 = (j$.util.Optional) obj8;
                if (true == optional3.isPresent()) {
                    java.lang.Object obj10 = optional3.get();
                    java.lang.Object obj11 = jyvVar.a;
                    ((defpackage.jyy) obj11).d.q((defpackage.aeun) obj10, defpackage.ruc.D, defpackage.rub.b);
                }
                return (j$.util.Optional) j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(((defpackage.jyy) obj9).e, new java.util.function.UnaryOperator() { // from class: jyw
                    @Override // java.util.function.Function
                    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                        return j$.util.function.Function.-CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj12) {
                        j$.util.Optional optional4 = (j$.util.Optional) obj12;
                        return optional4 == null ? optional2 : optional4;
                    }

                    @Override // java.util.function.Function
                    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                        return j$.util.function.Function.-CC.$default$compose(this, function);
                    }
                });
            case 4:
                defpackage.jyv jyvVar2 = new defpackage.jyv(this.a, i3);
                j$.util.Optional optional4 = (j$.util.Optional) this.b;
                if (true == optional4.isPresent()) {
                    java.lang.Object obj12 = optional4.get();
                    java.lang.Object obj13 = jyvVar2.a;
                    ((defpackage.jyy) obj13).d.q((defpackage.aeun) obj12, defpackage.ruc.E, defpackage.rub.b);
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.jyy.a.b()).l("com/android/dialer/calllog/coalescer/CoalescedRowsDao", "saveToFileForAllCallsInConversationHistory", 114, "CoalescedRowsDao.java")).v("Finished saving coalesced rows for conversation history.");
                return null;
            case 5:
                java.util.concurrent.atomic.AtomicLong atomicLong = ((defpackage.kvh) this.b).f;
                atomicLong.set(0L);
                defpackage.ailj it2 = ((defpackage.aigf) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    ?? r3 = this.a;
                    java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                    java.lang.Long l = (java.lang.Long) entry.getKey();
                    defpackage.kfk kfkVar = (defpackage.kfk) r3;
                    if (!kfkVar.a.containsKey(l) && !kfkVar.c.contains(l) && entry.getValue() != null) {
                        lbh lbhVar = (lbh) entry.getValue();
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        contentValues.put("call_recording_details", lbhVar.b.i());
                        r3.d(l.longValue(), contentValues);
                        j$.util.concurrent.atomic.DesugarAtomicLong.getAndAccumulate(atomicLong, lbhVar.c, new kvc(0));
                    }
                }
                return null;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aift aiftVar = new defpackage.aift(4);
                defpackage.ailj it3 = ((defpackage.aigf) obj).entrySet().iterator();
                while (it3.hasNext()) {
                    ?? r5 = this.a;
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it3.next();
                    java.lang.Long l2 = (java.lang.Long) entry2.getKey();
                    long jLongValue = l2.longValue();
                    if (((defpackage.kfk) r5).c.contains(l2)) {
                        ajcqVarH = defpackage.ajcm.a;
                    } else {
                        java.lang.Object obj14 = this.b;
                        lkq lkqVar = (lkq) entry2.getValue();
                        defpackage.lbu lbuVar = (defpackage.lbu) obj14;
                        ajcqVarH = defpackage.ahvr.H(lbuVar.c(lkqVar), new lbt(lbuVar, (defpackage.kfj) r5, jLongValue, lkqVar), lbuVar.a);
                    }
                    aiftVar.i(ajcqVarH);
                }
                return aiftVar.g();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.sqi.a.c()).i(defpackage.zct.b)).k((java.lang.Throwable) obj)).l("com/android/dialer/phonelookup/composite/CompositePhoneLookup", "buildSubmapAndGetMostRecentInfo", 336, "CompositePhoneLookup.java")).y("%s - getMostRecentInfo failed", this.a.g());
                return this.b;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aigf aigfVar2 = (defpackage.aigf) obj;
                defpackage.aigb aigbVar3 = new defpackage.aigb(4);
                defpackage.ailj it4 = ((defpackage.aigf) this.b).keySet().iterator();
                while (it4.hasNext()) {
                    hkd hkdVar2 = (hkd) it4.next();
                    defpackage.akzx akzxVarM = spn.a.m();
                    defpackage.ailj it5 = aigfVar2.entrySet().iterator();
                    while (it5.hasNext()) {
                        java.util.Map.Entry entry3 = (java.util.Map.Entry) it5.next();
                        java.lang.Object obj15 = ((defpackage.aigf) entry3.getValue()).get(hkdVar2);
                        if (obj15 == null) {
                            throw new java.lang.IllegalStateException("A sublookup didn't return an info for number: ".concat(java.lang.String.valueOf(defpackage.aais.aC(hkdVar2.c))));
                        }
                        ((defpackage.sqn) entry3.getKey()).h(akzxVarM, obj15);
                    }
                    aigbVar3.i(hkdVar2, akzxVarM.r());
                }
                java.lang.Object obj16 = this.a;
                mapE = aigbVar3.e(true);
                if (((java.lang.Boolean) ((defpackage.sqi) obj16).g.a()).booleanValue()) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.sqi.a.b()).l("com/android/dialer/phonelookup/composite/CompositePhoneLookup", "buildCombinedMap", 374, "CompositePhoneLookup.java")).y("Updated phone lookup info: %s", defpackage.aais.aD(mapE));
                }
                return mapE;
            case 9:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.getClass();
                obj2 = this.b;
                if (bool.booleanValue()) {
                    return ((defpackage.sqo) this.a).b.aq((defpackage.aigf) obj2);
                }
                return obj2;
            case 10:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                bool2.getClass();
                obj2 = this.b;
                if (bool2.booleanValue()) {
                    return ((defpackage.sqq) this.a).k.aq((defpackage.aigf) obj2);
                }
                return obj2;
            case 11:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                if (bool3 == null) {
                    throw new java.lang.IllegalArgumentException();
                }
                obj3 = this.b;
                if (!bool3.booleanValue()) {
                    return (defpackage.aigf) j$.util.Collection.-EL.stream(((defpackage.aigf) obj3).keySet()).collect(defpackage.aido.b(new rat(14), new pei(this.a, 15)));
                }
                return obj3;
            case 12:
                obj3 = (defpackage.tcp) obj;
                defpackage.jyv jyvVar3 = new defpackage.jyv(this.a, i);
                j$.util.Optional optional5 = (j$.util.Optional) this.b;
                if (true == optional5.isPresent()) {
                    java.lang.Object obj17 = optional5.get();
                    java.lang.Object obj18 = jyvVar3.a;
                    ((defpackage.tcv) obj18).f.p((defpackage.aeun) obj17, defpackage.ruc.bu);
                }
                return obj3;
            case 13:
                ((defpackage.adfr) this.a).c(this.b);
                return obj;
            case 14:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.adnr.a.b()).l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl", "init", 171, "CallAvatarSessionManagerImpl.java")).y("init(): Channel '%s' initialized successfully.", this.b);
                java.lang.Object obj19 = this.a;
                synchronized (obj19) {
                    ((defpackage.adnq) obj19).b = true;
                    ((defpackage.adnq) obj19).a = j$.util.Optional.empty();
                    break;
                }
                return null;
            case 15:
                java.lang.Integer num = (java.lang.Integer) obj;
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) defpackage.adqb.a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "doInit", 141, "AudioFileSuperpackProvider.java");
                java.lang.Object obj20 = this.a;
                if (num == null || num.intValue() < 0) {
                    obj4 = num;
                    obj4 = "Unknown";
                }
                obj4 = num;
                aimwVar.I("Successfully loaded embedded superpacks manifest for '%s' (version %s).", this.b, obj4);
                try {
                    defpackage.adrg adrgVar = ((defpackage.adqb) obj20).h;
                    java.lang.String str = ((defpackage.adqb) obj20).c;
                    int i4 = ((defpackage.adqb) obj20).d;
                    defpackage.ahct ahctVarF = adrgVar.f("getSuperpackManifest");
                    ahctVarF.g();
                    ((defpackage.adqb) obj20).g = (defpackage.aihd) j$.util.Collection.-EL.stream(ahctVarF.e(str, i4, "getSuperpackManifest").f()).map(new defpackage.vaq(13)).collect(defpackage.aido.b);
                    break;
                } catch (java.io.IOException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.adqb.a.c()).k(e)).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "populateDeclaredPacks", 169, "AudioFileSuperpackProvider.java")).y("Failed to query manifest of superpack '%s'.", ((defpackage.adqb) obj20).c);
                }
                ((defpackage.adqb) obj20).d();
                return null;
            case 16:
                java.lang.String str2 = (java.lang.String) obj;
                java.lang.String str3 = ((defpackage.zyy) this.a).i;
                return defpackage.gou.z(str3, str2, (byte[]) ((defpackage.gou) ((defpackage.zzx) this.b).a).b.get(new defpackage.ahyo(str2, str3)));
            case 17:
                android.net.Uri uri = (android.net.Uri) obj;
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                intentFilter.addDataScheme(uri.getScheme());
                intentFilter.addDataPath(uri.getPath(), 0);
                int i5 = defpackage.airu.a;
                intentFilter.addDataPath(uri.buildUpon().path(defpackage.aisb.b.b(uri.getPath(), java.nio.charset.StandardCharsets.UTF_8).toString()).build().getPath(), 0);
                intentFilter.addDataAuthority("*", null);
                ?? r2 = this.b;
                defpackage.afgi afgiVar = new defpackage.afgi(r2);
                java.lang.Object obj21 = this.a;
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    defpackage.afgk afgkVar = (defpackage.afgk) obj21;
                    da$.ExternalSyntheticApiModelOutline1.m(afgkVar.b, afgiVar, intentFilter, afgkVar.d, afgkVar.e, 2);
                } else {
                    defpackage.afgk afgkVar2 = (defpackage.afgk) obj21;
                    afgkVar2.b.registerReceiver(afgiVar, intentFilter, afgkVar2.d, afgkVar2.e);
                }
                synchronized (((defpackage.afgk) obj21).i) {
                    ((defpackage.afgk) obj21).h.t(uri, r2);
                    break;
                }
                return null;
            case 18:
                mapE = (defpackage.aify) obj;
                int size = mapE.size();
                while (i2 < size) {
                    java.lang.Object obj22 = this.a;
                    java.lang.Object obj23 = this.b;
                    defpackage.agoq agoqVar = (defpackage.agoq) mapE.get(i2);
                    defpackage.ahvr.cf(((java.lang.String) obj23).equals(agoqVar.j), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", obj22, obj23, agoqVar.j);
                    i2++;
                }
                return mapE;
            case 19:
                defpackage.agqi agqiVar = (defpackage.agqi) this.a.apply((defpackage.agqk) obj);
                ((java.util.concurrent.atomic.AtomicReference) this.b).set(agqiVar.a);
                return agqiVar.b;
            default:
                mapE = (defpackage.ahbm) obj;
                defpackage.aooh.f(mapE, "result");
                if (!mapE.a) {
                    defpackage.ahbv ahbvVar = (defpackage.ahbv) this.a;
                    j$.util.Optional optional6 = (j$.util.Optional) ahbvVar.a;
                    if (optional6.isPresent()) {
                        ((defpackage.ahda) ahbvVar.f).b((java.lang.String) this.b);
                        ((defpackage.aezm) optional6.get()).a();
                    }
                }
                return mapE;
        }
    }

    public /* synthetic */ jtv(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
