package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adey {
    public final java.lang.String a;
    public final java.lang.String b;

    public adey(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null packageName");
        }
        this.a = str;
        this.b = str2;
    }

    public static defpackage.adey a(android.content.Context context, java.lang.String str) {
        return new defpackage.adey(context.getPackageName(), str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adey) {
            defpackage.adey adeyVar = (defpackage.adey) obj;
            if (this.a.equals(adeyVar.a)) {
                java.lang.String str = this.b;
                if (str == null) {
                    if (adeyVar.b == null) {
                        return true;
                    }
                } else if (str.equals(adeyVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        return (iHashCode * 583896283) ^ (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "ApplicationId{packageName=" + this.a + ", attributionTag=null, moduleName=null, instanceId=" + this.b + '}';
    }

    public adey() {
        throw null;
    }
}
