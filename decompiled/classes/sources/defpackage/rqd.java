package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rqd extends defpackage.na {
    final /* synthetic */ defpackage.rqi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqd(defpackage.rqi rqiVar) {
        super(false);
        this.a = rqiVar;
    }

    @Override // defpackage.na
    public final void b() {
        mla mlaVarA;
        mla mlaVarA2;
        defpackage.rqi rqiVar = this.a;
        if (rqiVar.b.I().d(2131428892) == null) {
            rqiVar.f.i(zoe.N(rqiVar.d.b(defpackage.roc.CALL_LOG_TAB_KEY)), rqiVar.v);
            return;
        }
        rqiVar.h.n(defpackage.rmw.MAIN_PRESS_BACK_BUTTON_TO_CLOSE_SEARCH);
        rqu rquVarD = ((defpackage.rru) rqiVar.B.g().orElseThrow(new rqc(0))).b.I().d(2131428892);
        if ((rquVarD instanceof rqu) && (mlaVarA2 = rquVarD.c().a()) != null) {
            mlaVarA2.r().a();
        }
        if ((rquVarD instanceof rrf) && (mlaVarA = ((rrf) rquVarD).s().a()) != null) {
            mlaVarA.r().a();
        }
        rqiVar.f.i(zoe.N(rqiVar.d.a()), rqiVar.x);
    }
}
