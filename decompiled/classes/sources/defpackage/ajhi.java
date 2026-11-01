package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajhi implements defpackage.ajlt {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ajhi(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ajlt
    public final akxm a(defpackage.aiql aiqlVar, ajfk ajfkVar) {
        switch (this.$cid) {
            case 0:
                defpackage.ajhc ajhcVar = (defpackage.ajhc) aiqlVar;
                defpackage.akzx akzxVarM = defpackage.ajqg.a.m();
                defpackage.ajhf ajhfVar = ajhcVar.a;
                ajqh ajqhVarC = defpackage.ajhk.c(ajhfVar);
                akzxVarM.u();
                defpackage.ajqg ajqgVar = (defpackage.ajqg) akzxVarM.b;
                j$.util.Objects.requireNonNull(ajqhVarC);
                ajqgVar.d = ajqhVarC;
                ajqgVar.b |= 1;
                return akxm.d("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((defpackage.ajqg) akzxVarM.r()).f(), ajfd.e, defpackage.ajhk.a(ajhfVar.a), ajhcVar.c);
            case 1:
                defpackage.ajgy ajgyVar = (defpackage.ajgy) aiqlVar;
                defpackage.akzx akzxVarM2 = defpackage.ajqe.a.m();
                defpackage.akzx akzxVarM3 = ajqf.a.m();
                defpackage.ajha ajhaVar = ajgyVar.a;
                akzxVarM3.u();
                ajqf ajqfVar = akzxVarM3.b;
                java.lang.String str = ajhaVar.a;
                j$.util.Objects.requireNonNull(str);
                ajqfVar.b = str;
                ajqf ajqfVarR = akzxVarM3.r();
                akzxVarM2.u();
                defpackage.ajqe ajqeVar = (defpackage.ajqe) akzxVarM2.b;
                j$.util.Objects.requireNonNull(ajqfVarR);
                ajqeVar.d = ajqfVarR;
                ajqeVar.b |= 1;
                return akxm.d("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((defpackage.ajqe) akzxVarM2.r()).f(), ajfd.e, defpackage.ajhb.a(ajhaVar.b), ajgyVar.c);
            case 2:
                return defpackage.ajhv.b((defpackage.ajfx) aiqlVar);
            case 3:
                return defpackage.ajhw.b((defpackage.ajgd) aiqlVar);
            case 4:
                return defpackage.ajhz.b((defpackage.ajgi) aiqlVar);
            case 5:
                return defpackage.ajib.b((defpackage.ajgn) aiqlVar);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.ajid.b((defpackage.ajgr) aiqlVar);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.ajim.b((defpackage.ajhn) aiqlVar);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.ajin.b((defpackage.ajhr) aiqlVar);
            case 9:
                defpackage.ajis ajisVar = (defpackage.ajis) aiqlVar;
                defpackage.ajmk ajmkVar = defpackage.ajja.a;
                defpackage.akzx akzxVarM4 = defpackage.ajpa.a.m();
                defpackage.akzc akzcVarU = defpackage.akzc.u(ajisVar.d.k());
                akzxVarM4.u();
                defpackage.ajpa ajpaVar = (defpackage.ajpa) akzxVarM4.b;
                j$.util.Objects.requireNonNull(akzcVarU);
                ajpaVar.c = akzcVarU;
                return akxm.d("type.googleapis.com/google.crypto.tink.AesSivKey", ((defpackage.ajpa) akzxVarM4.r()).f(), ajfd.b, defpackage.ajja.a(ajisVar.a.b), ajisVar.c);
            case 10:
                return ajle.b((defpackage.ajju) aiqlVar);
            case 11:
                return ajle.d((defpackage.ajjs) aiqlVar);
            case 12:
                return defpackage.ajkl.b((defpackage.ajjl) aiqlVar);
            case 13:
                return defpackage.ajkl.d((defpackage.ajjk) aiqlVar);
            case 14:
                return ((defpackage.ajlx) aiqlVar).aq(ajfkVar);
            case 15:
                defpackage.ajng ajngVar = (defpackage.ajng) aiqlVar;
                defpackage.akzx akzxVarM5 = defpackage.ajof.a.m();
                defpackage.ajnk ajnkVar = ajngVar.a;
                ajoh ajohVarC = defpackage.ajnw.c(ajnkVar);
                akzxVarM5.u();
                defpackage.ajof ajofVar = (defpackage.ajof) akzxVarM5.b;
                j$.util.Objects.requireNonNull(ajohVarC);
                ajofVar.e = ajohVarC;
                ajofVar.b |= 1;
                defpackage.akzc akzcVarU2 = defpackage.akzc.u(ajngVar.d.k());
                akzxVarM5.u();
                defpackage.ajof ajofVar2 = (defpackage.ajof) akzxVarM5.b;
                j$.util.Objects.requireNonNull(akzcVarU2);
                ajofVar2.d = akzcVarU2;
                return akxm.d("type.googleapis.com/google.crypto.tink.AesCmacKey", ((defpackage.ajof) akzxVarM5.r()).f(), ajfd.b, defpackage.ajnw.a(ajnkVar.c), ajngVar.c);
            default:
                defpackage.ajnn ajnnVar = (defpackage.ajnn) aiqlVar;
                defpackage.ajmk ajmkVar2 = defpackage.ajny.a;
                defpackage.akzx akzxVarM6 = defpackage.ajpo.a.m();
                defpackage.ajnr ajnrVar = ajnnVar.a;
                ajpq ajpqVarC = defpackage.ajny.c(ajnrVar);
                akzxVarM6.u();
                defpackage.ajpo ajpoVar = (defpackage.ajpo) akzxVarM6.b;
                j$.util.Objects.requireNonNull(ajpqVarC);
                ajpoVar.d = ajpqVarC;
                ajpoVar.b |= 1;
                defpackage.akzc akzcVarU3 = defpackage.akzc.u(ajnnVar.d.k());
                akzxVarM6.u();
                defpackage.ajpo ajpoVar2 = (defpackage.ajpo) akzxVarM6.b;
                j$.util.Objects.requireNonNull(akzcVarU3);
                ajpoVar2.e = akzcVarU3;
                return akxm.d("type.googleapis.com/google.crypto.tink.HmacKey", ((defpackage.ajpo) akzxVarM6.r()).f(), ajfd.b, defpackage.ajny.a(ajnrVar.c), ajnnVar.c);
        }
    }
}
