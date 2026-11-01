package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzt implements defpackage.alvw {
    public static final /* synthetic */ int b = 0;
    private static final aihd c = aihd.r("GoodbyeThanksSpam", "ReportSpamAndEndCallSpam");
    private static final aihd d = aihd.s("GoodbyeThanks", "AcknowledgeAndGoodbye", "TookMessageThanksBye");
    private static final aihd e = new aile("GoodbyeThanksUnknownIfSpam");
    public alln a;

    @Override // defpackage.alvw
    public final defpackage.alsy a(java.lang.String str, j$.util.Optional optional) {
        return this.a.c(str);
    }

    @Override // defpackage.alvw
    public final defpackage.alxx b(java.lang.String str) {
        if (c.contains(str)) {
            return defpackage.alxx.DECISION_SPAM;
        }
        if (e(str)) {
            return defpackage.alxx.DECISION_NOT_SPAM;
        }
        return (e.contains(str) || str.equals("ServiceAbnegate")) ? defpackage.alxx.DECISION_UNKNOWN_IF_SPAM : defpackage.alxx.NO_DECISION;
    }

    @Override // defpackage.alvw
    public final java.lang.String c() {
        return "GoodbyeThanks";
    }

    @Override // defpackage.alvw
    public final java.lang.String d() {
        return "GoodbyeThanksSpam";
    }

    @Override // defpackage.alvw
    public final boolean e(java.lang.String str) {
        return d.contains(str);
    }

    @Override // defpackage.alvw
    public final /* synthetic */ void f(akzx akzxVar, java.lang.Object obj) {
        akzxVar.u();
        defpackage.alnf alnfVar = (defpackage.alnf) akzxVar.b;
        defpackage.alnf alnfVar2 = defpackage.alnf.a;
        alnfVar.f = java.lang.Integer.valueOf(((defpackage.alys) obj).p);
        alnfVar.e = 11;
    }
}
