package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ammy implements java.lang.Comparable {
    public int a = -1;
    public double b = -1.0d;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Double.valueOf(this.b).compareTo(java.lang.Double.valueOf(((defpackage.ammy) obj).b));
    }
}
