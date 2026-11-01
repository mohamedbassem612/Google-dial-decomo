package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class x implements java.nio.file.Path {
    public final /* synthetic */ j$.nio.file.Path a;

    public /* synthetic */ x(j$.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ java.nio.file.Path h(j$.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof j$.nio.file.w ? ((j$.nio.file.w) path).a : new j$.nio.file.x(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.nio.file.Path path) {
        return this.a.compareTo(j$.nio.file.a.g(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.nio.file.Path path) {
        return this.a.o(j$.nio.file.w.h(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.Path path = this.a;
        if (obj instanceof j$.nio.file.x) {
            obj = ((j$.nio.file.x) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer<? super java.nio.file.Path> consumer) {
        j$.lang.Iterable$EL.forEach(this.a, consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getFileName() {
        return h(this.a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.FileSystem getFileSystem() {
        return j$.nio.file.h.e(this.a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getName(int i) {
        return h(this.a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getParent() {
        return h(this.a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getRoot() {
        return h(this.a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new j$.nio.file.b0(this.a.iterator());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path normalize() {
        return h(this.a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ java.nio.file.WatchKey register(java.nio.file.WatchService watchService, java.nio.file.WatchEvent.Kind[] kindArr, java.nio.file.WatchEvent.Modifier[] modifierArr) {
        return j$.nio.file.q0.a(this.a.e(j$.nio.file.s0.e(watchService), j$.nio.file.f0.i(kindArr), j$.nio.file.f0.j(modifierArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path relativize(java.nio.file.Path path) {
        return h(this.a.v(j$.nio.file.w.h(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.nio.file.Path path) {
        return h(this.a.i(j$.nio.file.w.h(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.nio.file.Path path) {
        return h(this.a.q(j$.nio.file.w.h(path)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator<java.nio.file.Path> spliterator() {
        return j$.util.y0.a(j$.lang.Iterable$EL.spliterator(this.a));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.nio.file.Path path) {
        return this.a.n(j$.nio.file.w.h(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path subpath(int i, int i2) {
        return h(this.a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toAbsolutePath() {
        return h(this.a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.io.File toFile() {
        return this.a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toRealPath(java.nio.file.LinkOption[] linkOptionArr) {
        return h(this.a.j(j$.nio.file.f0.h(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.lang.String toString() {
        return this.a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.net.URI toUri() {
        return this.a.toUri();
    }

    @Override // java.nio.file.Path
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(java.nio.file.Path path) {
        return this.a.compareTo(j$.nio.file.w.h(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.lang.String str) {
        return this.a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.lang.String str) {
        return this.a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.lang.String str) {
        return h(this.a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.lang.String str) {
        return h(this.a.resolveSibling(str));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ java.nio.file.WatchKey register(java.nio.file.WatchService watchService, java.nio.file.WatchEvent.Kind[] kindArr) {
        return j$.nio.file.q0.a(this.a.f(j$.nio.file.s0.e(watchService), j$.nio.file.f0.i(kindArr)));
    }
}
