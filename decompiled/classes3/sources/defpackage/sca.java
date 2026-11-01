package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sca implements rrz {
    public final android.content.Context a;
    public final rlv b;
    public final ipc c;
    private final sah d;
    private final aoin e;
    private final rsd f;
    private final rsb g;

    public sca(android.content.Context context, rlv rlvVar, sah sahVar, ipc ipcVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableMarqueeDynamicLocale");
        this.a = context;
        this.b = rlvVar;
        this.d = sahVar;
        this.c = ipcVar;
        this.e = aoinVar;
        this.f = rsd.j;
        this.g = new rsb(rsn.a);
    }

    public final rsb a() {
        return this.g;
    }

    public final rsd b() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.sbz sbzVar;
        pez rsfVar;
        pez rsfVar2;
        pez rsfVar3;
        if (aolnVar instanceof defpackage.sbz) {
            sbzVar = (defpackage.sbz) aolnVar;
            int i = sbzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbzVar.c = i - Integer.MIN_VALUE;
            } else {
                sbzVar = new defpackage.sbz(this, aolnVar);
            }
        } else {
            sbzVar = new defpackage.sbz(this, aolnVar);
        }
        java.lang.Object objA = sbzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sbzVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            sah sahVar = this.d;
            sbzVar.c = 1;
            objA = sahVar.a(sbzVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        if (!((java.lang.Boolean) objA).booleanValue()) {
            return null;
        }
        aoin aoinVar = this.e;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rsfVar = new defpackage.rse(2132019441, null);
        } else {
            java.lang.String string = this.a.getResources().getString(2132019441);
            aooh.e(string, "getString(...)");
            rsfVar = new defpackage.rsf(string);
        }
        defpackage.rsp rspVar = new defpackage.rsp(rsfVar);
        defpackage.rsc rscVar = new defpackage.rsc(2131230963);
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rsfVar2 = new defpackage.rse(2132019439, null);
        } else {
            java.lang.String string2 = this.a.getResources().getString(2132019439);
            aooh.e(string2, "getString(...)");
            rsfVar2 = new defpackage.rsf(string2);
        }
        defpackage.rrx rrxVar = new defpackage.rrx(rsfVar2);
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rsfVar3 = new defpackage.rse(2132019440, null);
        } else {
            java.lang.String string3 = this.a.getResources().getString(2132019440);
            aooh.e(string3, "getString(...)");
            rsfVar3 = new defpackage.rsf(string3);
        }
        return new defpackage.rsi(rspVar, rscVar, rrxVar, new defpackage.rsa(rsfVar3, new ovt(this, 8, (char[][]) null)));
    }

    public final /* synthetic */ void f() {
    }

    public final /* synthetic */ void g() {
    }
}
