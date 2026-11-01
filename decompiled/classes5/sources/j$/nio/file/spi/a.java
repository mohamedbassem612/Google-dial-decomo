package j$.nio.file.spi;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class a extends j$.nio.file.spi.c {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ java.nio.file.spi.FileSystemProvider b;

    public /* synthetic */ a(java.nio.file.spi.FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void A(j$.nio.file.Path path, java.lang.String str, java.lang.Object obj, j$.nio.file.LinkOption[] linkOptionArr) throws java.io.IOException {
        this.b.setAttribute(j$.nio.file.x.h(path), str, j$.nio.file.a.k(obj), j$.nio.file.f0.k(linkOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void a(j$.nio.file.Path path, j$.nio.file.b[] bVarArr) throws java.io.IOException {
        java.nio.file.AccessMode accessMode;
        java.nio.file.spi.FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = j$.nio.file.x.h(path);
        java.nio.file.AccessMode[] accessModeArr = null;
        if (bVarArr != null) {
            int length = bVarArr.length;
            java.nio.file.AccessMode[] accessModeArr2 = new java.nio.file.AccessMode[length];
            for (int i = 0; i < length; i++) {
                j$.nio.file.b bVar = bVarArr[i];
                if (bVar == null) {
                    accessMode = null;
                } else if (bVar == j$.nio.file.b.READ) {
                    accessMode = java.nio.file.AccessMode.READ;
                } else {
                    accessMode = bVar == j$.nio.file.b.WRITE ? java.nio.file.AccessMode.WRITE : java.nio.file.AccessMode.EXECUTE;
                }
                accessModeArr2[i] = accessMode;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathH, accessModeArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void b(j$.nio.file.Path path, j$.nio.file.Path path2, j$.nio.file.CopyOption[] copyOptionArr) throws java.io.IOException {
        this.b.copy(j$.nio.file.x.h(path), j$.nio.file.x.h(path2), j$.com.android.tools.r8.a.K(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void c(j$.nio.file.Path path, j$.nio.file.attribute.FileAttribute[] fileAttributeArr) throws java.io.IOException {
        this.b.createDirectory(j$.nio.file.x.h(path), j$.com.android.tools.r8.a.L(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void d(j$.nio.file.Path path, j$.nio.file.Path path2) throws java.io.IOException {
        this.b.createLink(j$.nio.file.x.h(path), j$.nio.file.x.h(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void e(j$.nio.file.Path path, j$.nio.file.Path path2, j$.nio.file.attribute.FileAttribute[] fileAttributeArr) throws java.io.IOException {
        this.b.createSymbolicLink(j$.nio.file.x.h(path), j$.nio.file.x.h(path2), j$.com.android.tools.r8.a.L(fileAttributeArr));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.spi.FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof j$.nio.file.spi.a) {
            obj = ((j$.nio.file.spi.a) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void f(j$.nio.file.Path path) throws java.io.IOException {
        this.b.delete(j$.nio.file.x.h(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean g(j$.nio.file.Path path) {
        return this.b.deleteIfExists(j$.nio.file.x.h(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.file.attribute.w h(j$.nio.file.Path path, java.lang.Class cls, j$.nio.file.LinkOption[] linkOptionArr) {
        j$.nio.file.attribute.w uVar;
        java.nio.file.attribute.FileAttributeView fileAttributeView = this.b.getFileAttributeView(j$.nio.file.x.h(path), j$.nio.file.a.h(cls), j$.nio.file.f0.k(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof j$.nio.file.attribute.v) {
            return ((j$.nio.file.attribute.v) fileAttributeView).a;
        }
        if (fileAttributeView instanceof java.nio.file.attribute.BasicFileAttributeView) {
            java.nio.file.attribute.BasicFileAttributeView basicFileAttributeView = (java.nio.file.attribute.BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof j$.nio.file.attribute.f) {
                return ((j$.nio.file.attribute.f) basicFileAttributeView).a;
            }
            if (basicFileAttributeView instanceof java.nio.file.attribute.DosFileAttributeView) {
                java.nio.file.attribute.DosFileAttributeView dosFileAttributeView = (java.nio.file.attribute.DosFileAttributeView) basicFileAttributeView;
                if (dosFileAttributeView instanceof j$.nio.file.attribute.k) {
                    return ((j$.nio.file.attribute.k) dosFileAttributeView).a;
                }
                uVar = new j$.nio.file.attribute.j(dosFileAttributeView);
            } else if (basicFileAttributeView instanceof java.nio.file.attribute.PosixFileAttributeView) {
                java.nio.file.attribute.PosixFileAttributeView posixFileAttributeView = (java.nio.file.attribute.PosixFileAttributeView) basicFileAttributeView;
                if (posixFileAttributeView instanceof j$.nio.file.attribute.i0) {
                    return ((j$.nio.file.attribute.i0) posixFileAttributeView).a;
                }
                uVar = new j$.nio.file.attribute.h0(posixFileAttributeView);
            } else {
                uVar = new j$.nio.file.attribute.e(basicFileAttributeView);
            }
        } else if (fileAttributeView instanceof java.nio.file.attribute.FileOwnerAttributeView) {
            java.nio.file.attribute.FileOwnerAttributeView fileOwnerAttributeView = (java.nio.file.attribute.FileOwnerAttributeView) fileAttributeView;
            if (fileOwnerAttributeView instanceof j$.nio.file.attribute.y) {
                return ((j$.nio.file.attribute.y) fileOwnerAttributeView).a;
            }
            if (fileOwnerAttributeView instanceof java.nio.file.attribute.AclFileAttributeView) {
                java.nio.file.attribute.AclFileAttributeView aclFileAttributeView = (java.nio.file.attribute.AclFileAttributeView) fileOwnerAttributeView;
                if (aclFileAttributeView instanceof j$.nio.file.attribute.b) {
                    return ((j$.nio.file.attribute.b) aclFileAttributeView).a;
                }
                uVar = new j$.nio.file.attribute.a(aclFileAttributeView);
            } else if (fileOwnerAttributeView instanceof java.nio.file.attribute.PosixFileAttributeView) {
                java.nio.file.attribute.PosixFileAttributeView posixFileAttributeView2 = (java.nio.file.attribute.PosixFileAttributeView) fileOwnerAttributeView;
                if (posixFileAttributeView2 instanceof j$.nio.file.attribute.i0) {
                    return ((j$.nio.file.attribute.i0) posixFileAttributeView2).a;
                }
                uVar = new j$.nio.file.attribute.h0(posixFileAttributeView2);
            } else {
                uVar = new j$.nio.file.attribute.x(fileOwnerAttributeView);
            }
        } else if (fileAttributeView instanceof java.nio.file.attribute.UserDefinedFileAttributeView) {
            java.nio.file.attribute.UserDefinedFileAttributeView userDefinedFileAttributeView = (java.nio.file.attribute.UserDefinedFileAttributeView) fileAttributeView;
            if (userDefinedFileAttributeView instanceof j$.nio.file.attribute.p0) {
                return ((j$.nio.file.attribute.p0) userDefinedFileAttributeView).a;
            }
            uVar = new j$.nio.file.attribute.o0(userDefinedFileAttributeView);
        } else {
            uVar = new j$.nio.file.attribute.u(fileAttributeView);
        }
        return uVar;
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.file.f0 i(j$.nio.file.Path path) throws java.io.IOException {
        java.nio.file.FileStore fileStore = this.b.getFileStore(j$.nio.file.x.h(path));
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof j$.nio.file.f ? ((j$.nio.file.f) fileStore).a : new j$.nio.file.e(fileStore);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.file.i j(java.net.URI uri) {
        return j$.nio.file.g.F(this.b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.file.Path k(java.net.URI uri) {
        return j$.nio.file.w.h(this.b.getPath(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ java.lang.String l() {
        return this.b.getScheme();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean m(j$.nio.file.Path path) {
        return this.b.isHidden(j$.nio.file.x.h(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean n(j$.nio.file.Path path, j$.nio.file.Path path2) {
        return this.b.isSameFile(j$.nio.file.x.h(path), j$.nio.file.x.h(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void o(j$.nio.file.Path path, j$.nio.file.Path path2, j$.nio.file.CopyOption[] copyOptionArr) throws java.io.IOException {
        this.b.move(j$.nio.file.x.h(path), j$.nio.file.x.h(path2), j$.com.android.tools.r8.a.K(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.channels.c p(j$.nio.file.Path path, java.util.Set set, java.util.concurrent.ExecutorService executorService, j$.nio.file.attribute.FileAttribute[] fileAttributeArr) throws java.io.IOException {
        java.nio.channels.AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.b.newAsynchronousFileChannel(j$.nio.file.x.h(path), j$.nio.file.a.l(set), executorService, j$.com.android.tools.r8.a.L(fileAttributeArr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return asynchronousFileChannelNewAsynchronousFileChannel instanceof j$.nio.channels.b ? ((j$.nio.channels.b) asynchronousFileChannelNewAsynchronousFileChannel).a : new j$.nio.channels.a(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ java.nio.channels.SeekableByteChannel q(j$.nio.file.Path path, java.util.Set set, j$.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        return this.b.newByteChannel(j$.nio.file.x.h(path), j$.nio.file.a.l(set), j$.com.android.tools.r8.a.L(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.c
    public final java.nio.file.DirectoryStream r(j$.nio.file.Path path, java.nio.file.DirectoryStream.Filter filter) {
        return new j$.nio.file.z(this.b.newDirectoryStream(j$.nio.file.x.h(path), new j$.desugar.sun.nio.fs.g((byte) 2, filter)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ java.nio.channels.FileChannel s(j$.nio.file.Path path, java.util.Set set, j$.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        return this.b.newFileChannel(j$.nio.file.x.h(path), j$.nio.file.a.l(set), j$.com.android.tools.r8.a.L(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.file.i t(j$.nio.file.Path path, java.util.Map map) {
        return j$.nio.file.g.F(this.b.newFileSystem(j$.nio.file.x.h(path), (java.util.Map<java.lang.String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.file.i u(java.net.URI uri, java.util.Map map) {
        return j$.nio.file.g.F(this.b.newFileSystem(uri, (java.util.Map<java.lang.String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ java.io.InputStream v(j$.nio.file.Path path, j$.nio.file.OpenOption[] openOptionArr) {
        java.nio.file.OpenOption[] openOptionArr2;
        java.nio.file.spi.FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = j$.nio.file.x.h(path);
        if (openOptionArr == null) {
            openOptionArr2 = null;
        } else {
            int length = openOptionArr.length;
            java.nio.file.OpenOption[] openOptionArr3 = new java.nio.file.OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr3[i] = j$.nio.file.u.a(openOptionArr[i]);
            }
            openOptionArr2 = openOptionArr3;
        }
        return fileSystemProvider.newInputStream(pathH, openOptionArr2);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ java.io.OutputStream w(j$.nio.file.Path path, j$.nio.file.OpenOption[] openOptionArr) {
        java.nio.file.OpenOption[] openOptionArr2;
        java.nio.file.spi.FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = j$.nio.file.x.h(path);
        if (openOptionArr == null) {
            openOptionArr2 = null;
        } else {
            int length = openOptionArr.length;
            java.nio.file.OpenOption[] openOptionArr3 = new java.nio.file.OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr3[i] = j$.nio.file.u.a(openOptionArr[i]);
            }
            openOptionArr2 = openOptionArr3;
        }
        return fileSystemProvider.newOutputStream(pathH, openOptionArr2);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.file.attribute.BasicFileAttributes x(j$.nio.file.Path path, java.lang.Class cls, j$.nio.file.LinkOption[] linkOptionArr) {
        return j$.nio.file.attribute.h.a(this.b.readAttributes(j$.nio.file.x.h(path), j$.nio.file.a.i(cls), j$.nio.file.f0.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ java.util.Map y(j$.nio.file.Path path, java.lang.String str, j$.nio.file.LinkOption[] linkOptionArr) {
        return j$.nio.file.a.j(this.b.readAttributes(j$.nio.file.x.h(path), str, j$.nio.file.f0.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.file.Path z(j$.nio.file.Path path) {
        return j$.nio.file.w.h(this.b.readSymbolicLink(j$.nio.file.x.h(path)));
    }
}
