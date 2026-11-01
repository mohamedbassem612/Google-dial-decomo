package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aizn implements java.lang.Comparable {
    public final java.lang.Object a;
    final int b;
    public final java.util.List c = new java.util.ArrayList();
    public int d;

    public aizn(java.lang.Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Integer.compare(this.b, ((defpackage.aizn) obj).b);
    }
}
