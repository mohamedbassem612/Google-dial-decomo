package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mzx {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyConversationStateUiConverter");
    public final android.content.Context b;
    public final aoin c;
    public final aoss d;
    public final qbe e;
    public final defpackage.ogj f;
    private final aoin g;
    private final aoin h;
    private final defpackage.nbv i;
    private final defpackage.mqt j;
    private final defpackage.mba k;

    public mzx(android.content.Context context, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoss aossVar, defpackage.ogj ogjVar, defpackage.nbv nbvVar, defpackage.mqt mqtVar, qbe qbeVar, defpackage.mba mbaVar) {
        aooh.f(context, "appContext");
        aooh.f(aoinVar, "enableLlmSmartReplyConsentFlow");
        aooh.f(aoinVar2, "enableSpeechIndicatorAnimationFix");
        aooh.f(aoinVar3, "enableKeepSelectedReplyChipState");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(nbvVar, "dobbyInCallScreenButtonsController");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(qbeVar, "inCallLogging");
        this.b = context;
        this.c = aoinVar;
        this.g = aoinVar2;
        this.h = aoinVar3;
        this.d = aossVar;
        this.f = ogjVar;
        this.i = nbvVar;
        this.j = mqtVar;
        this.e = qbeVar;
        this.k = mbaVar;
    }

    public final java.lang.Boolean a(alww alwwVar) {
        if (((java.lang.Boolean) this.g.a()).booleanValue()) {
            int iAQ = a.aQ((alwwVar.c == 3 ? (alyp) alwwVar.d : alyp.a).f);
            if (iAQ != 0 && iAQ == 2) {
                return java.lang.Boolean.TRUE;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(alyi alyiVar, aoln aolnVar) {
        defpackage.mzw mzwVar;
        mce mceVar;
        int iAN;
        defpackage.ogj ogjVar;
        defpackage.nmk nmkVarD;
        if (aolnVar instanceof defpackage.mzw) {
            mzwVar = (defpackage.mzw) aolnVar;
            int i = mzwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mzwVar.c = i - Integer.MIN_VALUE;
            } else {
                mzwVar = new defpackage.mzw(this, aolnVar);
            }
        } else {
            mzwVar = new defpackage.mzw(this, aolnVar);
        }
        java.lang.Object obj = mzwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mzwVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!((java.lang.Boolean) this.h.a()).booleanValue() || (iAN = a.aN(alyiVar.e)) == 0 || iAN != 2) {
                int i3 = alyiVar.f;
                alyh alyhVarB = alyh.b(i3);
                if (alyhVarB == null) {
                    alyhVarB = alyh.a;
                }
                if (alyhVarB == alyh.e) {
                    defpackage.mqt mqtVar = this.j;
                    defpackage.nvp nvpVar = defpackage.nvp.EVENT_AI_REPLIES_SUGGESTION_CHIP_CLICKED;
                    mzwVar.c = 1;
                    if (mqtVar.x(nvpVar, mzwVar) == aoluVar) {
                        return aoluVar;
                    }
                    ogjVar = this.f;
                    defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
                    defpackage.npw npwVarAz = mni.az(defpackage.nls.a.m());
                    npwVarAz.A(true);
                    npwVarAB.H(npwVarAz.z());
                    nmkVarD = npwVarAB.D();
                    mzwVar.c = 2;
                    if (ogjVar.b(nmkVarD, mzwVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    alyh alyhVarB2 = alyh.b(i3);
                    if (alyhVarB2 == null) {
                        alyhVarB2 = alyh.a;
                    }
                    defpackage.mba mbaVar = this.k;
                    int iOrdinal = alyhVarB2.ordinal();
                    if (iOrdinal != 1) {
                        mceVar = iOrdinal != 2 ? mce.ca : mce.bZ;
                    } else {
                        mceVar = mce.bY;
                    }
                    mbaVar.b(mceVar);
                    defpackage.nbv nbvVar = this.i;
                    mzwVar.c = 3;
                    if (nbvVar.c(alyiVar, mzwVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        } else if (i2 == 1) {
            aooc.af(obj);
            ogjVar = this.f;
            defpackage.npw npwVarAB2 = mni.aB(defpackage.nmk.a.m());
            defpackage.npw npwVarAz2 = mni.az(defpackage.nls.a.m());
            npwVarAz2.A(true);
            npwVarAB2.H(npwVarAz2.z());
            nmkVarD = npwVarAB2.D();
            mzwVar.c = 2;
            if (ogjVar.b(nmkVarD, mzwVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
