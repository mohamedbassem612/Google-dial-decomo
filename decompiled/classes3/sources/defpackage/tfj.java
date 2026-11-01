package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfj {
    public final java.lang.String a;
    public final int b;
    public final java.lang.String c;
    public final long d;
    public final int e;
    public final int f;

    public tfj(java.lang.String str, int i, java.lang.String str2, int i2, int i3, long j) {
        aooh.f(str, "phoneNumber");
        aooh.f(str2, "query");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.e = i2;
        this.f = i3;
        this.d = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tfj) {
            defpackage.tfj tfjVar = (defpackage.tfj) obj;
            if (aooh.n(this.a, tfjVar.a) && this.b == tfjVar.b && aooh.n(this.c, tfjVar.c) && this.e == tfjVar.e && this.f == tfjVar.f && this.d == tfjVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.e) * 31) + this.f) * 31) + anty.M(this.d);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchActionContext(phoneNumber=");
        sb.append(this.a);
        sb.append(", ranking=");
        sb.append(this.b);
        sb.append(", query=");
        sb.append(this.c);
        sb.append(", actionOrigin=");
        int i = this.e;
        if (i == 1) {
            str = "SUGGESTED_SECTION";
        } else if (i == 2) {
            str = "CALL_LOG_SECTION";
        } else if (i != 3) {
            str = i != 4 ? "QUERY_ACTIONS_SECTION" : "WORK_PROFILE_SECTION";
        } else {
            str = "CONTACTS_SECTION";
        }
        sb.append((java.lang.Object) str);
        sb.append(", searchType=");
        sb.append((java.lang.Object) snl.aH(this.f));
        sb.append(", searchStartTimeMs=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
