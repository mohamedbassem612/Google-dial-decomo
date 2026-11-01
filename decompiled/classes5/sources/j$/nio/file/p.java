package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p implements java.io.Closeable {
    public final boolean a;
    public final j$.nio.file.LinkOption[] b;
    public final java.util.ArrayDeque c = new java.util.ArrayDeque();
    public boolean d;

    public p(java.util.EnumSet enumSet) {
        java.util.Iterator it = enumSet.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (j$.nio.file.l.a[((j$.nio.file.q) it.next()).ordinal()] != 1) {
                throw new java.lang.AssertionError("Should not get here");
            }
            z = true;
        }
        this.a = z;
        this.b = z ? new j$.nio.file.LinkOption[0] : new j$.nio.file.LinkOption[]{j$.nio.file.LinkOption.NOFOLLOW_LINKS};
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        while (true) {
            java.util.ArrayDeque arrayDeque = this.c;
            if (arrayDeque.isEmpty()) {
                this.d = true;
                return;
            } else if (!arrayDeque.isEmpty()) {
                try {
                    ((j$.nio.file.m) arrayDeque.pop()).c.close();
                } catch (java.io.IOException unused) {
                }
            }
        }
    }

    public final j$.nio.file.n e() {
        j$.nio.file.Path path;
        java.io.IOException cause;
        java.io.IOException iOException;
        j$.nio.file.n nVarF;
        java.util.ArrayDeque arrayDeque = this.c;
        j$.nio.file.m mVar = (j$.nio.file.m) arrayDeque.peek();
        if (mVar == null) {
            return null;
        }
        do {
            if (mVar.e) {
                path = null;
                cause = null;
            } else {
                java.util.Iterator it = mVar.d;
                try {
                    path = it.hasNext() ? (j$.nio.file.Path) it.next() : null;
                    cause = null;
                } catch (java.nio.file.DirectoryIteratorException e) {
                    cause = e.getCause();
                    path = null;
                }
            }
            if (path == null) {
                try {
                    mVar.c.close();
                } catch (java.io.IOException e2) {
                    if (cause == null) {
                        iOException = e2;
                    } else {
                        cause.addSuppressed(e2);
                    }
                    arrayDeque.pop();
                    return new j$.nio.file.n(j$.nio.file.o.END_DIRECTORY, mVar.a, null, iOException, (byte) 0);
                }
                iOException = cause;
                arrayDeque.pop();
                return new j$.nio.file.n(j$.nio.file.o.END_DIRECTORY, mVar.a, null, iOException, (byte) 0);
            }
            nVarF = f(path, true);
        } while (nVarF == null);
        return nVarF;
    }

    public final j$.nio.file.n f(j$.nio.file.Path path, boolean z) {
        j$.nio.file.n nVar;
        j$.nio.file.attribute.BasicFileAttributes basicFileAttributesB;
        j$.nio.file.Path path2;
        boolean z2 = this.a;
        try {
            try {
                basicFileAttributesB = j$.nio.file.Files.b(path, this.b);
            } catch (java.lang.SecurityException e) {
                if (z) {
                    return null;
                }
                throw e;
            }
        } catch (java.io.IOException e2) {
            if (!z2) {
                try {
                    throw e2;
                } catch (java.io.IOException e3) {
                    e = e3;
                    nVar = new j$.nio.file.n(j$.nio.file.o.ENTRY, path, null, e, (byte) 0);
                    return nVar;
                }
            }
            try {
                basicFileAttributesB = j$.nio.file.Files.b(path, j$.nio.file.LinkOption.NOFOLLOW_LINKS);
            } catch (java.io.IOException e4) {
                e = e4;
                nVar = new j$.nio.file.n(j$.nio.file.o.ENTRY, path, null, e, (byte) 0);
            }
            nVar = new j$.nio.file.n(j$.nio.file.o.ENTRY, path, null, e, (byte) 0);
            return nVar;
        }
        java.util.ArrayDeque arrayDeque = this.c;
        if (arrayDeque.size() >= Integer.MAX_VALUE || !basicFileAttributesB.isDirectory()) {
            nVar = new j$.nio.file.n(j$.nio.file.o.ENTRY, path, basicFileAttributesB, null, (byte) 0);
        } else if (z2) {
            java.lang.Object objFileKey = basicFileAttributesB.fileKey();
            java.util.Iterator it = arrayDeque.iterator();
            while (true) {
                if (it.hasNext()) {
                    j$.nio.file.m mVar = (j$.nio.file.m) it.next();
                    java.lang.Object obj = mVar.b;
                    if (objFileKey == null || obj == null) {
                        try {
                            j$.nio.file.Path path3 = mVar.a;
                            java.util.Set set = j$.nio.file.Files.a;
                            if (path.getFileSystem().v().n(path, path3)) {
                                nVar = new j$.nio.file.n(j$.nio.file.o.ENTRY, path, null, new java.nio.file.FileSystemLoopException(path.toString()), (byte) 0);
                            } else {
                                path = path;
                            }
                        } catch (java.io.IOException | java.lang.SecurityException unused) {
                            continue;
                        }
                    } else if (objFileKey.equals(obj)) {
                        nVar = new j$.nio.file.n(j$.nio.file.o.ENTRY, path, null, new java.nio.file.FileSystemLoopException(path.toString()), (byte) 0);
                    } else {
                        path = path;
                    }
                } else {
                    path2 = path;
                    try {
                        java.util.Set set2 = j$.nio.file.Files.a;
                        arrayDeque.push(new j$.nio.file.m(path2, basicFileAttributesB.fileKey(), path2.getFileSystem().v().r(path2, j$.nio.file.s.a)));
                        nVar = new j$.nio.file.n(j$.nio.file.o.START_DIRECTORY, path2, basicFileAttributesB, null, (byte) 0);
                    } catch (java.io.IOException e5) {
                        nVar = new j$.nio.file.n(j$.nio.file.o.ENTRY, path2, null, e5, (byte) 0);
                    } catch (java.lang.SecurityException e6) {
                        if (z) {
                            return null;
                        }
                        throw e6;
                    }
                }
            }
        } else {
            path2 = path;
            java.util.Set set3 = j$.nio.file.Files.a;
            arrayDeque.push(new j$.nio.file.m(path2, basicFileAttributesB.fileKey(), path2.getFileSystem().v().r(path2, j$.nio.file.s.a)));
            nVar = new j$.nio.file.n(j$.nio.file.o.START_DIRECTORY, path2, basicFileAttributesB, null, (byte) 0);
        }
        return nVar;
    }
}
