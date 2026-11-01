package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aazl implements defpackage.aazm {
    private static final defpackage.akzc a = defpackage.akzc.w("hades-persephone");
    public final defpackage.ajyk c;

    public aazl() {
        defpackage.ajjx.a();
        this.c = new defpackage.ajyk(defpackage.ajme.a.c(), (byte[]) null);
    }

    protected abstract ajex a();

    @Override // defpackage.aazm
    public final ajex c() throws java.security.GeneralSecurityException {
        defpackage.aiql ajlxVar;
        ajex ajexVarA = a();
        java.util.List<ajew> list = ajexVarA.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (ajew ajewVar : list) {
            if (ajewVar.a() instanceof defpackage.ajfc) {
                ajlxVar = ((defpackage.ajfc) ajewVar.a()).a();
            } else {
                if (!(ajewVar.a() instanceof defpackage.ajlx)) {
                    throw new java.security.GeneralSecurityException("Cannot get Public Key for key of type ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajewVar.a().getClass()))));
                }
                akxm akxmVar = ((defpackage.ajlx) ajewVar.a()).a;
                defpackage.ajlr ajlrVar = defpackage.ajlr.a;
                java.lang.String str = (java.lang.String) akxmVar.b;
                defpackage.ajep ajepVarB = ajlrVar.b(str);
                if (!(ajepVarB instanceof defpackage.ajlu)) {
                    throw new java.security.GeneralSecurityException(defpackage.a.bk(str, "manager for key type ", " is not a PrivateKeyManager"));
                }
                defpackage.ajlu ajluVar = (defpackage.ajlu) ajepVarB;
                akxm akxmVarD = akxm.d(ajluVar.a, (defpackage.akzc) akxmVar.d, aftt.B(ajluVar.c), aftt.C(5), (java.lang.Integer) null);
                defpackage.ajmg ajmgVar = defpackage.ajmg.a;
                ajfk ajfkVar = ajfk.a;
                java.lang.Object objE = ajmgVar.e(akxmVarD, ajfkVar);
                if (!(objE instanceof defpackage.ajfc)) {
                    throw new java.security.GeneralSecurityException("Key not private key");
                }
                akxm akxmVarF = ajmgVar.f(((defpackage.ajfc) objE).a(), ajfkVar);
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
                ajpy ajpyVarR = akzxVarM.r();
                java.lang.String str2 = ajpyVarR.b;
                defpackage.akzc akzcVar = ajpyVarR.c;
                int iAb = defpackage.a.ab(ajpyVarR.d);
                if (iAb == 0) {
                    iAb = 1;
                }
                java.lang.Object obj3 = akxmVar.c;
                defpackage.ajfe ajfeVar = (defpackage.ajfe) obj3;
                ajlxVar = new defpackage.ajlx(akxm.d(str2, akzcVar, aftt.B(iAb), ajfeVar, (java.lang.Integer) akxmVar.a), null);
            }
            int i = ajewVar.f;
            int i2 = ajewVar.c;
            ajew ajewVar2 = new ajew(ajlxVar, i, i2, ajewVar.d, false, ajew.a);
            ajex.l(ajlxVar, i2);
            arrayList.add(ajewVar2);
        }
        return ajex.e(new ajex(arrayList, ajexVarA.b));
    }

    @Override // defpackage.aazm
    public final byte[] d(defpackage.akzc akzcVar, defpackage.akzc akzcVar2) {
        defpackage.aooh.f(akzcVar, "ciphertext");
        defpackage.ajen ajenVar = (defpackage.ajen) a().i(ajjy.a(), defpackage.ajen.class);
        byte[] bArrD = akzcVar.D();
        if (akzcVar2 == null) {
            akzcVar2 = a;
        }
        byte[] bArrA = ajenVar.a(bArrD, akzcVar2.D());
        defpackage.aooh.e(bArrA, "decrypt(...)");
        return bArrA;
    }
}
