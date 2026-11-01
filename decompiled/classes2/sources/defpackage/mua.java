package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mua implements utx {
    public final nri a;
    public final aoin b;
    public final aimz c;
    public final zjm d;
    private final defpackage.mtx e;
    private final defpackage.mtw f;
    private final defpackage.mtv g;
    private final defpackage.mub h;
    private final defpackage.mtu i;
    private final aoss j;
    private final aoss k;

    public mua(nri nriVar, defpackage.mtx mtxVar, defpackage.mtw mtwVar, defpackage.mtv mtvVar, defpackage.mub mubVar, defpackage.mtu mtuVar, zjm zjmVar, aoin aoinVar, aoss aossVar, aoss aossVar2) {
        aooh.f(nriVar, "dobbyDatabase");
        aooh.f(mtuVar, "beeslyCallActionsViewBinder");
        aooh.f(aoinVar, "enableBeeslySmartActions");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "backgroundScope");
        this.a = nriVar;
        this.e = mtxVar;
        this.f = mtwVar;
        this.g = mtvVar;
        this.h = mubVar;
        this.i = mtuVar;
        this.d = zjmVar;
        this.b = aoinVar;
        this.j = aossVar;
        this.k = aossVar2;
        this.c = aimz.i("com/android/dialer/dobby/impl/feedback/DobbyFeedbackIntegration");
    }

    public final ajcq a(long j) {
        return aosv.F(this.j, 0, new defpackage.atg(this, j, (aoln) null, 11), 3);
    }

    public final ajcq b(long j) {
        return aosv.F(this.j, 0, new defpackage.atg(this, j, (aoln) null, 12, (byte[]) null), 3);
    }

    public final ajcq c(utu utuVar) {
        return aosv.F(this.j, 0, new defpackage.msi(this, utuVar, (aoln) null, 8), 3);
    }

    public final ajcq d(long j, java.lang.String str) {
        aooh.f(str, "featureKeyPrefix");
        aooh.f(str, "prefix");
        defpackage.mtx mtxVar = this.e;
        return aosv.F(mtxVar.c, 0, new defpackage.klr(mtxVar, j, str, (aoln) null, 5), 3);
    }

    public final ajcq e(long j) {
        return aosv.F(this.j, 0, new defpackage.atg(this, j, (aoln) null, 13, (char[]) null), 3);
    }

    public final ajcq f(utu utuVar) {
        aooh.f(utuVar, "feedbackUiInfo");
        return aosv.F(this.k, 0, new defpackage.mty(this, utuVar, null), 3);
    }

    public final ajcq g(long j) {
        return aosv.F(this.j, 0, new defpackage.atg(this, j, (aoln) null, 14, (short[]) null), 3);
    }

    public final /* synthetic */ ajcq h(long j) {
        return wsc.bm();
    }

    public final /* synthetic */ j$.util.Optional i(long j) {
        return j$.util.Optional.empty();
    }

    public final j$.util.Optional j(uuh uuhVar) {
        aooh.f(uuhVar, "transcriptDataCase");
        int iOrdinal = uuhVar.ordinal();
        if (iOrdinal == 19) {
            j$.util.Optional optionalOf = ((java.lang.Boolean) this.b.a()).booleanValue() ? j$.util.Optional.of(this.i) : j$.util.Optional.empty();
            aooh.c(optionalOf);
            return optionalOf;
        }
        switch (iOrdinal) {
            case 10:
                j$.util.Optional optionalOf2 = j$.util.Optional.of(this.f);
                aooh.e(optionalOf2, "of(...)");
                return optionalOf2;
            case 11:
                j$.util.Optional optionalOf3 = j$.util.Optional.of(this.g);
                aooh.e(optionalOf3, "of(...)");
                return optionalOf3;
            case 12:
                j$.util.Optional optionalOf4 = j$.util.Optional.of(this.h);
                aooh.e(optionalOf4, "of(...)");
                return optionalOf4;
            default:
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                aooh.e(optionalEmpty, "empty(...)");
                return optionalEmpty;
        }
    }

    public final /* synthetic */ ajcq k() {
        return wsc.bk();
    }

    public final ajcq l(long j, int i) {
        return aosv.F(this.j, 0, new defpackage.nlc(this, j, i, (aoln) null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(long j, aoln aolnVar) {
        defpackage.mtz mtzVar;
        boolean z;
        int iAR;
        if (aolnVar instanceof defpackage.mtz) {
            mtzVar = (defpackage.mtz) aolnVar;
            int i = mtzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mtzVar.c = i - Integer.MIN_VALUE;
            } else {
                mtzVar = new defpackage.mtz(this, aolnVar);
            }
        } else {
            mtzVar = new defpackage.mtz(this, aolnVar);
        }
        java.lang.Object objH = mtzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mtzVar.c;
        if (i2 == 0) {
            aooc.af(objH);
            nri nriVar = this.a;
            mtzVar.c = 1;
            objH = nriVar.h(j, mtzVar);
            if (objH == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objH);
        }
        defpackage.nsp nspVar = (defpackage.nsp) objH;
        if (nspVar != null) {
            defpackage.nsq nsqVar = nspVar.e;
            if (nsqVar == null) {
                nsqVar = defpackage.nsq.a;
            }
            if (nsqVar != null) {
                defpackage.nsm nsmVar = nsqVar.f;
                if (nsmVar == null) {
                    nsmVar = defpackage.nsm.a;
                }
                z = (nsmVar == null || (iAR = a.aR(nsmVar.n)) == 0 || iAR != 4) ? false : true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
