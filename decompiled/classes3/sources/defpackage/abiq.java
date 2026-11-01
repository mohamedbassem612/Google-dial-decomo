package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abiq implements aono {
    private final /* synthetic */ int $cid;

    public /* synthetic */ abiq(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        switch (this.$cid) {
            case 0:
                return aehj.bL((oq) obj, (cav) obj2, ((java.lang.Integer) obj3).intValue());
            case 1:
                return defpackage.abhh.a(obj, obj2, obj3);
            case 2:
                return aehj.bL((oq) obj, (cav) obj2, ((java.lang.Integer) obj3).intValue());
            case 3:
                cyi cyiVar = (cyi) obj;
                cyd cydVar = (cyd) obj2;
                dpd dpdVar = (dpd) obj3;
                aooh.f(cyiVar, "$this$layout");
                aooh.f(cydVar, "measurable");
                long j = dpdVar.a;
                czc czcVarV = cydVar.v(dpd.k(j, java.lang.Math.min(dpd.d(j), cyiVar.dp(412.0f)), java.lang.Math.min(dpd.b(j), cyiVar.dp(412.0f)), 0, 0, 12));
                return den.z(cyiVar, dpd.b(j), czcVarV.b, new defpackage.abdu(dpdVar, czcVarV, 4));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                cyi cyiVar2 = (cyi) obj;
                cyd cydVar2 = (cyd) obj2;
                aooh.f(cyiVar2, "$this$layout");
                aooh.f(cydVar2, "measurable");
                return den.z(cyiVar2, 0, cydVar2.v(((dpd) obj3).a).b, new defpackage.yrz(20));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return defpackage.acpt.a((azj) obj, (cav) obj2, ((java.lang.Integer) obj3).intValue());
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return defpackage.acpt.a((azj) obj, (cav) obj2, ((java.lang.Integer) obj3).intValue());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return defpackage.acpt.a((azj) obj, (cav) obj2, ((java.lang.Integer) obj3).intValue());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                cav cavVar = (cav) obj2;
                int iIntValue = ((java.lang.Integer) obj3).intValue();
                aooh.f((azj) obj, "$this$OutlinedButton");
                if (cavVar.H((iIntValue & 17) != 16, iIntValue & 1)) {
                    cmi cmiVar = cmh.k;
                    cmt cmtVar = cmw.c;
                    cye cyeVarA = aww.a(awi.c, cmiVar, cavVar, 48);
                    int iM = anty.M(cavVar.a());
                    cje cjeVarM = cavVar.M();
                    cmw cmwVarM = cfo.m(cavVar, cmtVar);
                    aomy aomyVar = dam.a;
                    cavVar.L();
                    cavVar.v();
                    if (cavVar.F()) {
                        cavVar.j(aomyVar);
                    } else {
                        cavVar.x();
                    }
                    cev.c(cavVar, cyeVarA, dam.e);
                    cev.c(cavVar, cjeVarM, dam.d);
                    cev.c(cavVar, java.lang.Integer.valueOf(iM), dam.f);
                    cev.b(cavVar, dam.g);
                    cev.c(cavVar, cmwVarM, dam.c);
                    aaoo.V(wv.k(2131231555, cavVar, 0), dfa.f(2132019641, cavVar), (cmw) null, 0L, cavVar, 8, 12);
                    abrz.k(dfa.f(2132019641, cavVar), (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, den.an(cavVar).h, cavVar, 0, 0, 131070);
                    cavVar.n();
                } else {
                    cavVar.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                cav cavVar2 = (cav) obj2;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                aooh.f((bbx) obj, "$this$item");
                if (cavVar2.H((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    den.aR(azm.e(cmw.c, 16.0f), cavVar2);
                } else {
                    cavVar2.s();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                cav cavVar3 = (cav) obj2;
                int iIntValue3 = ((java.lang.Integer) obj3).intValue();
                aooh.f((azj) obj, "$this$FilledTonalButton");
                if (cavVar3.H((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    abrz.k(dfa.f(2132019671, cavVar3), (cmw) null, 0L, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 0, false, 0, 0, (aonj) null, (dkz) null, cavVar3, 0, 0, 262142);
                } else {
                    cavVar3.s();
                }
                return aojh.a;
            default:
                cav cavVar4 = (cav) obj2;
                int iIntValue4 = ((java.lang.Integer) obj3).intValue();
                aooh.f((awy) obj, "<this>");
                int i = iIntValue4 & 17;
                if (!cavVar4.H(i != 16, iIntValue4 & 1)) {
                    cavVar4.s();
                }
                return aojh.a;
        }
    }
}
