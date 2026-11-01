package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adha implements defpackage.adij {
    public final /* synthetic */ aift a;
    public final /* synthetic */ aift b;

    public /* synthetic */ adha(aift aiftVar, aift aiftVar2) {
        this.a = aiftVar;
        this.b = aiftVar2;
    }

    @Override // defpackage.adij
    public final void a(java.lang.Object obj, int i) {
        com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) obj;
        if (i == 1) {
            this.a.i(packManifest);
        } else {
            this.b.i(packManifest);
        }
    }
}
