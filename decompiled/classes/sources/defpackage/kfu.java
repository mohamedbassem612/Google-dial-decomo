package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kfu implements defpackage.aguq {
    public static final defpackage.grn a;
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker");
    private static final defpackage.rsr j;
    private final defpackage.zjx c;
    private final defpackage.aoss d;
    private final defpackage.ajct e;
    private final defpackage.ojo f;
    private final defpackage.zrw g;
    private final defpackage.aoin h;
    private final defpackage.afhf i;
    private final defpackage.rsr k;

    static {
        defpackage.rsr rsrVar = new defpackage.rsr();
        java.lang.String str = java.lang.String.format(java.util.Locale.US, "length(%s) >= %d", java.util.Arrays.copyOf(new java.lang.Object[]{"phone_account_id", 18}, 2));
        defpackage.aooh.e(str, "format(...)");
        rsrVar.aC(defpackage.rsr.az(str, new java.lang.String[0]));
        java.lang.String str2 = java.lang.String.format(java.util.Locale.US, "length(%s) <= %d", java.util.Arrays.copyOf(new java.lang.Object[]{"phone_account_id", 22}, 2));
        defpackage.aooh.e(str2, "format(...)");
        rsrVar.aC(defpackage.rsr.az(str2, new java.lang.String[0]));
        j = rsrVar.aB();
        defpackage.grl grlVar = new defpackage.grl();
        grlVar.b = true;
        grlVar.a = true;
        a = grlVar.a();
    }

    public kfu(defpackage.zjx zjxVar, defpackage.aoss aossVar, defpackage.ajct ajctVar, defpackage.ojo ojoVar, defpackage.zrw zrwVar, defpackage.aazc aazcVar, defpackage.afhf afhfVar, defpackage.rsr rsrVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(zjxVar, "dialerTikTokWorkManager");
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(ajctVar, "lightweightExecutor");
        defpackage.aooh.f(ojoVar, "dialerContentResolver");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(afhfVar, "protoDataStore");
        this.c = zjxVar;
        this.d = aossVar;
        this.e = ajctVar;
        this.f = ojoVar;
        this.g = zrwVar;
        this.i = afhfVar;
        this.k = rsrVar;
        this.h = aoinVar;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        return defpackage.aosv.F(this.d, 0, new jlk(this, (defpackage.aoln) null, 19), 3);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:49:0x013d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0159 A[LOOP:0: B:50:0x0153->B:52:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.lang.Throwable {
        kfr kfrVar;
        defpackage.ajcq ajcqVarA;
        java.util.Collection collection;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int iIntValue;
        defpackage.ajcq ajcqVarA2;
        if (aolnVar instanceof kfr) {
            kfrVar = (kfr) aolnVar;
            int i = kfrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfrVar.d = i - Integer.MIN_VALUE;
            } else {
                kfrVar = new kfr(this, aolnVar);
            }
        } else {
            kfrVar = new kfr(this, aolnVar);
        }
        java.lang.Object objE = kfrVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        switch (kfrVar.d) {
            case 0:
                defpackage.aooc.af(objE);
                ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 72, "IccIdCleanupWorker.kt")).v("enter");
                defpackage.ahvr.ca(android.os.Build.VERSION.SDK_INT >= 33, "icc id cleanup should not be scheduled on android earlier than tiramisu, but it was scheduled in [%s]", android.os.Build.VERSION.SDK_INT);
                kfrVar.d = 1;
                objE = e(kfrVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objE).booleanValue()) {
                    ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 82, "IccIdCleanupWorker.kt")).v("icc id cleanup was scheduled again after it is finished");
                    ajcqVarA = this.c.a("com.android.dialer.calllog.datasources.systemcalllog.iccidcleanup.IccIdCleanupWorker");
                    kfrVar.d = 2;
                    if (defpackage.aosv.D(ajcqVarA, kfrVar) == aoluVar) {
                        return aoluVar;
                    }
                    return new defpackage.gsf();
                }
                defpackage.ajcq ajcqVarA3 = this.g.a();
                kfrVar.d = 3;
                objE = defpackage.aosv.D(ajcqVarA3, kfrVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objE).booleanValue()) {
                    ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 91, "IccIdCleanupWorker.kt")).v("no call log read permissions");
                    return new gsd();
                }
                defpackage.zrw zrwVar = this.g;
                defpackage.ajcq ajcqVarF = defpackage.aosv.F(zrwVar.d, 0, new zqs(zrwVar, (defpackage.aoln) null, 6, (char[]) null), 3);
                kfrVar.d = 4;
                objE = defpackage.aosv.D(ajcqVarF, kfrVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objE).booleanValue()) {
                    ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 98, "IccIdCleanupWorker.kt")).v("no call log write permissions");
                    return new gsd();
                }
                kfrVar.d = 5;
                objE = d(kfrVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                collection = (java.util.Collection) objE;
                kfrVar.d = 6;
                if (collection.isEmpty()) {
                    objE = new java.lang.Integer(0);
                } else {
                    defpackage.kaw kawVar = new defpackage.kaw("_id");
                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collection, 10));
                    it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
                    }
                    defpackage.rsr rsrVarAF = kawVar.aF(arrayList);
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("last_modified", new java.lang.Long(j$.time.Instant.now().toEpochMilli()));
                    defpackage.ojo ojoVar = this.f;
                    android.net.Uri uri = android.provider.CallLog.Calls.CONTENT_URI;
                    defpackage.aooh.e(uri, "CONTENT_URI");
                    objE = defpackage.aosv.D(ojoVar.f(uri, contentValues, (java.lang.String) rsrVarAF.b, (java.lang.String[]) rsrVarAF.a), kfrVar);
                }
                if (objE == aoluVar) {
                    return aoluVar;
                }
                iIntValue = ((java.lang.Number) objE).intValue();
                kfrVar.a = iIntValue;
                kfrVar.d = 7;
                if (defpackage.aosv.D(this.i.a(new jss(new kbz(8), 13), this.e), kfrVar) == aoluVar) {
                    return aoluVar;
                }
                ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 107, "IccIdCleanupWorker.kt")).w("icc id cleanup finished with %d row(s) updated", iIntValue);
                ajcqVarA2 = this.c.a("com.android.dialer.calllog.datasources.systemcalllog.iccidcleanup.IccIdCleanupWorker");
                kfrVar.d = 8;
                if (defpackage.aosv.D(ajcqVarA2, kfrVar) == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.gsf();
            case 1:
                defpackage.aooc.af(objE);
                if (((java.lang.Boolean) objE).booleanValue()) {
                    ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 82, "IccIdCleanupWorker.kt")).v("icc id cleanup was scheduled again after it is finished");
                    ajcqVarA = this.c.a("com.android.dialer.calllog.datasources.systemcalllog.iccidcleanup.IccIdCleanupWorker");
                    kfrVar.d = 2;
                    if (defpackage.aosv.D(ajcqVarA, kfrVar) == aoluVar) {
                        return aoluVar;
                    }
                    return new defpackage.gsf();
                }
                defpackage.ajcq ajcqVarA4 = this.g.a();
                kfrVar.d = 3;
                objE = defpackage.aosv.D(ajcqVarA4, kfrVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objE).booleanValue()) {
                    ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 91, "IccIdCleanupWorker.kt")).v("no call log read permissions");
                    return new gsd();
                }
                defpackage.zrw zrwVar2 = this.g;
                defpackage.ajcq ajcqVarF2 = defpackage.aosv.F(zrwVar2.d, 0, new zqs(zrwVar2, (defpackage.aoln) null, 6, (char[]) null), 3);
                kfrVar.d = 4;
                objE = defpackage.aosv.D(ajcqVarF2, kfrVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objE).booleanValue()) {
                    ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 98, "IccIdCleanupWorker.kt")).v("no call log write permissions");
                    return new gsd();
                }
                kfrVar.d = 5;
                objE = d(kfrVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                collection = (java.util.Collection) objE;
                kfrVar.d = 6;
                if (collection.isEmpty()) {
                    objE = new java.lang.Integer(0);
                } else {
                    defpackage.kaw kawVar2 = new defpackage.kaw("_id");
                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collection, 10));
                    it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
                    }
                    defpackage.rsr rsrVarAF2 = kawVar2.aF(arrayList);
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put("last_modified", new java.lang.Long(j$.time.Instant.now().toEpochMilli()));
                    defpackage.ojo ojoVar2 = this.f;
                    android.net.Uri uri2 = android.provider.CallLog.Calls.CONTENT_URI;
                    defpackage.aooh.e(uri2, "CONTENT_URI");
                    objE = defpackage.aosv.D(ojoVar2.f(uri2, contentValues2, (java.lang.String) rsrVarAF2.b, (java.lang.String[]) rsrVarAF2.a), kfrVar);
                }
                if (objE == aoluVar) {
                    return aoluVar;
                }
                iIntValue = ((java.lang.Number) objE).intValue();
                kfrVar.a = iIntValue;
                kfrVar.d = 7;
                if (defpackage.aosv.D(this.i.a(new jss(new kbz(8), 13), this.e), kfrVar) == aoluVar) {
                    return aoluVar;
                }
                ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 107, "IccIdCleanupWorker.kt")).w("icc id cleanup finished with %d row(s) updated", iIntValue);
                ajcqVarA2 = this.c.a("com.android.dialer.calllog.datasources.systemcalllog.iccidcleanup.IccIdCleanupWorker");
                kfrVar.d = 8;
                if (defpackage.aosv.D(ajcqVarA2, kfrVar) == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.gsf();
            case 2:
                defpackage.aooc.af(objE);
                return new defpackage.gsf();
            case 3:
                defpackage.aooc.af(objE);
                if (!((java.lang.Boolean) objE).booleanValue()) {
                    ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 91, "IccIdCleanupWorker.kt")).v("no call log read permissions");
                    return new gsd();
                }
                defpackage.zrw zrwVar3 = this.g;
                defpackage.ajcq ajcqVarF3 = defpackage.aosv.F(zrwVar3.d, 0, new zqs(zrwVar3, (defpackage.aoln) null, 6, (char[]) null), 3);
                kfrVar.d = 4;
                objE = defpackage.aosv.D(ajcqVarF3, kfrVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objE).booleanValue()) {
                    ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 98, "IccIdCleanupWorker.kt")).v("no call log write permissions");
                    return new gsd();
                }
                kfrVar.d = 5;
                objE = d(kfrVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                collection = (java.util.Collection) objE;
                kfrVar.d = 6;
                if (collection.isEmpty()) {
                    objE = new java.lang.Integer(0);
                } else {
                    defpackage.kaw kawVar3 = new defpackage.kaw("_id");
                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collection, 10));
                    it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
                    }
                    defpackage.rsr rsrVarAF3 = kawVar3.aF(arrayList);
                    android.content.ContentValues contentValues3 = new android.content.ContentValues();
                    contentValues3.put("last_modified", new java.lang.Long(j$.time.Instant.now().toEpochMilli()));
                    defpackage.ojo ojoVar3 = this.f;
                    android.net.Uri uri3 = android.provider.CallLog.Calls.CONTENT_URI;
                    defpackage.aooh.e(uri3, "CONTENT_URI");
                    objE = defpackage.aosv.D(ojoVar3.f(uri3, contentValues3, (java.lang.String) rsrVarAF3.b, (java.lang.String[]) rsrVarAF3.a), kfrVar);
                }
                if (objE == aoluVar) {
                    return aoluVar;
                }
                iIntValue = ((java.lang.Number) objE).intValue();
                kfrVar.a = iIntValue;
                kfrVar.d = 7;
                if (defpackage.aosv.D(this.i.a(new jss(new kbz(8), 13), this.e), kfrVar) == aoluVar) {
                    return aoluVar;
                }
                ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 107, "IccIdCleanupWorker.kt")).w("icc id cleanup finished with %d row(s) updated", iIntValue);
                ajcqVarA2 = this.c.a("com.android.dialer.calllog.datasources.systemcalllog.iccidcleanup.IccIdCleanupWorker");
                kfrVar.d = 8;
                if (defpackage.aosv.D(ajcqVarA2, kfrVar) == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.gsf();
            case 4:
                defpackage.aooc.af(objE);
                if (!((java.lang.Boolean) objE).booleanValue()) {
                    ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 98, "IccIdCleanupWorker.kt")).v("no call log write permissions");
                    return new gsd();
                }
                kfrVar.d = 5;
                objE = d(kfrVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                collection = (java.util.Collection) objE;
                kfrVar.d = 6;
                if (collection.isEmpty()) {
                    objE = new java.lang.Integer(0);
                } else {
                    defpackage.kaw kawVar4 = new defpackage.kaw("_id");
                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collection, 10));
                    it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
                    }
                    defpackage.rsr rsrVarAF4 = kawVar4.aF(arrayList);
                    android.content.ContentValues contentValues4 = new android.content.ContentValues();
                    contentValues4.put("last_modified", new java.lang.Long(j$.time.Instant.now().toEpochMilli()));
                    defpackage.ojo ojoVar4 = this.f;
                    android.net.Uri uri4 = android.provider.CallLog.Calls.CONTENT_URI;
                    defpackage.aooh.e(uri4, "CONTENT_URI");
                    objE = defpackage.aosv.D(ojoVar4.f(uri4, contentValues4, (java.lang.String) rsrVarAF4.b, (java.lang.String[]) rsrVarAF4.a), kfrVar);
                }
                if (objE == aoluVar) {
                    return aoluVar;
                }
                iIntValue = ((java.lang.Number) objE).intValue();
                kfrVar.a = iIntValue;
                kfrVar.d = 7;
                if (defpackage.aosv.D(this.i.a(new jss(new kbz(8), 13), this.e), kfrVar) == aoluVar) {
                    return aoluVar;
                }
                ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 107, "IccIdCleanupWorker.kt")).w("icc id cleanup finished with %d row(s) updated", iIntValue);
                ajcqVarA2 = this.c.a("com.android.dialer.calllog.datasources.systemcalllog.iccidcleanup.IccIdCleanupWorker");
                kfrVar.d = 8;
                if (defpackage.aosv.D(ajcqVarA2, kfrVar) == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.gsf();
            case 5:
                defpackage.aooc.af(objE);
                collection = (java.util.Collection) objE;
                kfrVar.d = 6;
                if (collection.isEmpty()) {
                    objE = new java.lang.Integer(0);
                } else {
                    defpackage.kaw kawVar5 = new defpackage.kaw("_id");
                    arrayList = new java.util.ArrayList(defpackage.ajsz.bl(collection, 10));
                    it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).longValue()));
                    }
                    defpackage.rsr rsrVarAF5 = kawVar5.aF(arrayList);
                    android.content.ContentValues contentValues5 = new android.content.ContentValues();
                    contentValues5.put("last_modified", new java.lang.Long(j$.time.Instant.now().toEpochMilli()));
                    defpackage.ojo ojoVar5 = this.f;
                    android.net.Uri uri5 = android.provider.CallLog.Calls.CONTENT_URI;
                    defpackage.aooh.e(uri5, "CONTENT_URI");
                    objE = defpackage.aosv.D(ojoVar5.f(uri5, contentValues5, (java.lang.String) rsrVarAF5.b, (java.lang.String[]) rsrVarAF5.a), kfrVar);
                }
                if (objE == aoluVar) {
                    return aoluVar;
                }
                iIntValue = ((java.lang.Number) objE).intValue();
                kfrVar.a = iIntValue;
                kfrVar.d = 7;
                if (defpackage.aosv.D(this.i.a(new jss(new kbz(8), 13), this.e), kfrVar) == aoluVar) {
                    return aoluVar;
                }
                ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 107, "IccIdCleanupWorker.kt")).w("icc id cleanup finished with %d row(s) updated", iIntValue);
                ajcqVarA2 = this.c.a("com.android.dialer.calllog.datasources.systemcalllog.iccidcleanup.IccIdCleanupWorker");
                kfrVar.d = 8;
                if (defpackage.aosv.D(ajcqVarA2, kfrVar) == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.gsf();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aooc.af(objE);
                iIntValue = ((java.lang.Number) objE).intValue();
                kfrVar.a = iIntValue;
                kfrVar.d = 7;
                if (defpackage.aosv.D(this.i.a(new jss(new kbz(8), 13), this.e), kfrVar) == aoluVar) {
                    return aoluVar;
                }
                ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 107, "IccIdCleanupWorker.kt")).w("icc id cleanup finished with %d row(s) updated", iIntValue);
                ajcqVarA2 = this.c.a("com.android.dialer.calllog.datasources.systemcalllog.iccidcleanup.IccIdCleanupWorker");
                kfrVar.d = 8;
                if (defpackage.aosv.D(ajcqVarA2, kfrVar) == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.gsf();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                iIntValue = kfrVar.a;
                defpackage.aooc.af(objE);
                ((defpackage.aimw) b.b().l("com/android/dialer/calllog/datasources/systemcalllog/iccidcleanup/IccIdCleanupWorker", "cleanup", 107, "IccIdCleanupWorker.kt")).w("icc id cleanup finished with %d row(s) updated", iIntValue);
                ajcqVarA2 = this.c.a("com.android.dialer.calllog.datasources.systemcalllog.iccidcleanup.IccIdCleanupWorker");
                kfrVar.d = 8;
                if (defpackage.aosv.D(ajcqVarA2, kfrVar) == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.gsf();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aooc.af(objE);
                return new defpackage.gsf();
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) throws java.lang.Throwable {
        kfs kfsVar;
        java.util.ArrayList arrayList;
        java.lang.String str;
        java.lang.Long l;
        int length;
        if (aolnVar instanceof kfs) {
            kfsVar = (kfs) aolnVar;
            int i = kfsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfsVar.c = i - Integer.MIN_VALUE;
            } else {
                kfsVar = new kfs(this, aolnVar);
            }
        } else {
            kfsVar = new kfs(this, aolnVar);
        }
        java.lang.Object objD = kfsVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kfsVar.c;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objD);
                defpackage.aooh.c(objD);
                return (java.util.Collection) objD;
            }
            defpackage.aooc.af(objD);
            arrayList = new java.util.ArrayList();
            for (kdy kdyVar : (java.lang.Iterable) objD) {
                str = kdyVar.k;
                l = null;
                if (str != null && (length = str.length()) >= 18 && length <= 22) {
                    l = new java.lang.Long(kdyVar.a);
                }
                if (l != null) {
                    arrayList.add(l);
                }
            }
            return arrayList;
        }
        defpackage.aooc.af(objD);
        if (!((java.lang.Boolean) this.h.a()).booleanValue()) {
            defpackage.ojo ojoVar = this.f;
            android.net.Uri uri = kee.a;
            defpackage.aooh.e(uri, "CONTENT_URI");
            defpackage.rsr rsrVar = j;
            defpackage.ajck ajckVarH = ojoVar.d(uri, new java.lang.String[]{"_id", "phone_account_id"}, (java.lang.String) rsrVar.b, (java.lang.String[]) rsrVar.a, null).c(defpackage.ahqx.e(new defpackage.kwb(i3)), this.e).h();
            defpackage.aooh.e(ajckVarH, "finishToFuture(...)");
            kfsVar.c = 2;
            objD = defpackage.aosv.D(ajckVarH, kfsVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            defpackage.aooh.c(objD);
            return (java.util.Collection) objD;
        }
        defpackage.rsr rsrVar2 = this.k;
        kfsVar.c = 1;
        objD = defpackage.kcq.S(rsrVar2, kfsVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        arrayList = new java.util.ArrayList();
        while (r11.hasNext()) {
            str = kdyVar.k;
            l = null;
            if (str != null) {
                l = new java.lang.Long(kdyVar.a);
            }
            if (l != null) {
                arrayList.add(l);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) throws java.lang.Throwable {
        kft kftVar;
        if (aolnVar instanceof kft) {
            kftVar = (kft) aolnVar;
            int i = kftVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kftVar.c = i - Integer.MIN_VALUE;
            } else {
                kftVar = new kft(this, aolnVar);
            }
        } else {
            kftVar = new kft(this, aolnVar);
        }
        java.lang.Object objD = kftVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = kftVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarC = this.i.c();
            defpackage.aooh.e(ajcqVarC, "getData(...)");
            kftVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarC, kftVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        return java.lang.Boolean.valueOf(((defpackage.kfq) objD).b);
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
