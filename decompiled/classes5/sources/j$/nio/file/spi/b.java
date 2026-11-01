package j$.nio.file.spi;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class b extends java.nio.file.spi.FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ j$.nio.file.spi.c a;

    public /* synthetic */ b(j$.nio.file.spi.c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(java.nio.file.Path path, java.nio.file.AccessMode[] accessModeArr) {
        j$.nio.file.b[] bVarArr;
        j$.nio.file.spi.c cVar = this.a;
        j$.nio.file.Path pathH = j$.nio.file.w.h(path);
        if (accessModeArr == null) {
            bVarArr = null;
        } else {
            int length = accessModeArr.length;
            j$.nio.file.b[] bVarArr2 = new j$.nio.file.b[length];
            for (int i = 0; i < length; i++) {
                bVarArr2[i] = j$.nio.file.a.a(accessModeArr[i]);
            }
            bVarArr = bVarArr2;
        }
        cVar.a(pathH, bVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        j$.nio.file.spi.c cVar = this.a;
        j$.nio.file.Path pathH = j$.nio.file.w.h(path);
        j$.nio.file.Path pathH2 = j$.nio.file.w.h(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = j$.nio.file.c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.b(pathH, pathH2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(java.nio.file.Path path, java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        this.a.c(j$.nio.file.w.h(path), j$.com.android.tools.r8.a.J(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(java.nio.file.Path path, java.nio.file.Path path2) {
        this.a.d(j$.nio.file.w.h(path), j$.nio.file.w.h(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        this.a.e(j$.nio.file.w.h(path), j$.nio.file.w.h(path2), j$.com.android.tools.r8.a.J(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(java.nio.file.Path path) {
        this.a.f(j$.nio.file.w.h(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(java.nio.file.Path path) {
        return this.a.g(j$.nio.file.w.h(path));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.spi.c cVar = this.a;
        if (obj instanceof j$.nio.file.spi.b) {
            obj = ((j$.nio.file.spi.b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.file.attribute.FileAttributeView getFileAttributeView(java.nio.file.Path path, java.lang.Class cls, java.nio.file.LinkOption[] linkOptionArr) {
        java.nio.file.attribute.FileAttributeView vVar;
        j$.nio.file.attribute.w wVarH = this.a.h(j$.nio.file.w.h(path), j$.nio.file.a.h(cls), j$.nio.file.f0.h(linkOptionArr));
        if (wVarH == null) {
            return null;
        }
        if (wVarH instanceof j$.nio.file.attribute.u) {
            return ((j$.nio.file.attribute.u) wVarH).a;
        }
        if (wVarH instanceof j$.nio.file.attribute.g) {
            j$.nio.file.attribute.g gVar = (j$.nio.file.attribute.g) wVarH;
            if (gVar instanceof j$.nio.file.attribute.e) {
                return ((j$.nio.file.attribute.e) gVar).a;
            }
            if (gVar instanceof j$.nio.file.attribute.l) {
                j$.nio.file.attribute.l lVar = (j$.nio.file.attribute.l) gVar;
                if (lVar instanceof j$.nio.file.attribute.j) {
                    return ((j$.nio.file.attribute.j) lVar).a;
                }
                vVar = new j$.nio.file.attribute.k(lVar);
            } else if (gVar instanceof j$.nio.file.attribute.j0) {
                j$.nio.file.attribute.j0 j0Var = (j$.nio.file.attribute.j0) gVar;
                if (j0Var instanceof j$.nio.file.attribute.h0) {
                    return ((j$.nio.file.attribute.h0) j0Var).a;
                }
                vVar = new j$.nio.file.attribute.i0(j0Var);
            } else {
                vVar = new j$.nio.file.attribute.f(gVar);
            }
        } else if (wVarH instanceof j$.nio.file.attribute.z) {
            j$.nio.file.attribute.z zVar = (j$.nio.file.attribute.z) wVarH;
            if (zVar instanceof j$.nio.file.attribute.x) {
                return ((j$.nio.file.attribute.x) zVar).a;
            }
            if (zVar instanceof j$.nio.file.attribute.c) {
                j$.nio.file.attribute.c cVar = (j$.nio.file.attribute.c) zVar;
                if (cVar instanceof j$.nio.file.attribute.a) {
                    return ((j$.nio.file.attribute.a) cVar).a;
                }
                vVar = new j$.nio.file.attribute.b(cVar);
            } else if (zVar instanceof j$.nio.file.attribute.j0) {
                j$.nio.file.attribute.j0 j0Var2 = (j$.nio.file.attribute.j0) zVar;
                if (j0Var2 instanceof j$.nio.file.attribute.h0) {
                    return ((j$.nio.file.attribute.h0) j0Var2).a;
                }
                vVar = new j$.nio.file.attribute.i0(j0Var2);
            } else {
                vVar = new j$.nio.file.attribute.y(zVar);
            }
        } else if (wVarH instanceof j$.nio.file.attribute.q0) {
            j$.nio.file.attribute.q0 q0Var = (j$.nio.file.attribute.q0) wVarH;
            if (q0Var instanceof j$.nio.file.attribute.o0) {
                return ((j$.nio.file.attribute.o0) q0Var).a;
            }
            vVar = new j$.nio.file.attribute.p0(q0Var);
        } else {
            vVar = new j$.nio.file.attribute.v(wVarH);
        }
        return vVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.file.FileStore getFileStore(java.nio.file.Path path) {
        j$.nio.file.f0 f0VarI = this.a.i(j$.nio.file.w.h(path));
        int i = j$.nio.file.f.b;
        if (f0VarI == null) {
            return null;
        }
        return f0VarI instanceof j$.nio.file.e ? ((j$.nio.file.e) f0VarI).e : new j$.nio.file.f(f0VarI);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.file.FileSystem getFileSystem(java.net.URI uri) {
        return j$.nio.file.h.e(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.file.Path getPath(java.net.URI uri) {
        return j$.nio.file.x.h(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.lang.String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(java.nio.file.Path path) {
        return this.a.m(j$.nio.file.w.h(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(java.nio.file.Path path, java.nio.file.Path path2) {
        return this.a.n(j$.nio.file.w.h(path), j$.nio.file.w.h(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        j$.nio.file.spi.c cVar = this.a;
        j$.nio.file.Path pathH = j$.nio.file.w.h(path);
        j$.nio.file.Path pathH2 = j$.nio.file.w.h(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = j$.nio.file.c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.o(pathH, pathH2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.channels.AsynchronousFileChannel newAsynchronousFileChannel(java.nio.file.Path path, java.util.Set set, java.util.concurrent.ExecutorService executorService, java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        j$.nio.channels.c cVarP = this.a.p(j$.nio.file.w.h(path), j$.nio.file.a.l(set), executorService, j$.com.android.tools.r8.a.J(fileAttributeArr));
        int i = j$.nio.channels.b.b;
        if (cVarP == null) {
            return null;
        }
        return cVarP instanceof j$.nio.channels.a ? ((j$.nio.channels.a) cVarP).a : new j$.nio.channels.b(cVarP);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.channels.SeekableByteChannel newByteChannel(java.nio.file.Path path, java.util.Set set, java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        return this.a.q(j$.nio.file.w.h(path), j$.nio.file.a.l(set), j$.com.android.tools.r8.a.J(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final java.nio.file.DirectoryStream newDirectoryStream(java.nio.file.Path path, java.nio.file.DirectoryStream.Filter filter) {
        return new j$.nio.file.z(this.a.r(j$.nio.file.w.h(path), new j$.desugar.sun.nio.fs.g((byte) 2, filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.channels.FileChannel newFileChannel(java.nio.file.Path path, java.util.Set set, java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        return this.a.s(j$.nio.file.w.h(path), j$.nio.file.a.l(set), j$.com.android.tools.r8.a.J(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.file.FileSystem newFileSystem(java.nio.file.Path path, java.util.Map map) {
        return j$.nio.file.h.e(this.a.t(j$.nio.file.w.h(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.io.InputStream newInputStream(java.nio.file.Path path, java.nio.file.OpenOption[] openOptionArr) {
        j$.nio.file.OpenOption[] openOptionArr2;
        j$.nio.file.spi.c cVar = this.a;
        j$.nio.file.Path pathH = j$.nio.file.w.h(path);
        if (openOptionArr == null) {
            openOptionArr2 = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.OpenOption[] openOptionArr3 = new j$.nio.file.OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr3[i] = j$.nio.file.t.a(openOptionArr[i]);
            }
            openOptionArr2 = openOptionArr3;
        }
        return cVar.v(pathH, openOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.io.OutputStream newOutputStream(java.nio.file.Path path, java.nio.file.OpenOption[] openOptionArr) {
        j$.nio.file.OpenOption[] openOptionArr2;
        j$.nio.file.spi.c cVar = this.a;
        j$.nio.file.Path pathH = j$.nio.file.w.h(path);
        if (openOptionArr == null) {
            openOptionArr2 = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.OpenOption[] openOptionArr3 = new j$.nio.file.OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr3[i] = j$.nio.file.t.a(openOptionArr[i]);
            }
            openOptionArr2 = openOptionArr3;
        }
        return cVar.w(pathH, openOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes(java.nio.file.Path path, java.lang.Class cls, java.nio.file.LinkOption[] linkOptionArr) {
        return j$.nio.file.attribute.i.a(this.a.x(j$.nio.file.w.h(path), j$.nio.file.a.i(cls), j$.nio.file.f0.h(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.file.Path readSymbolicLink(java.nio.file.Path path) {
        return j$.nio.file.x.h(this.a.z(j$.nio.file.w.h(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(java.nio.file.Path path, java.lang.String str, java.lang.Object obj, java.nio.file.LinkOption[] linkOptionArr) {
        this.a.A(j$.nio.file.w.h(path), str, j$.nio.file.a.k(obj), j$.nio.file.f0.h(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.nio.file.FileSystem newFileSystem(java.net.URI uri, java.util.Map map) {
        return j$.nio.file.h.e(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ java.util.Map readAttributes(java.nio.file.Path path, java.lang.String str, java.nio.file.LinkOption[] linkOptionArr) {
        return j$.nio.file.a.j(this.a.y(j$.nio.file.w.h(path), str, j$.nio.file.f0.h(linkOptionArr)));
    }
}
