package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxs extends defpackage.er {
    final /* synthetic */ defpackage.lxq a;
    final /* synthetic */ defpackage.lxq b;

    public lxs(defpackage.lxq lxqVar, defpackage.lxq lxqVar2) {
        this.a = lxqVar;
        this.b = lxqVar2;
    }

    @Override // defpackage.er
    public final int a() {
        return this.b.a().size();
    }

    @Override // defpackage.er
    public final int b() {
        return this.a.a().size();
    }

    @Override // defpackage.er
    public final boolean d(int i, int i2) {
        return aooh.n(this.a.a().get(i), this.b.a().get(i2));
    }

    @Override // defpackage.er
    public final boolean e(int i, int i2) {
        return ((defpackage.lxr) this.a.a().get(i)).a() == ((defpackage.lxr) this.b.a().get(i2)).a();
    }
}
