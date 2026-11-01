package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahin {
    public final int a;
    public final java.lang.String b;
    public final android.content.Intent c;

    public ahin(int i, java.lang.String str, android.content.Intent intent) {
        this.a = i;
        if (str == null) {
            throw new java.lang.NullPointerException("Null title");
        }
        this.b = str;
        this.c = intent;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahin) {
            defpackage.ahin ahinVar = (defpackage.ahin) obj;
            if (this.a == ahinVar.a && this.b.equals(ahinVar.b) && this.c.equals(ahinVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "OverflowMenuItem{id=" + this.a + ", title=" + this.b + ", intent=" + this.c.toString() + '}';
    }

    public ahin() {
        throw null;
    }
}
