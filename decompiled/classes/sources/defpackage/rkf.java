package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rkf extends defpackage.aomh implements defpackage.aonn {
    int a;
    final /* synthetic */ defpackage.emx b;
    final /* synthetic */ defpackage.rkg c;
    final /* synthetic */ android.app.Activity d;
    final /* synthetic */ defpackage.dxw e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkf(defpackage.aoln aolnVar, defpackage.emx emxVar, defpackage.rkg rkgVar, android.app.Activity activity, defpackage.dxw dxwVar) {
        super(2, aolnVar);
        this.b = emxVar;
        this.c = rkgVar;
        this.d = activity;
        this.e = dxwVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.rkf) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        defpackage.aolu aoluVar = defpackage.aolu.a;
        try {
            if (this.a != 0) {
                defpackage.aooc.af(obj);
            } else {
                defpackage.aooc.af(obj);
                defpackage.ems emsVarP = this.b.P();
                defpackage.emq emqVar = defpackage.emq.e;
                defpackage.edj edjVar = new defpackage.edj(this.c, this.d, this.e, (defpackage.aoln) null, 6);
                this.a = 1;
                if (defpackage.dzn.f(emsVarP, emqVar, edjVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        } catch (java.lang.Exception e) {
            if (e instanceof java.util.concurrent.CancellationException) {
                throw e;
            }
            defpackage.aimz aimzVar = defpackage.zih.a;
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.zih.a.c()).k(e)).m(defpackage.aioa.MEDIUM).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt")).v("Unhandled coroutine exception!");
            throw e;
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.rkf rkfVar = new defpackage.rkf(aolnVar, this.b, this.c, this.d, this.e);
        rkfVar.f = obj;
        return rkfVar;
    }
}
