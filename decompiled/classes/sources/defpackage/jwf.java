package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jwf implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jwf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kfj] */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) {
        defpackage.ajcq ajbhVar;
        int i = 13;
        int i2 = 3;
        byte[] bArr = null;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        switch (this.$cid) {
            case 0:
                return ((defpackage.jwg) this.a).d.ac(((defpackage.aigf) obj).keySet());
            case 1:
                java.lang.Long lValueOf = java.lang.Long.valueOf(((defpackage.jwh) obj).c);
                defpackage.jwu jwuVar = ((defpackage.jwg) this.a).a;
                return jwuVar.d.m() ? new defpackage.ajdd(new jwt()) : jwuVar.e.F(new defpackage.afhm(lValueOf, 1));
            case 2:
                return ((defpackage.kjw) this.a).g.a();
            case 3:
                ?? r0 = this.a;
                java.util.ArrayList arrayList = new java.util.ArrayList(((defpackage.aify) r0).size());
                int size = r0.size();
                while (i4 < size) {
                    arrayList.add(((defpackage.kfh) r0.get(i4)).e());
                    i4++;
                }
                ajbhVar = new defpackage.ajbh(defpackage.aify.j(arrayList), true);
                break;
            case 4:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.getClass();
                if (!bool.booleanValue()) {
                    return new defpackage.ajcm(java.lang.Boolean.TRUE);
                }
                defpackage.kjw kjwVar = (defpackage.kjw) this.a;
                defpackage.aify aifyVar = (defpackage.aify) kjwVar.j.eZ();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(aifyVar.size());
                int size2 = aifyVar.size();
                while (i4 < size2) {
                    defpackage.kfh kfhVar = (defpackage.kfh) aifyVar.get(i4);
                    defpackage.ajcq ajcqVarD = kfhVar.d();
                    kjwVar.a(defpackage.kjw.c, kfhVar.a(), ajcqVarD);
                    arrayList2.add(ajcqVarD);
                    i4++;
                }
                return kjwVar.m.n(arrayList2, new evz(8), java.lang.Boolean.FALSE);
            case 5:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj2 = this.a;
                defpackage.kjw kjwVar2 = (defpackage.kjw) obj2;
                defpackage.kcq kcqVarA = kjwVar2.h.a();
                defpackage.kfk kfkVar = new defpackage.kfk();
                defpackage.ahzi ahziVar = kjwVar2.j;
                defpackage.ajcq ajcqVar = defpackage.ajcm.a;
                defpackage.aify aifyVarSubList = (defpackage.aify) ahziVar.eZ();
                if (zBooleanValue) {
                    aifyVarSubList = aifyVarSubList.subList(1, aifyVarSubList.size());
                }
                int size3 = aifyVarSubList.size();
                int i6 = 0;
                while (i6 < size3) {
                    defpackage.adlf adlfVar = new defpackage.adlf(obj2, (defpackage.kfh) aifyVarSubList.get(i6), kfkVar, kcqVarA, 1);
                    defpackage.ajct ajctVar = kjwVar2.f;
                    long j = defpackage.ahqx.a;
                    defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), adlfVar, 1);
                    int i7 = defpackage.ajan.c;
                    defpackage.ajal ajalVar = new defpackage.ajal(ajcqVar, ajaxVar);
                    ajcqVar.c(ajalVar, defpackage.aiql.t(ajctVar, ajalVar));
                    i6++;
                    ajcqVar = ajalVar;
                }
                defpackage.kjs kjsVar = new defpackage.kjs(obj2, kfkVar, i3);
                defpackage.ajct ajctVar2 = kjwVar2.f;
                long j2 = defpackage.ahqx.a;
                defpackage.ajax ajaxVar2 = new defpackage.ajax(defpackage.ahns.c(false), kjsVar, 1);
                int i8 = defpackage.ajan.c;
                defpackage.ajal ajalVar2 = new defpackage.ajal(ajcqVar, ajaxVar2);
                ajcqVar.c(ajalVar2, defpackage.aiql.t(ajctVar2, ajalVar2));
                defpackage.ajal ajalVar3 = new defpackage.ajal(ajalVar2, new defpackage.ajax(defpackage.ahns.c(false), new defpackage.jwf(obj2, i3), 1));
                ajalVar2.c(ajalVar3, defpackage.aiql.t(ajctVar2, ajalVar3));
                defpackage.agsm.d("com/android/dialer/calllog/refresh/impl/RefreshAnnotatedCallLogWorker", "rebuild", 250, defpackage.ahrv.g(ajalVar3).i(new defpackage.kjs(obj2, kfkVar, i4), defpackage.ajbm.INSTANCE), defpackage.zct.b, "Failed to update system call log.", new java.lang.Object[0]);
                defpackage.ajal ajalVar4 = new defpackage.ajal(ajalVar2, new defpackage.ajax(defpackage.ahns.c(false), new defpackage.jwf(aifyVarSubList, i2), 1));
                ajalVar2.c(ajalVar4, defpackage.aiql.t(ajctVar2, ajalVar4));
                return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajalVar3, ajalVar4})), (byte[]) null).o(new defpackage.nyf(obj2, kfkVar, i5, null), kjwVar2.e);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.kvh kvhVar = (defpackage.kvh) this.a;
                defpackage.aihd aihdVar = (defpackage.aihd) obj;
                kvhVar.g.addAll(aihdVar);
                defpackage.ajcq ajcqVarAc = kvhVar.h.ac(defpackage.aihd.o((defpackage.aify) j$.util.Collection.-EL.stream(aihdVar).map(new defpackage.kju(5)).collect(defpackage.aido.a)));
                defpackage.kvf kvfVar = new defpackage.kvf(i4);
                long j3 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), kvfVar);
                defpackage.ajct ajctVar3 = kvhVar.d;
                int i9 = defpackage.ajan.c;
                defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarAc, ahqvVar);
                ajcqVarAc.c(ajamVar, defpackage.aiql.t(ajctVar3, ajamVar));
                return ajamVar;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                final android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("call_recording_details", defpackage.kui.a.i());
                final ?? r1 = this.a;
                j$.lang.Iterable.-EL.forEach((java.util.List) obj, new java.util.function.Consumer() { // from class: kvg
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj3) {
                        defpackage.kfj kfjVar = r1;
                        java.lang.Long l = (java.lang.Long) obj3;
                        if (((defpackage.kfk) kfjVar).c.contains(l)) {
                            ((defpackage.aimw) ((defpackage.aimw) defpackage.kvh.a.b()).l("com/android/dialer/callrecording/impl/calllog/CallRecordingDataSource", "addDeleteUpdatesFromCallRecordingInitiatedDeletes", 197, "CallRecordingDataSource.java")).v("Skipping creation of update mutation. Call recording deleted after call log row deletion but before call log deletion was processed.");
                        } else {
                            kfjVar.d(l.longValue(), contentValues);
                        }
                    }

                    @Override // java.util.function.Consumer
                    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
                    }
                });
                return defpackage.ajcm.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Long l = (java.lang.Long) obj;
                ((defpackage.aimw) ((defpackage.aimw) defpackage.kvh.a.b()).l("com/android/dialer/callrecording/impl/calllog/CallRecordingDataSource", "getAnnotatedCallLogIdsToCallRecordingInfoMap", 280, "CallRecordingDataSource.java")).y("lastSyncedCallRecordingInfoTimestamp %d", l);
                return ((defpackage.kvh) this.a).b.i(l.longValue());
            case 9:
                defpackage.aigf aigfVar = (defpackage.aigf) obj;
                defpackage.aihd aihdVarKeySet = aigfVar.keySet();
                defpackage.kvh kvhVar2 = (defpackage.kvh) this.a;
                defpackage.ajcq ajcqVarAc2 = kvhVar2.h.ac(aihdVarKeySet);
                defpackage.jyx jyxVar = new defpackage.jyx(aigfVar, 2);
                long j4 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar2 = new defpackage.ahqv(defpackage.ahns.c(false), jyxVar);
                defpackage.ajct ajctVar4 = kvhVar2.d;
                int i10 = defpackage.ajan.c;
                defpackage.ajam ajamVar2 = new defpackage.ajam(ajcqVarAc2, ahqvVar2);
                ajcqVarAc2.c(ajamVar2, defpackage.aiql.t(ajctVar4, ajamVar2));
                return ajamVar2;
            case 10:
                defpackage.lbv lbvVar = (defpackage.lbv) obj;
                int i11 = lbvVar.b & 1;
                java.lang.Object obj3 = this.a;
                if (i11 == 0) {
                    return ((defpackage.lbu) obj3).b.d();
                }
                defpackage.lkk lkkVar = ((defpackage.lbu) obj3).b;
                return lkkVar.c.e(new lki(lkkVar, lbvVar.c, 0), lkkVar.a);
            case 11:
                return ((defpackage.ldb) this.a).b(new jyr((java.util.List) obj, 16), 2);
            case 12:
                defpackage.nwv nwvVar = (defpackage.nwv) obj;
                defpackage.nyh nyhVar = (defpackage.nyh) this.a;
                if (nyhVar.e.equals(nwvVar)) {
                    return defpackage.ajcm.a;
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.nyh.a.b()).l("com/android/dialer/duo/impl/MeetCallControllerImpl", "getAndStoreMeetAvailability", 365, "MeetCallControllerImpl.java")).I("Meet availability changed. Prev: %s, Current: %s", nyhVar.e, nwvVar);
                nyhVar.e = nwvVar;
                return nyhVar.h(nwvVar);
            case 13:
                defpackage.aihd aihdVar2 = (defpackage.aihd) obj;
                java.lang.Object obj4 = this.a;
                defpackage.rwo rwoVar = (defpackage.rwo) obj4;
                defpackage.aihd aihdVarA = rwoVar.a();
                if (((defpackage.rwt) defpackage.agab.aH(rwoVar.b, defpackage.rwt.class)).ir()) {
                    if (aihdVar2.containsAll(aihdVarA)) {
                        return defpackage.ajcm.a;
                    }
                    defpackage.ajct ajctVar5 = rwoVar.c;
                    defpackage.raj rajVar = new defpackage.raj(obj4, 12);
                    long j5 = defpackage.ahqx.a;
                    return ajctVar5.submit(new defpackage.ajav(defpackage.ahns.c(false), rajVar, 1));
                }
                if (aihdVarA.equals(aihdVar2)) {
                    return defpackage.ajcm.a;
                }
                defpackage.ajct ajctVar6 = rwoVar.c;
                qfb qfbVar = new qfb(obj4, aihdVar2, 12);
                long j6 = defpackage.ahqx.a;
                defpackage.ajcq ajcqVarSubmit = ajctVar6.submit(new defpackage.ajav(defpackage.ahns.c(false), qfbVar, 1));
                defpackage.ajax ajaxVar3 = new defpackage.ajax(defpackage.ahns.c(false), (defpackage.ajat) new qfc(obj4, 17), 1);
                int i12 = defpackage.ajan.c;
                defpackage.ajal ajalVar5 = new defpackage.ajal(ajcqVarSubmit, ajaxVar3);
                ajcqVarSubmit.c(ajalVar5, defpackage.aiql.t(ajctVar6, ajalVar5));
                ajbhVar = ajalVar5;
                break;
            case 14:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                    return optionalEmpty == null ? defpackage.ajcm.a : new defpackage.ajcm(optionalEmpty);
                }
                java.lang.Object obj5 = this.a;
                defpackage.sti stiVar = (defpackage.sti) obj5;
                return defpackage.ahvr.H(stiVar.b.e.bk(), new soi(obj5, 7), stiVar.c);
            case 15:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                ((defpackage.aimw) ((defpackage.aimw) defpackage.tcv.a.b()).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationLoaderImpl", "internalLoad", 91, "RttConfigurationLoaderImpl.java")).y("Is device supported for RTT: %s", bool2);
                return bool2.booleanValue() ? ((defpackage.tcv) this.a).b.b() : new defpackage.ajcm(defpackage.tcp.UNSUPPORTED);
            case 16:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.tcv.a.d()).i(defpackage.zct.b)).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationLoaderImpl", "load", 'B', "RttConfigurationLoaderImpl.java")).v("no permission");
                    return new defpackage.ajcm(defpackage.tcp.UNSUPPORTED);
                }
                java.lang.Object obj6 = this.a;
                defpackage.tcv tcvVar = (defpackage.tcv) obj6;
                if (((java.lang.Boolean) tcvVar.d.a()).booleanValue()) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.tcv.a.b()).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationLoaderImpl", "load", 70, "RttConfigurationLoaderImpl.java")).v("Optimizing RTT by checking the user setting first");
                    defpackage.ajcq ajcqVarB = tcvVar.b.b();
                    defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ajcqVarB);
                    tct tctVar = new tct(obj6, 2);
                    defpackage.ajct ajctVar7 = tcvVar.c;
                    return ahrvVarG.i(tctVar, ajctVar7).h(new tcy(ajcqVarB, 1), ajctVar7);
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.tcv.a.b()).l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationLoaderImpl", "load", 73, "RttConfigurationLoaderImpl.java")).v("Load RTT configuration without optimizing");
                defpackage.ajcq ajcqVarA = tcvVar.e.a();
                defpackage.jwf jwfVar = new defpackage.jwf(obj6, 15);
                defpackage.ajct ajctVar8 = tcvVar.c;
                long j7 = defpackage.ahqx.a;
                defpackage.ajax ajaxVar4 = new defpackage.ajax(defpackage.ahns.c(false), jwfVar, 1);
                int i13 = defpackage.ajan.c;
                defpackage.ajal ajalVar6 = new defpackage.ajal(ajcqVarA, ajaxVar4);
                ajcqVarA.c(ajalVar6, defpackage.aiql.t(ajctVar8, ajalVar6));
                return ajalVar6;
            case 17:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj7 = this.a;
                tvg tvgVar = new tvg(obj7, 13);
                defpackage.ajct ajctVar9 = ((defpackage.urr) obj7).b;
                return defpackage.ahvr.H(defpackage.ahvr.I(defpackage.ahvr.F(tvgVar, ajctVar9), new udu(obj7, 7), ajctVar9), new uev(obj7, 10), ajctVar9);
            case 18:
                defpackage.aify aifyVar2 = (defpackage.aify) obj;
                defpackage.aify aifyVar3 = (defpackage.aify) j$.util.Collection.-EL.stream(aifyVar2).map(new defpackage.vaq(3)).collect(defpackage.aido.a);
                defpackage.vav vavVar = (defpackage.vav) this.a;
                defpackage.ajcq ajcqVarK = vavVar.t.k(aifyVar3, null);
                defpackage.jyx jyxVar2 = new defpackage.jyx(aifyVar2, 13);
                long j8 = defpackage.ahqx.a;
                defpackage.ahqv ahqvVar3 = new defpackage.ahqv(defpackage.ahns.c(false), jyxVar2);
                defpackage.ajct ajctVar10 = vavVar.e;
                int i14 = defpackage.ajan.c;
                defpackage.ajam ajamVar3 = new defpackage.ajam(ajcqVarK, ahqvVar3);
                ajcqVarK.c(ajamVar3, defpackage.aiql.t(ajctVar10, ajamVar3));
                return ajamVar3;
            case 19:
                java.lang.Object obj8 = this.a;
                defpackage.vav vavVar2 = (defpackage.vav) obj8;
                defpackage.ajcq ajcqVarA2 = vavVar2.q.a();
                defpackage.kjs kjsVar2 = new defpackage.kjs(obj8, (defpackage.aify) obj, i, bArr);
                long j9 = defpackage.ahqx.a;
                defpackage.ajax ajaxVar5 = new defpackage.ajax(defpackage.ahns.c(false), kjsVar2, 1);
                defpackage.ajct ajctVar11 = vavVar2.e;
                int i15 = defpackage.ajan.c;
                defpackage.ajal ajalVar7 = new defpackage.ajal(ajcqVarA2, ajaxVar5);
                ajcqVarA2.c(ajalVar7, defpackage.aiql.t(ajctVar11, ajalVar7));
                return ajalVar7;
            default:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.vav.a.b()).l("com/android/dialer/voicemail/notification/impl/VoicemailNotifierImpl", "updateNotification", 198, "VoicemailNotifierImpl.java")).v("cannot update voicemail notification in work profile");
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj9 = this.a;
                defpackage.rsr rsrVar = new defpackage.rsr();
                rsrVar.aC(new defpackage.kaw("new").aH("= 1"));
                rsrVar.aC(new defpackage.kaw("type").aI("=", 4));
                rsrVar.aC(new defpackage.kaw("is_read").aH("IS NOT 1"));
                rsrVar.aC(new defpackage.kaw("deleted").aH("= 0"));
                defpackage.rsr rsrVar2 = new defpackage.rsr(new defpackage.kaw("date").aH("IS NULL"));
                defpackage.kaw kawVar = new defpackage.kaw("date");
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
                rsrVar2.aD(kawVar.aI(">=", java.lang.Long.valueOf(epochMilli - 604800000)));
                rsrVar.aC(rsrVar2.aB());
                final defpackage.vav vavVar3 = (defpackage.vav) obj9;
                defpackage.ajcq ajcqVarO = ((defpackage.vva) vavVar3.c).o(rsrVar);
                defpackage.ajcq ajcqVarA3 = vavVar3.k.a();
                defpackage.ahda ahdaVar = new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajcqVarO, ajcqVarA3})), (byte[]) null);
                defpackage.vuw vuwVar = new defpackage.vuw(obj9, ajcqVarA3, ajcqVarO, i5);
                defpackage.ajct ajctVar12 = vavVar3.e;
                final defpackage.ajcq ajcqVarP = ahdaVar.p(vuwVar, ajctVar12);
                defpackage.vze vzeVar = vavVar3.o;
                final defpackage.ajcq ajcqVarD2 = vavVar3.d();
                final defpackage.ajcq ajcqVarC = vzeVar.c();
                return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ajcqVarP, ajcqVarD2, ajcqVarC})), (byte[]) null).p(new defpackage.ajas() { // from class: vas
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r0v13 */
                    /* JADX WARN: Type inference failed for: r0v3 */
                    /* JADX WARN: Type inference failed for: r13v0 */
                    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r13v16 */
                    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.concurrent.Executor] */
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
                    @Override // defpackage.ajas
                    public final defpackage.ajcq a() {
                        int i16;
                        ?? r2;
                        defpackage.ajcq ajcqVar2 = ajcqVarP;
                        defpackage.ahvr.cc(ajcqVar2.isDone(), "Future was expected to be done: %s", ajcqVar2);
                        defpackage.aify aifyVar4 = (defpackage.aify) defpackage.a.h(ajcqVar2);
                        defpackage.ajcq ajcqVar3 = ajcqVarD2;
                        defpackage.ahvr.cc(ajcqVar3.isDone(), "Future was expected to be done: %s", ajcqVar3);
                        defpackage.aify aifyVar5 = (defpackage.aify) defpackage.a.h(ajcqVar3);
                        defpackage.ajcq ajcqVar4 = ajcqVarC;
                        defpackage.ahvr.cc(ajcqVar4.isDone(), "Future was expected to be done: %s", ajcqVar4);
                        defpackage.aify aifyVar6 = (defpackage.aify) defpackage.a.h(ajcqVar4);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        boolean zIsEmpty = aifyVar4.isEmpty();
                        final defpackage.vav vavVar4 = vavVar3;
                        int i17 = 0;
                        ?? r13 = 1;
                        if (zIsEmpty) {
                            ((defpackage.aimw) ((defpackage.aimw) defpackage.vav.a.b()).l("com/android/dialer/voicemail/notification/impl/VoicemailNotifierImpl", "updateNotification", 224, "VoicemailNotifierImpl.java")).v("no voicemails to notify about");
                            i16 = 0;
                            r2 = 1;
                        } else {
                            if (aifyVar4.isEmpty()) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            defpackage.aify aifyVar7 = (defpackage.aify) j$.util.Collection.-EL.stream(aifyVar5).filter(new sqj(12)).collect(defpackage.aido.a);
                            defpackage.ajcq ajcqVarC2 = vavVar4.c(defpackage.vav.f((uzo) aifyVar4.get(0)));
                            defpackage.vav vavVar5 = vavVar4;
                            char c = 2;
                            defpackage.icy icyVar = new defpackage.icy(vavVar5, aifyVar4, aifyVar7, 16, (int[]) null);
                            defpackage.ajct ajctVar13 = vavVar5.e;
                            defpackage.ajcq ajcqVarH = defpackage.ahvr.H(ajcqVarC2, icyVar, ajctVar13);
                            arrayList3.add(defpackage.ahrv.g(ajcqVarH).i(new defpackage.uhj(vavVar5, aifyVar4, 18), ajctVar13).i(new defpackage.uhj(vavVar5, ajcqVarH, 19), ajctVar13));
                            if (aifyVar4.isEmpty()) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            int size4 = aifyVar4.size();
                            int i18 = 0;
                            while (i18 < size4) {
                                uzo uzoVar = (uzo) aifyVar4.get(i18);
                                android.content.Context context = vavVar5.b;
                                defpackage.kiu kiuVar = uzoVar.d;
                                if (kiuVar == null) {
                                    kiuVar = defpackage.kiu.a;
                                }
                                android.content.res.Resources resources = context.getResources();
                                abwd abwdVarR = vavVar5.r.a(kiuVar, r13).r();
                                defpackage.ops opsVar = vavVar5.p;
                                akcu akcuVar = new akcu();
                                akcuVar.f();
                                akcuVar.g((boolean) r13);
                                akcuVar.h(false);
                                defpackage.ajcq ajcqVarE = opsVar.e(abwdVarR, akcuVar.e(), resources.getDimensionPixelSize(android.R.dimen.notification_large_icon_width), resources.getDimensionPixelSize(android.R.dimen.notification_large_icon_height));
                                defpackage.ajcq ajcqVarC3 = vavVar5.c(defpackage.vav.f(uzoVar));
                                defpackage.aeqx aeqxVar = vavVar5.s;
                                defpackage.kiu kiuVar2 = uzoVar.d;
                                if (kiuVar2 == null) {
                                    kiuVar2 = defpackage.kiu.a;
                                }
                                defpackage.ahrv ahrvVarH = defpackage.ahrv.g(defpackage.ahvr.F(new vdp(vavVar5, 1), vavVar5.i)).i(new defpackage.uhj(vavVar5, uzoVar, 15, null), ajctVar13).h(new van(aeqxVar.d(kiuVar2, true), 4), ajctVar13);
                                defpackage.ajcq[] ajcqVarArr = new defpackage.ajcq[3];
                                ajcqVarArr[0] = ajcqVarE;
                                ajcqVarArr[1] = ajcqVarC3;
                                ajcqVarArr[c] = ahrvVarH;
                                defpackage.ajct ajctVar14 = ajctVar13;
                                int i19 = size4;
                                int i20 = i18;
                                defpackage.vav vavVar6 = vavVar5;
                                defpackage.ajcq ajcqVarO2 = defpackage.ahvr.ak(ajcqVarArr).o(new vau(vavVar6, ajcqVarC3, ajcqVarE, uzoVar, ahrvVarH, context), ajctVar14);
                                j$.util.Optional optionalG = defpackage.vav.g(uzoVar);
                                defpackage.rsr rsrVar3 = vavVar6.w;
                                j$.util.Objects.requireNonNull(rsrVar3);
                                taj tajVar = new taj(rsrVar3, 16);
                                if (true == optionalG.isPresent()) {
                                    java.lang.Object obj10 = optionalG.get();
                                    defpackage.rsr rsrVar4 = (defpackage.rsr) tajVar.a;
                                    optionalG = j$.util.Optional.ofNullable(((defpackage.afhf) rsrVar4.a).a(new vmb(obj10, 7), rsrVar4.b));
                                }
                                arrayList4.add(defpackage.ahvr.ak(ajcqVarO2, (defpackage.ajcq) optionalG.orElse(defpackage.ajcm.a)).p(new jsr(vavVar6, uzoVar, ajcqVarO2, 20, (byte[]) null), ajctVar14));
                                i18 = i20 + 1;
                                r13 = 1;
                                ajctVar13 = ajctVar14;
                                vavVar5 = vavVar6;
                                size4 = i19;
                                i17 = 0;
                                c = 2;
                            }
                            vavVar4 = vavVar5;
                            i16 = i17;
                            r2 = r13;
                            arrayList3.add(defpackage.ahvr.aj(arrayList4).o(new onq(14), ajctVar13));
                        }
                        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(aifyVar5).filter(new defpackage.opv(4)).map(new defpackage.vaq(i16));
                        j$.util.stream.Collector collector = defpackage.aido.a;
                        defpackage.aify aifyVar8 = (defpackage.aify) map.collect(collector);
                        defpackage.aify aifyVar9 = (defpackage.aify) j$.util.Collection.-EL.stream(aifyVar6).filter(new defpackage.opv(5)).map(new defpackage.vaq(2)).collect(collector);
                        final java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        final java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        int size5 = aifyVar9.size();
                        for (int i21 = 0; i21 < size5; i21++) {
                            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) aifyVar9.get(i21);
                            java.lang.String strH = defpackage.vav.h(phoneAccountHandle);
                            arrayList5.add(strH);
                            if (!aifyVar8.contains(strH)) {
                                defpackage.ajcq ajcqVarA4 = vavVar4.f.a(j$.util.Optional.of(phoneAccountHandle));
                                van vanVar = new van(vavVar4, 3);
                                defpackage.ajct ajctVar15 = vavVar4.e;
                                defpackage.ajcq ajcqVarH2 = defpackage.ahvr.H(ajcqVarA4, vanVar, ajctVar15);
                                defpackage.uhj uhjVar = new defpackage.uhj(vavVar4, phoneAccountHandle, 16, null);
                                long j10 = defpackage.ahqx.a;
                                defpackage.ajal ajalVar8 = new defpackage.ajal(ajcqVarH2, new defpackage.ajax(defpackage.ahns.c(false), uhjVar, (int) r2));
                                ajcqVarH2.c(ajalVar8, defpackage.aiql.t(ajctVar15, ajalVar8));
                                arrayList6.add(ajalVar8);
                            }
                        }
                        j$.lang.Iterable.-EL.forEach(aifyVar8, new java.util.function.Consumer() { // from class: vat
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj11) {
                                java.lang.String str = (java.lang.String) obj11;
                                if (arrayList5.contains(str)) {
                                    return;
                                }
                                arrayList6.add(vavVar4.d.d(str, 1));
                            }

                            @Override // java.util.function.Consumer
                            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                                return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
                            }
                        });
                        defpackage.ahda ahdaVar2 = new defpackage.ahda(new defpackage.anpu((boolean) r2, defpackage.aify.j(arrayList6)), (byte[]) null);
                        defpackage.kve kveVar = new defpackage.kve(5);
                        defpackage.ajct ajctVar16 = vavVar4.e;
                        arrayList3.add(ahdaVar2.o(kveVar, ajctVar16));
                        return new defpackage.ahda(new defpackage.anpu((boolean) r2, defpackage.aify.j(arrayList3)), (byte[]) null).o(new defpackage.guy(vavVar4, 20), ajctVar16);
                    }
                }, ajctVar12);
        }
        return ajbhVar;
    }
}
