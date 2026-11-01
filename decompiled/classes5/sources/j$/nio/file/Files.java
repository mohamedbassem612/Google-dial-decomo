package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class Files {
    public static final java.util.Set a = j$.com.android.tools.r8.a.G(new java.lang.Object[]{j$.nio.file.StandardOpenOption.CREATE_NEW, j$.nio.file.StandardOpenOption.WRITE});

    public static j$.nio.file.spi.c a(j$.nio.file.Path path) {
        return path.getFileSystem().v();
    }

    public static j$.nio.file.attribute.BasicFileAttributes b(j$.nio.file.Path path, j$.nio.file.LinkOption... linkOptionArr) {
        return a(path).x(path, j$.nio.file.attribute.BasicFileAttributes.class, linkOptionArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long copy(java.io.InputStream inputStream, j$.nio.file.Path path, j$.nio.file.CopyOption... copyOptionArr) throws java.io.IOException {
        j$.util.Objects.requireNonNull(inputStream);
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            if (copyOption != j$.nio.file.StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption == null) {
                    throw new java.lang.NullPointerException("options contains 'null'");
                }
                throw new java.lang.UnsupportedOperationException(java.lang.String.valueOf(copyOption).concat(" not supported"));
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                deleteIfExists(path);
            } catch (java.lang.SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            java.io.OutputStream outputStreamNewOutputStream = newOutputStream(path, j$.nio.file.StandardOpenOption.CREATE_NEW, j$.nio.file.StandardOpenOption.WRITE);
            try {
                long jTransferTo = inputStream instanceof j$.io.InputStreamRetargetInterface ? ((j$.io.InputStreamRetargetInterface) inputStream).transferTo(outputStreamNewOutputStream) : j$.io.DesugarInputStream.transferTo(inputStream, outputStreamNewOutputStream);
                if (outputStreamNewOutputStream != null) {
                    outputStreamNewOutputStream.close();
                }
                return jTransferTo;
            } catch (java.lang.Throwable th) {
                if (outputStreamNewOutputStream != null) {
                    try {
                        outputStreamNewOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.nio.file.FileAlreadyExistsException e2) {
            if (e != null) {
                throw e;
            }
            throw e2;
        }
    }

    public static j$.nio.file.Path createDirectories(j$.nio.file.Path path, j$.nio.file.attribute.FileAttribute<?>... fileAttributeArr) throws java.nio.file.FileSystemException {
        boolean zIsDirectory;
        boolean zIsDirectory2;
        try {
            try {
                a(path).c(path, fileAttributeArr);
            } catch (java.nio.file.FileAlreadyExistsException e) {
                try {
                    try {
                        zIsDirectory2 = b(path, j$.nio.file.LinkOption.NOFOLLOW_LINKS).isDirectory();
                    } catch (java.io.IOException unused) {
                        zIsDirectory2 = false;
                    }
                    if (!zIsDirectory2) {
                        throw e;
                    }
                } catch (java.nio.file.FileAlreadyExistsException e2) {
                    throw e2;
                }
            }
        } catch (java.io.IOException unused2) {
            try {
                path = path.toAbsolutePath();
                e = null;
            } catch (java.lang.SecurityException e3) {
                e = e3;
            }
            j$.nio.file.Path parent = path.getParent();
            while (parent != null) {
                try {
                    parent.getFileSystem().v().a(parent, new j$.nio.file.b[0]);
                    java.util.Iterator it = parent.v(path).iterator();
                    while (it.hasNext()) {
                        parent = parent.i((j$.nio.file.Path) it.next());
                        try {
                            a(parent).c(parent, fileAttributeArr);
                        } catch (java.nio.file.FileAlreadyExistsException e4) {
                            try {
                                zIsDirectory = b(parent, j$.nio.file.LinkOption.NOFOLLOW_LINKS).isDirectory();
                            } catch (java.io.IOException unused3) {
                                zIsDirectory = false;
                            }
                            if (!zIsDirectory) {
                                throw e4;
                            }
                        }
                    }
                } catch (java.nio.file.NoSuchFileException unused4) {
                    parent = parent.getParent();
                }
            }
            if (e == null) {
                throw new java.nio.file.FileSystemException(path.toString(), null, "Unable to determine if root directory exists");
            }
            throw e;
        }
        return path;
    }

    public static j$.nio.file.Path createFile(j$.nio.file.Path path, j$.nio.file.attribute.FileAttribute<?>... fileAttributeArr) throws java.io.IOException {
        a(path).q(path, a, fileAttributeArr).close();
        return path;
    }

    public static void delete(j$.nio.file.Path path) {
        a(path).f(path);
    }

    public static boolean deleteIfExists(j$.nio.file.Path path) {
        return a(path).g(path);
    }

    public static boolean exists(j$.nio.file.Path path, j$.nio.file.LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            a(path);
        }
        try {
            int length = linkOptionArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                j$.nio.file.LinkOption linkOption = linkOptionArr[i];
                if (linkOption != j$.nio.file.LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new java.lang.AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                a(path).a(path, new j$.nio.file.b[0]);
            } else {
                b(path, j$.nio.file.LinkOption.NOFOLLOW_LINKS);
            }
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static j$.nio.file.attribute.FileTime getLastModifiedTime(j$.nio.file.Path path, j$.nio.file.LinkOption... linkOptionArr) {
        return b(path, linkOptionArr).lastModifiedTime();
    }

    public static boolean isRegularFile(j$.nio.file.Path path, j$.nio.file.LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            a(path);
        }
        try {
            return b(path, linkOptionArr).isRegularFile();
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static j$.nio.file.Path move(j$.nio.file.Path path, j$.nio.file.Path path2, j$.nio.file.CopyOption... copyOptionArr) throws java.io.IOException {
        j$.nio.file.spi.c cVarA = a(path);
        if (a(path2).equals(cVarA)) {
            cVarA.o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i = length + 2;
        j$.nio.file.CopyOption[] copyOptionArr2 = new j$.nio.file.CopyOption[i];
        for (int i2 = 0; i2 < length; i2++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i2];
            if (copyOption == j$.nio.file.StandardCopyOption.ATOMIC_MOVE) {
                throw new java.nio.file.AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i2] = copyOption;
        }
        copyOptionArr2[length] = j$.nio.file.LinkOption.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = j$.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            j$.nio.file.CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == j$.nio.file.StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == j$.nio.file.LinkOption.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != j$.nio.file.StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new java.lang.UnsupportedOperationException(j$.desugar.sun.nio.fs.h.a("'", java.lang.String.valueOf(copyOption2), "' is not a recognized copy option"));
                }
                z3 = true;
            }
        }
        j$.nio.file.attribute.BasicFileAttributes basicFileAttributesX = a(path).x(path, j$.nio.file.attribute.BasicFileAttributes.class, z ? new j$.nio.file.LinkOption[0] : new j$.nio.file.LinkOption[]{j$.nio.file.LinkOption.NOFOLLOW_LINKS});
        if (basicFileAttributesX.isSymbolicLink()) {
            throw new java.io.IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            deleteIfExists(path2);
        } else if (exists(path2, new j$.nio.file.LinkOption[0])) {
            throw new java.nio.file.FileAlreadyExistsException(path2.toString());
        }
        if (basicFileAttributesX.isDirectory()) {
            a(path2).c(path2, new j$.nio.file.attribute.FileAttribute[0]);
        } else {
            java.io.InputStream inputStreamNewInputStream = newInputStream(path, new j$.nio.file.OpenOption[0]);
            try {
                copy(inputStreamNewInputStream, path2, new j$.nio.file.CopyOption[0]);
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
            } catch (java.lang.Throwable th) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((j$.nio.file.attribute.g) a(path2).h(path2, j$.nio.file.attribute.g.class, new j$.nio.file.LinkOption[0])).a(basicFileAttributesX.lastModifiedTime(), basicFileAttributesX.lastAccessTime(), basicFileAttributesX.creationTime());
            } catch (java.lang.Throwable th3) {
                try {
                    delete(path2);
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        delete(path);
        return path2;
    }

    public static java.nio.file.DirectoryStream<j$.nio.file.Path> newDirectoryStream(j$.nio.file.Path path, java.lang.String str) {
        if (str.equals("*")) {
            return a(path).r(path, j$.nio.file.s.a);
        }
        j$.nio.file.i fileSystem = path.getFileSystem();
        return fileSystem.v().r(path, new j$.desugar.sun.nio.fs.g((byte) 1, fileSystem.i("glob:".concat(str))));
    }

    public static java.io.InputStream newInputStream(j$.nio.file.Path path, j$.nio.file.OpenOption... openOptionArr) {
        return a(path).v(path, openOptionArr);
    }

    public static java.io.OutputStream newOutputStream(j$.nio.file.Path path, j$.nio.file.OpenOption... openOptionArr) {
        return a(path).w(path, openOptionArr);
    }

    public static j$.nio.file.Path setLastModifiedTime(j$.nio.file.Path path, j$.nio.file.attribute.FileTime fileTime) {
        ((j$.nio.file.attribute.g) a(path).h(path, j$.nio.file.attribute.g.class, new j$.nio.file.LinkOption[0])).a((j$.nio.file.attribute.FileTime) j$.util.Objects.requireNonNull(fileTime), null, null);
        return path;
    }

    public static j$.nio.file.Path walkFileTree(j$.nio.file.Path path, j$.nio.file.FileVisitor<? super j$.nio.file.Path> fileVisitor) {
        j$.nio.file.FileVisitResult fileVisitResultVisitFile;
        j$.nio.file.p pVar = new j$.nio.file.p(java.util.EnumSet.noneOf(j$.nio.file.q.class));
        try {
            if (pVar.d) {
                throw new java.lang.IllegalStateException("Closed");
            }
            j$.nio.file.n nVarF = pVar.f(path, false);
            do {
                int[] iArr = j$.nio.file.r.a;
                j$.nio.file.o oVar = (j$.nio.file.o) nVarF.b;
                j$.nio.file.attribute.BasicFileAttributes basicFileAttributes = (j$.nio.file.attribute.BasicFileAttributes) nVarF.d;
                java.io.IOException iOException = (java.io.IOException) nVarF.e;
                j$.nio.file.Path path2 = (j$.nio.file.Path) nVarF.c;
                int i = iArr[oVar.ordinal()];
                java.util.ArrayDeque arrayDeque = pVar.c;
                if (i == 1) {
                    fileVisitResultVisitFile = iOException == null ? fileVisitor.visitFile(path2, basicFileAttributes) : fileVisitor.visitFileFailed(path2, iOException);
                } else if (i == 2) {
                    fileVisitResultVisitFile = fileVisitor.preVisitDirectory(path2, basicFileAttributes);
                    if ((fileVisitResultVisitFile == j$.nio.file.FileVisitResult.SKIP_SUBTREE || fileVisitResultVisitFile == j$.nio.file.FileVisitResult.SKIP_SIBLINGS) && !arrayDeque.isEmpty()) {
                        try {
                            ((j$.nio.file.m) arrayDeque.pop()).c.close();
                        } catch (java.io.IOException unused) {
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new java.lang.AssertionError("Should not get here");
                    }
                    fileVisitResultVisitFile = fileVisitor.postVisitDirectory(path2, iOException);
                    if (fileVisitResultVisitFile == j$.nio.file.FileVisitResult.SKIP_SIBLINGS) {
                        fileVisitResultVisitFile = j$.nio.file.FileVisitResult.CONTINUE;
                    }
                }
                if (j$.util.Objects.requireNonNull(fileVisitResultVisitFile) == j$.nio.file.FileVisitResult.CONTINUE) {
                    nVarF = pVar.e();
                } else {
                    if (fileVisitResultVisitFile == j$.nio.file.FileVisitResult.TERMINATE) {
                        break;
                    }
                    if (fileVisitResultVisitFile == j$.nio.file.FileVisitResult.SKIP_SIBLINGS && !arrayDeque.isEmpty()) {
                        ((j$.nio.file.m) arrayDeque.peek()).e = true;
                    }
                    nVarF = pVar.e();
                }
            } while (nVarF != null);
            pVar.close();
            return path;
        } catch (java.lang.Throwable th) {
            try {
                pVar.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
