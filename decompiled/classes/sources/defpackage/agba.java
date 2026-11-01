package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class agba extends android.view.ViewOutlineProvider {
    final /* synthetic */ defpackage.agbb a;

    public agba(defpackage.agbb agbbVar) {
        j$.util.Objects.requireNonNull(agbbVar);
        this.a = agbbVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        android.graphics.Path path = this.a.d;
        if (path.isEmpty()) {
            return;
        }
        baa$.ExternalSyntheticApiModelOutline1.m(outline, path);
    }
}
