package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxm {
    public static final defpackage.acxm a;
    public static final defpackage.acxm b;
    public static final defpackage.acxm c;
    private final boolean d;
    private final aihd e;

    static {
        defpackage.acxk acxkVarA = a();
        acxkVarA.c(java.util.EnumSet.noneOf(defpackage.acxl.class));
        acxkVarA.b(false);
        a = acxkVarA.a();
        defpackage.acxk acxkVarA2 = a();
        acxkVarA2.c(java.util.EnumSet.of(defpackage.acxl.a));
        acxkVarA2.b(true);
        b = acxkVarA2.a();
        defpackage.acxk acxkVarA3 = a();
        acxkVarA3.c(java.util.EnumSet.of(defpackage.acxl.a));
        acxkVarA3.b(false);
        c = acxkVarA3.a();
    }

    public acxm(boolean z, aihd aihdVar) {
        this.d = z;
        this.e = aihdVar;
    }

    public static defpackage.acxk a() {
        defpackage.acxk acxkVar = new defpackage.acxk();
        acxkVar.b(false);
        return acxkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acxm) {
            defpackage.acxm acxmVar = (defpackage.acxm) obj;
            if (this.d == acxmVar.d && this.e.equals(acxmVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "DownloadConstraints{requireUnmeteredNetwork=" + this.d + ", requiredNetworkTypes=" + java.lang.String.valueOf(this.e) + '}';
    }

    public acxm() {
        throw null;
    }
}
