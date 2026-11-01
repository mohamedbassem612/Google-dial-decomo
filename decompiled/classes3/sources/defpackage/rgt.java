package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rgt {
    public final defpackage.rgs a;
    public final defpackage.rgq b;

    public rgt(defpackage.rgs rgsVar, defpackage.rgq rgqVar) {
        this.a = rgsVar;
        this.b = rgqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rgt) {
            defpackage.rgt rgtVar = (defpackage.rgt) obj;
            if (this.a.equals(rgtVar.a) && this.b.equals(rgtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.rgq rgqVar = this.b;
        return "TitleModel{titleText=" + java.lang.String.valueOf(this.a) + ", titleColor=" + java.lang.String.valueOf(rgqVar) + '}';
    }

    public rgt() {
        throw null;
    }
}
