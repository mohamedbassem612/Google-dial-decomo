package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeiy {
    public final defpackage.aehm a;
    public final defpackage.aeit b;
    public final defpackage.aele c;
    public final ahyn d;
    public final defpackage.wsk e;
    private final ahyn f;

    public aeiy(defpackage.wsk wskVar, defpackage.aehm aehmVar, defpackage.aeit aeitVar, defpackage.aele aeleVar, ahyn ahynVar, ahyn ahynVar2) {
        this.e = wskVar;
        this.a = aehmVar;
        this.b = aeitVar;
        this.c = aeleVar;
        this.d = ahynVar;
        this.f = ahynVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeiy) {
            defpackage.aeiy aeiyVar = (defpackage.aeiy) obj;
            if (this.e.equals(aeiyVar.e) && this.a.equals(aeiyVar.a) && this.b.equals(aeiyVar.b) && this.c.equals(aeiyVar.c) && this.d.equals(aeiyVar.d) && this.f.equals(aeiyVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        ahyn ahynVar = this.f;
        ahyn ahynVar2 = this.d;
        defpackage.aele aeleVar = this.c;
        defpackage.aeit aeitVar = this.b;
        defpackage.aehm aehmVar = this.a;
        return "AccountManagementSpec{avatarImageLoader=" + java.lang.String.valueOf(this.e) + ", accountConverter=" + java.lang.String.valueOf(aehmVar) + ", accountsModel=" + java.lang.String.valueOf(aeitVar) + ", accountClass=null, oneGoogleEventLogger=" + java.lang.String.valueOf(aeleVar) + ", deactivatedAccountsFeature=" + java.lang.String.valueOf(ahynVar2) + ", launcherAppDialogTracker=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public aeiy() {
        throw null;
    }
}
