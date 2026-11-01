package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acym implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ acym(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj2 = this.a;
                defpackage.acvs acvsVar = ((defpackage.acvu) obj2).c;
                if (acvsVar == null) {
                    acvsVar = defpackage.acvs.a;
                }
                akzx akzxVarP = acvsVar.p();
                akzxVarP.u();
                defpackage.acvs acvsVar2 = (defpackage.acvs) akzxVarP.b;
                acvsVar2.b |= 64;
                acvsVar2.i = zBooleanValue;
                defpackage.acvs acvsVar3 = (defpackage.acvs) akzxVarP.p();
                akzx akzxVarP2 = ((alad) obj2).p();
                akzxVarP2.u();
                defpackage.acvu acvuVar = (defpackage.acvu) akzxVarP2.b;
                j$.util.Objects.requireNonNull(acvsVar3);
                acvuVar.c = acvsVar3;
                acvuVar.b |= 1;
                return (defpackage.acvu) akzxVarP2.p();
            case 1:
                return this.a;
            case 2:
                return java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue() && ((java.lang.Boolean) this.a).booleanValue());
            case 3:
                return java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue() && ((java.lang.Boolean) this.a).booleanValue());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                boolean z = aczk.a;
                this.a.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aigb aigbVar = new aigb(4);
                ailj ailjVarK = ((aigf) obj).e().k();
                while (ailjVarK.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                    defpackage.acvr acvrVar = (defpackage.acvr) entry.getKey();
                    if (entry.getValue() != null) {
                        if ((acvrVar.b & 256) != 0) {
                            android.net.Uri uriBuild = (android.net.Uri) entry.getValue();
                            defpackage.amlu amluVar = acvrVar.k;
                            if (amluVar == null) {
                                amluVar = defpackage.amlu.a;
                            }
                            if (((aczk) this.a).k.B() && amluVar.b.size() != 0) {
                                uriBuild = uriBuild.buildUpon().encodedFragment(afgc.a(amluVar)).build();
                            }
                            aigbVar.i(acvrVar, uriBuild);
                        } else {
                            aigbVar.g(entry);
                        }
                    }
                }
                return aigbVar.e(false);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return aczk.f((defpackage.acvu) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ahvr.aO((java.util.List) obj, new defpackage.acym(this.a, 6));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                akzx akzxVarP3 = ((acvz) obj).p();
                akzxVarP3.u();
                acvz acvzVar = akzxVarP3.b;
                alat alatVar = acvzVar.d;
                if (!alatVar.c()) {
                    acvzVar.d = alad.J(alatVar);
                }
                akyl.i((java.lang.Iterable) this.a, acvzVar.d);
                return akzxVarP3.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return (defpackage.acwc) j$.util.DesugarCollections.unmodifiableMap(((acvz) obj).c).get(this.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                akzx akzxVarP4 = ((acvz) obj).p();
                for (defpackage.acwb acwbVar : this.a) {
                    java.lang.String str = acwbVar.c;
                    java.lang.String str2 = acwbVar.d;
                    int i = adbe.a;
                    akzxVarP4.ak(afsq.ak(acwbVar));
                }
                return akzxVarP4.p();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return this.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return (defpackage.acvu) j$.util.DesugarCollections.unmodifiableMap(((acvz) obj).b).get(this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                akzx akzxVarP5 = ((acvz) obj).p();
                akzxVarP5.ak((java.lang.String) this.a);
                return akzxVarP5.p();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                acvz acvzVar2 = (acvz) obj;
                akzx akzxVarP6 = acvzVar2.p();
                ?? r7 = this.a;
                for (java.util.Map.Entry entry2 : j$.util.DesugarCollections.unmodifiableMap(acvzVar2.b).entrySet()) {
                    java.lang.String str3 = (java.lang.String) entry2.getKey();
                    try {
                        r7.add(new defpackage.adac(afsq.ai(str3), (defpackage.acvu) entry2.getValue()));
                    } catch (adbx e) {
                        akzxVarP6.ak(str3);
                        adbe.f(e, "Failed to deserialized file group key: ".concat(java.lang.String.valueOf(str3)));
                    }
                }
                return akzxVarP6.p();
            case 15:
                return this.a;
            case 16:
                adbe.b("Failed to commit migration metadata to disk");
                new java.lang.Exception("Migration to DownloadTransform failed.", (java.io.IOException) obj);
                ((aczp) this.a).b.a();
                return java.lang.Boolean.FALSE;
            case 17:
                return (defpackage.acwg) ((aigf) obj).get(this.a);
            case 18:
                akzx akzxVarP7 = ((acwh) obj).p();
                akzxVarP7.am((java.lang.String) this.a);
                return akzxVarP7.p();
            case 19:
                acwh acwhVar = (acwh) obj;
                int i2 = adbe.a;
                akzx akzxVarP8 = acwhVar.p();
                java.lang.Object obj3 = this.a;
                for (java.lang.String str4 : j$.util.DesugarCollections.unmodifiableMap(acwhVar.b).keySet()) {
                    try {
                        defpackage.acwe acweVarAb = afsq.ab(str4, ((aczp) obj3).a, ((aczp) obj3).b);
                        j$.util.Objects.requireNonNull(str4);
                        defpackage.acwg acwgVar = (defpackage.acwg) acwhVar.b.get(str4);
                        if (acwgVar == null) {
                            acwgVar = null;
                        }
                        akzxVarP8.am(str4);
                        if (acwgVar == null) {
                            adbe.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                        } else {
                            akzxVarP8.al(afsq.ad(acweVarAb), acwgVar);
                        }
                    } catch (adbz unused) {
                        adbe.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str4);
                        ((aczp) obj3).b.a();
                        akzxVarP8.am(str4);
                    }
                }
                return akzxVarP8.p();
            default:
                adbe.b("Failed to commit migration metadata to disk");
                new java.lang.Exception("Migration to ChecksumOnly failed.", (java.io.IOException) obj);
                ((aczp) this.a).b.a();
                return java.lang.Boolean.FALSE;
        }
    }
}
