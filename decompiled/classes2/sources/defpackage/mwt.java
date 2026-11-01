package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mwt {
    public static final defpackage.mwt a = new defpackage.mwt();

    public static final boolean b(defpackage.nmo nmoVar, tkl tklVar) {
        j$.util.Optional optionalE = tklVar.e();
        aooh.e(optionalE, "getIsInCallUiShowing(...)");
        if (((java.lang.Boolean) aooh.p(optionalE, java.lang.Boolean.FALSE)).booleanValue()) {
            return nmoVar == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION || nmoVar == defpackage.nmo.RINGING_DURING_NOT_ACTIVE_SESSION;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.neu neuVar, aoln aolnVar) {
        defpackage.mwn mwnVar;
        if (aolnVar instanceof defpackage.mwn) {
            mwnVar = (defpackage.mwn) aolnVar;
            int i = mwnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mwnVar.c = i - Integer.MIN_VALUE;
            } else {
                mwnVar = new defpackage.mwn(this, aolnVar);
            }
        } else {
            mwnVar = new defpackage.mwn(this, aolnVar);
        }
        java.lang.Object objC = mwnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mwnVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            mwnVar.c = 1;
            objC = neuVar.c(mwnVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        return objC == defpackage.nev.TYPE_ASK_IF_URGENT ? defpackage.nvp.EVENT_USER_NOTIFICATION_ASK_IF_URGENT_BUTTON_PRODUCED : defpackage.nvp.EVENT_USER_NOTIFICATION_SCREEN_CALL_BUTTON_PRODUCED;
    }
}
