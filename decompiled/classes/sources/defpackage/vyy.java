package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vyy implements defpackage.ecs {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataMigration");
    public final defpackage.ojo b;
    public final defpackage.rsr c;
    private final defpackage.aolr d;
    private final defpackage.vzh e;
    private boolean f;
    private final defpackage.apdp g;

    public vyy(defpackage.aolr aolrVar, defpackage.aoss aossVar, defpackage.vzh vzhVar, defpackage.ojo ojoVar, android.content.Context context) {
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.d = aolrVar;
        this.e = vzhVar;
        this.b = ojoVar;
        defpackage.rsr rsrVar = new defpackage.rsr();
        rsrVar.aC(new defpackage.kaw("source_package").aI("=", context.getPackageName()));
        this.c = rsrVar.aB();
        this.g = new defpackage.apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ecs
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        vyv vyvVar;
        if (aolnVar instanceof vyv) {
            vyvVar = (vyv) aolnVar;
            int i = vyvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vyvVar.c = i - Integer.MIN_VALUE;
            } else {
                vyvVar = new vyv(this, aolnVar);
            }
        } else {
            vyvVar = new vyv(this, aolnVar);
        }
        java.lang.Object obj = vyvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = vyvVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.aimz aimzVar = a;
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataMigration", "cleanUp", 76, "VoicemailStatusDataMigration.kt")).v("enter");
            if (this.f) {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataMigration", "cleanUp", 78, "VoicemailStatusDataMigration.kt")).v("already migrated");
                return defpackage.aojh.a;
            }
            defpackage.aolr aolrVar = this.d;
            defpackage.uer uerVar = new defpackage.uer(this, (defpackage.aoln) null, 8);
            vyvVar.c = 1;
            if (defpackage.aoov.aj(aolrVar, uerVar, vyvVar) == aoluVar) {
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
    @Override // defpackage.ecs
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object b(defpackage.vzj vzjVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        vyw vywVar;
        defpackage.vzj vzjVar2;
        if (aolnVar instanceof vyw) {
            vywVar = (vyw) aolnVar;
            int i = vywVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vywVar.c = i - Integer.MIN_VALUE;
            } else {
                vywVar = new vyw(this, aolnVar);
            }
        } else {
            vywVar = new vyw(this, aolnVar);
        }
        java.lang.Object objD = vywVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = vywVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            ((defpackage.aimw) a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataMigration", "migrate", 59, "VoicemailStatusDataMigration.kt")).v("enter");
            vqu vquVarAj = defpackage.wsc.aj(vzjVar.L());
            defpackage.akzx akzxVar = (defpackage.akzx) vquVarAj.a;
            akzxVar.u();
            defpackage.vzj vzjVar3 = (defpackage.vzj) akzxVar.b;
            vzjVar3.b |= 1;
            vzjVar3.d = true;
            defpackage.vzj vzjVarL = vquVarAj.l();
            defpackage.ajcq ajcqVarG = this.e.g(this.c);
            vywVar.d = vzjVarL;
            vywVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarG, vywVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            vzjVar2 = vzjVarL;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.vzj vzjVar4 = vywVar.d;
            defpackage.aooc.af(objD);
            vzjVar2 = vzjVar4;
        }
        defpackage.aify aifyVar = (defpackage.aify) objD;
        boolean zIsEmpty = aifyVar.isEmpty();
        defpackage.aimz aimzVar = a;
        if (zIsEmpty) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataMigration", "migrate", 65, "VoicemailStatusDataMigration.kt")).v("no package status to migrate");
            return vzjVar2;
        }
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataMigration", "migrate", 68, "VoicemailStatusDataMigration.kt")).v("migrate data from database");
        vqu vquVarAj2 = defpackage.wsc.aj(vzjVar2.L());
        defpackage.akzx akzxVar2 = (defpackage.akzx) vquVarAj2.a;
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.vzj) akzxVar2.b).c);
        defpackage.aooh.e(listUnmodifiableList, "getVoicemailStatusList(...)");
        new defpackage.alct(listUnmodifiableList);
        defpackage.aooh.c(aifyVar);
        defpackage.aooh.f(aifyVar, "values");
        akzxVar2.ad(aifyVar);
        return vquVarAj2.l();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ecs
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object c(defpackage.vzj vzjVar, defpackage.aoln aolnVar) {
        defpackage.vyx vyxVar;
        boolean z;
        defpackage.apdp apdpVar;
        if (aolnVar instanceof defpackage.vyx) {
            vyxVar = (defpackage.vyx) aolnVar;
            int i = vyxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vyxVar.d = i - Integer.MIN_VALUE;
            } else {
                vyxVar = new defpackage.vyx(this, aolnVar);
            }
        } else {
            vyxVar = new defpackage.vyx(this, aolnVar);
        }
        java.lang.Object obj = vyxVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = vyxVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                z = vzjVar.d;
                if (z) {
                    ((defpackage.aimw) a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataMigration", "shouldMigrate", 52, "VoicemailStatusDataMigration.kt")).v("already migrated");
                    defpackage.apdp apdpVar2 = this.g;
                    vyxVar.e = apdpVar2;
                    vyxVar.a = true;
                    vyxVar.d = 1;
                    if (apdpVar2.b(vyxVar) == aoluVar) {
                        return aoluVar;
                    }
                    apdpVar = apdpVar2;
                }
                return java.lang.Boolean.valueOf(!z);
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = vyxVar.a;
            apdpVar = vyxVar.e;
            defpackage.aooc.af(obj);
            this.f = true;
            return java.lang.Boolean.valueOf(!z);
        } finally {
            apdpVar.d();
        }
    }
}
