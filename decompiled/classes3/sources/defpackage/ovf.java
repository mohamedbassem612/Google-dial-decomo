package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ovf {
    public final defpackage.zai a;

    public ovf(defpackage.zai zaiVar) {
        this.a = zaiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ovf) {
            return this.a.equals(((defpackage.ovf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "CallerTagModel{tagConfig=" + this.a.toString() + '}';
    }

    public ovf() {
        throw null;
    }
}
