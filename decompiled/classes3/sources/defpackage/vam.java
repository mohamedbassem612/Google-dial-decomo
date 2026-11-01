package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vam {
    public final dvj a;
    public final aaj b;

    public vam(aaj aajVar, dvj dvjVar) {
        this.b = aajVar;
        this.a = dvjVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vam) {
            defpackage.vam vamVar = (defpackage.vam) obj;
            if (this.b.equals(vamVar.b) && this.a.equals(vamVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final java.lang.String toString() {
        dvj dvjVar = this.a;
        return "DecoratingContent{shortcutInfo=" + java.lang.String.valueOf(this.b) + ", messagingStyle=" + java.lang.String.valueOf(dvjVar) + '}';
    }

    public vam() {
        throw null;
    }
}
