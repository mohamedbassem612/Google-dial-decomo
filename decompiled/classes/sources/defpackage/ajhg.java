package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajhg implements defpackage.ajmj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ajhg(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ajmj
    public final defpackage.aogc a(defpackage.ajsz ajszVar) {
        switch (this.$cid) {
            case 0:
                defpackage.ajhf ajhfVar = (defpackage.ajhf) ajszVar;
                return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", defpackage.ajhk.a(ajhfVar.a), defpackage.ajhk.c(ajhfVar).f());
            case 1:
                defpackage.ajha ajhaVar = (defpackage.ajha) ajszVar;
                defpackage.ajfe ajfeVarA = defpackage.ajhb.a(ajhaVar.b);
                defpackage.akzx akzxVarM = ajqf.a.m();
                java.lang.String str = ajhaVar.a;
                akzxVarM.u();
                ajqf ajqfVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                ajqfVar.b = str;
                return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.KmsAeadKey", ajfeVarA, akzxVarM.r().f());
            case 2:
                return defpackage.ajhv.c((defpackage.ajgc) ajszVar);
            case 3:
                return defpackage.ajhw.c((defpackage.ajgh) ajszVar);
            case 4:
                return defpackage.ajhz.c((defpackage.ajgm) ajszVar);
            case 5:
                return defpackage.ajib.c((defpackage.ajgq) ajszVar);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.ajid.c((defpackage.ajgu) ajszVar);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.ajim.c((defpackage.ajhq) ajszVar);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.ajin.c((defpackage.ajhu) ajszVar);
            case 9:
                return defpackage.ajja.c((defpackage.ajiw) ajszVar);
            case 10:
                return ajle.e((defpackage.ajjr) ajszVar);
            case 11:
                return defpackage.ajkl.e((defpackage.ajjj) ajszVar);
            case 12:
                return ((defpackage.ajly) ajszVar).a;
            case 13:
                defpackage.ajnk ajnkVar = (defpackage.ajnk) ajszVar;
                defpackage.ajfe ajfeVarA2 = defpackage.ajnw.a(ajnkVar.c);
                defpackage.akzx akzxVarM2 = ajog.a.m();
                ajoh ajohVarC = defpackage.ajnw.c(ajnkVar);
                akzxVarM2.u();
                ajog ajogVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(ajohVarC);
                ajogVar.d = ajohVarC;
                ajogVar.b |= 1;
                int i = ajnkVar.a;
                akzxVarM2.u();
                akzxVarM2.b.c = i;
                return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.AesCmacKey", ajfeVarA2, akzxVarM2.r().f());
            default:
                defpackage.ajnr ajnrVar = (defpackage.ajnr) ajszVar;
                defpackage.ajfe ajfeVarA3 = defpackage.ajny.a(ajnrVar.c);
                defpackage.akzx akzxVarM3 = ajpp.a.m();
                ajpq ajpqVarC = defpackage.ajny.c(ajnrVar);
                akzxVarM3.u();
                ajpp ajppVar = akzxVarM3.b;
                j$.util.Objects.requireNonNull(ajpqVarC);
                ajppVar.c = ajpqVarC;
                ajppVar.b |= 1;
                int i2 = ajnrVar.a;
                akzxVarM3.u();
                akzxVarM3.b.d = i2;
                return defpackage.aogc.C("type.googleapis.com/google.crypto.tink.HmacKey", ajfeVarA3, akzxVarM3.r().f());
        }
    }
}
