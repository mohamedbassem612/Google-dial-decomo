package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiuo implements defpackage.aonj {
    private final defpackage.apdp a = new defpackage.apdp();
    private defpackage.aiql b;

    public aiuo(defpackage.aonj aonjVar) {
        this.b = new defpackage.aiur(aonjVar);
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.aoln aolnVar = (defpackage.aoln) obj;
        aium aiumVar = this.b;
        int iL = airh.l(aiumVar);
        if (iL == 0) {
            return aiumVar.a;
        }
        if (iL == 1) {
            return b(aolnVar);
        }
        throw new defpackage.aois();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.aoln aolnVar) throws java.lang.Throwable {
        aiun aiunVar;
        defpackage.apdp apdpVar;
        defpackage.apdp apdpVar2;
        if (aolnVar instanceof aiun) {
            aiunVar = (aiun) aolnVar;
            int i = aiunVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aiunVar.c = i - Integer.MIN_VALUE;
            } else {
                aiunVar = new aiun(this, aolnVar);
            }
        } else {
            aiunVar = new aiun(this, aolnVar);
        }
        java.lang.Object obj = aiunVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = aiunVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                apdpVar = this.a;
                aiunVar.d = apdpVar;
                aiunVar.c = 1;
                if (apdpVar.b(aiunVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = aiunVar.d;
                try {
                    defpackage.aooc.af(obj);
                    this.b = new aium(obj);
                    obj2 = obj;
                    apdpVar = apdpVar2;
                    apdpVar.d();
                    return obj2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    apdpVar2.d();
                    throw th;
                }
            }
            defpackage.apdp apdpVar3 = aiunVar.d;
            defpackage.aooc.af(obj);
            apdpVar = apdpVar3;
            aium aiumVar = this.b;
            int iL = airh.l(aiumVar);
            if (iL == 0) {
                obj2 = aiumVar.a;
                apdpVar.d();
            } else {
                if (iL != 1) {
                    throw new defpackage.aois();
                }
                defpackage.aonj aonjVar = ((defpackage.aiur) aiumVar).a;
                aiunVar.d = apdpVar;
                aiunVar.c = 2;
                java.lang.Object objA = aonjVar.a(aiunVar);
                if (objA != obj2) {
                    apdpVar2 = apdpVar;
                    obj = objA;
                    this.b = new aium(obj);
                    obj2 = obj;
                    apdpVar = apdpVar2;
                    apdpVar.d();
                }
            }
            return obj2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }
}
