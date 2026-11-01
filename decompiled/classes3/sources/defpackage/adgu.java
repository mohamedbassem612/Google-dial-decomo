package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adgu implements adfq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ adgu(adhw adhwVar, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, java.lang.String str, int i, int i2) {
        this.$cid = i2;
        this.c = adhwVar;
        this.d = packManifest;
        this.a = str;
        this.b = i;
    }

    public final void a(java.lang.Object obj) {
        if (this.$cid != 0) {
            ((tvn) obj).Y(com.google.android.libraries.micore.superpacks.base.VersionedName.c((java.lang.String) this.d, this.b), this.a, (java.lang.Throwable) this.c);
        } else {
            ((tvn) obj).Z((adhw) this.c, ((com.google.android.libraries.micore.superpacks.common.PackManifest) this.d).e(), this.a, this.b == 1);
        }
    }

    public /* synthetic */ adgu(java.lang.String str, int i, java.lang.String str2, adgf adgfVar, int i2) {
        this.$cid = i2;
        this.d = str;
        this.b = i;
        this.a = str2;
        this.c = adgfVar;
    }
}
