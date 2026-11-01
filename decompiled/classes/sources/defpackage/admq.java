package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class admq implements defpackage.adfq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.adhw a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ com.google.android.libraries.micore.superpacks.base.VersionedName c;
    public final /* synthetic */ long d;
    public final /* synthetic */ defpackage.adib e;

    public /* synthetic */ admq(defpackage.adhw adhwVar, java.lang.String str, com.google.android.libraries.micore.superpacks.base.VersionedName versionedName, long j, defpackage.adib adibVar, int i) {
        this.$cid = i;
        this.a = adhwVar;
        this.b = str;
        this.c = versionedName;
        this.d = j;
        this.e = adibVar;
    }

    @Override // defpackage.adfq
    public final void a(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.adib adibVar = this.e;
            long j = this.d;
            com.google.android.libraries.micore.superpacks.base.VersionedName versionedName = this.c;
            ((defpackage.adlc) obj).d(this.a, this.b, versionedName, j, adibVar);
            return;
        }
        defpackage.adib adibVar2 = this.e;
        long j2 = this.d;
        com.google.android.libraries.micore.superpacks.base.VersionedName versionedName2 = this.c;
        ((defpackage.adlc) obj).d(this.a, this.b, versionedName2, j2, adibVar2);
    }
}
