package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adla implements java.io.Closeable {
    public final com.google.android.libraries.micore.superpacks.common.PackManifest a;
    public final defpackage.adin b;
    public final java.io.File c;
    public final defpackage.ahyp d;
    public int e;
    public defpackage.ajdd f;
    public defpackage.ajcq g;
    public final /* synthetic */ defpackage.adlb h;
    public final defpackage.adkz i;
    public final defpackage.aezs j;
    private final java.lang.Runnable k;

    public adla(defpackage.adlb adlbVar, defpackage.aezs aezsVar, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, defpackage.adin adinVar, java.io.File file) {
        j$.util.Objects.requireNonNull(adlbVar);
        this.h = adlbVar;
        this.j = aezsVar;
        defpackage.gsb gsbVar = new defpackage.gsb(adlbVar, packManifest, aezsVar, 8);
        this.k = gsbVar;
        ((defpackage.tvn) aezsVar.e).R(gsbVar);
        this.a = packManifest;
        this.b = adinVar;
        this.c = file;
        this.d = new defpackage.adpv(this, 1);
        this.e = 0;
        this.f = null;
        this.i = new defpackage.adkz(this, packManifest, file);
    }

    public final java.lang.String a() {
        java.lang.String str;
        synchronized (this) {
            com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = this.a;
            str = (java.lang.String) packManifest.g().get(java.lang.Math.min(this.e, ((defpackage.aike) packManifest.g()).d - 1));
        }
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((java.util.concurrent.CopyOnWriteArrayList) ((defpackage.tvn) this.j.e).a).remove(this.k);
    }

    public final java.lang.String toString() {
        return this.a.toString() + ':' + a();
    }
}
