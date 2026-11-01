package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xdr extends amzm {
    private final amzg b;
    private final amzg c;

    public xdr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.xdr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        defpackage.xdo xdoVar = (defpackage.xdo) list.get(1);
        if (optional.isPresent()) {
            j$.util.Optional optionalF = xdoVar.a.f();
            if (optionalF.isPresent()) {
                int iOrdinal = ((defpackage.xco) optionalF.get()).ordinal();
                if (iOrdinal == 1) {
                    defpackage.rea reaVar = defpackage.rea.CONTROLLER_ATLAS;
                    defpackage.req reqVar = new defpackage.req();
                    reqVar.e(2132017381);
                    reqVar.b(2132017379);
                    reqVar.d(2132017380);
                    reqVar.c(android.R.string.cancel);
                    optionalOf = j$.util.Optional.of(new defpackage.reo(reaVar, pez.bq(reqVar.a())));
                } else if (iOrdinal == 2) {
                    defpackage.rea reaVar2 = defpackage.rea.CONTROLLER_ATLAS;
                    defpackage.req reqVar2 = new defpackage.req();
                    reqVar2.e(2132017384);
                    reqVar2.b(2132017382);
                    reqVar2.c(2132017383);
                    optionalOf = j$.util.Optional.of(new defpackage.reo(reaVar2, pez.bq(reqVar2.a())));
                } else if (iOrdinal == 3) {
                    defpackage.rea reaVar3 = defpackage.rea.CONTROLLER_ATLAS;
                    defpackage.req reqVar3 = new defpackage.req();
                    reqVar3.e(2132017404);
                    reqVar3.b(2132017402);
                    reqVar3.d(2132017403);
                    reqVar3.c(android.R.string.cancel);
                    optionalOf = j$.util.Optional.of(new defpackage.reo(reaVar3, pez.bq(reqVar3.a())));
                } else if (iOrdinal != 4) {
                    optionalOf = j$.util.Optional.empty();
                } else {
                    defpackage.rea reaVar4 = defpackage.rea.CONTROLLER_ATLAS;
                    defpackage.rep repVar = new defpackage.rep(null);
                    j$.util.Objects.requireNonNull(repVar);
                    optionalOf = j$.util.Optional.of(new defpackage.reo(reaVar4, new defpackage.rek(repVar)));
                }
            } else {
                optionalOf = j$.util.Optional.empty();
            }
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
