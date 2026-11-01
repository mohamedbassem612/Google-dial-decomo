package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aaxq implements aafm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ defpackage.aawd d;

    public /* synthetic */ aaxq(defpackage.aawd aawdVar, java.lang.String str, java.lang.String str2, byte[] bArr, int i) {
        this.$cid = i;
        this.d = aawdVar;
        this.a = str;
        this.b = str2;
        this.c = bArr;
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            defpackage.aayc aaycVar = (defpackage.aayc) obj;
            byte[] bArr = this.c;
            java.lang.String str = this.b;
            java.lang.String str2 = this.a;
            try {
                defpackage.aaxr aaxrVar = new defpackage.aaxr(this.d, (zzx) obj2, 0);
                defpackage.aaxn aaxnVar = (defpackage.aaxn) aaycVar.v();
                defpackage.aaxz aaxzVar = new defpackage.aaxz(aaxrVar);
                android.os.Parcel parcelEP = aaxnVar.eP();
                yld.f(parcelEP, aaxzVar);
                parcelEP.writeString(str2);
                parcelEP.writeString(str);
                parcelEP.writeByteArray(bArr);
                aaxnVar.eR(12, parcelEP);
                return;
            } catch (android.os.RemoteException e) {
                ((zzx) obj2).h(e);
                return;
            }
        }
        defpackage.aayc aaycVar2 = (defpackage.aayc) obj;
        byte[] bArr2 = this.c;
        java.lang.String str3 = this.b;
        java.lang.String str4 = this.a;
        try {
            defpackage.aaxr aaxrVar2 = new defpackage.aaxr(this.d, (zzx) obj2, 2, (byte[]) null);
            defpackage.aaxn aaxnVar2 = (defpackage.aaxn) aaycVar2.v();
            defpackage.aaya aayaVar = new defpackage.aaya(aaxrVar2);
            android.os.Parcel parcelEP2 = aaxnVar2.eP();
            yld.f(parcelEP2, aayaVar);
            parcelEP2.writeString(str4);
            parcelEP2.writeString(str3);
            parcelEP2.writeByteArray(bArr2);
            aaxnVar2.eR(58, parcelEP2);
        } catch (android.os.RemoteException e2) {
            ((zzx) obj2).h(e2);
        }
    }
}
