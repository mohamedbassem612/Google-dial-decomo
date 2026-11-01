package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aazv {
    private final java.util.function.Supplier a;
    private final defpackage.anph b;

    public aazv(java.util.function.Supplier supplier, defpackage.anph anphVar) {
        this.a = supplier;
        this.b = anphVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        aazu aazuVar;
        java.lang.Throwable th;
        java.lang.Object obj;
        if (aolnVar instanceof aazu) {
            aazuVar = (aazu) aolnVar;
            int i = aazuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aazuVar.d = i - Integer.MIN_VALUE;
            } else {
                aazuVar = new aazu(this, aolnVar);
            }
        } else {
            aazuVar = new aazu(this, aolnVar);
        }
        java.lang.Object obj2 = aazuVar.b;
        java.lang.Object obj3 = defpackage.aolu.a;
        int i2 = aazuVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = aazuVar.a;
            try {
                defpackage.aooc.af(obj2);
                ((defpackage.anor) obj).d();
                return obj2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ((defpackage.anor) obj).d();
                throw th;
            }
        }
        defpackage.aooc.af(obj2);
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.a);
        defpackage.aooh.e(objM, "get(...)");
        defpackage.anor anorVar = (defpackage.anor) objM;
        defpackage.anmb anmbVar = defpackage.anmb.a;
        defpackage.aooh.e(anmbVar, "DEFAULT");
        java.lang.Object obj4 = (akla) new akla(anorVar, anmbVar).j(new defpackage.aohs(this.b));
        try {
            aazuVar.a = anorVar;
            aazuVar.d = 1;
            java.lang.Object objA = aonnVar.a(obj4, aazuVar);
            if (objA == obj3) {
                return obj3;
            }
            obj2 = objA;
            obj = anorVar;
            ((defpackage.anor) obj).d();
            return obj2;
        } catch (java.lang.Throwable th3) {
            th = th3;
            obj = anorVar;
            ((defpackage.anor) obj).d();
            throw th;
        }
    }
}
