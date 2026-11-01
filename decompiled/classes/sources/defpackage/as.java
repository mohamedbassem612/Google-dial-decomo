package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class as extends defpackage.bb {
    final /* synthetic */ defpackage.aw a;

    public as(defpackage.aw awVar) {
        this.a = awVar;
    }

    @Override // defpackage.bb
    public final android.view.View a(int i) {
        defpackage.aw awVar = this.a;
        android.view.View view = awVar.Q;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new java.lang.IllegalStateException(defpackage.a.bg(awVar, "Fragment ", " does not have a view"));
    }

    @Override // defpackage.bb
    public final boolean b() {
        return this.a.Q != null;
    }
}
