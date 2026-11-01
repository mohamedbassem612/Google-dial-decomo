package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adky implements adfq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ adhw a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ adky(adhw adhwVar, java.lang.String str, java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.a = adhwVar;
        this.b = str;
        this.d = obj;
        this.c = j;
    }

    public final void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameE = ((com.google.android.libraries.micore.superpacks.common.PackManifest) this.d).e();
            long j = this.c;
            ((adlc) obj).e(this.a, this.b, versionedNameE, j);
            return;
        }
        if (i == 1) {
            adlc adlcVar = (adlc) obj;
            long j2 = this.c;
            java.lang.Object obj2 = this.d;
            adlcVar.a(this.a, this.b, (com.google.android.libraries.micore.superpacks.base.VersionedName) obj2, j2);
            return;
        }
        if (i != 2) {
            adlc adlcVar2 = (adlc) obj;
            long j3 = this.c;
            java.lang.Object obj3 = this.d;
            adlcVar2.a(this.a, this.b, (com.google.android.libraries.micore.superpacks.base.VersionedName) obj3, j3);
            return;
        }
        adlc adlcVar3 = (adlc) obj;
        long j4 = this.c;
        java.lang.Object obj4 = this.d;
        adlcVar3.e(this.a, this.b, (com.google.android.libraries.micore.superpacks.base.VersionedName) obj4, j4);
    }
}
