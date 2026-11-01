package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class hbf extends defpackage.hgp {
    final /* synthetic */ defpackage.hgp a;

    public hbf(defpackage.hbg hbgVar, defpackage.hgp hgpVar) {
        this.a = hgpVar;
        j$.util.Objects.requireNonNull(hbgVar);
    }

    @Override // defpackage.hgp
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.hgo hgoVar) {
        java.lang.Float f = (java.lang.Float) this.a.a(hgoVar);
        if (f == null) {
            return null;
        }
        return java.lang.Float.valueOf(f.floatValue() * 2.55f);
    }
}
