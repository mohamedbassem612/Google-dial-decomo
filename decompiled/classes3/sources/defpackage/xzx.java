package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xzx implements defpackage.xvb {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public xzx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return this.$cid != 0 ? java.nio.ByteBuffer.class : this.a.getClass();
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        int i = this.$cid;
        return defpackage.xuc.a;
    }

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.RandomAccessFile randomAccessFile;
        if (this.$cid == 0) {
            xvaVar.c(this.a);
            return;
        }
        try {
            java.lang.Object obj = this.a;
            int i = defpackage.yfp.a;
            java.nio.channels.FileChannel fileChannel = null;
            try {
                long length = ((java.io.File) obj).length();
                if (length > 2147483647L) {
                    throw new java.io.IOException("File too large to map into memory");
                }
                if (length == 0) {
                    throw new java.io.IOException("File unsuitable for memory mapping");
                }
                randomAccessFile = new java.io.RandomAccessFile((java.io.File) obj, "r");
                try {
                    java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                    try {
                        java.nio.MappedByteBuffer mappedByteBufferLoad = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                            } catch (java.io.IOException unused) {
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (java.io.IOException unused2) {
                        }
                        xvaVar.c(mappedByteBufferLoad);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (java.io.IOException unused3) {
                            }
                        }
                        if (randomAccessFile == null) {
                            throw th;
                        }
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (java.io.IOException unused4) {
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                randomAccessFile = null;
            }
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("ByteBufferFileLoader", 3)) {
                android.util.Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
            }
            xvaVar.f(e);
        }
    }

    @Override // defpackage.xvb
    public final void d() {
    }

    @Override // defpackage.xvb
    public final void e() {
    }
}
