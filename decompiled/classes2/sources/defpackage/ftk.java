package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ftk implements java.lang.Comparable {
    public final int a;
    public final defpackage.fth b;

    public ftk(int i, defpackage.fth fthVar) {
        this.a = i;
        this.b = fthVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Integer.compare(this.a, ((defpackage.ftk) obj).a);
    }
}
