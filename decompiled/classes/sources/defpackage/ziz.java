package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ziz implements defpackage.ecs {
    final /* synthetic */ defpackage.afgl a;

    public ziz(defpackage.afgl afglVar) {
        this.a = afglVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ecs
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        ziw ziwVar;
        if (aolnVar instanceof ziw) {
            ziwVar = (ziw) aolnVar;
            int i = ziwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ziwVar.c = i - Integer.MIN_VALUE;
            } else {
                ziwVar = new ziw(this, aolnVar);
            }
        } else {
            ziwVar = new ziw(this, aolnVar);
        }
        java.lang.Object obj = ziwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ziwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ajcq ajcqVarA = this.a.a();
            defpackage.aooh.e(ajcqVarA, "cleanup(...)");
            ziwVar.c = 1;
            if (defpackage.aosv.D(ajcqVarA, ziwVar) == aoluVar) {
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

    @Override // defpackage.ecs
    public final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.Object obj, defpackage.aoln aolnVar) {
        return e(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ecs
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object b(defpackage.albh albhVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        zix zixVar;
        if (aolnVar instanceof zix) {
            zixVar = (zix) aolnVar;
            int i = zixVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zixVar.c = i - Integer.MIN_VALUE;
            } else {
                zixVar = new zix(this, aolnVar);
            }
        } else {
            zixVar = new zix(this, aolnVar);
        }
        java.lang.Object objD = zixVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = zixVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarB = this.a.b(albhVar);
            defpackage.aooh.e(ajcqVarB, "migrate(...)");
            zixVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarB, zixVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        defpackage.aooh.e(objD, "await(...)");
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) throws java.lang.Throwable {
        ziy ziyVar;
        if (aolnVar instanceof ziy) {
            ziyVar = (ziy) aolnVar;
            int i = ziyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ziyVar.c = i - Integer.MIN_VALUE;
            } else {
                ziyVar = new ziy(this, aolnVar);
            }
        } else {
            ziyVar = new ziy(this, aolnVar);
        }
        java.lang.Object objD = ziyVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ziyVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.ajcq ajcqVarC = this.a.c();
            defpackage.aooh.e(ajcqVarC, "shouldMigrate(...)");
            ziyVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarC, ziyVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        defpackage.aooh.e(objD, "await(...)");
        return objD;
    }
}
