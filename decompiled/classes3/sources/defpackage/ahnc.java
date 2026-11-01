package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahnc extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ aonn d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahnc(aonn aonnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = aonnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Throwable th;
        ahpj ahpjVar;
        ahne ahneVar;
        java.lang.Object obj2;
        ahpj ahpjVar2;
        aolu aoluVar = aolu.a;
        int i = this.c;
        try {
            if (i == 0) {
                aooc.af(obj);
                aoss aossVar = (aoss) this.e;
                ahoo ahooVar = ahoo.a;
                aooh.e(ahooVar, "INSTANCE");
                aonn aonnVar = this.d;
                ahpe ahpeVarA = ahns.a();
                ahne ahneVar2 = ahpeVarA.e;
                if (ahneVar2 == null) {
                    this.c = 1;
                    if (aonnVar.a(aossVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    ahnd ahndVar = ahnd.a;
                    ahnd ahndVar2 = ahneVar2.b;
                    if (ahooVar == ahoo.a) {
                        ahndVar = ahnd.c;
                    }
                    ahneVar2.b = ahndVar;
                    ahpj ahpjVarD = ahns.d(ahpeVarA, ahooVar);
                    try {
                        this.e = ahneVar2;
                        this.a = ahndVar2;
                        this.b = ahpjVarD;
                        this.c = 2;
                        if (aonnVar.a(aossVar, this) == aoluVar) {
                            return aoluVar;
                        }
                        ahpjVar2 = ahpjVarD;
                        ahneVar = ahneVar2;
                        obj2 = ahndVar2;
                        ahns.d(ahns.a(), ahpjVar2);
                        ahneVar.b = (ahnd) obj2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ahpjVar = ahpjVarD;
                        ahneVar = ahneVar2;
                        obj2 = ahndVar2;
                        defpackage.ahnn.b(th);
                        throw th;
                    }
                }
            } else if (i != 1) {
                ahpjVar = this.b;
                obj2 = this.a;
                ahneVar = (ahne) this.e;
                try {
                    aooc.af(obj);
                    ahpjVar2 = ahpjVar;
                    ahns.d(ahns.a(), ahpjVar2);
                    ahneVar.b = (ahnd) obj2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        defpackage.ahnn.b(th);
                        throw th;
                    } catch (java.lang.Throwable th4) {
                        ahns.d(ahns.a(), ahpjVar);
                        ahneVar.b = (ahnd) obj2;
                        throw th4;
                    }
                }
            } else {
                aooc.af(obj);
            }
            return aojh.a;
        } catch (java.lang.Throwable th5) {
            defpackage.ahnn.b(th5);
            throw th5;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ahnc ahncVar = new defpackage.ahnc(this.d, aolnVar);
        ahncVar.e = obj;
        return ahncVar;
    }
}
