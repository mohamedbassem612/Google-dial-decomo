package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mkv {
    public final android.graphics.drawable.Drawable a;
    public final java.lang.String b;

    public mkv(android.graphics.drawable.Drawable drawable, java.lang.String str) {
        this.a = drawable;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.mkv) {
            defpackage.mkv mkvVar = (defpackage.mkv) obj;
            if (this.a.equals(mkvVar.a) && this.b.equals(mkvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ButtonDefaultAttribute{icon=" + java.lang.String.valueOf(this.a) + ", contentDescription=" + this.b + '}';
    }

    public mkv() {
        throw null;
    }
}
