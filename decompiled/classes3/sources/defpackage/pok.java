package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pok {
    public final abja a;
    public final int b = 2132018126;

    public pok(abja abjaVar) {
        this.a = abjaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pok) {
            defpackage.pok pokVar = (defpackage.pok) obj;
            if (this.a == pokVar.a) {
                int i = pokVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 2132018126;
    }

    public final java.lang.String toString() {
        return "MiddleRowIcon(icon=" + this.a + ", contentDescriptionResId=2132018126)";
    }
}
