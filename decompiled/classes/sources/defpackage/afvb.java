package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afvb implements defpackage.dyy {
    final /* synthetic */ defpackage.afvc a;

    public afvb(defpackage.afvc afvcVar) {
        j$.util.Objects.requireNonNull(afvcVar);
        this.a = afvcVar;
    }

    @Override // defpackage.dyy
    public final defpackage.eax dC(android.view.View view, defpackage.eax eaxVar) {
        defpackage.afvc afvcVar = this.a;
        if (afvcVar.b == null) {
            afvcVar.b = new android.graphics.Rect();
        }
        afvcVar.b.set(eaxVar.b(), eaxVar.d(), eaxVar.c(), eaxVar.a());
        afvcVar.a(eaxVar);
        boolean z = true;
        if (!eaxVar.b.d().equals(defpackage.dwn.a) && afvcVar.a != null) {
            z = false;
        }
        afvcVar.setWillNotDraw(z);
        afvcVar.postInvalidateOnAnimation();
        return eaxVar.n();
    }
}
