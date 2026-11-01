package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gx extends defpackage.ji {
    final /* synthetic */ defpackage.gy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(defpackage.gy gyVar, android.view.View view) {
        super(view);
        this.a = gyVar;
    }

    @Override // defpackage.ji
    public final gi a() {
        gz gzVar = this.a.a.j;
        if (gzVar == null) {
            return null;
        }
        return gzVar.a();
    }

    @Override // defpackage.ji
    public final boolean b() {
        this.a.a.o();
        return true;
    }

    @Override // defpackage.ji
    public final boolean c() {
        defpackage.hb hbVar = this.a.a;
        if (hbVar.n != null) {
            return false;
        }
        hbVar.l();
        return true;
    }
}
