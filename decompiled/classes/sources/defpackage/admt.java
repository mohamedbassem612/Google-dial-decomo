package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class admt implements defpackage.adfq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.adhw a;
    public final /* synthetic */ com.google.android.libraries.micore.superpacks.base.VersionedName b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ admt(defpackage.adhw adhwVar, java.lang.String str, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.Exception exc, int i) {
        this.$cid = i;
        this.a = adhwVar;
        this.d = str;
        this.b = versionedName;
        this.c = exc;
    }

    @Override // defpackage.adfq
    public final void a(java.lang.Object obj) {
        if (this.$cid != 0) {
            java.lang.Object obj2 = this.c;
            ((defpackage.adlc) obj).b(this.a, (java.lang.String) this.d, this.b, (java.lang.Throwable) obj2);
            return;
        }
        java.lang.Object obj3 = this.d;
        ((defpackage.adlc) obj).b(this.a, (java.lang.String) this.c, this.b, (java.lang.Throwable) obj3);
    }

    public /* synthetic */ admt(defpackage.adhw adhwVar, java.lang.String str, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.Throwable th, int i) {
        this.$cid = i;
        this.a = adhwVar;
        this.c = str;
        this.b = versionedName;
        this.d = th;
    }
}
