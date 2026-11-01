package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aafp extends aw implements defpackage.aaez {
    public static final java.util.WeakHashMap a = new java.util.WeakHashMap();
    private final defpackage.aafb b = new defpackage.aafb();

    @Override // defpackage.aaez
    public final android.app.Activity a() {
        return G();
    }

    public final void ad(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.ad(str, fileDescriptor, printWriter, strArr);
        this.b.i();
    }

    public final void ag(int i, int i2, android.content.Intent intent) {
        super.ag(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    public final void ai() {
        super.ai();
        this.b.c();
    }

    public final void an() {
        super.an();
        this.b.d();
    }

    @Override // defpackage.aaez
    public final void b(defpackage.aaey aaeyVar) {
        this.b.h(aaeyVar);
    }

    @Override // defpackage.aaez
    public final defpackage.aaey c(java.lang.Class cls) {
        return this.b.j(cls);
    }

    public final void h(android.os.Bundle bundle) {
        super.h(bundle);
        this.b.b(bundle);
    }

    public final void k(android.os.Bundle bundle) {
        this.b.e(bundle);
    }

    public final void l() {
        super.l();
        this.b.f();
    }

    public final void m() {
        super.m();
        this.b.g();
    }
}
