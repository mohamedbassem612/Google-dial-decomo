package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahlv {
    public final defpackage.ahmr a;
    public final defpackage.ahla b;
    public final com.google.apps.tiktok.account.AccountId c;

    public ahlv(defpackage.ahmr ahmrVar) {
        this.a = ahmrVar;
        defpackage.ahmq ahmqVar = ahmrVar.c;
        this.b = new defpackage.ahla(ahmqVar == null ? defpackage.ahmq.a : ahmqVar);
        this.c = (ahmrVar.b & 2) != 0 ? com.google.apps.tiktok.account.AccountId.b(ahmrVar.d) : null;
    }

    final boolean a() {
        return this.c != null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ahlv)) {
            return false;
        }
        defpackage.ahlv ahlvVar = (defpackage.ahlv) obj;
        if (!this.b.equals(ahlvVar.b)) {
            return false;
        }
        com.google.apps.tiktok.account.AccountId accountId = this.c;
        if (accountId == null) {
            if (ahlvVar.c != null) {
                return false;
            }
        } else if (!accountId.equals(ahlvVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.c});
    }
}
