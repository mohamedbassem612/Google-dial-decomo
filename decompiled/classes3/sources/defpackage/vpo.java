package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vpo implements java.util.function.LongConsumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ akzx a;

    public /* synthetic */ vpo(akzx akzxVar, int i) {
        this.$cid = i;
        this.a = akzxVar;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.$cid;
        if (i == 0) {
            akzx akzxVar = this.a;
            akzxVar.u();
            defpackage.vph vphVar = (defpackage.vph) akzxVar.b;
            defpackage.vph vphVar2 = defpackage.vph.a;
            vphVar.b |= 2;
            vphVar.f = j;
            return;
        }
        akzx akzxVar2 = this.a;
        if (i != 1) {
            akzxVar2.u();
            defpackage.wxh wxhVar = (defpackage.wxh) akzxVar2.b;
            defpackage.wxh wxhVar2 = defpackage.wxh.a;
            wxhVar.b |= 64;
            wxhVar.j = j;
            return;
        }
        akzxVar2.u();
        defpackage.quf qufVar = (defpackage.quf) akzxVar2.b;
        defpackage.quf qufVar2 = defpackage.quf.a;
        qufVar.b |= 128;
        qufVar.k = j;
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.LongConsumer.-CC.$default$andThen(this, longConsumer) : j$.util.function.LongConsumer.-CC.$default$andThen(this, longConsumer);
        }
        return j$.util.function.LongConsumer.-CC.$default$andThen(this, longConsumer);
    }
}
