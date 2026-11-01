package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryy implements defpackage.sjh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ryy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.sjh
    public final void a(int i, android.content.Intent intent) {
        int i2 = this.$cid;
        java.lang.Object obj = this.a;
        if (i2 != 0) {
            defpackage.ryi ryiVar = ((defpackage.ryl) obj).b;
            ryiVar.H().setResult(i, intent);
            ryiVar.H().finish();
        } else {
            defpackage.ryw rywVar = ((defpackage.rza) obj).b;
            rywVar.H().setResult(i);
            if (intent != null) {
                rywVar.H().setIntent(intent);
            }
            rywVar.H().finish();
        }
    }

    @Override // defpackage.sjh
    public final void f(defpackage.abxn abxnVar) {
        if (this.$cid != 0) {
            aooh.f(abxnVar, "onboardingFlowArgument");
        } else {
            aooh.f(abxnVar, "onboardingFlowArgument");
        }
    }

    @Override // defpackage.sjh
    public final void b() {
    }

    @Override // defpackage.sjh
    public final void c() {
    }

    @Override // defpackage.sjh
    public final void d() {
    }

    @Override // defpackage.sjh
    public final void e() {
    }
}
