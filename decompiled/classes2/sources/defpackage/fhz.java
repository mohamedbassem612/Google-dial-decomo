package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fhz implements java.lang.Comparable {
    private final boolean a;
    private final boolean b;

    public fhz(defpackage.eqg eqgVar, int i) {
        this.a = 1 == (eqgVar.e & 1);
        this.b = defpackage.hgt.aw(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.fhz fhzVar) {
        return defpackage.aieh.b.e(this.b, fhzVar.b).e(this.a, fhzVar.a).a();
    }
}
