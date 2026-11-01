package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class affo implements defpackage.afef {
    public boolean a;
    private final boolean b;
    private final boolean c;

    public affo(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b8 A[Catch: all -> 0x017d, TryCatch #8 {all -> 0x017d, blocks: (B:26:0x0092, B:28:0x0096, B:30:0x009a, B:32:0x009e, B:36:0x00be, B:64:0x0156, B:84:0x017c, B:83:0x0179, B:34:0x00a7, B:35:0x00b8, B:37:0x00c3, B:39:0x00c9, B:43:0x00de, B:45:0x00e3, B:47:0x00ef, B:49:0x00f5, B:59:0x0139, B:63:0x0153, B:74:0x0168, B:73:0x0165, B:52:0x00fd, B:54:0x010c, B:55:0x0111, B:56:0x0120, B:58:0x0135, B:40:0x00d0, B:42:0x00d4, B:75:0x0169, B:76:0x0170, B:69:0x015f, B:60:0x013e, B:62:0x0142, B:79:0x0173), top: B:118:0x0092, inners: #1, #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [affu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [affu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r1v13, types: [affu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [affu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [affu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [affu, java.lang.Object] */
    @Override // defpackage.afef
    public final /* synthetic */ java.lang.Object a(defpackage.ahbz ahbzVar) throws java.io.IOException {
        defpackage.afeu afeuVar;
        java.io.Closeable closeableF;
        java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        defpackage.ahyn ahynVarA;
        ?? B;
        android.net.Uri uriBuild = ((android.net.Uri) ahbzVar.e).buildUpon().path(java.lang.String.valueOf(((android.net.Uri) ahbzVar.c).getPath()).concat(".lock")).fragment("").build();
        java.io.Closeable closeable = null;
        if (this.a) {
            java.util.concurrent.Semaphore semaphoreB = ahbzVar.b.b().b(uriBuild.toString());
            if (true != semaphoreB.tryAcquire()) {
                semaphoreB = null;
            }
            defpackage.afev afevVar = new defpackage.afev(semaphoreB);
            try {
                if (afevVar.a != null) {
                    afeuVar = new defpackage.afeu(afevVar.a(), 0);
                    afevVar.close();
                } else {
                    afevVar.close();
                    afeuVar = null;
                }
            } catch (java.lang.Throwable th) {
                try {
                    afevVar.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            java.util.concurrent.Semaphore semaphoreB2 = ahbzVar.b.b().b(uriBuild.toString());
            try {
                semaphoreB2.acquire();
                defpackage.afev afevVar2 = new defpackage.afev(semaphoreB2);
                try {
                    afeuVar = new defpackage.afeu(afevVar2.a(), 0);
                    afevVar2.close();
                } catch (java.lang.Throwable th3) {
                    try {
                        afevVar2.close();
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (java.lang.InterruptedException e) {
                throw new java.io.InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
            }
        }
        defpackage.afey afeyVar = new defpackage.afey(afeuVar);
        try {
            if (afeyVar.a != null) {
                boolean z = this.b;
                if (z) {
                    boolean z2 = this.c;
                    if (z2) {
                        closeableF = ahbzVar.b.d(uriBuild);
                    } else if (z2) {
                        closeableF = ahbzVar.b.f(uriBuild);
                    } else {
                        closeableF = (java.io.Closeable) ((defpackage.aogc) ahbzVar.a).M(uriBuild, new affm(3));
                    }
                } else {
                    closeableF = ahbzVar.b.f(uriBuild);
                }
                defpackage.afey afeyVar2 = new defpackage.afey(closeableF);
                try {
                    java.io.Closeable closeable2 = afeyVar2.a;
                    if (closeable2 instanceof defpackage.afem) {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((defpackage.afem) closeable2).a();
                    } else {
                        if (!(closeable2 instanceof java.io.RandomAccessFile)) {
                            throw new java.io.IOException("Lock stream not convertible to FileChannel");
                        }
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((java.io.RandomAccessFile) closeable2).getChannel());
                    }
                    java.nio.channels.FileChannel fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                    if (this.a) {
                        ahbzVar.b.b();
                        try {
                            java.nio.channels.FileLock fileLockTryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, z);
                            B = fileLockTryLock != null ? new defpackage.afeu(fileLockTryLock, 1) : 0;
                        } catch (java.io.IOException unused) {
                        }
                    } else {
                        ahbzVar.b.b();
                        defpackage.ahyn ahynVarA2 = defpackage.afew.a(fileChannel, z);
                        if (ahynVarA2.f()) {
                            B = ahynVarA2.b();
                        } else {
                            defpackage.afew.a.longValue();
                            defpackage.afew.b.longValue();
                            affd affdVar = new affd();
                            do {
                                android.os.SystemClock.sleep(affdVar.a().longValue());
                                ahynVarA = defpackage.afew.a(fileChannel, z);
                            } while (!ahynVarA.f());
                            B = ahynVarA.b();
                        }
                    }
                    defpackage.afey afeyVar3 = new defpackage.afey(B);
                    try {
                        if (afeyVar3.a != null) {
                            final java.io.Closeable closeableA = afeyVar.a();
                            final java.io.Closeable closeableA2 = afeyVar2.a();
                            final java.io.Closeable closeableA3 = afeyVar3.a();
                            closeable = new java.io.Closeable() { // from class: affn
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() throws java.io.IOException {
                                    java.io.Closeable closeable3 = closeableA;
                                    java.io.Closeable closeable4 = closeableA2;
                                    java.io.Closeable closeable5 = closeableA3;
                                    if (closeable5 != null) {
                                        try {
                                            try {
                                                closeable5.close();
                                            } catch (java.lang.Throwable th5) {
                                                if (closeable4 != null) {
                                                    try {
                                                        closeable4.close();
                                                    } catch (java.lang.Throwable th6) {
                                                        th5.addSuppressed(th6);
                                                    }
                                                }
                                                throw th5;
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            if (closeable3 != null) {
                                                try {
                                                    closeable3.close();
                                                } catch (java.lang.Throwable th8) {
                                                    th7.addSuppressed(th8);
                                                }
                                            }
                                            throw th7;
                                        }
                                    }
                                    if (closeable4 != null) {
                                        closeable4.close();
                                    }
                                    if (closeable3 != null) {
                                        closeable3.close();
                                    }
                                }
                            };
                        }
                        afeyVar3.close();
                        afeyVar2.close();
                    } catch (java.lang.Throwable th5) {
                        try {
                            afeyVar3.close();
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    try {
                        afeyVar2.close();
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            afeyVar.close();
            return closeable;
        } catch (java.lang.Throwable th9) {
            try {
                afeyVar.close();
                throw th9;
            } catch (java.lang.Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }
}
