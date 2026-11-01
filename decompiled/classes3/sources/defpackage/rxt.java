package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rxt extends defpackage.abxm {
    private final defpackage.sfa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxt(aolr aolrVar, defpackage.sfa sfaVar) {
        super(aolrVar);
        aooh.f(aolrVar, "lightweightContext");
        this.b = sfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.abxm
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.rxs rxsVar;
        android.accounts.Account account;
        if (aolnVar instanceof defpackage.rxs) {
            rxsVar = (defpackage.rxs) aolnVar;
            int i = rxsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxsVar.c = i - Integer.MIN_VALUE;
            } else {
                rxsVar = new defpackage.rxs(this, aolnVar);
            }
        } else {
            rxsVar = new defpackage.rxs(this, aolnVar);
        }
        java.lang.Object objD = rxsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = rxsVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            defpackage.sfa sfaVar = this.b;
            rxsVar.c = 1;
            objD = sfaVar.d(rxsVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        defpackage.ser serVar = (defpackage.ser) objD;
        java.lang.String str = null;
        if (serVar != null && (account = serVar.a) != null) {
            str = account.name;
        }
        akzx akzxVarM = defpackage.abxk.a.m();
        aooh.f(akzxVarM, "builder");
        if (str != null) {
            akzxVarM.u();
            defpackage.abxk abxkVar = (defpackage.abxk) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            abxkVar.b |= 1;
            abxkVar.c = str;
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.abxk) aladVarP;
    }
}
