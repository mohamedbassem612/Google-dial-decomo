package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tco {
    private final java.lang.String a;
    private final java.lang.String b;

    public tco(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null accessibilitySettingsFragmentCompatClassName");
        }
        this.a = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null rttSettingsFragmentCompatClassName");
        }
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tco) {
            defpackage.tco tcoVar = (defpackage.tco) obj;
            if (this.a.equals(tcoVar.a) && this.b.equals(tcoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "FragmentMetadata{accessibilitySettingsFragmentCompatClassName=" + this.a + ", rttSettingsFragmentCompatClassName=" + this.b + '}';
    }

    public tco() {
        throw null;
    }
}
