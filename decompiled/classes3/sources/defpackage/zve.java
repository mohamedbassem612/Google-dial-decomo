package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zve implements java.lang.Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.zve zveVar = (defpackage.zve) obj;
        int i = this.b;
        int i2 = zveVar.b;
        return i != i2 ? i - i2 : this.a - zveVar.a;
    }

    public final java.lang.String toString() {
        return "Order{order=" + this.b + ", index=" + this.a + '}';
    }
}
