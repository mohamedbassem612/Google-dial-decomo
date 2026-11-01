package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hek extends defpackage.hef {
    private final defpackage.hah j;
    private final defpackage.heg k;

    public hek(defpackage.gzs gzsVar, defpackage.hei heiVar, defpackage.heg hegVar, defpackage.gzh gzhVar) {
        super(gzsVar, heiVar);
        this.k = hegVar;
        defpackage.hah hahVar = new defpackage.hah(gzsVar, this, new defpackage.hea("__container", heiVar.a, false), gzhVar);
        this.j = hahVar;
        hahVar.f(java.util.Collections.EMPTY_LIST, java.util.Collections.EMPTY_LIST);
    }

    @Override // defpackage.hef, defpackage.hai
    public final void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.j.c(rectF, this.a, z);
    }

    @Override // defpackage.hef
    public final void j(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        this.j.b(canvas, matrix, i);
    }

    @Override // defpackage.hef
    public final void l(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        this.j.e(hcwVar, i, list, hcwVar2);
    }

    @Override // defpackage.hef
    public final defpackage.heq q() {
        defpackage.heq heqVarQ = super.q();
        return heqVarQ == null ? this.k.q() : heqVarQ;
    }

    @Override // defpackage.hef
    public final defpackage.hwv r() {
        defpackage.hwv hwvVarR = super.r();
        return hwvVarR == null ? this.k.r() : hwvVarR;
    }
}
