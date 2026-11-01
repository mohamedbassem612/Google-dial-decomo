package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpq extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public jpq(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.jpq.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.aixn aixnVar;
        java.util.List list = (java.util.List) obj;
        java.util.Set set = defpackage.jpk.a;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        zmy zmyVar = (zmy) list.get(2);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(3);
        aooh.f(optional, "callDuration");
        aooh.f(zmyVar, "callDirection");
        aooh.f(optionalOfNullable, "disconnectCause");
        if (zBooleanValue) {
            aixnVar = defpackage.aixn.BLOCKED_CALL_TYPE;
        } else {
            defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.jak(14), 20);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(hvdVar.a.a(optionalOfNullable.get()));
            }
            aooh.e(optionalOfNullable, "map(...)");
            java.lang.Integer num = (java.lang.Integer) aooh.p(optionalOfNullable, 0);
            if (num != null && num.intValue() == 6) {
                aixnVar = defpackage.aixn.REJECTED_CALL_TYPE;
            } else if (zmyVar == zmy.b) {
                aixnVar = defpackage.aixn.OUTGOING_CALL_TYPE;
            } else {
                long jLongValue = ((java.lang.Number) aooh.p(optional, 0L)).longValue();
                if (jLongValue > 0) {
                    aixnVar = defpackage.aixn.INCOMING_ANSWERED_TYPE;
                } else {
                    aixnVar = jLongValue == 0 ? defpackage.aixn.MISSED_CALL_TYPE : defpackage.aixn.UNKNOWN_EVENT_TYPE;
                }
            }
        }
        return aiql.z(aixnVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
