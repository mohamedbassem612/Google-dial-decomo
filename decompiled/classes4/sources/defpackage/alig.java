package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alig {
    public final java.lang.String a;
    public final alif b;

    public alig(java.lang.String str, alif alifVar) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.a = str;
        if (alifVar == null) {
            throw new java.lang.NullPointerException("Null pos");
        }
        this.b = alifVar;
    }

    public final j$.util.Optional a(defpackage.alig aligVar) {
        if (!b(aligVar)) {
            alif alifVar = this.b;
            alif alifVar2 = aligVar.b;
            int i = alifVar2.b;
            int i2 = alifVar.a;
            if (i2 != i + 1) {
                int i3 = alifVar.b;
                int i4 = i3 + 1;
                int i5 = alifVar2.a;
                if (i4 != i5) {
                    return j$.util.Optional.of(new alif(java.lang.Math.min(i, i3) + 1, java.lang.Math.max(i5, i2) - 1, alifVar.c));
                }
            }
        }
        return j$.util.Optional.empty();
    }

    public final boolean b(defpackage.alig aligVar) {
        alif alifVar = aligVar.b;
        int i = alifVar.a;
        alif alifVar2 = this.b;
        int i2 = alifVar2.a;
        if (i2 < i) {
            if (alifVar2.b > i) {
                return true;
            }
        } else if (i2 < alifVar.b) {
            return true;
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alig) {
            defpackage.alig aligVar = (defpackage.alig) obj;
            if (this.a.equals(aligVar.a) && this.b.equals(aligVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "TaggedText{text=" + this.a + ", pos=" + this.b.toString() + '}';
    }

    public alig() {
        throw null;
    }
}
