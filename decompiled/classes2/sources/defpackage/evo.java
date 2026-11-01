package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class evo extends defpackage.evm {
    private final android.content.ContentResolver a;
    private android.net.Uri b;
    private android.content.res.AssetFileDescriptor c;
    private java.io.FileInputStream d;
    private long e;
    private boolean f;

    public evo(android.content.Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override // defpackage.epz
    public final int a(byte[] bArr, int i, int i2) throws defpackage.evn {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) java.lang.Math.min(j, i2);
                } catch (java.io.IOException e) {
                    throw new defpackage.evn(e, 2000);
                }
            }
            java.io.FileInputStream fileInputStream = this.d;
            java.lang.String str = eum.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.e;
                if (j2 != -1) {
                    this.e = j2 - ((long) i3);
                }
                g(i3);
                return i3;
            }
        }
        return -1;
    }

    @Override // defpackage.evr
    public final long b(defpackage.evv evvVar) throws defpackage.evn {
        int i;
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                android.net.Uri uriNormalizeScheme = evvVar.a.normalizeScheme();
                this.b = uriNormalizeScheme;
                j();
                if (j$.util.Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.a.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.a.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.c = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new defpackage.evn(new java.io.IOException(a.bH(uriNormalizeScheme, "Could not open file descriptor for: ")), 2000);
                    } catch (java.io.IOException e) {
                        e = e;
                        throw new defpackage.evn(e, true != (e instanceof java.io.FileNotFoundException) ? i : 2005);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.d = fileInputStream;
                if (length != -1 && evvVar.e > length) {
                    throw new defpackage.evn(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long j = evvVar.e;
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new defpackage.evn(null, 2008);
                }
                if (length == -1) {
                    java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size();
                    if (size == 0) {
                        this.e = -1L;
                    } else {
                        long jPosition = size - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                        this.e = jPosition;
                        if (jPosition < 0) {
                            throw new defpackage.evn(null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.e = j2;
                    if (j2 < 0) {
                        throw new defpackage.evn(null, 2008);
                    }
                }
                long j3 = evvVar.f;
                this.f = true;
                i(evvVar);
                return this.e;
            } catch (defpackage.evn e2) {
                throw e2;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // defpackage.evr
    public final android.net.Uri c() {
        return this.b;
    }

    @Override // defpackage.evr
    public final void d() {
        this.b = null;
        try {
            try {
                try {
                    java.io.FileInputStream fileInputStream = this.d;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.d = null;
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.c = null;
                        if (this.f) {
                            this.f = false;
                            h();
                        }
                    } catch (java.io.IOException e) {
                        throw new defpackage.evn(e, 2000);
                    }
                } catch (java.io.IOException e2) {
                    throw new defpackage.evn(e2, 2000);
                }
            } catch (java.lang.Throwable th) {
                this.d = null;
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        h();
                    }
                    throw th;
                } catch (java.io.IOException e3) {
                    throw new defpackage.evn(e3, 2000);
                }
            }
        } catch (java.lang.Throwable th2) {
            this.c = null;
            if (this.f) {
                this.f = false;
                h();
            }
            throw th2;
        }
    }
}
