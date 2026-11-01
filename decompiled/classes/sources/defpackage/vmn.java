package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vmn implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vmn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0694  */
    /* JADX WARN: Code duplicated, block: B:167:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:168:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:173:0x06b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x06b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:176:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:178:0x06e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v104, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v110, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v67, types: [adnm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.concurrent.Executor] */
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
    public final defpackage.ajcq a(java.lang.Object obj) throws java.io.IOException {
        java.lang.Object obj2;
        defpackage.ajcq ajcqVarF;
        defpackage.ajcq ajddVar;
        defpackage.ajcq ajddVar2;
        defpackage.ajcq ajcmVar;
        java.lang.String str;
        int i;
        int i2 = 11;
        int i3 = 7;
        int i4 = 4;
        int i5 = 6;
        int i6 = 2;
        byte[] bArr = null;
        int i7 = 0;
        int i8 = 1;
        switch (this.$cid) {
            case 0:
                defpackage.jyx jyxVar = new defpackage.jyx((defpackage.aifo) obj, 19);
                defpackage.rsr rsrVar = (defpackage.rsr) this.a;
                return ((defpackage.afhf) rsrVar.a).a(jyxVar, rsrVar.b);
            case 1:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object obj3 = this.a;
                    defpackage.vcz vczVar = new defpackage.vcz(obj3, i7);
                    long j = defpackage.ahqx.a;
                    defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), vczVar, 1));
                    ((defpackage.vda) obj3).c.execute(ajdkVar);
                    ajcmVar = ajdkVar;
                } else {
                    ajcmVar = new defpackage.ajcm(java.lang.Boolean.FALSE);
                }
                break;
            case 2:
                defpackage.aihd aihdVarO = defpackage.aihd.o(((defpackage.aigf) obj).values());
                defpackage.rsr rsrVarAF = new defpackage.kaw("normalized_number").aF((java.util.Collection) j$.util.Collection.-EL.stream(aihdVarO).map(new defpackage.vaq(6)).collect(defpackage.aido.a));
                java.lang.Object obj4 = rsrVarAF.b;
                java.lang.Object obj5 = rsrVarAF.a;
                defpackage.vva vvaVar = (defpackage.vva) this.a;
                defpackage.ajbg ajbgVarD = vvaVar.d.d(defpackage.sro.a, new java.lang.String[]{"normalized_number", "phone_lookup_info"}, (java.lang.String) obj4, (java.lang.String[]) obj5, null);
                defpackage.achf achfVar = new defpackage.achf(i8);
                long j2 = defpackage.ahqx.a;
                return ajbgVarD.c(new defpackage.ahqn(defpackage.ahns.c(false), achfVar), vvaVar.f).h().x(new defpackage.vut(aihdVarO, i8), vvaVar.g);
            case 3:
                java.lang.Object obj6 = this.a;
                defpackage.vva vvaVar2 = (defpackage.vva) obj6;
                defpackage.aify aifyVar = (defpackage.aify) obj;
                defpackage.ajcq ajcqVarO = vvaVar2.q.o(defpackage.aihd.o(aifyVar), new defpackage.kjs(obj6, defpackage.rlt.a(vvaVar2.e, null), 16, bArr));
                defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ajcqVarO);
                defpackage.vut vutVar = new defpackage.vut(aifyVar, i7);
                defpackage.ajcu ajcuVar = vvaVar2.g;
                defpackage.ahrv ahrvVarH = ahrvVarG.h(vutVar, ajcuVar).h(new defpackage.kvf(13), ajcuVar);
                defpackage.vmn vmnVar = new defpackage.vmn(obj6, i6);
                long j3 = defpackage.ahqx.a;
                defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), vmnVar, 1);
                int i9 = defpackage.ajan.c;
                defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarO, ajaxVar);
                ajcqVarO.c(ajalVar, defpackage.aiql.t(ajcuVar, ajalVar));
                return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.o(new defpackage.ajcq[]{ahrvVarH, ajalVar})), (byte[]) null).o(new defpackage.nyf(ahrvVarH, ajalVar, i5), ajcuVar);
            case 4:
                defpackage.xek xekVar = (defpackage.xek) this.a;
                defpackage.ajcq ajcqVarC = xekVar.h.c(xekVar.d, (defpackage.adon) obj);
                defpackage.low lowVar = new defpackage.low("CallScreenCoordinatorForEnUsAndJaJp.initializeSettings$persistentVoiceAudioMessageFileManager.initialize");
                defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                long j4 = defpackage.ahqx.a;
                ajcqVarC.c(new defpackage.ajcc(ajcqVarC, new defpackage.sqh(defpackage.ahns.c(false), lowVar, 2)), ajbmVar);
                return ajcqVarC;
            case 5:
                defpackage.aimz aimzVar = defpackage.xek.b;
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/incallui/callscreen/impl/coordinator/CallScreenCoordinatorForEnUsAndJaJp", "initializeDefaultVoice", 161, "CallScreenCoordinatorForEnUsAndJaJp.java")).v("initializeDefaultVoice");
                defpackage.xek xekVar2 = (defpackage.xek) this.a;
                defpackage.adqn adqnVar = xekVar2.h;
                java.lang.String strH = adqnVar.h();
                java.lang.String str2 = (java.lang.String) defpackage.xek.a.get(strH);
                defpackage.ljb ljbVar = xekVar2.f;
                android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(xekVar2.c);
                if (!ljbVar.a().equals(str2)) {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/incallui/callscreen/impl/coordinator/CallScreenCoordinatorForEnUsAndJaJp", "hasDefaultVoiceForLanguage", 196, "CallScreenCoordinatorForEnUsAndJaJp.java")).I("current voice (%s) isn't value for language to use (%s)", strH, ljbVar.a());
                    defaultSharedPreferences.edit().putBoolean("speak_easy_voice_set_key", false).apply();
                } else if (defaultSharedPreferences.getBoolean("speak_easy_voice_set_key", false)) {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/incallui/callscreen/impl/coordinator/CallScreenCoordinatorForEnUsAndJaJp", "initializeDefaultVoice", 164, "CallScreenCoordinatorForEnUsAndJaJp.java")).v("user has set the voice");
                    return defpackage.ajcm.a;
                }
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/incallui/callscreen/impl/coordinator/CallScreenCoordinatorForEnUsAndJaJp", "initializeDefaultVoice", 168, "CallScreenCoordinatorForEnUsAndJaJp.java")).v("setting default voice");
                java.lang.String str3 = true != ljbVar.a().equals(defpackage.ljb.c) ? "en-US-Wavenet-F" : "ja-JP-Wavenet-B";
                if (adqnVar.h().equals(str3)) {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/incallui/callscreen/impl/coordinator/CallScreenCoordinatorForEnUsAndJaJp", "initializeDefaultVoice", 174, "CallScreenCoordinatorForEnUsAndJaJp.java")).v("default voice already set");
                    return defpackage.ajcm.a;
                }
                defpackage.aify aifyVarA = adqnVar.a();
                int i10 = ((defpackage.aike) aifyVarA).d;
                int i11 = 0;
                while (i11 < i10) {
                    boolean zEquals = str3.equals(((defpackage.adsi) aifyVarA.get(i11)).a);
                    i11++;
                    if (zEquals) {
                        defpackage.ajcq ajcqVarF2 = adqnVar.f(str3);
                        defpackage.low lowVar2 = new defpackage.low("CallScreenCoordinatorForEnUsAndJaJp.initializeDefaultVoice$persistentVoiceAudioMessageFileManager.setVoiceId");
                        defpackage.ajbm ajbmVar2 = defpackage.ajbm.INSTANCE;
                        long j5 = defpackage.ahqx.a;
                        ajcqVarF2.c(new defpackage.ajcc(ajcqVarF2, new defpackage.sqh(defpackage.ahns.c(false), lowVar2, 2)), ajbmVar2);
                        return ajcqVarF2;
                    }
                }
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/incallui/callscreen/impl/coordinator/CallScreenCoordinatorForEnUsAndJaJp", "initializeDefaultVoice", 187, "CallScreenCoordinatorForEnUsAndJaJp.java")).v("default voice is not available");
                return defpackage.ajcm.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                j$.util.Optional optionalD = ((defpackage.xek) this.a).g.d();
                if (true == optionalD.isPresent()) {
                    optionalD = j$.util.Optional.ofNullable(optionalD.get().b(defpackage.adoa.a));
                }
                if (true != optionalD.isPresent()) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.xek.b.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/incallui/callscreen/impl/coordinator/CallScreenCoordinatorForEnUsAndJaJp", "initialize", (char) 128, "CallScreenCoordinatorForEnUsAndJaJp.java")).v("CallAvatarSessionManager unavailable");
                    obj2 = defpackage.ajcm.a;
                } else {
                    obj2 = optionalD.get();
                }
                return (defpackage.ajcq) obj2;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                defpackage.xeq xeqVar = (defpackage.xeq) this.a;
                long millis = epochMilli - java.util.concurrent.TimeUnit.DAYS.toMillis(((java.lang.Long) xeqVar.g.a()).longValue());
                defpackage.aimz aimzVar2 = defpackage.xeq.a;
                ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorker", "deleteTemporaryRecordingsForTranscripts", 154, "CallScreenRecordingsDeletionWorker.java")).x("Clearing temporary recordings older than %s", millis);
                defpackage.aift aiftVar = new defpackage.aift(4);
                for (lkq lkqVar : (java.util.List) obj) {
                    if (lkqVar.f < millis) {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar2.b()).l("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorker", "deleteTemporaryRecordingsForTranscripts", 160, "CallScreenRecordingsDeletionWorker.java")).y("Clearing recording for %s", lkqVar.a);
                        aiftVar.i(lkqVar.a);
                    }
                }
                defpackage.ldb ldbVar = xeqVar.h;
                return defpackage.ahvr.I(ldbVar.d.b(aiftVar.g()), new defpackage.jwf(ldbVar, i2), ldbVar.b);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj7 = this.a;
                defpackage.xeq xeqVar2 = (defpackage.xeq) obj7;
                j$.util.Optional optionalG = xeqVar2.i.g();
                if (!optionalG.isPresent()) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.xeq.a.b()).l("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorker", "deleteOldRecordings", 104, "CallScreenRecordingsDeletionWorker.java")).v("legacy and Tidepods Revelio is not present.");
                    return defpackage.aiql.z(new defpackage.gsf());
                }
                defpackage.swv swvVar = (defpackage.swv) optionalG.orElseThrow();
                if (((java.lang.Boolean) swvVar.e.a()).booleanValue()) {
                    ajcqVarF = swvVar.i.f();
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.swv.a.b()).l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioImpl", "shouldDeleteOldRecordings", 356, "TidepodsRevelioImpl.java")).v("deleting old recordings disabled by flag");
                    ajcqVarF = defpackage.aiql.z(java.lang.Boolean.FALSE);
                }
                return defpackage.ahrv.g(ajcqVarF).i(new xcv(obj7, 8), xeqVar2.d);
            case 9:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.ajcm.a;
                }
                java.lang.Object obj8 = this.a;
                defpackage.xeq xeqVar3 = (defpackage.xeq) obj8;
                return defpackage.ahvr.I(xeqVar3.e.d(), new defpackage.vmn(obj8, i3), xeqVar3.d);
            case 10:
                return ((defpackage.accf) obj).a((defpackage.akiq) this.a);
            case 11:
                java.util.List list = (java.util.List) obj;
                if (list == null) {
                    defpackage.aooh.i("targetedPromotions");
                }
                if (!list.isEmpty()) {
                    afpl afplVar = (afpl) ((defpackage.acea) this.a).u.a();
                    if (list == null) {
                        defpackage.aooh.i("targetedPromotions");
                    }
                    return defpackage.aosv.F(afplVar.a, 0, new abvg(afplVar, list, (defpackage.aoln) null, 7), 3);
                }
                ajcmVar = new defpackage.ajcm(defpackage.ahwt.a);
                break;
                break;
            case 12:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.aooh.f(bool, "gkEnabled");
                boolean zBooleanValue = bool.booleanValue();
                java.lang.Object obj9 = this.a;
                if (zBooleanValue) {
                    defpackage.acxg acxgVar = (defpackage.acxg) ((defpackage.acld) obj9).f.a();
                    return defpackage.aosv.F(acxgVar.b, 0, new defpackage.unj(acxgVar, (defpackage.aoln) null, 18), 3);
                }
                ((defpackage.aiob) defpackage.acld.a.b()).v("GrowthKit is disabled by Phenotype flag, cancelling jobs.");
                defpackage.acxg acxgVar2 = (defpackage.acxg) ((defpackage.acld) obj9).f.a();
                return defpackage.aosv.F(acxgVar2.b, 0, new acbt(acxgVar2, (defpackage.aoln) null, 6, (byte[]) null), 3);
            case 13:
                java.util.List list2 = (java.util.List) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(list2.size() << 1);
                java.util.Iterator it = list2.iterator();
                while (true) {
                    java.lang.Object obj10 = this.a;
                    if (!it.hasNext()) {
                        return new defpackage.anpu(true, defpackage.aify.j(arrayList)).b(new defpackage.kve(12), ((defpackage.aclt) obj10).a);
                    }
                    defpackage.aclw aclwVar = (defpackage.aclw) it.next();
                    try {
                        java.util.List listA = ((defpackage.aclt) obj10).a(aclwVar.a.getClass());
                        java.util.List listA2 = ((defpackage.aclt) obj10).a(defpackage.aclv.class);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(listA.size() + listA2.size());
                        java.util.Iterator it2 = listA.iterator();
                        while (it2.hasNext()) {
                            try {
                                ajddVar2 = ((defpackage.aclu) it2.next()).a(aclwVar);
                            } catch (java.lang.Throwable th) {
                                ajddVar2 = new defpackage.ajdd(th);
                            }
                            arrayList2.add(ajddVar2);
                        }
                        java.util.Iterator it3 = listA2.iterator();
                        while (it3.hasNext()) {
                            try {
                                ajddVar = ((defpackage.aclu) it3.next()).a(aclwVar);
                            } catch (java.lang.Throwable th2) {
                                ajddVar = new defpackage.ajdd(th2);
                            }
                            arrayList2.add(ajddVar);
                        }
                        defpackage.ajbh ajbhVar = new defpackage.ajbh(defpackage.aify.j(arrayList2), true);
                        defpackage.kvf kvfVar = new defpackage.kvf(20);
                        defpackage.ajbm ajbmVar3 = defpackage.ajbm.INSTANCE;
                        int i12 = defpackage.ajan.c;
                        defpackage.ajam ajamVar = new defpackage.ajam(ajbhVar, kvfVar);
                        ajbhVar.c(ajamVar, defpackage.aiql.t(ajbmVar3, ajamVar));
                        arrayList.add(ajamVar);
                        arrayList.add(aclwVar.b);
                    } catch (java.lang.Throwable th3) {
                        arrayList.add(new defpackage.ajdd(th3));
                    }
                }
                break;
            case 14:
                java.io.IOException iOException = (java.io.IOException) obj;
                int i13 = ahzn.a;
                java.lang.Throwable th4 = iOException;
                java.lang.Throwable cause = th4;
                while (true) {
                    java.lang.Throwable cause2 = th4.getCause();
                    if (cause2 == null) {
                        if (th4 instanceof java.io.FileNotFoundException) {
                            return ((defpackage.adff) this.a).b();
                        }
                        throw iOException;
                    }
                    if (cause2 == cause) {
                        throw new java.lang.IllegalArgumentException("Loop in causal chain detected.", cause2);
                    }
                    if (i7 != 0) {
                        cause = cause.getCause();
                    }
                    i7 ^= 1;
                    th4 = cause2;
                }
                break;
            case 15:
                defpackage.adfl adflVar = (defpackage.adfl) obj;
                return defpackage.adff.i(adflVar) ? defpackage.aiql.z(adflVar) : ((defpackage.adff) this.a).b();
            case 16:
                ajcmVar = new defpackage.ajcm(this.a);
                break;
            case 17:
                ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.c()).k((java.lang.Throwable) obj)).l("com/google/android/libraries/micore/superpacks/scheduling/ScheduledDownloadTask", "download", 123, "ScheduledDownloadTask.java")).y("Download %s failed to stop", ((defpackage.adjg) this.a).d().e(true));
                return defpackage.aiql.z(new defpackage.adio(null));
            case 18:
                defpackage.adqe adqeVar = (defpackage.adqe) this.a;
                defpackage.adon adonVar = adqeVar.e;
                defpackage.ajct ajctVar = adqeVar.d;
                android.content.Context context = adqeVar.b;
                defpackage.adqb adqbVar = adqeVar.i;
                return adqbVar.b.a(new defpackage.aeuw(adqbVar, ajctVar, adonVar, context, 1));
            case 19:
                java.lang.Object obj11 = this.a;
                return defpackage.aiql.y(new defpackage.adnt(java.lang.String.format("Failed to generate file '%s'", obj11), (defpackage.adse) obj, (defpackage.adnv) obj11));
            default:
                defpackage.ajcm ajcmVar2 = new defpackage.ajcm(java.lang.Boolean.TRUE);
                defpackage.aimz aimzVar3 = defpackage.adrw.a;
                ((defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "isModelAvailable", 134, "TerseModelManagerImpl.java")).v("TerseModelManagerImpl: Entering isModelAvailable().");
                defpackage.adrw adrwVar = (defpackage.adrw) this.a;
                defpackage.adqv adqvVar = adrwVar.c;
                int iD = adqvVar.d();
                if (iD != 3) {
                    java.lang.String strA = adrwVar.a();
                    if (defpackage.ahvr.cp(strA)) {
                        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "isModelAvailable", 152, "TerseModelManagerImpl.java");
                        if (iD == 2) {
                            str = "Not available";
                        } else {
                            str = "Error";
                        }
                        aimwVar.y("isModelAvailable(): Model file isn't available on device - returning '%s'", str);
                        if (iD == 2) {
                        }
                    } else {
                        java.io.File file = new java.io.File(strA);
                        if (file.exists() && file.isFile() && file.canRead()) {
                            ((defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "isModelAvailable", 144, "TerseModelManagerImpl.java")).y("isModelAvailable(): Model file is available on device - returning '%s'.", iD == 1 ? "Available" : "Older version available");
                            i4 = iD;
                        } else {
                            defpackage.aimw aimwVar2 = (defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "isModelAvailable", 152, "TerseModelManagerImpl.java");
                            if (iD == 2) {
                                str = "Not available";
                            } else {
                                str = "Error";
                            }
                            aimwVar2.y("isModelAvailable(): Model file isn't available on device - returning '%s'", str);
                            if (iD == 2) {
                            }
                        }
                    }
                    i = i4 - 1;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                return adqvVar.e(adrwVar.d);
                            }
                            ajcmVar = new defpackage.ajdd(new java.lang.Exception("isModelAvailable returned 'error' - can't determine Terse model availability."));
                        } else {
                            defpackage.ajcu ajcuVar2 = adrwVar.d;
                            defpackage.ajcq ajcqVarE = adqvVar.e(ajcuVar2);
                            ajcqVarE.c(new defpackage.ajcc(ajcqVarE, new uwo(adrwVar, 11)), ajcuVar2);
                        }
                        break;
                    } else {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "loadResources", 82, "TerseModelManagerImpl.java")).v("loadResources(): returning available model");
                    }
                    return ajcmVar2;
                }
                ((defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "isModelAvailable", 137, "TerseModelManagerImpl.java")).v("isModelAvailable(): resourceManager.isAvailableOnDevice() returned 'unavailable.");
                i4 = 3;
                i = i4 - 1;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return adqvVar.e(adrwVar.d);
                        }
                        ajcmVar = new defpackage.ajdd(new java.lang.Exception("isModelAvailable returned 'error' - can't determine Terse model availability."));
                    } else {
                        defpackage.ajcu ajcuVar3 = adrwVar.d;
                        defpackage.ajcq ajcqVarE2 = adqvVar.e(ajcuVar3);
                        ajcqVarE2.c(new defpackage.ajcc(ajcqVarE2, new uwo(adrwVar, 11)), ajcuVar3);
                    }
                    break;
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar3.b()).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "loadResources", 82, "TerseModelManagerImpl.java")).v("loadResources(): returning available model");
                }
                return ajcmVar2;
        }
        return ajcmVar;
    }
}
