package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ajlv implements defpackage.ajep {
    public final java.lang.String a;
    final java.lang.Class b;
    public final int c;

    public ajlv(java.lang.String str, java.lang.Class cls, int i) {
        this.a = str;
        this.b = cls;
        this.c = i;
    }

    @Override // defpackage.ajep
    public final ajpy a(defpackage.akzc akzcVar) throws java.security.GeneralSecurityException {
        defpackage.aogc aogcVarC = defpackage.aogc.C(this.a, defpackage.ajfe.d, akzcVar);
        defpackage.ajmg ajmgVar = defpackage.ajmg.a;
        akxm akxmVarF = ajmgVar.f(defpackage.ajma.a.b(ajmgVar.g(aogcVarC), null), ajfk.a);
        defpackage.akzx akzxVarM = ajpy.a.m();
        java.lang.Object obj = akxmVarF.b;
        akzxVarM.u();
        ajpy ajpyVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(obj);
        ajpyVar.b = (java.lang.String) obj;
        java.lang.Object obj2 = akxmVarF.d;
        akzxVarM.u();
        ajpy ajpyVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(obj2);
        ajpyVar2.c = (defpackage.akzc) obj2;
        int iD = aftt.D((ajfd) akxmVarF.e);
        akzxVarM.u();
        akzxVarM.b.d = defpackage.a.R(iD);
        return akzxVarM.r();
    }

    @Override // defpackage.ajep
    public final java.lang.Class b() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ajep
    public final java.lang.Object c(defpackage.akzc akzcVar) throws java.security.GeneralSecurityException {
        defpackage.aiql aiqlVarE = defpackage.ajmg.a.e(akxm.d(this.a, akzcVar, aftt.B(this.c), aftt.C(5), (java.lang.Integer) null), ajfk.a);
        defpackage.apni apniVar = (defpackage.apni) defpackage.ajmf.a.b.get();
        defpackage.ajmp ajmpVar = new defpackage.ajmp(aiqlVarE.getClass(), this.b);
        ?? r4 = apniVar.a;
        if (r4.containsKey(ajmpVar)) {
            return ((defpackage.ajmo) r4.get(ajmpVar)).c(aiqlVarE);
        }
        throw new java.security.GeneralSecurityException(defpackage.a.bJ(ajmpVar, "No PrimitiveConstructor for ", " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    @Override // defpackage.ajep
    public final java.lang.String d() {
        return this.a;
    }
}
