package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adkz {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public adkz(defpackage.adla adlaVar, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, java.io.File file) {
        this.a = packManifest;
        this.b = file;
        j$.util.Objects.requireNonNull(adlaVar);
        this.c = adlaVar;
    }

    public final void a(java.lang.String str, java.io.File file, java.lang.Exception exc) {
        com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) this.a;
        defpackage.adhw adhwVarP = packManifest.p();
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameE = packManifest.e();
        exc.getMessage();
        defpackage.adhb adhbVar = (defpackage.adhb) adhwVarP;
        java.lang.String str2 = adhbVar.a;
        file.length();
        defpackage.adhl.a.b();
        java.lang.String str3 = adhbVar.b;
        ((defpackage.adla) this.c).h.d.P(new defpackage.admt(adhwVarP, str, versionedNameE, exc, 1));
    }

    public final void b() {
        defpackage.adw adwVar = (defpackage.adw) this.a;
        java.lang.Object obj = this.c;
        java.util.List list = (java.util.List) adwVar.i(obj);
        if (list != null) {
            list.remove(this.b);
            if (list.isEmpty()) {
                return;
            }
            adwVar.n(obj, list);
        }
    }

    public adkz(defpackage.adw adwVar, java.lang.String str, defpackage.aomy aomyVar) {
        this.a = adwVar;
        this.c = str;
        this.b = aomyVar;
    }
}
