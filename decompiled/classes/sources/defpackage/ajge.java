package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajge implements defpackage.ajlq {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ajge(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ajlq
    public final defpackage.aiql a(defpackage.ajsz ajszVar, java.lang.Integer num) throws java.security.GeneralSecurityException {
        switch (this.$cid) {
            case 0:
                defpackage.ajgh ajghVar = (defpackage.ajgh) ajszVar;
                int i = ajghVar.a;
                defpackage.ajmo ajmoVar = defpackage.ajgf.a;
                if (i != 24) {
                    return aftt.V(ajghVar, ajyi.A(i), num);
                }
                throw new java.security.GeneralSecurityException("192 bit AES EAX Parameters are not valid");
            case 1:
                defpackage.ajgc ajgcVar = (defpackage.ajgc) ajszVar;
                int i2 = ajgcVar.a;
                defpackage.ajmo ajmoVar2 = defpackage.ajfz.a;
                if (i2 == 16 || i2 == 32) {
                    return aftt.W(ajgcVar, ajyi.A(i2), ajyi.A(ajgcVar.b), num);
                }
                throw new java.security.GeneralSecurityException("AES key size must be 16 or 32 bytes");
            case 2:
                defpackage.ajgm ajgmVar = (defpackage.ajgm) ajszVar;
                int i3 = ajgmVar.a;
                defpackage.ajmo ajmoVar3 = defpackage.ajgk.a;
                if (i3 != 24) {
                    return aftt.U(ajgmVar, ajyi.A(i3), num);
                }
                throw new java.security.GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            case 3:
                defpackage.ajgq ajgqVar = (defpackage.ajgq) ajszVar;
                int i4 = ajgqVar.a;
                defpackage.ajmo ajmoVar4 = defpackage.ajgo.a;
                return aftt.T(ajgqVar, ajyi.A(i4), num);
            case 4:
                defpackage.ajgt ajgtVar = ((defpackage.ajgu) ajszVar).a;
                defpackage.ajmo ajmoVar5 = defpackage.ajgs.a;
                return defpackage.ajgr.aq(ajgtVar, ajyi.A(32), num);
            case 5:
                defpackage.ajmo ajmoVar6 = defpackage.ajgv.a;
                return defpackage.ajgy.aq((defpackage.ajha) ajszVar, num);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ajep ajepVar = defpackage.ajgx.a;
                return defpackage.ajhc.aq((defpackage.ajhf) ajszVar, num);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.ajhn.aq((defpackage.ajhq) ajszVar, ajyi.A(32), num);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ajht ajhtVar = ((defpackage.ajhu) ajszVar).a;
                defpackage.ajmo ajmoVar7 = defpackage.ajhs.a;
                return defpackage.ajhr.aq(ajhtVar, ajyi.A(32), num);
            case 9:
                defpackage.ajiw ajiwVar = (defpackage.ajiw) ajszVar;
                defpackage.ajit.a(ajiwVar);
                return aftt.S(ajiwVar, ajyi.A(ajiwVar.a), num);
            case 10:
                return aftt.N((defpackage.ajjj) ajszVar, num);
            case 11:
                return aftt.M((defpackage.ajjr) ajszVar, num);
            case 12:
                defpackage.aogc aogcVar = ((defpackage.ajly) ajszVar).a;
                defpackage.ajma ajmaVar = defpackage.ajma.a;
                defpackage.ajlr ajlrVar = defpackage.ajlr.a;
                java.lang.Object obj = aogcVar.b;
                defpackage.ajep ajepVarB = ajlrVar.b((java.lang.String) obj);
                if (!((java.lang.Boolean) ajlrVar.b.get(obj)).booleanValue()) {
                    throw new java.security.GeneralSecurityException("Creating new keys is not allowed.");
                }
                ajpy ajpyVarA = ajepVarB.a((defpackage.akzc) aogcVar.c);
                java.lang.String str = ajpyVarA.b;
                defpackage.akzc akzcVar = ajpyVarA.c;
                int iAb = defpackage.a.ab(ajpyVarA.d);
                if (iAb == 0) {
                    iAb = 1;
                }
                return new defpackage.ajlx(akxm.d(str, akzcVar, aftt.B(iAb), (defpackage.ajfe) aogcVar.a, num), ajfk.a);
            case 13:
                defpackage.ajnk ajnkVar = (defpackage.ajnk) ajszVar;
                defpackage.ajnh.a(ajnkVar);
                return aftt.Q(ajnkVar, ajyi.A(ajnkVar.a), num);
            default:
                defpackage.ajnr ajnrVar = (defpackage.ajnr) ajszVar;
                int i5 = ajnrVar.a;
                defpackage.ajmo ajmoVar8 = defpackage.ajno.a;
                return agmc.aB(ajnrVar, ajyi.A(i5), num);
        }
    }
}
