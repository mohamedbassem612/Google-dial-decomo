package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abuy {
    public final int a;
    private final int b;
    private final int c;

    public abuy(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public final boolean a(defpackage.abux abuxVar) {
        if (abuxVar == null) {
            defpackage.aooh.i("installedPackagesVersions");
        }
        return abuxVar.c && abuxVar.d && abuxVar.a >= ((long) this.b) && abuxVar.b >= ((long) this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abuy) {
            defpackage.abuy abuyVar = (defpackage.abuy) obj;
            if (this.b == abuyVar.b && this.c == abuyVar.c && this.a == abuyVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.a;
    }

    public final java.lang.String toString() {
        return "MinimumVersionCode(contactsVersionCode=" + this.b + ", dialerVersionCode=" + this.c + ", gmsCoreVersionCode=" + this.a + ')';
    }
}
