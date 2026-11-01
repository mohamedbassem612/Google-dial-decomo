package com.google.android.libraries.mdi.search.g3appsearch.app;

/* JADX INFO: renamed from: com.google.android.libraries.mdi.search.g3appsearch.app.$$__AppSearch__G3AttributionInfo, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class C$$__AppSearch__G3AttributionInfo implements pr {
    public final pq a() {
        pi piVar = new pi("G3AttributionInfo");
        akbx akbxVar = new akbx("ptoken");
        akbxVar.l(2);
        piVar.c(akbxVar.m());
        po poVar = new po("normal");
        poVar.b(2);
        poVar.e(2);
        poVar.c(1);
        poVar.d(0);
        piVar.c(poVar.a());
        po poVar2 = new po("tokenid");
        poVar2.b(2);
        poVar2.e(2);
        poVar2.c(1);
        poVar2.d(0);
        piVar.c(poVar2.a());
        return piVar.a();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object b(pw pwVar) {
        pwVar.g();
        pwVar.h();
        byte[][] bArr = (byte[][]) pw.e("ptoken", pwVar.d("ptoken"), byte[][].class);
        if (bArr != null && bArr.length != 0) {
            byte[] bArr2 = bArr[0];
        }
        java.lang.String[] strArrP = pwVar.p("normal");
        java.lang.String str = null;
        java.lang.String str2 = (strArrP == null || strArrP.length == 0) ? null : strArrP[0];
        java.lang.String[] strArrP2 = pwVar.p("tokenid");
        if (strArrP2 != null && strArrP2.length != 0) {
            str = strArrP2[0];
        }
        return new com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo(str2, str);
    }
}
