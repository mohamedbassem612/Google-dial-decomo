package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qmy {
    public final defpackage.qmz a;
    public final int b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final defpackage.qmw e;

    public qmy(defpackage.qmz qmzVar, int i, java.lang.String str, java.lang.String str2, defpackage.qmw qmwVar) {
        this.a = qmzVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = qmwVar;
    }

    public static defpackage.qmu a() {
        defpackage.qmu qmuVar = new defpackage.qmu();
        qmuVar.b = defpackage.qmw.a().a();
        return qmuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qmy) {
            defpackage.qmy qmyVar = (defpackage.qmy) obj;
            if (this.a.equals(qmyVar.a) && this.b == qmyVar.b && this.c.equals(qmyVar.c) && this.d.equals(qmyVar.d) && this.e.equals(qmyVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.qmw qmwVar = this.e;
        return "VideoButton{videoButtonKey=" + java.lang.String.valueOf(this.a) + ", icon=" + this.b + ", label=" + this.c + ", description=" + this.d + ", buttonState=" + java.lang.String.valueOf(qmwVar) + '}';
    }

    public qmy() {
        throw null;
    }
}
