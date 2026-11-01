package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaxb extends defpackage.aawn {
    final /* synthetic */ com.google.android.gms.wearable.PutDataRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaxb(aaoo aaooVar, aade aadeVar, com.google.android.gms.wearable.PutDataRequest putDataRequest) {
        super(aadeVar);
        this.a = putDataRequest;
        j$.util.Objects.requireNonNull(aaooVar);
    }

    public final /* synthetic */ aadl a(com.google.android.gms.common.api.Status status) {
        return new defpackage.aaxc(status, null, 0);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01f2  */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.os.Parcelable, com.google.android.gms.wearable.PutDataRequest] */
    protected final /* bridge */ /* synthetic */ void b(aacr aacrVar) throws java.lang.Throwable {
        java.io.File fileCreateTempFile;
        java.io.FileOutputStream fileOutputStream;
        com.google.android.gms.wearable.PutDataRequest putDataRequest = this.a;
        defpackage.aayc aaycVar = (defpackage.aayc) aacrVar;
        java.util.Iterator it = putDataRequest.b().entrySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.wearable.Asset asset = (com.google.android.gms.wearable.Asset) ((java.util.Map.Entry) it.next()).getValue();
            if (asset.a == null && asset.b == null && asset.c == null && asset.d == null) {
                throw new java.lang.IllegalArgumentException("Put for " + java.lang.String.valueOf(putDataRequest.a) + " contains invalid asset: " + java.lang.String.valueOf(asset));
            }
        }
        ?? A = com.google.android.gms.wearable.PutDataRequest.a(putDataRequest.a);
        A.c = putDataRequest.c;
        if (putDataRequest.d == 0) {
            A.d = 0L;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : putDataRequest.b().entrySet()) {
            com.google.android.gms.wearable.Asset asset2 = (com.google.android.gms.wearable.Asset) entry.getValue();
            byte[] bArr = asset2.a;
            if (bArr != null) {
                try {
                    android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
                    if (android.util.Log.isLoggable("WearableClient", 3)) {
                        android.util.Log.d("WearableClient", "processAssets: replacing data with FD in asset: " + java.lang.String.valueOf(asset2) + " read:" + java.lang.String.valueOf(parcelFileDescriptorArrCreatePipe[0]) + " write:" + java.lang.String.valueOf(parcelFileDescriptorArrCreatePipe[1]));
                    }
                    A.c((java.lang.String) entry.getKey(), com.google.android.gms.wearable.Asset.a(parcelFileDescriptorArrCreatePipe[0]));
                    java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new defpackage.aayb(aaycVar, parcelFileDescriptorArrCreatePipe[1], bArr, 0));
                    arrayList.add(futureTask);
                    aaycVar.a.submit(futureTask);
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException("Unable to create ParcelFileDescriptor for asset in request: ".concat(putDataRequest.toString()), e);
                }
            } else {
                android.net.Uri uri = asset2.d;
                java.io.File file = null;
                if (uri != null) {
                    try {
                        A.c((java.lang.String) entry.getKey(), com.google.android.gms.wearable.Asset.a(((aagf) aaycVar).b.getContentResolver().openFileDescriptor(uri, "r")));
                    } catch (java.io.FileNotFoundException unused) {
                        new defpackage.aaxy(this, arrayList).f(new com.google.android.gms.wearable.internal.PutDataResponse(4005, null));
                        android.util.Log.w("WearableClient", "Couldn't resolve asset URI: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(asset2.d))));
                        return;
                    }
                } else {
                    android.os.ParcelFileDescriptor parcelFileDescriptor = asset2.c;
                    if (parcelFileDescriptor != null) {
                        try {
                            java.io.File file2 = (java.io.File) aaycVar.v.eZ();
                            android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                            try {
                                file2.mkdirs();
                                fileCreateTempFile = java.io.File.createTempFile("asset", ".tmp", file2);
                                try {
                                    fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                                    try {
                                        try {
                                            byte[] bArr2 = new byte[10240];
                                            while (true) {
                                                int i = autoCloseInputStream.read(bArr2);
                                                if (i < 0) {
                                                    break;
                                                } else {
                                                    fileOutputStream.write(bArr2, 0, i);
                                                }
                                                th = th;
                                                aaoo.D(autoCloseInputStream);
                                                aaoo.D(fileOutputStream);
                                                fileCreateTempFile.delete();
                                                throw th;
                                            }
                                            aaoo.D(autoCloseInputStream);
                                            aaoo.D(fileOutputStream);
                                            aaoo.D(autoCloseInputStream);
                                            try {
                                                try {
                                                    A.c((java.lang.String) entry.getKey(), com.google.android.gms.wearable.Asset.a(android.os.ParcelFileDescriptor.open(fileCreateTempFile, 268435456)));
                                                    if (fileCreateTempFile != null) {
                                                        fileCreateTempFile.delete();
                                                    }
                                                } catch (java.io.IOException e2) {
                                                    e = e2;
                                                    android.util.Log.w("WearableClient", "DataItem asset copy failed", e);
                                                    new defpackage.aaxy(this, arrayList).f(new com.google.android.gms.wearable.internal.PutDataResponse(4005, null));
                                                    android.util.Log.w("WearableClient", a.bH(asset2.c, "Couldn't asset from a file descriptor: "));
                                                    if (fileCreateTempFile != null) {
                                                        fileCreateTempFile.delete();
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                                file = fileCreateTempFile;
                                                if (file != null) {
                                                    file.delete();
                                                }
                                                throw th;
                                            }
                                        } catch (java.io.IOException e3) {
                                            e = e3;
                                            throw new java.lang.RuntimeException(e);
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        aaoo.D(autoCloseInputStream);
                                        aaoo.D(fileOutputStream);
                                        fileCreateTempFile.delete();
                                        throw th;
                                    }
                                } catch (java.io.IOException e4) {
                                    e = e4;
                                    fileOutputStream = null;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                    aaoo.D(autoCloseInputStream);
                                    aaoo.D(fileOutputStream);
                                    fileCreateTempFile.delete();
                                    throw th;
                                }
                            } catch (java.lang.Throwable th4) {
                                aaoo.D(autoCloseInputStream);
                                throw th4;
                            }
                        } catch (java.io.IOException e5) {
                            e = e5;
                            fileCreateTempFile = null;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            if (file != null) {
                                file.delete();
                            }
                            throw th;
                        }
                    } else {
                        A.c((java.lang.String) entry.getKey(), asset2);
                    }
                }
            }
        }
        defpackage.aaxn aaxnVar = (defpackage.aaxn) aaycVar.v();
        defpackage.aaxy aaxyVar = new defpackage.aaxy(this, arrayList);
        android.os.Parcel parcelEP = aaxnVar.eP();
        yld.f(parcelEP, aaxyVar);
        yld.d(parcelEP, (android.os.Parcelable) A);
        aaxnVar.eR(6, parcelEP);
    }
}
