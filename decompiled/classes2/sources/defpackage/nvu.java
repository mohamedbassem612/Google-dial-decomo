package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nvu implements java.util.function.Consumer {
    final /* synthetic */ aosb a;

    public nvu(aosb aosbVar) {
        this.a = aosbVar;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object obj) {
        aosb aosbVar = this.a;
        java.lang.Integer num = (java.lang.Integer) obj;
        if (aosbVar.h()) {
            boolean z = false;
            if (num != null && num.intValue() == 2) {
                z = true;
            }
            aosbVar.w(java.lang.Boolean.valueOf(z));
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
