package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acln {
    public final java.lang.String a;
    public final int b;

    public acln(int i, java.lang.String str) {
        this.b = i;
        this.a = str;
    }

    public static defpackage.acln a(java.lang.String str) {
        defpackage.ahvr.ci(str);
        return new defpackage.acln(1, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.acln)) {
            return false;
        }
        defpackage.acln aclnVar = (defpackage.acln) obj;
        return aclnVar.b + (-1) == this.b + (-1) && j$.util.Objects.equals(aclnVar.a, this.a);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return (this.b - 1) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
