package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ydw implements defpackage.ydi {
    final /* synthetic */ defpackage.ydy a;

    public ydw(defpackage.ydy ydyVar) {
        j$.util.Objects.requireNonNull(ydyVar);
        this.a = ydyVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.ydi
    public final void a(boolean z) {
        java.util.ArrayList arrayList;
        defpackage.ygc.g();
        defpackage.ydy ydyVar = this.a;
        synchronized (ydyVar) {
            arrayList = new java.util.ArrayList((java.util.Collection) ydyVar.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.ydi) arrayList.get(i)).a(z);
        }
    }
}
