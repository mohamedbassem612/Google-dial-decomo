package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajfy implements defpackage.ajmn {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ajmn
    public final java.lang.Object a(defpackage.aiql aiqlVar) throws java.security.GeneralSecurityException {
        ajkt ajilVar;
        switch (this.$cid) {
            case 0:
                return ajsd.c((defpackage.ajfx) aiqlVar);
            case 1:
                defpackage.ajlx ajlxVar = (defpackage.ajlx) aiqlVar;
                akxm akxmVarAq = ajlxVar.aq(ajfk.a);
                ajilVar = new ajil(aftt.A((defpackage.ajfe) akxmVarAq.c, ajlxVar.m()).c(), 1);
                break;
            case 2:
                return ajrs.c((defpackage.ajgd) aiqlVar);
            case 3:
                return ajrw.c((defpackage.ajgi) aiqlVar);
            case 4:
                return ajip.c((defpackage.ajgn) aiqlVar);
            case 5:
                defpackage.ajgr ajgrVar = (defpackage.ajgr) aiqlVar;
                defpackage.ajmo ajmoVar = defpackage.ajgs.a;
                return ajic.e() ? ajic.c(ajgrVar) : ajil.f(ajgrVar);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ajgy ajgyVar = (defpackage.ajgy) aiqlVar;
                defpackage.ajha ajhaVar = ajgyVar.a;
                defpackage.ajmo ajmoVar2 = defpackage.ajgv.a;
                java.lang.String str = ajhaVar.a;
                ajfa.a(str).a(str);
                return ajil.c(ajgyVar.b);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ajhc ajhcVar = (defpackage.ajhc) aiqlVar;
                defpackage.ajhf ajhfVar = ajhcVar.a;
                defpackage.ajep ajepVar = defpackage.ajgx.a;
                java.lang.String str2 = ajhfVar.b;
                ajfa.a(str2).a(str2);
                int i = ajgw.a;
                try {
                    new ajgw(defpackage.alad.B(ajpz.a, ajee.g(ajhfVar.c, ajft.a), defpackage.akzq.a));
                    return ajil.c(ajhcVar.b);
                } catch (defpackage.alaz e) {
                    throw new java.security.GeneralSecurityException(e);
                }
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ajil.d((defpackage.ajhn) aiqlVar);
            case 9:
                defpackage.ajhr ajhrVar = (defpackage.ajhr) aiqlVar;
                defpackage.ajmo ajmoVar3 = defpackage.ajhs.a;
                return ajic.e() ? ajil.e(ajhrVar) : ajil.g(ajhrVar);
            case 10:
                defpackage.ajis ajisVar = (defpackage.ajis) aiqlVar;
                defpackage.ajit.a(ajisVar.a);
                return ajry.a(ajisVar);
            case 11:
                defpackage.ajlx ajlxVar2 = (defpackage.ajlx) aiqlVar;
                akxm akxmVarAq2 = ajlxVar2.aq(ajfk.a);
                defpackage.ajfe ajfeVar = (defpackage.ajfe) akxmVarAq2.c;
                aftt.E(ajfeVar);
                aftt.A(ajfeVar, ajlxVar2.m()).c();
                return new ajjb();
            case 12:
                return ajrz.b((defpackage.ajjk) aiqlVar);
            case 13:
                return ajsa.a((defpackage.ajjl) aiqlVar);
            case 14:
                defpackage.ajlx ajlxVar3 = (defpackage.ajlx) aiqlVar;
                akxm akxmVarAq3 = ajlxVar3.aq(ajfk.a);
                ajilVar = new ajkt((defpackage.ajen) defpackage.ajlr.a.a((java.lang.String) akxmVarAq3.b, defpackage.ajen.class).c((defpackage.akzc) akxmVarAq3.d), aftt.A((defpackage.ajfe) akxmVarAq3.c, ajlxVar3.m()).c());
                break;
            case 15:
                defpackage.ajlx ajlxVar4 = (defpackage.ajlx) aiqlVar;
                akxm akxmVarAq4 = ajlxVar4.aq(ajfk.a);
                aftt.A((defpackage.ajfe) akxmVarAq4.c, ajlxVar4.m()).c();
                return new ajku();
            case 16:
                return ajko.b((defpackage.ajjs) aiqlVar);
            case 17:
                return ajku.a((defpackage.ajju) aiqlVar);
            case 18:
                defpackage.ajng ajngVar = (defpackage.ajng) aiqlVar;
                defpackage.ajnh.a(ajngVar.a);
                return ajnx.a(ajngVar);
            case 19:
                defpackage.ajng ajngVar2 = (defpackage.ajng) aiqlVar;
                defpackage.ajnh.a(ajngVar2.a);
                return new ajsn(ajngVar2);
            default:
                return new ajnx((byte[]) null);
        }
        return ajilVar;
    }
}
