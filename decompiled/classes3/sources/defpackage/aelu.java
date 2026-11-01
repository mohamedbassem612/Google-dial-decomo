package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aelu {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public aelu(defpackage.aaed aaedVar, android.app.Dialog dialog) {
        this.a = dialog;
        j$.util.Objects.requireNonNull(aaedVar);
        this.b = aaedVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [acov, java.lang.Object] */
    public final void a(android.view.View view, defpackage.aelm aelmVar) {
        java.lang.Object obj = this.b;
        defpackage.acmm acmmVarB = this.a.b();
        defpackage.acma acmaVarF = ((defpackage.aelv) obj).f(90569, ahyn.h(aelmVar));
        acmaVarF.b(defpackage.aelp.a);
        acmmVarB.a(view, acmaVarF);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aehm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [aoir, java.lang.Object] */
    public final defpackage.afpl b(java.lang.Object obj) {
        defpackage.aehv aehvVar;
        defpackage.aeho aehoVarA = this.a.a(obj);
        char c = (aehoVarA == null || !aehoVarA.a) ? (char) 1 : (char) 2;
        java.lang.Object obj2 = this.b;
        if (c == 1) {
            aehvVar = null;
        } else {
            aeic aeicVar = (aeic) ((defpackage.vqf) obj2).a;
            defpackage.aeih aeihVar = (true != aeicVar.a ? 1 : 2) + (-1) != 0 ? (defpackage.aeih) aeicVar.d.a() : (defpackage.aeih) aeicVar.c.a();
            aehvVar = new defpackage.aehv(ahwt.a, ahyn.h(aehj.b(aeihVar.a, aeihVar.b)));
        }
        return new defpackage.afpl(aehvVar);
    }

    public final void c() {
        ((defpackage.aaee) ((defpackage.aaed) this.b).b).b();
        android.app.Dialog dialog = (android.app.Dialog) this.a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public aelu(android.content.Context context) {
        this.a = context;
        this.b = "image_manager_disk_cache";
    }

    public aelu(java.util.Set set, java.util.Set set2) {
        this.a = set;
        this.b = set2;
    }

    public /* synthetic */ aelu(defpackage.vqf vqfVar, defpackage.aehm aehmVar) {
        this.b = vqfVar;
        this.a = aehmVar;
    }

    public /* synthetic */ aelu(defpackage.aekj aekjVar, defpackage.aekp aekpVar) {
        this.a = aekjVar;
        this.b = aekpVar;
    }

    public aelu(defpackage.aelv aelvVar, defpackage.acov acovVar) {
        this.a = acovVar;
        j$.util.Objects.requireNonNull(aelvVar);
        this.b = aelvVar;
    }
}
