package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aezn {
    public final defpackage.akzc a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final java.util.List g;
    private final java.util.List h;
    private final java.util.List i;
    private final boolean j;
    private final defpackage.aexu k;

    public aezn(boolean z, java.util.List list, defpackage.akzc akzcVar, java.lang.String str, java.lang.String str2, java.util.List list2, java.util.List list3, boolean z2, boolean z3, boolean z4, defpackage.aexu aexuVar) {
        if (list == null) {
            defpackage.aooh.i("enabledBackings");
        }
        if (akzcVar == null) {
            defpackage.aooh.i("secret");
        }
        if (str == null) {
            defpackage.aooh.i("dirPath");
        }
        if (str2 == null) {
            defpackage.aooh.i("gmsCoreDirPath");
        }
        if (list2 == null) {
            defpackage.aooh.i("includeStaticConfigPackages");
        }
        if (list3 == null) {
            defpackage.aooh.i("excludeStaticConfigPackages");
        }
        if (aexuVar == null) {
            defpackage.aooh.i("clientFlags");
        }
        this.f = z;
        this.g = list;
        this.a = akzcVar;
        this.b = str;
        this.c = str2;
        this.h = list2;
        this.i = list3;
        this.j = z2;
        this.d = z3;
        this.e = z4;
        this.k = aexuVar;
    }

    public final int a(defpackage.ajsw ajswVar, java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("staticPackageName");
        }
        if (!this.j) {
            return 14;
        }
        if (!this.f || !this.g.contains(ajswVar)) {
            return 3;
        }
        if (this.a.C()) {
            return 4;
        }
        java.util.List list = this.h;
        if (list.isEmpty() || list.contains(str)) {
            return this.i.contains(str) ? 6 : 0;
        }
        return 5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aezn) {
            defpackage.aezn aeznVar = (defpackage.aezn) obj;
            if (this.f == aeznVar.f && defpackage.aooh.n(this.g, aeznVar.g) && defpackage.aooh.n(this.a, aeznVar.a) && defpackage.aooh.n(this.b, aeznVar.b) && defpackage.aooh.n(this.c, aeznVar.c) && defpackage.aooh.n(this.h, aeznVar.h) && defpackage.aooh.n(this.i, aeznVar.i) && this.j == aeznVar.j && this.d == aeznVar.d && this.e == aeznVar.e && defpackage.aooh.n(this.k, aeznVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.f), this.g, this.a, this.b, this.c, this.h, this.i, java.lang.Boolean.valueOf(this.j), java.lang.Boolean.valueOf(this.d), java.lang.Boolean.valueOf(this.e)});
    }

    public final java.lang.String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.f + ", enabledBackings=" + this.g + ", secret=" + this.a + ", dirPath=" + this.b + ", gmsCoreDirPath=" + this.c + ", includeStaticConfigPackages=" + this.h + ", excludeStaticConfigPackages=" + this.i + ", hasStorageInfoFromGms=" + this.j + ", allowEmptySnapshotToken=" + this.d + ", enableCommitV2Api=" + this.e + ", clientFlags=" + this.k + ')';
    }
}
