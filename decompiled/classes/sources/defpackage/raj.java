package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class raj implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ raj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v68, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((rak) this.a).c);
            case 1:
                ((rak) this.a).c = true;
                return null;
            case 2:
                rak rakVar = (rak) this.a;
                rakVar.b = j$.util.Optional.empty();
                rakVar.c = false;
                rakVar.e.a(defpackage.ajcm.a);
                return null;
            case 3:
                this.a.run();
                return null;
            case 4:
                rce rceVar = ((rap) this.a).l;
                if ((rceVar.b & 2) == 0) {
                    return j$.util.Optional.empty();
                }
                qtr qtrVarB = qtr.b(rceVar.d);
                if (qtrVarB == null) {
                    qtrVarB = qtr.a;
                }
                return j$.util.Optional.of(qtrVarB);
            case 5:
                return ((rap) this.a).l;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return j$.util.Optional.of(((defpackage.akzx) this.a).r());
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((java.util.concurrent.atomic.AtomicBoolean) ((rcm) this.a).b).get() ? j$.util.Optional.of(qtz.c) : j$.util.Optional.empty();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Boolean.valueOf(((java.util.concurrent.atomic.AtomicBoolean) this.a).get());
            case 9:
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                defpackage.ailj it = ((defpackage.aigf) this.a).entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    j$.util.Optional optional = (j$.util.Optional) defpackage.aiql.H((java.util.concurrent.Future) entry.getValue());
                    if (optional.isPresent()) {
                        aigbVar.i((ruv) entry.getKey(), optional);
                    }
                }
                return aigbVar.e(true);
            case 10:
                return java.lang.Boolean.valueOf(((defpackage.rwi) this.a).a() != 1);
            case 11:
                return java.lang.Integer.valueOf(((defpackage.rwi) this.a).a());
            case 12:
                defpackage.rwo rwoVar = (defpackage.rwo) this.a;
                rwoVar.g();
                rwoVar.i();
                rwoVar.h();
                rwoVar.f();
                rwoVar.e();
                rwoVar.j();
                rwoVar.e.j();
                return null;
            case 13:
                defpackage.rwo rwoVar2 = (defpackage.rwo) this.a;
                rwoVar2.g();
                rwoVar2.i();
                rwoVar2.h();
                rwoVar2.f();
                rwoVar2.e();
                rwoVar2.j();
                defpackage.rwu.d(rwoVar2.b);
                rwoVar2.e.j();
                return null;
            case 14:
                java.io.File[] fileArrC = ((defpackage.soh) this.a).c();
                int length = 0;
                for (java.io.File file : fileArrC) {
                    length += (int) file.length();
                }
                java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length);
                for (java.io.File file2 : fileArrC) {
                    byte[] bArr = new byte[(int) file2.length()];
                    java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.readFully(bArr);
                        randomAccessFile.close();
                        byteBufferAllocate.put(bArr);
                    } catch (java.lang.Throwable th) {
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                return byteBufferAllocate.array();
            case 15:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.database.Cursor cursorB = ((defpackage.sqq) this.a).h.b(fh$.ExternalSyntheticApiModelOutline0.m$1(), new java.lang.String[]{"_id"}, null, null, "_id");
                try {
                    if (cursorB == null) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.sqq.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/phonelookup/cp2/Cp2ExtendedDirectoryPhoneLookupContributor", "queryCp2ForExtendedDirectoryIds", 250, "Cp2ExtendedDirectoryPhoneLookupContributor.java")).v("null cursor");
                        return arrayList;
                    }
                    if (cursorB.moveToFirst()) {
                        int columnIndexOrThrow = cursorB.getColumnIndexOrThrow("_id");
                        do {
                            long j = cursorB.getLong(columnIndexOrThrow);
                            if (fh$.ExternalSyntheticApiModelOutline0.m(j) || fh$.ExternalSyntheticApiModelOutline0.m$1(j)) {
                                arrayList.add(java.lang.Long.valueOf(cursorB.getLong(columnIndexOrThrow)));
                            }
                        } while (cursorB.moveToNext());
                    } else {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.sqq.a.b()).l("com/android/dialer/phonelookup/cp2/Cp2ExtendedDirectoryPhoneLookupContributor", "queryCp2ForExtendedDirectoryIds", 255, "Cp2ExtendedDirectoryPhoneLookupContributor.java")).v("empty cursor");
                    }
                    cursorB.close();
                    return arrayList;
                } catch (java.lang.Throwable th3) {
                    if (cursorB == null) {
                        throw th3;
                    }
                    try {
                        cursorB.close();
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            case 16:
                defpackage.aigb aigbVar2 = new defpackage.aigb(4);
                defpackage.ailj it2 = ((defpackage.aigf) this.a).keySet().iterator();
                while (it2.hasNext()) {
                    aigbVar2.i((hkd) it2.next(), spe.a);
                }
                return aigbVar2.e(true);
            case 17:
                return java.lang.Long.valueOf(((defpackage.zth) ((defpackage.ssd) this.a).a.a()).a().getLong("spamPhoneLookupLastTimestampProcessed", 0L));
            case 18:
                return new defpackage.sso((android.content.Context) this.a);
            case 19:
                defpackage.aift aiftVar = new defpackage.aift(4);
                java.util.Iterator it3 = this.a.iterator();
                while (it3.hasNext()) {
                    aiftVar.k((java.lang.Iterable) defpackage.aiql.H((defpackage.ajcq) it3.next()));
                }
                return aiftVar.g();
            default:
                try {
                    defpackage.ojo ojoVar = ((svm) this.a).g;
                    android.net.Uri uri = svj.a;
                    defpackage.aooh.e(uri, "CONTENT_URI");
                    android.os.Bundle bundleC = ojoVar.c(new ojp(uri, "get_outgoing_video_call_account", (android.os.Bundle) null));
                    if (bundleC == null || !bundleC.containsKey("outgoing_video_call_account") || (phoneAccountHandle = (android.telecom.PhoneAccountHandle) bundleC.getParcelable("outgoing_video_call_account")) == null) {
                        ((defpackage.aimw) ((defpackage.aimw) svm.a.b()).l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "getSuggestionForVideo", 249, "MotoSuggestionProvider.java")).v("no default outgoing video account");
                        return j$.util.Optional.empty();
                    }
                    ((defpackage.aimw) ((defpackage.aimw) svm.a.b()).l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "getSuggestionForVideo", 243, "MotoSuggestionProvider.java")).v("default outgoing video account acquired");
                    return j$.util.Optional.of(new alin(phoneAccountHandle, svi.d, true));
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) svm.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/preferredsim/suggestion/moto/MotoSuggestionProvider", "getSuggestionForVideo", (char) 236, "MotoSuggestionProvider.java")).v("cannot retrieve default video account");
                    return j$.util.Optional.empty();
                }
        }
    }
}
