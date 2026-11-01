package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class o implements j$.nio.file.Path {
    public static final java.util.regex.Pattern h = java.util.regex.Pattern.compile("/+");
    public final j$.nio.file.i a;
    public final java.lang.String b;
    public final java.util.List c;
    public final boolean d;
    public final java.lang.String e;
    public final java.lang.String f;
    public volatile byte[] g;

    public o(j$.nio.file.i iVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(iVar, str.startsWith("/"), str.isEmpty() ? java.util.Collections.singletonList("") : (java.util.List) j$.util.DesugarArrays.stream(h.split(str)).filter(new j$.desugar.sun.nio.fs.n((byte) 0)).collect(new j$.util.stream.m(new j$.desugar.sun.nio.fs.n((byte) 18), new j$.desugar.sun.nio.fs.n((byte) 19), new j$.desugar.sun.nio.fs.n((byte) 20), new j$.desugar.sun.nio.fs.n((byte) 21), j$.util.stream.Collectors.c)), str2, str3);
    }

    @Override // j$.nio.file.Path, j$.nio.file.x0
    public final j$.nio.file.r0 e(j$.nio.file.u0 u0Var, j$.nio.file.i0[] i0VarArr, j$.nio.file.l0... l0VarArr) {
        throw new java.lang.UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(java.lang.String str) {
        return o(new j$.desugar.sun.nio.fs.o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof j$.desugar.sun.nio.fs.o) && compareTo((j$.desugar.sun.nio.fs.o) obj) == 0;
    }

    @Override // j$.nio.file.Path, j$.nio.file.x0
    public final j$.nio.file.r0 f(j$.nio.file.u0 u0Var, j$.nio.file.i0... i0VarArr) {
        e(u0Var, i0VarArr, new j$.nio.file.l0[0]);
        throw null;
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path getFileName() {
        java.util.List list = this.c;
        if (list.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        return new j$.desugar.sun.nio.fs.o(this.a, (java.lang.String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.i getFileSystem() {
        return this.a;
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path getRoot() {
        if (!this.d) {
            return null;
        }
        java.lang.String str = this.f;
        return new j$.desugar.sun.nio.fs.o(this.a, str, this.e, str);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o getName(int i) {
        if (i >= 0) {
            java.util.List list = this.c;
            if (i < list.size()) {
                return new j$.desugar.sun.nio.fs.o(this.a, (java.lang.String) list.get(i), this.e, this.f);
            }
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Requested name for index (%d) is out of bound in \n%s.", java.lang.Integer.valueOf(i), this));
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new j$.nio.file.v(this);
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path j(j$.nio.file.LinkOption[] linkOptionArr) {
        j$.nio.file.i iVar = this.a;
        iVar.v().a(this, j$.nio.file.b.READ);
        return java.util.Arrays.asList(linkOptionArr).contains(j$.nio.file.LinkOption.NOFOLLOW_LINKS) ? toAbsolutePath() : new j$.desugar.sun.nio.fs.o(iVar, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o getParent() {
        java.util.List list = this.c;
        int size = list.size();
        if (size != 0) {
            boolean z = this.d;
            if (size != 1 || z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (z) {
                    sb.append("/");
                }
                sb.append(j$.com.android.tools.r8.a.D(list.subList(0, size - 1)));
                return new j$.desugar.sun.nio.fs.o(this.a, sb.toString(), this.e, this.f);
            }
        }
        return null;
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o i(j$.nio.file.Path path) {
        if (!(path instanceof j$.desugar.sun.nio.fs.o)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        j$.desugar.sun.nio.fs.o oVar = (j$.desugar.sun.nio.fs.o) path;
        if (oVar.d) {
            return oVar;
        }
        return new j$.desugar.sun.nio.fs.o(this.a, this.b + "/" + java.lang.String.valueOf(path), this.e, this.f);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.nio.file.Path path) {
        return this.b.compareTo(((j$.desugar.sun.nio.fs.o) path).b);
    }

    @Override // j$.nio.file.Path
    public final boolean n(j$.nio.file.Path path) {
        int size;
        j$.util.Objects.requireNonNull(path);
        if (!(path instanceof j$.desugar.sun.nio.fs.o)) {
            return false;
        }
        j$.desugar.sun.nio.fs.o oVar = (j$.desugar.sun.nio.fs.o) path;
        if (this.d != oVar.d || this.c.size() < (size = oVar.c.size())) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!getName(i).equals(oVar.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path normalize() {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        for (java.lang.String str : this.c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        return new j$.desugar.sun.nio.fs.o(this.a, (this.d ? "/" : "").concat(j$.com.android.tools.r8.a.D(arrayDeque)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final boolean o(j$.nio.file.Path path) {
        j$.util.Objects.requireNonNull(path);
        if (!(path instanceof j$.desugar.sun.nio.fs.o)) {
            return false;
        }
        j$.desugar.sun.nio.fs.o oVar = (j$.desugar.sun.nio.fs.o) path;
        if (oVar.d) {
            return equals(path);
        }
        int size = oVar.c.size();
        java.util.List list = this.c;
        if (list.size() < size) {
            return false;
        }
        int size2 = list.size();
        for (int i = size - 1; i >= 0; i--) {
            if (!getName((i - size) + size2).equals(oVar.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o q(j$.nio.file.Path path) {
        if (!(j$.util.Objects.requireNonNull(path) instanceof j$.desugar.sun.nio.fs.o)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        j$.desugar.sun.nio.fs.o parent = getParent();
        return parent == null ? (j$.desugar.sun.nio.fs.o) path : parent.i(path);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o toAbsolutePath() {
        if (this.d) {
            return this;
        }
        java.lang.String str = this.e;
        return new j$.desugar.sun.nio.fs.o(this.a, str, str, this.f).i(this);
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path resolve(java.lang.String str) {
        return i(getFileSystem().f(str, new java.lang.String[0]));
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path resolveSibling(java.lang.String str) {
        return q(new j$.desugar.sun.nio.fs.o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(java.lang.String str) {
        return n(new j$.desugar.sun.nio.fs.o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path subpath(int i, int i2) {
        return new j$.desugar.sun.nio.fs.o(this.a, j$.com.android.tools.r8.a.D(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final java.io.File toFile() {
        return new java.io.File(this.b);
    }

    @Override // j$.nio.file.Path
    public final java.lang.String toString() {
        return this.b;
    }

    @Override // j$.nio.file.Path
    public final java.net.URI toUri() {
        char[] cArr = j$.desugar.sun.nio.fs.p.c;
        j$.desugar.sun.nio.fs.o absolutePath = toAbsolutePath();
        if (absolutePath.g == null) {
            absolutePath.g = absolutePath.b.getBytes(j$.desugar.sun.nio.fs.q.a);
        }
        byte[] bArr = absolutePath.g;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = j$.desugar.sun.nio.fs.p.a;
            long j2 = j$.desugar.sun.nio.fs.p.b;
            if (c >= '@' ? c >= 128 || ((1 << (c - '@')) & j2) == 0 : ((1 << c) & j) == 0) {
                sb.append('%');
                char[] cArr2 = j$.desugar.sun.nio.fs.p.c;
                sb.append(cArr2[(c >> 4) & 15]);
                sb.append(cArr2[c & 15]);
            } else {
                sb.append(c);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new java.net.URI(sb.toString());
        } catch (java.net.URISyntaxException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path v(j$.nio.file.Path path) {
        int i = 0;
        if (!(path instanceof j$.desugar.sun.nio.fs.o)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        j$.desugar.sun.nio.fs.o oVar = (j$.desugar.sun.nio.fs.o) path;
        if (this.d != oVar.d) {
            j$.time.g.b("'other' is different type of Path in absolute property.");
            return null;
        }
        java.util.List list = oVar.c;
        java.util.List list2 = this.c;
        int size = list2.size();
        int size2 = list.size();
        while (i < size && i < size2 && ((java.lang.String) list2.get(i)).equals(list.get(i))) {
            i++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = i; i2 < size; i2++) {
            arrayList.add("..");
        }
        while (i < size2) {
            arrayList.add((java.lang.String) list.get(i));
            i++;
        }
        return new j$.desugar.sun.nio.fs.o(this.a, false, arrayList, this.e, this.f);
    }

    public o(j$.nio.file.i iVar, boolean z, java.util.List list, java.lang.String str, java.lang.String str2) {
        this.a = iVar;
        this.d = z;
        this.c = list;
        this.b = (z ? "/" : "").concat(j$.com.android.tools.r8.a.D(list));
        this.e = str;
        this.f = str2;
    }
}
