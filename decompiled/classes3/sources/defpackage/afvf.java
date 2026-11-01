package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afvf extends defpackage.afzb {
    final /* synthetic */ defpackage.afvh a;

    public afvf(defpackage.afvh afvhVar) {
        j$.util.Objects.requireNonNull(afvhVar);
        this.a = afvhVar;
    }

    @Override // defpackage.afzb
    public final void a(int i) {
        defpackage.afvh afvhVar = this.a;
        afvhVar.c = true;
        afvg afvgVar = (afvg) afvhVar.d.get();
        if (afvgVar != null) {
            afvgVar.h();
        }
    }

    @Override // defpackage.afzb
    public final void b(android.graphics.Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        defpackage.afvh afvhVar = this.a;
        afvhVar.c = true;
        afvg afvgVar = (afvg) afvhVar.d.get();
        if (afvgVar != null) {
            afvgVar.h();
        }
    }
}
