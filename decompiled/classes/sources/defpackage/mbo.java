package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mbo implements defpackage.zbp {
    private static final java.util.Map a = defpackage.ajsz.aO(new defpackage.aoiu(defpackage.zbw.a, new defpackage.mbn(defpackage.rmx.CUI_INFRA_UNCAUGHT_EXCEPTION, defpackage.qbc.CUI_INFRA_UNCAUGHT_EXCEPTION)), new defpackage.aoiu(defpackage.zbw.b, new defpackage.mbn(defpackage.rmx.CUI_INFRA_CUI_EVENT_LOGGED, defpackage.qbc.CUI_INFRA_CUI_EVENT_LOGGED)), new defpackage.aoiu(defpackage.zbw.c, new defpackage.mbn(defpackage.rmx.CUI_INFRA_ENDED_CUI, defpackage.qbc.CUI_INFRA_ENDED_CUI)), new defpackage.aoiu(defpackage.zbw.d, new defpackage.mbn(defpackage.rmx.CUI_INFRA_CANCELLED_CUI, defpackage.qbc.CUI_INFRA_CANCELLED_CUI)), new defpackage.aoiu(defpackage.zbw.e, new defpackage.mbn(defpackage.rmx.CUI_INFRA_STARTED_CUI, defpackage.qbc.CUI_INFRA_STARTED_CUI)), new defpackage.aoiu(defpackage.zbw.f, new defpackage.mbn(defpackage.rmx.CUI_INFRA_ONGOING_CUI_NOT_ENDED, defpackage.qbc.CUI_INFRA_ONGOING_CUI_NOT_ENDED)), new defpackage.aoiu(defpackage.zbw.g, new defpackage.mbn(defpackage.rmx.CUI_INFRA_CUI_ERROR_LOGGED, defpackage.qbc.CUI_INFRA_CUI_ERROR_LOGGED)), new defpackage.aoiu(defpackage.zbw.h, new defpackage.mbn(defpackage.rmx.CUI_INFRA_ENDED_CUI_WITH_FAILURE, defpackage.qbc.CUI_INFRA_ENDED_CUI_WITH_FAILURE)), new defpackage.aoiu(defpackage.zbw.i, new defpackage.mbn(defpackage.rmx.CUI_INFRA_TIMEOUT_JOB_NULL, defpackage.qbc.CUI_INFRA_TIMEOUT_JOB_NULL)), new defpackage.aoiu(defpackage.zbw.j, new defpackage.mbn(defpackage.rmx.CUI_INFRA_COROUTINE_SCOPE_NOT_ACTIVE_WHILE_HANDLING_TIMEOUT, defpackage.qbc.CUI_INFRA_COROUTINE_SCOPE_NOT_ACTIVE_WHILE_HANDLING_TIMEOUT)), new defpackage.aoiu(defpackage.zbw.k, new defpackage.mbn(defpackage.rmx.CUI_INFRA_TIMED_OUT_CUI, defpackage.qbc.CUI_INFRA_TIMED_OUT_CUI)), new defpackage.aoiu(defpackage.zbw.l, new defpackage.mbn(defpackage.rmx.CUI_INFRA_CUI_NOT_REMOVED_FROM_TRACKER, defpackage.qbc.CUI_INFRA_CUI_NOT_REMOVED_FROM_TRACKER)), new defpackage.aoiu(defpackage.zbw.m, new defpackage.mbn(defpackage.rmx.CUI_INFRA_CUI_REMOVED_FROM_TRACKER, defpackage.qbc.CUI_INFRA_CUI_REMOVED_FROM_TRACKER)), new defpackage.aoiu(defpackage.zbw.n, new defpackage.mbn(defpackage.rmx.CUI_INFRA_SEQUENCE_FUTURE_FAILED, null)), new defpackage.aoiu(defpackage.zbw.o, new defpackage.mbn(defpackage.rmx.CUI_INFRA_SEQUENCE_FUTURE_CANCELED, null)));
    private final defpackage.rlv b;
    private final defpackage.zpm c;
    private final defpackage.zjm d;

    public mbo(defpackage.rlv rlvVar, defpackage.zpm zpmVar, defpackage.zjm zjmVar) {
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        if (zjmVar == null) {
            defpackage.aooh.i("callIdTracker");
        }
        this.b = rlvVar;
        this.c = zpmVar;
        this.d = zjmVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    @Override // defpackage.zbp
    public final void a(defpackage.zbo zboVar) {
        qbe qbeVarCp;
        mbm mbmVar;
        if (zboVar instanceof defpackage.zbv) {
            defpackage.zbv zbvVar = (defpackage.zbv) zboVar;
            defpackage.mbn mbnVar = (defpackage.mbn) a.get(zbvVar.a);
            if (mbnVar != null) {
                java.lang.String str = zbvVar.d;
                defpackage.qbc qbcVar = mbnVar.b;
                if (qbcVar != null && str != null) {
                    java.lang.String str2 = (java.lang.String) defpackage.aooh.q(this.d.c(str));
                    if (str2 != null) {
                        j$.util.Optional optionalE = this.c.e(str2);
                        defpackage.aooh.e(optionalE, "get(...)");
                        apqr apqrVar = (apqr) defpackage.aooh.q(optionalE);
                        if (apqrVar == null || (mbmVar = (mbm) apqrVar.a(mbm.class)) == null) {
                            qbeVarCp = null;
                        } else {
                            qbeVarCp = mbmVar.cp();
                        }
                    } else {
                        qbeVarCp = null;
                    }
                    if (qbeVarCp != null) {
                        java.lang.Integer num = zbvVar.b;
                        defpackage.mce mceVar = zbvVar.e;
                        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(num);
                        java.lang.Integer numValueOf = mceVar != null ? java.lang.Integer.valueOf(mceVar.a()) : null;
                        defpackage.zal zalVar = zbvVar.c;
                        qbeVarCp.b(qbcVar, optionalOfNullable, j$.util.Optional.ofNullable(numValueOf), j$.util.Optional.ofNullable(zalVar != null ? java.lang.Integer.valueOf(zalVar.a()) : null));
                        return;
                    }
                }
                defpackage.rlv rlvVar = this.b;
                defpackage.rmx rmxVar = mbnVar.a;
                java.lang.Integer num2 = zbvVar.b;
                defpackage.mce mceVar2 = zbvVar.e;
                j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable(num2);
                java.lang.Integer numValueOf2 = mceVar2 != null ? java.lang.Integer.valueOf(mceVar2.a()) : null;
                defpackage.zal zalVar2 = zbvVar.c;
                rlvVar.p(rmxVar, optionalOfNullable2, j$.util.Optional.ofNullable(numValueOf2), j$.util.Optional.ofNullable(zalVar2 != null ? java.lang.Integer.valueOf(zalVar2.a()) : null));
            }
        }
    }
}
