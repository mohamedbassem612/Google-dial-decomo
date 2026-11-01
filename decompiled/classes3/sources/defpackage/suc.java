package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class suc {
    public final j$.util.Optional a;
    public final j$.util.Optional b;
    public final aihd c;
    public final j$.util.Optional d;

    public suc(j$.util.Optional optional, j$.util.Optional optional2, aihd aihdVar, j$.util.Optional optional3) {
        this.a = optional;
        this.b = optional2;
        this.c = aihdVar;
        this.d = optional3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.suc) {
            defpackage.suc sucVar = (defpackage.suc) obj;
            if (this.a.equals(sucVar.a) && this.b.equals(sucVar.b) && this.c.equals(sucVar.c) && this.d.equals(sucVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.d;
        aihd aihdVar = this.c;
        j$.util.Optional optional2 = this.b;
        return "SelectAccountResult{selectedPhoneAccountHandle=" + java.lang.String.valueOf(this.a) + ", dialogOptionsBuilder=" + java.lang.String.valueOf(optional2) + ", dataIds=" + java.lang.String.valueOf(aihdVar) + ", suggestion=" + java.lang.String.valueOf(optional) + '}';
    }

    public suc() {
        throw null;
    }
}
