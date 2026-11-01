package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anae extends defpackage.amzv {
    private final defpackage.amzv a;

    public anae(defpackage.amzv amzvVar) {
        this.a = amzvVar;
    }

    @Override // defpackage.amzv
    public final void a(java.lang.Throwable th) {
        try {
            this.a.a(th);
        } catch (java.lang.RuntimeException e) {
            defpackage.anah.c(e, this.a, "failed", th);
        }
    }

    @Override // defpackage.amzv
    public final void b() {
        try {
            this.a.b();
        } catch (java.lang.RuntimeException e) {
            defpackage.anah.e(e, this.a, "methodFinished");
        }
    }

    @Override // defpackage.amzv
    public final void c() {
        try {
            this.a.c();
        } catch (java.lang.RuntimeException e) {
            defpackage.anah.e(e, this.a, "methodStarting");
        }
    }

    @Override // defpackage.amzv
    public final void d() {
        try {
            this.a.d();
        } catch (java.lang.RuntimeException e) {
            defpackage.anah.e(e, this.a, "requested");
        }
    }

    @Override // defpackage.amzv
    public final void e(java.lang.Object obj) {
        try {
            this.a.e(obj);
        } catch (java.lang.RuntimeException e) {
            defpackage.anah.c(e, this.a, "succeeded", obj);
        }
    }

    @Override // defpackage.amzv
    public final void g() {
        try {
            this.a.g();
        } catch (java.lang.RuntimeException e) {
            defpackage.anah.e(e, this.a, "dependenciesRequested");
        }
    }

    @Override // defpackage.amzv
    public final void h() {
        try {
            this.a.h();
        } catch (java.lang.RuntimeException e) {
            defpackage.anah.e(e, this.a, "ready");
        }
    }
}
