package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nxi implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ nxi(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v57, types: [ahpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v28, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v32, types: [aosy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v29, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v34, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        java.lang.String str;
        int i = 17;
        byte[] bArr = null;
        int i2 = 2;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                return defpackage.aazc.g(this.a, (java.lang.String) this.b, (defpackage.aoln) obj);
            case 1:
                defpackage.gin ginVarA = ((defpackage.gjh) obj).a((java.lang.String) this.b);
                try {
                    ((defpackage.rsr) this.a).b.a(ginVarA);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        arrayList.add(defpackage.nxm.l(ginVarA));
                    }
                    ginVarA.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    ginVarA.close();
                    throw th;
                }
            case 2:
                return ((defpackage.oko) this.b).k.a((android.telecom.PhoneAccountHandle) this.a, (android.telephony.TelephonyManager) obj);
            case 3:
                defpackage.gus gusVar = (defpackage.gus) obj;
                java.lang.Object obj2 = this.a;
                defpackage.mgv mgvVar = defpackage.mgv.TIKTOK_WORK_EXECUTION_MONITOR_ON_WORK_FINISHED;
                androidx.work.WorkerParameters workerParameters = (androidx.work.WorkerParameters) obj2;
                java.util.List listAsList = java.util.Arrays.asList(defpackage.gus.aw(workerParameters.a.toString()), defpackage.gus.aw(defpackage.ole.b(workerParameters)));
                defpackage.aooh.e(listAsList, "asList(...)");
                if (gusVar == null) {
                    defpackage.aooh.g();
                }
                if (defpackage.aooh.n(gusVar, new defpackage.gsf())) {
                    str = "Success";
                } else if (defpackage.aooh.n(gusVar, new gsd())) {
                    str = "Failure";
                } else {
                    str = defpackage.aooh.n(gusVar, new gse()) ? "Retry" : "Unknown";
                }
                defpackage.ole oleVar = (defpackage.ole) this.b;
                defpackage.zjv.i(oleVar.a, mgvVar, listAsList, defpackage.gus.aw(str), 0, 24);
                defpackage.akzx akzxVarM = defpackage.amru.a.m();
                if (akzxVarM == null) {
                    defpackage.aooh.i("builder");
                }
                defpackage.grp grpVar = workerParameters.b;
                if (grpVar.b("enqueue_timestamp", 0L) != 0) {
                    long epochMilli = j$.time.Instant.now().toEpochMilli() - grpVar.b("enqueue_timestamp", 0L);
                    akzxVarM.u();
                    defpackage.amru amruVar = (defpackage.amru) akzxVarM.b;
                    amruVar.b |= 4;
                    amruVar.e = epochMilli;
                }
                int iAQ = defpackage.a.aQ(grpVar.a("worker_feature", 0));
                if (iAQ != 0 && iAQ != 1) {
                    akzxVarM.u();
                    defpackage.amru amruVar2 = (defpackage.amru) akzxVarM.b;
                    amruVar2.c = iAQ - 1;
                    amruVar2.b |= 1;
                }
                if (defpackage.aooh.n(gusVar, new defpackage.gsf())) {
                    i3 = 2;
                } else if (defpackage.aooh.n(gusVar, new gsd())) {
                    i3 = 3;
                } else if (defpackage.aooh.n(gusVar, new gse())) {
                    i3 = 4;
                }
                defpackage.rlv rlvVar = oleVar.b;
                akzxVarM.u();
                defpackage.amru amruVar3 = (defpackage.amru) akzxVarM.b;
                amruVar3.d = i3 - 1;
                amruVar3.b |= 2;
                defpackage.alad aladVarR = akzxVarM.r();
                defpackage.aooh.e(aladVarR, "build(...)");
                rlvVar.w((defpackage.amru) aladVarR);
                return null;
            case 4:
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) obj;
                if (phoneAccountHandle == null) {
                    defpackage.aooh.i("handle");
                }
                return defpackage.ahvr.bJ(new defpackage.jvu(this.b, phoneAccountHandle, i2, bArr), (j$.time.Duration) this.a);
            case 5:
                defpackage.ecp ecpVar = (defpackage.ecp) obj;
                defpackage.aooh.f(ecpVar, "exception");
                ((defpackage.aimw) ((defpackage.aimw) defpackage.zja.a.c()).k(ecpVar).l("com/google/android/dialershared/datastore/DialerDataStoreConfig", "newBuilder$<anonymous>", 44, "DialerDataStoreConfig.kt")).y("Failed to read DataStore for %s", new defpackage.aepg((java.lang.String) this.b));
                return this.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ahyn ahynVar = ((defpackage.aguz) this.b).h;
                java.util.UUID uuid = (java.util.UUID) obj;
                defpackage.mgv mgvVar2 = defpackage.mgv.TIKTOK_WORK_MANAGER_ENQUEUE;
                defpackage.aguy aguyVar = (defpackage.aguy) ahynVar.e();
                java.lang.String str2 = aguyVar != null ? aguyVar.a : "null";
                java.lang.Object obj3 = this.a;
                java.util.List listSingletonList = java.util.Collections.singletonList(defpackage.gus.aw(str2));
                defpackage.aooh.e(listSingletonList, "singletonList(...)");
                defpackage.zjv.i(((defpackage.zjx) obj3).a, mgvVar2, listSingletonList, defpackage.gus.aw(uuid.toString()), 0, 24);
                return uuid;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.String str3 = (java.lang.String) obj;
                if (str3 == null) {
                    defpackage.aooh.i("mendelPackage");
                }
                defpackage.ahkk ahkkVar = ((defpackage.zzx) this.a).t(str3) ? new defpackage.ahkk(1, 1) : new defpackage.ahkk(1, 2);
                android.net.Uri uriM = ((defpackage.ajwr) this.b).m(ahkkVar, java.io.File.separator + "phenotype" + java.io.File.separator + str3);
                defpackage.aooh.e(uriM, "getMobStoreUri(...)");
                return uriM;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.ahbz) ((defpackage.ahct) this.a).d.a()).b((java.lang.String) this.b);
            case 9:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                defpackage.aooh.f(bool, "succeeded");
                if (!bool.booleanValue()) {
                    return defpackage.aiql.z(java.lang.Boolean.FALSE);
                }
                ?? r14 = this.b;
                java.lang.Object obj4 = this.a;
                java.lang.String str4 = (java.lang.String) r14.getKey();
                defpackage.aooh.f(str4, "listenerKey");
                defpackage.ahew ahewVar = (defpackage.ahew) obj4;
                defpackage.zzx zzxVarD = ahewVar.d();
                defpackage.adag adagVar = new defpackage.adag((byte[]) null);
                adagVar.n("INSERT INTO ListenerSuccessfulRuns (listener_key, version_code) VALUES (?, ?)");
                adagVar.p(str4);
                adagVar.o(java.lang.Long.valueOf(ahewVar.d));
                defpackage.ajcq ajcqVarN = zzxVarD.N(adagVar.B());
                defpackage.aooh.e(ajcqVarN, "execSql(...)");
                return defpackage.ahvr.I(ajcqVarN, new defpackage.afgz(new defpackage.aoso(i3), i), ahewVar.b);
            case 10:
                java.util.List list = (java.util.List) obj;
                defpackage.aooh.f(list, "succeededListeners");
                java.util.Set setEntrySet = this.b.entrySet();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj5 : setEntrySet) {
                    if (!list.contains(((java.util.Map.Entry) obj5).getKey())) {
                        arrayList2.add(obj5);
                    }
                }
                defpackage.aokv aokvVar = new defpackage.aokv(10);
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    java.lang.Object obj6 = this.a;
                    if (!it.hasNext()) {
                        java.util.List listAX = defpackage.ajsz.aX(aokvVar);
                        return defpackage.ahvr.ah(listAX).o(new defpackage.vcz(listAX, i), ((defpackage.ahew) obj6).b);
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    defpackage.ahew ahewVar2 = (defpackage.ahew) obj6;
                    defpackage.ajcq ajcqVarG = defpackage.ahvr.G(new defpackage.lkf(obj6, entry, 13), ahewVar2.c);
                    defpackage.agsm.i(1378, ajcqVarG, "Client StartupAfterPackageReplacedListener failed for key: %s", new defpackage.akct(defpackage.akcs.a, entry.getKey()));
                    defpackage.ahda ahdaVarAk = defpackage.ahvr.ak(ajcqVarG);
                    defpackage.kve kveVar = new defpackage.kve(7);
                    defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
                    aokvVar.add(defpackage.ahvr.I(defpackage.ahvr.B(ahdaVarAk.o(kveVar, ajbmVar), java.lang.Exception.class, new defpackage.ahbx(new defpackage.rou(20), 6), ajbmVar), new defpackage.afgz(new defpackage.nxi(obj6, entry, 9), 14), ahewVar2.b));
                }
                break;
            case 11:
                ?? r0 = this.a;
                long j = defpackage.ahqx.a;
                defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
                defpackage.ahpj ahpjVarD = defpackage.ahns.d(ahpeVar, r0);
                try {
                    java.lang.Object objA = this.b.a(obj);
                    defpackage.ahns.d(ahpeVar, ahpjVarD);
                    return objA;
                } catch (java.lang.Throwable th2) {
                    try {
                        ahnn.b(th2);
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        defpackage.ahns.d(ahpeVar, ahpjVarD);
                        throw th3;
                    }
                }
            default:
                java.lang.Throwable th4 = (java.lang.Throwable) obj;
                java.lang.Object obj7 = this.b;
                if (th4 == null) {
                    ((defpackage.apbc) obj7).a(this.a.b());
                } else {
                    ((defpackage.apbc) obj7).b(th4);
                }
                return defpackage.aojh.a;
        }
    }

    public /* synthetic */ nxi(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
