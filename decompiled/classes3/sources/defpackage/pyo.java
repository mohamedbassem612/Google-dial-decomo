package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pyo implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ char a;

    public /* synthetic */ pyo(char c, int i) {
        this.$cid = i;
        this.a = c;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        if (this.$cid == 0) {
            aimz aimzVar = defpackage.pyu.a;
            ((defpackage.pzm) ((defpackage.pzm) obj).a).a(this.a);
            return;
        }
        defpackage.pzm pzmVar = (defpackage.pzm) obj;
        aimz aimzVar2 = defpackage.pyu.a;
        ((java.lang.StringBuilder) pzmVar.b).append(this.a);
        ((zpz) pzmVar.c).a(ajcm.a);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return this.$cid != 0 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
