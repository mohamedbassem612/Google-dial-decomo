package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aazf extends defpackage.aazc {
    public static final defpackage.aazf a = new defpackage.aazf(null);
    public final defpackage.aazi b;
    public final int c;
    public final int d;
    public final int e;
    private final java.util.Set f;
    private final boolean g;
    private final boolean h;
    private final defpackage.aaze i;
    private final int j;

    public /* synthetic */ aazf(byte[] bArr) {
        defpackage.aoke aokeVar = defpackage.aoke.a;
        defpackage.aazi aaziVar = defpackage.aazg.a;
        defpackage.aaze aazeVar = new defpackage.aaze(null);
        defpackage.aooh.f(aaziVar, "legacyDownloadPolicy");
        this.f = aokeVar;
        this.b = aaziVar;
        this.g = true;
        this.h = true;
        this.c = 1;
        this.d = 1;
        this.e = 1;
        this.j = 1;
        this.i = aazeVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aazf) {
            defpackage.aazf aazfVar = (defpackage.aazf) obj;
            if (defpackage.aooh.n(this.f, aazfVar.f) && defpackage.aooh.n(this.b, aazfVar.b)) {
                boolean z = aazfVar.g;
                boolean z2 = aazfVar.h;
                int i = aazfVar.c;
                int i2 = aazfVar.d;
                int i3 = aazfVar.e;
                int i4 = aazfVar.j;
                if (defpackage.aooh.n(this.i, aazfVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.b.hashCode() * 31) + 1231) * 31) + 1231) * 31) + 1) * 31) + 1) * 31) + 1) * 31) + 1) * 31) + this.i.hashCode();
    }

    public aazf() {
        this(null);
    }
}
