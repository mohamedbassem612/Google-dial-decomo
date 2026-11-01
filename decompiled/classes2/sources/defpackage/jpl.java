package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpl extends amzm {
    private final amzg b;

    public jpl(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jpl.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        long j;
        long jLongValue;
        long jLongValue2;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
        java.util.Set set = defpackage.jpk.a;
        aooh.f(optionalOfNullable, "callDuration");
        defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.jak(11), 16);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(hvdVar.a.a(optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        java.lang.Long l = (java.lang.Long) aooh.p(optionalOfNullable, 0L);
        if (l.longValue() <= 21) {
            jLongValue = l.longValue();
            jLongValue2 = l.longValue() & 1;
        } else {
            if (l.longValue() > 30) {
                if (l.longValue() <= 60) {
                    jLongValue = l.longValue();
                    jLongValue2 = (l.longValue() - 31) % 5;
                } else {
                    j = 61;
                }
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                return aiql.z(java.lang.Long.valueOf(j * 60));
            }
            jLongValue = l.longValue();
            jLongValue2 = (l.longValue() - 22) % 3;
        }
        j = jLongValue - jLongValue2;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        return aiql.z(java.lang.Long.valueOf(j * 60));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
