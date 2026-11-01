package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class epe implements enh {
    public final defpackage.epl a;
    public final defpackage.epb b;
    public boolean c = false;

    public epe(defpackage.epl eplVar, defpackage.epb epbVar) {
        this.a = eplVar;
        this.b = epbVar;
    }

    public final void a(java.lang.Object obj) {
        if (defpackage.epg.g(2)) {
            android.util.Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + defpackage.epl.q(obj));
        }
        this.c = true;
        this.b.a(this.a, obj);
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }
}
