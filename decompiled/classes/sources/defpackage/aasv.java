package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aasv implements defpackage.aafm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aasv(java.lang.String str, int i) {
        this.$cid = i;
        this.a = str;
        this.b = "";
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.aafm
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ajsy ajsyVarA;
        int i = this.$cid;
        if (i == 0) {
            int i2 = defpackage.aata.a;
            defpackage.aate aateVar = new defpackage.aate((defpackage.zzx) obj2);
            ((defpackage.aatf) ((defpackage.aatg) obj).v()).a(aateVar, "CURRENT:" + ((java.lang.String) this.b) + ':' + ((java.lang.String) this.a));
            return;
        }
        if (i == 1) {
            defpackage.aapn aapnVar = (defpackage.aapn) obj;
            defpackage.zzx zzxVar = (defpackage.zzx) obj2;
            defpackage.aapk aapkVar = new defpackage.aapk((defpackage.abce) this.a, zzxVar);
            ?? r6 = this.b;
            try {
                defpackage.aaph aaphVar = (defpackage.aaph) aapnVar.v();
                android.content.Context context = aapnVar.b;
                com.google.android.gms.common.api.ApiMetadata apiMetadataX = defpackage.aazc.x();
                android.os.Parcel parcelEP = aaphVar.eP();
                defpackage.yld.f(parcelEP, aapkVar);
                defpackage.yld.d(parcelEP, r6);
                defpackage.yld.d(parcelEP, apiMetadataX);
                aaphVar.eR(1, parcelEP);
                return;
            } catch (android.os.RemoteException unused) {
                defpackage.aais.ax(com.google.android.gms.common.api.Status.c, null, zzxVar);
                return;
            }
        }
        defpackage.aatg aatgVar = (defpackage.aatg) obj;
        defpackage.aate aateVar2 = new defpackage.aate((defpackage.zzx) obj2);
        android.content.Context context2 = ((defpackage.aada) this.a).b;
        defpackage.afab afabVar = new defpackage.afab(context2.getPackageManager());
        java.lang.Object obj3 = this.b;
        java.lang.String packageName = context2.getPackageName();
        try {
            defpackage.ajmo ajmoVar = (defpackage.ajmo) ((defpackage.aigf) afabVar.a(packageName).b.eZ()).getOrDefault(defpackage.afab.c((java.lang.String) obj3), null);
            ajsyVarA = ajmoVar != null ? ajmoVar.a() : null;
        } catch (java.lang.Exception unused2) {
            android.util.Log.i("PhenotypeResourceReader", "Error reading phenotype registration from ".concat(java.lang.String.valueOf(packageName)));
        }
        if (ajsyVarA == null) {
            aateVar2.a(new com.google.android.gms.common.api.Status(29503, null, null, null), null);
            return;
        }
        defpackage.aatf aatfVar = (defpackage.aatf) aatgVar.v();
        int iIntValue = ajsyVarA.c == 2 ? ((java.lang.Integer) ajsyVarA.d).intValue() : 0;
        java.lang.String[] strArr = (java.lang.String[]) ajsyVarA.i.toArray(new java.lang.String[0]);
        byte[] bArrD = ajsyVarA.k.D();
        android.os.Parcel parcelEP2 = aatfVar.eP();
        java.lang.ClassLoader classLoader = defpackage.yld.a;
        parcelEP2.writeStrongBinder(aateVar2);
        parcelEP2.writeString((java.lang.String) obj3);
        parcelEP2.writeInt(iIntValue);
        parcelEP2.writeStringArray(strArr);
        parcelEP2.writeByteArray(bArrD);
        parcelEP2.writeString("");
        parcelEP2.writeString(null);
        aatfVar.eR(13, parcelEP2);
    }

    public /* synthetic */ aasv(defpackage.aada aadaVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = aadaVar;
        this.b = obj;
    }
}
