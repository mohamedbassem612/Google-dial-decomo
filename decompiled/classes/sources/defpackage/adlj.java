package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adlj implements defpackage.adsx {
    final /* synthetic */ defpackage.ajdd a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ java.io.File c;
    final /* synthetic */ defpackage.adkz d;

    public adlj(defpackage.aezs aezsVar, defpackage.ajdd ajddVar, java.lang.String str, defpackage.adkz adkzVar, java.io.File file) {
        this.a = ajddVar;
        this.b = str;
        this.d = adkzVar;
        this.c = file;
        j$.util.Objects.requireNonNull(aezsVar);
    }

    @Override // defpackage.adsx
    public final void a(java.io.File file, defpackage.adsw adswVar) {
        java.lang.String str = this.b;
        defpackage.adll adllVar = new defpackage.adll(str, adswVar);
        this.d.a(str, this.c, adllVar);
        this.a.p(adllVar);
    }

    @Override // defpackage.adsx
    public final void b(java.io.File file) {
        if (!file.exists()) {
            java.io.IOException iOException = new java.io.IOException("Downloaded file does not exist.");
            this.a.p(iOException);
            this.d.a(this.b, this.c, iOException);
            return;
        }
        defpackage.ajdd ajddVar = this.a;
        java.lang.String str = this.b;
        ajddVar.o(new defpackage.adio(str));
        defpackage.adkz adkzVar = this.d;
        java.io.File file2 = this.c;
        java.lang.Object obj = adkzVar.a;
        defpackage.adhw adhwVarP = ((com.google.android.libraries.micore.superpacks.common.PackManifest) obj).p();
        defpackage.adhb adhbVar = (defpackage.adhb) adhwVarP;
        java.lang.String str2 = adhbVar.a;
        defpackage.aiof aiofVar = defpackage.adhn.a;
        defpackage.adik.f(str2, str);
        adhwVarP.e(true);
        defpackage.adik.f(str2, java.lang.Long.toString(((java.io.File) adkzVar.b).length()));
        long length = file2.length();
        defpackage.adhl.a();
        java.lang.String str3 = adhbVar.b;
        defpackage.adlb adlbVar = ((defpackage.adla) adkzVar.c).h;
        adlbVar.d.P(new adky(adhwVarP, str, obj, length, 0));
    }
}
