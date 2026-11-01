package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adfw implements adfq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ adhw a;
    public final /* synthetic */ com.google.android.libraries.micore.superpacks.base.VersionedName b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ adfw(adhw adhwVar, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.String str, adme admeVar, int i) {
        this.$cid = i;
        this.a = adhwVar;
        this.b = versionedName;
        this.c = str;
        this.d = admeVar;
    }

    public final void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.d;
            java.lang.Object obj3 = this.c;
            ((tvn) obj).W(this.a, this.b, (java.lang.String) obj3, (adme) obj2);
            return;
        }
        if (i != 1) {
            java.lang.Object obj4 = this.c;
            java.lang.Object obj5 = this.d;
            ((tvn) obj).ab(this.a, this.b, (java.lang.String) obj5, (java.lang.Throwable) obj4);
            return;
        }
        java.lang.Object obj6 = this.c;
        java.lang.Object obj7 = this.d;
        ((tvn) obj).ac(this.a, this.b, (java.lang.String) obj7, (java.lang.Throwable) obj6);
    }

    public /* synthetic */ adfw(adhw adhwVar, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, java.lang.String str, java.lang.Throwable th, int i) {
        this.$cid = i;
        this.a = adhwVar;
        this.b = versionedName;
        this.d = str;
        this.c = th;
    }
}
