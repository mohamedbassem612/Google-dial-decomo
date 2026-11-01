package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adgv implements adfq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ adgv(adjz adjzVar, adhw adhwVar, adme admeVar, int i) {
        this.$cid = i;
        this.a = adjzVar;
        this.c = adhwVar;
        this.b = admeVar;
    }

    public final void a(java.lang.Object obj) {
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameC;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.c;
            ((tvn) obj).Y((com.google.android.libraries.micore.superpacks.base.VersionedName) this.a, (java.lang.String) this.b, (java.lang.Throwable) obj2);
            return;
        }
        if (i == 1) {
            java.lang.Object obj3 = this.b;
            ((tvn) obj).Y((com.google.android.libraries.micore.superpacks.base.VersionedName) this.c, (java.lang.String) this.a, (java.lang.Throwable) obj3);
            return;
        }
        tvn tvnVar = (tvn) obj;
        java.lang.Object obj4 = this.c;
        java.lang.Object obj5 = this.a;
        try {
            versionedNameC = ((adjz) obj5).c((adhw) obj4);
        } catch (java.io.IOException e) {
            adhn.a.d().k(e).l("com/google/android/libraries/micore/superpacks/gc/FileManager", "getSuperpackNameOrLog", 1092, "FileManager.java").y("Failed to get superpack name for '%s'", obj4);
            versionedNameC = null;
        }
        adhw adhwVar = (adhw) obj4;
        tvnVar.W(adhwVar, versionedNameC, ((adjz) obj5).i(adhwVar), (adme) this.b);
    }

    public /* synthetic */ adgv(com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.String str, adgf adgfVar, int i) {
        this.$cid = i;
        this.a = versionedName;
        this.b = str;
        this.c = adgfVar;
    }

    public /* synthetic */ adgv(com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.String str, java.lang.Throwable th, int i) {
        this.$cid = i;
        this.c = versionedName;
        this.a = str;
        this.b = th;
    }
}
