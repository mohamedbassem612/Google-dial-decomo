package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adzo implements defpackage.yeo {
    final /* synthetic */ android.widget.ImageView a;

    public adzo(android.widget.ImageView imageView) {
        this.a = imageView;
    }

    @Override // defpackage.yeo
    public final boolean d(defpackage.xxa xxaVar, defpackage.yfa yfaVar) {
        aooh.f(yfaVar, "target");
        this.a.setVisibility(8);
        hgb.b(defpackage.adzp.a.c(), "Failed to load image", xxaVar);
        return false;
    }

    @Override // defpackage.yeo
    public final /* synthetic */ boolean e(java.lang.Object obj, defpackage.yfa yfaVar, defpackage.xuc xucVar) {
        aooh.f(yfaVar, "target");
        aooh.f(xucVar, "dataSource");
        aiof aiofVar = defpackage.adzp.a;
        return false;
    }
}
