package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pfa implements defpackage.pdz {
    private final defpackage.zij a;
    private final defpackage.qbe b;

    public pfa(defpackage.zij zijVar, defpackage.qbe qbeVar) {
        aooh.f(qbeVar, "inCallLogging");
        this.a = zijVar;
        this.b = qbeVar;
    }

    @Override // defpackage.pdz
    public final void a(java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            this.b.a(qbc.nJ);
            defpackage.zij zijVar = this.a;
            akzx akzxVarM = defpackage.pey.a.m();
            aooh.f(akzxVarM, "builder");
            akzxVarM.u();
            defpackage.pey peyVar = (defpackage.pey) akzxVarM.b;
            peyVar.c = a.U(3);
            peyVar.b |= 1;
            akzxVarM.u();
            defpackage.pey peyVar2 = (defpackage.pey) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            peyVar2.b |= 2;
            peyVar2.d = str2;
            if (str != null) {
                akzxVarM.u();
                defpackage.pey peyVar3 = (defpackage.pey) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                peyVar3.b |= 4;
                peyVar3.e = str;
            }
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            zijVar.c((defpackage.pey) aladVarP);
        }
    }

    @Override // defpackage.pdz
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.pdz
    public final /* synthetic */ void c(int i) {
    }
}
