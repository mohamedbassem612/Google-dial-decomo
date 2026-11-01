package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ztn {
    private static final aimz a = aimz.i("com/google/android/dialershared/wearabledatalayer/dataclient/datasync/impl/DialerDataSyncImpl");
    private final defpackage.aavx b;

    public ztn(defpackage.aavx aavxVar) {
        this.b = aavxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aaum aaumVar, aoln aolnVar) {
        defpackage.ztl ztlVar;
        if (aolnVar instanceof defpackage.ztl) {
            ztlVar = (defpackage.ztl) aolnVar;
            int i = ztlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ztlVar.c = i - Integer.MIN_VALUE;
            } else {
                ztlVar = new defpackage.ztl(this, aolnVar);
            }
        } else {
            ztlVar = new defpackage.ztl(this, aolnVar);
        }
        java.lang.Object objY = ztlVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ztlVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objY);
                ztlVar.c = 1;
                objY = aooh.Y(aaumVar, ztlVar);
                if (objY == aoluVar) {
                    objY = aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objY);
            }
            return objY;
        } catch (aacw e) {
            return aooc.ae(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final java.lang.Object b(defpackage.ztk ztkVar, java.lang.String str, java.util.List list, aoln aolnVar) {
        defpackage.ztm ztmVar;
        java.lang.String str2;
        defpackage.ztk ztkVar2 = ztkVar;
        if (aolnVar instanceof defpackage.ztm) {
            ztmVar = (defpackage.ztm) aolnVar;
            int i = ztmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ztmVar.c = i - Integer.MIN_VALUE;
            } else {
                ztmVar = new defpackage.ztm(this, aolnVar);
            }
        } else {
            ztmVar = new defpackage.ztm(this, aolnVar);
        }
        java.lang.Object obj = ztmVar.a;
        java.lang.Object obj2 = aolu.a;
        int i2 = ztmVar.c;
        int i3 = 1;
        if (i2 == 0) {
            aooc.af(obj);
            java.lang.String str3 = ztkVar2.b;
            if (str3 == null) {
                throw new java.lang.IllegalArgumentException("path must not be null");
            }
            android.os.Parcelable.Creator creator = com.google.android.gms.wearable.PutDataRequest.CREATOR;
            if (android.text.TextUtils.isEmpty(str3)) {
                throw new java.lang.IllegalArgumentException("An empty path was supplied.");
            }
            if (!str3.startsWith("/")) {
                throw new java.lang.IllegalArgumentException("A path must start with a single / .");
            }
            if (str3.startsWith("//")) {
                throw new java.lang.IllegalArgumentException("A path must start with a single / .");
            }
            com.google.android.gms.wearable.PutDataRequest putDataRequestA = com.google.android.gms.wearable.PutDataRequest.a(new android.net.Uri.Builder().scheme("wear").path(str3).build());
            defpackage.aawb aawbVar = new defpackage.aawb();
            aawbVar.a.put(str, ajsz.cn(list));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            akzx akzxVarM = defpackage.aayi.a.m();
            java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet(aawbVar.c());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str4 : treeSet) {
                java.lang.Object objB = aawbVar.b(str4);
                akzx akzxVarM2 = defpackage.aayh.a.m();
                akzxVarM2.u();
                int i4 = i3;
                defpackage.aayh aayhVar = (defpackage.aayh) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                aayhVar.b |= 1;
                aayhVar.c = str4;
                defpackage.aayg aaygVarC = aaoo.C(arrayList, objB);
                akzxVarM2.u();
                defpackage.aayh aayhVar2 = (defpackage.aayh) akzxVarM2.b;
                j$.util.Objects.requireNonNull(aaygVarC);
                aayhVar2.d = aaygVarC;
                aayhVar2.b |= 2;
                arrayList2.add((defpackage.aayh) akzxVarM2.p());
                i3 = i4;
            }
            int i5 = i3;
            akzxVarM.u();
            defpackage.aayi aayiVar = (defpackage.aayi) akzxVarM.b;
            alat alatVar = aayiVar.b;
            if (!alatVar.c()) {
                aayiVar.b = alad.J(alatVar);
            }
            akyl.i(arrayList2, aayiVar.b);
            putDataRequestA.c = ((defpackage.aayi) akzxVarM.p()).i();
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                java.lang.String string = java.lang.Integer.toString(i6);
                com.google.android.gms.wearable.Asset asset = (com.google.android.gms.wearable.Asset) arrayList.get(i6);
                if (string == null) {
                    throw new java.lang.IllegalStateException("asset key cannot be null: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(asset))));
                }
                if (asset == null) {
                    throw new java.lang.IllegalStateException("asset cannot be null: key=".concat(string));
                }
                if (android.util.Log.isLoggable("DataMap", 3)) {
                    android.util.Log.d("DataMap", "asPutDataRequest: adding asset: " + string + ' ' + asset.toString());
                }
                putDataRequestA.c(string, asset);
            }
            defpackage.aavx aavxVar = this.b;
            aade aadeVar = ((aada) aavxVar).i;
            defpackage.aaxb aaxbVar = new defpackage.aaxb((aaoo) aavxVar.a, aadeVar, putDataRequestA);
            aadeVar.b(aaxbVar);
            aaum aaumVarA = aahm.a(aaxbVar, new defpackage.aawq(2));
            ztmVar.d = ztkVar2;
            ztmVar.e = str;
            ztmVar.c = i5;
            java.lang.Object objA = a(aaumVarA, ztmVar);
            if (objA != obj2) {
                obj2 = objA;
                str2 = str;
            }
            return obj2;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = ztmVar.e;
        ztkVar2 = ztmVar.d;
        aooc.af(obj);
        obj2 = ((aoiw) obj).a;
        if (aoiw.d(obj2)) {
            a.b().l("com/google/android/dialershared/wearabledatalayer/dataclient/datasync/impl/DialerDataSyncImpl", "putLongList$<anonymous>", 42, "DialerDataSyncImpl.kt").I("Successfully published data for featureKey: %s, dataKey: %s", ztkVar2.b, str2);
        }
        aacw aacwVarC = aoiw.c(obj2);
        if (aacwVarC != null) {
            if ((aacwVarC instanceof aacw) && aacwVarC.a() == 17) {
                a.b().l("com/google/android/dialershared/wearabledatalayer/dataclient/datasync/impl/DialerDataSyncImpl", "putLongList$<anonymous>", 54, "DialerDataSyncImpl.kt").I("Unable to publish data for featureKey: %s, dataKey: %s. API is unavailable.", ztkVar2.b, str2);
            } else {
                a.b().k(aacwVarC).l("com/google/android/dialershared/wearabledatalayer/dataclient/datasync/impl/DialerDataSyncImpl", "putLongList$<anonymous>", 63, "DialerDataSyncImpl.kt").I("Unable to publish data for featureKey: %s, dataKey: %s.", ztkVar2.b, str2);
            }
        }
        return obj2;
    }
}
