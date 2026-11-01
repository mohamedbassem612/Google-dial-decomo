package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aguy {
    public final java.lang.String a;
    public final int b;

    public aguy(java.lang.String str, int i) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null uniquenessKey");
        }
        this.a = str;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aguy) {
            defpackage.aguy aguyVar = (defpackage.aguy) obj;
            if (this.a.equals(aguyVar.a) && this.b == aguyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.b;
        if (i == 1) {
            str = "REPLACE";
        } else if (i != 2) {
            str = i != 3 ? "CANCEL_AND_REENQUEUE" : "UPDATE";
        } else {
            str = "KEEP";
        }
        return "UniqueWorkSpec{uniquenessKey=" + this.a + ", existingWorkPolicy=" + str + '}';
    }

    public aguy() {
        throw null;
    }
}
