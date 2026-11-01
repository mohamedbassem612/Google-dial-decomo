package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ppt implements aono {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ abms b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ dot f;
    public final /* synthetic */ int g;
    public final /* synthetic */ abja h;
    public final /* synthetic */ java.lang.String i;
    public final /* synthetic */ long j;

    public /* synthetic */ ppt(java.lang.String str, abms abmsVar, float f, float f2, long j, dot dotVar, int i, abja abjaVar, java.lang.String str2, long j2) {
        this.a = str;
        this.b = abmsVar;
        this.c = f;
        this.d = f2;
        this.e = j;
        this.f = dotVar;
        this.g = i;
        this.h = abjaVar;
        this.i = str2;
        this.j = j2;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        awv awvVar = (awv) obj;
        cav cavVar = (cav) obj2;
        int iIntValue = ((java.lang.Integer) obj3).intValue();
        aooh.f(awvVar, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != cavVar.B(awvVar) ? 2 : 4;
        }
        if (cavVar.H((iIntValue & 19) != 18, iIntValue & 1)) {
            float f = this.d;
            float f2 = this.c;
            abms abmsVar = this.b;
            java.lang.String str = this.a;
            hwv hwvVarI = xa.i(cavVar);
            int iDp = ((dpf) cavVar.e(dfo.e)).dp(f + f2 + 0.0f);
            long j = awvVar.c;
            abmr abmrVarT = abts.T(hwvVarI, str, abmsVar, dpd.k(j, 0, aooc.t(dpd.b(j) - iDp, 0), 0, 0, 12));
            abmr abmrVarT2 = abts.T(hwvVarI, str, abmsVar, dpd.k(j, 0, aooc.t(dpd.b(j) - (iDp << 1), 0), 0, 0, 12));
            if (abmrVarT.b != 1) {
                abmrVarT = abmrVarT2;
            }
            cmt cmtVar = cmw.c;
            cmw cmwVarD = azm.d(cmtVar, 1.0f);
            cye cyeVarA = azh.a(awi.g(f2, cmh.k), cmh.n, cavVar, 48);
            int iM = anty.M(cavVar.a());
            cje cjeVarM = cavVar.M();
            cmw cmwVarM = cfo.m(cavVar, cmwVarD);
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
            int i = abmrVarT.b;
            azk azkVar = azk.a;
            if (i > 1) {
                cavVar.u(-1595118441);
                den.aR(azm.g(cmtVar, f), cavVar);
                cavVar.o();
            } else {
                cavVar.u(-1595060781);
                cavVar.o();
            }
            long j2 = this.j;
            java.lang.String str2 = this.i;
            abja abjaVar = this.h;
            int i2 = this.g;
            abrz.k(str, azkVar.a(cmtVar, 1.0f, false), this.e, 0L, (dnd) null, (dmq) null, 0L, this.f, 0L, i2, false, i, 0, (aonj) null, abmrVarT.a, cavVar, 0, 0, 109560);
            aaoo.W(aehj.aL(abjaVar, cavVar), str2, azm.g(cmtVar, f), j2, cavVar, 0, 0);
            cavVar.n();
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
