package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abjr implements abko {
    public final int a;
    private final java.lang.String b;

    public abjr(int i, java.lang.String str) {
        this.a = i;
        this.b = str;
    }

    public final java.lang.String a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abjr) {
            defpackage.abjr abjrVar = (defpackage.abjr) obj;
            if (this.a == abjrVar.a && aooh.n(this.b, abjrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        return (this.a * 31) + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IconMonogram2UiData(icon=");
        int i = this.a;
        if (i == 1) {
            str = "Blocked";
        } else if (i == 2) {
            str = "Group";
        } else if (i == 3) {
            str = "Selected";
        } else if (i != 4) {
            str = i != 5 ? "SpamTranslucent" : "Spam";
        } else {
            str = "Sos";
        }
        sb.append((java.lang.Object) str);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
