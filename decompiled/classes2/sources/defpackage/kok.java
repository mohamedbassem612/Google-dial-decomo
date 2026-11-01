package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kok {
    public final aify a;
    public final int b;
    public final int c;
    public final int d;

    public kok(aify aifyVar) {
        this.b = 1;
        this.c = 1;
        this.d = 1;
        this.a = aifyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kok) {
            defpackage.kok kokVar = (defpackage.kok) obj;
            int i = this.b;
            int i2 = kokVar.b;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1) {
                int i3 = this.c;
                int i4 = kokVar.c;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 == 1) {
                    int i5 = this.d;
                    int i6 = kokVar.d;
                    if (i5 == 0) {
                        throw null;
                    }
                    if (i6 == 1 && ahvr.aP(this.a, kokVar.a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        anty.aJ(this.b);
        anty.aJ(this.c);
        anty.aJ(this.d);
        return this.a.hashCode() ^ 219488700;
    }

    public final java.lang.String toString() {
        return "CallFeaturesInfo{hdCallFeatureType=" + (this.b != 1 ? "null" : "NONE") + ", wifiCallFeatureType=" + (this.c != 1 ? "null" : "NONE") + ", lteCallFeatureType=" + (this.d == 1 ? "NONE" : "null") + ", callFeaturesList=" + java.lang.String.valueOf(this.a) + '}';
    }

    public kok() {
        throw null;
    }
}
