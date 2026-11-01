package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acxr implements dsf {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ acxr(defpackage.abtr abtrVar, defpackage.acxo acxoVar, java.io.File file, java.lang.String str, adtk adtkVar, int i) {
        this.$cid = i;
        this.a = abtrVar;
        this.b = acxoVar;
        this.c = file;
        this.d = str;
        this.e = adtkVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yml] */
    /* JADX WARN: Type inference failed for: r8v0, types: [adtk, java.lang.Object] */
    public final java.lang.Object a(dsd dsdVar) {
        if (this.$cid == 0) {
            defpackage.acxp acxpVar = new defpackage.acxp(dsdVar);
            java.lang.Object obj = this.c;
            java.lang.Object obj2 = this.d;
            ?? r8 = this.e;
            java.lang.Object obj3 = this.a;
            java.lang.Object obj4 = ((defpackage.abtr) obj3).f;
            defpackage.acxo acxoVar = (defpackage.acxo) this.b;
            java.lang.String str = acxoVar.b;
            adsz adszVar = new adsz((adth) obj4, str, (java.io.File) obj, (java.lang.String) obj2, acxpVar, (adtk) r8);
            adszVar.k = null;
            if (defpackage.acxm.c == acxoVar.c) {
                adszVar.g(adsy.b);
            } else {
                adszVar.g(adsy.a);
            }
            int i = acxoVar.d;
            if (i > 0) {
                adszVar.j = i;
            }
            aike aikeVar = acxoVar.e;
            for (int i2 = 0; i2 < aikeVar.d; i2++) {
                android.util.Pair pair = (android.util.Pair) aikeVar.get(i2);
                adszVar.f.t((java.lang.String) pair.first, (java.lang.String) pair.second);
            }
            dsdVar.a(new defpackage.acxq(obj3, obj, obj2, 0), ajbm.a);
            boolean zE = adszVar.e();
            int i3 = adbe.a;
            if (!zE) {
                yg ygVarB = acvh.b();
                ygVarB.b = defpackage.acvg.DUPLICATE_REQUEST_ERROR;
                ygVarB.d = "Duplicate request for: ".concat(java.lang.String.valueOf(str));
                dsdVar.d(ygVarB.d());
            }
            return "Data download scheduled for file ".concat(java.lang.String.valueOf(str));
        }
        java.lang.Object obj5 = this.c;
        java.lang.Object obj6 = this.b;
        java.lang.Object obj7 = this.a;
        ?? r4 = this.e;
        java.lang.Object obj8 = this.d;
        try {
            defpackage.ylf ylfVar = ((defpackage.ymc) obj6).a;
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelableA = ((defpackage.ymk) obj7).a();
            defpackage.ypc ypcVar = new defpackage.ypc(new defpackage.ynf((defpackage.ymk) obj7, r4, ((defpackage.yna) obj5).e, dsdVar), new defpackage.ajxi((defpackage.yna) obj5, (defpackage.ymk) obj7, (defpackage.ync) obj8), ((defpackage.yna) obj5).g);
            android.os.Parcel parcelEP = ylfVar.eP();
            yld.d(parcelEP, abstractSafeParcelableA);
            yld.f(parcelEP, ypcVar);
            android.os.Parcel parcelEQ = ylfVar.eQ(12, parcelEP);
            parcelEQ.readInt();
            parcelEQ.recycle();
            return "requestDownloadableFeatureFuture";
        } catch (android.os.RemoteException e) {
            defpackage.ymk ymkVar = (defpackage.ymk) obj7;
            java.lang.String str2 = ymkVar.a;
            android.util.Log.e(defpackage.yna.a, "AiCore service failed to download feature ".concat(str2), e);
            ((defpackage.yna) obj5).o(10, ymkVar.e, (defpackage.ync) obj8, 5, e.hashCode());
            dsdVar.d(new defpackage.ymi(1, 6, "AICore service failed to download feature ".concat(str2), e));
            return "requestDownloadableFeatureFuture";
        } catch (java.lang.RuntimeException e2) {
            defpackage.ymk ymkVar2 = (defpackage.ymk) obj7;
            java.lang.String str3 = ymkVar2.a;
            android.util.Log.e(defpackage.yna.a, "AiCore service failed to download feature due to runtime error ".concat(str3), e2);
            ((defpackage.yna) obj5).o(10, ymkVar2.e, (defpackage.ync) obj8, 5, e2.hashCode());
            dsdVar.d(new defpackage.ymi(1, 0, "AICore service failed to download feature due to runtime error ".concat(str3), e2));
            return "requestDownloadableFeatureFuture";
        }
    }

    public /* synthetic */ acxr(defpackage.yna ynaVar, defpackage.ymc ymcVar, defpackage.ymk ymkVar, defpackage.yml ymlVar, defpackage.ync yncVar, int i) {
        this.$cid = i;
        this.c = ynaVar;
        this.b = ymcVar;
        this.a = ymkVar;
        this.e = ymlVar;
        this.d = yncVar;
    }
}
