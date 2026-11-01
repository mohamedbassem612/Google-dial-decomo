package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ovu implements rrz {
    public final android.content.Context a;
    public final rlv b;
    public final ipc c;
    private final defpackage.oxg d;
    private final rsd e;
    private final rsb f;
    private final defpackage.pgi g;

    public ovu(android.content.Context context, ipc ipcVar, rlv rlvVar, defpackage.oxg oxgVar, defpackage.pgi pgiVar) {
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        this.a = context;
        this.c = ipcVar;
        this.b = rlvVar;
        this.d = oxgVar;
        this.g = pgiVar;
        this.e = rsd.m;
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
        defpackage.ovs ovsVar;
        if (aolnVar instanceof defpackage.ovs) {
            ovsVar = (defpackage.ovs) aolnVar;
            int i = ovsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovsVar.c = i - Integer.MIN_VALUE;
            } else {
                ovsVar = new defpackage.ovs(this, aolnVar);
            }
        } else {
            ovsVar = new defpackage.ovs(this, aolnVar);
        }
        java.lang.Object objD = ovsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ovsVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            if (!this.d.a()) {
                defpackage.pgi pgiVar = this.g;
                ovsVar.c = 1;
                objD = pgiVar.d(ovsVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        if (objD != defpackage.owy.SELECTED_ANSWER_METHOD_TAP) {
            return new defpackage.rsh(new defpackage.rsp(new defpackage.rse(2132019115, null)), new defpackage.rry(abja.gf), new defpackage.rrx(new defpackage.rse(2132019114, null)), new defpackage.rsa(new defpackage.rse(2132019113, null), new ovt(this, 0)));
        }
        return null;
    }

    public final void f() {
        this.b.o(rmx.Be);
    }

    public final void g() {
        this.b.o(rmx.Bd);
    }
}
