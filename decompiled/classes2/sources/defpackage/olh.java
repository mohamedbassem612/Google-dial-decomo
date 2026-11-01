package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class olh implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.olq a;
    final /* synthetic */ defpackage.oll b;
    private boolean c;

    public olh(defpackage.oll ollVar, defpackage.olq olqVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = olqVar;
        j$.util.Objects.requireNonNull(ollVar);
        this.b = ollVar;
        this.c = false;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(java.lang.Object obj) {
        if (this.$cid != 0) {
            if (this.c) {
                return;
            }
            this.c = true;
            defpackage.oll ollVar = this.b;
            ollVar.b.d();
            ollVar.e(this.a, true);
            ollVar.b.g();
            return;
        }
        if (this.c) {
            return;
        }
        this.c = true;
        defpackage.oll ollVar2 = this.b;
        ollVar2.b.d();
        ollVar2.e(this.a, true);
        ollVar2.b.g();
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return this.$cid != 0 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public olh(defpackage.oll ollVar, defpackage.olq olqVar, int i) {
        this.$cid = i;
        this.a = olqVar;
        j$.util.Objects.requireNonNull(ollVar);
        this.b = ollVar;
        this.c = false;
    }
}
