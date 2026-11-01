package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class psb extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amyz e;
    private final amzg f;
    private final amzg g;

    public psb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amyz amyzVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.psb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amyzVar3;
        this.f = amzs.b(amzgVar4);
        this.g = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final android.telecom.Call call = (android.telecom.Call) list.get(0);
        final android.os.Bundle bundle = (android.os.Bundle) list.get(1);
        final long jLongValue = ((java.lang.Long) list.get(3)).longValue();
        mgu mguVar = (mgu) list.get(4);
        final amyz amyzVar = this.e;
        java.lang.Boolean bool = (java.lang.Boolean) mguVar.a(new java.util.function.Supplier() { // from class: pqs
            /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                if (call.getDetails().hasProperty(4)) {
                    return java.lang.Boolean.TRUE;
                }
                android.os.Bundle bundle2 = bundle;
                long j = bundle2.containsKey("android.telecom.extra.LAST_EMERGENCY_CALLBACK_TIME_MILLIS") ? bundle2.getLong("android.telecom.extra.LAST_EMERGENCY_CALLBACK_TIME_MILLIS", 0L) : 0L;
                if (j == 0) {
                    return java.lang.Boolean.FALSE;
                }
                aoin aoinVar = amyzVar;
                long j2 = jLongValue;
                hgb.c(defpackage.pqv.a.b(), "Using call creation time to calculate emergency callback status.", "com/android/dialer/incall/core/call/CallProducerModule", "produceIsEmergencyCallback", (char) 498, "CallProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                return java.lang.Boolean.valueOf((boolean) (((j2 - j) > ((java.lang.Long) aoinVar.a()).longValue() ? 1 : ((j2 - j) == ((java.lang.Long) aoinVar.a()).longValue() ? 0 : -1)) >>> 31));
            }
        }).a(mfy.ab).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
