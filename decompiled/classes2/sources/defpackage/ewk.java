package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ewk extends defpackage.evm {
    private final android.content.Context a;
    private defpackage.evv b;
    private android.content.res.AssetFileDescriptor c;
    private java.io.InputStream d;
    private long e;
    private boolean f;

    public ewk(android.content.Context context) {
        super(false);
        this.a = context.getApplicationContext();
    }

    @java.lang.Deprecated
    public static android.net.Uri buildRawResourceUri(int i) {
        return android.net.Uri.parse(a.bj(i, "rawresource:///"));
    }

    private static int k(java.lang.String str) throws defpackage.ewj {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            throw new defpackage.ewj("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static android.content.res.AssetFileDescriptor l(android.content.Context context, defpackage.evv evvVar) throws defpackage.ewj {
        android.content.res.Resources resourcesForApplication;
        int identifier;
        android.net.Uri uriNormalizeScheme = evvVar.a.normalizeScheme();
        if (android.text.TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            java.util.List<java.lang.String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new defpackage.ewj("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = k(pathSegments.get(0));
        } else {
            if (!android.text.TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new defpackage.ewj("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            java.lang.String path = uriNormalizeScheme.getPath();
            ahvr.ci(path);
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            java.lang.String packageName = android.text.TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new defpackage.ewj("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = k(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(a.bE(path, (byte) 58, packageName), "raw", null);
                if (identifier == 0) {
                    throw new defpackage.ewj("Resource not found.", null, 2005);
                }
            }
        }
        try {
            android.content.res.AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new defpackage.ewj("Resource is compressed: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uriNormalizeScheme))), null, 2000);
        } catch (android.content.res.Resources.NotFoundException e2) {
            throw new defpackage.ewj(null, e2, 2005);
        }
    }

    @Override // defpackage.epz
    public final int a(byte[] bArr, int i, int i2) throws defpackage.ewj {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) java.lang.Math.min(j, i2);
                } catch (java.io.IOException e) {
                    throw new defpackage.ewj(null, e, 2000);
                }
            }
            java.io.InputStream inputStream = this.d;
            java.lang.String str = eum.a;
            int i3 = inputStream.read(bArr, i, i2);
            long j2 = this.e;
            if (i3 != -1) {
                if (j2 != -1) {
                    this.e = j2 - ((long) i3);
                }
                g(i3);
                return i3;
            }
            if (j2 != -1) {
                throw new defpackage.ewj("End of stream reached having not read sufficient data.", new java.io.EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // defpackage.evr
    public final long b(defpackage.evv evvVar) throws defpackage.ewj {
        this.b = evvVar;
        j();
        android.content.res.AssetFileDescriptor assetFileDescriptorL = l(this.a, evvVar);
        this.c = assetFileDescriptorL;
        long length = assetFileDescriptorL.getLength();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.c.getFileDescriptor());
        this.d = fileInputStream;
        if (length != -1) {
            try {
                if (evvVar.e > length) {
                    throw new defpackage.ewj(null, null, 2008);
                }
            } catch (defpackage.ewj e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new defpackage.ewj(null, e2, 2000);
            }
        }
        long startOffset = this.c.getStartOffset();
        long j = evvVar.e;
        long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
        if (jSkip != j) {
            throw new defpackage.ewj(null, null, 2008);
        }
        if (length == -1) {
            java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() == 0) {
                this.e = -1L;
            } else {
                long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size() - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                this.e = size;
                if (size < 0) {
                    throw new defpackage.ewj(null, null, 2008);
                }
            }
        } else {
            long j2 = length - jSkip;
            this.e = j2;
            if (j2 < 0) {
                throw new defpackage.evs(2008);
            }
        }
        long j3 = evvVar.f;
        this.f = true;
        i(evvVar);
        return this.e;
    }

    @Override // defpackage.evr
    public final android.net.Uri c() {
        defpackage.evv evvVar = this.b;
        if (evvVar != null) {
            return evvVar.a;
        }
        return null;
    }

    @Override // defpackage.evr
    public final void d() {
        this.b = null;
        try {
            try {
                try {
                    java.io.InputStream inputStream = this.d;
                    if (inputStream != null) {
                        inputStream.close();
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
                        throw new defpackage.ewj(null, e, 2000);
                    }
                } catch (java.io.IOException e2) {
                    throw new defpackage.ewj(null, e2, 2000);
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
                    throw new defpackage.ewj(null, e3, 2000);
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
