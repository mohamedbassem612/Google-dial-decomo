package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amen {
    public static final defpackage.amen a;
    public final int b;
    public final int c;
    public final defpackage.amel d;
    public final int e;
    public final int f;
    public final int g;

    static {
        defpackage.ameh amehVar = new defpackage.ameh();
        amehVar.d(0);
        amehVar.e(0);
        amehVar.b(Integer.MAX_VALUE);
        amehVar.c(Integer.MAX_VALUE);
        amehVar.f(Integer.MAX_VALUE);
        amehVar.a = new defpackage.amem(0);
        amehVar.a();
        defpackage.ameh amehVar2 = new defpackage.ameh();
        amehVar2.d(10);
        amehVar2.e(20);
        amehVar2.b(7);
        amehVar2.c(15);
        amehVar2.f(11);
        amehVar2.a = new defpackage.amem(0);
        a = amehVar2.a();
    }

    public amen(int i, int i2, defpackage.amel amelVar, int i3, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = amelVar;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amen) {
            defpackage.amen amenVar = (defpackage.amen) obj;
            if (this.b == amenVar.b && this.c == amenVar.c && this.d.equals(amenVar.d) && this.e == amenVar.e && this.f == amenVar.f && this.g == amenVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public final java.lang.String toString() {
        return "TranscriptionEndpointer{minimalCharacters=" + this.b + ", minimalTokens=" + this.c + ", infoEndpointer=" + java.lang.String.valueOf(this.d) + ", commaHintThreshold=" + this.e + ", dotHintThreshold=" + this.f + ", segmentHintThreshold=" + this.g + '}';
    }

    public amen() {
        throw null;
    }
}
