package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sby implements defpackage.rrz {
    public final android.content.Context a;
    public final defpackage.rlv b;
    public final defpackage.ipc c;
    private final defpackage.sah d;
    private final defpackage.aoin e;
    private final defpackage.rsd f;
    private final defpackage.rsb g;

    public sby(android.content.Context context, defpackage.ipc ipcVar, defpackage.sah sahVar, defpackage.rlv rlvVar, defpackage.aoin aoinVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.a = context;
        this.c = ipcVar;
        this.d = sahVar;
        this.b = rlvVar;
        this.e = aoinVar;
        this.f = defpackage.rsd.k;
        this.g = new defpackage.rsb(defpackage.rsn.a);
    }

    @Override // defpackage.rrz
    public final defpackage.rsb a() {
        return this.g;
    }

    @Override // defpackage.rrz
    public final defpackage.rsd b() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.rrz
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.io.IOException {
        defpackage.sbx sbxVar;
        rse rsfVar;
        rse rsfVar2;
        rse rsfVar3;
        if (aolnVar instanceof defpackage.sbx) {
            sbxVar = (defpackage.sbx) aolnVar;
            int i = sbxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbxVar.c = i - Integer.MIN_VALUE;
            } else {
                sbxVar = new defpackage.sbx(this, aolnVar);
            }
        } else {
            sbxVar = new defpackage.sbx(this, aolnVar);
        }
        java.lang.Object objA = sbxVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = sbxVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            defpackage.sah sahVar = this.d;
            sbxVar.c = 1;
            objA = sahVar.a(sbxVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objA);
        }
        if (!((java.lang.Boolean) objA).booleanValue()) {
            return null;
        }
        defpackage.aoin aoinVar = this.e;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rsfVar = new rse(2132019743, (java.lang.Object) null);
        } else {
            java.lang.String string = this.a.getResources().getString(2132019743);
            defpackage.aooh.e(string, "getString(...)");
            rsfVar = new rsf(string);
        }
        rsp rspVar = new rsp(rsfVar);
        rsc rscVar = new rsc(2131230963);
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rsfVar2 = new rse(2132019740, (java.lang.Object) null);
        } else {
            java.lang.String string2 = this.a.getResources().getString(2132019740);
            defpackage.aooh.e(string2, "getString(...)");
            rsfVar2 = new rsf(string2);
        }
        rrx rrxVar = new rrx(rsfVar2);
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rsfVar3 = new rse(2132019742, (java.lang.Object) null);
        } else {
            java.lang.String string3 = this.a.getResources().getString(2132019742);
            defpackage.aooh.e(string3, "getString(...)");
            rsfVar3 = new rsf(string3);
        }
        return new rsi(rspVar, rscVar, rrxVar, new rsa(rsfVar3, new defpackage.ovt((java.lang.Object) this, 7, (byte[][]) null)));
    }

    @Override // defpackage.rrz
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.rrz
    public final /* synthetic */ void g() {
    }
}
