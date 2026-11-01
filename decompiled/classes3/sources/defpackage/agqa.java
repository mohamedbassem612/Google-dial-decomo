package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agqa implements defpackage.xvb {
    final /* synthetic */ defpackage.aekz a;

    public agqa(defpackage.aekz aekzVar) {
        j$.util.Objects.requireNonNull(aekzVar);
        this.a = aekzVar;
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return android.graphics.Bitmap.class;
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.a;
    }

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        xvaVar.c(android.graphics.BitmapFactory.decodeResource(((android.content.Context) this.a.a).getResources(), 2131230892));
    }

    @Override // defpackage.xvb
    public final void d() {
    }

    @Override // defpackage.xvb
    public final void e() {
    }
}
