package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abma implements defpackage.abmf, defpackage.abmh {
    public final java.lang.String a;
    public final java.util.List b;
    private final boolean c;
    private final abja d;
    private final java.lang.String e;
    private final java.lang.String f;
    private final aomy g;
    private final aomy h;
    private final defpackage.abfr i;

    public abma(java.lang.String str, java.util.List list) {
        aooh.f(str, "title");
        this.a = str;
        this.c = true;
        this.d = null;
        this.e = null;
        this.f = null;
        this.b = list;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abma) {
            defpackage.abma abmaVar = (defpackage.abma) obj;
            if (aooh.n(this.a, abmaVar.a)) {
                boolean z = abmaVar.c;
                abja abjaVar = abmaVar.d;
                java.lang.String str = abmaVar.e;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    java.lang.String str2 = abmaVar.f;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.b, abmaVar.b)) {
                        aomy aomyVar = abmaVar.g;
                        if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                            aomy aomyVar2 = abmaVar.h;
                            if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                                defpackage.abfr abfrVar = abmaVar.i;
                                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + 1231) * 923521) + 1) * 29791;
    }

    public final java.lang.String toString() {
        return "TextItem(title=" + this.a + ", enabled=true, icon=null, trailingText=null, description=null, descriptionAnnotations=" + this.b + ", onClick=null, onDisabledClick=null, footer=null)";
    }
}
