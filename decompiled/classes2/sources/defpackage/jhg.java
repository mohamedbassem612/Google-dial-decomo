package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jhg extends aomh implements aonn {
    java.lang.Object a;
    boolean b;
    int c;
    final /* synthetic */ androidx.work.WorkerParameters d;
    final /* synthetic */ jhh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhg(androidx.work.WorkerParameters workerParameters, jhh jhhVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = workerParameters;
        this.e = jhhVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[Catch: all -> 0x00f6, TRY_ENTER, TryCatch #0 {all -> 0x00f6, blocks: (B:11:0x0032, B:39:0x00ce, B:37:0x00b9), top: B:52:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        grp grpVar;
        int length;
        java.lang.Object objQ;
        java.util.Map map;
        java.lang.Object objC;
        java.lang.Object objD;
        boolean zBooleanValue;
        aour aourVar;
        defpackage.jeb jebVar;
        aolu aoluVar = aolu.a;
        int i = this.c;
        ahdv ahdvVar = "startWork$<anonymous>";
        try {
            if (i != 0) {
                if (i == 1) {
                    aooc.af(obj);
                    objQ = obj;
                } else if (i == 2) {
                    map = (java.util.Map) this.a;
                    aooc.af(obj);
                    objC = obj;
                    ahdvVar = (ahdv) objC;
                    if (ahdvVar == null) {
                        return new defpackage.gsd();
                    }
                    jhh jhhVar = this.e;
                    java.util.List listBZ = ajsz.bZ(map.values());
                    this.a = ahdvVar;
                    this.c = 3;
                    objD = jhhVar.d(ahdvVar, listBZ, this);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                    aourVar = aour.a;
                    jebVar = new defpackage.jeb(ahdvVar, (aoln) null, 17);
                    this.a = null;
                    this.b = zBooleanValue;
                    this.c = 4;
                    if (aoov.aj(aourVar, jebVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i == 3) {
                    ahdvVar = (ahdv) this.a;
                    aooc.af(obj);
                    objD = obj;
                    zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                    aourVar = aour.a;
                    jebVar = new defpackage.jeb(ahdvVar, (aoln) null, 17);
                    this.a = null;
                    this.b = zBooleanValue;
                    this.c = 4;
                    if (aoov.aj(aourVar, jebVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i != 4) {
                        java.lang.Throwable th = (java.lang.Throwable) this.a;
                        aooc.af(obj);
                        throw th;
                    }
                    zBooleanValue = this.b;
                    aooc.af(obj);
                }
                return zBooleanValue ? new gsf() : new defpackage.gsd();
            }
            aooc.af(obj);
            androidx.work.WorkerParameters workerParameters = this.d;
            if (workerParameters == null || (grpVar = workerParameters.b) == null) {
                return new defpackage.gsd();
            }
            long[] jArrG = grpVar.g();
            if (jArrG == null || (length = jArrG.length) == 0) {
                jhh.a.d().l("com/android/dialer/beesly/impl/v2/service/verdict/BeeslyAiCoreContentVerdictWorker", "startWork$<anonymous>", 90, "BeeslyAiCoreContentVerdictWorker.kt").v("Missing or empty timestamps in input data");
                return new defpackage.gsd();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(length);
            for (long j : jArrG) {
                arrayList.add(new defpackage.ity(j));
            }
            java.util.Set setCf = ajsz.cf(arrayList);
            jhh jhhVar2 = this.e;
            this.c = 1;
            objQ = jhhVar2.c.q(setCf, this);
            if (objQ == aoluVar) {
                return aoluVar;
            }
            map = (java.util.Map) objQ;
            if (map.isEmpty()) {
                jhh.a.d().l("com/android/dialer/beesly/impl/v2/service/verdict/BeeslyAiCoreContentVerdictWorker", "startWork$<anonymous>", 98, "BeeslyAiCoreContentVerdictWorker.kt").v("No Beesly data found.");
                return new defpackage.gsd();
            }
            jhh jhhVar3 = this.e;
            this.a = map;
            this.c = 2;
            objC = jhhVar3.c(this);
            if (objC == aoluVar) {
                return aoluVar;
            }
            ahdvVar = (ahdv) objC;
            if (ahdvVar == null) {
                return new defpackage.gsd();
            }
            jhh jhhVar4 = this.e;
            java.util.List listBZ2 = ajsz.bZ(map.values());
            this.a = ahdvVar;
            this.c = 3;
            objD = jhhVar4.d(ahdvVar, listBZ2, this);
            if (objD == aoluVar) {
                return aoluVar;
            }
            zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
            aourVar = aour.a;
            jebVar = new defpackage.jeb(ahdvVar, (aoln) null, 17);
            this.a = null;
            this.b = zBooleanValue;
            this.c = 4;
            if (aoov.aj(aourVar, jebVar, this) == aoluVar) {
                return aoluVar;
            }
            if (zBooleanValue) {
            }
        } catch (java.lang.Throwable th2) {
            aour aourVar2 = aour.a;
            defpackage.jeb jebVar2 = new defpackage.jeb(ahdvVar, (aoln) null, 17);
            this.a = th2;
            this.c = 5;
            if (aoov.aj(aourVar2, jebVar2, this) != aoluVar) {
                throw th2;
            }
            return aoluVar;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jhg(this.d, this.e, aolnVar);
    }
}
