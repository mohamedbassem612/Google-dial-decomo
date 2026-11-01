package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sxb implements jqh {
    private final long a;
    private final tbm b;
    private final gou c;

    public sxb(long j, tbm tbmVar, gou gouVar) {
        aooh.f(tbmVar, "revelioState");
        this.a = j;
        this.b = tbmVar;
        this.c = gouVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x010a  */
    /* JADX WARN: Code duplicated, block: B:36:0x010c  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:41:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aixo aixoVar, aoln aolnVar) {
        defpackage.sxa sxaVar;
        defpackage.uzx uzxVarY;
        defpackage.uzx uzxVar;
        if (aolnVar instanceof defpackage.sxa) {
            sxaVar = (defpackage.sxa) aolnVar;
            int i = sxaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sxaVar.d = i - Integer.MIN_VALUE;
            } else {
                sxaVar = new defpackage.sxa(this, aolnVar);
            }
        } else {
            sxaVar = new defpackage.sxa(this, aolnVar);
        }
        java.lang.Object objD = sxaVar.b;
        aolu aoluVar = aolu.a;
        int i2 = sxaVar.d;
        int i3 = 8;
        if (i2 != 0) {
            if (i2 == 1) {
                aixoVar = (aixo) sxaVar.a;
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uzxVar = sxaVar.e;
                uzxVarY = (defpackage.uzx) sxaVar.a;
                aooc.af(objD);
            }
            aooh.e(objD, "await(...)");
            switch (((defpackage.amrc) objD).ordinal()) {
                case 1:
                    i3 = 2;
                    break;
                case 2:
                    i3 = 3;
                    break;
                case 3:
                    i3 = 7;
                    break;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    i3 = 4;
                    break;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    i3 = 5;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    i3 = 6;
                    break;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    break;
                default:
                    i3 = 1;
                    break;
            }
            akzx akzxVar = (akzx) uzxVar.a;
            akzxVar.u();
            aixo aixoVar2 = akzxVar.b;
            aixo aixoVar3 = aixo.a;
            aixoVar2.i = i3 - 1;
            aixoVar2.b |= 64;
            return uzxVarY.ah();
        }
        aooc.af(objD);
        ajcq ajcqVarE = this.c.e();
        sxaVar.a = aixoVar;
        sxaVar.d = 1;
        objD = aosv.D(ajcqVarE, sxaVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        tbf tbfVar = (tbf) objD;
        uzxVarY = airh.y(aixoVar.p());
        akzx akzxVarM = defpackage.amre.a.m();
        aooh.f(akzxVarM, "builder");
        defpackage.tbe tbeVarB = defpackage.tbe.b(tbfVar.e);
        if (tbeVarB == null) {
            tbeVarB = defpackage.tbe.NOT_SET_BY_USER;
        }
        akzxVarM.u();
        defpackage.amre amreVar = (defpackage.amre) akzxVarM.b;
        amreVar.d = tbeVarB.e;
        amreVar.b |= 2;
        defpackage.tbe tbeVarB2 = defpackage.tbe.b(tbfVar.f);
        if (tbeVarB2 == null) {
            tbeVarB2 = defpackage.tbe.NOT_SET_BY_USER;
        }
        akzxVarM.u();
        defpackage.amre amreVar2 = (defpackage.amre) akzxVarM.b;
        amreVar2.e = tbeVarB2.e;
        amreVar2.b |= 4;
        defpackage.tbe tbeVarB3 = defpackage.tbe.b(tbfVar.g);
        if (tbeVarB3 == null) {
            tbeVarB3 = defpackage.tbe.NOT_SET_BY_USER;
        }
        akzxVarM.u();
        defpackage.amre amreVar3 = (defpackage.amre) akzxVarM.b;
        amreVar3.f = tbeVarB3.e;
        amreVar3.b |= 8;
        defpackage.tbe tbeVarB4 = defpackage.tbe.b(tbfVar.h);
        if (tbeVarB4 == null) {
            tbeVarB4 = defpackage.tbe.NOT_SET_BY_USER;
        }
        akzxVarM.u();
        defpackage.amre amreVar4 = (defpackage.amre) akzxVarM.b;
        amreVar4.g = tbeVarB4.e;
        amreVar4.b |= 16;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        uzxVarY.at(pez.bg((defpackage.amre) aladVarP));
        ajcq ajcqVarB = this.b.b(this.a);
        sxaVar.a = uzxVarY;
        sxaVar.e = uzxVarY;
        sxaVar.d = 2;
        objD = aosv.D(ajcqVarB, sxaVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        uzxVar = uzxVarY;
        aooh.e(objD, "await(...)");
        switch (((defpackage.amrc) objD).ordinal()) {
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 7;
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                i3 = 4;
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                i3 = 5;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                i3 = 6;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            default:
                i3 = 1;
                break;
        }
        akzx akzxVar2 = (akzx) uzxVar.a;
        akzxVar2.u();
        aixo aixoVar4 = akzxVar2.b;
        aixo aixoVar5 = aixo.a;
        aixoVar4.i = i3 - 1;
        aixoVar4.b |= 64;
        return uzxVarY.ah();
    }
}
