package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajwy {
    public final java.lang.String a;
    public final long b;
    public final int c;

    public ajwy(java.lang.String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static defpackage.ajwx a() {
        defpackage.ajwx ajwxVar = new defpackage.ajwx();
        ajwxVar.b(0L);
        return ajwxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ajwy) {
            defpackage.ajwy ajwyVar = (defpackage.ajwy) obj;
            java.lang.String str = this.a;
            if (str != null ? str.equals(ajwyVar.a) : ajwyVar.a == null) {
                if (this.b == ajwyVar.b) {
                    int i = this.c;
                    if (i == 0) {
                        if (ajwyVar.c == 0) {
                            return true;
                        }
                    } else if (i == ajwyVar.c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = this.c;
        return ((((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ (i != 0 ? i : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.c;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        long j = this.b;
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + j + ", responseCode=" + str + '}';
    }

    public ajwy() {
        throw null;
    }
}
