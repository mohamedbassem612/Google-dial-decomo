package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jht extends aomh implements aonn {
    int a;
    final /* synthetic */ zjd b;
    final /* synthetic */ defpackage.jhu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jht(zjd zjdVar, defpackage.jhu jhuVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = zjdVar;
        this.c = jhuVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ea A[Catch: CodecException -> 0x00f7, TRY_ENTER, TryCatch #3 {CodecException -> 0x00f7, blocks: (B:8:0x001d, B:37:0x00f4, B:35:0x00ea), top: B:60:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.itc itcVar;
        java.lang.String str;
        java.lang.String str2;
        defpackage.jhu jhuVar;
        defpackage.idv idvVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        try {
            if (i == 0) {
                aooc.af(obj);
                zjb zjbVar = this.b.c;
                if (zjbVar == null) {
                    zjbVar = zjb.a;
                }
                long j = zjbVar.c;
                defpackage.jhu.a.b().l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 47, "BeeslyDataSyncProvider.kt").x("Data sync requested for callCreationTimeMillis: %s", j);
                defpackage.jhu jhuVar2 = this.c;
                if (jhuVar2.c.b()) {
                    kgl kglVar = jhuVar2.f;
                    defpackage.ity ityVar = new defpackage.ity(j);
                    this.a = 1;
                    obj = kglVar.p(ityVar, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    itcVar = (defpackage.itc) obj;
                    if (itcVar != null) {
                        str = itcVar.f;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        return aisk.b(new java.io.FileInputStream(new java.io.File(str)));
                    }
                    defpackage.jhu.a.b().l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 55, "BeeslyDataSyncProvider.kt").v("Audio file not found for Beesly call.");
                    return null;
                }
                defpackage.jhu jhuVar3 = this.c;
                this.a = 2;
                obj = jhuVar3.g.aP(j, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                str2 = (java.lang.String) obj;
                if (str2 == null) {
                    defpackage.jhu.a.d().l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 69, "BeeslyDataSyncProvider.kt").v("Audio file not found for Beesly call.");
                    return null;
                }
                defpackage.jhu.a.b().l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 73, "BeeslyDataSyncProvider.kt").v("Audio recording file found; Starting audio compression.");
                jhuVar = this.c;
                if (((java.lang.Boolean) jhuVar.b.a()).booleanValue()) {
                    izg izgVar = jhuVar.e;
                    this.a = 3;
                    obj = izgVar.l(str2, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    idvVar = (defpackage.idv) obj;
                } else {
                    defpackage.jhu jhuVar4 = this.c;
                    this.a = 4;
                    obj = jhuVar4.e.l(str2, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    idvVar = (defpackage.idv) obj;
                }
            } else {
                if (i == 1) {
                    aooc.af(obj);
                    itcVar = (defpackage.itc) obj;
                    if (itcVar != null) {
                        str = itcVar.f;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        defpackage.jhu.a.b().l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 55, "BeeslyDataSyncProvider.kt").v("Audio file not found for Beesly call.");
                    } else {
                        try {
                            return aisk.b(new java.io.FileInputStream(new java.io.File(str)));
                        } catch (java.io.IOException unused) {
                            defpackage.jhu.a.d().l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 62, "BeeslyDataSyncProvider.kt").v("can not read audio file content.");
                        }
                    }
                    return null;
                }
                if (i == 2) {
                    aooc.af(obj);
                    str2 = (java.lang.String) obj;
                    if (str2 == null) {
                        defpackage.jhu.a.d().l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 69, "BeeslyDataSyncProvider.kt").v("Audio file not found for Beesly call.");
                        return null;
                    }
                    defpackage.jhu.a.b().l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 73, "BeeslyDataSyncProvider.kt").v("Audio recording file found; Starting audio compression.");
                    jhuVar = this.c;
                    if (((java.lang.Boolean) jhuVar.b.a()).booleanValue()) {
                        izg izgVar2 = jhuVar.e;
                        this.a = 3;
                        obj = izgVar2.l(str2, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        idvVar = (defpackage.idv) obj;
                    } else {
                        defpackage.jhu jhuVar5 = this.c;
                        this.a = 4;
                        obj = jhuVar5.e.l(str2, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        idvVar = (defpackage.idv) obj;
                    }
                } else if (i != 3) {
                    aooc.af(obj);
                    idvVar = (defpackage.idv) obj;
                } else {
                    aooc.af(obj);
                    idvVar = (defpackage.idv) obj;
                }
            }
            java.lang.String str3 = idvVar.c;
            aooh.e(str3, "getAbsolutePath(...)");
            defpackage.jhu.a.b().l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 89, "BeeslyDataSyncProvider.kt").v("Audio compression complete.");
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File(str3));
            try {
                byte[] bArrB = aisk.b(fileInputStream);
                ajsz.ak(fileInputStream, (java.lang.Throwable) null);
                defpackage.jhu.a.b().l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 94, "BeeslyDataSyncProvider.kt").v("Deleting compressed audio file.");
                new java.io.File(str3).delete();
                return bArrB;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (android.media.MediaCodec.CodecException e) {
            defpackage.jhu.a.d().k(e).l("com/android/dialer/beesly/impl/wear/datasync/BeeslyDataSyncProvider", "onDataSyncRequest$<anonymous>", 79, "BeeslyDataSyncProvider.kt").v("Audio compression failed.");
            this.c.d.o(rmx.xk);
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jht(this.b, this.c, aolnVar);
    }
}
