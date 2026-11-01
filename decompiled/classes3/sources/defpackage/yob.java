package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yob {
    private final java.lang.String a;
    private final java.lang.String b;
    private final aigf c;

    public yob(java.lang.String str, java.lang.String str2, aigf aigfVar) {
        this.a = str;
        this.b = str2;
        this.c = aigfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yob) {
            defpackage.yob yobVar = (defpackage.yob) obj;
            if (this.a.equals(yobVar.a) && ((str = this.b) != null ? str.equals(yobVar.b) : yobVar.b == null) && this.c.equals(yobVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        return (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "FunctionCall{name=" + this.a + ", id=" + this.b + ", args=" + java.lang.String.valueOf(this.c) + '}';
    }

    public yob() {
        throw null;
    }
}
