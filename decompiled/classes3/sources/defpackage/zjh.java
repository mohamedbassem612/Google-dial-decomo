package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zjh {
    private static final aimz a = aimz.i("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder");
    private final zzx b;

    public zjh(zzx zzxVar) {
        this.b = zzxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final java.lang.Object a(defpackage.zti ztiVar, aoln aolnVar) {
        defpackage.zjg zjgVar;
        defpackage.zjd zjdVar;
        defpackage.zjc zjcVar;
        defpackage.zjc zjcVar2;
        byte[] bArr;
        aimz aimzVar;
        defpackage.zti ztiVar2 = ztiVar;
        if (aolnVar instanceof defpackage.zjg) {
            zjgVar = (defpackage.zjg) aolnVar;
            int i = zjgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zjgVar.c = i - Integer.MIN_VALUE;
            } else {
                zjgVar = new defpackage.zjg(this, aolnVar);
            }
        } else {
            zjgVar = new defpackage.zjg(this, aolnVar);
        }
        java.lang.Object objA = zjgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = zjgVar.c;
        int i3 = 3;
        try {
            if (i2 == 0) {
                aooc.af(objA);
                try {
                    java.io.InputStream inputStream = ztiVar2.a;
                    try {
                        zjdVar = (defpackage.zjd) alad.y(defpackage.zjd.a, aisk.b(inputStream));
                        ajsz.ak(inputStream, (java.lang.Throwable) null);
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            ajsz.ak(inputStream, th);
                            throw th2;
                        }
                    }
                } catch (alaz e) {
                    a.d().k(e).l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "getDataSyncRequest", 99, "DialerDataSyncRequestResponder.kt").v("Metadata from stream not found; streaming will not be performed through Dialer Data Sync.");
                    zjdVar = null;
                } catch (java.io.IOException e2) {
                    if (e2 instanceof defpackage.aavv) {
                        defpackage.aavv aavvVar = (defpackage.aavv) e2;
                        int i4 = aavvVar.a;
                        if (i4 == 1) {
                            a.d().k(e2).l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "getDataSyncRequest", 112, "DialerDataSyncRequestResponder.kt").z("Failed to read metadata from stream (closeReason=%d, appSpecificErrorCode=%d); streaming will not be performed through Dialer Data Sync.", i4, aavvVar.b);
                        } else if (i4 == 3) {
                            i4 = 3;
                            a.d().k(e2).l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "getDataSyncRequest", 112, "DialerDataSyncRequestResponder.kt").z("Failed to read metadata from stream (closeReason=%d, appSpecificErrorCode=%d); streaming will not be performed through Dialer Data Sync.", i4, aavvVar.b);
                        } else {
                            defpackage.aavv aavvVar2 = (defpackage.aavv) e2;
                            a.b().l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "getDataSyncRequest", 120, "DialerDataSyncRequestResponder.kt").M("Failed to read metadata from stream (closeReason=%d, appSpecificErrorCode=%d): %s; streaming will not be performed through Dialer Data Sync.", java.lang.Integer.valueOf(aavvVar2.a), java.lang.Integer.valueOf(aavvVar2.b), e2.getMessage());
                        }
                    } else {
                        a.b().l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "getDataSyncRequest", 129, "DialerDataSyncRequestResponder.kt").y("Failed to read metadata from stream (%s); streaming will not be performed through Dialer Data Sync.", e2.getMessage());
                    }
                    zjdVar = null;
                }
                if (zjdVar != null) {
                    int i5 = zjdVar.d;
                    if (i5 == 0) {
                        zjcVar = defpackage.zjc.UNSPECIFIED;
                    } else if (i5 != 1) {
                        zjcVar = i5 != 2 ? null : defpackage.zjc.CALL_BACKGROUND;
                    } else {
                        zjcVar = defpackage.zjc.BEESLY_AUDIO_RECORDING;
                    }
                    if (zjcVar == null) {
                        zjcVar = defpackage.zjc.UNRECOGNIZED;
                    }
                    defpackage.zjf zjfVar = (defpackage.zjf) wsc.D(this.b, zjcVar);
                    if (zjfVar == null) {
                        a.b().l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "onCrossSurfaceStreamCreated", 35, "DialerDataSyncRequestResponder.kt").y("Data sync unavailable as provider not found for: %s", zjcVar);
                        return aojh.a;
                    }
                    zjgVar.d = ztiVar2;
                    zjgVar.e = zjcVar;
                    zjgVar.c = 1;
                    objA = zjfVar.a(zjdVar, zjgVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    zjcVar2 = zjcVar;
                }
                return aojh.a;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.zjc zjcVar3 = zjgVar.e;
            ztiVar2 = zjgVar.d;
            aooc.af(objA);
            zjcVar2 = zjcVar3;
            java.io.OutputStream outputStream = ztiVar2.b;
            if (bArr != null) {
                try {
                    aimzVar.b().l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "onCrossSurfaceStreamCreated$<anonymous>", 44, "DialerDataSyncRequestResponder.kt").v("Data starting to write to remote surface.");
                    outputStream.write(bArr);
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        ajsz.ak(outputStream, th3);
                        throw th4;
                    }
                }
            }
            ajsz.ak(outputStream, (java.lang.Throwable) null);
            aimzVar.b().l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "onCrossSurfaceStreamCreated", 48, "DialerDataSyncRequestResponder.kt").v("Data finished writing to remote surface.");
        } catch (java.io.IOException e3) {
            int length = bArr != null ? bArr.length : 0;
            if (e3 instanceof defpackage.aavv) {
                defpackage.aavv aavvVar3 = (defpackage.aavv) e3;
                int i6 = aavvVar3.a;
                if (i6 == 1) {
                    i3 = i6;
                } else if (i6 != 3) {
                    defpackage.aavv aavvVar4 = (defpackage.aavv) e3;
                    a.b().l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "onCrossSurfaceStreamCreated", 68, "DialerDataSyncRequestResponder.kt").O("Failed to stream data to remote surface (dataSyncType=%s, dataSize=%d, closeReason=%d, appSpecificErrorCode=%d): %s", zjcVar2, new java.lang.Integer(length), new java.lang.Integer(aavvVar4.a), new java.lang.Integer(aavvVar4.b), e3.getMessage());
                }
                a.d().k(e3).l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "onCrossSurfaceStreamCreated", 58, "DialerDataSyncRequestResponder.kt").N("Failed to stream data to remote surface (dataSyncType=%s, dataSize=%d, closeReason=%d, appSpecificErrorCode=%d)", zjcVar2, new java.lang.Integer(length), new java.lang.Integer(i3), new java.lang.Integer(aavvVar3.b));
            } else {
                a.b().l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "onCrossSurfaceStreamCreated", 79, "DialerDataSyncRequestResponder.kt").M("Failed to stream data to remote surface (dataSyncType=%s, dataSize=%d): %s", zjcVar2, new java.lang.Integer(length), e3.getMessage());
            }
        }
        bArr = (byte[]) objA;
        aimzVar = a;
        aimzVar.b().l("com/google/android/dialershared/datasync/dataprovider/impl/DialerDataSyncRequestResponder", "onCrossSurfaceStreamCreated", 40, "DialerDataSyncRequestResponder.kt").y("isDataProvidedToBeSynced: %b", java.lang.Boolean.valueOf(bArr != null));
        return aojh.a;
    }
}
