package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mlo extends defpackage.kf {
    final /* synthetic */ defpackage.mlp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlo(defpackage.mlp mlpVar, android.content.Context context, android.view.View view) {
        super(context, view, 0, 2130970239, 0);
        j$.util.Objects.requireNonNull(mlpVar);
        this.h = mlpVar;
    }

    @Override // defpackage.kf
    public final void a() {
        int i = 0;
        while (true) {
            ft ftVar = this.b;
            if (i >= ftVar.size()) {
                this.h.d = true;
                super.a();
                return;
            } else {
                ftVar.getItem(i).setEnabled(!this.h.f.a().isEmpty());
                i++;
            }
        }
    }
}
