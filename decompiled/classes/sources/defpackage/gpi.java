package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gpi {
    public static final defpackage.gpi a = new defpackage.gpi("LOCALE", 0);
    public static final defpackage.gpi b = new defpackage.gpi("LEFT_TO_RIGHT", 1);
    public static final defpackage.gpi c = new defpackage.gpi("RIGHT_TO_LEFT", 2);
    public static final defpackage.gpi d = new defpackage.gpi("TOP_TO_BOTTOM", 3);
    public static final defpackage.gpi e = new defpackage.gpi("BOTTOM_TO_TOP", 4);
    private final java.lang.String f;
    private final int g;

    private gpi(java.lang.String str, int i) {
        this.f = str;
        this.g = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.gpi) {
            defpackage.gpi gpiVar = (defpackage.gpi) obj;
            if (defpackage.aooh.n(this.f, gpiVar.f) && this.g == gpiVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() * 31) + this.g;
    }

    public final java.lang.String toString() {
        return this.f;
    }
}
