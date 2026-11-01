package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aajd {
    public final java.io.File a;
    public final java.io.File b;
    public final java.io.File c;

    public aajd(java.io.File file, java.io.File file2, java.io.File file3) {
        this.a = file;
        this.b = file2;
        this.c = file3;
    }

    public final java.io.File a() {
        java.io.File parentFile = this.a.getParentFile();
        ahvr.bH(parentFile);
        return parentFile;
    }

    public final boolean b() {
        if (this.a.isFile()) {
            return this.b.isDirectory();
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aajd) {
            defpackage.aajd aajdVar = (defpackage.aajd) obj;
            if (this.a.equals(aajdVar.a) && this.b.equals(aajdVar.b) && this.c.equals(aajdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        java.io.File file = this.c;
        java.io.File file2 = this.b;
        return "DiskVmCacheEntry{vmApkFile=" + this.a.toString() + ", optDir=" + file2.toString() + ", touchFile=" + file.toString() + '}';
    }

    public aajd() {
        throw null;
    }
}
