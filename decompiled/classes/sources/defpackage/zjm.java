package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zjm {
    public final java.lang.Object a;
    public final java.lang.Object b;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Iterable, java.lang.Object] */
    public zjm(java.util.Set set, byte[] bArr) {
        if (set == null) {
            defpackage.aooh.i("definingEventSet");
        }
        this.b = set;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            defpackage.ajsz.bv(arrayList, ((defpackage.aacy) it.next()).b);
        }
        int iAL = defpackage.ajsz.aL(arrayList.size());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iAL < 16 ? 16 : iAL);
        for (java.lang.Object obj : arrayList) {
            linkedHashMap.put(obj, java.lang.Boolean.FALSE);
        }
        this.a = new java.util.LinkedHashMap(linkedHashMap);
    }

    public static defpackage.rsr D(java.lang.String str, java.lang.String str2) {
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("phone_account_component_name").aI("=", str));
        rsrVar.aC(new defpackage.kaw("phone_account_id").aI("=", str2));
        return rsrVar.aB();
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0257 A[Catch: ExecutionException -> 0x026a, all -> 0x0286, TRY_LEAVE, TryCatch #7 {ExecutionException -> 0x026a, blocks: (B:4:0x0027, B:6:0x002b, B:8:0x0031, B:10:0x003f, B:11:0x0046, B:13:0x0050, B:14:0x0056, B:45:0x00fb, B:85:0x01cb, B:119:0x0257, B:117:0x0254, B:118:0x0256, B:34:0x00ce, B:124:0x0263, B:125:0x0269), top: B:148:0x0027, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0056 A[Catch: ExecutionException -> 0x026a, all -> 0x0286, TRY_LEAVE, TryCatch #7 {ExecutionException -> 0x026a, blocks: (B:4:0x0027, B:6:0x002b, B:8:0x0031, B:10:0x003f, B:11:0x0046, B:13:0x0050, B:14:0x0056, B:45:0x00fb, B:85:0x01cb, B:119:0x0257, B:117:0x0254, B:118:0x0256, B:34:0x00ce, B:124:0x0263, B:125:0x0269), top: B:148:0x0027, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x007b A[Catch: all -> 0x0262, TryCatch #2 {all -> 0x0262, blocks: (B:15:0x0059, B:18:0x007b, B:21:0x0089, B:23:0x0091, B:39:0x00e3, B:41:0x00ea, B:42:0x00f5, B:26:0x009d, B:28:0x00a3, B:32:0x00ba, B:29:0x00ac, B:31:0x00b2, B:33:0x00c9, B:36:0x00d7), top: B:144:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3 A[Catch: all -> 0x0262, TryCatch #2 {all -> 0x0262, blocks: (B:15:0x0059, B:18:0x007b, B:21:0x0089, B:23:0x0091, B:39:0x00e3, B:41:0x00ea, B:42:0x00f5, B:26:0x009d, B:28:0x00a3, B:32:0x00ba, B:29:0x00ac, B:31:0x00b2, B:33:0x00c9, B:36:0x00d7), top: B:144:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea A[Catch: all -> 0x0262, TryCatch #2 {all -> 0x0262, blocks: (B:15:0x0059, B:18:0x007b, B:21:0x0089, B:23:0x0091, B:39:0x00e3, B:41:0x00ea, B:42:0x00f5, B:26:0x009d, B:28:0x00a3, B:32:0x00ba, B:29:0x00ac, B:31:0x00b2, B:33:0x00c9, B:36:0x00d7), top: B:144:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5 A[Catch: all -> 0x0262, TRY_LEAVE, TryCatch #2 {all -> 0x0262, blocks: (B:15:0x0059, B:18:0x007b, B:21:0x0089, B:23:0x0091, B:39:0x00e3, B:41:0x00ea, B:42:0x00f5, B:26:0x009d, B:28:0x00a3, B:32:0x00ba, B:29:0x00ac, B:31:0x00b2, B:33:0x00c9, B:36:0x00d7), top: B:144:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115 A[Catch: all -> 0x011d, TryCatch #9 {all -> 0x011d, blocks: (B:48:0x0104, B:50:0x0115, B:51:0x0118), top: B:143:0x0104, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0118 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #9 {all -> 0x011d, blocks: (B:48:0x0104, B:50:0x0115, B:51:0x0118), top: B:143:0x0104, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x013c A[Catch: all -> 0x01f8, TRY_LEAVE, TryCatch #8 {all -> 0x01f8, blocks: (B:61:0x0136, B:63:0x013c, B:83:0x01c4, B:88:0x01d1, B:89:0x01d7, B:90:0x01d8, B:91:0x01f7, B:64:0x0142, B:66:0x0155, B:67:0x015c, B:69:0x016e, B:72:0x017a, B:74:0x0182, B:77:0x018e, B:79:0x0192, B:80:0x0198, B:81:0x01aa, B:82:0x01af), top: B:150:0x0136, outer: #1, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0155 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:64:0x0142, B:66:0x0155, B:67:0x015c, B:69:0x016e, B:72:0x017a, B:74:0x0182, B:77:0x018e, B:79:0x0192, B:80:0x0198, B:81:0x01aa, B:82:0x01af), top: B:142:0x0142, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x016e A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:64:0x0142, B:66:0x0155, B:67:0x015c, B:69:0x016e, B:72:0x017a, B:74:0x0182, B:77:0x018e, B:79:0x0192, B:80:0x0198, B:81:0x01aa, B:82:0x01af), top: B:142:0x0142, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8 A[Catch: all -> 0x01f8, TryCatch #8 {all -> 0x01f8, blocks: (B:61:0x0136, B:63:0x013c, B:83:0x01c4, B:88:0x01d1, B:89:0x01d7, B:90:0x01d8, B:91:0x01f7, B:64:0x0142, B:66:0x0155, B:67:0x015c, B:69:0x016e, B:72:0x017a, B:74:0x0182, B:77:0x018e, B:79:0x0192, B:80:0x0198, B:81:0x01aa, B:82:0x01af), top: B:150:0x0136, outer: #1, inners: #0 }] */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0136, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01d8, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final zhq E(android.telecom.Call r18) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjm.E(android.telecom.Call):zhq");
    }

    public static defpackage.zjm h(defpackage.aoin aoinVar) {
        return new defpackage.zjm(aoinVar, (defpackage.zcs) new defpackage.vkc(2));
    }

    public static /* synthetic */ java.lang.Object i(defpackage.zjm zjmVar, zce zceVar, java.util.List list, defpackage.aomy aomyVar) {
        defpackage.zcd zcdVar = new defpackage.zcd(zceVar, list, null, java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()), zcf.b, 4);
        defpackage.zzx zzxVar = (defpackage.zzx) zjmVar.b;
        zzxVar.l(zcdVar);
        java.lang.Object objA = aomyVar.a();
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        zzxVar.l(defpackage.zcd.a(zcdVar, defpackage.wsc.G(objA), java.lang.Long.valueOf(epochMilli), zcf.c));
        return objA;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static /* synthetic */ defpackage.ajcq j(defpackage.zjm zjmVar, zce zceVar, java.util.List list, defpackage.aomy aomyVar, defpackage.aonj aonjVar, int i) {
        if ((i & 8) != 0) {
            aonjVar = new yrz(6);
        }
        if ((i & 2) != 0) {
            list = null;
        }
        defpackage.aooh.f(aonjVar, "successResultConverter");
        defpackage.zcd zcdVar = new defpackage.zcd(zceVar, list, null, java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()), zcf.b, 4);
        ((defpackage.zzx) zjmVar.b).l(zcdVar);
        defpackage.ajcq ajcqVar = (defpackage.ajcq) aomyVar.a();
        defpackage.ahvr.J(ajcqVar, new ynd(zjmVar, aonjVar, zcdVar, 2), zjmVar.a);
        return ajcqVar;
    }

    public static java.lang.String o(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        java.lang.String id;
        if (android.os.Build.VERSION.SDK_INT < 33) {
            int i = defpackage.airu.a;
            id = airt.a.b(phoneAccountHandle.getId(), java.nio.charset.StandardCharsets.UTF_8).toString();
        } else {
            id = phoneAccountHandle.getId();
        }
        return java.lang.String.format(java.util.Locale.US, "%s:%s", phoneAccountHandle.getComponentName().flattenToString(), id);
    }

    @java.lang.Deprecated
    public static j$.util.Optional r(defpackage.zjm zjmVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalG = zjmVar.g();
        taj tajVar = new taj(phoneAccountHandle, 18);
        if (true == optionalG.isPresent()) {
            optionalG = ((defpackage.vda) optionalG.get()).c((android.telecom.PhoneAccountHandle) tajVar.a);
            optionalG.getClass();
        }
        return true == optionalG.isPresent() ? j$.util.Optional.ofNullable(((abtr) optionalG.get()).e) : optionalG;
    }

    @java.lang.Deprecated
    public static j$.util.Optional s(defpackage.zjm zjmVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalG = zjmVar.g();
        defpackage.okr okrVar = new defpackage.okr(phoneAccountHandle, 4);
        if (true == optionalG.isPresent()) {
            optionalG = ((defpackage.vda) optionalG.get()).c((android.telecom.PhoneAccountHandle) okrVar.a);
            optionalG.getClass();
        }
        return true == optionalG.isPresent() ? j$.util.Optional.ofNullable(((abtr) optionalG.get()).f) : optionalG;
    }

    @java.lang.Deprecated
    public static j$.util.Optional t(defpackage.zjm zjmVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalG = zjmVar.g();
        taj tajVar = new taj(phoneAccountHandle, 19);
        if (true == optionalG.isPresent()) {
            optionalG = ((defpackage.vda) optionalG.get()).c((android.telecom.PhoneAccountHandle) tajVar.a);
            optionalG.getClass();
        }
        return true == optionalG.isPresent() ? j$.util.Optional.ofNullable(((abtr) optionalG.get()).d) : optionalG;
    }

    public final java.lang.Object A(zdm zdmVar, defpackage.aoln aolnVar) {
        return ((defpackage.ahbq) this.a).i(zdmVar.a(), "com.google.android.dialer", aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:24:0x0059, B:26:0x006d), top: B:39:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aonj, java.lang.Object] */
    public final java.lang.Object B(defpackage.ruc rucVar, ugi ugiVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ugl uglVar;
        ugi ugiVar2;
        j$.util.Optional optional;
        java.lang.Throwable th;
        ugi ugiVar3;
        java.lang.Object obj;
        ugi ugiVar4;
        ubv ubvVar;
        if (aolnVar instanceof ugl) {
            uglVar = (ugl) aolnVar;
            int i = uglVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uglVar.c = i - Integer.MIN_VALUE;
            } else {
                uglVar = new ugl(this, aolnVar);
            }
        } else {
            uglVar = new ugl(this, aolnVar);
        }
        java.lang.Object obj2 = uglVar.b;
        java.lang.Object obj3 = defpackage.aolu.a;
        int i2 = uglVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            j$.util.Optional optionalA = rucVar.a();
            try {
                uglVar.a = rucVar;
                uglVar.d = ugiVar;
                uglVar.e = optionalA;
                uglVar.c = 1;
                java.lang.Object objA = aonjVar.a(uglVar);
                if (objA == obj3) {
                    return obj3;
                }
                ugiVar3 = ugiVar;
                optional = optionalA;
                obj2 = objA;
                obj = rucVar;
                ugiVar4 = ugiVar3;
                ubvVar = new ubv(new slv(obj, ugiVar4, 17, (byte[]) null), 11);
                if (true == optional.isPresent()) {
                    ubvVar.a.a(optional.get());
                }
                return obj2;
            } catch (java.lang.Throwable th2) {
                ugiVar2 = ugiVar;
                optional = optionalA;
                th = th2;
                obj = rucVar;
                ugiVar4 = ugiVar2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j$.util.Optional optional2 = uglVar.e;
            ugi ugiVar5 = uglVar.d;
            java.lang.Object obj4 = uglVar.a;
            try {
                defpackage.aooc.af(obj2);
                ugiVar3 = ugiVar5;
                optional = optional2;
                obj = obj4;
                ugiVar4 = ugiVar3;
                try {
                    ubvVar = new ubv(new slv(obj, ugiVar4, 17, (byte[]) null), 11);
                    if (true == optional.isPresent()) {
                        ubvVar.a.a(optional.get());
                    }
                    return obj2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                ugiVar2 = ugiVar5;
                optional = optional2;
                obj = obj4;
                ugiVar4 = ugiVar2;
            }
        }
        ubv ubvVar2 = new ubv(new slv(obj, ugiVar4, 18, (byte[]) null), 12);
        if (true == optional.isPresent()) {
            ubvVar2.a.a(optional.get());
        }
        throw th;
    }

    public final j$.util.Optional C(java.lang.String str) {
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("number").aI("=", str));
        rsrVar.aC(defpackage.rsr.aA(new defpackage.kaw("type").aI("=", 2)));
        defpackage.rsr rsrVarAB = rsrVar.aB();
        android.database.Cursor cursorB = ((defpackage.ojo) this.b).b(android.provider.CallLog.Calls.CONTENT_URI, new java.lang.String[]{"date"}, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, "date DESC");
        try {
            if (cursorB == null) {
                return j$.util.Optional.empty();
            }
            j$.util.Optional optionalEmpty = !cursorB.moveToFirst() ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Long.valueOf(cursorB.getLong(cursorB.getColumnIndex("date"))));
            cursorB.close();
            return optionalEmpty;
        } catch (java.lang.Throwable th) {
            if (cursorB == null) {
                throw th;
            }
            try {
                cursorB.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final java.lang.Object a() {
        return ((defpackage.ahzi) ((java.util.concurrent.atomic.AtomicReference) this.b).get()).eZ();
    }

    public final void b() {
        ((java.util.concurrent.atomic.AtomicReference) this.b).set(defpackage.ahvr.bI(new defpackage.rwp(this.a, 13)));
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [aonj, java.lang.Object] */
    public final j$.util.Optional c(java.lang.String str) {
        j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(((defpackage.aiaw) this.b).a.values()).filter(new defpackage.vpl(new xms(str, 16), 17)).findFirst();
        xbz xbzVar = new xbz(new yrz(8), 6);
        if (true == optionalFindFirst.isPresent()) {
            optionalFindFirst = j$.util.Optional.ofNullable(defpackage.a.l(xbzVar.a, optionalFindFirst.get()));
        }
        defpackage.aooh.e(optionalFindFirst, "map(...)");
        return optionalFindFirst;
    }

    public final java.lang.String d(android.telecom.Call call) {
        defpackage.aooh.f(call, "call");
        return E(call).a;
    }

    public final java.lang.String e(android.telecom.Call call) {
        defpackage.aooh.f(call, "call");
        return E(call).b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zcs] */
    public final j$.util.Optional f() {
        return !this.b.a() ? j$.util.Optional.empty() : j$.util.Optional.of(this.a);
    }

    public final j$.util.Optional g() {
        j$.util.Optional optional = (j$.util.Optional) this.b;
        if (!optional.isPresent()) {
            return j$.util.Optional.empty();
        }
        j$.util.Optional optional2 = (j$.util.Optional) this.a;
        defpackage.ahvr.bZ(optional2.isPresent(), "the isEnabledFn should be present when the feature is compiled in");
        return !((defpackage.zcr) optional2.orElseThrow()).a() ? j$.util.Optional.empty() : optional;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq k(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.zjm zjmVar = (defpackage.zjm) this.a;
        if (!zjmVar.g().isPresent()) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            return optionalEmpty == null ? defpackage.ajcm.a : new defpackage.ajcm(optionalEmpty);
        }
        defpackage.ajcq ajcqVarA = ((defpackage.vda) zjmVar.g().orElseThrow()).a(phoneAccountHandle);
        defpackage.kvf kvfVar = new defpackage.kvf(9);
        ?? r3 = this.b;
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), kvfVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarA, ahqvVar);
        ajcqVarA.c(ajamVar, defpackage.aiql.t(r3, ajamVar));
        return ajamVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq l(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.zjm zjmVar = (defpackage.zjm) this.a;
        return !zjmVar.g().isPresent() ? defpackage.aiql.z(j$.util.Optional.empty()) : defpackage.ahvr.H(((defpackage.vda) zjmVar.g().orElseThrow()).a(phoneAccountHandle), new defpackage.vak(5), this.b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq m(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.zjm zjmVar = (defpackage.zjm) this.a;
        return !zjmVar.g().isPresent() ? defpackage.aiql.z(j$.util.Optional.empty()) : defpackage.ahvr.H(((defpackage.vda) zjmVar.g().orElseThrow()).a(phoneAccountHandle), new defpackage.vak(4), this.b);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq n(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.F(new uwl(this, phoneAccountHandle, 10, (byte[]) null), this.b);
    }

    public final void p() {
        ((defpackage.tvn) this.b).r((android.app.Activity) this.a, 2132084702);
    }

    public final void q(int i) {
        ((defpackage.tvn) this.b).r((android.app.Activity) this.a, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoxh, java.lang.Object] */
    public final java.lang.Object u(defpackage.aoln aolnVar) {
        return defpackage.aoov.au(this.a, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object v(defpackage.aoln aolnVar) {
        unr unrVar;
        if (aolnVar instanceof unr) {
            unrVar = (unr) aolnVar;
            int i = unrVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                unrVar.b = i - Integer.MIN_VALUE;
            } else {
                unrVar = new unr(this, aolnVar);
            }
        } else {
            unrVar = new unr(this, aolnVar);
        }
        java.lang.Object obj = unrVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = unrVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            ?? r5 = this.b;
            uns unsVar = new uns((defpackage.aoln) null, 0);
            unrVar.b = 1;
            if (r5.a(unsVar, unrVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object w(java.lang.String str, defpackage.aoln aolnVar) {
        uhf uhfVar;
        if (aolnVar instanceof uhf) {
            uhfVar = (uhf) aolnVar;
            int i = uhfVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                uhfVar.b = i - Integer.MIN_VALUE;
            } else {
                uhfVar = new uhf(this, aolnVar);
            }
        } else {
            uhfVar = new uhf(this, aolnVar);
        }
        java.lang.Object objAj = uhfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = uhfVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            ?? r8 = this.a;
            ufr ufrVar = new ufr(this, str, (defpackage.aoln) null, 9);
            uhfVar.b = 1;
            objAj = defpackage.aoov.aj(r8, ufrVar, uhfVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        uhd uhdVar = (uhd) objAj;
        if (uhdVar != null) {
            return uhdVar.b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object x(zdm zdmVar, defpackage.aoln aolnVar) throws defpackage.zdo {
        defpackage.aoln ugjVar;
        zdm zdmVar2;
        if (aolnVar instanceof ugj) {
            ugjVar = (ugj) aolnVar;
            int i = ((ugj) ugjVar).c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ((ugj) ugjVar).c = i - Integer.MIN_VALUE;
            } else {
                ugjVar = new ugj(this, aolnVar);
            }
        } else {
            ugjVar = new ugj(this, aolnVar);
        }
        java.lang.Object objZ = ((ugj) ugjVar).b;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = ((ugj) ugjVar).c;
        if (i2 == 0) {
            defpackage.aooc.af(objZ);
            ((ugj) ugjVar).a = zdmVar;
            ((ugj) ugjVar).c = 1;
            objZ = z(zdmVar, ugjVar);
            if (objZ != obj) {
            }
            zdmVar2 = zdmVar;
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objZ);
            return objZ;
        }
        java.lang.Object obj2 = ((ugj) ugjVar).a;
        defpackage.aooc.af(objZ);
        zdmVar2 = obj2;
        zdmVar2 = zdmVar;
        if (((zdp) objZ) != zdp.b) {
            throw new defpackage.zdo();
        }
        ((ugj) ugjVar).a = null;
        ((ugj) ugjVar).c = 2;
        java.lang.Object objA = A(zdmVar2, ugjVar);
        if (objA != obj) {
            return objA;
        }
        zdmVar2 = zdmVar;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, ruc] */
    public final java.lang.Object y(zdm zdmVar, defpackage.aoln aolnVar) {
        ugk ugkVar;
        zdm zdmVar2;
        if (aolnVar instanceof ugk) {
            ugkVar = (ugk) aolnVar;
            int i = ugkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugkVar.c = i - Integer.MIN_VALUE;
            } else {
                ugkVar = new ugk(this, aolnVar);
            }
        } else {
            ugkVar = new ugk(this, aolnVar);
        }
        java.lang.Object objZ = ugkVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ugkVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = ugkVar.a;
                defpackage.aooc.af(objZ);
                zdmVar2 = obj;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objZ);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objZ);
        ugkVar.a = zdmVar;
        ugkVar.c = 1;
        objZ = z(zdmVar, ugkVar);
        if (objZ == aoluVar) {
            zdmVar2 = zdmVar;
            return aoluVar;
        }
        zdmVar2 = zdmVar;
        if (objZ != zdp.b) {
            ?? r9 = this.b;
            ugi ugiVar = ugi.b;
            defpackage.nhv nhvVar = new defpackage.nhv(this, zdmVar2, (defpackage.aoln) null, 6);
            ugkVar.a = null;
            ugkVar.c = 2;
            if (B(r9, ugiVar, nhvVar, ugkVar) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, ruc] */
    public final java.lang.Object z(zdm zdmVar, defpackage.aoln aolnVar) {
        return B(this.b, ugi.a, new defpackage.nhv(this, zdmVar, (defpackage.aoln) null, 7, (byte[]) null), aolnVar);
    }

    public zjm(android.app.Activity activity, defpackage.tvn tvnVar) {
        this.a = activity;
        this.b = tvnVar;
    }

    public zjm(j$.util.Optional optional, j$.util.Optional optional2) {
        this.b = optional;
        this.a = optional2;
    }

    public zjm(java.lang.Object obj, java.lang.Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public zjm(defpackage.ahbq ahbqVar, defpackage.ruc rucVar) {
        if (ahbqVar == null) {
            defpackage.aooh.i("moiraiApiBuilder");
        }
        if (rucVar == null) {
            defpackage.aooh.i("metrics");
        }
        this.a = ahbqVar;
        this.b = rucVar;
    }

    public zjm(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        aoinVar.getClass();
        this.b = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
    }

    public zjm(defpackage.aoin aoinVar, defpackage.zcs zcsVar) {
        j$.util.Objects.requireNonNull(aoinVar);
        this.a = new defpackage.vfy(aoinVar, 19);
        this.b = zcsVar;
    }

    public zjm() {
        this.a = new java.util.concurrent.atomic.AtomicInteger(0);
        defpackage.aiaa aiaaVar = new defpackage.aiaa();
        aiaaVar.h(defpackage.aibb.c);
        this.b = aiaaVar.a();
    }

    public zjm(defpackage.uha uhaVar, defpackage.aoss aossVar, defpackage.aolr aolrVar) {
        if (uhaVar == null) {
            defpackage.aooh.i("moiraiDao");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.b = uhaVar;
        this.a = aolrVar;
    }

    public zjm(defpackage.ecx ecxVar) {
        if (ecxVar == null) {
            defpackage.aooh.i("dataStore");
        }
        this.b = ecxVar;
        this.a = new defpackage.fzh(ecxVar.b(), 11);
    }

    public zjm(defpackage.afhf afhfVar, defpackage.ajct ajctVar) {
        this.a = afhfVar;
        this.b = ajctVar;
    }

    public zjm(defpackage.aomy aomyVar) {
        this.a = aomyVar;
        this.b = new java.util.concurrent.atomic.AtomicReference(defpackage.ahvr.bI(new defpackage.rwp(aomyVar, 14)));
    }

    public zjm(java.util.Set set) {
        this.a = set;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            defpackage.ajsz.bv(arrayList, ((defpackage.zam) it.next()).a);
        }
        int iAL = defpackage.ajsz.aL(arrayList.size());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iAL < 16 ? 16 : iAL);
        for (java.lang.Object obj : arrayList) {
            linkedHashMap.put(obj, java.lang.Boolean.FALSE);
        }
        this.b = new java.util.LinkedHashMap(linkedHashMap);
    }

    public zjm(defpackage.zzx zzxVar, defpackage.ajct ajctVar, defpackage.aazc aazcVar) {
        if (ajctVar == null) {
            defpackage.aooh.i("lightweightExecutor");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.b = zzxVar;
        this.a = ajctVar;
    }
}
