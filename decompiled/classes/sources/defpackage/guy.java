package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class guy implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ guy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v19, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v94, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, rkt] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        java.lang.Object next;
        boolean z = true;
        int i = 0;
        switch (this.$cid) {
            case 0:
                defpackage.gve gveVar = (defpackage.gve) this.a;
                java.lang.String str = gveVar.c;
                defpackage.gxm gxmVar = gveVar.f;
                if (gxmVar.b(str) == defpackage.gsw.a) {
                    gxmVar.A(defpackage.gsw.b, str);
                    gxmVar.v(str);
                    gxmVar.r(str, -256);
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                defpackage.gxl gxlVar = ((defpackage.gve) this.a).a;
                if (gxlVar.c != defpackage.gsw.a) {
                    defpackage.gsh.a().c(defpackage.gvf.a, java.lang.String.valueOf(gxlVar.d).concat(" is not in ENQUEUED state. Nothing more to do"));
                    return java.lang.Boolean.TRUE;
                }
                if ((!gxlVar.d() && !gxlVar.c()) || java.lang.System.currentTimeMillis() >= gxlVar.a()) {
                    return java.lang.Boolean.FALSE;
                }
                defpackage.gsh.a().c(defpackage.gvf.a, "Delaying execution for " + gxlVar.d + " because it is being executed before schedule.");
                return java.lang.Boolean.TRUE;
            case 2:
                androidx.work.impl.WorkDatabase workDatabase = (androidx.work.impl.WorkDatabase) ((defpackage.ipc) this.a).a;
                java.lang.Long lA = workDatabase.y().a("next_job_scheduler_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                defpackage.kcq.O(workDatabase, iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1);
                if (iLongValue < 0) {
                    defpackage.kcq.O(workDatabase, 1);
                } else {
                    i = iLongValue;
                }
                return java.lang.Integer.valueOf(i);
            case 3:
                return java.lang.Boolean.valueOf(((defpackage.zth) ((defpackage.rsr) this.a).b.a()).a().getBoolean("annotated_call_log_built", false));
            case 4:
                return (defpackage.aigf) j$.util.Collection.-EL.stream(((defpackage.aigf) this.a).entrySet()).collect(defpackage.aido.b(new defpackage.kju(8), new defpackage.kju(9)));
            case 5:
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                for (java.util.Map.Entry entry : this.a.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.util.concurrent.Future future = (java.util.concurrent.Future) entry.getValue();
                    defpackage.ahvr.cc(future.isDone(), "Future was expected to be done: %s", future);
                    aigbVar.i(key, defpackage.a.h(future));
                }
                return aigbVar.e(true);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.mid midVar = (defpackage.mid) this.a;
                if (!((java.lang.Boolean) midVar.d.eZ()).booleanValue()) {
                    z = false;
                } else if (!midVar.b.getPackageManager().hasSystemFeature("com.google.android.apps.dialer.SUPPORTED")) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.mid.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/devices/google/checker/GoogleDeviceCompatibilityChecker", "checkDialerFeature", 'W', "GoogleDeviceCompatibilityChecker.java")).v("dialer system feature is not found!");
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aimz aimzVar = defpackage.onw.a;
                defpackage.aidf aidfVar = new defpackage.aidf(null);
                for (defpackage.ajcq ajcqVar : this.a) {
                    defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
                    aidfVar.y((defpackage.aiii) defpackage.a.h(ajcqVar));
                }
                return aidfVar;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aihb aihbVar = new defpackage.aihb();
                java.util.Iterator it = aa$.ExternalSyntheticApiModelOutline0.m$1(((defpackage.rwo) this.a).d).iterator();
                while (it.hasNext()) {
                    aihbVar.c(aa$.ExternalSyntheticApiModelOutline0.m$1(aa$.ExternalSyntheticApiModelOutline0.m(it.next())));
                }
                return aihbVar.g();
            case 9:
                defpackage.soj sojVar = (defpackage.soj) this.a;
                java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = sojVar.g;
                if (linkedBlockingQueue.isEmpty()) {
                    return null;
                }
                java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
                linkedBlockingQueue.drainTo(arrayList);
                if (!defpackage.abyl.h(sojVar.b)) {
                    return null;
                }
                defpackage.soh sohVar = sojVar.d;
                if (sohVar.d == null) {
                    sohVar.a();
                }
                sohVar.d.createNewFile();
                java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(sohVar.d, true)));
                try {
                    for (byte[] bArr : arrayList) {
                        dataOutputStream.write(defpackage.soh.a);
                        dataOutputStream.writeInt(bArr.length);
                        dataOutputStream.write(bArr);
                        dataOutputStream.write(defpackage.soh.b);
                    }
                    dataOutputStream.close();
                    if (sohVar.d.length() > 65536) {
                        sohVar.a();
                        break;
                    }
                    dataOutputStream.close();
                    return null;
                } catch (java.lang.Throwable th) {
                    try {
                        dataOutputStream.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 10:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.soo.a.b()).l("com/android/dialer/phenotype/GmsFlagCommitter", "commit", 52, "GmsFlagCommitter.java")).v("flags committing");
                return java.lang.Boolean.valueOf(((defpackage.aatb) ((defpackage.soo) this.a).c.eZ()).d(3));
            case 11:
                defpackage.akzx akzxVarM = defpackage.ypl.a.m();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                defpackage.rsr rsrVar = (defpackage.rsr) this.a;
                for (defpackage.ipc ipcVar : rsrVar.a) {
                    java.lang.Object obj = rsrVar.b;
                    defpackage.aooh.f(obj, "snapshot");
                    java.util.Iterator it2 = ipcVar.a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            defpackage.gou gouVar = (defpackage.gou) next;
                            defpackage.aooh.f(obj, "snapshot");
                            if (!((defpackage.ipc) gouVar.d).bf() || !gouVar.b.a(obj)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    defpackage.gou gouVar2 = (defpackage.gou) next;
                    defpackage.ajsz.bv(arrayList2, defpackage.ajsz.aG(gouVar2 != null ? gouVar2.a : null));
                }
                java.util.Set setCf = defpackage.ajsz.cf(arrayList2);
                akzxVarM.u();
                defpackage.ypl yplVar = (defpackage.ypl) akzxVarM.b;
                defpackage.alan alanVar = yplVar.b;
                if (!alanVar.c()) {
                    yplVar.b = defpackage.alad.I(alanVar);
                }
                defpackage.akyl.i(setCf, yplVar.b);
                defpackage.akzz akzzVar = (defpackage.akzz) defpackage.ajsx.a.m();
                akzzVar.bV(defpackage.ypl.c, (defpackage.ypl) akzxVarM.r());
                return (defpackage.ajsx) akzzVar.r();
            case 12:
                defpackage.sqo sqoVar = (defpackage.sqo) this.a;
                defpackage.aoin aoinVar = sqoVar.a;
                java.lang.String strAr = sqoVar.b.ar();
                return java.lang.Boolean.valueOf(!strAr.equals(((defpackage.zth) aoinVar.a()).a().getString("cp2DefaultDirectoryPhoneLookupLastLanguagePersisted", strAr)));
            case 13:
                defpackage.sqo sqoVar2 = (defpackage.sqo) this.a;
                ((defpackage.zth) sqoVar2.a.a()).a().edit().putString("cp2DefaultDirectoryPhoneLookupLastLanguagePersisted", sqoVar2.b.ar()).apply();
                return null;
            case 14:
                defpackage.sqq sqqVar = (defpackage.sqq) this.a;
                ((defpackage.zth) sqqVar.e.a()).a().edit().putString("cp2ExtendedDirectoryPhoneLookupLastLanguagePersisted", sqqVar.k.ar()).apply();
                return null;
            case 15:
                defpackage.sqq sqqVar2 = (defpackage.sqq) this.a;
                defpackage.aoin aoinVar2 = sqqVar2.e;
                java.lang.String strAr2 = sqqVar2.k.ar();
                return java.lang.Boolean.valueOf(!strAr2.equals(((defpackage.zth) aoinVar2.a()).a().getString("cp2ExtendedDirectoryPhoneLookupLastLanguagePersisted", strAr2)));
            case 16:
                defpackage.ssd ssdVar = (defpackage.ssd) this.a;
                android.content.SharedPreferences.Editor editorEdit = ((defpackage.zth) ssdVar.a.a()).a().edit();
                java.lang.Long l = ssdVar.b;
                l.getClass();
                editorEdit.putLong("spamPhoneLookupLastTimestampProcessed", l.longValue()).apply();
                return null;
            case 17:
                defpackage.aca acaVar = new defpackage.aca();
                defpackage.ailj it3 = ((defpackage.aihd) this.a).iterator();
                while (it3.hasNext()) {
                    hkd hkdVar = (hkd) it3.next();
                    java.lang.String str2 = hkdVar.c;
                    java.util.Set accVar = (java.util.Set) acaVar.get(str2);
                    if (accVar == null) {
                        accVar = new defpackage.acc(0);
                        acaVar.put(str2, accVar);
                    }
                    accVar.add(hkdVar);
                }
                defpackage.aigb aigbVar2 = new defpackage.aigb(4);
                for (java.util.Map.Entry entry2 : acaVar.entrySet()) {
                    aigbVar2.i((java.lang.String) entry2.getKey(), defpackage.aihd.o((java.util.Set) entry2.getValue()));
                }
                return aigbVar2.e(true);
            case 18:
                return (j$.util.Optional) this.a.a();
            case 19:
                return java.lang.Boolean.valueOf(((defpackage.urr) this.a).a.a().getBoolean("theme_preference_migrated_key", false));
            default:
                ((defpackage.vav) this.a).u.i(null).b(defpackage.mce.VOICEMAIL_NOTIFICATION_REQUESTED);
                return null;
        }
    }
}
