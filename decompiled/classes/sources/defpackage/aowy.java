package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aowy implements defpackage.aoxh, defpackage.aoxb {
    private final defpackage.aonn a;

    public aowy(defpackage.aonn aonnVar) {
        this.a = aonnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aoxh
    public final java.lang.Object fM(defpackage.aoxi aoxiVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.aowx aowxVar;
        java.lang.Throwable th;
        defpackage.apan apanVar;
        if (aolnVar instanceof defpackage.aowx) {
            aowxVar = (defpackage.aowx) aolnVar;
            int i = aowxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aowxVar.c = i - Integer.MIN_VALUE;
            } else {
                aowxVar = new defpackage.aowx(this, aolnVar);
            }
        } else {
            aowxVar = new defpackage.aowx(this, aolnVar);
        }
        java.lang.Object obj = aowxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aowxVar.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apanVar = aowxVar.d;
            try {
                defpackage.aooc.af(obj);
                apanVar.f();
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                apanVar.f();
                throw th;
            }
        }
        defpackage.aooc.af(obj);
        defpackage.apan apanVar2 = new defpackage.apan(aoxiVar, aowxVar.u());
        try {
            aowxVar.d = apanVar2;
            aowxVar.c = 1;
            java.lang.Object objA = this.a.a(apanVar2, aowxVar);
            if (objA != aoluVar) {
                objA = defpackage.aojh.a;
            }
            if (objA == aoluVar) {
                return aoluVar;
            }
            apanVar = apanVar2;
            apanVar.f();
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th3) {
            th = th3;
            apanVar = apanVar2;
            apanVar.f();
            throw th;
        }
    }
}
