package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbt extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public rbt(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbt.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final defpackage.pzn pznVar = (defpackage.pzn) list.get(0);
        final zms zmsVar = (zms) list.get(1);
        final her herVar = (her) list.get(2);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        return aiql.z(defpackage.uyg.K(new java.util.concurrent.Callable() { // from class: ras
            /* JADX WARN: Code duplicated, block: B:19:0x006c  */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                j$.util.Optional optionalEmpty;
                if (zBooleanValue) {
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optionalA = pznVar.a();
                if (true == optionalA.isPresent() && ((java.lang.Boolean) optionalA.get()).booleanValue()) {
                    optionalA = j$.util.Optional.empty();
                }
                ida idaVar = new ida(zmsVar, 5);
                if (true == optionalA.isPresent()) {
                    if (((zms) idaVar.a).a() != defpackage.zmw.ROUTE_EARPIECE) {
                        optionalA = j$.util.Optional.empty();
                    }
                }
                ida idaVar2 = new ida(herVar, 6);
                if (true == optionalA.isPresent()) {
                    if (((java.util.concurrent.atomic.AtomicBoolean) ((her) idaVar2.a).a).get()) {
                        optionalEmpty = j$.util.Optional.empty();
                    } else {
                        optionalEmpty = optionalA;
                    }
                } else {
                    optionalEmpty = optionalA;
                }
                if (true != optionalEmpty.isPresent()) {
                    return optionalEmpty;
                }
                return j$.util.Optional.ofNullable(defpackage.qtz.SNACKBAR_TURN_ON_SPEAKER_OR_FOLD_DEVICE);
            }
        }, (ajct) list.get(4)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
