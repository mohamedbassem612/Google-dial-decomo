package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jax implements defpackage.iox {
    public static final defpackage.iot a = new defpackage.iot(defpackage.jau.a, defpackage.jav.a, new defpackage.kxd(1), defpackage.nnd.b);
    public static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/beesly/impl/settings/service/BeeslyBackup");
    public final defpackage.iqe c;
    public final defpackage.iqm d;
    public final defpackage.rlv e;
    private final defpackage.aoin f;

    public jax(defpackage.aoin aoinVar, defpackage.iqe iqeVar, defpackage.iqm iqmVar, defpackage.rlv rlvVar) {
        defpackage.aooh.f(aoinVar, "beeslySettings");
        defpackage.aooh.f(iqeVar, "backupMigrationFactory");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        this.f = aoinVar;
        this.c = iqeVar;
        this.d = iqmVar;
        this.e = rlvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.iox
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        jaw jawVar;
        if (aolnVar instanceof jaw) {
            jawVar = (jaw) aolnVar;
            int i = jawVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jawVar.c = i - Integer.MIN_VALUE;
            } else {
                jawVar = new jaw(this, aolnVar);
            }
        } else {
            jawVar = new jaw(this, aolnVar);
        }
        java.lang.Object objB = jawVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jawVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            defpackage.jbm jbmVar = (defpackage.jbm) this.f.a();
            jawVar.c = 1;
            objB = jbmVar.b(jawVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
        }
        defpackage.kaw kawVarH = defpackage.kcq.H(((defpackage.jbr) objB).L());
        this.e.o(defpackage.rmx.BEESLY_SETTINGS_BACKED_UP);
        defpackage.akzx akzxVar = (defpackage.akzx) kawVarH.a;
        akzxVar.u();
        defpackage.jbr jbrVar = (defpackage.jbr) akzxVar.b;
        jbrVar.d = null;
        jbrVar.b &= -3;
        akzxVar.u();
        defpackage.jbr jbrVar2 = (defpackage.jbr) akzxVar.b;
        jbrVar2.b &= -5;
        jbrVar2.e = defpackage.jbr.a.e;
        akzxVar.u();
        defpackage.jbr jbrVar3 = (defpackage.jbr) akzxVar.b;
        jbrVar3.b &= -9;
        jbrVar3.f = false;
        akzxVar.u();
        defpackage.jbr jbrVar4 = (defpackage.jbr) akzxVar.b;
        jbrVar4.g = null;
        jbrVar4.b &= -17;
        return kawVarH.f();
    }

    @Override // defpackage.iox
    public final defpackage.iot c() {
        return a;
    }
}
