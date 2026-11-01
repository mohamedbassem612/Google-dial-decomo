package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aast implements defpackage.aafm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ aast(defpackage.aata aataVar, java.lang.String str, defpackage.aafe aafeVar, int i) {
        this.$cid = i;
        this.b = aataVar;
        this.a = str;
        this.c = aafeVar;
    }

    @Override // defpackage.aafm
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aatf aatfVar = (defpackage.aatf) ((defpackage.aatg) obj).v();
            defpackage.aatd aatdVar = new defpackage.aatd((defpackage.aata) this.b, (defpackage.aafe) this.c, 0);
            android.os.Parcel parcelEP = aatfVar.eP();
            parcelEP.writeString(this.a);
            java.lang.ClassLoader classLoader = defpackage.yld.a;
            parcelEP.writeStrongBinder(aatdVar);
            aatfVar.eR(28, parcelEP);
            return;
        }
        if (i != 1) {
            defpackage.aasz aaszVar = new defpackage.aasz((defpackage.aata) this.c, (defpackage.zzx) obj2);
            defpackage.aatf aatfVar2 = (defpackage.aatf) ((defpackage.aatg) obj).v();
            byte[] bArrI = ((defpackage.akym) this.b).i();
            android.os.Parcel parcelEP2 = aatfVar2.eP();
            defpackage.yld.f(parcelEP2, aaszVar);
            parcelEP2.writeString(this.a);
            parcelEP2.writeByteArray(bArrI);
            aatfVar2.eR(25, parcelEP2);
            return;
        }
        int i2 = defpackage.aata.a;
        defpackage.aate aateVar = new defpackage.aate((defpackage.zzx) obj2);
        defpackage.aatf aatfVar3 = (defpackage.aatf) ((defpackage.aatg) obj).v();
        android.os.Parcel parcelEP3 = aatfVar3.eP();
        java.lang.ClassLoader classLoader2 = defpackage.yld.a;
        parcelEP3.writeStrongBinder(aateVar);
        parcelEP3.writeString((java.lang.String) this.c);
        parcelEP3.writeString((java.lang.String) this.b);
        parcelEP3.writeString(this.a);
        aatfVar3.eR(11, parcelEP3);
    }

    public /* synthetic */ aast(defpackage.aata aataVar, java.lang.String str, defpackage.ajsx ajsxVar, int i) {
        this.$cid = i;
        this.c = aataVar;
        this.a = str;
        this.b = ajsxVar;
    }

    public /* synthetic */ aast(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.$cid = i;
        this.c = str;
        this.b = str2;
        this.a = str3;
    }
}
