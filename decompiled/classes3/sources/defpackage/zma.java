package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zma {
    private static final aimz a = aimz.i("com/google/android/dialershared/featureplatform/twowaymessaging/clients/DialerFeaturePlatformRequestClient");
    private final defpackage.zoe b;

    public zma(defpackage.zoe zoeVar) {
        this.b = zoeVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.zmc zmcVar, aoln aolnVar) throws aois {
        defpackage.zlz zlzVar;
        defpackage.zmb zmbVar;
        defpackage.zmj zmjVar;
        if (aolnVar instanceof defpackage.zlz) {
            zlzVar = (defpackage.zlz) aolnVar;
            int i = zlzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zlzVar.c = i - Integer.MIN_VALUE;
            } else {
                zlzVar = new defpackage.zlz(this, aolnVar);
            }
        } else {
            zlzVar = new defpackage.zlz(this, aolnVar);
        }
        java.lang.Object objD = zlzVar.a;
        defpackage.zmk zmkVar = aolu.a;
        int i2 = zlzVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            aimw aimwVarL = a.b().l("com/google/android/dialershared/featureplatform/twowaymessaging/clients/DialerFeaturePlatformRequestClient", "sendRequest", 26, "DialerFeaturePlatformRequestClient.kt");
            int i3 = zmcVar.b;
            if (i3 == 0) {
                zmbVar = defpackage.zmb.c;
            } else if (i3 != 1) {
                zmbVar = i3 != 2 ? null : defpackage.zmb.b;
            } else {
                zmbVar = defpackage.zmb.a;
            }
            aimwVarL.y("Sending request for featureDataCase: %s.", zmbVar);
            ajcq ajcqVarB = this.b.l().b(defpackage.ztw.f, zmcVar);
            zlzVar.c = 1;
            objD = aosv.D(ajcqVarB, zlzVar);
            if (objD != zmkVar) {
            }
            return zmkVar;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        defpackage.afpl afplVar = (defpackage.afpl) objD;
        java.lang.Object obj = afplVar.a;
        a.b().l("com/google/android/dialershared/featureplatform/twowaymessaging/clients/DialerFeaturePlatformRequestClient", "sendRequest", 32, "DialerFeaturePlatformRequestClient.kt").y("sentStatus: %s.", obj);
        int iOrdinal = ((defpackage.zul) obj).ordinal();
        if (iOrdinal == 0) {
            zmjVar = defpackage.zmj.b;
        } else if (iOrdinal == 1) {
            zmjVar = defpackage.zmj.c;
        } else if (iOrdinal == 2) {
            zmjVar = defpackage.zmj.d;
        } else if (iOrdinal == 3) {
            zmjVar = defpackage.zmj.e;
        } else {
            if (iOrdinal != 4) {
                throw new aois();
            }
            zmjVar = defpackage.zmj.f;
        }
        java.lang.Object obj2 = afplVar.b;
        aooh.e(obj2, "getResponseData(...)");
        zmkVar = new defpackage.zmk(zmjVar, (defpackage.zmd) aooh.q((j$.util.Optional) obj2));
        return zmkVar;
    }
}
