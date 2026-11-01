package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class kjs implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ kjs(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kfj] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kfj] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v29, types: [aiii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v45, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aoss, java.lang.Object] */
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
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) {
        defpackage.ajcq ajcmVar;
        int i = 9;
        int i2 = 3;
        int i3 = 4;
        int i4 = 7;
        int i5 = 8;
        int i6 = 1;
        int i7 = 2;
        byte[] bArr = null;
        int i8 = 0;
        switch (this.$cid) {
            case 0:
                final defpackage.kka kkaVar = ((defpackage.kjw) this.a).d;
                defpackage.ajcq ajcqVarY = kkaVar.h.Y();
                final ?? r0 = this.b;
                defpackage.ahyc ahycVar = new defpackage.ahyc() { // from class: kjz
                    @Override // defpackage.ahyc
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        java.lang.Object obj3;
                        j$.util.stream.Stream map;
                        if (!((java.lang.Boolean) obj2).booleanValue()) {
                            ((defpackage.aimw) ((defpackage.aimw) defpackage.kka.a.b()).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "update", 132, "SystemCallLogUpdater.java")).v("not updating system call log for initial build");
                            return null;
                        }
                        final defpackage.kka kkaVar2 = kkaVar;
                        defpackage.aify aifyVar = defpackage.zqz.a;
                        if (defpackage.dvx.c(kkaVar2.b, "android.permission.WRITE_CALL_LOG") != 0) {
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.kka.a.d()).i(defpackage.zct.b)).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "update", (char) 136, "SystemCallLogUpdater.java")).v("no WRITE_CALL_LOG permission");
                            return null;
                        }
                        defpackage.kfk kfkVar = (defpackage.kfk) r0;
                        java.util.Map map2 = kfkVar.d;
                        java.util.List list = (java.util.List) j$.util.Collection.-EL.stream(map2.keySet()).map(new defpackage.kju(3)).collect(j$.util.stream.Collectors.toCollection(new defpackage.kjx(0)));
                        int i9 = 1;
                        if (map2.isEmpty()) {
                            ((defpackage.aimw) ((defpackage.aimw) defpackage.kka.a.b()).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "getCallTypeUpdates", 233, "SystemCallLogUpdater.java")).v("There are no system call log mutations");
                            map = j$.util.stream.Stream.-CC.empty();
                        } else {
                            defpackage.rsr rsrVar = new defpackage.rsr();
                            rsrVar.aC(new defpackage.kaw("_id").aF(list));
                            defpackage.rsr rsrVarAB = rsrVar.aB();
                            android.database.Cursor cursorB = kkaVar2.d.b(kkaVar2.a(), new java.lang.String[]{"_id", "type"}, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a, null);
                            try {
                                if (cursorB == null) {
                                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.kka.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "getSystemCallLogCallTypesById", 294, "SystemCallLogUpdater.java")).v("null cursor");
                                    obj3 = defpackage.aikj.b;
                                } else if (cursorB.moveToFirst()) {
                                    int columnIndexOrThrow = cursorB.getColumnIndexOrThrow("_id");
                                    int columnIndexOrThrow2 = cursorB.getColumnIndexOrThrow("type");
                                    defpackage.aimz aimzVar = defpackage.kka.a;
                                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "getSystemCallLogCallTypesById", 305, "SystemCallLogUpdater.java")).w("found %d entries in the system call log", cursorB.getCount());
                                    defpackage.aca acaVar = new defpackage.aca();
                                    do {
                                        if (cursorB.isNull(columnIndexOrThrow)) {
                                            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "getSystemCallLogCallTypesById", 309, "SystemCallLogUpdater.java")).v("skipping row where Calls._ID column is null");
                                        } else {
                                            acaVar.put(java.lang.Long.valueOf(cursorB.getLong(columnIndexOrThrow)), java.lang.Integer.valueOf(cursorB.getInt(columnIndexOrThrow2)));
                                        }
                                    } while (cursorB.moveToNext());
                                    cursorB.close();
                                    obj3 = acaVar;
                                } else {
                                    ((defpackage.aimw) ((defpackage.aimw) defpackage.kka.a.b()).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "getSystemCallLogCallTypesById", 298, "SystemCallLogUpdater.java")).v("no results for system call log query");
                                    defpackage.aigf aigfVar = defpackage.aikj.b;
                                    cursorB.close();
                                    obj3 = aigfVar;
                                }
                                map = j$.util.Collection.-EL.stream(map2.entrySet()).map(new kle(1)).filter(new jty(obj3, 6)).map(new jil(kkaVar2, 4));
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
                        int size = ((defpackage.alfc) kkaVar2.e.a()).b.size();
                        j$.util.Optional optionalG = kkaVar2.g.g();
                        if (true == optionalG.isPresent()) {
                            optionalG = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.kgz) optionalG.get()).d));
                        }
                        final boolean z = size > 0;
                        final java.lang.Boolean bool = (java.lang.Boolean) optionalG.orElse(java.lang.Boolean.FALSE);
                        java.util.List list2 = (java.util.List) j$.util.stream.Stream.-CC.concat(map, j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(kfkVar.a.entrySet()), j$.util.Collection.-EL.stream(kfkVar.b.entrySet())).limit(100L).filter(new defpackage.opv(i9)).map(new java.util.function.Function() { // from class: kjy
                            @Override // java.util.function.Function
                            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                                return j$.util.function.Function.-CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final java.lang.Object apply(java.lang.Object obj4) {
                                java.util.Map.Entry entry = (java.util.Map.Entry) obj4;
                                android.content.ContentValues contentValues = (android.content.ContentValues) entry.getValue();
                                hkd hkdVarR = sns.r(contentValues, "number", hkd.a);
                                kiw kiwVarR = sns.r(contentValues, "number_attributes", kiw.a);
                                defpackage.kka kkaVar3 = kkaVar2;
                                java.lang.String strA = kkaVar3.f.a(kiwVarR);
                                defpackage.rsr rsrVarAI = new defpackage.kaw("name").aI("IS NOT", strA);
                                android.content.ContentProviderOperation.Builder builderWithValue = android.content.ContentProviderOperation.newUpdate(android.content.ContentUris.withAppendedId(kkaVar3.a(), ((java.lang.Long) entry.getKey()).longValue())).withValue("formatted_number", contentValues.getAsString("formatted_number")).withValue("normalized_number", hkdVarR.c).withValue("numberlabel", kiwVarR.h).withValue("numbertype", 0).withValue("photo_id", java.lang.Long.valueOf(kiwVarR.f));
                                java.lang.String str = !kiwVarR.x.isEmpty() ? kiwVarR.x : kiwVarR.e;
                                boolean z2 = z;
                                android.content.ContentProviderOperation.Builder builderWithSelection = builderWithValue.withValue("photo_uri", str).withValue("geocoded_location", kiwVarR.q).withSelection((java.lang.String) rsrVarAI.b, (java.lang.String[]) rsrVarAI.a);
                                if (!z2 || contentValues.getAsString("uuid") == null) {
                                    return builderWithSelection.withValue("name", strA).withValue("lookup_uri", kiwVarR.g).build();
                                }
                                if (!bool.booleanValue()) {
                                    builderWithSelection.withValue("lookup_uri", kiwVarR.g);
                                }
                                return builderWithSelection.build();
                            }

                            @Override // java.util.function.Function
                            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                                return j$.util.function.Function.-CC.$default$compose(this, function);
                            }
                        })).limit(100L).collect(j$.util.stream.Collectors.toCollection(new defpackage.kjx(0)));
                        if (list2.isEmpty()) {
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.kka.a.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "updateSystemCallLog", (char) 257, "SystemCallLogUpdater.java")).v("empty operations list, will not do anything");
                            return null;
                        }
                        try {
                            ((defpackage.aimw) ((defpackage.aimw) defpackage.kka.a.b()).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "updateSystemCallLog", 265, "SystemCallLogUpdater.java")).w("updated %d rows", j$.util.DesugarArrays.stream(kkaVar2.d.n("call_log", list2)).mapToInt(new fiy(4)).sum());
                            return null;
                        } catch (java.lang.Exception e) {
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.kka.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/calllog/refresh/impl/SystemCallLogUpdater", "updateSystemCallLog", (char) 273, "SystemCallLogUpdater.java")).v("failed to update system call log columns");
                            return null;
                        }
                    }
                };
                defpackage.ajct ajctVar = kkaVar.c;
                long j = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), ahycVar);
                int i9 = defpackage.ajan.c;
                defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarY, ahqvVar);
                ajcqVarY.c(ajamVar, defpackage.aiql.t(ajctVar, ajamVar));
                ajcmVar = ajamVar;
                break;
            case 1:
                return ((defpackage.jwg) this.b).c(((defpackage.kfk) this.a).b);
            case 2:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.kjw.a.b()).l("com/android/dialer/calllog/refresh/impl/RefreshAnnotatedCallLogWorker", "rebuild", 233, "RefreshAnnotatedCallLogWorker.java")).v("applying mutations");
                defpackage.rsr rsrVar = ((defpackage.kjw) this.a).o;
                return defpackage.aosv.F(rsrVar.a, 0, new defpackage.bur(rsrVar, (defpackage.kfj) this.b, (defpackage.aoln) null, 16), 3);
            case 3:
                java.lang.Object obj2 = this.a;
                defpackage.kvh kvhVar = (defpackage.kvh) obj2;
                defpackage.kvj kvjVar = kvhVar.c;
                defpackage.ajcq ajcqVarBk = kvjVar.d.bk();
                defpackage.kvf kvfVar = new defpackage.kvf(i7);
                long j2 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar2 = new defpackage.ahqv(defpackage.ahns.c(false), kvfVar);
                int i10 = defpackage.ajan.c;
                defpackage.ajct ajctVar2 = kvjVar.b;
                defpackage.ajam ajamVar2 = new defpackage.ajam(ajcqVarBk, ahqvVar2);
                ajcqVarBk.c(ajamVar2, defpackage.aiql.t(ajctVar2, ajamVar2));
                defpackage.ahrv ahrvVarI = defpackage.ahrv.g(ajamVar2).i(new defpackage.jwf(obj2, i5), kvhVar.e);
                defpackage.jwf jwfVar = new defpackage.jwf(obj2, i);
                defpackage.ajct ajctVar3 = kvhVar.d;
                defpackage.ahrv ahrvVarI2 = ahrvVarI.i(jwfVar, ajctVar3);
                defpackage.ajam ajamVar3 = new defpackage.ajam(ahrvVarI2, new defpackage.ahqv(defpackage.ahns.c(false), new defpackage.jtv(obj2, this.b, 5, bArr)));
                ahrvVarI2.c(ajamVar3, defpackage.aiql.t(ajctVar3, ajamVar3));
                return ajamVar3;
            case 4:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.kvh.a.b()).l("com/android/dialer/callrecording/impl/calllog/CallRecordingDataSource", "handleDeletesFromAnnotatedCallLog", 124, "CallRecordingDataSource.java")).v("enter");
                java.util.Set set = ((defpackage.kfk) this.b).c;
                if (set.isEmpty()) {
                    return defpackage.ajcm.a;
                }
                defpackage.kvh kvhVar2 = (defpackage.kvh) this.a;
                defpackage.ajcq ajcqVarAb = kvhVar2.h.ab(set);
                jvq jvqVar = new jvq(13);
                defpackage.ajct ajctVar4 = kvhVar2.d;
                defpackage.ahrv ahrvVarG = defpackage.ahrv.g(defpackage.ahvr.H(ajcqVarAb, jvqVar, ajctVar4));
                defpackage.lbi lbiVar = kvhVar2.b;
                j$.util.Objects.requireNonNull(lbiVar);
                defpackage.ahrv ahrvVarI3 = ahrvVarG.i(new kvd(lbiVar, 0), ajctVar4);
                j$.util.Objects.requireNonNull(lbiVar);
                return ahrvVarI3.i(new kvd(lbiVar, 2), ajctVar4);
            case 5:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.kvh.a.b()).l("com/android/dialer/callrecording/impl/calllog/CallRecordingDataSource", "addDeleteUpdatesFromCallRecordingInitiatedDeletes", 172, "CallRecordingDataSource.java")).v("enter");
                java.lang.Object obj3 = this.a;
                defpackage.kvh kvhVar3 = (defpackage.kvh) obj3;
                defpackage.kvj kvjVar2 = kvhVar3.c;
                defpackage.ajcq ajcqVarBk2 = kvjVar2.d.bk();
                defpackage.kvf kvfVar2 = new defpackage.kvf(i2);
                long j3 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar3 = new defpackage.ahqv(defpackage.ahns.c(false), kvfVar2);
                int i11 = defpackage.ajan.c;
                defpackage.ajct ajctVar5 = kvjVar2.b;
                defpackage.ajam ajamVar4 = new defpackage.ajam(ajcqVarBk2, ahqvVar3);
                ajcqVarBk2.c(ajamVar4, defpackage.aiql.t(ajctVar5, ajamVar4));
                defpackage.ahrv ahrvVarG2 = defpackage.ahrv.g(ajamVar4);
                defpackage.jwf jwfVar2 = new defpackage.jwf(obj3, 6);
                defpackage.ajct ajctVar6 = kvhVar3.d;
                return ahrvVarG2.i(jwfVar2, ajctVar6).i(new defpackage.jwf(this.b, i4), ajctVar6);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.util.List list = (java.util.List) obj;
                if (list.isEmpty()) {
                    ajcmVar = new defpackage.ajcm(defpackage.aikj.b);
                } else {
                    java.lang.Object obj4 = this.b;
                    java.lang.Object obj5 = this.a;
                    defpackage.aigf aigfVar = (defpackage.aigf) j$.util.Collection.-EL.stream(list).collect(defpackage.aido.b(new kle(8), new kle(9)));
                    defpackage.lbu lbuVar = (defpackage.lbu) obj5;
                    defpackage.ajcq ajcqVarAc = lbuVar.d.ac(aigfVar.keySet());
                    iau iauVar = new iau(((defpackage.kfk) obj4).b, aigfVar, 13, (byte[]) null);
                    long j4 = defpackage.ahqx.a;
                    defpackage.ahqv ahqvVar4 = new defpackage.ahqv(defpackage.ahns.c(false), iauVar);
                    defpackage.ajct ajctVar7 = lbuVar.a;
                    int i12 = defpackage.ajan.c;
                    defpackage.ajam ajamVar5 = new defpackage.ajam(ajcqVarAc, ahqvVar4);
                    ajcqVarAc.c(ajamVar5, defpackage.aiql.t(ajctVar7, ajamVar5));
                    ajcmVar = ajamVar5;
                }
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ?? r2 = this.a;
                defpackage.ahvr.cc(r2.isDone(), "Future was expected to be done: %s", r2);
                defpackage.aigf aigfVar2 = (defpackage.aigf) j$.util.Collection.-EL.stream((defpackage.aify) obj).collect(defpackage.aido.b(new defpackage.kju(7), new defpackage.sqg(this.b, (j$.util.Optional) defpackage.a.h(r2), i6)));
                return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.j(aigfVar2.values())), (byte[]) null).o(new defpackage.guy(aigfVar2, i3), defpackage.ajbm.INSTANCE);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.onw) this.b).h.v((java.lang.String) obj, (java.lang.String) this.a);
            case 9:
                defpackage.aihd aihdVarKeySet = ((defpackage.aigf) this.a).keySet();
                java.lang.Object obj6 = this.b;
                return ((defpackage.onw) obj6).g.o(aihdVarKeySet, new defpackage.kjs(obj6, (defpackage.aiii) obj, 11, bArr));
            case 10:
                defpackage.aiii aiiiVar = (defpackage.aiii) obj;
                java.lang.Object obj7 = this.a;
                java.lang.Object obj8 = this.b;
                defpackage.kjs kjsVar = new defpackage.kjs(obj8, obj7, i5, bArr);
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                for (java.lang.Object obj9 : aiiiVar.p()) {
                    try {
                        aigbVar.i(obj9, kjsVar.a(obj9));
                    } catch (java.lang.Exception e) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.onw.a.b()).k(e)).l("com/android/dialer/fixeddialingnumber/impl/phonelookup/FixedDialingNumberPhoneLookupContributor", "transformKeyAsync", (char) 280, "FixedDialingNumberPhoneLookupContributor.java")).v("AsyncFunction failed to apply");
                    }
                }
                defpackage.aigf aigfVarE = aigbVar.e(true);
                return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.j(aigfVarE.values())), (byte[]) null).o(new defpackage.nyf(aiiiVar, aigfVarE, i7, bArr), ((defpackage.onw) obj8).e);
            case 11:
                return ((defpackage.onw) this.b).i(this.a, (hkd) obj);
            case 12:
                defpackage.sqn sqnVar = (defpackage.sqn) obj;
                java.lang.Object obj10 = this.a;
                defpackage.aigf aigfVar3 = (defpackage.aigf) j$.util.Collection.-EL.stream(((defpackage.aigf) obj10).entrySet()).collect(defpackage.aido.b(new defpackage.kju(20), new defpackage.sqg(sqnVar, obj10, i8)));
                defpackage.ajcq ajcqVarA = sqnVar.a(aigfVar3);
                defpackage.jtv jtvVar = new defpackage.jtv(sqnVar, aigfVar3, i4);
                long j5 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar5 = new defpackage.ahqv(defpackage.ahns.c(false), jtvVar);
                defpackage.ajct ajctVar8 = ((defpackage.sqi) this.b).e;
                int i13 = defpackage.aizu.d;
                defpackage.aizt aiztVar = new defpackage.aizt(ajcqVarA, java.lang.Throwable.class, ahqvVar5);
                ajcqVarA.c(aiztVar, defpackage.aiql.t(ajctVar8, aiztVar));
                ajcmVar = aiztVar;
                break;
            case 13:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                ?? r3 = this.a;
                if (!zBooleanValue) {
                    return r3 == 0 ? defpackage.ajcm.a : new defpackage.ajcm(r3);
                }
                java.lang.Object obj11 = this.b;
                defpackage.vav vavVar = (defpackage.vav) obj11;
                defpackage.ajcq ajcqVarB = vavVar.j.b((defpackage.aihd) j$.util.Collection.-EL.stream((java.util.Collection) r3).map(new var(2)).collect(defpackage.aido.b));
                tzs tzsVar = new tzs(obj11, (java.lang.Object) r3, 17, (byte[]) null);
                long j6 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar6 = new defpackage.ahqv(defpackage.ahns.c(false), tzsVar);
                defpackage.ajct ajctVar9 = vavVar.e;
                int i14 = defpackage.ajan.c;
                defpackage.ajam ajamVar6 = new defpackage.ajam(ajcqVarB, ahqvVar6);
                ajcqVarB.c(ajamVar6, defpackage.aiql.t(ajctVar9, ajamVar6));
                return ajamVar6;
            case 14:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ((defpackage.vda) this.a).b((android.telecom.PhoneAccountHandle) this.b);
                }
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                if (optionalEmpty == null) {
                    return defpackage.ajcm.a;
                }
                ajcmVar = new defpackage.ajcm(optionalEmpty);
                break;
                break;
            case 15:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object obj12 = this.b;
                    defpackage.vva vvaVar = (defpackage.vva) this.a;
                    defpackage.vuw vuwVar = new defpackage.vuw(vvaVar, (defpackage.rsr) obj12, defpackage.vva.l(), i8);
                    long j7 = defpackage.ahqx.a;
                    defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ahqt(defpackage.ahns.c(false), vuwVar, 0));
                    vvaVar.g.execute(ajdkVar);
                    ajcmVar = ajdkVar;
                } else {
                    defpackage.aify aifyVar = defpackage.aike.a;
                    if (aifyVar == null) {
                        return defpackage.ajcm.a;
                    }
                    ajcmVar = new defpackage.ajcm(aifyVar);
                }
                break;
            case 16:
                uzo uzoVar = (uzo) obj;
                defpackage.kiu kiuVar = uzoVar.d;
                if (kiuVar == null) {
                    kiuVar = defpackage.kiu.a;
                }
                java.lang.Object obj13 = this.a;
                java.lang.String str = kiuVar.g;
                if ((uzoVar.b & 4) != 0) {
                    obj13 = uzoVar.e;
                }
                return ((defpackage.vva) this.b).r.v(str, (java.lang.String) obj13);
            case 17:
                defpackage.rsr rsrVar2 = (defpackage.rsr) obj;
                java.lang.Object obj14 = rsrVar2.b;
                java.lang.Object obj15 = rsrVar2.a;
                final defpackage.vva vvaVar2 = (defpackage.vva) this.a;
                defpackage.ajbg ajbgVarD = vvaVar2.d.d((android.net.Uri) this.b, defpackage.vva.c, (java.lang.String) obj14, (java.lang.String[]) obj15, "date DESC");
                defpackage.ajbc ajbcVar = new defpackage.ajbc() { // from class: vuv
                    @Override // defpackage.ajbc
                    public final java.lang.Object a(defpackage.ajyk ajykVar, java.lang.Object obj16) {
                        android.database.Cursor cursor = (android.database.Cursor) obj16;
                        java.util.ArrayList arrayList = new java.util.ArrayList(cursor.getCount());
                        boolean zMoveToFirst = cursor.moveToFirst();
                        defpackage.vva vvaVar3 = vvaVar2;
                        if (zMoveToFirst) {
                            do {
                                defpackage.akzx akzxVarM = uzn.a.m();
                                defpackage.akzx akzxVarM2 = defpackage.kiu.a.m();
                                java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow("number"));
                                if (string == null || string.equals("Private-Number") || string.equals("Private number") || string.equals("-1")) {
                                    string = "";
                                }
                                if (!android.text.TextUtils.isEmpty(string)) {
                                    akzxVarM2.u();
                                    defpackage.kiu kiuVar2 = (defpackage.kiu) akzxVarM2.b;
                                    j$.util.Objects.requireNonNull(string);
                                    kiuVar2.b |= 8;
                                    kiuVar2.g = string;
                                }
                                java.lang.String string2 = cursor.getString(cursor.getColumnIndexOrThrow("transcription"));
                                if (!android.text.TextUtils.isEmpty(string2)) {
                                    akzxVarM.u();
                                    uzn uznVar = akzxVarM.b;
                                    j$.util.Objects.requireNonNull(string2);
                                    uznVar.b |= 2;
                                    uznVar.d = string2;
                                }
                                java.lang.String string3 = cursor.getString(cursor.getColumnIndexOrThrow("voicemail_uri"));
                                if (!android.text.TextUtils.isEmpty(string3)) {
                                    akzxVarM.u();
                                    uzn uznVar2 = akzxVarM.b;
                                    j$.util.Objects.requireNonNull(string3);
                                    uznVar2.b |= 8;
                                    uznVar2.f = string3;
                                }
                                long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(cursor.getLong(cursor.getColumnIndexOrThrow("duration")));
                                akzxVarM.u();
                                uzn uznVar3 = akzxVarM.b;
                                uznVar3.b |= 16;
                                uznVar3.g = millis;
                                uzm uzmVarBV = defpackage.afsq.bV(cursor.getInt(cursor.getColumnIndexOrThrow("transcription_state")));
                                akzxVarM.u();
                                uzn uznVar4 = akzxVarM.b;
                                uznVar4.e = uzmVarBV.l;
                                uznVar4.b |= 4;
                                java.lang.String string4 = cursor.getString(cursor.getColumnIndexOrThrow("countryiso"));
                                java.lang.String string5 = cursor.getString(cursor.getColumnIndexOrThrow("post_dial_digits"));
                                if (string5 != null) {
                                    string = java.lang.String.valueOf(string).concat(string5);
                                }
                                android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
                                android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
                                try {
                                    java.lang.String strG = vvaVar3.k.g(string, string4);
                                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                                    java.lang.String string6 = cursor.getString(cursor.getColumnIndexOrThrow("subscription_component_name"));
                                    java.lang.String string7 = cursor.getString(cursor.getColumnIndexOrThrow("subscription_id"));
                                    akzxVarM2.u();
                                    defpackage.kiu kiuVar3 = (defpackage.kiu) akzxVarM2.b;
                                    j$.util.Objects.requireNonNull(strG);
                                    kiuVar3.b |= 16;
                                    kiuVar3.h = strG;
                                    long j8 = cursor.getLong(cursor.getColumnIndexOrThrow("date"));
                                    akzxVarM2.u();
                                    defpackage.kiu kiuVar4 = (defpackage.kiu) akzxVarM2.b;
                                    kiuVar4.b |= 2;
                                    kiuVar4.e = j8;
                                    long j9 = cursor.getLong(cursor.getColumnIndexOrThrow("duration"));
                                    akzxVarM2.u();
                                    defpackage.kiu kiuVar5 = (defpackage.kiu) akzxVarM2.b;
                                    kiuVar5.b |= 1073741824;
                                    kiuVar5.H = j9;
                                    long j10 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                                    akzxVarM2.u();
                                    defpackage.kiu kiuVar6 = (defpackage.kiu) akzxVarM2.b;
                                    kiuVar6.b |= 1;
                                    kiuVar6.d = j10;
                                    int i15 = cursor.getInt(cursor.getColumnIndexOrThrow("presentation"));
                                    akzxVarM2.u();
                                    defpackage.kiu kiuVar7 = (defpackage.kiu) akzxVarM2.b;
                                    kiuVar7.b |= 32;
                                    kiuVar7.i = i15;
                                    boolean z = cursor.getInt(cursor.getColumnIndexOrThrow("is_read")) == 1;
                                    akzxVarM2.u();
                                    defpackage.kiu kiuVar8 = (defpackage.kiu) akzxVarM2.b;
                                    kiuVar8.b |= 64;
                                    kiuVar8.j = z;
                                    if (!android.text.TextUtils.isEmpty(string6)) {
                                        akzxVarM2.u();
                                        defpackage.kiu kiuVar9 = (defpackage.kiu) akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(string6);
                                        kiuVar9.b |= 512;
                                        kiuVar9.m = string6;
                                    }
                                    if (!android.text.TextUtils.isEmpty(string7)) {
                                        akzxVarM2.u();
                                        defpackage.kiu kiuVar10 = (defpackage.kiu) akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(string7);
                                        kiuVar10.b |= 1024;
                                        kiuVar10.n = string7;
                                    }
                                    defpackage.akzx akzxVarM3 = uzo.a.m();
                                    if (!android.text.TextUtils.isEmpty(string4)) {
                                        akzxVarM3.u();
                                        uzo uzoVar2 = akzxVarM3.b;
                                        j$.util.Objects.requireNonNull(string4);
                                        uzoVar2.b |= 4;
                                        uzoVar2.e = string4;
                                    }
                                    defpackage.kiu kiuVar11 = (defpackage.kiu) akzxVarM2.r();
                                    akzxVarM3.u();
                                    uzo uzoVar3 = akzxVarM3.b;
                                    j$.util.Objects.requireNonNull(kiuVar11);
                                    uzoVar3.d = kiuVar11;
                                    uzoVar3.b |= 2;
                                    uzn uznVarR = akzxVarM.r();
                                    akzxVarM3.u();
                                    uzo uzoVar4 = akzxVarM3.b;
                                    j$.util.Objects.requireNonNull(uznVarR);
                                    uzoVar4.c = uznVarR;
                                    uzoVar4.b |= 1;
                                    arrayList.add(akzxVarM3.r());
                                } catch (java.lang.Throwable th) {
                                    android.os.StrictMode.setThreadPolicy(threadPolicy);
                                    throw th;
                                }
                            } while (cursor.moveToNext());
                        }
                        return defpackage.aify.n(arrayList);
                    }
                };
                long j8 = defpackage.ahqx.a;
                return ajbgVarD.c(new defpackage.ahqn(defpackage.ahns.c(false), ajbcVar), vvaVar2.g).h();
            case 18:
                defpackage.zzm zzmVar = (defpackage.zzm) obj;
                ?? r4 = this.a;
                if (zzmVar != null) {
                    return r4;
                }
                defpackage.ajcq ajcqVar = ((defpackage.zyy) this.b).l;
                return ajcqVar == null ? defpackage.ajcm.a : ajcqVar;
            case 19:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return ((defpackage.acgp) ((defpackage.acch) this.b).c.a()).c((defpackage.akiq) this.a);
                }
                ((defpackage.aiob) ((defpackage.aiob) defpackage.acch.a.b()).l("com/google/android/libraries/internal/growth/growthkit/internal/events/impl/EventsHelperImpl", "reportClearCutEvent", 85, "EventsHelperImpl.java")).v("GrowthKit is disabled by Phenotype flag.");
                return defpackage.ajcm.a;
            default:
                defpackage.adiq adiqVar = (defpackage.adiq) obj;
                defpackage.ajxw ajxwVar = (defpackage.ajxw) this.b;
                com.google.android.libraries.micore.superpacks.common.PackManifest packManifestF = ((defpackage.adld) ajxwVar.b).d().f();
                defpackage.adhw adhwVarP = packManifestF.p();
                defpackage.adhw adhwVarA = defpackage.adho.a(adhwVarP, packManifestF.l());
                defpackage.gat gatVar = (defpackage.gat) this.a;
                defpackage.adjz adjzVar = (defpackage.adjz) gatVar.e;
                int iA = adjzVar.a(adhwVarA);
                if (iA > 2) {
                    ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.c.b()).l("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePackMaybeRetry", 334, "FetchPipeline.java")).B("Max validation retry count of %d met for pack %s, failing fetch", iA, adhwVarP.e(true));
                    return defpackage.aiql.y(adiqVar);
                }
                ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.c.b()).l("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "fetchOnePackMaybeRetry", 319, "FetchPipeline.java")).M("Retrying fetching pack %s after validation failure, counts: %d, maxAllowed: %d", adhwVarP.e(true), java.lang.Integer.valueOf(iA), 2);
                adjzVar.o(adhwVarA, defpackage.adme.INVALID_PACK, false);
                return gatVar.D(ajxwVar);
        }
        return ajcmVar;
    }

    public /* synthetic */ kjs(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
