package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aave implements aafm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ aave(abce abceVar, aafe aafeVar, defpackage.zyp zypVar, int i) {
        this.$cid = i;
        this.a = abceVar;
        this.b = aafeVar;
        this.c = zypVar;
    }

    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid == 0) {
            defpackage.zyp zypVar = new defpackage.zyp((aafe) this.b, 3);
            ((aavs) obj).N((defpackage.zyp) this.c, zypVar, new defpackage.aavg((abce) this.a, (zzx) obj2, zypVar));
            return;
        }
        int i = aata.a;
        aate aateVar = new aate((zzx) obj2);
        aatf aatfVarV = ((aatg) obj).v();
        java.lang.String[] strArr = {(java.lang.String) this.a};
        android.os.Parcel parcelEP = aatfVarV.eP();
        yld.f(parcelEP, aateVar);
        parcelEP.writeString("__internal.external_ids#".concat((java.lang.String) this.b));
        parcelEP.writeInt(0);
        parcelEP.writeStringArray(strArr);
        parcelEP.writeIntArray((int[]) this.c);
        parcelEP.writeByteArray(null);
        aatfVarV.eR(2, parcelEP);
    }

    public /* synthetic */ aave(java.lang.String str, java.lang.String str2, int[] iArr, int i) {
        this.$cid = i;
        this.b = str;
        this.a = str2;
        this.c = iArr;
    }
}
