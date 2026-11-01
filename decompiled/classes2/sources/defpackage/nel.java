package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nel implements defpackage.ouh {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyManualCallScreenChipClickedListener");
    public static final apdp b = new apdp();
    public final defpackage.ogj c;
    private final defpackage.nej d;
    private final defpackage.neu e;
    private final aoss f;
    private final defpackage.mqt g;
    private final defpackage.mba h;
    private final rlv i;
    private final aoin j;

    public nel(defpackage.nej nejVar, defpackage.neu neuVar, aoss aossVar, defpackage.mqt mqtVar, defpackage.mba mbaVar, defpackage.ogj ogjVar, rlv rlvVar, aoin aoinVar) {
        aooh.f(nejVar, "dobbyLifecycleController");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        this.d = nejVar;
        this.e = neuVar;
        this.f = aossVar;
        this.g = mqtVar;
        this.h = mbaVar;
        this.c = ogjVar;
        this.i = rlvVar;
        this.j = aoinVar;
    }

    @Override // defpackage.ouh
    public final void a() {
        this.h.b(mce.bN);
        this.i.o(rmx.kI);
        defpackage.hnj hnjVar = new defpackage.hnj(this, (aoln) null, 10);
        boolean zBooleanValue = ((java.lang.Boolean) this.j.a()).booleanValue();
        aoss aossVar = this.f;
        if (zBooleanValue) {
            aoov.an(aossVar, (aolr) null, 0, new defpackage.itj(hnjVar, (aoln) null, 13, (float[]) null), 3);
            return;
        }
        aimz aimzVar = zih.a;
        aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, hnjVar, 12, (boolean[]) null));
    }

    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.nek nekVar;
        defpackage.nej nejVar;
        if (aolnVar instanceof defpackage.nek) {
            nekVar = (defpackage.nek) aolnVar;
            int i = nekVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nekVar.c = i - Integer.MIN_VALUE;
            } else {
                nekVar = new defpackage.nek(this, aolnVar);
            }
        } else {
            nekVar = new defpackage.nek(this, aolnVar);
        }
        java.lang.Object objC = nekVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nekVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objC);
            } else if (i2 == 2 || i2 == 3) {
                aooc.af(objC);
                nejVar = this.d;
                nekVar.c = 4;
                if (nejVar.E(true, nekVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            return aojh.a;
        }
        aooc.af(objC);
        defpackage.neu neuVar = this.e;
        nekVar.c = 1;
        objC = neuVar.c(nekVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        int iOrdinal = ((defpackage.nev) objC).ordinal();
        aimz aimzVar = a;
        if (iOrdinal != 2) {
            aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyManualCallScreenChipClickedListener", "logAndStartManualScreening", 71, "DobbyManualCallScreenChipClickedListener.kt").v("Dobby default call screen chip clicked from answer screen");
            defpackage.mqt mqtVar = this.g;
            defpackage.nvp nvpVar = defpackage.nvp.EVENT_USER_ANSWER_SCREEN_ACTION_SCREEN_CALL;
            nekVar.c = 3;
            if (mqtVar.x(nvpVar, nekVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyManualCallScreenChipClickedListener", "logAndStartManualScreening", 67, "DobbyManualCallScreenChipClickedListener.kt").v("Dobby ask if urgent chip clicked from answer screen");
            defpackage.mqt mqtVar2 = this.g;
            defpackage.nvp nvpVar2 = defpackage.nvp.EVENT_USER_ANSWER_SCREEN_ACTION_ASK_IF_URGENT;
            nekVar.c = 2;
            if (mqtVar2.x(nvpVar2, nekVar) == aoluVar) {
                return aoluVar;
            }
        }
        nejVar = this.d;
        nekVar.c = 4;
        if (nejVar.E(true, nekVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }
}
