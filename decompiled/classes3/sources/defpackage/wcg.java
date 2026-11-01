package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wcg implements defpackage.qbb {
    public defpackage.zul a;
    public java.lang.Boolean b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    @Override // defpackage.qbb
    public final ajcq a() throws aois {
        int i;
        akzx akzxVarM = defpackage.amrj.a.m();
        aooh.f(akzxVarM, "builder");
        defpackage.zul zulVar = this.a;
        if (zulVar != null) {
            int iOrdinal = zulVar.ordinal();
            if (iOrdinal != 0) {
                i = 3;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        i = 4;
                    } else if (iOrdinal == 3) {
                        i = 5;
                    } else if (iOrdinal != 4) {
                        throw new aois();
                    }
                }
            } else {
                i = 2;
            }
            akzxVarM.u();
            defpackage.amrj amrjVar = (defpackage.amrj) akzxVarM.b;
            amrjVar.c = i - 1;
            amrjVar.b |= 1;
        }
        java.lang.Boolean bool = this.b;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            akzxVarM.u();
            defpackage.amrj amrjVar2 = (defpackage.amrj) akzxVarM.b;
            amrjVar2.b |= 2;
            amrjVar2.d = zBooleanValue;
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return aiql.z((defpackage.amrj) aladVarP);
    }

    @Override // defpackage.qbb
    public final /* bridge */ /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        defpackage.amrj amrjVar = (defpackage.amrj) obj;
        aooh.f(akzxVar, "callEventBuilder");
        aooh.f(amrjVar, "data");
        akzxVar.u();
        amow amowVar = akzxVar.b;
        amow amowVar2 = amow.a;
        j$.util.Objects.requireNonNull(amrjVar);
        amowVar.ak = amrjVar;
        amowVar.d |= 4;
    }
}
