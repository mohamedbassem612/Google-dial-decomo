package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeln extends aehj {
    final /* synthetic */ android.view.View a;
    public final /* synthetic */ defpackage.aelo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeln(defpackage.aelo aeloVar, android.view.View view) {
        super((char[]) null);
        this.a = view;
        j$.util.Objects.requireNonNull(aeloVar);
        this.c = aeloVar;
    }

    public final void t(java.lang.Object obj) {
        android.view.View view = this.a;
        view.post(new defpackage.acxq(this, view, obj, 5));
    }
}
