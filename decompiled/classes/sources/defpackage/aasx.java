package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aasx implements defpackage.aafm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aasx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.aafm
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            int i2 = defpackage.aata.a;
            ((defpackage.aatf) ((defpackage.aatg) obj).v()).a(new defpackage.aate((defpackage.zzx) obj2), (java.lang.String) this.a);
            return;
        }
        if (i == 1) {
            defpackage.aatf aatfVar = (defpackage.aatf) ((defpackage.aatg) obj).v();
            defpackage.aatd aatdVar = new defpackage.aatd((defpackage.aata) this.a, (defpackage.zzx) obj2, 2);
            android.os.Parcel parcelEP = aatfVar.eP();
            java.lang.ClassLoader classLoader = defpackage.yld.a;
            parcelEP.writeStrongBinder(aatdVar);
            aatfVar.eR(27, parcelEP);
            return;
        }
        if (i == 2) {
            int i3 = defpackage.aata.a;
            defpackage.aate aateVar = new defpackage.aate((defpackage.zzx) obj2);
            defpackage.aatf aatfVar2 = (defpackage.aatf) ((defpackage.aatg) obj).v();
            byte[] bArrI = ((defpackage.akym) this.a).i();
            android.os.Parcel parcelEP2 = aatfVar2.eP();
            java.lang.ClassLoader classLoader2 = defpackage.yld.a;
            parcelEP2.writeStrongBinder(aateVar);
            parcelEP2.writeByteArray(bArrI);
            aatfVar2.eR(31, parcelEP2);
            return;
        }
        if (i != 3) {
            defpackage.aavf aavfVar = new defpackage.aavf((defpackage.abce) this.a, (defpackage.zzx) obj2);
            defpackage.aavo aavoVar = (defpackage.aavo) ((defpackage.aavs) obj).v();
            android.os.Parcel parcelEP3 = aavoVar.eP();
            java.lang.ClassLoader classLoader3 = defpackage.yld.a;
            parcelEP3.writeStrongBinder(aavfVar);
            aavoVar.eR(2, parcelEP3);
            return;
        }
        defpackage.aatn aatnVar = (defpackage.aatn) obj;
        defpackage.aatm aatmVar = (defpackage.aatm) aatnVar.v();
        defpackage.aatk aatkVar = new defpackage.aatk((defpackage.abce) this.a, (defpackage.zzx) obj2);
        android.content.Context context = aatnVar.b;
        com.google.android.gms.common.api.ApiMetadata apiMetadataX = defpackage.aazc.x();
        android.os.Parcel parcelEP4 = aatmVar.eP();
        defpackage.yld.f(parcelEP4, aatkVar);
        defpackage.yld.d(parcelEP4, apiMetadataX);
        aatmVar.eS(1, parcelEP4);
    }
}
