package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gkk extends defpackage.gla {
    boolean a = false;
    final android.view.ViewGroup b;

    public gkk(android.view.ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void a(gkz gkzVar) {
        fn$.ExternalSyntheticApiModelOutline0.m(this.b, false);
        this.a = true;
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void b(gkz gkzVar) {
        if (!this.a) {
            fn$.ExternalSyntheticApiModelOutline0.m(this.b, false);
        }
        gkzVar.I(this);
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void c() {
        fn$.ExternalSyntheticApiModelOutline0.m(this.b, false);
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void d() {
        fn$.ExternalSyntheticApiModelOutline0.m(this.b, true);
    }
}
