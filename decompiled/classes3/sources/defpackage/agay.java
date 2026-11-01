package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agay extends android.view.ViewOutlineProvider {
    final /* synthetic */ defpackage.agaz a;

    public agay(defpackage.agaz agazVar) {
        j$.util.Objects.requireNonNull(agazVar);
        this.a = agazVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        defpackage.agaz agazVar = this.a;
        if (agazVar.b == null || agazVar.c.isEmpty()) {
            return;
        }
        outline.setRoundRect((int) agazVar.c.left, (int) agazVar.c.top, (int) agazVar.c.right, (int) agazVar.c.bottom, agazVar.e);
    }
}
