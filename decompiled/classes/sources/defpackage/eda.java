package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eda {
    final /* synthetic */ defpackage.aoop a;
    final /* synthetic */ defpackage.aoot b;
    final /* synthetic */ defpackage.eei c;
    final /* synthetic */ defpackage.apdp d;

    public eda(defpackage.apdp apdpVar, defpackage.aoop aoopVar, defpackage.aoot aootVar, defpackage.eei eeiVar) {
        this.d = apdpVar;
        this.a = aoopVar;
        this.b = aootVar;
        this.c = eeiVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:19:0x0049, B:32:0x00a2, B:34:0x00aa), top: B:53:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aonn aonnVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.ecz eczVar;
        defpackage.apdp apdpVar;
        defpackage.aoop aoopVar;
        defpackage.eei eeiVar;
        defpackage.aonn aonnVar2;
        defpackage.aoot aootVar;
        defpackage.apdp apdpVar2;
        defpackage.apdp apdpVar3;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.ecz) {
            eczVar = (defpackage.ecz) aolnVar;
            int i = eczVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eczVar.e = i - Integer.MIN_VALUE;
            } else {
                eczVar = new defpackage.ecz(this, aolnVar);
            }
        } else {
            eczVar = new defpackage.ecz(this, aolnVar);
        }
        java.lang.Object obj2 = eczVar.c;
        java.lang.Object obj3 = defpackage.aolu.a;
        int i2 = eczVar.e;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj2);
                apdpVar = this.d;
                aoopVar = this.a;
                defpackage.aoot aootVar2 = this.b;
                eeiVar = this.c;
                eczVar.g = (defpackage.ecu) aonnVar;
                eczVar.h = apdpVar;
                eczVar.a = aoopVar;
                eczVar.b = aootVar2;
                eczVar.f = eeiVar;
                eczVar.e = 1;
                if (apdpVar.b(eczVar) != obj3) {
                    aonnVar2 = aonnVar;
                    aootVar = aootVar2;
                }
                return obj3;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = eczVar.b;
                    aootVar = (defpackage.aoot) eczVar.a;
                    apdpVar2 = eczVar.h;
                    try {
                        defpackage.aooc.af(obj2);
                        aootVar.a = obj;
                        obj3 = aootVar.a;
                        apdpVar2.d();
                        return obj3;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        apdpVar2.d();
                        throw th;
                    }
                }
                eeiVar = (defpackage.eei) eczVar.b;
                aootVar = (defpackage.aoot) eczVar.a;
                apdpVar3 = eczVar.h;
                try {
                    defpackage.aooc.af(obj2);
                    if (defpackage.aooh.n(obj2, aootVar.a)) {
                        apdpVar2 = apdpVar3;
                        obj3 = aootVar.a;
                        apdpVar2.d();
                    } else {
                        eczVar.g = null;
                        eczVar.h = apdpVar3;
                        eczVar.a = aootVar;
                        eczVar.b = obj2;
                        eczVar.e = 3;
                        if (eeiVar.i(obj2, false, eczVar) != obj3) {
                            obj = obj2;
                            apdpVar2 = apdpVar3;
                            aootVar.a = obj;
                            obj3 = aootVar.a;
                            apdpVar2.d();
                        }
                    }
                    return obj3;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2 = apdpVar3;
                    apdpVar2.d();
                    throw th;
                }
            }
            eeiVar = eczVar.f;
            aootVar = (defpackage.aoot) eczVar.b;
            aoopVar = (defpackage.aoop) eczVar.a;
            defpackage.apdp apdpVar4 = eczVar.h;
            aonnVar2 = eczVar.g;
            defpackage.aooc.af(obj2);
            apdpVar = apdpVar4;
            if (aoopVar.a) {
                throw new java.lang.IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            java.lang.Object obj4 = aootVar.a;
            eczVar.g = null;
            eczVar.h = apdpVar;
            eczVar.a = aootVar;
            eczVar.b = eeiVar;
            eczVar.f = null;
            eczVar.e = 2;
            java.lang.Object objA = aonnVar2.a(obj4, eczVar);
            if (objA != obj3) {
                apdpVar3 = apdpVar;
                obj2 = objA;
                if (defpackage.aooh.n(obj2, aootVar.a)) {
                    eczVar.g = null;
                    eczVar.h = apdpVar3;
                    eczVar.a = aootVar;
                    eczVar.b = obj2;
                    eczVar.e = 3;
                    if (eeiVar.i(obj2, false, eczVar) != obj3) {
                        obj = obj2;
                        apdpVar2 = apdpVar3;
                        aootVar.a = obj;
                        obj3 = aootVar.a;
                        apdpVar2.d();
                    }
                } else {
                    apdpVar2 = apdpVar3;
                    obj3 = aootVar.a;
                    apdpVar2.d();
                }
            }
            return obj3;
        } catch (java.lang.Throwable th3) {
            th = th3;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }
}
