package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoao implements java.lang.Comparable {
    public final defpackage.anna a;
    final double b;

    public aoao(defpackage.anna annaVar, double d) {
        this.a = annaVar;
        this.b = d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Double.compare(this.b, ((defpackage.aoao) obj).b);
    }
}
