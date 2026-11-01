package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adir implements adhy {
    public final com.google.android.libraries.micore.superpacks.common.PackManifest a;
    public final defpackage.adka b;
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public adir(defpackage.adka adkaVar, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) {
        this.b = adkaVar;
        this.a = packManifest;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.adir a() {
        adik.i(this.c.get());
        return new defpackage.adir(this.b.a(), this.a);
    }

    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        this.b.close();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.adir) {
            defpackage.adir adirVar = (defpackage.adir) obj;
            com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = this.a;
            if (packManifest != null) {
                return packManifest.equals(adirVar.a);
            }
            if (adirVar.a == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = this.a;
        if (packManifest != null) {
            return packManifest.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        return this.b.d();
    }
}
