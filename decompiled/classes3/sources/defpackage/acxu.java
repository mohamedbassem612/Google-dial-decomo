package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxu {
    public final java.lang.String a;

    public acxu(java.lang.String str) {
        this.a = str;
    }

    public static defpackage.acxu a(java.lang.String str) {
        int i = airu.a;
        airs airsVarE = airt.a.e();
        airsVarE.j(str);
        return new defpackage.acxu(airsVarE.o().toString());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.acxu) && this.a.equals(((defpackage.acxu) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-722379962);
    }

    public final java.lang.String toString() {
        return this.a;
    }

    public acxu() {
        throw null;
    }
}
