package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jat implements rrz {
    public final android.content.Context a;
    public final rlv b;
    public final ipc c;
    private final jbm d;
    private final rsd e;
    private final rsb f;

    public jat(android.content.Context context, ipc ipcVar, rlv rlvVar, jbm jbmVar) {
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(jbmVar, "beeslySettings");
        this.a = context;
        this.c = ipcVar;
        this.b = rlvVar;
        this.d = jbmVar;
        this.e = rsd.h;
        this.f = new rsb(rsn.a);
    }

    public final rsb a() {
        return this.f;
    }

    public final rsd b() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.jas jasVar;
        if (aolnVar instanceof defpackage.jas) {
            jasVar = (defpackage.jas) aolnVar;
            int i = jasVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jasVar.c = i - Integer.MIN_VALUE;
            } else {
                jasVar = new defpackage.jas(this, aolnVar);
            }
        } else {
            jasVar = new defpackage.jas(this, aolnVar);
        }
        java.lang.Object objF = jasVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jasVar.c;
        if (i2 == 0) {
            aooc.af(objF);
            jbm jbmVar = this.d;
            jasVar.c = 1;
            objF = jbmVar.f(jasVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
        }
        if (((java.lang.Boolean) objF).booleanValue()) {
            return null;
        }
        return new rsi(new rsp(new rse(2132018853, (java.lang.Object) null)), new rsc(2131231276), new rrx(new rse(2132018852, (java.lang.Object) null)), new rsa(new rse(2132018851, (java.lang.Object) null), new defpackage.coo((java.lang.Object) this, 8, (char[][]) null)));
    }

    public final void f() {
        this.b.o(rmx.xR);
    }

    public final void g() {
        this.b.o(rmx.xQ);
    }
}
