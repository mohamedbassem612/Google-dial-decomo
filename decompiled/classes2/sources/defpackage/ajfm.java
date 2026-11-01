package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajfm {
    public static final /* synthetic */ int a = 0;

    static {
        java.nio.charset.Charset.forName("UTF-8");
    }

    public static defpackage.ajqd a(defpackage.ajqb ajqbVar) {
        akzx akzxVarM = defpackage.ajqd.a.m();
        int i = ajqbVar.b;
        akzxVarM.u();
        ((defpackage.ajqd) akzxVarM.b).b = i;
        for (defpackage.ajqa ajqaVar : ajqbVar.c) {
            akzx akzxVarM2 = defpackage.ajqc.a.m();
            defpackage.ajpy ajpyVar = ajqaVar.c;
            if (ajpyVar == null) {
                ajpyVar = defpackage.ajpy.a;
            }
            java.lang.String str = ajpyVar.b;
            akzxVarM2.u();
            defpackage.ajqc ajqcVar = (defpackage.ajqc) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            ajqcVar.b = str;
            int iW = a.W(ajqaVar.d);
            if (iW == 0) {
                iW = 1;
            }
            akzxVarM2.u();
            ((defpackage.ajqc) akzxVarM2.b).c = a.Q(iW);
            int iAa = a.aa(ajqaVar.f);
            int i2 = iAa != 0 ? iAa : 1;
            akzxVarM2.u();
            ((defpackage.ajqc) akzxVarM2.b).e = a.S(i2);
            int i3 = ajqaVar.e;
            akzxVarM2.u();
            ((defpackage.ajqc) akzxVarM2.b).d = i3;
            defpackage.ajqc ajqcVar2 = (defpackage.ajqc) akzxVarM2.p();
            akzxVarM.u();
            defpackage.ajqd ajqdVar = (defpackage.ajqd) akzxVarM.b;
            j$.util.Objects.requireNonNull(ajqcVar2);
            alat alatVar = ajqdVar.c;
            if (!alatVar.c()) {
                ajqdVar.c = alad.J(alatVar);
            }
            ajqdVar.c.add(ajqcVar2);
        }
        return (defpackage.ajqd) akzxVarM.p();
    }
}
