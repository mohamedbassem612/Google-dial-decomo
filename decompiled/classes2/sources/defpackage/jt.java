package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jt extends android.database.DataSetObserver {
    final /* synthetic */ defpackage.jv a;

    public jt(defpackage.jv jvVar) {
        this.a = jvVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        defpackage.jv jvVar = this.a;
        if (jvVar.x()) {
            jvVar.v();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.m();
    }
}
