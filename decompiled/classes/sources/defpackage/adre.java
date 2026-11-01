package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adre implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ adre(defpackage.adrg adrgVar, android.content.Context context, defpackage.ajct ajctVar, int i) {
        this.$cid = i;
        this.a = adrgVar;
        this.b = context;
        this.c = "bundled";
        this.d = ajctVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [adih, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ajct, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        if (this.$cid != 0) {
            android.os.SystemClock.elapsedRealtime();
            java.lang.Object objA = this.b.a(((defpackage.adii) this.a).c);
            defpackage.aiof aiofVar = defpackage.adhn.a;
            ((defpackage.aogc) this.d).ai(this.c);
            android.os.SystemClock.elapsedRealtime();
            return objA;
        }
        java.lang.Object obj = this.b;
        defpackage.adrg adrgVar = (defpackage.adrg) this.a;
        android.content.Context context = (android.content.Context) obj;
        adrgVar.c = context;
        adrgVar.b = (java.lang.String) this.c;
        defpackage.adgw adgwVar = new defpackage.adgw(context.getApplicationContext());
        int i = defpackage.admw.a;
        defpackage.admv admvVar = new defpackage.admv();
        admvVar.c = com.google.android.libraries.micore.superpacks.scheduling.DownloadJobService.class;
        admvVar.b = context;
        defpackage.admw admwVarA = admvVar.a();
        long j = defpackage.adna.a;
        defpackage.admz admzVar = new defpackage.admz();
        admzVar.a = adgwVar.a;
        admzVar.c = true;
        admzVar.b = admwVarA;
        if (admzVar.e == null) {
            admzVar.e = new defpackage.tvn(defpackage.adjs.b(admzVar.a));
        }
        if (admzVar.b == null) {
            defpackage.admv admvVar2 = new defpackage.admv();
            admvVar2.b = admzVar.a;
            admzVar.b = admvVar2.a();
        }
        defpackage.adna adnaVar = new defpackage.adna(admzVar);
        defpackage.ajni ajniVar = new defpackage.ajni(null, null);
        ajniVar.b = context.getAssets();
        java.lang.String str = adrgVar.b;
        if (str != null && (android.text.TextUtils.isEmpty(str) || str.startsWith("/"))) {
            throw new java.lang.IllegalArgumentException("Asset directory must be empty or start with '/'");
        }
        ?? r8 = this.d;
        ajniVar.c = str;
        ajniVar.a = r8;
        adgwVar.a(new defpackage.adkk(ajniVar));
        adgwVar.a(adnaVar);
        adgwVar.c.a(new defpackage.admd(r8));
        adgwVar.f = 1;
        adgwVar.g = 3;
        defpackage.ahct ahctVar = new defpackage.ahct(adgwVar);
        ((defpackage.adlt) ahctVar.e).e(new defpackage.adkm(r8, defpackage.adkq.a));
        adrgVar.d = ahctVar;
        ((defpackage.aimw) ((defpackage.aimw) defpackage.adrg.a.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksWrapperImpl", "initializeWithManifestDir", 118, "SuperpacksWrapperImpl.java")).v("Finished initializing SuperpacksWrapperImpl");
        return null;
    }

    public /* synthetic */ adre(defpackage.aogc aogcVar, defpackage.adih adihVar, defpackage.adii adiiVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.d = aogcVar;
        this.b = adihVar;
        this.a = adiiVar;
        this.c = obj;
    }
}
