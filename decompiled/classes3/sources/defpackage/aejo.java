package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aejo {
    public final defpackage.aehm a;
    public final ahyc b;
    public final defpackage.wsk c;

    public aejo(defpackage.aehm aehmVar, defpackage.wsk wskVar, ahyc ahycVar) {
        this.a = aehmVar;
        this.c = wskVar;
        this.b = ahycVar;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.wsk wskVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aejo) {
            defpackage.aejo aejoVar = (defpackage.aejo) obj;
            if (this.a.equals(aejoVar.a) && ((wskVar = this.c) != null ? wskVar.equals(aejoVar.c) : aejoVar.c == null) && this.b.equals(aejoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        defpackage.wsk wskVar = this.c;
        return (((iHashCode * (-721379959)) ^ (wskVar == null ? 0 : wskVar.hashCode())) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        ahyc ahycVar = this.b;
        defpackage.wsk wskVar = this.c;
        return "AccountLayer{accountConverter=" + java.lang.String.valueOf(this.a) + ", avatarRetriever=null, avatarImageLoader=" + java.lang.String.valueOf(wskVar) + ", onAddAccount=" + java.lang.String.valueOf(ahycVar) + '}';
    }

    public aejo() {
        throw null;
    }
}
