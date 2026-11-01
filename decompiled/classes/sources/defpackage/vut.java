package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vut implements defpackage.ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vut(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v18, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r12v56, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v71, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v98, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.Object obj2;
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseF;
        int i = 5;
        boolean z = false;
        int i2 = 4;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                defpackage.aigf aigfVar = (defpackage.aigf) obj;
                java.lang.String[] strArr = defpackage.vva.a;
                defpackage.aift aiftVar = new defpackage.aift(4);
                for (uzo uzoVar : this.a) {
                    hkd hkdVar = (hkd) aigfVar.get(uzoVar);
                    defpackage.akzx akzxVarL = uzoVar.L();
                    defpackage.kiu kiuVar = uzoVar.d;
                    if (kiuVar == null) {
                        kiuVar = defpackage.kiu.a;
                    }
                    defpackage.akzx akzxVarL2 = kiuVar.L();
                    akzxVarL2.u();
                    defpackage.kiu kiuVar2 = (defpackage.kiu) akzxVarL2.b;
                    j$.util.Objects.requireNonNull(hkdVar);
                    kiuVar2.f = hkdVar;
                    kiuVar2.b |= 4;
                    defpackage.kiu kiuVar3 = (defpackage.kiu) akzxVarL2.r();
                    akzxVarL.u();
                    uzo uzoVar2 = akzxVarL.b;
                    j$.util.Objects.requireNonNull(kiuVar3);
                    uzoVar2.d = kiuVar3;
                    uzoVar2.b |= 2;
                    aiftVar.i(akzxVarL.r());
                }
                return aiftVar.g();
            case 1:
                ?? r12 = this.a;
                java.lang.String[] strArr2 = defpackage.vva.a;
                return (defpackage.aigf) j$.util.Collection.-EL.stream((java.util.Collection) r12).filter(new defpackage.opv(7)).collect(defpackage.aido.b(new defpackage.vaq(i), new defpackage.okq((defpackage.aigf) obj, i2)));
            case 2:
                defpackage.vze vzeVar = (defpackage.vze) this.a;
                defpackage.aify aifyVar = (defpackage.aify) obj;
                if (!((java.lang.Boolean) vzeVar.d.a()).booleanValue()) {
                    return aifyVar;
                }
                vzeVar.f.isPresent();
                return aifyVar;
            case 3:
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(((defpackage.vzj) obj).c);
                defpackage.vzh vzhVar = ((defpackage.vze) this.a).b;
                j$.util.Objects.requireNonNull(vzhVar);
                return (defpackage.aify) stream.map(new defpackage.okq(vzhVar, i)).collect(defpackage.aido.a);
            case 4:
                defpackage.aimz aimzVar = defpackage.vzh.a;
                java.lang.String str = (java.lang.String) ((j$.util.Optional) obj).orElse((java.lang.Object) null);
                boolean zIsEmpty = android.text.TextUtils.isEmpty(str);
                java.lang.Object obj3 = this.a;
                if (zIsEmpty) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.vzh.a.b()).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusQuery", "getVoicemailStatusQuerySelection", 165, "VoicemailStatusQuery.java")).v("skipping the source packages condition in the selection query because empty source package");
                    return ((defpackage.rsr) obj3).aB();
                }
                defpackage.rsr rsrVar = new defpackage.rsr();
                j$.lang.Iterable.-EL.forEach(defpackage.vzh.d, new defpackage.vzg(rsrVar, i3));
                defpackage.rsr rsrVar2 = new defpackage.rsr();
                j$.lang.Iterable.-EL.forEach(defpackage.vzh.c, new defpackage.vzg(rsrVar2, z ? 1 : 0));
                defpackage.rsr rsrVar3 = new defpackage.rsr(new defpackage.kaw("source_package").aI("=", str));
                rsrVar3.aD(defpackage.rsr.aA(rsrVar.aB()));
                rsrVar3.aC(rsrVar2.aB());
                defpackage.rsr rsrVar4 = (defpackage.rsr) obj3;
                rsrVar4.aC(rsrVar3.aB());
                return rsrVar4.aB();
            case 5:
                return this.a.a(obj);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.zzm zzmVar = (defpackage.zzm) obj;
                if (zzmVar == null) {
                    return null;
                }
                defpackage.akzz akzzVar = ((defpackage.zyy) this.a).p;
                defpackage.amuc amucVar = ((defpackage.amua) akzzVar.b).m;
                if (amucVar == null) {
                    amucVar = defpackage.amuc.a;
                }
                defpackage.akzz akzzVar2 = (defpackage.akzz) amucVar.L();
                defpackage.amuc amucVar2 = ((defpackage.amua) akzzVar.b).m;
                if (amucVar2 == null) {
                    amucVar2 = defpackage.amuc.a;
                }
                akkp akkpVar = amucVar2.e;
                if (akkpVar == null) {
                    akkpVar = akkp.a;
                }
                defpackage.akzx akzxVarL3 = akkpVar.L();
                java.lang.String strB = zzmVar.b();
                akzxVarL3.u();
                akkp akkpVar2 = akzxVarL3.b;
                j$.util.Objects.requireNonNull(strB);
                akkpVar2.c = strB;
                akko akkoVarA = zzmVar.a();
                akzxVarL3.u();
                akkp akkpVar3 = akzxVarL3.b;
                j$.util.Objects.requireNonNull(akkoVarA);
                akkpVar3.d = akkoVarA;
                akkpVar3.b |= 1;
                akzzVar2.u();
                defpackage.amuc amucVar3 = (defpackage.amuc) akzzVar2.b;
                akkp akkpVarR = akzxVarL3.r();
                j$.util.Objects.requireNonNull(akkpVarR);
                amucVar3.e = akkpVarR;
                amucVar3.b |= 4;
                defpackage.amuc amucVar4 = (defpackage.amuc) akzzVar2.r();
                akzzVar.u();
                defpackage.amua amuaVar = (defpackage.amua) akzzVar.b;
                j$.util.Objects.requireNonNull(amucVar4);
                amuaVar.m = amucVar4;
                amuaVar.b |= 268435456;
                return null;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.aaaf) this.a).c((defpackage.zyy) obj, defpackage.zzt.d);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.achq) this.a).f((java.util.Collection) obj);
            case 9:
                defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) defpackage.adqb.a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioFileSuperpackProvider", "doSync", 371, "AudioFileSuperpackProvider.java");
                defpackage.adqb adqbVar = (defpackage.adqb) this.a;
                aimwVar.y("Sync from superpack %s completed", adqbVar.c);
                adqbVar.d();
                return null;
            case 10:
                defpackage.adqe adqeVar = (defpackage.adqe) this.a;
                defpackage.adon adonVar = adqeVar.e;
                defpackage.adsg adsgVar = adqeVar.c;
                adqeVar.j = new defpackage.aogc(adonVar, adsgVar.a());
                defpackage.adqk adqkVar = adqeVar.h;
                defpackage.adqj adqjVar = adqeVar.g;
                defpackage.adqm adqmVar = new defpackage.adqm(adqkVar, adqjVar);
                defpackage.adqo adqoVar = new defpackage.adqo(adqeVar.d, adsgVar, adqjVar);
                adqeVar.f = adqeVar.e.f ? defpackage.aify.r(adqmVar, adqeVar.i, adqoVar) : defpackage.aify.q(adqmVar, adqoVar);
                ((defpackage.aimw) ((defpackage.aimw) defpackage.adqe.a.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/AudioMessageFileManagerImpl", "asyncInit", 128, "AudioMessageFileManagerImpl.java")).v("asyncInit(): done initializing AudioMessageFileManagerImpl");
                return null;
            case 11:
                java.lang.Integer num = (java.lang.Integer) obj;
                defpackage.aimw aimwVar2 = (defpackage.aimw) ((defpackage.aimw) defpackage.adqy.b.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksResourceManager", "createInitializationFuture", 86, "SuperpacksResourceManager.java");
                java.lang.String str2 = ((defpackage.adqy) this.a).c;
                if (num == null || num.intValue() < 0) {
                    obj2 = num;
                    obj2 = "Unknown";
                }
                obj2 = num;
                aimwVar2.I("createInitializationFuture(): successfully loaded embedded superpacks manifest for '%s' (version %s).", str2, obj2);
                return null;
            case 12:
                return java.lang.Boolean.valueOf(((defpackage.adqy) this.a).d() == 1);
            case 13:
                java.lang.String str3 = (java.lang.String) obj;
                return defpackage.gou.z("", str3, (byte[]) ((defpackage.gou) this.a).c.get(str3));
            case 14:
                java.lang.Object obj4 = this.a;
                defpackage.aeyx aeyxVar = defpackage.aeyy.a;
                java.lang.Object[] objArr = {obj4};
                defpackage.ahvr.ay(objArr, 1);
                aeyxVar.a(new defpackage.aike(objArr, 1));
                return null;
            case 15:
                defpackage.aexy aexyVar = (defpackage.aexy) obj;
                java.lang.Object obj5 = this.a;
                android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
                try {
                    try {
                        synchronized (defpackage.aezw.a) {
                            java.lang.String str4 = (java.lang.String) ((defpackage.aezw) obj5).f.eZ();
                            defpackage.aexv aexvVar = aexyVar.c;
                            if (aexvVar == null) {
                                aexvVar = defpackage.aexv.b;
                            }
                            defpackage.aezw.e(str4, aexvVar, "ce-tmp");
                            defpackage.aexv aexvVar2 = aexyVar.c;
                            if (aexvVar2 == null) {
                                aexvVar2 = defpackage.aexv.b;
                            }
                            ((defpackage.aezw) obj5).g = aexvVar2;
                            break;
                        }
                        synchronized (defpackage.aezw.b) {
                            java.lang.String str5 = (java.lang.String) ((defpackage.aezw) obj5).h.eZ();
                            defpackage.aexw aexwVar = aexyVar.d;
                            if (aexwVar == null) {
                                aexwVar = defpackage.aexw.b;
                            }
                            defpackage.aezw.e(str5, aexwVar, "de-tmp");
                            defpackage.aexw aexwVar2 = aexyVar.d;
                            if (aexwVar2 == null) {
                                aexwVar2 = defpackage.aexw.b;
                            }
                            ((defpackage.aezw) obj5).i = aexwVar2;
                            break;
                        }
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        return null;
                    } catch (java.lang.Throwable th) {
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            case 16:
                ?? r13 = this.a;
                defpackage.afhx afhxVar = (defpackage.afhx) r13;
                java.lang.String str6 = afhxVar.g;
                java.lang.String str7 = (java.lang.String) obj;
                java.io.File databasePath = str6 == null ? afhxVar.b.getDatabasePath(str7) : new java.io.File(str6, str7);
                if (!afhxVar.m) {
                    defpackage.zzx zzxVar = afhxVar.p;
                    java.lang.String path = databasePath.getPath();
                    if (!zzxVar.a.add(path)) {
                        throw new java.lang.IllegalStateException(defpackage.a.bk(path, "DB ", " opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?"));
                    }
                    afhxVar.m = true;
                    android.content.Context context = afhxVar.b;
                    boolean zG = defpackage.afhx.g(context, afhxVar.o);
                    afhxVar.n = zG;
                    if (zG) {
                        try {
                            java.io.File cacheDir = context.getCacheDir();
                            if (cacheDir != null) {
                                ((defpackage.afhx) r13).n = databasePath.getCanonicalPath().startsWith(cacheDir.getCanonicalPath());
                            }
                            break;
                        } catch (java.io.IOException unused) {
                        }
                    }
                }
                java.util.Set set = afhxVar.h;
                if (!set.isEmpty()) {
                    java.util.Iterator it = set.iterator();
                    while (it.hasNext()) {
                        android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) ((java.lang.ref.WeakReference) it.next()).get();
                        if (sQLiteDatabase == null) {
                            it.remove();
                        } else if (sQLiteDatabase.isOpen()) {
                            throw new java.lang.IllegalStateException("Open database reference to " + sQLiteDatabase.getPath() + " already exists. Follow instructions in source to file a bug against TikTok.");
                        }
                    }
                }
                try {
                    try {
                        sQLiteDatabaseF = defpackage.afhx.f(((defpackage.afhx) r13).b, databasePath, ((defpackage.afhx) r13).o, ((defpackage.afhx) r13).d, ((defpackage.afhx) r13).e, ((defpackage.afhx) r13).f);
                        break;
                    } catch (defpackage.afht | defpackage.afhv | defpackage.afhw unused2) {
                        sQLiteDatabaseF = defpackage.afhx.f(((defpackage.afhx) r13).b, databasePath, ((defpackage.afhx) r13).o, ((defpackage.afhx) r13).d, ((defpackage.afhx) r13).e, ((defpackage.afhx) r13).f);
                        break;
                    }
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = sQLiteDatabaseF;
                    afhxVar.h.add(new java.lang.ref.WeakReference(sQLiteDatabase2));
                    afhxVar.b.registerComponentCallbacks(r13);
                    return sQLiteDatabase2;
                } catch (defpackage.afhv e2) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.afhx.a.c()).k(e2)).l("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "innerOpenDatabase", (char) 447, "AsyncSQLiteOpenHelper.java")).v("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                    try {
                        defpackage.afhx.e(databasePath);
                        throw new defpackage.afht("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e2);
                    } catch (java.lang.Throwable th2) {
                        throw new defpackage.afht("Recovery by deletion failed.", th2);
                    }
                } catch (defpackage.afhw e3) {
                    throw new defpackage.afht("Probably-recoverable database upgrade failure.", e3);
                }
            case 17:
                return ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            case 18:
                return ((defpackage.aogc) this.a).b;
            case 19:
                return ((defpackage.aogc) this.a).b;
            default:
                defpackage.aooh.f((java.util.List) obj, "it");
                return (defpackage.ahbm) defpackage.aiql.H(this.a);
        }
    }
}
