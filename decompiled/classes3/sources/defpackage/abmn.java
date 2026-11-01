package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abmn implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ abmn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [bfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [ccp, java.lang.Object] */
    public final java.lang.Object a() throws defpackage.aomr {
        java.lang.Object objAe;
        com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo g3AttributionInfo;
        java.lang.Object obj = null;
        try {
            switch (this.$cid) {
                case 0:
                    return new dpi(dpk.a(abts.P((ccp) this.a)));
                case 1:
                    defpackage.akxm akxmVar = (defpackage.akxm) this.a;
                    long jBj = mni.bj(((dpi) akxmVar.c.a()).a, ((dpi) akxmVar.b.a()).a);
                    dpf dpfVar = defpackage.abmj.a;
                    long jR = dfd.r(dpfVar, jBj);
                    return defpackage.agly.e(aooc.r(akxmVar.e.a(jR, dpfVar), cpp.a(jR) / 2.0f));
                case 2:
                    return new dpi(dpk.b(abts.P((ccp) this.a)));
                case 3:
                    this.a.a();
                    return java.lang.Boolean.FALSE;
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    android.widget.TextView textView = (android.widget.TextView) this.a;
                    textView.setText((java.lang.CharSequence) null);
                    textView.setAlpha(1.0f);
                    return aojh.a;
                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    return android.view.LayoutInflater.from((android.content.Context) this.a);
                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    android.content.Context context = (android.content.Context) this.a;
                    java.io.File file = new java.io.File(context.getNoBackupFilesDir(), "permissionrequestsstatedatastore/PermissionRequestsState.pb");
                    java.io.File file2 = new java.io.File(context.getFilesDir(), "permissionrequestsstatedatastore/shared/PermissionRequestsState.pb");
                    if (!file.exists() && file2.exists()) {
                        java.io.File parentFile = file.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        if (!file2.exists()) {
                            throw new defpackage.aomw(file2);
                        }
                        if (file.exists()) {
                            throw new defpackage.aomq(file2, file);
                        }
                        if (!file2.isDirectory()) {
                            java.io.File parentFile2 = file.getParentFile();
                            if (parentFile2 != null) {
                                parentFile2.mkdirs();
                            }
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file2);
                            try {
                                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                                try {
                                    aoog.d(fileInputStream, fileOutputStream);
                                    ajsz.ak(fileOutputStream, (java.lang.Throwable) null);
                                    ajsz.ak(fileInputStream, (java.lang.Throwable) null);
                                } catch (java.lang.Throwable th) {
                                    try {
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        ajsz.ak(fileOutputStream, th);
                                        throw th2;
                                    }
                                }
                            } catch (java.lang.Throwable th3) {
                                try {
                                    throw th3;
                                } catch (java.lang.Throwable th4) {
                                    ajsz.ak(fileInputStream, th3);
                                    throw th4;
                                }
                            }
                        } else if (!file.mkdirs()) {
                            throw new defpackage.aomr(file2, file, "Failed to create target directory.");
                        }
                    }
                    return file;
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    return java.lang.Float.valueOf(((java.lang.Number) ((defpackage.acrm) this.a).g.a()).floatValue());
                case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    return java.lang.Float.valueOf(((java.lang.Number) ((defpackage.acrm) this.a).h.a()).floatValue());
                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    ((defpackage.acrm) this.a).b();
                    return aojh.a;
                case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    ((defpackage.acrm) this.a).b();
                    return aojh.a;
                case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    return java.lang.Float.valueOf(((defpackage.acrk) this.a).n);
                case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    return java.lang.Float.valueOf(((defpackage.acrk) this.a).o);
                case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    aolr aolrVar = ((apbj) this.a).a;
                    cch cchVar = cci.a;
                    cci cciVar = aolrVar.get(cchVar);
                    if (cciVar == null) {
                        try {
                            aoir aoirVar = det.a;
                            objAe = (cci) dez.c().get(cchVar);
                        } catch (java.lang.Throwable th5) {
                            objAe = aooc.ae(th5);
                        }
                        cciVar = (cci) (true != (objAe instanceof aoiv) ? objAe : null);
                        break;
                    }
                    return new defpackage.acrw(cciVar, 120);
                case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    pw pwVarC = ((pw) this.a).c("g3attrinfo");
                    if (pwVarC == null) {
                        return null;
                    }
                    g3AttributionInfo = (com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo) pwVarC.f(com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo.class);
                    break;
                    break;
                case 15:
                    return ((defpackage.addc) this.a).a.a();
                case 16:
                    return ((defpackage.addc) this.a).a.b();
                case 17:
                    pw pwVarC2 = ((defpackage.addc) this.a).a.a().c("g3attrinfo");
                    if (pwVarC2 == null) {
                        return null;
                    }
                    g3AttributionInfo = (com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo) pwVarC2.f(com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo.class);
                    break;
                    break;
                case 18:
                    java.util.List list = ((defpackage.addc) this.a).c;
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new defpackage.addc((qq) it.next()));
                    }
                    return arrayList;
                case 19:
                    return defpackage.addo.h(((defpackage.addq) this.a).d);
                default:
                    return defpackage.addo.h(((defpackage.addc) this.a).b);
            }
            obj = g3AttributionInfo;
            return obj;
        } catch (qv unused) {
            return obj;
        }
    }
}
