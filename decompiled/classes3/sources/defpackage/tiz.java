package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tiz {
    public final defpackage.tiy a;
    public final defpackage.tjh b;
    public final defpackage.tjj c;

    public tiz(defpackage.tiy tiyVar, defpackage.tjh tjhVar, defpackage.tjj tjjVar) {
        this.a = tiyVar;
        this.b = tjhVar;
        this.c = tjjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.tjh tjhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tiz) {
            defpackage.tiz tizVar = (defpackage.tiz) obj;
            if (this.a.equals(tizVar.a) && ((tjhVar = this.b) != null ? tjhVar.equals(tizVar.b) : tizVar.b == null) && this.c.equals(tizVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        defpackage.tjh tjhVar = this.b;
        return (((iHashCode * 1000003) ^ (tjhVar == null ? 0 : tjhVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.tjj tjjVar = this.c;
        defpackage.tjh tjhVar = this.b;
        return "PhoneNumberAction{actionType=" + java.lang.String.valueOf(this.a) + ", phoneNumberAction=" + java.lang.String.valueOf(tjhVar) + ", buttonMetadata=" + java.lang.String.valueOf(tjjVar) + '}';
    }

    public tiz() {
        throw null;
    }
}
