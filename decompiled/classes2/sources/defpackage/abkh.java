package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abkh implements abki {
    public final android.net.Uri a;
    public final boolean b;
    private final aomy c;
    private final defpackage.abjz d;

    public /* synthetic */ abkh(android.net.Uri uri, defpackage.abjz abjzVar, boolean z, int i) {
        abjzVar = (i & 4) != 0 ? defpackage.abjz.a : abjzVar;
        boolean z2 = (i & 8) == 0;
        aooh.f(uri, "uri");
        aooh.f(abjzVar, "shape");
        this.a = uri;
        this.c = null;
        this.d = abjzVar;
        this.b = z2 & z;
    }

    public final defpackage.abjz a() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abkh) {
            defpackage.abkh abkhVar = (defpackage.abkh) obj;
            if (aooh.n(this.a, abkhVar.a)) {
                aomy aomyVar = abkhVar.c;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && this.d == abkhVar.d && this.b == abkhVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 961) + this.d.hashCode()) * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "UriItem(uri=" + this.a + ", onLoadFailed=null, shape=" + this.d + ", skipDiskCache=" + this.b + ')';
    }
}
